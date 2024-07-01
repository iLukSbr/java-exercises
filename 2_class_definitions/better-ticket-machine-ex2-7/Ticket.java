
/**
    Tickets
 */
public class Ticket
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private int price;

    /**
     * Construtor para objetos da classe Ticket
     */
    public Ticket(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    
    //Retorna preço do ticket
    public int getPrice()
    {
        return price;
    }
    
    // Retorna nome do ticket
    public String getName()
    {
        return name;
    }
}
