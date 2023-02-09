package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix {
    int [][] matrix;
    ArrayList<Node> nodeContainer;

    public AdjacencyMatrix(int size){
        matrix = new int[size][size];
        nodeContainer = new ArrayList<>();
    }
    public void addNode (Node node){
        nodeContainer.add(node);
    }
    public void addEdge (int src, int dst){
        matrix[src][dst] = 1;
    }
    public boolean checkEdge (int src, int dst){
        if (matrix[src][dst] == 1){
            return true;
        }
        return false;
    }
    public void display(){
        System.out.print("  ");
        for (Node node: nodeContainer){
            System.out.print(node.data + " ");
        }
        for (int i = 0; i <= matrix.length-1; i++){
            System.out.print(nodeContainer.get(i).data + " ");
            for (int j = 0; j<= matrix[i].length-1; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public void depthFirstSearch (int src){
        boolean [] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }
    public void dfsHelper (int src, boolean[] visited){
        if (visited[src] == true){
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodeContainer.get(src).data + " = Visited");
        }
        for (int i = 0; i<matrix[src].length-1; i++){
            if (matrix[src][i] ==1){
                dfsHelper(i, visited);
            }
        }
    }
    public void breadthFirstSearch (int src){
        boolean [] visited = new boolean[matrix.length];

        Queue<Integer> queue = new LinkedList();
        visited[src] = true;
        queue.add(src);

        while (queue.size() != 0){
            src = queue.poll();
            System.out.println(nodeContainer.get(src).data + " = Visited");

            for (int i = 0; i<= matrix[src].length-1; i++){
                if (matrix[src][i] == 1 && visited[i] != true){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
