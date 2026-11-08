🔥 Barclays Senior Java Developer Interview: 3–5+ Years Experience | Tricky Questions You Shouldn’t Miss!  
  
Think you know Core Java, Multithreading and Spring Boot? These interview questions will put your understanding to the test! 👀  
  
Preparing for a Senior Java Developer role? Here are some challenging questions covering concepts, internal workings, and real-world production scenarios.  
  
🔹 1. Core Java – Deep Dive  
  
* HashMap collision handling and internal implementation  
* When does a HashMap bucket transform into a Red-Black Tree?  
* Can two unequal objects with the same hashCode() exist as keys?  
* Can static methods be overridden?  
* Compile-time vs runtime polymorphism  
* Calling overridable methods from constructors  
* Designing immutable classes with mutable fields  
  
🔹 2. Multithreading & Concurrency  
  
* ConcurrentHashMap: handling simultaneous updates  
* volatile vs AtomicInteger  
* Deadlock scenarios and troubleshooting  
* Exception handling in CompletableFuture  
* thenApply() vs thenCompose() vs thenCombine()  
* Thread pool exhaustion and database connection limits  
* Debugging BLOCKED and WAITING threads in production  
  
🔹 3. Java Streams & JVM  
  
* Why can parallelStream() perform worse than sequentialStream()?  
* Modifying collections while processing streams  
* Can a consumed Stream be reused?  
* StackOverflowError vs OutOfMemoryError  
  
🔹 4. Spring Boot & Hibernate – Tricky Scenarios  
  
* @Transactional self-invocation problem  
* Why doesn’t @Transactional work on private methods?  
* Handling circular dependencies between Spring beans  
* Solving N+1 queries without blindly using EAGER fetching  
* Handling database commits when Kafka event publishing fails  
  
💡 Key Takeaway:  
  
Senior-level interviews are not just about knowing definitions. Interviewers want to understand how deeply you know the internals, how you approach complex scenarios, and how you troubleshoot real production problems.





---

🚀 Barclays Senior Java Developer Interview Experience | 3–5+ Years | Tricky Questions  
  
Think you know Core Java, Multithreading and Spring Boot well? These interview questions will put your understanding to the test! 🔥  
  
A recent Barclays Senior Java Developer interview experience covered deep Java internals, concurrency, CompletableFuture, JVM, Spring Boot and real-world production scenarios.  
  
Here are some important questions to prepare:  
  
☕ 1. Core Java – Deep Dive  
  
* What happens when two different keys generate the same hashCode() in HashMap?  
* When does a HashMap bucket transform into a Red-Black Tree?  
* Can HashMap enter an infinite loop in a multithreaded environment?  
* Can two unequal objects with the same hashCode() exist as HashMap keys?  
* Can static methods be overridden?  
* Overloading vs. overriding: compile-time and runtime behavior.  
* What happens when a constructor calls an overridable method?  
* How do you create an immutable class containing mutable objects?  
  
⚡ 2. Multithreading & Concurrency  
  
* Two threads update the same ConcurrentHashMap key simultaneously. What happens internally?  
* volatile vs. AtomicInteger.  
* Can volatile guarantee thread safety?  
* What happens when a thread pool gets exhausted?  
* How do you investigate BLOCKED and WAITING threads in production?  
  
🔄 3. CompletableFuture & Asynchronous Programming  
  
* What happens when thenApply() throws an exception?  
* thenApply() vs. thenCompose() vs. thenCombine().  
* How do you recover from exceptions without breaking the execution chain?  
* What happens when 200 application threads share only 10 database connections?  
* Can a thread pool become exhausted even with low CPU utilization?  
  
🌊 4. Java Streams & JVM  
  
* Why can parallelStream() perform worse than sequentialStream()?  
* What happens when a collection is modified during Stream processing?  
* Can you reuse a Stream after a terminal operation?  
* StackOverflowError vs. OutOfMemoryError.  
  
🌱 5. Spring Boot & Hibernate  
  
* What happens during self-invocation of @Transactional methods?  
* Why does @Transactional sometimes fail on private methods?  
* How do you resolve circular dependencies?  
* How do you solve the N+1 problem without blindly using FetchType.EAGER?  
* What if a database transaction commits but the application crashes before publishing its Kafka event?




---

I recently attended an interview for a Java Backend Developer role at Infosys and Barclays. I wanted to share my experience along with the questions that were asked.
- Explain the SOLID Design pattern.
- What is JWT security, and how have you used it in your project?
- Stream vs flat Map. 
- Explain basic Spring Security.
- Reverse a string without using predefined methods.
- Spring Container internal working. 
- What is an Optional class?
- What is the difference between @primary and @Qualifier?
- Explain Completable Future methods.
- Explain Bean Lifecycle.
- Explain Maven Lifecycle. 
- What is the difference between Path Variable and Request Params? 
- What is JWT security, and how have you used it in your project
- What is fetch type (Lazy and Eager Loading)? 
- Explain and implement the factory design pattern (with some modification) 
- What do you know about ISO8583? 
- Diff b/w IOC and Dependency Injection.
- What is Dependency Injection and its types?
- Find the second-highest salary from the employee table.
- Find a file in a subdirectory 
- How have you used Spring Security in your project?
- What is a spring profile, and how did you use it?
- What is exception handling, and what is a Controller Advice? 
- How does the @Transactional annotation work?
- If anyone is preparing for Java Backend Developer interviews, these questions might be helpful.