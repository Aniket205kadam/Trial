public class Arrays {
    public static void main(String []args) {
        int nums[] = {1, 2, 2, 4, 5, 6, 3};
        int element = 3;
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
