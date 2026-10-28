class Solution {
    class Node {
		int value;
		int row;
		int column;
		
		Node(int value, int row, int column) {
			this.value = value;
			this.row = row;
			this.column = column;
		}
    }
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.length;
		int m = matrix[0].length;
		
		PriorityQueue<Node> pq = new PriorityQueue<>( // min heap
		(a, b) -> Integer.compare(a.value, b.value)
		);
		
		for (int i = 0; i<n; i++) {
			pq.add(new Node(matrix[i][0], i, 0));
		}

        while(!pq.isEmpty()){
            Node curr = pq.poll();
            ans.add(curr.value);
            int row = curr.row;
            int col = curr.column;

            if(col < m-1){
                pq.add(new Node(matrix[row][col+1], row, col+1));
            }
        }

        int result = ans.get(k-1);
        return result;
    }
}