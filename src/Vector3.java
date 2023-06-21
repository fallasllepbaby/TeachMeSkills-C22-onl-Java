public class Vector3 {
    private int x;
    private int y;
    private int z;

    public final String vector3Info = "Это вектор для трехмерной системы координат";

    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3[] getVector3RandomArray(int n) {
        Vector3[] array = new Vector3[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector3((int) Math.floor(Math.random() * 3), (int) Math.floor(Math.random() * 3), (int) Math.floor(Math.random() * 3));
        }
        return array;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.y, 2));
    }

    public int multiplyScalar(Vector3 vector3) {
        return this.x * vector3.x + this.y * vector3.y + this.z * vector3.z;
    }

    public Vector3 sum(Vector3 vector3) {
        return new Vector3(this.x + vector3.x, this.y + vector3.y, this.z + vector3.z);
    }

    public Vector3 subtract(Vector3 vector3) {
        return new Vector3(this.x - vector3.x, this.y - vector3.y, this.z - vector3.z);
    }

    public boolean equals(Vector3 vector3) {
        return this.x == vector3.x && this.y == vector3.y && this.x == vector3.z;
    }

    @Override
    public String toString() {
        return "Vector (" + x + "; " + y + "; " + z + ")" + "\n" + vector3Info + "\n";
    }
}
