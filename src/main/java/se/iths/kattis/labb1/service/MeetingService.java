package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Meeting;

import java.util.List;

@Service
public class MeetingService {
    public List<Meeting> getAllMeetings() {
        return List.of(
                new Meeting(1, "Javaprogrammering I", "09:00 (2026-01-13)", "Sal 1"),
                new Meeting(2, "Utveckling mot Databaser", "13:00 (2026-01-20)", "Sal 3"),
                new Meeting(3, "Javaverktyg och byggmiljöer", "09:00 (2026-01-27)", "Sal 5")
        );
    }
}