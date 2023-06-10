public class CreditCard {

    private int accountNumber;
    private double sumOnAccountNumber;

    public CreditCard(int accountNumber, double sumOnAccountNumber){
        this.accountNumber = accountNumber;
        this.sumOnAccountNumber = sumOnAccountNumber;
        getInformation();
    }

    public CreditCard(int accountNumber){
        this(accountNumber, 0);
    }

    public CreditCard(double sumOnAccountNumber){
        this(0,sumOnAccountNumber);
    }

    public CreditCard(){

    }



    public double getSumOnAccountNumber() {
        return sumOnAccountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSumOnAccountNumber(double sumOnAccountNumber) {
        this.sumOnAccountNumber = sumOnAccountNumber;
    }



    public void addMoneyOnAccountNumber(double money){
        this.sumOnAccountNumber = this.sumOnAccountNumber + money;
    }

    public void withdrawMoneyFromAccountNumber(double money){
        this.sumOnAccountNumber = this.sumOnAccountNumber - money;
    }

    public void getInformation(){
        System.out.println("Account Number - " + this.accountNumber);
        System.out.println("Amount of money on a credit card - " + this.sumOnAccountNumber);
        System.out.println();
    }
}
