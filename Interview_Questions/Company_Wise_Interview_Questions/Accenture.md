🚀 Accenture | Java Backend Interview Experience | Senior Software Engineer  
  
Preparing for a Senior Java Backend Developer interview? Here’s a collection of important questions from a recent Accenture Java Backend interview experience shared by Pradeep Saini.  
  
The discussion covered Core Java, Java 8/21, Spring Boot, Microservices, SQL, Kafka, and practical backend scenarios. 👇  
  
☕ Core Java & Java 8  
  
1️⃣ How have you used Java 8 features in your project? Explain Stream API, Lambda expressions, Functional Interfaces, and Optional with real examples.  
  
2️⃣ How have you used Java Collections in your project? Why choose List, Set, or Map for a particular use case?  
  
3️⃣ Abstract Class vs Interface — which have you used in your project, and why?  
  
4️⃣ Checked vs Unchecked Exceptions — how would you design custom exceptions in Spring Boot?  
  
5️⃣ What is the difference between map(), flatMap(), and filter() in Java Streams?  
  
🌱 Spring Boot & JPA/Hibernate  
  
6️⃣ What is the difference between @Component, @Service, @Repository, and @Controller?  
  
7️⃣ How does @Transactional work? What happens if an exception occurs inside a transactional method?  
  
8️⃣ What is the N+1 query problem in Hibernate, and how would you identify and resolve it?  
  
9️⃣ What is the difference between save(), saveAndFlush(), and flush() in Spring Data JPA?  
  
🔟 How would you handle REST API versioning without breaking existing clients?  
  
📨 Kafka & Spring Security  
  
1️⃣1️⃣ What happens if a Kafka consumer processes a message but crashes before committing the offset? How would you handle it?  
  
1️⃣2️⃣ Explain Kafka partitions and consumer groups. How are messages distributed among multiple consumers?  
  
1️⃣3️⃣ How does the Spring Security filter chain work?  
  
💡 Key Takeaway  
  
For senior backend roles, interviewers want more than theoretical knowledge. Be prepared to explain:  
  
✅ Real project examples and technical decisions  
✅ Java 8 features and Collections  
✅ Spring transaction management and Hibernate performance  
✅ Kafka consumer reliability and offset management  
✅ API design, versioning, and application security  
  
My advice: Don’t just memorize definitions. Understand the internal working, explain your approach with real project examples, and be ready for follow-up questions.




---

🔥 Accenture Interview Questions | Java + Angular Full Stack Developer | 5+ Years Experience  
  
☕ CORE JAVA & CONCURRENCY  
  
1️⃣ Tell me about a production issue you fixed in your Java + Angular project. How did you identify the root cause?  
  
2️⃣ HashMap vs ConcurrentHashMap — when would you use each?  
  
3️⃣ Compare synchronized, volatile, and atomic classes. Is a volatile counter thread-safe for concurrent increments?  
  
4️⃣ How would you execute two independent API calls in parallel using CompletableFuture and handle failures?  
  
5️⃣ How would you create an immutable Java class containing a List?  
  
6️⃣ Find the first non-repeating character in a string. Explain the time complexity.  
  
7️⃣ Using Java Streams, group employees by department and find the highest-paid employee in each department.  
  
🌱 SPRING BOOT & HIBERNATE  
  
8️⃣ Are Spring singleton beans thread-safe? What happens if request-specific data is stored in a service field?  
  
9️⃣ Explain @Transactional. Why might it not work when one method calls another method in the same class?  
  
🔟 How would you solve the N+1 query problem in Hibernate?  
  
1️⃣1️⃣ Lazy vs eager fetching — how would you handle LazyInitializationException?  
  
1️⃣2️⃣ Two users update the same record simultaneously. How would you prevent one update from silently overwriting the other?  
  
1️⃣3️⃣ How would you implement pagination, filtering, and sorting for an employee table containing millions of records?  
  
🔐 SPRING SECURITY & API DESIGN  
  
1️⃣4️⃣ Explain JWT authentication between Angular and Spring Security.  
  
1️⃣5️⃣ How should the backend prevent users from modifying a browser-side role value to access admin APIs?  
  
1️⃣6️⃣ Multiple requests fail because an access token expires. How would you refresh the token once and retry failed requests?  
  
1️⃣7️⃣ An API that was previously fast now takes five seconds. How would you investigate the Java code and database query?  
  
🅰️ ANGULAR & RXJS  
  
1️⃣8️⃣ Explain OnPush change detection. Why might changing an object property fail to update a child component?  
  
1️⃣9️⃣ Where would you use Signals, computed(), and effect()? When would you still use RxJS?  
  
2️⃣0️⃣ Compare switchMap, mergeMap, concatMap, and exhaustMap with practical examples.  
  
2️⃣1️⃣ Build a search box that waits for the user to stop typing, avoids duplicate searches, and cancels stale requests.  
  
2️⃣2️⃣ How do you prevent subscription leaks in Angular? Explain the async pipe and takeUntilDestroyed().  
  
2️⃣3️⃣ How would you attach a token through an HTTP interceptor while ensuring it is sent only to your own API?  
  
2️⃣4️⃣ A user double-clicks Save and two records are created. How would you handle this in Angular and Spring Boot?




---


Interview Accenture Interview-1
1. what i did in my project and how I did it?
2. react scenio based questions if backend sends you data how you consume it and put modal on frontend based on data availability
3. java 8 streams coding 2 questions
4. sql coding questions
5. Spring boot questional @transactional , @contoller vs @restcontroller, about how conifgs are done, how deployment is done ? Any knowledge on AWS,azure concepts,
6. Any knowledge on pubsub model, liquibase for database migrations


Interview Accenture-2

- ACCENTURE – JAVA INTERVIEW QUESTIONS (CUSTOM SOFTWARE ENGINEER)
- DAY 1 – CORE JAVA (MOST IMPORTANT)
- OOPs (Must be PERFECT)
- Explain OOPs concepts with real-time example
- What is Encapsulation? Why is it important?
- Inheritance vs Composition
- What is Polymorphism? Types?
- Compile-time vs Runtime polymorphism
- Abstract class vs Interface
- Can an interface have variables and constructors?
- Why multiple inheritance not supported in Java?
- IS-A vs HAS-A relationship
- Can we create object of abstract class?

- Core Java Basics
- Difference between JDK, JRE, JVM
- What is JVM? Explain JVM architecture
- What is classloader?
- Why Java is platform independent?
- What is static keyword?
- Static block vs instance block
- Can main method be overloaded?
- Why String is immutable?
- String vs StringBuilder vs StringBuffer
- How memory works for String (String Pool)

- Exception Handling
- What is exception?
- Checked vs Unchecked exceptions
- Difference between throw and throws
- try-catch-finally rules
- Can finally block be skipped?
- What happens if exception in finally?
- Can we have multiple catch blocks?
- Custom exception – how and why?
- Error vs Exception
- Can we catch multiple exceptions in single catch?

- DAY 2 – COLLECTIONS, MULTITHREADING, JAVA 8

- Collections Framework (VERY IMPORTANT)
- What is Collection framework?
- Difference between List, Set, Map
- ArrayList vs LinkedList
- Vector vs ArrayList
- HashSet vs LinkedHashSet vs TreeSet
- HashMap vs Hashtable
- HashMap vs ConcurrentHashMap
- How HashMap works internally?
- Why HashMap allows one null key?
- What is load factor and capacity?
- equals() vs hashCode()
- What happens if hashCode is same but equals false?
- How to make HashMap thread-safe?
- Difference between Iterator and ListIterator
- Fail-fast vs Fail-safe iterator

- Multithreading (Accenture asks basics)
- What is thread?
- Thread vs Runnable
- Thread life cycle
- What is synchronization?
- synchronized method vs synchronized block
- What is deadlock?
- How to avoid deadlock?
- wait() vs sleep()
- notify() vs notifyAll()
- What is volatile keyword?

- Java 8 (HIGH WEIGHTAGE)
- What is Java 8?
- What is Lambda expression?
- What is functional interface?
- Can functional interface have multiple methods?
- Predicate, Consumer, Supplier – explain
- Stream API – why used?
- filter(), map(), reduce()
- Difference between map() and flatMap()
- forEach() vs stream()
- What is Optional?
- How to avoid NullPointerException using Optional?

- DAY 3 – SPRING, REST, GIT, AGILE, CODING
- Spring / Spring Boot
- What is Spring?
- What is Spring Boot?
- Difference between Spring and Spring Boot
- What is Dependency Injection?
- Types of DI
- @Component vs @Service vs @Repository
- @Autowired – how it works?
- @Controller vs @RestController
- What is REST API?
- HTTP methods – GET, POST, PUT, DELETE
- @RequestParam vs @PathVariable
- @RequestBody – when to use?
- How exception handling is done in Spring Boot?
- What is application.properties?

- Git (Simple but Mandatory)
- What is Git?
- git pull vs git fetch
- git merge vs git rebase
- How do you resolve conflicts?
- What is branch?
- What is commit?

- Agile & Waterfall
- Agile vs Waterfall
- What is Scrum?
- Sprint, Daily Stand-up, Retrospective
- What is your role in Agile team?
- What tools you used (JIRA, etc.)?

- Coding Questions (VERY COMMON)
- Reverse a String
- Check Palindrome
- Find duplicate characters in String
- Count frequency of characters
- Find second largest number
- Remove duplicates from ArrayList
- Swap two numbers without temp
- Find missing number in array
- Sort HashMap by values

- Project-Based Questions (CRITICAL)
- Explain your project architecture
- What was your role?
- Technologies used?
- Challenges you faced?
- How you fixed a production issue?
- How you improved performance?
- Have you worked on REST APIs?
- How did you handle exceptions in project?
- How did you use Git in project?
- Any critical bug you solved?


Interview Accenture Interview-3
1. Introduction And I Explained the Project  (First Question)
2. OOPS
- Pillar, Sub Types
- You need to Explain Key Term

3. HashMap
- First Solve by JCF
- Now Solve by Stream
- FrequencyMap
- Highest Frequency
- Second Height frequency
- How To Print it ?

4. @SpringBootAnnotation
- Explain Each and Every One
- Specially @Configuration.
- For Example
- How Spring-boot-starter-jpa
- How Classpath ?

1. Project Already Java8 , Now Migrated to Java21
- How will you Improve the Existing Code ?
- I only Remember Record Class

1. Comparator and Comparable  (last Question)



Interview Accenture Interview-AI

- Round 1 – HackerRank Assessment
- 2 coding questions
- Solved 1 completely (passed the round)

- Round 2 – Technical/Skill Interview
- Covered a wide range of concepts from Core Java to Cloud & DevOps:
- Singleton Design Pattern (code implementation)
- Microservices failure handling
- JWT implementation
- Java Stream API (2 coding problems)
- String vs StringBuilder vs StringBuffer
- Producer–Consumer problem
- Consumer vs Supplier functional interfaces
- SQL queries
- synchronized keyword
- Excluding configuration in Spring Boot
- Git & Docker commands
- Jenkins pipeline implementation
- Core Java code snippets (predict output/behavior)
- Lazy vs Eager loading
- React basics
- AWS concepts
- Types of AI models

- Round 3 – Managerial Round
- Behavioral questions focused on:
- Team collaboration
- Project experience
- Problem-solving approach
- Communication skills

- Round 4 – Technical/Cloud Round (unexpected)
- Primarily focused on Cloud concepts like:
- Load balancing
- Scalability
- Architecture discussions

