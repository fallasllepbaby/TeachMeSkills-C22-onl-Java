public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(String model, double price, RAM ram, HDD hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(String model, double price){
        this(model, price, new RAM(), new HDD());
    }

    public void getInformation(){
        System.out.println("Computer price - " + this.price);
        System.out.println("Computer model - " + this.model);
        System.out.println("RAM name - " + this.ram.getName());
        System.out.println("RAM size - " + this.ram.getSize());
        System.out.println("HDD name - " + this.hdd.getName());
        System.out.println("HDD size - " + this.hdd.getSize());
        System.out.println("HDD type - " + this.hdd.getType());
        System.out.println();
    }
}
