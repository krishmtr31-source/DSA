class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = n - 2; i >= 0; i--) {
            s.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (s.size() != 0 && nums[i] >= s.peek()) {
                s.pop();
            }
            if (s.size() == 0) {
                res.add(-1);
            } else {
                res.add(s.peek());
            }
            s.push(nums[i]);
        }
        Collections.reverse(res);

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;

    }
}
