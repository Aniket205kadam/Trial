import java.util.Scanner;

public class Array3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array(both): ");
        int size = sc.nextInt();

        int nums1[] = new int[size];
        int nums2[] = new int[size];

        System.out.println("Enter first array elements: ");
        for(int i = 0; i < size; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter second array of element: ");
        for(int i = 0; i < size; i++) {
            nums2[i] = sc.nextInt();
        }

        //addition
        for(int i = 0; i < size; i++) {
            nums1[i] += nums2[i];
        }

        System.out.print("Addition is: ");
        //enhances loop
        for(int n : nums1) {
            System.out.print(n + " ");
        }
    }
}
