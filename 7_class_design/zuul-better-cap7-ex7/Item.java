public class Item
{
    private int weight;
    private String description;

    public Item(int weight, String description)
    {
        this.weight = weight;
        this.description = description;
    }

    public int getWeight()
    {
        return weight;
    }
    
    public String getDescription()
    {
        return description;
    }
}
