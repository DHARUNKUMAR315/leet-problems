class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String m=s.replace("-","").toUpperCase();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=m.length()-1;i>=0;i--)
        {
            char c=m.charAt(i);
            sb.append(c);
            count++;
            if(count==k && i!=0)
            {
                sb.append("-");
                count=0;
            }
        }
        sb.reverse();
        return sb.toString();
    }
}