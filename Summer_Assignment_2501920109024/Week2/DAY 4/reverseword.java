class Solution {
    public String reverseWords(String s) {
        char []arr=s.toCharArray();
        int start=0;
        int end;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' ' || i==arr.length-1){
                end=i-1;
                 if(i==arr.length-1){
                end=arr.length-1;
            }
                while(start<end){
                    char temp=arr[end];
                    arr[end]=arr[start];
                    arr[start]=temp;
                    start++;
                    end--;
                }
                start=i+1;
            }
           

        }
        return new String(arr);
    }
}