public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for (int i = 0; i < Integer.parseInt(args[0]); ++i) {
            arr.at(i, i + 1);
        }
        for (int i = 0; i < arr.length(); ++i) {
            System.out.println(arr.at(i));
        }
    }
}