public class U1 extends Rocket{

    U1() {
        setCost(100);
        setWeight(10000);
        setCurrentWeight(10000);
        setMaxWeight(18000);
    }

    @Override
    public boolean launch() {
        return  0.05 * getEquationAlgo() <= Math.random() * 1;
    }

    @Override
    public boolean land() {
        return  0.01 * getEquationAlgo() <= Math.random() * 1;
    }
}