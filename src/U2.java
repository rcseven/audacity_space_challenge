public class U2 extends Rocket{
    private int maxWeight = 29000;
    private int weight = 18000;
    private int cost = 120;

    public double chanceLaunchExplosion(int carried) {
        return (0.04 * (carried / maxWeight));
    }

    public double chanceLandingCrash(int carried) {
        return (0.08 * (carried / maxWeight));
    }
}
