package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Registration;
import mk.ukim.finki.wp.lab.model.Workshop;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Workshop> workshops = null;
    public static List<Registration> registrations = null;

    @PostConstruct
    public void init() {
        workshops = new ArrayList<>();
        workshops.add(new Workshop("Spring Boot Basics", "Programming", 1500, 20));
        workshops.add(new Workshop("Intro to Docker", "DevOps", 1200, 15));
        workshops.add(new Workshop("UI/UX Fundamentals", "Design", 1000, 10));
        workshops.add(new Workshop("Machine Learning 101", "AI", 2500, 0));
        workshops.add(new Workshop("Git & GitHub", "Programming", 500, 30));
        workshops.add(new Workshop("Photography for Beginners", "Media", 800, 12));
        workshops.add(new Workshop("Video Editing", "Media", 1300, 8));
        workshops.add(new Workshop("Public Speaking", "Soft Skills", 600, 25));
        workshops.add(new Workshop("SQL for Everyone", "Databases", 900, 18));
        workshops.add(new Workshop("Cybersecurity Essentials", "Security", 2000, 5));

        registrations = new ArrayList<>();
    }
}
