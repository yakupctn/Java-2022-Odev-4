package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface ILanguageService {
	List<Language> listAll();
	void addLanguage(Language language) throws Exception;
	void deleteLanguage(int id);
	void updateLanguage(int id, String language) throws Exception;
	String getLanguageById(int id);
}
