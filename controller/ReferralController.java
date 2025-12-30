package controller;
import model.Referral;

public class ReferralController {
    private ReferralManager referralManager;
    public ReferralController() {
        this.referralManager = ReferralManager.getInstance();
    }
    public void createReferral(Referral referral) {
        referralManager.processReferral(referral);
    }
    public void updateReferral(String referralId, String status) {
        referralManager.updateReferralStatus(referralId, status);
    }
}
