// Solution2 (Optimal) 2回目

class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str.length()).append('#').append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) { //文字列のながさ
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }
}

// T: O(m)
// S: O(m + n)