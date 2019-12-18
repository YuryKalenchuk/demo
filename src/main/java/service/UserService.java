package service;

import data.entity.Transport;
import data.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getByLogin(String login);

    List<Transport> getStationInteneary(String stationName);

    List<Transport> getTransportToStation(String startStationName, String finishStationName);


    boolean editProfile(User user);

    boolean sendFeedback(String busRegNum, String text, String userEmail);
}

