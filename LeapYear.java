import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year ");
        n = in.nextInt();
        if(n%100==0 && n%400==0 || n%100!=0 && n%4==0){
            System.out.println("The Year is a leap year ");
        }
        else{
            System.out.println("The Year is not a leap year");
        }
    }
}
