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
        Customer customertwo = new Customer("Aubrey", "Toronto", "6699", 12, true);
        System.out.println(customertwo.toString());

        Preferred pc = new Preferred();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);
        pc.addLoyaltyPoints(700);

        System.out.println(pc.toString());



    }
}