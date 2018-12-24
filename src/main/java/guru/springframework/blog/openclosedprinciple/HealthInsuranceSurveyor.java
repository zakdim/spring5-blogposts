package guru.springframework.openclosedprinciple;

/**
 * Created by dmitri on 2018-12-24
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
