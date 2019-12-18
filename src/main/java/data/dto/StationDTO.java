package data.dto;

import data.entity.Station;
import data.entity.Transport;

import java.util.ArrayList;
import java.util.List;

public class StationDTO {
    private long id;
    private String name;
    private List<Transport> transportsOfStation;

    public List<StationDTO> getStationDTOList(List<Station> stationList) {
        List<StationDTO> stationDTOList = new ArrayList<>();
        for (Station station : stationList) {
            StationDTO stationDTO = new StationDTO();
            stationDTO.setId(station.getId());
            stationDTO.setName(station.getName());
            stationDTO.setTransportsOfStation(station.getTransportsOfStation());
            stationDTOList.add(stationDTO);
        }
        return stationDTOList;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transport> getTransportsOfStation() {
        return transportsOfStation;
    }

    public void setTransportsOfStation(List<Transport> transportsOfStation) {
        this.transportsOfStation = transportsOfStation;
    }
}