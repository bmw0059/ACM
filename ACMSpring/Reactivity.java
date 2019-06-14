import java.util.*;

//import Reactivity.Vertex;

// KATIO may be needed since about 500,000 edges are possible.

public class Reactivity {

 // public List<Vertex> ts(Graph g) {
    // TODO: Implement this.
    // Throw IllegalArgumentException if g can't be uniquely sorted.
    //throw new IllegalArgumentException();
 // }

  class Graph {

    private Map<Vertex, Set<Vertex>> list;
    private int edgeCount;

    public Graph() {
      this.list = new HashMap<>();
    }

    public Set<Vertex> adjacentTo(Vertex v) {
      return list.get(v);
    }

    public void addEdge(Vertex u, Vertex v) {
      if (list.get(u) == null) {
        list.put(u, new HashSet<Vertex>());
      }
      list.get(u).add(v);
      edgeCount++;
      u.increaseOutDegree();
      v.increaseInDegree();
    }

    public void removeEdge(Vertex u, Vertex v) {
      if (list.get(u) == null) {
        return;
      }
      if (list.get(v) == null) {
        return;
      }
      list.get(u).remove(v);
      edgeCount--;
      u.decreaseOutDegree();
      v.decreaseInDegree();
    }

    public int edgeCount() {
      return edgeCount;
    }

  }

  class Vertex {

    private int label;
    private int inDegree;
    private int outDegree;

    public Vertex(int label) {
      this.label = label;
      this.inDegree = 0;
      this.outDegree = 0;
    }

    public int label() {
      return label;
    }

    public void increaseInDegree() {
      inDegree++;
    }

    public void decreaseInDegree() {
      inDegree--;
    }

    public int inDegree() {
      return inDegree;
    }

    public void increaseOutDegree() {
      outDegree++;
    }

    public void decreaseOutDegree() {
      outDegree--;
    }

    public int outDegree() {
      return outDegree;
    }

  }

  public void solve() {
	  ArrayDeque<Vertex> naked = new ArrayDeque<Vertex>();
	  ArrayList<Vertex> result = new ArrayList<Vertex>();
    Scanner in = new Scanner(System.in);
    int metalCount = in.nextInt();
    int experimentCount = in.nextInt();
    Vertex[] metals = new Vertex[metalCount];
    Graph g = new Graph();
    for (int i = 0; i < metalCount; i++) {
      metals[i] = new Vertex(i);
    }
    for (int i = 0; i < experimentCount; i++) {
      int l1 = in.nextInt();
      int l2 = in.nextInt();
      g.addEdge(metals[l1], metals[l2]);
      if (metals[l1].inDegree() == 0 && !naked.contains(metals[l1])) {
    	  naked.push(metals[l1]);
      }
    }
    
    while (!naked.isEmpty()) {
    	Vertex current = naked.pop();
    	result.add(current);
    	for (Vertex m : g.adjacentTo(current)) {
    		g.removeEdge(current, m);
    		current.decreaseOutDegree();
    		if (m.inDegree() == 0) {
    			naked.push(m);
    		}
    	}
    	
    }
    
    try {
    	for (Vertex v : result) {
    		System.out.println(v.label());
    	}
      //for (Vertex v : ts(g)) {
       // System.out.println(v.label());
     // }
    } catch (IllegalArgumentException e) {
      System.out.println("back to the lab");
    }
  }

  public static void main(String[] args) {
    new Reactivity().solve();

  }

}
