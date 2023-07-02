import java.io.*;
import java.nio.file.FileVisitResult;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Enter file path: "); // You should enter src/file.txt

            // Creating reader
            FileReader fr = new FileReader(scan().nextLine());
            BufferedReader reader = new BufferedReader(fr);

            // Creating valid writer
            File validContracts = new File("src/validContracts.txt");
            FileWriter vfw = new FileWriter(validContracts);
            BufferedWriter validWriter = new BufferedWriter(vfw);

            // Creating invalid writer
            File invalidContracts = new File("src/invalidContracts.txt");
            FileWriter ifw = new FileWriter(invalidContracts);
            BufferedWriter invalidWriter = new BufferedWriter(ifw);

            String contract = reader.readLine();

            while (contract != null) {

                if (contract.length() != 15) {
                    invalidWriter.write(contract + " - incorrect length!");
                    invalidWriter.newLine();
                } else if (!(contract.substring(0,6).equals("docnum") || contract.substring(0,8).equals("contract"))) {
                    invalidWriter.write(contract + " - should start with docnum or contract!");
                    invalidWriter.newLine();
                } else {
                    validWriter.write(contract);
                    validWriter.newLine();
                }
                contract = reader.readLine();
            }
            validWriter.close();
            invalidWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Scanner scan() {
        return new Scanner(System.in);
    }
}