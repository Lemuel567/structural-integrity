import java.util.Scanner;


public class question3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double structuralIntegrity = 100.0;
        int cycleCount = 0;
        final double FAILURE_THRESHOLD = 15.0;

        while(structuralIntegrity > FAILURE_THRESHOLD) {
            System.out.print("Enter pressure force for Cycle " + (cycleCount + 1));
            double pressure = input.nextDouble();


            if (pressure > 0) {
                structuralIntegrity -= pressure;
                if (pressure > 20.0) {

                    structuralIntegrity -= 5;

                }
                cycleCount++;
                System.out.println("The remaining integrity is: " + structuralIntegrity);

            }

            else{
                System.out.println("pressure can only be greater than 0");
            }
        }
            System.out.println("Material failed at cycle " + cycleCount);
            System.out.println("The final integrity level is: " + structuralIntegrity);



    }

}