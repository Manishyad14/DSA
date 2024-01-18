import java.util.*;

//here er are going to create the class graph with the adjacency listt------->>>

public class Graph{

    //the total no. of vertices in the graph-->>>
    int V;
  //this is the vertices of the graph data strucure

    //adjacency list for the graph-->>>
    LinkedList<Integer> adj[];

  //now  we are going to create the  constructor for the graph data structure-->>
    Graph(int v){
        V = v;
        adj = new LinkedList[v];//we can mention the size of the linked list for the bfs that we are looking for-->>
        for(int i = 0 ; i< v ; i++){
            //now we are going to push the elements that we get through the adjacncy list-->>
            adj[i]  = new LinkedList();
        }

    }


    //basic function to add the edges to the graph---->>>>>>
  void addEdge(int v , int w){
        adj[v].add(w); // this is fucntion to add edges in the directed graph-->>

  }


  void bfs(int s){  // this is the fucntion for the bfs traversal  with the given source S

         //here we are making the boolean visited array and marking all the section as unvisisted in the intialization point of the array
        boolean []visited = new boolean[V];//here we have to mention the size of the array


      //creating queue for bfs
      LinkedList<Integer> queue = new LinkedList<Integer>();


      //now mark the current (the source node) as the visisted and push it into the queue
      visited[s] = true ;
      queue.add(s);

         //Now we will check if the queue size is empty or not
      while (queue.size()!=0){
          //if the queue size is not equal to 0  then will deque the visisted node as we  have marked the source node as
          //visisted--->>
          s = queue.poll(); // this poll() function is used to release the first element from the linked list-->>
          System.out.println(s + "" );


          // now we will add the adjacent nodes-->>>
          //now we are going to make iterator
          Iterator<Integer> i = adj[s].listIterator();
          while(i.hasNext()){
              int n = i.next();
              if (!visited[n]) {
                  visited[n] = true;
                  queue.add(n);
              }


          }




      }







      //


  }
















    public static void main(String[] args) {




        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Breadth First Traversal "
                        + "(starting from vertex 2)");

        g.bfs(2);










    }
}
