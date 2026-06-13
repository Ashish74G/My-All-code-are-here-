class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : nums)
            set.add(x);

        int miss = 1;

        while (set.contains(miss))
            miss++;

        return miss;
    }
}