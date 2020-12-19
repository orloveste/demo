package practical.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import practical.project.demo.model.Session;
import practical.project.demo.model.Speaker;
import practical.project.demo.service.SessionService;
import practical.project.demo.service.SpeakerService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	SpeakerService speakerService;
	@Autowired
	SessionService sessionService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


//		this.sessionService.createSession(new Session("muu", "vaca", "zburatoare"));
//		this.sessionService.createSession(new Session("muu1", "vaca", "zburatoare"));
//		this.sessionService.createSession(new Session("muu2", "vaca2", "zburatoare"));
//		this.sessionService.createSession(new Session("muu3", "vaca3", "zburatoare"));
//
//		List<Speaker> speakerList = new ArrayList<>();
//		speakerList.add(new Speaker(1,"bou", "zburator"));//ceva nu se leaga
//
//		List<Session> sessionList = new ArrayList<>();
//		sessionList.add(new Session("muu", "vaca", "zburatoare"));// este la fel
//
//		this.speakerService.addSpeaker(new Speaker("buu", "rubu", "zuzu"));// nu merge
	}
}
