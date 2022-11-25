package test;

import MTPD_EyOP.Graph;

public class GraphTest {
    
    
    public static void main(String[] args) {
        //crear una instancia graph, constructor default
        System.out.println("Graph default constructor--------------");
        Graph defaulGraph = new Graph();
        
        System.out.println(defaulGraph.toString());
        
        defaulGraph.setVertex(3);
        System.out.println(defaulGraph.toString());
        
        defaulGraph.setEdge(0, 1);
        defaulGraph.setEdge(1, 2);
        defaulGraph.setEdge(0, 2);
        
        System.out.println(defaulGraph.toString());
        
        
        //crear una instancia graph, constructor vertices
        System.out.println("Graph default constructor--------------");
        Graph paramGraph = new Graph(5);
        
        System.out.println(paramGraph.toString());
        
    }
}
