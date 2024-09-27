class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Number, Frequency>
        Map<Integer, Integer> freq = new HashMap<>();

        // count frequency for each number
        for (int x: nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        List<Pair<Integer, Integer>> sortedFrequencyPairs = new ArrayList<>();
        for (var entry : freq.entrySet()) {
            Pair<Integer, Integer> freqPair = new Pair<>(entry.getKey(), entry.getValue());
            sortedFrequencyPairs.add(freqPair);
        }

        // Sort the list
        Collections.sort(sortedFrequencyPairs, (fp1, fp2) -> {
            return fp2.getValue() - fp1.getValue();
        });

        // array to save most frequent results
        int[] results = new int[k];
        for (int i = 0; i < k; i++){
            results[i] = sortedFrequencyPairs.get(i).getKey();
        }
        return results;
    }
}