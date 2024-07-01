
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private String meridiem;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 01:00 AM.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(13);
        hours.setValue(1);
        minutes = new NumberDisplay(60);
        meridiem = "AM";
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, String aux_meridiem)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        setTime(hour, minute, aux_meridiem);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
            if(hours.getValue() == 0) {
                hours.increment();
                flipMeridiem();
            }
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, String aux_meridiem)
    {
        if(hour == 0){
            hour = 12;
        }
        hours.setValue(hour);
        minutes.setValue(minute);
        meridiem = checkMeridiem(aux_meridiem);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + " " + getMeridiem();
    }
    
    public String getMeridiem()
    {
        return meridiem;
    }
    
    private void flipMeridiem()
    {
        if(meridiem == "AM"){
            meridiem = "PM";
        }
        else if(meridiem == "PM"){
            meridiem = "AM";
        }
    }
    
    private String checkMeridiem(String aux_meridiem)
    {
        if(aux_meridiem == "AM" || aux_meridiem == "PM"){
            return aux_meridiem;
        }
        else{
            return "ERROR";    
        }
    }
}
