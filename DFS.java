class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfs(0,visited,result,adj);
        return result;
    }
    
    void dfs(int x ,boolean[] visited,ArrayList<Integer> result,ArrayList<ArrayList<Integer>> adj)
    {
        if (!visited[x])
        {
            visited[x] = true;
            result.add(x);
        }
        
        for(Integer neighbour:adj.get(x))
            if (!visited[neighbour])
                dfs(neighbour,visited,result,adj);
    }
}