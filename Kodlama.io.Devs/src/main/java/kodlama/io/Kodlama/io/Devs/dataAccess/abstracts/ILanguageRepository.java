package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface ILanguageRepository {
	List<Language> listAll();
	void addLanguage(Language language);
	void deleteLanguage(int id);
	void updateLanguage(int id, String language);
	String getLanguageById(int id);

}
