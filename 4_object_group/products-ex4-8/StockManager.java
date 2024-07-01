import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        for(Product it : stock){
            if(it.getID() == item.getID()){
                System.out.println("Error: conflicting IDs found: " + item.getID());
                return;
            }
        }
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        return null;
    }
    
    public Product findProduct(String name){
        for(Product it : stock){
            if(name.equals(it.getName()))
                return it;
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        for(Product it : stock){
            if(it.getID() == id)
                return it.getQuantity();
        }
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printProductDetails()
    {
            for(Product it : stock){
                System.out.println(it.toString());
            }
    }
    
    public void printLowStockProducts(int number){
        for(Product it : stock){
            if(it.getQuantity() < number)
                System.out.println(it.toString());
        }
    }
}
