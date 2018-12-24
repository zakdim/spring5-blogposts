package guru.springframework.openclosedprinciple;

import org.junit.Test;

/**
 * Created by dmitri on 2018-12-24
 */
public class ClaimApprovalManagerTest {
    @Test
    public void testProcessClaim() throws Exception {
        HealthInsuranceSurveyor healthInsuranceSurveyor=new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1=new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor=new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2=new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}
