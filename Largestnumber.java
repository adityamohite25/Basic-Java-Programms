import java.util.*;
public class Largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
        
    }
    
}