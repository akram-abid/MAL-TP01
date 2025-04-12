import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MalTp1 {
    public static void main(String args[]){
        System.out.println("First Task:---------------------------------------------------");
        Car car1 = new Car("Mercides", "4Matic", 2025);
        Car car2 = new Car("Audi", "Q3", 2023);
        Car car3 = new Car("renault", "clio 4", 2018);

        Car[] cars = {car1, car2, car3};
        for (int i =0; i < 3; i++){
            System.out.println("car no"+i+": brand: "+cars[i].brand+" model of "+cars[i].model+" was made in "+cars[i].year);
        }

        System.out.println();
        System.out.println();
        System.out.println("Second Task:---------------------------------------------------");
        Animal[] animals = {new Dog("mreguet"), new Cat("miche"), new Dog("saadane")};

        for (int i = 0; i < animals.length; i++){
            System.out.print("name: " + animals[i].getName() + " it's sound: ");
            animals[i].makeSound();
        }

        System.out.println();
        System.out.println();
        System.out.println("Third Task:---------------------------------------------------");
        ArrayList<Flyer> flyingThings = new ArrayList<>();

        flyingThings.add(new Plane("Boeing 747"));
        flyingThings.add(new Bird("Aigle"));
        flyingThings.add(new Plane("Airbus A320"));
        flyingThings.add(new Bird("Colibri"));

        for (int i = 0; i < flyingThings.size(); i++) {
            System.out.println(flyingThings.get(i).fly());
        }
        System.out.println("Third Task: sub-task---------------------------------------------------");
        ArrayList<AbstractFlyer> AnotherFlyingThings = new ArrayList<>();

        AnotherFlyingThings.add(new AbstractPlane("Boeing 747"));
        AnotherFlyingThings.add(new AbstractBird("Aigle"));
        AnotherFlyingThings.add(new AbstractPlane("Airbus A320"));
        AnotherFlyingThings.add(new AbstractBird("Colibri"));

        for (int i = 0; i < AnotherFlyingThings.size(); i++) {
            System.out.println(AnotherFlyingThings.get(i).fly());
        }

        System.out.println();
        System.out.println();
        System.out.println("Forth Task:---------------------------------------------------");

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Alice:", 30));
        people.add(new Person("Bob:", 22));
        people.add(new Person("Charlie:", 28));

        System.out.println("Before sorting:");
        for (Person p : people) {
            System.out.println(p.getName() + " (" + p.getAge() + " years old)");
        }

        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - 1; j++) {
                if (people.get(j).getAge() > people.get(j + 1).getAge()) {
                    // swap
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
        System.out.println();
        System.out.println("After sorting:");
        for (Person p : people) {
            System.out.println(p.getName() + " (" + p.getAge() + " years old)");
        }

        HashMap<String, Person> personMap = new HashMap<>();

        for (int i = 0; i < people.size(); i++) {
            String key = people.get(i).getName();
            if (!personMap.containsKey(key)) {
                personMap.put(key, people.get(i));
            } else {
                personMap.put(key, people.get(i));
            }
        }
    }
}

class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String newModel){
        this.brand = newModel;
    }

    public String getYear(){
        return this.brand;
    }

    public void setYear(String newYear){
        this.brand = newYear;
    }
}
/////////////////////////////////////////////////////////////////////////////

class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("i am currently making sounds ..");
    }

    public String getName(){
        return this.name;
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("howf howf howf ..");
    }

    public String getName(){
        return this.name;
    }
}

class Cat extends Animal{

    public Cat(String name){
        super(name);
    }
    
    @Override
    public void makeSound(){
        System.out.println("meow meow meow ..");
    }

    public String getName(){
        return this.name;
    }
}

///////////////////////////////////////////////////////////////////////////////////////

interface Flyer {
    public String fly();
}

class Bird implements Flyer{

    String type;

    Bird(String type){
        this.type = type;
    }

    public String fly(){
        return "the "+this.type+" bird type is flying ...";
    }
}

class Plane implements Flyer{
    String type;

    Plane(String type){
        this.type = type;
    }

    public String fly(){
        return "the "+this.type+" plane is flying with passengers ...";
    }
}

/////////////////////////////////////////////////////////////////////////////////
abstract class AbstractFlyer {

    protected String name;

    public AbstractFlyer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String fly();
}

class AbstractBird extends AbstractFlyer{

    String name;

    AbstractBird(String name){
        super(name);
    }

    @Override
    public String fly(){
        return "the "+this.name+" bird type is flying ...";
    }
}

class AbstractPlane extends AbstractFlyer {
    public AbstractPlane(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "the "+this.name+" plane is flying with passengers ...";
    }
}

///////////////////////////////////////////////////////////////////////////::::
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
