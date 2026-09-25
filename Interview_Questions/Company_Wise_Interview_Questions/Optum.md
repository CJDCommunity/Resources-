2 YOE 🚀 Java Interview Questions (Optum)

1. How does intern() work with the String pool? What’s the memory-level difference between new String("abc") and "abc"?
2. How would you implement immutability in Java? Why is String immutable — explain the internal reasoning.
3. How is memory allocated for static, final, and static final variables in the JVM?
4. How does the diamond problem get resolved in Java through default methods in interfaces?
5. Why aren’t multiple abstract methods allowed in functional interfaces?
6. What performance issues can autoboxing/unboxing cause in production?
7. How does the var keyword (Java 10) resolve type inference internally at compile time?
8. What is the correct use case for the Optional class, and how is it commonly misused?
9. How does the Reflection API work in Java, and what are its performance trade-offs?
10. Give a real production example where the Liskov Substitution Principle was violated.
11. Describe a scenario where using inheritance instead of composition broke the design.
12. How did the internal structure of HashMap change after Java 8 (treeify threshold, red-black tree)?
13. How does ConcurrentHashMap internally handle locking (segment locking vs CAS)?
14. What is the performance impact during HashMap resize/rehashing, and how can it be avoided?
15. When should CopyOnWriteArrayList be used, and what is its memory overhead?
16. What is the use case for WeakHashMap and IdentityHashMap?
17. Explain the difference between ForkJoinPool and a normal ExecutorService in the context of work-stealing.
18. How does ThreadLocal create a memory leak, and how do you avoid it?
19. Explain the practical difference between thenApply(), thenCompose(), and thenCombine() in CompletableFuture.
20. Explain the use case for Semaphore in the context of connection pooling.
21. What is the happens-before relationship in the Java Memory Model?
22. How does exception chaining (cause) help with debugging in production?
23. Explain all phases of the Spring Bean lifecycle, up to BeanPostProcessor.
24. How does Spring resolve circular dependencies, and when does it fail?
25. How does the Spring Security filter chain internally process a request?
26. How do you use Spring Boot Actuator for production monitoring?
27. Explain how the G1 Garbage Collector works and why it’s better than CMS for high-heap applications.
28. What is the Hibernate N+1 query problem, and how do you detect/fix it in production?
29. How do you detect a memory leak in the JVM (through heap dump analysis tools)?










Optum Interview Experience | Java Full Stack / Backend Developer 🚀																									
I recently appeared for an interview with Optum and wanted to share the questions that were discussed. Hopefully, this helps anyone preparing for similar technical roles!																									
Round 1 – Technical Discussion																									
The round covered a mix of modern Java, concurrency, Spring Boot, Microservices, and React.																									
🔹 Core Java & Concurrency																									
1. What are Virtual Threads (Project Loom / Java 21), and how do they improve backend scalability?																									
2. How do CompletableFuture and Structured Concurrency enhance asynchronous REST handling?																									
3. What are Records in Java, and how do they simplify data modeling?																									
4. What are the key features introduced in Java 8?																									
5. One Java coding question.																									
6. Two Stream API coding questions focused on functional programming.																									
🔹 Spring & Spring Boot																									
7. Explain the difference between Spring and Spring Boot in detail, with examples.																									
8. How do you configure and use two different databases in a single Spring Boot application?																									
9. Which Spring annotations have you used in your project? Explain their purpose and use cases.																									
10. How have you implemented caching in Spring Boot, and where does caching fit best?																									
🔹 Microservices																									
11. Which common Microservices Design Patterns have you used or are familiar with?																									
🔹 React / Frontend																									
12. How do you use useEffect effectively?																									
The discussion also included its:																									
• Advantages																									
• Disadvantages																									
• Common use cases and potential pitfalls																									
💡 Key Takeaway																									
One thing that stood out was the focus on modern Java and practical implementation.																									
The interview wasn't limited to basic questions like:																									
❌ What is multithreading?																									
❌ What is Spring Boot?																									
❌ What is a REST API?																									
Instead, the discussion went deeper into:																									
✅ Virtual Threads																									
✅ Modern concurrency																									
✅ Asynchronous programming																									
✅ Functional programming																									
✅ Multi-database configuration																									
✅ Caching strategies																									
✅ Microservices patterns																									
✅ Modern frontend concepts																									