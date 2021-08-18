public class Offer03 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,2,5,3};
        int repeatNumber = findRepeatNumber(nums);
        int repeatNumber2 = findRepeatNumber2(nums);
        System.out.println(repeatNumber);
        System.out.println(repeatNumber2);
    }
    public static int findRepeatNumber(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i=0; i < nums.length; i++){
            if(++temp[nums[i]] > 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
//        0ms,原地哈希,判断当前值是否在正确的位置上
        for(int i=0;i<nums.length;i++) {
            while(nums[i]!=i) {
                if(nums[nums[i]]==nums[i])
                    return nums[i];
                else {
                    nums[i]=nums[i]^nums[nums[i]];
                    nums[nums[i]]=nums[i]^nums[nums[i]];
                    nums[i]=nums[i]^nums[nums[i]];
                }
            }
        }
        return -1;
    }


}
