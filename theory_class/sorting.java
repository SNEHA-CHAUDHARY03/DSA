package theory_class;

public class sorting{
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min =i;
            for(int j=i; j<n;j++){
                if(arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]= temp;
        }
    }
    public static void main(String[] args){
        // Bubble sort
        // we Send the biggest element to the last 
        int[] arr = {4,5,3,2,1};
        // for(int i=1; i<arr.length;i++){
        //     for(int t = 0; t < arr.length-i; t++){
        //         if(arr[t]>arr[t+1]){
        //             int temp = arr[t];
        //             arr[t] = arr[t+1];
        //             arr[t+1] = temp;
        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Selection sort
        // we select the smallest index and swap 

        // for(int i=0;i<arr.length-1;i++){
        //     int idx = i;
        //     for(int j= i+1;j<arr.length;j++){
        //         if(arr[j]<arr[idx]){
        //             idx = j;
        //         }
        //     }
        //     int temp= arr[i];
        //     arr[i] = arr[idx]; 
        //     arr[idx] = temp;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }    
        //////////////////////////////////////////////////////////////////////////////////////////////
        /// Selection sort
        
        selectionSort(arr);
        // for( int i:arr){
        //     System.out.println(i);
        // }

        /////////////////////////////////////////////////////////////////////////////////////////////////
        /// binary search 
        int key=3;
        int start= 0;
        int end= arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]< key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            start++;
            end--;
        }
    }
}