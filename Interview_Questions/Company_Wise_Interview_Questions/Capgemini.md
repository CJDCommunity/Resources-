🚀 Capgemini Java Developer Interview Experience | 5+ Years of Experience  
  
Preparing for a Java Backend Developer interview? Here are some questions asked in a recent Capgemini interview experience shared by a fellow developer. 👇  
  
📌 Interview Questions  
  
🔹 Core Java & Collections  
  
1. Introduce yourself.  
2. How does HashMap work internally?  
3. What are the Java Collections Framework and Stream API?  
4. Write a Java 8 Stream program to find the second-highest-paid employee.  
5. Find the frequency of each character in a string using Streams.  
  
🔹 Spring Boot  
6. What is a Spring Bean?  
7. Explain the Spring Boot annotations you have used and their purposes.  
8. How does global exception handling work in Spring Boot?  
  
🔹 REST APIs & Web Services  
9. Explain different HTTP status codes.  
10. What is the difference between REST and SOAP?  
  
🔹 Microservices  
11. What are microservices?  
12. What is the difference between a monolithic architecture and microservices?  
13. How do you handle failures in a microservices architecture?  
  
🔹 Project Discussion  
14. Explain your project architecture.  
15. How is security handled in your project?  
16. Which Java and Spring Boot versions are used in your project?  
  
💡 Preparation Tip: Don’t just memorize definitions. Be ready to explain how you have used these concepts in your project, write clean Java code, and discuss real-world scenarios.




---


🚀 Java Backend Interview Experience | Capgemini 💻  
  
Recently appeared for a Java Backend interview at Capgemini, and the questions are a useful reminder of what Java developers should prepare beyond basic definitions.  
  
The discussion covered Java 8 & 17, Spring Boot, Microservices, Kafka, SonarQube, WebSocket, and WebClient.  
  
🔥 Interview Questions  
  
☕ Core Java & Java 8/17  
  
1. What are the important features introduced in Java 17?  
2. Why upgrade from Java 8 to Java 17, even if we don’t use features like Records or Sealed Classes?  
3. What are the advantages of Java 17 over Java 8?  
4. What are the major features introduced in Java 8?  
5. What is a default method in an interface? Why was it introduced?  
6. What is a static method in Java, and why is it useful?  
7. What is the Stream API?  
8. What is a method reference?  
9. Given a list of Person objects containing name and age, sort by age in ascending order using Java 8.  
10. What is the difference between map() and flatMap()?  
  
🌱 Spring Boot & Microservices  
  
11. Why do we use Spring Boot?  
12. What is auto-configuration in Spring Boot?  
13. What is @SpringBootApplication?  
14. What is @ComponentScan?  
15. What is a Circuit Breaker in Microservices?  
16. What is Service Discovery, and why is it needed?  
17. How do you register a microservice with a Service Discovery server?  
18. If Service A calls Service B, how does the complete Service Discovery flow work?  
  
🚀 Kafka  
  
19. Have you worked with Kafka?  
20. What is Spring Kafka, and why is it used?  
21. What is a Kafka Consumer?  
22. What is a Consumer Group?  
23. How are Kafka partitions assigned to consumers within a Consumer Group?  
24. Can the same Kafka partition be consumed by consumers from different Consumer Groups?  
  
🧪 Code Quality & Modern Java  
  
25. Have you worked with SonarQube and code coverage?  
26. How do you implement code coverage in an application?  
27. What is the purpose of code coverage?  
28. Why do we use SonarQube?  
29. From a performance and security perspective, why are applications moving from Java 8 to Java 17?  
  
🌐 API & Communication  
  
30. What is WebSocket?  
31. What is WebClient?  
32. What is the difference between RestTemplate and WebClient?




---

🚀 Capgemini Interview Experience | L1 Architect | Cleared! 🎉

Yesterday, I attended the L1 Architect interview at Capgemini and successfully cleared the round! Sharing the questions discussed during the interview to help others preparing for similar roles.

☕ Core Java & Collections

1️⃣ What is the Abstract Factory design pattern?

2️⃣ What are the SOLID principles?

3️⃣ Why can a ClassCastException occur at runtime when using a TreeSet?

4️⃣ What is the maximum number of elements an ArrayList can hold?

5️⃣ Why should a HashMap key ideally be immutable?

🌱 Java 8 & Streams

6️⃣ Using Java 8 Streams, find the employee with the second-highest salary in each department.

7️⃣ What is the difference between orElse() and orElseGet() in Java’s Optional class?

🤖 AI & Technical Decision-Making

8️⃣ For what purposes do you use AI tools in your project?

9️⃣ What factors do you consider when choosing technologies for a project?

💻 Coding Challenge

🔟 Find the extra elements in List 1 compared with List 2.

Input:

```
List<Integer> list1 = List.of(1, 2, 3, 4, 4);
List<Integer> list2 = List.of(1, 2, 3, 4);
```

Expected output:

4

The solution involved using a HashMap to maintain element frequencies, subtracting the occurrences present in the second list, and printing the remaining elements.

💡 Key Takeaway: The interview covered design patterns, SOLID principles, Java Collections, Streams, AI-assisted development, technology selection, and problem-solving.

📌 Save this post for your next Java interview preparation and share it with fellow developers!




---

Yesterday I had L1 architect interview with CapGemini- Cleared.
1. What is the Abstract Factory design pattern?
2. What are the SOLID principles?
3. For what purpose do you use AI tools in your project?
4. On what basis do you choose technologies to develop a project?
5. Why do we get a ClassCastException at runtime when using a TreeSet?
6. What is the maximum number of elements an ArrayList can hold?
7. Write a code to find the employee with the second-highest salary per department using Java 8 Streams?
8. What is the difference between orElse and orElseGet in the Optional class?
9. Why should the key of a HashMap be immutable?
10. Coding test, print extra elements from list1 comparing with list 
```

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

class Main {

    
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1,2,3,4,4);
        List<Integer> list2 = List.of(1,2,3,4);
       

        Map<Integer,Integer> map= new HashMap<>();
        for(Integer value : list1){
            map.put(value, map.getOrDefault(value,0) + 1);// freque
        }

        for(Integer value : list2){
            if(map.containsKey(value)){
                if(map.get(value) == 1){
                    map.remove(value);
                }else {
                 map.put(value, map.get(value)-1);
                }
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }

        
    }
}
```







---


I recently attended an interview for a Java Backend Developer role at TCS and Capgemini. 
I wanted to share my experience along with the questions that were asked.

1. Diff between synchronized keyword and Reentrant Lock. What is a trade-off?
2. HirakiCP, what is it?
3. What is a volatile keyword?
4. What is the difference between the volatile keyword and the Atomic class (AtomicInteger & AtomicFloat) 
5. What is the Maven life-cycle (in a detailed -Maven package, maven - install, maven - deploy)
6. How did you implement Spring Security in distributed microservices? 
7. How to maintain transactions in a distributed database?
8. In pom.xml, we used the tag `<DistributionManagement>`. What is it? why we use it?
9. Is it possible to write private methods in an interface?
10. How many types of methods can we write in an interface?
11. what is @EnableAutoConfiguration and @Qualifier?
12. What are bean lifecycles? 
13. Java 17 features.
14. What is the Record class, and how do we store data in the Record class if a list of data is coming through a query? How to fetch the first records?
15. What is the var keyword? Can we use it as a generic type? 
16. SOLID design principles.
17. What is CQRS? 
18. How can we make Kafka Producer Idempotent?
19. Load Balancer Policies scenario - if 3 instances are running, how to check which is available to post messages? 
20. Write a query to fetch all employees who have a salary more than the average of all employees' salaries. 
21. Find the first unique character, and its index. ex- String input = ‘hackathon’;
If anyone is preparing for Java Backend Developer interviews, these questions might be helpful.