import javax.swing.*;

public class Vector {
    private int[] coordinates;

    private final String vectorInfo = "Это вектор для n-мерной системы координат";

    public Vector(int[] array) {
        this.coordinates = array;
    }

    public static Vector[] getVectorRandomArray(int n) {

        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            int[] anotherArray = new int[(int) Math.floor(Math.random() * 7)];
            for (int j = 0; j < anotherArray.length; j++) {
                anotherArray[j] = (int) Math.floor(Math.random() * 5);
            }
            vectors[i] = new Vector(anotherArray);
        }

        return vectors;
    }

    public double getLength() {
        int sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += Math.pow(coordinates[i], 2);
        }
        return Math.sqrt(sum);
    }

    public int multiplyScalar(Vector vector) {
        int sum = 0;
        for (int i = 0; i < coordinates.length; i++) {
            sum += this.coordinates[i] * vector.coordinates[i];
        }
        return sum;
    }

    public Vector sum(Vector vector) {
        int[] anotherArray = new int[coordinates.length];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = this.coordinates[i] + vector.coordinates[i];
        }
        return new Vector(anotherArray);
    }

    public Vector subtract(Vector vector) {
        int[] anotherArray = new int[coordinates.length];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = this.coordinates[i] - vector.coordinates[i];
        }
        return new Vector(anotherArray);
    }

    public boolean equals(Vector vector) {
        for (int i = 0; i < coordinates.length; i++) {
            if (this.coordinates[i] != vector.coordinates[i]) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String coordinates = "";
        for (int i = 0; i < this.coordinates.length; i++) {
            if (i == this.coordinates.length - 1) {
                coordinates = coordinates + this.coordinates[i];
            } else {
                coordinates = coordinates + this.coordinates[i] + "; ";
            }
        }
        return "Vector (" + coordinates + ")" + "\n" + vectorInfo + "\n";
    }
}
