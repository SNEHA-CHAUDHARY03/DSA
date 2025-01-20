package theory_class;
public class rec_print_reverse {
    public static void print_num(int n){
        
        if(n == 0) return;
        System.out.println(n);
        print_num(n-1);
        
    }
    public static void main(String[] args) {
        int n =8;
        print_num(n);
    }
}
