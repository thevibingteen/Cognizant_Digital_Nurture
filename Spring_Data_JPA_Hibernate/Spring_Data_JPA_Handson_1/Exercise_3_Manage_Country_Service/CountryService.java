import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Optional<Country> getCountry(String code) {
        return repository.findById(code);
    }

    public void addCountry(Country country) {
        repository.save(country);
    }

    public void updateCountry(Country country) {
        repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

}