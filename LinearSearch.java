public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30, pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) { pos = i; break; }
        }

        System.out.println(pos == -1 ? "Not Found" : "Found at position " + (pos + 1));
    }
}
