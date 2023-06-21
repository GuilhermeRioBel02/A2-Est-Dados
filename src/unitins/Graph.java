package unitins;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

}
