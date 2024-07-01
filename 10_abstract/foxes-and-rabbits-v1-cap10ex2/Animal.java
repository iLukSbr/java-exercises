public abstract class Animal
{
    // Whether it is is alive or not.
    private boolean alive;
    // It's position.
    private Location location;
    // The field occupied.
    private Field field;
    
    public Animal(Field theField)
    {
        field = theField;
        alive = true;
    }

    public Location getLocation(){
        return location;
    }
    
    protected void setLocation(Location newLocation){
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    public boolean isAlive(){
        return alive;
    }
    
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    public Field getField(){
        return field;
    }
}
