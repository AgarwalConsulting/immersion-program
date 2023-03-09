import java.util.*;

// POJO => Plain old java object
class Person { // Blueprint of a real world entity
  // Attributes
  private Integer age; // Default Value: null
  private String name; // Default Value: null

  // Constructors
  Person() {
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Methods: Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Methods: Getters
  public String getName() {
    return this.name;
  }

  public Integer getAge() {
    return this.age;
    // return this.age.intValue();
  }

  // Overide methods from Object
  @Override
  public String toString() {
    return String.format("%s is %d years old.", this.name, this.age);
  }

  @Override
  public boolean equals(Object other) {
    Person p = (Person)other;

    return (this.name.equals(p.name)) && (this.age.equals(p.age));
  }
}

// Access modifiers: public, private, protected
// Methods: Setters & Getters

public class Hello {

  public static void main(String[] args) {
    // Person p = new Person(); // "object"
    Person p = new Person("Gaurav", 31); // "object"

    // p.name = "Gaurav";
    // p.setName("Gaurav");
    // // p.age = 31;
    // p.setAge(31);

    System.out.println(p); // Gaurav is 31 years old.
    System.out.println(p.toString()); // Gaurav is 31 years old.

    System.out.println(p.getName());
    System.out.println(p.getAge());

    Person p1 = new Person();

    System.out.println(p1); // Default Value: Person{name: null, age: null}

    p1.setName("Gaurav");
    p1.setAge(31);

    // if (p == p1) {
    //   System.out.println("Equal!");
    // } else {
    //   System.out.println("Not Equal!");
    // }

    if (p.equals(p1)) {
      System.out.println("Equal!");
    } else {
      System.out.println("Not Equal!");
    }

  }
}
