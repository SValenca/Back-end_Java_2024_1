package aula05._01_instancia;

public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2023);
        myCar.displayInfo();

        Car fusca = new Car("fusca", 1998);
        fusca.displayInfo();
    }

}
