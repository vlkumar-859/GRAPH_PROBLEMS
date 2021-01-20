class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[V];
        for(int i = 0;i<V;i++)
            if (!visited[i] && check(i,adj,-1,visited))
                return true;
        return false;
    }
    
    boolean check(int x,ArrayList<ArrayList<Integer>> adj,int parent,boolean[] visited)
    {
        visited[x] = true;
        
        for(Integer neighbour:adj.get(x))
        {
            if (!visited[neighbour])
              {
                  if (check(neighbour,adj,x,visited))
                    return true;
              }
             else if (parent!=neighbour)
                    return true;
        }
        
        return false;
    }
    
}