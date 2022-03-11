class Solution {
    int[] parents;
    int[] size;
    int count;
    public int countComponents(int n, int[][] edges) {
        parents = new int[n];
        // size = new int[n];
        Arrays.setAll(parents, i->i);
        // Arrays.setAll(size, i->i);
        count = n;
        for(int[] e: edges) {
            int node1Parent = find(e[0]);
            int node2Parent = find(e[1]);
            
            if(node1Parent != node2Parent) {
                parents[node2Parent] = node1Parent;
                count--;
            }
        }
        return count;
    }
    
//     private void union(int node1, int node2) {
//             int node1Parent = find(node1);
//             int node2Parent = find(node2);
            
//             if(node1Parent != node2Parent) {
//                 parents[node2Parent] = node1Parent;
//                 count--;
//             }
//     }
    
    private int find(int curr) {
        int node = curr;
        while(node!=parents[node])
            node = parents[node];
        while(node!=curr) {
            int temp = parents[curr];
            parents[curr] = node;
            curr = temp;
        }
        return node;
    }
}