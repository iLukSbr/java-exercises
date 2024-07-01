/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2002.02.06
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
  
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice(Ticket ticket)
    {
        return ticket.getPrice();
    }
    
      /**
     * @Return The name of a ticket.
     */
    public String getName(Ticket ticket)
    {
        return ticket.getName();
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Use a positive amount: " +
                               amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket(Ticket ticket)
    {
        int amountLeftToPay = ticket.getPrice() - balance;
        if(amountLeftToPay <= 0) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# " + ticket.getName());
            System.out.println("# Ticket");
            System.out.println("# " + ticket.getPrice() + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total += ticket.getPrice();
            // Reduce the balance by the prince.
            balance -= ticket.getPrice();
        }
        else {
            System.out.println("You must insert at least: " +
                               amountLeftToPay + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
