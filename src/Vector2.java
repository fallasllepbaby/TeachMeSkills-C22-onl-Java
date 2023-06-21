public class Vector2 {
    private int x;
    private int y;
    public final String vector2Info = "Это вектор для двумерной системы координат";
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Vector2[] getVector2RandomArray(int n) {
        Vector2[] array = new Vector2[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Vector2((int) Math.floor(Math.random() * 3), (int) Math.floor(Math.random() * 3));
        }
        return array;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

    public int multiplyScalar(Vector2 vector2) {
        return this.x * vector2.x + this.y * vector2.y;
    }

    public Vector2 sum(Vector2 vector2) {
        return new Vector2(x + vector2.x,y + vector2.y);
    }

    public Vector2 subtract(Vector2 vector2) {
        return new Vector2(x - vector2.x, y - vector2.y);
    }

    public boolean equals(Vector2 vector2) {
        return this.x == vector2.x && this.y == vector2.y;
    }

    @Override
    public String toString() {
        return "Vector (" + x + "; " + y + ")" + "\n" + vector2Info + "\n";
    }
}
