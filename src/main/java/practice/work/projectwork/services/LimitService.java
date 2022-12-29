package practice.work.projectwork.services;

import practice.work.projectwork.dto.LimitDto;
import practice.work.projectwork.models.Limit;

import java.util.List;

public interface LimitService {

    LimitDto addLimit(LimitDto limitDto);
    LimitDto saveLimit(Limit limit);
    LimitDto getLimit(Long id);
    List<LimitDto> allLimits();
    void deleteLimit(Long id);

}
