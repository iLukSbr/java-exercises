import java.util.HashMap;

public class MapTester
{
    private HashMap<String, String> phoneBook;
    
    public MapTester()
    {
        this.phoneBook = new HashMap<>();
    }

    public void enterNumber (String name, String number)
    {
       this.phoneBook.put(name, number);
    }
    
    public String lookupNumber (String name)
    {
        return this.phoneBook.get(name);
    }
}
