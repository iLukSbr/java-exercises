import java.util.ArrayList;

public class Aviao{
    private String identificador;
    private String status;// Pode ser "decolando", "aterrissando", "em espera"
    private ArrayList<String> passageiros;// Lista de passageiros
    
        public Aviao(String identificador){
        this.identificador = identificador;
        this.status = "em espera";
    }

    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }
    
    public boolean verificarIntegridade(){
        // Lógica para verificar se o avião está em boas condições
        return true;
    }
}