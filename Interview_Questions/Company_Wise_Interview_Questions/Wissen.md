
🚀 Wissen Interview Experience | Java Backend | 13 YOE  
Sharing some questions from a recent Wissen interview for a 13 YOE Java Backend role.  
The interview focused heavily on Java, Kafka, Microservices, Concurrency, Transactions, Production Troubleshooting & System Design.  
🔥 Key Questions:  
1️⃣ How would you design an immutable class in Java?  
2️⃣ Implement a custom Iterator and a custom Exception.  
3️⃣ How do you decide the number of Kafka partitions?  
4️⃣ Design a system that guarantees per-user event ordering while maintaining high throughput.  
5️⃣ Using Java Streams, process transaction data and find the Top 3 clients by transaction amount.  
6️⃣ Analyze a multithreading scenario involving synchronized instance vs static methods.  
7️⃣ Production API latency increased from 200ms → 5 seconds. How would you troubleshoot it?  
8️⃣ How would you handle Kafka poison messages, retries, DLT/DLQ and offsets?  
9️⃣ Explain Saga, Transactional Outbox, CDC and Distributed Locking.  
🔟 How would you design Kafka-based credit/debit processing with ordering and high throughput?  
1️⃣1️⃣ Explain HashMap vs ConcurrentHashMap vs LinkedHashMap.  
1️⃣2️⃣ Design a Distributed Log Aggregation System.  
🎯 Key Areas  
☕ Java | 🚀 Kafka | 🔄 Microservices | 🧵 Concurrency | 🗄️ Database | 🏗️ System Design | ⚡ Production Support  
📌 Senior-level interviews test how you design, troubleshoot, and scale systems—not just Java syntax.  
[](https://www.linkedin.com/search/results/all/?keywords=%23java&origin=HASH_TAG_FROM_FEED)





---

Interview Questions at Wissen: Virtual

1. How will you make class immutable? How many ways are there to make it immutable? 
2. Implement own iterator for Integer (Hint: Implment Iterable and Iterator - next(), hasNext() and remove() methods) 
3. Implement own exception class 
4. Create a file with basic data for userid, stockid, qty, price, tradedate. How to generate random data 
5. Key points to consider when deciding the number of partitions in Kafka. (Hint: consider app performance requirements, producer/consumer count, threading, partition-level parallelism, ordering, throughput estimation, scalability, broker/resource ) 
6. Given a system where events arrive concurrently through a queue, design a high throughout solution to process these requests. Events belonging to the same user must always be processed sequentially and in the exact order of arrival. How do you design and guranteee ordering while maintaining high throughput? 
7. Given the following data: 
```
C101|John|3000|SUCCESS C103|Mike|7000|SUCCESS C102|Ravi|1000|SUCCESS C101|John|INVALID|SUCCESS C103|Mike|2000|FAILED C104|Sam|4000|SUCCESS C101|John|5000|SUCCESS
```


Write a program to: 
1. Parse the transaction records 
2. Ignore malformed records 
3. Consider only SUCCESS transactions 

1. Calculate the total successful transaction amount for each client. 
2. Return the top 3 by total transaction amount in descending order.
(Hint: Use a record to hold Transaction data. Use separate method to parse line by line returning `Optional<Transaction>. Use streams(), map(), flatMap(),groupingBy(), sorted() and limit() to achieve the required result.`

3. Given the following classes, identify the issues (if any) and output of the
program:
```java
class Resource {
public synchronized void test1() {
System.out.println("Inside Test1 Method");
try { Thread.sleep(Long.MAX_VALUE); } catch (InterruptedException e) {
e.printStackTrace(); }
}
public static synchronized void test2() {
System.out.println("Inside Test2 Method");
try { Thread.sleep(Long.MAX_VALUE); } catch (InterruptedException e) {
e.printStackTrace(); }
}
}
class Task1 implements Runnable {
private Resource resource;
public Task1(Resource resource) { this.resource = resource; }
@Override
public void run() {
resource.test1();
Resource.test2();
System.out.println("Invoked Test2 Method from ResourceTask1");
}
}
class Task2 implements Runnable {
private Resource resource;
public Task2(Resource resource) { this.resource = resource; }
@Override
public void run() {
Resource.test2();resource.test1();
System.out.println("Invoked Test1 Method from Task2");
}
}
public class ThreadTest {
public static void main(String[] args) {
Resource resource = new Resource();
Thread t1 = new Thread(new Task1(resource));
Thread t2 = new Thread(new Task2(resource));
t1.start();
t2.start();
}
}
```
(Hint: Thread blocked after printing Inside Test1 method, Inside Test2
method due to unbounded Thread.sleep. However this is not classic deadlock as
the monitored scopes are difference. One locks Resource.class whereas the
other is locked on the method.
There is no way to interrupt the threads. Demonstrates understanding of
synchronization, static vs. instance locks and thread blocking.)

---


Production Support - API latency:

You are on production support. Suddenly, onboarding API latency
increases from 200ms to 5 secs, and the error rate is also increasing, What
would you do?
- (Hint: discuss long running transactions, GC issues, theread related
blocks, network problems, resource starvation, logging issues, broker failures,
step by step production incident analysis)

- Database troubleshooting: DB slowness reasons, slow queries, execution plans,
connection pool utilization, locks, CPU/IO (DB resource saturation)
- Kafka: Posion message handling: Discuss complete poison message handling
flow including retries, DLQ/DLT processing, offset management and handling
subsequent messaages.

2.  Microservice patterns used - Containerization, Saga , DB per service,11. How would you design a system to process multiple transactional events like
credit and debit events from different clinent in a Kafka based system ensuring
minimal latency and correct in-order processing?
[Hint: use partitions by client key, use multiple consumer threads or in-
memory worker threads to process paritions in parallel, maintain sequential
processing within partitions to avoid delays and queue buildup
and also discuss if one client skews the system by sending 80% of the
requests resulting a queue buildup on one partition but other clients will be ok so
discuss the tradeoffs.]
3. How do you multiple threads accessing the same resource simultaenously in
Java? What synchronization methods have you used?
(Hint: Use synchronized blocks/methods, ReentrantLocks, wait/notify,
CountdownLatch and other utilities to avoid race conditions and deadlocks]
4.  How do you identify slow DB queries and what steps would you take to fix
them
(Hint: Use APM tools to identify, analyze execution plans, add indexes,
optimize queries, partitioning or sharding in extreme cases)
5.  In microservices architecture, how do you communicate between
microservices ? (Hint: REST / gRPC, implement controlled retries, circuit
breakers, load balancers, proper logging and monitoring to handle falt tolerance
and recovery)
6.  Design Patterns: Implement Factory pattern
7.  Explain Proxy, Transactions, Spring Transactions management; 1,2,3 phase
commit,
8.  Kafka idempotency, capture event, deduplication
9.  Transactional Outbox pattern, CDC (using listener/observer), extensible
system that is fault tolerant
10.  Distributed locking
11.  Java Data strucutures - HashMap, ConcurrentHashMap, LinkedHashMap
when to use in which situation.

---
F2F interview

- Write a method to add two very large numbers represented by 2 strings. Do not use any inbuilt methods or things like BigDecimal etc. 2. Design and implement a distributed log aggregation system.