import java.util.ArrayList;

class ControladorTrafegoAereo{
    private String nome;
    private ArrayList<Aviao> autorizacoesDecolagem;
    private ArrayList<Aviao> autorizacoesAterrissagem;

    public ControladorTrafegoAereo(String nome){
        this.nome = nome;
        autorizacoesDecolagem = new ArrayList<>();
        autorizacoesAterrissagem = new ArrayList<>();
    }

    public void darPermissaoDecolagem(Aviao aviao){
        autorizacoesDecolagem.add(aviao);
    }

    public void darPermissaoAterrissagem(Aviao aviao){
        autorizacoesAterrissagem.add(aviao);
    }

    public void informarEspera(Aviao aviao){
        // Lógica para informar que o avião precisa esperar
    }
}