public class Phone {
    private int number;
    private String model;
    private double weight;

    // Constructors

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){

    }

    // Methods

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }

    public void getInfo(){
        System.out.println("Номер: " + this.number);
        System.out.println("Модель телефона: " + this.model);
        System.out.println("Вес: " + this.weight);
        System.out.println();
    }

    // Method overloading

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " (" + number + ")");
    }

    // varargs method

    public void sendMessage(int... numbers) {
        for(int number : numbers){
            System.out.println("Номер: " + number);
        }
    }
}
