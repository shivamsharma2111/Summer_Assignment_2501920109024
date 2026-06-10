class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        if( s ==null || t==null){
            return false;
        }
        if(s.length()>t.length()){
            return false;
        }
                if (s.length() == 0) {
            return true;
        }
        for(int i=0; i<t.length(); i++){
            if(s.charAt(j)==t.charAt(i)){
                j++;
                if(j==s.length()){
                    return true;
                }
            }
        }
        return false;
    }
}