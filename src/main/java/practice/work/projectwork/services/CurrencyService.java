package practice.work.projectwork.services;

import practice.work.projectwork.models.Currency;

import java.util.List;

public interface CurrencyService {

    Currency addCurrency(Currency currency);
    Currency saveCurrency(Currency currency);
    List<Currency> getCurrencies();
    Currency getCurrency(Long id);
    void deleteCurrency(Long id);

}
