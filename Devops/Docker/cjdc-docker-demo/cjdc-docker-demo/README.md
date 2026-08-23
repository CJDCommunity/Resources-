# CJDC Docker Training — Live Demo

A minimal Spring Boot app used to demonstrate: local run → Dockerize →
push to Docker Hub → CI/CD pipeline → auto-deploy to EC2 on every
`git push`.

## 1. Run locally (no Docker) — show the "before" state

```bash
mvn spring-boot:run
# visit http://localhost:8080
```

## 2. Dockerize and run locally

```bash
docker build -t cjdc-docker-demo:local .
docker run -p 8080:8080 cjdc-docker-demo:local
```

Talk through the Dockerfile here: multi-stage build, layer caching,
non-root user, JVM container flags, HEALTHCHECK.

Or simply:

```bash
docker-compose up --build
```

## 3. Manual push to Docker Hub (do this once before the session so you
   know your Docker Hub repo exists)

```bash
docker login
docker tag cjdc-docker-demo:local <your-dockerhub-username>/cjdc-docker-demo:latest
docker push <your-dockerhub-username>/cjdc-docker-demo:latest
```

## 4. One-time EC2 setup (do BEFORE the session)

On a fresh Ubuntu EC2 instance (t2.micro is enough):

```bash
sudo apt update
sudo apt install -y docker.io
sudo systemctl enable --now docker
sudo usermod -aG docker $USER
```

Open inbound port **8080** (and 22 for SSH) in the instance's security group.

Generate a dedicated SSH key pair for GitHub Actions (don't reuse your
personal key):

```bash
ssh-keygen -t ed25519 -f cjdc-deploy-key -N ""
```

Add `cjdc-deploy-key.pub` to the EC2 instance's `~/.ssh/authorized_keys`.
Keep `cjdc-deploy-key` (private) for the GitHub secret below.

## 5. GitHub repo secrets (Settings → Secrets and variables → Actions)

| Secret name          | Value                                      |
|-----------------------|---------------------------------------------|
| `DOCKERHUB_USERNAME`  | your Docker Hub username                   |
| `DOCKERHUB_TOKEN`     | Docker Hub access token (not your password) |
| `EC2_HOST`            | EC2 public IP or DNS                        |
| `EC2_USER`            | usually `ubuntu`                            |
| `EC2_SSH_KEY`         | contents of the private key `cjdc-deploy-key` |

## 6. The live demo moment (do this ON STAGE on the 22nd)

1. Show the current running app in the browser (from a previous deploy).
2. Open `HelloController.java`, change the `MESSAGE` string live.
3. `git add . && git commit -m "demo: update message" && git push`
4. Switch to the GitHub Actions tab — watch the pipeline run:
   build → push to Docker Hub → SSH deploy to EC2.
5. Refresh the browser — new message appears. 🎉

## Notes for the session

- Rehearse this fully at least once end-to-end before presenting live —
  first Docker Hub push and first EC2 SSH connection can surface auth
  issues you don't want to debug in front of the community.
- Have the Docker Hub repo page and EC2 terminal open in tabs ahead of time.
- If Wi-Fi/pipeline timing is a risk, record a 2-minute backup video of
  a successful run as a fallback.
