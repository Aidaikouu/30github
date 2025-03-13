import java.util.*;

public class challange3 {
    static class Graph {
        private Map<Integer, List<Integer>> adjList = new HashMap<>();

        public void addVertex(int vertex) {
            adjList.putIfAbsent(vertex, new ArrayList<>());
        }

        public void addEdge(int vertex1, int vertex2) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1); // для неориентированного графа
        }

        public void BFS(int startVertex) {
            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            visited.add(startVertex);
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                int vertex = queue.poll();
                System.out.print(vertex + " ");

                for (int neighbor : adjList.get(vertex)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        
        System.out.print("Результат BFS начиная с вершины 1: ");
        graph.BFS(1);
    }
}
