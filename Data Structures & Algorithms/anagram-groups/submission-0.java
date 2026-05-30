class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(str);
        }
        return new ArrayList<>(result.values());
    }
}

/** first thought

index==============0-----1------2------3-----4------5====
String[] strs = ["act","pots","tops","cat","stop","hat"];

strs[0] = "act"  
strs[1] = "pots"
strs[2] = "tops"
strs[3] = "cat"
strs[4] = "stop"
strs[5] = "hat"

// alphabetical order
strs[0] = "act"    -> "act" 
strs[1] = "pots"   -> "opst" 
strs[2] = "tops"   -> "opst" 
strs[3] = "cat"    -> "act"
strs[4] = "stop"   -> "opst" 
strs[5] = "hat"    -> "aht"

// matching each words 
1. brute force O(n^2)
    for () {
        for () { if (str[i] == strs[j])}
   }

2. 1loop O(n)
    for () {if (strs[i] == strs[i-1])} // initial i = 1 

3. HashSet 順序なし・重複なし なので、グループ化できずだめ
   HashMap key->val こちらかな
    for (String str : strs)

4. return sublists
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

*/