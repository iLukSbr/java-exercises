public class Heater
{
    private int temperature;

    public Heater()
    {
        temperature = 15;
    }

    public void warmer()
    {
        temperature += 5;
    }
    
    public void cooler()
    {
        temperature -= 5;
    }
    
    public int getTemperature()
    {
        return temperature;
    }
}
