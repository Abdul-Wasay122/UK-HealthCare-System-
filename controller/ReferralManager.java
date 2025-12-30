package controller;

import data.ReferralRepository;
import model.Referral;
import model.Notification;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
public class ReferralManager {
    private static ReferralManager instance;
    private ReferralRepository referralRepository;
    private Set<String> processedReferrals;

    private ReferralManager() {
        referralRepository = new ReferralRepository("data/referrals.csv");
        processedReferrals = new HashSet<>();
    }
public static ReferralManager getInstance(){
        if (instance == null){
        instance = new ReferralManager();
        }
        return instance;
}
public void processReferral(Referral referral){
        if (processedReferrals.contains((referral.getReferralId()))){
            return; // no duplicates
        }
        referralRepository.saveReferrals(referral);
        processedReferrals.add(referral.getReferralId());

        Notification notification = new Notification("N001",referral.getReferredToClinicianId(),"New Referral created" , referral.getReferralId(), LocalDateTime.now());
}
public void updateReferralStatus(String referralId, String status) {
        referralRepository.updateStatus(referralId,status);
}
}
