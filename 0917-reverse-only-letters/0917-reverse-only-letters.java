class Solution {
    public String reverseOnlyLetters(String s) {
        int start=0;
        int end=s.length()-1;
        char c[]=s.toCharArray();
        char temp=' ';
     while (start < end) {
    if (!Character.isLetter(c[start])) {
        start++;
    } else if (!Character.isLetter(c[end])) {
        end--;
    } else {
         temp = c[start];
        c[start] = c[end];
        c[end] = temp;
        start++;
        end--;
    }
     }


        System.out.println(c);
         String str=new String(c);
         return str;
    }
  
}