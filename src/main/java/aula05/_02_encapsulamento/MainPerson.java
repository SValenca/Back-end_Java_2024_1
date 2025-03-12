package aula05._02_encapsulamento;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Joaquim");
        person.setAge(20);

        System.out.println("Nome: " + person.getName());
        System.out.println("Idade: " + person.getAge());
    }
}
