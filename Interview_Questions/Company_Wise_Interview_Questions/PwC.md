

🚀 PwC Java Backend Interview Experience | Java | Spring Boot | Kafka | Concurrency  
  
Sharing a recent PwC Java Backend interview experience focused heavily on real-world backend scenarios rather than just theoretical concepts.  
  
The discussion covered Java concurrency, financial transactions, Kafka, database consistency, JVM troubleshooting, and production-level problem solving.  
  
☕ Java & Concurrency  
  
🔹 Why can HashMap be dangerous in concurrent applications?  
🔹 HashMap vs ConcurrentHashMap  
🔹 What happens when two threads update the same account balance?  
🔹 synchronized vs ReentrantLock  
🔹 How can you prevent deadlocks between two account transfers?  
🔹 How would you guarantee an account doesn’t go negative under 100 concurrent withdrawals?  
  
💰 Transactions & Payment Processing  
  
🔹 Explain transaction isolation levels with banking examples  
🔹 Why is BigDecimal preferred over double for money?  
🔹 How do you make a payment API idempotent?  
🔹 What happens if a Kafka payment event is delivered twice?  
🔹 What happens if an exception occurs after a DB update?  
🔹 Why might @Transactional not roll back?  
🔹 How would you handle a debit-success / credit-failure scenario?  
  
📨 Kafka & Distributed Systems  
  
🔹 Duplicate Kafka event processing  
🔹 Idempotency in payment processing  
🔹 Maintaining consistency across services  
🔹 Handling failures in distributed transactions  
🔹 Reliable event-driven processing  
  
🧠 JVM & Production Troubleshooting  
  
🔹 Heap Dump vs Thread Dump  
🔹 Tools to investigate Java memory issues  
🔹 How Java Flight Recorder helps with memory analysis  
🔹 How incorrect cache configuration can cause OutOfMemoryError  
🔹 Debugging JVM and memory issues in production  
  
💡 Interview Takeaway  
  
For experienced Java developers, interviews are increasingly focused on real-world problem solving.  
  
It’s not enough to know:  
  
❌ What is HashMap?  
❌ What is Kafka?  
❌ What is @Transactional?  
  
You should be able to explain:  
  
✅ What happens internally?  
✅ What happens under high concurrency?  
✅ How do you handle failures?  
✅ How do you maintain data consistency?  
✅ How would you debug the issue in production?  
  
Strong fundamentals + practical implementation + system design thinking = better interview preparation.