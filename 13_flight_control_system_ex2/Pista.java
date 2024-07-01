import java.util.ArrayList;

class Pista{
    private String identificador;
    private ArrayList<Aviao> avioesDecolando;
    private ArrayList<Aviao> avioesAterrissando;

    public Pista(String identificador){
        this.identificador = identificador;
        avioesDecolando = new ArrayList<>();
        avioesAterrissando = new ArrayList<>();
    }

    public void adicionarAviaoDecolando(Aviao aviao){
        avioesDecolando.add(aviao);
    }

    public void adicionarAviaoAterrissando(Aviao aviao){
        avioesAterrissando.add(aviao);
    }

    public boolean verificarDisponibilidade(){
        // Lógica para verificar se a pista está livre
        return true;
    }
    
    public boolean verificarIntegridade(){
        // Lógica para verificar se a pista está limpa, desobstruída e em boas condições
        return true;
    }
}

