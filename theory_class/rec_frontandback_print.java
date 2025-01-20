package theory_class;

public class rec_frontandback_print {
    public static void printing(int n){
        if(n == 6) return;
            System.out.println(n);
            printing(n+1);
            System.out.println(n);
    }
    public static void main(String[] args) {
        int x = 1;
        printing(x);
    }
}
