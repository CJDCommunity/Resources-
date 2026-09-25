Interview Questions at Wissen: Virtual

1. How will you make class immutable? How many ways are there to make it immutable? 
2. Implement own iterator for Integer (Hint: Implment Iterable and Iterator - next(), hasNext() and remove() methods) 
3. Implement own exception class 
4. Create a file with basic data for userid, stockid, qty, price, tradedate. How to generate random data 
5. Key points to consider when deciding the number of partitions in Kafka. (Hint: consider app performance requirements, producer/consumer count, threading, partition-level parallelism, ordering, throughput estimation, scalability, broker/resource ) 
6. Given a system where events arrive concurrently through a queue, design a high throughout solution to process these requests. Events belonging to the same user must always be processed sequentially and in the exact order of arrival. How do you design and guranteee ordering while maintaining high throughput? 
7. Given the following data: C101|John|3000|SUCCESS C103|Mike|7000|SUCCESS C102|Ravi|1000|SUCCESS C101|John|INVALID|SUCCESS C103|Mike|2000|FAILED C104|Sam|4000|SUCCESS C101|John|5000|SUCCESS

Write a program to: 
1. Parse the transaction records 
2. Ignore malformed records 
3. Consider only SUCCESS transactions 

1. Calculate the total successful transaction amount for each client. 
5. Return the top 3 by total transaction amount in descending order.
(Hint: Use a record to hold Transaction data. Use separate method to parse line by line returning Optional<Transaction>. Use streams(), map(), flatMap(),groupingBy(), sorted() and limit() to achieve the required result.

1. Given the following classes, identify the issues (if any) and output of the
program:
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
(Hint: Thread blocked after printing Inside Test1 method, Inside Test2
method due to unbounded Thread.sleep. However this is not classic deadlock as
the monitored scopes are difference. One locks Resource.class whereas the
other is locked on the method.
There is no way to interrupt the threads. Demonstrates understanding of
synchronization, static vs. instance locks and thread blocking.)
1. Production Support - API latency:
You are on production support. Suddenly, onboarding API latency
increases from 200ms to 5 secs, and the error rate is also increasing, What
would you do?
(Hint: discuss long running transactions, GC issues, theread related
blocks, network problems, resource starvation, logging issues, broker failures,
step by step production incident analysis)
Database troubleshooting: DB slowness reasons, slow queries, execution plans,
connection pool utilization, locks, CPU/IO (DB resource saturation)
Kafka: Posion message handling: Discuss complete poison message handling
flow including retries, DLQ/DLT processing, offset management and handling
subsequent messaages.

1.  Microservice patterns used - Containerization, Saga , DB per service,11. How would you design a system to process multiple transactional events like
credit and debit events from different clinent in a Kafka based system ensuring
minimal latency and correct in-order processing?
[Hint: use partitions by client key, use multiple consumer threads or in-
memory worker threads to process paritions in parallel, maintain sequential
processing within partitions to avoid delays and queue buildup
and also discuss if one client skews the system by sending 80% of the
requests resulting a queue buildup on one partition but other clients will be ok so
discuss the tradeoffs.]
1.  How do you multiple threads accessing the same resource simultaenously in
Java? What synchronization methods have you used?
(Hint: Use synchronized blocks/methods, ReentrantLocks, wait/notify,
CountdownLatch and other utilities to avoid race conditions and deadlocks]
1.  How do you identify slow DB queries and what steps would you take to fix
them
(Hint: Use APM tools to identify, analyze execution plans, add indexes,
optimize queries, partitioning or sharding in extreme cases)
1.  In microservices architecture, how do you communicate between
microservices ? (Hint: REST / gRPC, implement controlled retries, circuit
breakers, load balancers, proper logging and monitoring to handle falt tolerance
and recovery)
1.  Design Patterns: Implement Factory pattern
2.  Explain Proxy, Transactions, Spring Transactions management; 1,2,3 phase
commit,
1.  Kafka idempotency, capture event, deduplication
2.  Transactional Outbox pattern, CDC (using listener/observer), extensible
system that is fault tolerant
1.  Distributed locking
2.  Java Data strucutures - HashMap, ConcurrentHashMap, LinkedHashMap
when to use in which situation.
F2F interview:1. Write a method to add two very large numbers represented by 2 strings. Do not use any inbuilt methods or things like BigDecimal etc. 2. Design and implement a distributed log aggregation system.