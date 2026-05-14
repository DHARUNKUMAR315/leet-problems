class Solution {
    public boolean isGood(int[] nums) {
        int element=0;
        int count=0;
        for(int i:nums)
        {
            int temp=i;
            if(temp>element)
            {
                element=i;
            }
            count++;
        }
        if(element+1==count)
        {
              int[] freq = new int[element+1];
            for(int i:nums) freq[i]++;

            for(int i=1;i<element;i++){
                if(freq[i]!=1) return false;
            }
            if(freq[element]!=2) return false;
            return true;
        }
        return false;
    }
}