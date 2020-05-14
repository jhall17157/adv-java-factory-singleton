package singleton.calculator;

public enum EnumCalcTool {
    INSTANCE;
    private Client client;
    private static int totalBMICalculated = 0;
    private static int numberOfCalculations = 0;

    public static double calcBMI(Client client) {
        double bmi = client.getWeight() / Math.pow(client.getHeight(), 2);
        if (client.getMeasurementSystem() == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCalculations++;

        return bmi;
    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCalculations;
    }
}
