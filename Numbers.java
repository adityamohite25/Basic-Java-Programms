import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to print ");
        int n=in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    
}
