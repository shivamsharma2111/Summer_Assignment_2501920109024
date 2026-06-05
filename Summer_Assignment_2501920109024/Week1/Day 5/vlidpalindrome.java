class Solution {
    public boolean isPalindrome(String s) {
        int last=s.length()-1;
        int i=0;
        if (s.length()==1 || s.length()==0){
            return true;
        }
        while(i<last){
        while(i < last && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }
        while(i < last && !Character.isLetterOrDigit(s.charAt(last))){
            last--;
        }
        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(last)))
        {return false;}
        i++;
        last--;
        }
        return true;
    }
}