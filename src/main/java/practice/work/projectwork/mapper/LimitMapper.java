package practice.work.projectwork.mapper;

import org.mapstruct.Mapper;
import practice.work.projectwork.dto.LimitDto;
import practice.work.projectwork.models.Limit;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LimitMapper {

    LimitDto toDto(Limit limit);
    Limit toEntity(LimitDto limitDto);

    List<LimitDto> toDtoList(List<Limit> limitList);
    List<Limit> toEntityList(List<LimitDto> limitDtoList);

}
