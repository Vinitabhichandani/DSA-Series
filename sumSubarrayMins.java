
class Solution{

    public int sumSubarrayMins(int [] arr){

        int n = arr.length;
        int MOD = 1_000_000_007;

        int [] prevsmaller = new int [n];
        int [] nextsmaller = new int [n];

        Stack<Integer> s = new Stack<>();

        // pse prev smaller element

        for(int i=0; i<n; i++){

            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                prevsmaller[i] = -1;

            }else{

                prevsmaller[i] = s.peek();
            }
            s.push(i);
        }

        // clear the Stack for next loop
        s.clear();


        // next smaller element
        // nse

        for(int i= n-1; i>=0; i--){

            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            if(s.isEmpty()){

                nextsmaller[i] = n;
            }else{

                nextsmaller[i] = s.peek();
            }
            s.push(i);
        }
            
            // final anslong R = 0;
            long R = 0;
       for (int i = 0; i < n; i++) {
    long left = i - prevsmaller[i];
    long right = nextsmaller[i] - i;
    long contribution = ((long) arr[i] * left % MOD) * right % MOD;
    R = (R + contribution) % MOD;
}
       return (int) R;
        }
    }
