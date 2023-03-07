class CountSmaller {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        List<Integer> l = new ArrayList<>();

        for(int i=0;i<size;i++){
            int counter =0;
            for(int j=0;j<size;j++){

             if(nums[i]>nums[j])
               counter++;
            }
            l.add(counter);
        }

        for(int i=0;i<size;i++){
            nums[i] = l.get(i);
        }

      return nums;  
    }
}
