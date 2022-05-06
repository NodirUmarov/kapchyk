package kg.itschool.kapchyk.model.mapper;

import kg.itschool.kapchyk.model.dto.WalletHolderDto;
import kg.itschool.kapchyk.model.entity.WalletHolder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletHolderMapper extends BaseMapper<WalletHolder, WalletHolderDto> {
    WalletHolderMapper INSTANCE = Mappers.getMapper(WalletHolderMapper.class);
}
