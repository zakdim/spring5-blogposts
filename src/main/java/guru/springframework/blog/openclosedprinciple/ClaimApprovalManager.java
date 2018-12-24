package guru.springframework.blog.openclosedprinciple;

/**
 * Created by dmitri on 2018-12-24
 */
public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor){
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
