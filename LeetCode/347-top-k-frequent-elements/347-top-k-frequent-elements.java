class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numofRepeate=new HashMap<>();
        List<Integer>[] bucketSort=new ArrayList[nums.length+1];
        int[] result=new int[k];
        for(int i=0;i<nums.length;i++){
            numofRepeate.merge(nums[i],1,(oldVal,newVal)->oldVal+newVal);
        }
        
        numofRepeate.forEach((key,value)->{
            if(bucketSort[value]!=null)
                bucketSort[value].add(key);
            else{
                List<Integer> l=new ArrayList<>();
                l.add(key);
                bucketSort[value]=l;
            }        
        });
        int pt=0;
        for(int i=bucketSort.length-1;i>=0 && pt<k;i--){
            if(bucketSort[i]!=null){
                List<Integer> currentList=bucketSort[i];
                for(int j=0;j<currentList.size();j++){
                    result[pt++]=currentList.get(j);
                }
            }
        }        
        return result;
    }
}