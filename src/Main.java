import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int u1BudgetCost = 0;
        int u2BudgetCost = 0;

        Simulation simulation = new Simulation();
        ArrayList<Item> phaseOne = new ArrayList<>();
        ArrayList<Item> phaseTwo = new ArrayList<>();

        phaseOne.addAll(simulation.loadItems("Phase-1.txt"));
        phaseOne.addAll(simulation.loadItems("Phase-2.txt"));

        ArrayList<Rocket> u1Rockets = simulation.loadU1(phaseOne);
        u1Rockets.addAll(simulation.loadU1(phaseTwo));

        ArrayList<Rocket> u2Rockets = simulation.loadU2(phaseOne);
        u2Rockets.addAll(simulation.loadU2(phaseTwo));

        u1BudgetCost += simulation.runSimulation(u1Rockets);
        u2BudgetCost += simulation.runSimulation(u2Rockets);

        System.out.println("U1 budget cost: " + u1BudgetCost);
        System.out.println("U2 budget cost: " + u2BudgetCost);
    }
}