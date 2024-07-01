public class Person
{
    private String name;
    private int age;

    public Person(String name)
    {
        this.name = name;
    }
    
    public void printInfo()
    {
        System.out.println("The name of this person is " + name + ".");
        System.out.println("The age of this person is " + age + ".");
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
}
