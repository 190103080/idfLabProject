package practice.work.projectwork.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.work.projectwork.models.Currency;
import practice.work.projectwork.repository.CurrencyRepository;
import practice.work.projectwork.services.CurrencyService;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public Currency addCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Override
    public Currency saveCurrency(Currency currency) {
        Currency currencyCheck = currencyRepository.findById(currency.getId()).orElse(null);

        if (currencyCheck != null) {
            currencyCheck.setKzt(currency.getKzt());
            currencyCheck.setRub(currency.getRub());
            currencyCheck.setUsd(currency.getUsd());

            return currencyRepository.save(currencyCheck);
        }

        return null;
    }

    @Override
    public List<Currency> getCurrencies() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency getCurrency(Long id) {
        return currencyRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteCurrency(Long id) {
        currencyRepository.deleteById(id);
    }
}
