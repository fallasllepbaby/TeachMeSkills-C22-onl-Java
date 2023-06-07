
public class Main {
    public static void main(String[] args) {

        // Main Tasks

        // Task 1
        CreditCard creditCard1 = new CreditCard(11,1100.45);
        CreditCard creditCard2 = new CreditCard(22,1200.95);
        CreditCard creditCard3 = new CreditCard(33,1000.10);

        creditCard1.addMoneyOnAccountNumber(500.55);
        creditCard2.addMoneyOnAccountNumber(500.55);
        creditCard3.withdrawMoneyFromAccountNumber(500.55);

        System.out.println("Credit accounts after operations: ");
        creditCard1.getInformation();
        creditCard2.getInformation();
        creditCard3.getInformation();

        // Additional tasks

        // Task 1

    }
}