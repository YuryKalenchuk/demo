
package data.entity;

import javax.persistence.*;
import java.util.List;

@Entity

public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Station> stationsOfTransport;
    public Transport() {
    }

    public Transport(String name, List<Station> stationsOfTransport) {
        this.name = name;
        this.stationsOfTransport = stationsOfTransport;
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

    public List<Station> getStationsOfTransport() {
        return stationsOfTransport;
    }

    public void setStationsOfTransport(List<Station> stationsOfTransport) {
        this.stationsOfTransport = stationsOfTransport;
    }
}
