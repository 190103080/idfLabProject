package practice.work.projectwork.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.work.projectwork.dto.ExchangeValueDto;
import practice.work.projectwork.mapper.ExchangeValueMapper;
import practice.work.projectwork.repository.ExchangeValueRepository;
import practice.work.projectwork.services.ExchangeValueService;

import java.util.List;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

    @Autowired
    private ExchangeValueMapper exchangeValueMapper;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @Override
    public ExchangeValueDto addExchangeValue(ExchangeValueDto exchangeValueDto) {
        return exchangeValueMapper.toDto(exchangeValueRepository.save(exchangeValueMapper.toEntity(exchangeValueDto)));
    }

    @Override
    public ExchangeValueDto updateExchange(ExchangeValueDto exchangeValueDto) {
        return exchangeValueMapper.toDto(exchangeValueRepository.save(exchangeValueMapper.toEntity(exchangeValueDto)));
    }

    @Override
    public void deleteExchangeValue(Long id) {
        exchangeValueRepository.deleteById(id);
    }

    @Override
    public List<ExchangeValueDto> getExchangeValues() {
        return exchangeValueMapper.toDtoList(exchangeValueRepository.findAll());
    }

    @Override
    public ExchangeValueDto getExchangeValue(Long id) {
        return exchangeValueMapper.toDto(exchangeValueRepository.findById(id).orElse(null));
    }
}
