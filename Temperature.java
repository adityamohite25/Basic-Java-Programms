import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temperature in Degree Celcius ");
        float tempc=in.nextFloat();
        float tempf=(tempc*9/5)+32;
        System.out.print("The Tempersture in FArhanite is "+tempf);


    }
}
