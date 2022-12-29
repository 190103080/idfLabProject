package practice.work.projectwork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.work.projectwork.dto.ExchangeValueDto;
import practice.work.projectwork.services.ExchangeValueService;

import java.util.List;

@RestController
@RequestMapping(value = "/exchangevalue")
public class ExchangeValueContoller {

    @Autowired
    private ExchangeValueService exchangeValueService;

    @GetMapping
    public List<ExchangeValueDto> getExchangeValues(){
        return exchangeValueService.getExchangeValues();
    }

    @PostMapping
    public ExchangeValueDto addExchangeValue(@RequestBody ExchangeValueDto exchangeValueDto) {
        return exchangeValueService.addExchangeValue(exchangeValueDto);
    }

    @GetMapping(value = "/{id}")
    public ExchangeValueDto getExchangeValue(@PathVariable(name = "id") Long id) {
        return exchangeValueService.getExchangeValue(id);
    }

    @PutMapping
    public ExchangeValueDto updateExchangeValue(@RequestBody ExchangeValueDto exchangeValueDto) {
        return exchangeValueService.updateExchange(exchangeValueDto);
    }

    @DeleteMapping(value = "{id}")
    public void deleteExchangeValue(@PathVariable(name = "id") Long id) {
        exchangeValueService.deleteExchangeValue(id);
    }

}
