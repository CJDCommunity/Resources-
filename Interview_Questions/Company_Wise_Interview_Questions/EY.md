
🔥 EY Java Developer Interview Experience | 4+ Years of Experience | 20 LPA  
  
Preparing for Java Backend interviews? 🚀 Here are some challenging interview questions covering Core Java, Java 8, Spring Boot, Microservices, Kafka, SQL, and System Design.  
  
🔹 Core Java & Collections  
  
1. What happens when you modify a field used in hashCode() after inserting an object into a HashMap?  
2. How would you choose the right thread-pool size for CPU-bound vs. I/O-bound tasks?  
3. How do virtual threads differ from platform threads?  
4. Why should HashMap keys be immutable?  
5. How would you find the top K frequent elements when the dataset doesn’t fit into memory?  
  
🔹 Java 8+ & Coding  
6. Find the second-highest distinct salary in each department using Java Streams.  
7. How would you process millions of records without exhausting memory?  
8. How would you use records, sealed classes, and pattern matching in modern Java?  
9. How would you implement cursor-based pagination for a database containing 100 million records?  
  
🔹 Spring Boot & Hibernate  
10. What happens when a singleton bean injects a prototype-scoped bean?  
11. How would you troubleshoot a Spring Boot application that starts successfully but fails when a particular endpoint is called?  
12. How would you compare optimistic locking using @Version with pessimistic locking?  
13. How would you design OAuth 2.0/JWT security with token expiry, authorization scopes, and service-to-service authentication?  
  
🔹 Microservices & System Design  
14. How would you identify and prevent a distributed monolith?  
15. A payment succeeds, but inventory reservation fails. How would you implement the Saga pattern?  
16. How would you prevent cascading failures across multiple microservices?  
17. How would you implement distributed tracing and correlation IDs across Spring Boot services?  
18. Design an API capable of handling 50,000 requests per second. Explain the architecture, bottlenecks, and scaling strategy.  
  
🔹 Kafka & Database  
19. Consumer lag keeps increasing even though all Kafka consumers are running. How would you identify the bottleneck?  
20. How would you handle poison messages, retry topics, dead-letter topics, and safe event replay?  
21. How would you design a composite database index for filtering transactions by customer and date while supporting sorting?  
  
🔹 Production Scenarios  
22. How would you handle an OutOfMemoryError in production?  
23. How would you troubleshoot increasing API latency?  
24. How would you design disaster recovery for a multi-region Java microservices platform?




---

EY Interview Experience for BNY_Melon client | Java | Senior Consultant👇

1. Spring Boot Features: What are the main features of Spring Boot that you use in your day-to-day work? 
2. You see high CPU usage but low traffic. What could be the reason?
3. Kafka Consumer Lag: Your Kafka consumer is slower than the producer and the lag keeps increasing. How would you troubleshoot it? 
4. Your application slows down after running for a few hours. What will you check?
5. You are facing frequent GC pauses. How will you optimize it?
6. A HashMap is causing performance issues under heavy load. Why?
7. Multiple threads are updating shared data incorrectly. How will you fix it?
8. Your API works fine locally but fails in production. What will you investigate?
9. You suspect a memory leak. How will you confirm it?
10. A service becomes unresponsive randomly. What could be happening?
11. You see deadlock in your system. How will you detect and resolve it?
12. Your logs show inconsistent behavior across requests. Why?
13. Your application crashes without any clear error. How will you debug it?
14. A database call is slowing down your Java service. How will you optimize it?
15. Your thread pool gets exhausted under load. What's your approach?
16. You need to handle high concurrency safely. What will you use?
17. Your system processes duplicate requests. How will you handle it?
18. A cache is giving stale data. How will you fix it?
19. A thread is stuck in BLOCKED state. How will you identify and fix it?
20. You need to trace a request across multiple layers. How will you do 
21. Your application is not scaling even after adding instances. Why? 



---


https://lnkd.in/p/g8HiPv89

Technical Interview Experience | Java | Spring Boot | Microservices | AWS | Kafka  
  
Sharing the questions from my first technical interview round at EY. These are based on my interview experience and may be useful for others preparing for similar roles.  
  
Java  
1. Difference between HashMap and ConcurrentHashMap.  
2. Explain Java Memory Management and different JVM memory areas.  
3. What is the PC Register?  
4. Explain String Pool vs Heap memory.  
5. What happens when we use new String("hello") if "hello" already exists in the String Pool?  
6. Difference between == and .equals() for String.  
7. Difference between ExecutorService and CompletableFuture.  
8. Does CompletableFuture create its own thread pool? Which pool does it use by default?  
  
System Design / Microservices  
9. Design a fund transfer system capable of handling millions of transactions.  
10. What happens if Account A is debited but Account B’s credit fails?  
11. How would you prevent duplicate transactions if the user clicks multiple times?  
12. How would you ensure transactions for an account are processed in order?  
13. How would Kafka partitions help with ordering?  
14. Which design would you use to avoid duplicate transactions and ensure correct processing?  
15. Explain how the Saga pattern can be used for fund transfer.  
16. Explain the architecture/flow of a Saga-based fund transfer system.  
17. Which database would you choose and why?  
18. How do microservices communicate with each other?  
19. When would you use REST vs Kafka?  
20. How would you handle cascading failures in microservices?  
21. How would you process 1 lakh messages/second in Kafka?  
  
Spring  
22. Explain the flow of Spring MVC from request to response.  
23. What is the N+1 problem in Hibernate/JPA and how would you solve it?  
  
Security  
24. Difference/relationship between OAuth 2.0, JWT and OpenID Connect.  
25. Explain JWT structure and JWT authentication/validation flow.  
  
AWS  
26. Difference between EC2, ECS and Lambda.  
27. How do you monitor applications in AWS?  
28. Have you deployed microservices on AWS? Explain the deployment flow.  
  
Database & Troubleshooting  
29. How would you identify and resolve a database bottleneck?  
30. How would you debug a 401 Unauthorized error?  
31. How would you debug a 404 Not Found error?  
  
Coding Question  
32. Given a list of account transactions such as A:+100, B:+200, A:-50, C:+300, B:-100, A:+150, calculate the final balance for each account.  
  
* Explain the approach/logic.  
* Write the code.  
* What is the time complexity?  
* What is the space complexity?  
* Can you solve it using Java 8 features such as Map.merge()?  
  
Overall, the discussion covered Core Java, JVM, Spring MVC, Microservices, Kafka, System Design, Security, AWS, Database optimization, troubleshooting, and Java coding.

---

Backend Developer position at one of the companies.
The process was quite structured and covered multiple technical areas across different rounds.

Here’s a detailed list of actual interview questions asked during each round

-  1st Round – Technical Discussion
_______________

1. Introduce yourself and explain your project.
2. What is Fetch Type (Lazy vs Eager Loading)?
3. Explain and implement the Factory Design Pattern (with some modifications).
4. What is JWT security, and how have you used it in your project?
5. What do you know about ISO8583?
6. Difference between IOC and Dependency Injection
7. What is Dependency Injection and its types?

-  2nd Round – Coding
_______________

1. 5 MCQs on Spring Boot
2. Modify and improve the given code
3. Find the second highest number in an array
4. Find a file in a subdirectory
-  3rd Round – Advanced Technical
_______________

1. How have you used Spring Security in your project?
2. What is a Spring Boot profile, and how did you use it?
3. What is exception handling, and what is an advisor?
4. How does the @Transactional annotation work?
5. Explain microservices architecture
6. What is Kafka and how have you implemented it?
7. Explain design patterns
8. What are Java 8 features?
9. How did you implement scheduling in your project?
10. How can we create an Optional of an employee object?

---

-  Introduction & Project Discussion
The round started with a discussion about:
-  Brief introduction about myself
-  Current and previous projects
-  Tech stack used
-  Roles and responsibilities
-  Project architecture and implementation

Spring & Microservices
- Some of the questions discussed were:
-  Difference between Spring and Spring Boot
-  How does security work in your project?
-  What is Authentication and Authorization?
-  What is the @SpringBootApplication annotation?
-  How does @EnableAutoConfiguration work internally?
-  What is @Component?
-  How are beans created when we use the @Component annotation?
-  Difference between @Component, @Service, and @Repository
-  Monolithic vs Microservices architecture
-  How does @Transactional work?
-  How do microservices communicate with each other?

Core Java
-  What is the volatile keyword?
-  What is the use of volatile?
-  What are abstraction and polymorphism?
-  Difference between encapsulation and abstraction
-  Difference between Spring, Spring Boot, JPA, and Hibernate

AWS & DevOps
-  How do you deploy a service in a serverless environment?
-  What is EC2, and how do you create an EC2 instance?
-  How do you connect EC2 with S3?
-  What is Load Balancing, and how is it configured?
-  What is Auto Scaling, and how is it configured?
-  How are your applications deployed in AWS?
-  How do you configure a Dockerfile?
-  Have you written Jenkins pipelines?
-  How do you configure SonarQube?

Behavioral Questions
-  What is your strength?
-  What is your weakness?