import java.util.Arrays;
public class InsertAtStart {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 5;

        for (int i = 0; i < arr.length; i++)
            newArr[i + 1] = arr[i];

        System.out.println(Arrays.toString(newArr));
    }
}
