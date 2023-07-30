class findMinHeightTrees {
    
    //bfs performance + track min height trees
    //given all possible edges at i : a --> b can be at most 2 nodes
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    if (n == 1) return Collections.singletonList(0);
    //Set up for adjacency list where 0 -- n-1 nodes will contain all neighbors
    List<Set<Integer>> adj = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) adj.add(new HashSet<>());
    //do it for both since we have undirected graph
    for (int[] edge : edges) {
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
    }
    
    //there can only be 1 or 2 nodes that have minimum height. Perform bfs from all leaves and go to the top, closer and closer. remove that node
    List<Integer> leaves = new ArrayList<>();
    for (int i = 0; i < n; ++i)
        if (adj.get(i).size() == 1) leaves.add(i);

    while (n > 2) {
        n -= leaves.size(); //decrease leave size since u remove it from graph
        List<Integer> newLeaves = new ArrayList<>();
        for (int i : leaves) {
            int j = adj.get(i).iterator().next();
            adj.get(j).remove(i); //remove that specific leaf from that one
            if (adj.get(j).size() == 1) newLeaves.add(j);
        }
        leaves = newLeaves;
    }
    return leaves;
}

}