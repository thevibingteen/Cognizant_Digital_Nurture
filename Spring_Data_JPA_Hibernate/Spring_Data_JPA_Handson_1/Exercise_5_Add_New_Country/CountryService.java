import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {

        countryRepository.save(country);

    }

    @Transactional
    public Country findCountryByCode(String code)
            throws CountryNotFoundException {

        Optional<Country> result =
                countryRepository.findById(code);

        if (!result.isPresent()) {

            throw new CountryNotFoundException(
                    "Country not found");

        }

        return result.get();

    }

}