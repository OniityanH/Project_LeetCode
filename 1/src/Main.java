public class Main {
        public int[] twoSum(int[] nums, int target) {
            for (int x : nums){
                int i = 0;
                for (int y : nums){
                    int j = 0;
                    if (x+y == target){
                        return new int[]{i,j};
                    }
                        j++;
                }
                i++;
            }
            throw new IllegalArgumentException("no");
        }

        public void main(String [] args){
            twoSum([2,7,11,15], 9);
        }

}
