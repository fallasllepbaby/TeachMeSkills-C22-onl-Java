
public class Main {
    public static void main(String[] args) {
        Vector2[] vector2s = Vector2.getVector2RandomArray(2);
        for (int i = 0; i < vector2s.length; i++) {
            System.out.println(vector2s[i]);
        }

        Vector3[] vector3s = Vector3.getVector3RandomArray(2);
        for (int i = 0; i < vector3s.length; i++) {
            System.out.println(vector3s[i]);
        }

        Vector[] vectors = Vector.getVectorRandomArray(2);
        for (int i = 0; i < vectors.length; i++) {
            System.out.println(vectors[i]);
        }

    }
}