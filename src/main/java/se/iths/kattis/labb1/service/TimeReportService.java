package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.TimeReport;

import java.util.List;

@Service
public class TimeReportService {
    public List<TimeReport> getAllTimeReports() {
        return List.of(
                new TimeReport(1, "8h", "(2026-01-20)", "Johanna V."),
                new TimeReport(2, "6h", "(2026-01-27)", "Kattis C."),
                new TimeReport(3, "7h", "(2026-01-27)", "Maryam S.")
        );
    }
}
