public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        // If no solution, return empty array
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum.twoSum(nums, target);
        
        // Output
        System.out.println("The test array to be worked on:");
            for (int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
        System.out.println();
        System.out.println();
        
        //Results:
        System.out.println("Which two integers sum will equal " + target + "?");
        System.out.println( nums[result[0]] + " " + nums[result[1]] );
        System.out.println();

        System.out.println("The positions in the array that equal the solution:");
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
