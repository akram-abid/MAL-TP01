public class MalTp1 {
    public static void main(String args[]){
        System.out.println("Hello World!");
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