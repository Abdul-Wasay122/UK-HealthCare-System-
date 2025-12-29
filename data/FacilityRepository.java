package data;
import model.HealthCareFacility;
import java.util.List;
import java.util.ArrayList;
public class FacilityRepository {
    private final String filePath;
    public FacilityRepository(String filePath) {
        this.filePath = filePath;
    }
    public List<HealthCareFacility> loadFacilities() {
        List<HealthCareFacility> facilities = new ArrayList<>();
        List<String[]> rows = CSVFileHandler.readCSV(filePath);
        for (String[] row : rows) {
            HealthCareFacility facility = new HealthCareFacility(
                    row[0], // facility_id
                    row[1], // facility_name
                    row[2], // facility_type
                    row[3], // address
                    row[4], // postcode
                    row[5], // phone
                    row[6], // email
                    row[7], // opening hours
                    row[8], // manager
                    Integer.parseInt(row[9]), // capacity
                    row[10] // specialities
            );
            facilities.add(facility);
        }
return facilities;
    }
}
