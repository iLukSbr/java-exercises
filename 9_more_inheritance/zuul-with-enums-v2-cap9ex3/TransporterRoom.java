import java.util.Random;
import java.util.Set;

public class TransporterRoom extends Room {
    private Random random;
    
    public TransporterRoom(String description) {
        super(description);
        random = new Random();
    }
    
    // Sobrescreva o método getExit para retornar uma sala aleatória.
    @Override
    public Room getExit(String direction) {
        // Obtém uma lista de todas as saídas disponíveis na sala atual.
        Set<String> availableExits = exits.keySet();
        
        if (availableExits.size() > 0) {
            // Converte a lista de saídas disponíveis em um array.
            String[] exitsArray = availableExits.toArray(new String[availableExits.size()]);
            
            // Escolhe aleatoriamente uma saída da lista de saídas disponíveis.
            String randomExit = exitsArray[random.nextInt(exitsArray.length)];
            
            // Retorna a sala associada a essa saída.
            return exits.get(randomExit);
        } else {
            // Se não houver saídas disponíveis, retorne null.
            return null;
        }
    }
}