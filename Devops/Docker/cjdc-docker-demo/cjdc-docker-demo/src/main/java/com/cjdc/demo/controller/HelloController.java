package com.cjdc.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    // 👇 THIS IS THE LINE TO CHANGE LIVE DURING THE DEMO
    private static final String MESSAGE = "Docker Made Simple — Live from the pipeline!";
    private static final String VERSION = "v1.0";

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        String servedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss"));
        return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
              <meta charset="UTF-8" />
              <title>CJDC Docker Demo</title>
              <style>
                body {
                  margin: 0;
                  min-height: 100vh;
                  display: flex;
                  align-items: center;
                  justify-content: center;
                  background: radial-gradient(circle at 20% 20%, #1b2436 0%, #0b0f19 60%);
                  font-family: 'Segoe UI', Arial, sans-serif;
                  color: #ffffff;
                }
                .card {
                  background: #141b2d;
                  border: 1px solid #2a3550;
                  border-radius: 16px;
                  padding: 48px 56px;
                  text-align: center;
                  max-width: 640px;
                  box-shadow: 0 0 60px rgba(36,150,237,0.15);
                }
                .badge {
                  display: inline-block;
                  padding: 6px 14px;
                  border-radius: 999px;
                  background: rgba(139,92,246,0.15);
                  color: #8b5cf6;
                  font-size: 13px;
                  font-weight: 600;
                  letter-spacing: 1px;
                  text-transform: uppercase;
                  margin-bottom: 18px;
                }
                h1 {
                  font-size: 30px;
                  margin: 0 0 12px;
                  background: linear-gradient(90deg, #2496ED, #34D399);
                  -webkit-background-clip: text;
                  -webkit-text-fill-color: transparent;
                }
                p.msg {
                  font-size: 18px;
                  color: #e2e8f0;
                  margin: 0 0 24px;
                }
                .meta {
                  font-size: 13px;
                  color: #94a3b8;
                  border-top: 1px solid #2a3550;
                  padding-top: 18px;
                  line-height: 1.8;
                }
                .whale { font-size: 40px; margin-bottom: 8px; }
              </style>
            </head>
            <body>
              <div class="card">
                <div class="whale">🐳</div>
                <div class="badge">CJDC · Creative Java Developers Community</div>
                <h1>%s</h1>
                <p class="msg">%s</p>
                <div class="meta">
                  Served at: %s<br/>
                  Speaker: Mr. Amit Tiwari · Senior DevOps Engineer @ EngineersMind<br/>
                  Deployed via GitHub Actions → Docker Hub → EC2
                </div>
              </div>
            </body>
            </html>
            """.formatted(VERSION, MESSAGE, servedAt);
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping(value = "/about", produces = MediaType.APPLICATION_JSON_VALUE)
    public String about() {
        return """
            {
              "community": "CJDC - Creative Java Developers Community",
              "tagline": "Grow Together",
              "session": "Docker Made Simple",
              "speaker": "Mr. Amit Tiwari",
              "org": "EngineersMind",
              "version": "%s"
            }
            """.formatted(VERSION);
    }
}
