package gbfsoslo.service;

import com.google.gson.Gson;
import gbfsoslo.config.Configuration;
import gbfsoslo.model.StationInformation;
import gbfsoslo.model.StationStatus;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/** Service class for station_service API**/

public class StationStatusService {

    private Configuration configuration;

    public StationStatusService(Configuration configuration){
        this.configuration = configuration;
    }

    //Queries endpoint and transforms json array response to List of objects
    public List<StationStatus> getAll(){
        HttpResponse<JsonNode> json = Unirest.get(this.configuration.getStationStatusUrl()).asJson();
        JSONObject object = json.getBody().getObject().getJSONObject("data");
        JSONArray jsonArray = object.getJSONArray("stations");
        Gson gson = new Gson();
        List<StationStatus> stationStatuses = new ArrayList<StationStatus>();

        for(int i = 0; i<jsonArray.length(); i++){
            StationStatus s = gson.fromJson(jsonArray.get(i).toString(), StationStatus.class);
            stationStatuses.add(s);
        }
        return stationStatuses;
    }
}
