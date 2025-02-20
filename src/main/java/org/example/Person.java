package org.example;

public class Person {
    public static void main(String[] args) {
   Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());}
    // Instance variables
    private String firstname;
    private String lastname;
    private int age;
    private String gender; // Eklenen instance variable
    private String nationality; // Eklenen instance variable

    // Constructor 1
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    // Constructor 2
    public Person(String firstname, String lastname, int age, String gender, String nationality) {
        this(firstname, lastname, age);
        this.gender = gender;
        this.nationality = nationality;

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
