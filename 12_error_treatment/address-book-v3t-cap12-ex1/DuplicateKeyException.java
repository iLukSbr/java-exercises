public class DuplicateKeyException extends Exception{
    // The duplicate key.
    private String key;

    /**
     * Store the details in error.
     * @param key The duplicate key.
     */
    public DuplicateKeyException(String key){
        super("The key " + key + " is a duplicate.");
        this.key = key;
    }
}