class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque <Integer> s=new ArrayDeque<>();
        int [] ans=new int[temperatures.length];
        for(int n=0; n<temperatures.length; n++){
            if(n==0){
                s.push(n);
            }
            else{
                if(temperatures[s.peek()]>=temperatures[n]){
                    s.push(n);
                }
                else{
                    while(!s.isEmpty() && temperatures[s.peek()]<temperatures[n]){
                    ans[s.peek()]=n-s.peek();
                    s.pop();
                    }
                    s.push(n);
                }
            }
        }
        return ans;
    }
}