package practice.work.projectwork.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.work.projectwork.dto.LimitDto;
import practice.work.projectwork.mapper.LimitMapper;
import practice.work.projectwork.models.Limit;
import practice.work.projectwork.repository.LimitRepository;
import practice.work.projectwork.services.LimitService;

import java.util.List;

@Service
public class LimitServiceImpl implements LimitService {

    @Autowired
    private LimitMapper limitMapper;

    @Autowired
    private LimitRepository limitRepository;

    @Override
    public LimitDto addLimit(LimitDto limitDto) {
        return limitMapper.toDto(limitRepository.save(limitMapper.toEntity(limitDto)));
    }

    @Override
    public LimitDto saveLimit(Limit limit) {
        Limit checkLimit = limitRepository.findById(limit.getId()).orElse(null);

        if (checkLimit != null) {
            if (limit.getSum() == 0) {
                checkLimit.setUsd("USD");
                checkLimit.setSum(0);
                checkLimit.setUtilDate(limit.getUtilDate());

                return limitMapper.toDto(limitRepository.save(checkLimit));
            } else {
                checkLimit.setUsd("USD");
                checkLimit.setSum(limit.getSum());
                checkLimit.setUtilDate(limit.getUtilDate());

                return limitMapper.toDto(limitRepository.save(checkLimit));
            }
        }

        return null;
    }

    @Override
    public LimitDto getLimit(Long id) {
        return limitMapper.toDto(limitRepository.findById(id).orElseThrow());
    }

    @Override
    public List<LimitDto> allLimits() {
        return limitMapper.toDtoList(limitRepository.findAll());
    }

    @Override
    public void deleteLimit(Long id) {
        limitRepository.deleteById(id);
    }
}
