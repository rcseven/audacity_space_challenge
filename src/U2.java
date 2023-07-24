public class U2 extends Rocket{

    U2() {
        setCost(120);
        setWeight(18000);
        setCurrentWeight(18000);
        setMaxWeight(29000);
    }

    @Override
    public boolean launch() {
        return  0.04 * getEquationAlgo() <= Math.random() * 1;
    }

    @Override
    public boolean land() {
        return  0.08 * getEquationAlgo() <= Math.random() * 1;
    }
}
