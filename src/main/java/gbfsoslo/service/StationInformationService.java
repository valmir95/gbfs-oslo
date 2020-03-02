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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/** Service class for station_information API**/

public class StationInformationService {

    private Configuration configuration;

    public StationInformationService(Configuration configuration){
        this.configuration = configuration;
    }

    //Queries endpoint and transforms json array response to List of objects
    public List<StationInformation> getAll(){
        HttpResponse<JsonNode> json = Unirest.get(this.configuration.getStationInformationUrl()).asJson();
        JSONObject object = json.getBody().getObject().getJSONObject("data");
        JSONArray jsonArray = object.getJSONArray("stations");
        Gson gson = new Gson();
        List<StationInformation> stationInformations = new ArrayList<StationInformation>();

        for(int i = 0; i<jsonArray.length(); i++){
            StationInformation s = gson.fromJson(jsonArray.get(i).toString(), StationInformation.class);
            stationInformations.add(s);
        }
        return stationInformations;
    }
}
