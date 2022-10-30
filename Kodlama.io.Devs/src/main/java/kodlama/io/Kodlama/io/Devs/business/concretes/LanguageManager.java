package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ILanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements ILanguageService {
	private ILanguageRepository iLanguageRepository;

	@Autowired
	public LanguageManager(ILanguageRepository iLanguageRepository) {
		this.iLanguageRepository = iLanguageRepository;
	}
	
	
	@Override
	public List<Language> listAll() {
		return iLanguageRepository.listAll();
	}

	@Override
	public void addLanguage(Language language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		for(Language item : iLanguageRepository.listAll()) {
			if(item.getName().toLowerCase().equals(language.getName().toLowerCase())) {
				throw new Exception("Programlama ismi tekrar edemez.");
			}
		}
		
		iLanguageRepository.addLanguage(language);
	}

	@Override
	public void deleteLanguage(int id) {
		iLanguageRepository.deleteLanguage(id);
	}

	@Override
	public void updateLanguage(int id, String language) throws Exception {
		if(language.isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
		
		for(Language item : iLanguageRepository.listAll()) {
			if(item.getName().toLowerCase().equals(language.toLowerCase())) {
				throw new Exception("Programlama ismi tekrar edemez.");
			}
		}
		
		iLanguageRepository.updateLanguage(id, language);
	}

	@Override
	public String getLanguageById(int id) {
		return iLanguageRepository.getLanguageById(id);
	}

}
