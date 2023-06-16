import java.util.Scanner;

public class Arrays {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        //Input the array
        System.out.println("Enter Elements of array: ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Your Target: ");
        int element = sc.nextInt();
        Element obj = new Element();
        int index = obj.findIndexOfArray(nums, element);
        if(index == -1) {
            System.out.println("The element is not found.");
        } else {
            System.out.println("The index is: " + index);
        }
    }
}

class Element {
    public int findIndexOfArray(int nums[], int element) {
        int index = 0;
       while(index < nums.length) {
           if(nums[index] == element) {
               return index;
           }
           index++;
       }
        return -1;
    }
}
