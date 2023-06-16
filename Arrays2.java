public class Arrays2 {
    public static void main(String []args) {
        //create a array
        int nums[] = {1, 2, 5, 7, 8};
        Sum obj = new Sum();
        int result = obj.sumOfArray(nums);
        System.out.println("Sum of array is: " + result);
    }
}

class Sum {
    public int sumOfArray(int nums[]) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}