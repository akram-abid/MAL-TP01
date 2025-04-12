import java.util.ArrayList;

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