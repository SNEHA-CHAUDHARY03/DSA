package lab_class;
import java.util.Scanner;
class reverse_array{
    public static void swapping ( int i, int j){
        int temp = i;
        i = j;
        j = temp;

    }
    public static int[] reverse_arr(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            swapping( start, end );
            start++;
            end--;
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] rev_arr = reverse_arr(arr);
        for(int i: rev_arr){
            System.out.println(i);
        }
    }
}
