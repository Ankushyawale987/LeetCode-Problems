class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length,unSatisfiedCustomer=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1) unSatisfiedCustomer+=customers[i];
        }
       
        int maxUnSatisfiedCustomer=unSatisfiedCustomer;
        int l=0,h=minutes,startIndex=0,endIndex=minutes-1;
        while(h<n){
            if(grumpy[l]==1) unSatisfiedCustomer-=customers[l];
            if(grumpy[h]==1) unSatisfiedCustomer+=customers[h];
            if(unSatisfiedCustomer>maxUnSatisfiedCustomer){
                maxUnSatisfiedCustomer=unSatisfiedCustomer;
                startIndex=l+1;
                endIndex=h;
            }
            l++;
            h++;
             }

        int res=0;
        for(int i=0;i<n;i++){
            if(i>=startIndex && i<=endIndex) {
                res+=customers[i];
                continue; 
            }
            if(grumpy[i]==0) res+=customers[i];
        }
        return res;
    }
}