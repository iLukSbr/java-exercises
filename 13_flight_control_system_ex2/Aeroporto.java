import java.util.ArrayList;

class Aeroporto{
    private ArrayList<Pista> pistas;
    private ArrayList<ControladorTrafegoAereo> controladores;

    public Aeroporto(){
        pistas = new ArrayList<>();
        controladores = new ArrayList<>();
    }

    public void adicionarPista(Pista pista){
        pistas.add(pista);
    }

    public void adicionarControlador(ControladorTrafegoAereo controlador){
        controladores.add(controlador);
    }

    public void operar(){
        // Lógica de simulação do funcionamento do aeroporto
    }
}