package gbfsoslo;

import gbfsoslo.config.Configuration;
import gbfsoslo.manager.StationManager;
import gbfsoslo.model.Station;

import java.util.List;

public class Main {

    public static void main(String[] args){
        Configuration configuration = new Configuration("config.properties");
        StationManager stationManager = new StationManager(configuration);
        List<Station> stations = stationManager.getStationsFromStatusAndInformation();
        for(Station station : stations){
            System.out.println(
                    "Station name: " + station.getStationInformation().getName()
                    + "\nAvailable docks: " + station.getStationStatus().getNumDocksAvailable()
                    + "\nAvailable bicycles: " + station.getStationStatus().getNumBikesAvailable()
                    + "\n"

            );
        }
    }
}
