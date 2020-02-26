# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.
Dog.java & Animal.java

2. What five objects are created in the main? 
   1) an arraylist of type Dog
   2) a dog named Fido wih 4 legs
   3) a dog named Fido with 3 legs
   4) a dog named Alfie with 4 legs
   5) an anonymous class object which implements Comparator with type Animal  

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
Yes, when new is called. Comparator (interface) created an anonymous class implementing the Comparator. The class definition includes the compare() method. The Collections.sort() takes in the list and Comparator, which is the anonymous class object. 