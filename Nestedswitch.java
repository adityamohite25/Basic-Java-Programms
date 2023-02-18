import java.util.*;
public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Employee ID ");
        int empID = in.nextInt();
        System.out.print("Enter Department ");
        String department = in.next();
        switch(empID){
            case 1 -> System.out.println("Aditya Mohite ");
            case 2 -> System.out.println("Kunal Kushawah ");
            case 3 -> {
                System.out.println("Employee number 3 ");
                switch(department){
                    case "IT" -> System.out.println("IT department ");
                    case "Computer" -> System.out.println("Computer department ");
                    default -> System.out.println("No department Entered ");
                }

            }
            default -> System.out.println("Enter Correct Employee Id ");

        }
    }
}
