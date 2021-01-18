import java.util.*;
class bfs
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
		boolean[] visited = new boolean[vertices];
		ArrayList<Integer> result = new ArrayList<>();
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(0);
		result.add(0);
		while(!queue.isEmpty())
		{
			int size = queue.size();
			int curr = queue.removeFirst();
			visited[curr]=true;
			for(Integer neighbour:adj.get(curr))
			{
				if (!visited[neighbour])
				{
					visited[neighbour] = true;
					queue.add(neighbour);
					result.add(neighbour);
				}
			}
		}

		for(Integer x:result)
			System.out.print(x+" ");
	}

	
}