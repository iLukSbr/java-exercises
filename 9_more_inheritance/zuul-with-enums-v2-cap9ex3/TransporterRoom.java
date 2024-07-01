import java.util.Random;
import java.util.Set;

public class TransporterRoom extends Room {
    private Random random;
    
    public TransporterRoom(String description) {
        super(description);
        random = new Random();
    }
    
    // Sobrescreva o m�todo getExit para retornar uma sala aleat�ria.
    @Override
    public Room getExit(String direction) {
        // Obt�m uma lista de todas as sa�das dispon�veis na sala atual.
        Set<String> availableExits = exits.keySet();
        
        if (availableExits.size() > 0) {
            // Converte a lista de sa�das dispon�veis em um array.
            String[] exitsArray = availableExits.toArray(new String[availableExits.size()]);
            
            // Escolhe aleatoriamente uma sa�da da lista de sa�das dispon�veis.
            String randomExit = exitsArray[random.nextInt(exitsArray.length)];
            
            // Retorna a sala associada a essa sa�da.
            return exits.get(randomExit);
        } else {
            // Se n�o houver sa�das dispon�veis, retorne null.
            return null;
        }
    }
}