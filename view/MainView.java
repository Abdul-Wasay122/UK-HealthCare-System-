package data;
import model.Referral;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;


public class ReferralRepository {
    private final String filePath;
    public ReferralRepository(String filePath) {
        this.filePath = filePath;
    }
    public List<Referral> loadRefferals() {
        List<Referral> refferals = new ArrayList<>();
        List<String[]> rows = CSVFileHandler.readCSV(filePath);
        for (String[] row : rows) {
            if (row[0].equalsIgnoreCase("referral_id")) {
                continue;
            }
            LocalDate createdDate = row[14].isBlank()? null : LocalDate.parse(row[14]);
            LocalDate lastUpdated = row[15].isBlank()? null : LocalDate.parse(row[15]);
            Referral refferal = new Referral(
                    row[0],
                    row[1],
                    row[2],
                    row[3],
                    row[4],
                    row[5],
                    LocalDate.parse(row[6]),
                    row[7],
                    row[8],
                    row[9],
                    row[10],
                    row[11],
                    row[12],
                    row[13],
                    createdDate,
                    lastUpdated

            );
            refferals.add(refferal);
        }
    return refferals;
    }
//not adding true was removing all the other referals for my own reminder this comment
    public void addReferral(Referral referral) {
        try(FileWriter writer = new FileWriter(filePath,true)){
            writer.write(referral.toCSV());
            writer.write(System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveReferrals(Referral referral) {
        try(FileWriter writer = new FileWriter(filePath,true)){
            writer.write(referral.toCSV()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updateStatus(String referralId, String newStatus) {
        List<Referral> referrals = loadRefferals();
        try(FileWriter writer = new FileWriter(filePath)){
            for (Referral r : referrals) {
                if (r.getReferralId().equals(referralId)) {
                    r.setStatus(newStatus);
                    r.setLastUpdated(LocalDate.now());
                }
                writer.write((r.toCSV()));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    public Referral getReferralById(String referralId) {
        for (Referral r : loadRefferals()) {
            if (r.getReferralId().equals(referralId)) {
                return r;
            }
        }
        return null;
    }
}
