import java.util.Scanner;

public class ATM {
    private int denomination20;
    private int denomination50;
    private int denomination100;
    
    private int[] denomination = {20,50,100};
    private int[] count = new int[denomination.length];
    private int index = denomination.length - 1;



    // SETTERS AND GETTERS
    public void setDenomination20(int denomination20) {
        this.denomination20 = denomination20;
    }

    public void setDenomination50(int denomination50) {
        this.denomination50 = denomination50;
    }

    public void setDenomination100(int denomination100) {
        this.denomination100 = denomination100;
    }

    public int getDenomination20() {
        return denomination20;
    }

    public int getDenomination50() {
        return denomination50;
    }

    public int getDenomination100() {
        return denomination100;
    }
    ////////////////////////////////////////////////////////////



    // Constructors

    public ATM(int denomination20, int denomination50, int denomination100){
        this.denomination20 = denomination20;
        this.denomination50 = denomination50;
        this.denomination100 = denomination100;
        
    }

    ////////////////////////////////////////////////////////////

    // Scanner
    public static Scanner scan(){
        return new Scanner(System.in);
    }

    // Method to add money to ATM
    public void addMoneyToATM(int denomination20, int denomination50, int denomination100){
        this.denomination20 += denomination20;
        this.denomination50 += denomination50;
        this.denomination100 += denomination100;
    }

    // Method to withdraw money from ATM
    public boolean withdrawMoneyFromATM(){
        int denomination20 = 0;
        int denomination50 = 0;
        int denomination100 = 0;
        System.out.print("Enter amount of money, which you want to withdraw from ATM: ");
        int money = scan().nextInt();
        if(money > this.denomination20 * 20 + this.denomination50 * 50 + this.denomination100 * 100) return false;
        if(money % 100 > this.denomination50 * 50 + this.denomination20 * 20 && money % 50 > this.denomination20 * 20 && money % 20 > 0) return false;
        while (index >= 0){
            count[index] = money / denomination[index];
            money %= denomination[index];
            index--;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.printf("Номинал в %d руб. = %d шт.\n", denomination[i], count[i]);
        }
        return true;
    }
}
