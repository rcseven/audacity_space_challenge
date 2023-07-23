public class U1 extends Rocket{
    private int maxWeight = 18000;
    private int weight = 10000;
    private int cost = 100;

    public double chanceLaunchExplosion(int carried) {
        return (0.05 * (carried / maxWeight));
    }

    public double chanceLandingCrash(int carried) {
        return (0.01 * (carried / maxWeight));
    }
}