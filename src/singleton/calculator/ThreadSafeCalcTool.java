package singleton.calculator;

public class ThreadSafeCalcTool extends CalcTool{
    private static ThreadSafeCalcTool instance = null;
    private Client client;
    private static int totalBMICalculated = 0;
    private static int numberOfCalculations = 0;

    private ThreadSafeCalcTool() {

    }


    public static ThreadSafeCalcTool getInstance() {

        if (instance == null) {
            synchronized (ThreadSafeCalcTool.class) {
                if (instance == null) {
                    instance = new ThreadSafeCalcTool();
                }
            }
        }

        return instance;
    }
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
