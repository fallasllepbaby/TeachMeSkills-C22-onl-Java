
public class Main {
    public static void main(String[] args) {

        // Main Tasks

        // Task 1
//        CreditCard creditCard1 = new CreditCard(11,1100.45);
//        CreditCard creditCard2 = new CreditCard(22,1200.95);
//        CreditCard creditCard3 = new CreditCard(33,1000.10);
//
//        creditCard1.addMoneyOnAccountNumber(500.55);
//        creditCard2.addMoneyOnAccountNumber(500.55);
//        creditCard3.withdrawMoneyFromAccountNumber(500.55);
//
//        System.out.println("Credit accounts after operations: ");
//        creditCard1.getInformation();
//        creditCard2.getInformation();
//        creditCard3.getInformation();

        // Additional tasks

        // Task 1

//        System.out.println("First computer");
//        Computer computer1 = new Computer("Asus", 2350);
//        computer1.getInformation();
//
//        System.out.println("Second computer");
//        Computer computer2 = new Computer("Honor", 2900, new RAM("RAM4", 1024), new HDD("Western Digital", 500, "Inner"));
//        computer2.getInformation();

        // Task 2

        ATM atm = new ATM(3,3,1);
        System.out.println(atm.getDenomination20() * 20 + atm.getDenomination50() * 50 + atm.getDenomination100() * 100);
        atm.addMoneyToATM(1,1,1);
        System.out.println(atm.getDenomination20() * 20 + atm.getDenomination50() * 50 + atm.getDenomination100() * 100);
        System.out.println(atm.withdrawMoneyFromATM());
    }
}