public class Q55_Generic_Print_Array_Method {
    public static <T> void print(T[] arr) {
        for (T i : arr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        print(a);
    }
}