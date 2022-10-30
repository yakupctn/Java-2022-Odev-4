package kodlama.io.Kodlama.io.Devs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.Kodlama.io.Devs.business.concretes.LanguageManager;
import kodlama.io.Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
