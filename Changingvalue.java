import java.util.Arrays;

public class Changingvalue {
    public static void main(String[] args) {
        int[] arr= {1,3,5,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    
    }

static void change(int[] nums){
    nums[0]=100;
}

}