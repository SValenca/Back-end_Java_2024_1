package aula05._01_instancia;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Marca: " + brand + " Ano: " + year);
    }
}
