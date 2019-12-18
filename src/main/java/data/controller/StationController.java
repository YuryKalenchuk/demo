package data.controller;


import data.dto.StationDTO;
import data.entity.Station;
import data.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/station")
public class StationController {
    @Autowired
    private StationRepository repository;

    @GetMapping("/all")
    public List<StationDTO> getAllStation() {
        StationDTO stationDTO = new StationDTO();
        return stationDTO.getStationDTOList(repository.findAll());
        // String s = "https://habr.com/ru/post/432318/"
    }

    @PostMapping("/add")
    public Station addAlbum(@RequestBody Station station) {
        return repository.save(station);
    }

    @DeleteMapping("/del/{id}")
    public void delStation(@PathVariable long id) {
        repository.deleteById(id);
    }

    @PutMapping("/upd/{id}")
    public ResponseEntity<Object> updAlbum(@RequestBody Station station, @PathVariable long id) {
        Optional<Station> stationOptional = repository.findById(id);
        if (!stationOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        station.setId(id);
        repository.save(station);
        return ResponseEntity.noContent().build();
    }
}
