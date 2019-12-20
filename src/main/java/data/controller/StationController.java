package data.controller;



import data.entity.Station;
import data.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller

public class StationController {
    @Autowired
    private StationRepository repository;

//    @GetMapping("/all")
//    public List<StationDTO> getAllStation() {
//        StationDTO stationDTO = new StationDTO();
//        return stationDTO.getStationDTOList(repository.findAll());
//        // String s = "https://habr.com/ru/post/432318/"
//    }
//
//    @PostMapping("/add")
//    public Station addAlbum(@RequestBody Station station) {
//        return repository.save(station);
//    }
//
//    @DeleteMapping("/del/{id}")
//    public void delStation(@PathVariable long id) {
//        repository.deleteById(id);
//    }
//
//    @PutMapping("/upd/{id}")
//    public ResponseEntity<Object> updAlbum(@RequestBody Station station, @PathVariable long id) {
//        Optional<Station> stationOptional = repository.findById(id);
//        if (!stationOptional.isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        station.setId(id);
//        repository.save(station);
//        return ResponseEntity.noContent().build();
//    }

    @GetMapping("/")
    public String geeting(Map<String, Object> model) {
         return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Station> stations = repository.findAll();
        model.put("stations", stations);
        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String text, @RequestParam String city, Map<String, Object> model) {
        Station station = new Station(text, city);
        repository.save(station);
        Iterable<Station> stations = repository.findAll();

        model.put("stations", stations);
        return "main";
    }
    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Station> stations;
        if (filter != null && !filter.isEmpty()) {
            stations = repository.findByCity(filter);
        } else {
            stations = repository.findAll();
        }
        model.put("messages", stations);
        return "main";
    }
}
