public class MalTp1 {
    public static void main(String args[]){
        Car car1 = new Car("Mercides", "4Matic", 2025);
        Car car2 = new Car("Audi", "Q3", 2023);
        Car car3 = new Car("renault", "clio 4", 2018);

        Car[] cars = {car1, car2, car3};
        for (int i =0; i < 3; i++){
            System.out.println("car no"+i+": brand: "+cars[i].brand+" model of "+cars[i].model+" was made in "+cars[i].year);
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