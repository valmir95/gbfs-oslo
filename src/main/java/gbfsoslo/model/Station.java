package gbfsoslo.model;

/** Class representing fields from StationInformation and StationStatus to conform to the assignments requirements. **/
public class Station {
    private StationInformation stationInformation;
    private StationStatus stationStatus;

    public StationInformation getStationInformation() {
        return stationInformation;
    }

    public void setStationInformation(StationInformation stationInformation) {
        this.stationInformation = stationInformation;
    }

    public StationStatus getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(StationStatus stationStatus) {
        this.stationStatus = stationStatus;
    }
}
