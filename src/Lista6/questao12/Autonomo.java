package Lista6.questao12;

import java.util.ArrayList;
import java.util.List;

public class Autonomo {


    private String nome;
    private String cpf;
    private List<Servicos> servicos = new ArrayList<>();

    public Autonomo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Servicos> getServicos() {
        return servicos;
    }

    public void adicionarServico(Servicos servico) {
        servicos.add(servico);
    }

}
