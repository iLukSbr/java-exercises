import java.util.concurrent.ThreadLocalRandom;

public class RandomTester
{
    private int min;
    private int max;

    public RandomTester()
    {
        min = 0;
        max = 100;
    }

    public void printOneRandom()
    {
        System.out.println(ThreadLocalRandom.current().nextInt(min, max + 1));
    }
    
    public void printMultiRandom(int howMany)
    {
        for(int i=0; i<howMany; i++)
        {
            System.out.println(ThreadLocalRandom.current().nextInt(min, max + 1));
        }
    }
}
