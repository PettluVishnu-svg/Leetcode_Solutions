class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] array=new int[nums.length];
        int i=0,j=1;
        int index=0;
        while(i<nums.length || j<nums.length){
            if(nums[index]>0){
                array[i]=nums[index++];
                i+=2;
            }else{
                array[j]=nums[index++];
                j+=2;
            }
        }
        return array;
    }
}