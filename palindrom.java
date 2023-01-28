import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        System.out.println(pal(a, b)); 

    }
    public static Boolean pal(String a, String b) {
        StringBuilder c = new StringBuilder(b).reverse();
        Boolean bol = a.equals(c.toString());
        return bol;
        
    }
        

        

       


}
        

