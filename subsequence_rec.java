public class subsequence_rec {
    public static void print(String str, int idx, String ans){
        // Base case
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        // Include
        print(str, idx+1, ans+str.charAt(idx));
        //exclude
        print(str, idx+1, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        print(s, 0, " ");
    }
}
