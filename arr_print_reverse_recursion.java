public class arr_print_reverse_recursion {
    public static void print_arr(int[] arr, int n){
        if(n==arr.length)return;
        print_arr(arr, n+1);
        System.out.println(arr[n]);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,4,65,4,34,346,4};
        int n = 0;
        print_arr(arr, n);
    }
}
