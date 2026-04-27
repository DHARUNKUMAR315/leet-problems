class Solution {
    public int jump(int[] arr) {
        int jumps=0;
        int currentend=0;
        int farthest=0;
        for(int i=0;i<arr.length-1;i++)
        {
            farthest=Math.max(farthest,i+arr[i]);
            if(i==currentend){
                jumps++;
                currentend=farthest;

            }
        
        }
        return jumps;

}
}