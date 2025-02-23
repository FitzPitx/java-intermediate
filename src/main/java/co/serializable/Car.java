package co.serializable;


import java.io.*;

public class Car implements Serializable {
    private final String make;
    private final int year;
    @Serial
    private static final long serialVersionUID = 1L;

    public Car(String make, int year){
        this.make = make;
        this.year = year;
    }

    public String toString(){
        return String.format("Car is make: %s, Car year is: %d", this.make, this.year);
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);

        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println(toyota);
        System.out.println(toyotaCopy);
        System.out.println(hondaCopy);
        System.out.println("Is same Object: " + isSameObject);
    }

}
