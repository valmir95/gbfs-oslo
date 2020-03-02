# GBFS - Oslo

GBFS Oslo is a maven project that queries endpoints from the gbfs API for oslo bysykkel. The project is done in Java, with the use of Maven to easily set-up an efficient structure with the flexibility of adding dependencies/build phases. 
## Installation

Use git to pull repository

```bash
git clone https://github.com/valmir95/gbfs-oslo.git
```

## The solution
The solution consists of multiple services which represent the operations of an endpoint, for example the ```station_information``` endpoint is rerpresented by the ```StationInformationService``` class and makes queries to that endpoint. The service-classes returns Java-objects which represents the response given from the API. This has the added benefit of making the response easier to manipulate and gives the code an overall better readability. As for representing the data, I decided to print the output directly in the console for now, while having the possibility of easily adding a front-end because of how the code was written and structured. 


## License
[MIT](https://choosealicense.com/licenses/mit/)