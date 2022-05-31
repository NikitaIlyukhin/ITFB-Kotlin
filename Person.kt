/*
6.	Переписать класс в стиле Kotlin

public class Person {
 private final String name;
private final int age;
 public Person(String name, int age) {
this.name = name; this.age = age;
 }
public String getName() { return name; }
public int getAge() { return age; } }

* */
class Person {
    var name:String
        get() = field
        private set(value) {
            field = value
        }
    var age:Int
        get() = field
        private set(value) {
            field = value
        }
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
}