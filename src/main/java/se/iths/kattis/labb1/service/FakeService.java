package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Fake;

import java.util.List;

@Service
public class FakeService {
    public List<Fake> getAllFake() {
        return List.of(
                new Fake("1", "2", "3"),
                new Fake("I", "II", "III"),
                new Fake("one", "two", "three")
        );
    }
}
