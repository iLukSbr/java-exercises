/**
 * The Videogame class represents a Videogame object. Information about the 
 * Videogame is stored and can be retrieved. We assume that we only deal 
 * with movie Videogames at this stage.
 * 
 * @author Lucas Yukio Fukuda Matsumoto
 * @version 2023.10.09
 */
public class Videogame extends Item 
{
    private String theCompany;

    /**
     * Constructor for objects of class Videogame
     * @param theTitle The title of this Videogame.
     * @param time The maximum running time of the game.
     * @param theCompany The name of the company that created this Videogame.
     */
    public Videogame(String theTitle, String theCompany, int time)
    {
        super(theTitle, time);
        this.theCompany = theCompany;
    }

    /**
     * @return The name of the company that created this Videogame.
     */
    public String getCompany()
    {
        return theCompany;
    }
}
