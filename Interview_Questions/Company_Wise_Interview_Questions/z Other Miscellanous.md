Hi everyone, sharing some questions from a recent *Java Backend interview (1.5 YOE)*. Hopefully, these help someone preparing for interviews:

### Core Java & Coding

1. Why Java? Why is Java platform-independent?
2. How do interfaces solve the multiple inheritance problem? Share screen and write code.
3. Implement method overloading and method overriding with code.
4. Sort an array containing 0s, 1s and 2s in a single iteration.
5. Given an Employee class with empId, managerId and salary, find all employees whose salary is greater than their manager's salary.
6. Find the employee with the 3rd highest salary using Java Streams.
7. Which is faster: ArrayList or LinkedList? Explain based on different scenarios.

### Spring / Spring Boot

1. What are the different types of Dependency Injection? Why prefer constructor injection over field injection?
2. Difference between @Component and @Bean.
3. Explain the Spring Bean lifecycle.
4. How do you write unit test cases for the Controller and Repository layers?
5. How do you containerize a Spring Boot application using Docker?

### Spring Transactions & Database

1. What is @Transactional? Where and why do we use it?
2. Explain the internal working of @Transactional in Spring.
3. What happens internally when a transaction starts, commits and rolls back?
4. Explain ACID properties with real-world examples.
5. What is database indexing? How does an index improve query performance?
6. What are the different types of database indexes?
7. What are the different types of SQL joins? Explain INNER, LEFT, RIGHT and FULL OUTER JOIN with examples.
8. How were database migrations handled in your project? Why do we use Flyway and how does it help with deployment?
9. ⁠What is ThreadPool?

### Security & Deployment

1. Authentication vs Authorization — what's the difference?
2. How were deployments done in your project? Explain the CI/CD process at a high level.

Hope this helps anyone preparing for Java/Spring Boot interviews. All the best! 🚀






Java Backend Developer 																									
These 20 questions are being asked RIGHT NOW.																									
1. How does HashMap work internally? Explain buckets, hashing & resizing.																									
2. What is the difference between HashMap and ConcurrentHashMap?																									
3. How does JVM memory structure work? (Heap, Stack, Metaspace)																									
4. What causes OutOfMemoryError in production? How would you debug it?																									
5. How do you make a class thread-safe? Give a real scenario.																									
6. Explain the complete lifecycle of a Spring Bean.																									
7. How does Dependency Injection work internally in Spring?																									
8. What actually happens when you use @Transactional?																									
9. Difference between @Component, @Service and @Repository?																									
10. How would you handle global exception handling in Spring Boot?																									
11. What is lazy vs eager loading in JPA? When can it cause performance issues?																									
12. How do you handle concurrent updates to the same database row?																									
13. Explain ACID properties with a banking transaction example.																									
14. How do you optimize a slow SQL query?																									
15. How would you design pagination & sorting in a REST API?																									
16. How does JWT authentication work step by step?																									
17. If your API is slow under load, how would you identify the bottleneck?																									
18. REST vs Messaging (Kafka), when would you choose which?																									
19. How would you Dockerize a Spring Boot application?																									
20. If two microservices fail during communication, how do you handle fault tolerance?																									
Which version of java have been used in project and features of it?																									
Explain the classloader hierarchy.																									
Describe the internal working of the JVM.																									
Write Java code to serialize and deserialize an object.																									
Implement a thread-safe cache in Java.																									
Can we inherit overridden and overloaded methods?																									
How do parallel streams work? Explain intermediate and terminal operations.																									
What are virtual threads and how it is different from normal thread?																									
Explain sealed classes with a real-time example and their benefits.																									
What design patterns are you familiar with?																									
Explain OOP principles.																									
These 20 questions separate good developers from great ones.																									
21. How does the G1 Garbage Collector work? What are regions, and how does it decide what to collect?																									
22. What is a memory leak in Java? Walk through how you’d detect and fix one in production.																									
23. How does ReentrantLock differ from synchronized? When would you prefer one over the other?																									
24. Explain happens-before in Java Memory Model. Why does it matter in multithreaded code?																									
25. How does Spring’s @Transactional handle rollback internally? What are common pitfalls?																									
26. What is the difference between REQUIRED, REQUIRES_NEW and NESTED propagation in transactions?																									
27. How would you implement distributed locking across microservices?																									
28. How does Hibernate’s first-level vs second-level cache work? When does it hurt you?																									
29. Explain the N+1 problem in JPA. How do you detect and fix it?																									
10	How would you design an idempotent REST API? Why does it matter?																								
30. How does database connection pooling work? How do you tune HikariCP for high throughput?																									
31. What is eventual consistency? How would you handle it in a microservices architecture?																									
32. How do you implement optimistic vs pessimistic locking? When would you use each?																									
33. How would you design a rate limiter for a public API?																									
34. What is the Saga pattern? How does it compare to 2PC for distributed transactions?																									
35. How would you secure inter-service communication in a microservices setup?																									
36. How does Kafka ensure message ordering and exactly-once delivery?																									
37. How would you design a system that processes 1 million requests per day without downtime?																									
38. How do you do zero-downtime deployment for a Spring Boot service running in Kubernetes?																									
39. Your service’s p99 latency spiked from 80ms to 2s overnight. Walk me through your debugging process																									
⚡️Interview Experience - Java Backend Developer - Second Round of Interview																									
* Core Java																									
Difference between Fail-Fast and Fail-Safe?																									
How does ConcurrentHashMap work internally?																									
What is a Daemon Thread?																									
Comparable vs Comparator?																									
SOLID principles with real-time example?																									
Optional: isPresent () vs ifPresent)?																									
How does JVM handle memory management?																									
* Spring Boot & Microservices																									
How do you implement JWT authentication?																									
OAuth2 vs JWT?																									
RestTemplate vs WebClient?																									
How do microservices communicate?																									
What is API Gateway and why is it required?																									
How to implement Global Exception Handling?																									
How does @Transactional work internally?																									
* Kafka & Messaging																									
Why Kafka instead of RabbitMQ?																									
How do partitions work?																									
What happens if a consumer crashes?																									
How do you maintain message ordering?																									
What is idempotency in distributed systems?																									
* Database & JPA																									
First-level vs Second-level cache?																									
What is N+1 problem?																									
How to optimize slow queries?																									
How do you handle concurrent updates?																									
* System Design																									
Design a Payment Processing System How to handle 1M+ transactions daily?																									
Saga Pattern vs 2PC? 																									
How to ensure data consistency across services?																									
How to implement distributed locking?																									
* Production & DevOps																									
How do you deploy microservices using Docker?																									
What is Circuit Breaker?																									
How do you monitor logs?																									
What is Rate Limit?																									
I recently attended an interview for Java Full Stack Developer role where I was asked the following interesting questions:																									
1. How would you implement a salary hike (10%) for employees who joined after 2024 using Java Streams?																									
2. What are Parallel Streams in Java, and when should we use them?																									
3. If we want to divide a large task into smaller chunks and then combine the results, which approach or framework can be used?																									
4. What is the difference between Executor, ExecutorService, and Executors in Java?																									
5. What are the advantages of using CompletableFuture?																									
6. How does HashSet work internally?																									
7. What is an IdentityHashMap, and how is it different from a regular HashMap?																									
8. Can you explain the Liskov Substitution Principle with an example?																									
9. How have you identified and resolved memory leaks in your application?																									
10. If Interface A and Interface B have methods with the same signature, and Class C implements both, how do you handle method overriding?																									
11. What happens if both .yml and .properties configuration files are present in a Spring Boot application?																									
12. Can we use @Autowired for constructor-based dependency injection?																									
13. How have you implemented caching in your project?																									
14. What is the Orchestrator Pattern, and how have you used it in your application?																									
15. How do you access private fields and methods in test cases?																									
16. Can Spring create a bean for an abstract class?																									
17. What are Angular lifecycle hooks?																									
18. How did you handle data binding in your frontend dashboards?																									
19. How did you integrate your backend APIs with the frontend?																									
20. How did you implement RAG (Retrieval-Augmented Generation) using Spring AI?																									
21. What steps did you follow to build a CI/CD pipeline?																									
22. What is the difference between a Docker Image and a Docker Container?																									
23. How did you handle uploading large files in your application?																									
24. What is the difference between Pod, Deployment, ReplicaSet, and Service in Kubernetes?																									
25. How did you optimize your application performance?																									
Recently attended a Java Developer interview and thought of sharing the actual questions that came up.																									
Posting this purely from memory not a prepared list in case it helps someone preparing 😊																									
Some of the things we discussed:																									
26. How @RequestBody works internally in Spring Boot																									
27. End-to-end flow of how an Entity class eventually becomes a table in the database (JPA → Hibernate → SQL)																									
28. Why we use @Service and @Repository, what Spring does differently with them internally																									
29. What happens if both @Service and @Repository are used on the same class																									
30. Thread lifecycle - especially NEW vs RUNNABLE states																									
31. Fail-Fast vs Fail-Safe iterators (with real examples)																									
32. Why ConcurrentHashMap exists and when to use it																									
33. What an API Gateway does in a microservices setup																									
Coding / hands-on questions:																									
34. 2Sum problem (follow-up: 3Sum)																									
35. Filtering employees above a certain salary using Java Streams																									
36. Finding average salary using Streams																									
37. Grouping employees by department (Streams + follow-up in SQL)																									
38. Self join in SQL and real use cases																									
Java basics check:																									
39. Output and execution order of try–catch–finally blocks																									
After this, they deep-dived into Microservices and Kafka, which I’ll probably cover in another post.																									
It was a good learning experience revisiting the fundamentals.																									
Hope this helps anyone preparing for Java + Spring interviews.😊																									
Preparing for interviews? Start revising these today																									
Backend Developer position at one of the companies.																									
The process was quite structured and covered multiple technical areas across different rounds.																									
Here’s a detailed list of actual interview questions asked during each round 👇																									
🔹 1st Round – Technical Discussion																									
_______________																									
1. Introduce yourself and explain your project.																									
2. What is Fetch Type (Lazy vs Eager Loading)?																									
3. Explain and implement the Factory Design Pattern (with some modifications).																									
4. What is JWT security, and how have you used it in your project?																									
5. What do you know about ISO8583?																									
6. Difference between IOC and Dependency Injection																									
7. What is Dependency Injection and its types?																									
🔹 2nd Round – Coding																									
_______________																									
1. 5 MCQs on Spring Boot																									
2. Modify and improve the given code																									
3. Find the second highest number in an array																									
4. Find a file in a subdirectory																									
🔹 3rd Round – Advanced Technical																									
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
Until I faced these questions in an interview, I thought Java interview preparation was mostly about Core Java, Spring Boot, and coding questions.																									
But real-world interviews can go much deeper. 🚀																									
What would you do if:																									
11. Your Java application suddenly throws an OutOfMemoryError?																									
12. CPU usage is high even though traffic is low?																									
13. A thread is stuck in the BLOCKED state?																									
14. The application becomes slow after running for a few hours?																									
15. You are facing frequent GC pauses?																									
16. A HashMap creates performance issues under heavy load?																									
17. Multiple threads update shared data incorrectly?																									
18. An API works locally but fails in production?																									
19. You suspect a memory leak?																									
20. A service becomes randomly unresponsive?																									
21. You detect a deadlock?																									
22. Logs show inconsistent behavior across requests?																									
23. The application crashes without a clear error?																									
24. A database call is slowing down the entire service?																									
25. Your thread pool gets exhausted under heavy load?																									
26. You need to handle high concurrency safely?																									
27. Your system processes duplicate requests?																									
28. Your cache starts returning stale data?																									
29. Your application does not scale even after adding more instances?																									
30. You need to trace a request across multiple layers and services?																									
These are not just theoretical questions.																									
They test how you think as an engineer. Debugging, monitoring, concurrency, JVM internals, database performance, distributed systems, caching, scalability, and production troubleshooting are becoming equally important as writing clean code.																									
As developers, we should prepare beyond:																									
❌ What is HashMap?																									
❌ What is multithreading?																									
❌ What is Spring Boot?																									
And start preparing for:																									
✅ What happens when things fail in production?																									
✅ How will you debug the issue?																									
✅ Which tools, logs, metrics, and thread dumps will you check?																									
✅ How will you identify the root cause and prevent it from happening again?																									
The best developers are not just those who can write code.																									
They are the ones who can understand what happens when the code runs in the real world. 🔥																									
Which of these scenarios have you faced in a real project or interview? Let’s discuss in the comments. 👇	


These 20 questions separate good developers from great ones.																									
31. How does the G1 Garbage Collector work? What are regions, and how does it decide what to collect?																									
32. What is a memory leak in Java? Walk through how you’d detect and fix one in production.																									
33. How does ReentrantLock differ from synchronized? When would you prefer one over the other?																									
34. Explain happens-before in Java Memory Model. Why does it matter in multithreaded code?																									
35. How does Spring’s @Transactional handle rollback internally? What are common pitfalls?																									
36. What is the difference between REQUIRED, REQUIRES_NEW and NESTED propagation in transactions?																									
37. How would you implement distributed locking across microservices?																									
38. How does Hibernate’s first-level vs second-level cache work? When does it hurt you?																									
39. Explain the N+1 problem in JPA. How do you detect and fix it?																									
10	How would you design an idempotent REST API? Why does it matter?																								
40. How does database connection pooling work? How do you tune HikariCP for high throughput?																									
41. What is eventual consistency? How would you handle it in a microservices architecture?																									
42. How do you implement optimistic vs pessimistic locking? When would you use each?																									
43. How would you design a rate limiter for a public API?																									
44. What is the Saga pattern? How does it compare to 2PC for distributed transactions?																									
45. How would you secure inter-service communication in a microservices setup?																									
46. How does Kafka ensure message ordering and exactly-once delivery?																									
47. How would you design a system that processes 1 million requests per day without downtime?																									
48. How do you do zero-downtime deployment for a Spring Boot service running in Kubernetes?																									
49. Your service’s p99 latency spiked from 80ms to 2s overnight. Walk me through your debugging process.*																									
Client Interview Experience | Java Backend Developer 🚀																									
I recently attended a client technical interview for a Java Backend Developer role, and I’d like to share my experience to help others preparing for similar opportunities.																									
The interview covered project discussions, Spring Boot, JPA, Hibernate, transactions, JWT, Java Streams, Microservices, RabbitMQ, and production troubleshooting.																									
Here’s a breakdown of the questions discussed 👇																									
✅ Round 1 – Project & Technical Discussion																									
50. Introduce yourself.																									
51. Tell me about your current project.																									
52. Write a REST API to fetch all employees.																									
53. What are JPA and Hibernate?																									
54. Write @OneToMany and @ManyToOne relationships using Employee and Department.																									
55. What is Fetch Type in JPA?																									
56. What is Cascade in JPA?																									
57. What is a JWT Token?																									
58. How do you implement JWT-based authentication?																									
59. What is @Transactional?																									
60. What is Transaction Propagation, and what are its different types?																									
🔍 Scenario-Based Questions																									
61. Write a custom JPA query using age and salary parameters to fetch employees.																									
62. Within the same transaction, if I update and save a value in the database, can I retrieve the updated value in the very next line?																									
💻 Java Concepts & Coding																									
63. What are Java Streams?																									
64. What is a Functional Interface?																									
65. Find the second maximum value without using Streams.																									
66. Find students whose marks are greater than 80 using Streams.																									
67. Find the maximum marks using sorted() in Streams.																									
68. Find the maximum marks using max() in Streams.																									
🚀 Round 2 – Microservices & Advanced Concepts																									
69. How do Microservices communicate with each other?																									
70. Apart from RestTemplate, what are other ways to communicate between Microservices?																									
71. Explain synchronous vs asynchronous communication.																									
72. How does RabbitMQ work?																									
73. What would you do if you discovered an issue in production? How would you troubleshoot it?																									
74. What is SLF4J, and how do you use it in your application?																									
75. What is a JWT Token?																									
76. Difference between Authentication and Authorization.																									
77. Which HTTP status codes represent Unauthorized and Forbidden?																									
78. Which occurs first in the authentication and authorization flow: Unauthorized or Forbidden?																									