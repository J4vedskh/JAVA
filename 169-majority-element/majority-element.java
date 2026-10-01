class Solution {
    public int majorityElement(int[] nums) {

                int number=nums[0];
        int count = 0;

        for(int value : nums){

            if(count==0){
                number=value;
            }
            if(value==number){
                count++;
            }else{
                count--;
            }
           
        }
        return number;
    }
}