package unitins;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Veiculo veiculo;
    private List<Node> concorrentes;

    public Node(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.concorrentes = new ArrayList<>();
    }

    public void addConcorrente(Node concorrente) {
        concorrentes.add(concorrente);
    }

    public List<Node> getConcorrentes() {
        return concorrentes;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}