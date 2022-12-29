package practice.work.projectwork.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practice.work.projectwork.dto.ExchangeValueDto;
import practice.work.projectwork.dto.LimitDto;
import practice.work.projectwork.models.Limit;
import practice.work.projectwork.services.LimitService;

import java.util.List;

@RestController
@RequestMapping(value = "/limit")
public class LimitController {

    @Autowired
    private LimitService limitService;

    @GetMapping
    public List<LimitDto> getLimits(){
        return limitService.allLimits();
    }

    @PostMapping
    public LimitDto addLimit(@RequestBody LimitDto limitDto) {
        return limitService.addLimit(limitDto);
    }

    @GetMapping(value = "/{id}")
    public LimitDto getLimit(@PathVariable(name = "id") Long id) {
        return limitService.getLimit(id);
    }

    @PutMapping
    public LimitDto updateLimit(@RequestBody Limit limit) {
        return limitService.saveLimit(limit);
    }

    @DeleteMapping(value = "{id}")
    public void deleteLimit(@PathVariable(name = "id") Long id) {
        limitService.deleteLimit(id);
    }

}
