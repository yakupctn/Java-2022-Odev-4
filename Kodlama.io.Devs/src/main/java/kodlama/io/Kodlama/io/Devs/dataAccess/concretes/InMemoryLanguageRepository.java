package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements ILanguageRepository{
	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1, "JAVA"));
		languages.add(new Language(2, "Javascript"));
		languages.add(new Language(3, "C#"));
		languages.add(new Language(4, "Swift"));
	}

	@Override
	public List<Language> listAll() {
		return languages;
	}

	@Override
	public void addLanguage(Language language) {
		languages.add(language);
	}

	@Override
	public void deleteLanguage(int id) {
		languages.remove(id-1);
	}

	@Override
	public void updateLanguage(int id, String language) {
		languages.set(id-1, new Language(id, language));
	}

	@Override
	public String getLanguageById(int id) {
		return languages.get(id-1).getName();
	}


}
