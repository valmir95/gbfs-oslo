package gbfsoslo.manager;

import gbfsoslo.config.Configuration;
import gbfsoslo.model.Station;
import gbfsoslo.model.StationInformation;
import gbfsoslo.model.StationStatus;
import gbfsoslo.service.StationInformationService;
import gbfsoslo.service.StationStatusService;

import java.util.ArrayList;
import java.util.List;

public class StationManager {
    private Configuration configuration;
    /** Station Manager class which uses the result from station_status and station_information endpoints**/

    public StationManager(Configuration configuration){
        this.configuration = configuration;
    }

    //Queries both endpoints and use the result to create a list of Station objects
    public List<Station> getStationsFromStatusAndInformation(){
        List<Station> stations = new ArrayList<Station>();
        StationInformationService stationInformationService = new StationInformationService(this.configuration);
        StationStatusService stationStatusService = new StationStatusService(this.configuration);
        List<StationInformation> stationInformations = stationInformationService.getAll();
        List<StationStatus> stationStatuses = stationStatusService.getAll();

        /*
         * This for loop is a O(n^2) operation, this is because the documentation does not specify
         * or give us a guarantee that every station_information has a corresponding station_status.
         * When such a guarantee is given, the operation becomes O(n) and a lot more efficient
         * as we then would only need one loop.
         */
        for(StationInformation stationInformation : stationInformations){
            for(StationStatus stationStatus : stationStatuses){
                if(stationInformation.getStationId() == stationStatus.getStationId()){
                    Station station = new Station();
                    station.setStationInformation(stationInformation);
                    station.setStationStatus(stationStatus);
                    stations.add(station);
                }
            }
        }

        return stations;
    }
}
