class Solution {
    private static char delimiter = '#';

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str: strs) {
            result.append(str.length());
            result.append(Character.toString(delimiter));
            result.append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != delimiter) {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            j++;
            result.add(str.substring(j, j + len));
            i = j + len;
        }
        return result;
    }
}

