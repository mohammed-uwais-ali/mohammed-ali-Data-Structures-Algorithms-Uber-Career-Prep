class cloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null){
            return null;
        }
        Map <Node, Node> oldToClonedNodes = new HashMap<>();
        return dfs(node, oldToClonedNodes);
    }
    
    public Node dfs(Node node, Map <Node, Node> oldToClonedNodes){
        if (oldToClonedNodes.containsKey(node)){
            return oldToClonedNodes.get(node);
        }

        Node copiedNode = new Node(node.val); //construct using val
        oldToClonedNodes.put(node, copiedNode);
        //make a copy of every neighbor 
        for (Node neighbor : node.neighbors){
            copiedNode.neighbors.add(dfs(neighbor, oldToClonedNodes));
        }

        return copiedNode;
    }
   
    class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
}