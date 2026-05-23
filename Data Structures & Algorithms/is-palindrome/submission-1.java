// brute force 
// same idea but organized

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        
        String originalString = newStr.toString();
        String reversedString = newStr.reverse().toString();
        
        return originalString.equals(reversedString);
    }
}

// Time: O(n)
// Space: O(n)
