public class SistemaControleVoos{
    public static void main(String[] args) {
        // Exemplo de uso do sistema
        Aeroporto aeroporto = new Aeroporto();
        Pista pista1 = new Pista("Pista 1");
        aeroporto.adicionarPista(pista1);
        ControladorTrafegoAereo controlador1 = new ControladorTrafegoAereo("Controlador 1");
        aeroporto.adicionarControlador(controlador1);
        Aviao aviao1 = new Aviao("Voo123");
        Aviao aviao2 = new Aviao("Voo456");
        pista1.adicionarAviaoDecolando(aviao1);
        controlador1.darPermissaoDecolagem(aviao1);
        pista1.adicionarAviaoAterrissando(aviao2);
        controlador1.darPermissaoAterrissagem(aviao2);
        // Simular a operação do aeroporto
        aeroporto.operar();
    }
}