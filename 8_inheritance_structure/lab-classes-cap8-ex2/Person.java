public class Person
{
    // the person's full name
    private String name;
    // the student ID
    private String id;
    
    public Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

        /**
     * Return the full name of this person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this person.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the ID of this person.
     */
    public String getID()
    {
        return id;
    }
    
        /**
     * Return the login name of this person. The login name is a combination
     * of the first four characters of the person's name and the first three
     * characters of the person's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * Print the person's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + " (" + id + ")");
    }
}
