
public class Main {
    public static void main(String[] args) {

        // Main task

        // Task 1

        Phone phone1 = new Phone(23008, "Samsung", 12.4);
        Phone phone2 = new Phone(54117, "Apple", 3.4);
        Phone phone3 = new Phone(12345, "Nokia", 5.4);

        // .getInfo()

        phone1.getInfo();
        phone2.getInfo();
        phone3.getInfo();

        // .receiveCall()

        phone1.receiveCall("Daniil");
        phone1.getNumber();
        phone2.receiveCall("Anna");
        phone2.getNumber();
        phone3.receiveCall("Irina");
        phone3.getNumber();
        System.out.println();

        // overloaded .receiveCall()

        phone1.receiveCall("Andrei", 12354);
        phone2.receiveCall("Anton", 55555);
        phone3.receiveCall("Egor", 34343);
        System.out.println();

        // varargs .sendMessage()

        phone1.sendMessage(23456);
        System.out.println();
        phone1.sendMessage(23232,21212,11111);

    }
}