
class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }
        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            char right = s.charAt(i);
            windowMap.put(right,
                    windowMap.getOrDefault(right, 0) + 1);
            if (i >= k) {
                char left = s.charAt(i - k);
                windowMap.put(left,
                        windowMap.get(left) - 1);
                if (windowMap.get(left) == 0) {
                    windowMap.remove(left);
                }
            }
            if (windowMap.equals(pMap)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
}
