package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ILanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private ILanguageService iLanguageService;

	@Autowired
	public LanguagesController(ILanguageService iLanguageService) {
		super();
		this.iLanguageService = iLanguageService;
	}

	@GetMapping("/listall")
	public List<Language> listAll() {
		return iLanguageService.listAll();
	}

	@PostMapping("/add")
	public void addLanguage(@RequestBody Language language) throws Exception {
		iLanguageService.addLanguage(language);
	}

	@PostMapping("/delete/{id}")
	public void deleteLanguage(@PathVariable("id") int id) {
		iLanguageService.deleteLanguage(id);
	}

	@PostMapping("/update/{id}/{language}")
	public void updateLanguage(@PathVariable("id") int id, @PathVariable("language") String language) throws Exception {
		iLanguageService.updateLanguage(id, language);
	}

	@GetMapping("/getbyid/{id}")
	public String getLanguageById(@PathVariable("id") int id) {
		return iLanguageService.getLanguageById(id);
	}
	
	
	
	
}
