package pl.piomin.services.employee.mapper.impl;


import org.springframework.stereotype.Component;
import pl.piomin.services.employee.mapper.AbstractMapper;
import pl.piomin.services.employee.mapper.ICurrencyMapper;
import pl.piomin.services.employee.model.CurrencyModel;
import pl.piomin.services.employee.model.dto.CurrencyDto;

@Component
class CurrencyMapper extends AbstractMapper<CurrencyDto, CurrencyModel> implements ICurrencyMapper {
    @Override
    public CurrencyDto mapOut(CurrencyModel model) {
        if (model == null) {
            return null;
        }
        CurrencyDto dto = new CurrencyDto();
        dto.setId(model.getId());
        dto.setCode(model.getCode());
        dto.setName(model.getName());
        dto.setBbgTicker(model.getBbgTicker());
        return dto;
    }

    @Override
    public CurrencyModel mapIn(CurrencyDto dto) {
        if (dto == null) {
            return null;
        }
        CurrencyModel model = new CurrencyModel();
        model.setId(dto.getId());
        model.setCode(dto.getCode());
        model.setName(dto.getName());
        model.setBbgTicker(dto.getBbgTicker());
        return model;
    }

}
