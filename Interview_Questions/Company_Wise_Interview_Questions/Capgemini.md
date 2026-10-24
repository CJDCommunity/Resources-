
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