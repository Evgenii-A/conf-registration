package first.convert;


import com.fasterxml.jackson.databind.ObjectMapper;

import first.dto.SectionDTO;
import first.entity.SectionEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SectionConverter implements Converter<SectionDTO, SectionEntity> {

    private ObjectMapper objectMapper;

    public SectionConverter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public SectionEntity convert(SectionDTO sectionDTO) {
        return objectMapper.convertValue(sectionDTO, SectionEntity.class);
    }
}
