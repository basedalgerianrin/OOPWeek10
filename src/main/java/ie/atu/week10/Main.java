package ie.atu.week10;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person firstperson = new Person();
        firstperson.setName("Aubrey");
        firstperson.setAddress("Toronto");
        firstperson.setPhoneNumber("6699");

        System.out.println(firstperson.toString());
        Customer customer = new Customer();


    }
}