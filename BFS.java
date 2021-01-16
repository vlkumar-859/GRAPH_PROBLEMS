class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        result.add(0);
        visited[0] = true;
        while(!queue.isEmpty())
        {
            int curr = queue.removeFirst();
            for(int neighbour:adj.get(curr))
            {
                if (!visited[neighbour])
                {
                    visited[neighbour] = true;
                    result.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        return result;
    }
}
