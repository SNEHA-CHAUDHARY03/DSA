package theory_class;
public class recursion_printing {
    public static void print_num(int n){
        if(n ==11) return;
        System.out.println(n);
        print_num(n+1);
        
        
    }
    public static void main(String[] args) {
        int x =1;
        print_num(x);

    }
}
