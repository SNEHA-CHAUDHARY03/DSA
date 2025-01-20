package theory_class;

public class max_min_arr_recursion {
    public static int min_max(int[] arr, int n, int max ){
        if(n==arr.length) return max;
        if(arr[n]> max){
            max = arr[n];
        }
       return  min_max(arr, n+1, max);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3,5,6,3,23,53};
        int max = Integer.MIN_VALUE;
        System.out.println(min_max(arr, 0, max));
    }
}