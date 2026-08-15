class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        List<Integer> arr = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            if (i < n) {
                if (s.size() == 0) {
                    arr.add(-1);
                } else if (s.size() > 0 && s.peek() > nums[index]) {
                    arr.add(s.peek());
                } else if (s.size() > 0 && s.peek() <= nums[index]) {
                    while (s.size() > 0 && s.peek() <= nums[index]) {
                        s.pop();
                    }

                    if (s.size() == 0) {
                        arr.add(-1);
                    } else {
                        arr.add(s.peek());
                    }
                }
            } else {
                while (s.size() > 0 && s.peek() <= nums[index]) {
                    s.pop();
                }
            }

            s.push(nums[index]);
        }

        Collections.reverse(arr);

        int[] result = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}