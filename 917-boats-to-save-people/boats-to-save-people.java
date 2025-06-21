class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n= people.length;
        int i = 0, j=n-1, count= 0;
            
            java.util.Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
                count++;
            }
            else {
                j--;
                count++;
            }
        }
        return count;
    }
}