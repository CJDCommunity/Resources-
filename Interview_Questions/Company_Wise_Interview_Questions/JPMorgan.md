SCREENING ROUND 2
Client - JPMC

- Java Fundamentals
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
- Distributed Systems
- Explain event-driven architecture.
- How does Kafka work internally?
- What are Kafka partitions and consumer groups?
- How do you ensure exactly-once processing?
- What is idempotency in distributed systems?
- Databases
- When do you choose SQL vs NoSQL?
- Explain database indexing.
- How do you optimize slow queries?
- What is transaction isolation level?
- System Design Discussion
- Design a high throughput payment processing system.
- How would you design a digital wallet backend system?
- How would you design a rate limiting system?
- How would you design a distributed cache?
- Coding Question Asked
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
❌ Core Java definitions
❌ Basic Spring Boot annotations
❌ Only LeetCode problems

You need to be comfortable with:
✅ Java internals
✅ Concurrency
✅ DSA and problem-solving
✅ SQL and database design
✅ Spring ecosystem
✅ System Design
✅ JVM troubleshooting
✅ Production debugging
The real difference at this level is not just whether you can write code.

---
> Remove Duplicate Later
> ---
> 
---

Interview JPMorgan
30LPA at JPMorganChase 
This is the classic question they generally ask

𝗖𝗼𝗿𝗲 𝗝𝗮𝘃𝗮
 1. How to sort a map?
 2. Write a singleton class.
 3. Difference between comparable and comparator.
 4. New features in JAVA 7 and 8? Features of Java 8, 11, and 17.
 5. What is try with resources?
 6. What is a multi-catch statement in Java?
 7. What is runnable and callable?
 8. Types of exceptions in Java. Exception hierarchy in Java.
 9. What are the different Design patterns in Java? 
 10. OOP
 11. ConcurrentHashMap internals.
 12. How does Java garbage collection work?

𝗗𝗦𝗔/𝗖𝗼𝗱𝗶𝗻𝗴
 1. How to find duplicate strings in a list of strings?
 2. Write a program to find if a string is a palindrome string. 
 3. Combination Sum II (recursion problem).
 4. Given an array, remove all odd numbers, multiply each number by a constant, and return the sum using Java Streams.
 5. Missing integer in consecutive array.
 6. Move all zeroes to the end of an array.
 7. Check if two strings are anagrams.
 8. Longest common prefix among strings.
 9. Longest increasing subsequence.
 10. Best time to buy & sell stock (maximize profit).
 11. Dijkstra’s algorithm.
 12. Coin change problem (minimum coins).
 13. Reverse-add palindrome problem.

𝗗𝗮𝘁𝗮𝗯𝗮𝘀𝗲 (𝗦𝗤𝗟)
 1. How to find the number of tables and their columns in the SQL DB?
 2. What is the purpose of a database index?
 3. How do you detect duplicate rows in SQL?
 4. How would you design a schema for a ride-sharing app?

𝗪𝗲𝗯/𝗙𝗿𝗮𝗺𝗲𝘄𝗼𝗿𝗸𝘀
 1. Difference between REST and SOAP.
 2. What is Spring?
 3. Why do we use Spring?
 4. Difference between Spring and Spring Boot?
 5. How does autowiring work in Spring?
 6. What is Spring Security?
 7. What is a RESTful API?
 8. Difference between HTTP and HTTPS.

𝗦𝘆𝘀𝘁𝗲𝗺 𝗗𝗲𝘀𝗶𝗴𝗻
 1. Explain the design of one of your recent projects.
 2. Fraud detection model for transactions.
 3. Database design for ride-sharing.
 4. Data warehouse for an online retailer.
 5. Design a news aggregator.

𝗦𝗲𝗿𝘃𝗲𝗿/𝗦𝘆𝘀𝘁𝗲𝗺
 1. How to find server crash reasons?
 2. How to find server memory?
 3. How do you debug high CPU or memory issues in the JVM?
 4. How do you capture heap/thread dumps?