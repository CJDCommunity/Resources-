Comviva Round 1Java Developer Interview Questions (5 YOE)

1. Explain the complete JVM Lifecycle. Cover Class Loading, Runtime Memory Areas, Execution Engine, JIT Compiler, and Garbage Collection. How do different Garbage Collectors work? What would happen if Java did not have a Garbage Collector?

2. Explain the @Transactional annotation in Spring Boot. How does it work internally? Describe the role of Spring AOP, proxies, Transaction Manager, commit, and rollback.

3. If a method annotated with @Transactional throws a checked exception (e.g., IOException), will Spring roll back the transaction? Why or why not?

4. Your team is building an E-commerce Platform. When a user places an order, the system:

   * Creates an order record.
   * Reserves inventory stock.
   * Sends a confirmation email.

   Write pseudo code to ensure that if any step fails, the order is not persisted in the database.

5. Design a Notification System where Service A completes processing and triggers notifications through:

   * WhatsApp
   * SMS
   * Email
   * Push Notifications

   Explain the complete architecture, including message queues, retry mechanisms, scalability, and failure handling.

6. Given 3 Java code snippets, predict the output and explain the underlying Java concepts.

7. Write Java code to find a missing number in:

   * A sorted array.
   * An unsorted array.

   Also explain the time and space complexity.

8. Write an SQL query to find the employee(s) with the highest salary in each department and sort the results by department.

9. Explain the Saga Pattern in Microservices Architecture. What are compensating transactions? Compare Choreography vs Orchestration.

10. How would you implement Retry and Circuit Breaker in a Saga-based architecture using Resilience4j? Explain important configuration properties:

    * Failure Rate Threshold
    * Sliding Window Size
    * Wait Duration in Open State
    * Permitted Calls in Half-Open State
    * Maximum Retry Attempts
    * Retry Wait Duration

11. List all important Kafka Producer & Consumer configuration properties used in Spring Boot Microservices.

12. Explain Kafka Consumer Offset Management. Difference between Auto Commit and Manual Commit. Mention all Kafka consumer configurations.

13. Design a highly available Kafka-based Event-Driven Architecture capable of processing millions of messages per day.

14. Explain the difference between HashMap, ConcurrentHashMap, and Hashtable. When should each be used?

15. What happens internally when HashMap.put(key, value) is called?

16. Explain Eureka Service Discovery and how Client-Side Load Balancing works in Spring Cloud.

17. Design a Payment Processing System that prevents duplicate payments even if the client sends the same request multiple times (Idempotency).