public class array_printing_recursion {

    public static void arr_print(int[] arr, int i){
        if(i==arr.length) return;
        System.out.println(arr[i]);
        arr_print(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for( int i: arr){
            System.out.println(i);
        }
        System.out.println("----------------------------------------------------");
        int n = 0;
        arr_print(arr, n);

    }
}
