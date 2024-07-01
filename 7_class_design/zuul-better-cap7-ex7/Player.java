import java.util.ArrayList;

public class Player
{
    private Room currentRoom;
    private int maxWeight;
    private ArrayList<Item> inventory;

    public Player(Room startRoom, int maxWeight){
        this.currentRoom = startRoom;
        this.maxWeight = maxWeight;
        this.inventory = new ArrayList<Item>();
    }

    public void setCurrentRoom(Room room){
        this.currentRoom = room;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public boolean canCarry(Item item){
         return getInventoryWeight() + item.getWeight() <= maxWeight;
    }

    public void takeItem(Item item) {
        if(canCarry(item))
            inventory.add(item);
    }

    public void dropItem(Item item) {
        if (inventory.contains(item))
            inventory.remove(item);
    }

    public int getInventoryWeight(){
        int totalWeight = 0;
        for(Item i : inventory)
            totalWeight += i.getWeight();
        return totalWeight;
    }
}
