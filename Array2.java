import java.util.ArrayList;

public class Array2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(args[0]); ++i) {
            arr.add(i + 1);
        }
        for (int i = 0; i < Integer.parseInt(args[0]); ++i) {
            System.out.println(arr.get(i));
        }
    }
}