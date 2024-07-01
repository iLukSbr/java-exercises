import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        int before = numberOfMembers();
        int after;
        System.out.println("Number of members before joining = " + before);
        members.add(member);
        after = numberOfMembers();
        System.out.println("Number of members after joining = " + after);
        if(after < before)
            System.out.println("Member join error.");
        else
            System.out.println("Member join success.");
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
}
