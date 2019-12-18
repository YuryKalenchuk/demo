package service.impl;

import data.entity.Transport;
import data.entity.User;
import data.repository.FeedbackRepository;
import data.repository.StationRepository;
import data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private StationRepository stationRepository;
    private FeedbackRepository feedbackRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, StationRepository stationRepository, FeedbackRepository feedbackRepository){
        this.userRepository = userRepository;
        this.stationRepository = stationRepository;
        this.feedbackRepository = feedbackRepository;
    }


    @Override
    public User getByLogin(String login) {
        return null;
    }

    @Override
    public List<Transport> getStationInteneary(String stationName) {
        return null;
    }

    @Override
    public List<Transport> getTransportToStation(String startStationName, String finishStationName) {
        return null;
    }

    @Override
    public boolean editProfile(User user) {
        return false;
    }

    @Override
    public boolean sendFeedback(String busRegNum, String text, String userEmail) {
        return false;
    }
}
