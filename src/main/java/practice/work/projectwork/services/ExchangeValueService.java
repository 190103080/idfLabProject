package practice.work.projectwork.services;

import practice.work.projectwork.dto.ExchangeValueDto;
import practice.work.projectwork.models.ExchangeValue;

import java.util.List;

public interface ExchangeValueService {

    ExchangeValueDto addExchangeValue(ExchangeValueDto exchangeValueDto);
    ExchangeValueDto updateExchange(ExchangeValueDto exchangeValueDto);
    void deleteExchangeValue(Long id);
    List<ExchangeValueDto> getExchangeValues();
    ExchangeValueDto getExchangeValue(Long id);

}
