package ConstructorsClasses.ChallengeOne;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VIP {
    public static void main(String[] args) {

        VIP customerOne = new VIP();
        System.out.println(customerOne.getName());
        System.out.println(customerOne.getCreditLimit());
        System.out.println(customerOne.getEmailAddress());

        System.out.println();

        VIP customerTwo = new VIP("Jack", 30_000);
        System.out.println(customerTwo.getName());
        System.out.println(customerTwo.getCreditLimit());
        System.out.println(customerTwo.getEmailAddress());

        System.out.println();

        VIP customerThree = new VIP("Jack", 30_000, "jackjones@jack.com");
        System.out.println(customerThree.getName());
        System.out.println(customerThree.getCreditLimit());
        System.out.println(customerThree.getEmailAddress());


    }

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIP() {
        this("Aiden", 1_000_000, "Aiden@aiden.com");
    }

    public VIP(String name, double creditLimit) {
        this(name, creditLimit, "default@customer.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VIP(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}
