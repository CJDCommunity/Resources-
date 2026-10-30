🏦 JPMorgan System Design Interview: Questions Candidates Commonly Report  
Preparing for a Software Engineer interview at [JPMorganChase](https://www.linkedin.com/company/jpmorganchase/)?  
Based on system-design topics and questions commonly shared by candidates, the discussion can cover a mix of HLD, LLD, Java concurrency, scalability, reliability, and data consistency.  
Here are some questions worth preparing for 👇  
🔹 Low-Level Design (LLD / OOD)  
• Design a parking lot system.  
• Design an ATM / banking system with accounts, transactions, and transfers.  
• Design a stock trading order book with buy/sell matching.  
• Design a rate limiter from scratch.  
• Which design pattern would you use here, and why?  
• When would you choose Strategy over Factory or Observer?  
• How would you apply SOLID principles to your design?  
• How would you make your design extensible for future requirements?  
🔹 High-Level Design (HLD)  
• Design a payment processing system that prevents duplicate charges.  
• Design a ledger / double-entry bookkeeping system.  
• Design a real-time fraud detection pipeline.  
• Design a notification service supporting email, SMS, and push notifications.  
• How would your system handle a downstream service failure?  
• SQL vs NoSQL — which would you choose for a transactional banking system, and why?  
• How would you design reliable message processing with Kafka?  
• How would you handle retries and duplicate events?  
🔥 The key area to prepare  
Don't focus only on drawing boxes and choosing technologies.  
Be ready for follow-up questions such as:  
“What happens if this service goes down?”  
“What happens if the request is retried?”  
“What if two transactions happen simultaneously?”  
“How do you prevent duplicate processing?”  
“How would you recover from partial failure?”  
These questions test how you think about correctness, concurrency, failure handling, scalability, and consistency.  
💬 Have you recently interviewed for a system-design role at JPMorgan Chase or another fintech company?  
Share a question you were asked that isn't on this list. Let's build a community-sourced interview-preparation bank.





---

🚀 JPMorgan Chase | Java Software Engineer Interview Experience  
  
Preparing for a Java Backend Developer role at a product-based company? Here are some important questions shared from a recent JPMorgan Chase interview experience. 👇  
  
The interview covered Core Java, DSA, Spring Boot, Microservices, System Design, and real-world production scenarios.  
  
☕ Round 1 — Core Java, DSA & Problem Solving  
  
🔹 How does HashMap work internally? Explain collisions and resizing.  
🔹 Find the longest substring without repeating characters in O(n) time.  
🔹 Detect a cycle in a linked list without using extra space.  
🔹 What happens when multiple threads modify the same shared object?  
🔹 What happens if you override equals() but not hashCode()?  
  
🌱 Round 2 — Spring Boot & Microservices  
  
🔹 What happens internally when a method annotated with @Transactional is called?  
🔹 Why can @Transactional fail during self-invocation?  
🔹 How would you make a REST API idempotent to prevent duplicate transactions?  
🔹 How would you handle failures in downstream microservices?  
🔹 How would you troubleshoot a slow API in production?  
  
🏗️ Round 3 — System Design & Real-World Scenarios  
  
🔹 Design a highly available payment system that prevents duplicate transactions.  
🔹 How would you maintain data consistency across microservices without distributed transactions?  
🔹 How would you troubleshoot memory leaks and thread pool exhaustion?  
🔹 How would you design a backend system to handle thousands of concurrent requests?  
🔹 When would you choose Kafka over synchronous REST communication, and why?  
  
🤝 Round 4 — HR & Managerial Discussion  
  
🔹 Tell me about a challenging production issue you solved.  
🔹 Why do you want to join JPMorgan Chase?  
🔹 How do you handle disagreements during technical discussions?  
🔹 What are your long-term career goals?  
  
💡 Key Takeaway  
  
For Java developers targeting product-based companies, don’t prepare only definitions or coding problems.  
  
Focus on these five areas:  
  
✅ Core Java internals and multithreading  
✅ DSA and problem-solving  
✅ Spring Boot and transaction management  
✅ Microservices, Kafka, and distributed systems  
✅ System Design and production troubleshooting  
  
The real differentiator is your ability to explain why you chose a solution, what alternatives you considered, and how your approach handles failures at scale.





---

SCREENING ROUND 2 Client - JPMC

Java Fundamentals
- Explain Java multithreading.
- What is the difference between Runnable and Callable? 
- What is the difference between synchronized and ReentrantLock?
- What happens internally when a HashMap resizes? 
- What is the difference between HashMap and ConcurrentHashMap?
- Explain Java memory model.
- Spring Boot / Microservices
- Explain how you design Spring Boot microservices.
- How do services communicate in a microservices architecture?
- What is service discovery?
- How do you implement circuit breakers?
- How do you handle distributed transactions?

Distributed Systems
- Explain event-driven architecture.
- How does Kafka work internally?
- What are Kafka partitions and consumer groups? 
- How do you ensure exactly-once processing? 
- What is idempotency in distributed systems?

Databases
- When do you choose SQL vs NoSQL?
- Explain database indexing.
- How do you optimize slow queries?
- What is transaction isolation level?
- System Design Discussion
- Design a high throughput payment processing system.
- How would you design a digital wallet backend system?
- How would you design a rate limiting system?
- How would you design a distributed cache?

Coding Question Asked
- Problem
- LRU Cache Implementation
- Design a data structure that follows the Least Recently Used (LRU) eviction policy.
- You must support:
- get(key)
- put(key, value)
- Both operations should run in O(1) time complexity.
Example
Input:
LRUCache cache = new LRUCache(2)
cache.put(1,1)
cache.put(2,2)
cache.get(1)
cache.put(3,3)
cache.get(2)
Output
1
-1

Expected Solution Approach
Use:
HashMap
Doubly Linked List
Reason:
HashMap gives O(1) lookup
Linked list maintains usage order
Follow Up Questions During Coding

- Why use a doubly linked list instead of singly linked list?
- What is the time complexity of each operation?
- What is the space complexity?
- What happens when the cache capacity is exceeded?
- Can this cache be made thread safe?

---


Interview Summary -
Round 2 evaluated deeper backend engineering concepts:

Java internals
- Multithreading
- Distributed system architecture
- Kafka event processing
- Database performance

System design thinking

Data structures
The interviewer expected strong backend system understanding and clean coding skills.

Result: I answered the questions at a solid mid-level depth, but they were clearly looking for someone more senior for this particular role. They mentioned they are moving forward with senior candidates, but they also encouraged me to stay positive for other opportunities and did not give a hard no.
Sharing this in case it helps someone preparing for backend / fintech platform interviews.


If you’re targeting a high-paying Java Backend role at a company like JPMorganChase, don’t expect interviews to be limited to basic Java definitions.
A typical interview can cover everything from Core Java and DSA to System Design, SQL, Spring Boot, and JVM troubleshooting.


🔥 Core Java
1. How do you sort a Map? 
2. Write a Singleton class. 
3. Comparable vs Comparator. 
4. Features of Java 7, 8, 11, and 17.
5. What is try-with-resources?
6. What is a multi-catch statement? 
7. Runnable vs Callable.
8. Types of exceptions and the Java exception hierarchy.
9. Different Design Patterns in Java.
10. OOP concepts.
11. ConcurrentHashMap internals.
12. How does Java Garbage Collection work? 

💻 DSA & Coding
1. Find duplicate strings in a list. 
2. Check whether a string is a palindrome. 
3. Combination Sum II.
4. Using Java Streams: remove odd numbers, multiply remaining numbers by a constant, and calculate the sum. 
5. Find the missing integer in a consecutive array. 
6. Move all zeroes to the end of an array.
7. Check whether two strings are anagrams.
8. Find the longest common prefix. 
9. Longest Increasing Subsequence. 
10. Best Time to Buy and Sell Stock.
11. Dijkstra’s Algorithm.
12. Coin Change Problem — minimum coins. 
13. Reverse-Add Palindrome problem.

🗄️ Database & SQL
1. How do you find the number of tables and their columns in a database? 
2. What is the purpose of a database index? 
3. How do you identify duplicate rows in SQL? 
4. How would you design a schema for a ride-sharing application? 

🌿 Web & Frameworks
1. REST vs SOAP.
2. What is Spring?
3. Why do we use Spring?
4. Spring vs Spring Boot.
5. How does autowiring work internally? 
6. What is Spring Security?
7. What is a RESTful API?
8. HTTP vs HTTPS. 

🧠 System Design
1. Explain the architecture of one of your recent projects.
2. Design a fraud detection system for transactions.
3. Design the database for a ride-sharing application.
4. Design a data warehouse for an online retailer.
5. Design a news aggregator.

🖥️ Server & JVM Troubleshooting
1. How do you find the reason behind a server crash?
2. How do you check server memory usage?
3. How do you debug high CPU or memory issues in a JVM application?
4. How do you capture and analyze heap dumps and thread dumps?

💡 The biggest takeaway
For a 30 LPA-level opportunity, preparation cannot be limited to:
- ❌ Core Java definitions
- ❌ Basic Spring Boot annotations
- ❌ Only LeetCode problems

You need to be comfortable with:
- ✅ Java internals
- ✅ Concurrency
- ✅ DSA and problem-solving
- ✅ SQL and database design
- ✅ Spring ecosystem
- ✅ System Design
- ✅ JVM troubleshooting
- ✅ Production debugging
- The real difference at this level is not just whether you can write code.