class only0and1Matrix {

	public int[][] updateMatrix(int[][] mat) {
		// Queue to hold the co-ordinates
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 0) {
					// only those added to queue who has 0 value.
					queue.add(new int[] { i, j });
				} else {
					// else set value to -1 to indicate length needed to be updated here.
					mat[i][j] = -1;
				}
			}
		}

    //Queue has all 0s --> each level, you would increase the length
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int length = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			// hold level count
			length++; //increase the level
			// traverse level order wise
            //first iteration is bfs from all 0s
			while (size-- > 0) {
				int[] rc = queue.poll(); //current index 
				// for each element in queue try all 4 directions
				for (int[] dir : dirs) { // traverse through array of arrays
					int r = rc[0] + dir[0];
					int c = rc[1] + dir[1];
					// if out of range or -1 it means no need to process it.
					if (r < 0 || c < 0 || r >= mat.length || c >= mat[0].length || mat[r][c] != -1) {
						continue;
						//empties out, don't add to the queue when everything is filled out
					}
					// for -1, update the length that yo just found
					mat[r][c] = length;
					// add element to queue for processing
					queue.add(new int[] { r, c }); 
				}
			}
		}

		return mat;
	}

}