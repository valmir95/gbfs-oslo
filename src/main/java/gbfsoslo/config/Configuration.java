package gbfsoslo.config;

import gbfsoslo.util.ResourceUtil;

public class Configuration {

    private ResourceUtil resourceUtil;
    private String defaultStationStatusUrl;
    private String defaultStationInformationUrl;

    public Configuration(String propertyFileName){
        this.resourceUtil = new ResourceUtil(propertyFileName);
        this.defaultStationInformationUrl = "https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json";
        this.defaultStationStatusUrl = "https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json";
    }

    public String getStationStatusUrl(){
        String url = this.resourceUtil.getPropertyFromPropertyFile("station_status");
        if(url == null){
            return this.defaultStationStatusUrl;
        }
        return url;
    }

    public String getStationInformationUrl(){
        String url = this.resourceUtil.getPropertyFromPropertyFile("station_information");
        if(url == null){
            return this.defaultStationInformationUrl;
        }
        return url;
    }
}
