public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String smokingStatus;
    private double policyHolderHeight;
    private double policyHolderWeight;

    public Policy() {}
    public Policy(int number, String provName, String firstName, String lastName, int age, String smokeStatus, double height, double weight) {
        policyNumber = number;
        providerName = provName;
        policyholderFirstName = firstName;
        policyHolderLastName = lastName;
        policyHolderAge = age;
        smokingStatus = smokeStatus;
        policyHolderHeight = height;
        policyHolderWeight = weight;
    }
    public int getPolicyNumber() {
        return policyNumber;
    }
    public String getProviderName() {
        return providerName;
    }
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }
    public String getSmokingStatus() {
        return smokingStatus;
    }
    public double getPolicyHolderHeight() {
        return policyHolderHeight;
    }
    public double getPolicyHolderWeight() {
        return policyHolderWeight;
    }
    public void setPolicyNumber(int number) {
        policyNumber = number;
    }
    public void setProviderName(String name) {
        providerName = name;
    }
    public void setPolicyholderFirstName(String firstName) {
        policyholderFirstName = firstName;
    }
    public void setPolicyHolderLastName(String lastName) {
        policyHolderLastName = lastName;
    }
    public void setPolicyHolderAge(int age) {
        policyHolderAge = age;
    }
    public void setSmokingStatus (String status) {
        smokingStatus = status;
    }
    public void setPolicyHolderHeight(double height) {
        policyHolderHeight = height;
    }
    public void setPolicyHolderWeight(double weight) {
        policyHolderWeight = weight;
    }
    public double policyHolderBMI() {
        final double weightMultiplier = 703.0;
        return (policyHolderWeight * weightMultiplier) / (policyHolderHeight * policyHolderHeight);
    }
    public double insurancePolicyFee() {
        final double BASE_FEE = 600.0;
        double finalFee = BASE_FEE;
        if (policyHolderAge > 50) {
            finalFee += 75;
        }
        if (smokingStatus.equals("smoker")) {
            finalFee += 100;
        }
        if (policyHolderBMI() > 35) {
            finalFee += (policyHolderBMI() - 35) * 20;
        }
        return finalFee;
    }
}