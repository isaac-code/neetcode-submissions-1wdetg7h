class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstMap.containsKey(c)) {
                int count = firstMap.get(c);
                firstMap.put(c, count + 1);
            } else {
                firstMap.put(c, 1);
            }

        }

        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (firstMap.containsKey(c)) {
                int count = firstMap.get(c);
                if (count > 1) {
                    count--;
                    firstMap.put(c, count);
                } else {
                   firstMap.remove(c); 
                }
            }
        }

        return firstMap.size() == 0;
    }
}
