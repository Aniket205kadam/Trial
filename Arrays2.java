import java.util.Scanner;

public class Arrays2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        //Input size of array
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        //create a array
        int nums[] = new int[size];
        System.out.println("Enter a elements: ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Sum obj = new Sum();
        int result = obj.sumOfArray(nums);
        System.out.println("Sum of array is: " + result);
    }
}

class Sum {
    public int sumOfArray(int nums[]) {
        int result = 0;
        //Enhanced loop
        for (int n : nums) {
            result += n;
        }
        return result;
    }
}