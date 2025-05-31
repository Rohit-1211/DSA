class Solution {
    public int countSubstrings(String s) {
        int count = 0;
for (int i = 0; i < s.length(); i++) {
    // Count palindromes with odd length (centered at i)
    count += countPalindromes(s, i, i);
    
    // Count palindromes with even length (centered between i and i+1)
    count += countPalindromes(s, i, i + 1);
}
return count;

    }
    private int countPalindromes(String s, int left,int right){

    int count = 0;
while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    count++;
    left--;
    right++;
}
return count;

}
}