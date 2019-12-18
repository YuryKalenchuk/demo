package data.entity;
import javax.persistence.*;
import java.util.List;


@Entity

public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToMany(mappedBy = "stationsOfTransport", fetch = FetchType.EAGER)
    private List<Transport> transportsOfStation;
    public Station() {
    }

    public Station(String name, List<Transport> transportsOfStation) {
        this.name = name;
        this.transportsOfStation = transportsOfStation;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Transport> getTransportsOfStation() {
        return transportsOfStation;
    }

    public void setTransportsOfStation(List<Transport> transportsOfStation) {
        this.transportsOfStation = transportsOfStation;
    }
}
