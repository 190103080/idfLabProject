package practice.work.projectwork.mapper;

import org.mapstruct.Mapper;
import practice.work.projectwork.dto.ExchangeValueDto;
import practice.work.projectwork.models.ExchangeValue;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExchangeValueMapper {

    ExchangeValueDto toDto(ExchangeValue exchangeValue);
    ExchangeValue toEntity(ExchangeValueDto exchangeValueDto);

    List<ExchangeValueDto> toDtoList(List<ExchangeValue> exchangeValueList);
    List<ExchangeValue> toEntityList(List<ExchangeValueDto> exchangeValueDtoList);

}
