import java.util.ArrayList;

public class Box implements ToBeStored{

    public double maxWeight;
    public ArrayList<ToBeStored> things;

    public Box(Double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored thing : things){
            weight+=thing.weight();
        }
        return weight;
    }

    public void add(ToBeStored object) {
        if (object.weight() + weight() < maxWeight) {
            things.add(object);
        }
    }

    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
}
