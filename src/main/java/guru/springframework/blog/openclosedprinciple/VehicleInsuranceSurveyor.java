package guru.springframework.blog.openclosedprinciple;

/**
 * Created by dmitri on 2018-12-24
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /*Logic to validate vehicle insurance claims*/
        return true;
    }
}
