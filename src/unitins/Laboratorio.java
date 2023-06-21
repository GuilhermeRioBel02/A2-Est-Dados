package unitins;

import java.util.List;

public class Laboratorio {

    public static void main(String[] args) {

        // Gerando os veículos

        Veiculo veiculo1 = new Veiculo("Volkswagen", "Jetta");
        Veiculo veiculo2 = new Veiculo("Ford", "Fusion");
        Veiculo veiculo3 = new Veiculo("Honda", "Civic");
        Veiculo veiculo4 = new Veiculo("Chevrolet", "Cruze");
        Veiculo veiculo5 = new Veiculo("Toyota", "Corolla");

        // Gerando os nós

        Node node1 = new Node(veiculo1);
        Node node2 = new Node(veiculo2);
        Node node3 = new Node(veiculo3);
        Node node4 = new Node(veiculo4);
        Node node5 = new Node(veiculo5);

        // Conectando os nós

        node1.addConcorrente(node2);
        node2.addConcorrente(node3);
        node3.addConcorrente(node4);
        node4.addConcorrente(node5);
        node5.addConcorrente(node1);

        // Gerando o grafo

        Graph graph = new Graph();
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        // Acessando os nós e os veículos do grafo

        List<Node> nodes = graph.getNodes();
        for (Node node : nodes) {
            Veiculo veiculo = node.getVeiculo();
            System.out.println("Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo());
            List<Node> concorrentes = node.getConcorrentes();
            for (Node concorrente : concorrentes) {
                Veiculo concorrenteVeiculo = concorrente.getVeiculo();
                System.out.println("Concorrente: " + concorrenteVeiculo.getMarca() + " " + concorrenteVeiculo.getModelo());
            }
            System.out.println();
        }
    }

}