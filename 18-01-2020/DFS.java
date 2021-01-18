import java.util.*;
class dfs
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertices;i++)
            adj.add(new ArrayList<Integer>());
        int edges = in.nextInt();
        for(int i=0;i<edges;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[vertices];

        check(0,result,visited,adj);

        for(Integer x:result)
            System.out.print(x+" ");
    }

    static void check(int x,ArrayList<Integer> result,boolean[] visited,ArrayList<ArrayList<Integer>> adj)
    {
        result.add(x);
        visited[x]=true;

        for(Integer neighbour:adj.get(x))
        {
            if(!visited[neighbour])
            {
                check(neighbour,result,visited,adj);
            }
        }
    }
}