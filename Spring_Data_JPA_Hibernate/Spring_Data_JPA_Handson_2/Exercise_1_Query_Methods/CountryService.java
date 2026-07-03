import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public List<Country> searchCountry(String text) {

        return repository.findByNameContainingIgnoreCase(text);

    }

    public List<Country> getCountriesSorted() {

        return repository.findAllByOrderByNameAsc();

    }

    public List<Country> getCountriesStartingWith(String letter) {

        return repository.findByNameStartingWithIgnoreCase(letter);

    }

}