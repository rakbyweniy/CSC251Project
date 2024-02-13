import java.util.Scanner;
public class Project_Dastan_Ibraimov {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's First Name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        double height = keyboard.nextDouble();
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        double weight = keyboard.nextDouble();

        Policy firstObject = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
        System.out.println("Policy Number: " + firstObject.getPolicyNumber());
        System.out.println("Provider Name: " + firstObject.getProviderName());
        System.out.println("Policyholder’s First Name: " + firstObject.getPolicyholderFirstName());
        System.out.println("Policyholder’s Last Name: " + firstObject.getPolicyHolderLastName());
        System.out.println("Policyholder’s Age: " + firstObject.getPolicyHolderAge());
        System.out.println("Policyholder’s Smoking Status: " + firstObject.getSmokingStatus());
        System.out.printf("Policyholder’s Height: %.2f\n inches", firstObject.getPolicyHolderHeight());
        System.out.printf("Policyholder’s Weight: %.2f\n pounds", firstObject.getPolicyHolderWeight());
        System.out.printf("Policyholder’s BMI: %.2f\n", firstObject.policyHolderBMI());
        System.out.printf("Policy Price: $%.2f\n", firstObject.insurancePolicyFee());

    }
}
