package gbfsoslo.model;

import com.google.gson.annotations.SerializedName;

/** Model class for station_status API**/
public class StationStatus {

    @SerializedName(value = "station_id")
    private int stationId;
    @SerializedName(value = "is_installed")
    private int isInstalled;
    @SerializedName(value = "is_renting")
    private int isRenting;
    @SerializedName(value = "is_returning")
    private int isReturning;
    @SerializedName(value = "last_reported")
    private int lastReported;
    @SerializedName(value = "num_bikes_available")
    private int numBikesAvailable;
    @SerializedName(value = "num_docks_available")
    private int numDocksAvailable;

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(int isInstalled) {
        this.isInstalled = isInstalled;
    }

    public int getIsRenting() {
        return isRenting;
    }

    public void setIsRenting(int isRenting) {
        this.isRenting = isRenting;
    }

    public int getLastReported() {
        return lastReported;
    }

    public void setLastReported(int lastReported) {
        this.lastReported = lastReported;
    }

    public int getNumBikesAvailable() {
        return numBikesAvailable;
    }

    public void setNumBikesAvailable(int numBikesAvailable) {
        this.numBikesAvailable = numBikesAvailable;
    }

    public int getNumDocksAvailable() {
        return numDocksAvailable;
    }

    public void setNumDocksAvailable(int numDocksAvailable) {
        this.numDocksAvailable = numDocksAvailable;
    }

    public int getIsReturning() {
        return isReturning;
    }

    public void setIsReturning(int isReturning) {
        this.isReturning = isReturning;
    }
}
