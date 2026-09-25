
TECH MAHINDRA 
4 YOE L2
- Java Memory Model?
- Heap vs Stack?
- What are all the memory spaces in JVM?
- Virtual thread vs normal thread, why virtual thread is faster?
- If child class is overriding a method, what all rules it needs to follow apart from same method name and arguments?
- How does CopyOnWriteArrayList work internally?
- How does ConcurrentHashMap work internally?
- Lock vs synchronized?
- ReentrantLock vs ReentrantReadWriteLock, how internally they are different?
- Why should we use finally after acquiring a lock?
- Find second highest salary employee for each department, SQL and Stream both.
- What happens internally when we start a Spring Boot application?
- How does transaction work internally in Spring?
- What is self-invocation in Spring?
- Explain Kafka architecture and important Kafka terms.
- Producer produces a message but broker dies what happens?
- What happens if one Kafka broker goes down?
- What is replication in Kafka and how does it work?
- What happens if consumer dies while processing a message?
- More partitions and less consumers what happens?
- More consumers and less partitions what happens?
- Consumer in same group vs consumer in different group?
- How is Kafka offset managed?
- How to achieve at least once guarantee without duplicate processing?
- What is KStream?
- KStream vs KTable?
- How does CI/CD pipeline work in your project?
- Count subset with sum K.

---
> Duplicate Later
> ---
> 

Interview TechMahindra
1] Suppose you have added @Transactional, but still data is partially saved when an exception happens. How will you debug and fix it?
2] when your Spring Boot application is working fine in normal traffic, but during high traffic the response time becomes very slow. How will you find the root cause?
3] In your project, one microservice is calling another microservice using REST, but sometimes the second service is slow or down. How will you handle timeout, retry, and fallback?
4] If your JWT token is valid, but the user role has changed in the database. How will you make sure old permissions are not misused?
5] Suppose cached data is showing old values even after the database is updated. How will you fix this issue?
6] In your project, database queries are increasing suddenly because of the N+1 query problem. How will you detect and solve it?
7] If one API is throwing LazyInitializationException in production. How will you identify and fix it?
8] In your project, messages are processed from Kafka or RabbitMQ, but the same message is processed twice. How will you handle duplicate processing?
9] Let say if one microservice publishes an event, but the consumer service is down at that time. How will you make sure the event is not lost?
10] Suppose your application secret keys and database passwords should not be kept in application.properties. How will you manage them securely?
11] In your microservices project, authentication is handled by one service, but other services also need to know whether the user is valid or not. How will you design security?
12] Suppose your application is calling three external APIs, and one of them has rate limits. How will you avoid crossing the limit and still keep your application stable?
13] In your project, one API is fetching the same master data again and again from the database. How will you use caching to improve performance?
14] In your project, one API returns thousands of records and the frontend becomes slow. How will you implement pagination and sorting?
15] In your project, you need to send a welcome email after user registration, but email sending should not slow down the registration API. How will you design this?






Happy to share that I've received an offer from Tech Mahindra!
🚀 Tech Mahindra Interview Experience | Java Backend Developer | 5+ Years Experience


I recently completed the interview process with Tech Mahindra for a Java Backend Developer role and wanted to share my experience. Hopefully, this helps professionals preparing for similar opportunities.


📌 Round 1 – Technical Interview
The first round focused on Core Java, Spring Security, Authentication, Spring Boot, Database concepts, and Problem Solving.
☕ Java Core
Difference between BufferedInputStream and BufferedOutputStream
Why is String immutable in Java?
What are Filter Streams?
What are Marker Interfaces? Give a few examples.
What is Serialization, and where have you used it?
🔐 Spring Security & Authentication
How do you store passwords in the database?
Which hashing mechanism do you use for storing passwords?
Difference between Encryption and Hashing
What is RSA, and where is it used?
Authentication vs Authorization
How is CSRF protection implemented?
Role of AuthenticationManager and AuthenticationProvider
Explain JWT and its authentication flow
Difference between OAuth and OAuth 2.0
Explain @PreAuthorize and @PostAuthorize
🗄️ Spring Boot
How would you configure multiple databases in a Spring Boot application?
💻 Coding Question
Find the number of trailing zeroes in the factorial of a given number.
The interviewer asked several follow-up questions based on my answers and project experience.
📌 Round 2 – Technical Interview
The second round was more practical and focused on Java concurrency, real-world implementation, and coding skills.
⚙️ Java Concurrency
What are Virtual Threads?
What problems do they solve?
How do you create and invoke Virtual Threads?
When would you choose Virtual Threads over Platform Threads?
🏗️ Real-World Scenario
Problem Statement:
We need to upload very large files from one server to another. An API already exists for uploading the files. How would you design and implement this solution?
The discussion covered topics like:
Efficient file streaming
Chunk-based uploads
Memory optimization
💻 Coding Question
Solve a problem using the Java Stream API based on a list of students and their marks.
The interviewer was more interested in the thought process, clean implementation, and optimization rather than just the final answer.


