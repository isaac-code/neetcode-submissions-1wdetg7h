class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //if k is 2 return the 2 most frequent numbers;

        //group the number based on frequency
        //sort the frequency in descending order
        //pick the first two element

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num: nums) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
        }

        List<Integer> values = new ArrayList<>(frequencyMap.values());
        Set<Integer> set = new HashSet<>();
        int[] result = new int[k];

        Collections.sort(values);

        for (int i = 0; i < k; i++) {
            set.add(values.get(values.size() - i - 1));
        }

        int counter = 0;
        for (Map.Entry<Integer, Integer> items: frequencyMap.entrySet()) {
            if (counter == k) {
                break;
            }
            if (set.contains(items.getValue())) {
                result[counter] = items.getKey();
                counter++;
            }
        }

        return result;
    }
}
