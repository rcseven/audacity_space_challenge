public class Rocket implements SpaceShip{
    private int maxWeight;
    private int currentWeight;
    private int weight;
    private int cost;


    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getEquationAlgo() {
        return ((double) getCurrentWeight() - getWeight() / getMaxWeight() - getWeight());
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return currentWeight + item.getWeight() <= maxWeight;
    }
    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
    }


}
