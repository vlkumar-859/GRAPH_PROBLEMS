import java.util.*;
class isCyclicDirected
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
			//adj.get(b).add(a);
		}
		
		boolean[] visited = new boolean[vertices];
		boolean[] parent = new boolean[vertices];
		if (check(0,adj,visited,parent))
			System.out.println("IS_CYCLIC");
		else
			System.out.println("IS_NOT_CYCLIC");
	}

	static boolean check(int x,ArrayList<ArrayList<Integer>> adj,boolean[] visited,boolean[] parent)
	{
		visited[x] = true;
		parent[x] = true;

		for(Integer neighbour:adj.get(x))
		{
			if (!visited[neighbour])
			{
				if (check(neighbour,adj,visited,parent))
					return true;
			}
			else if (parent[neighbour])
				return true;

		}
		parent[x] = false;

		return false;
	}
}