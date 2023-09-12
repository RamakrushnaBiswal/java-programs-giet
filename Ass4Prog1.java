//Program1: Write a Java program using classes and object.
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.print("Name: " + name+"  ");
        System.out.print("Age: " + age+"  \n");
    }
}
public class Ass4Prog1 {
    public static void main(String[] args) {
        Person person1 = new Person("Bunty", 30);
        Person person2 = new Person("Rama", 25);
        System.out.println("Person 1:");
        person1.displayInfo();
        System.out.print("Person 2:");
        person2.displayInfo();
    }
}
