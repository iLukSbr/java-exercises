public class Heater
{
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int min, int max)
    {
        this.min = min;
        this.max = max;
        temperature = max;
    }

    public void warmer()
    {
        temperature += increment;
        if(temperature > max){
            temperature = max;
        }
    }
    
    public void cooler()
    {
        temperature -= increment;
        if(temperature < min){
            temperature = min;
        }
    }
    
    public int getTemperature()
    {
        return temperature;
    }
    
    public void setIncrement(int increment)
    {
        if(increment < 0){
            increment *= -1;
        }
        this.increment = increment;
    }
}
