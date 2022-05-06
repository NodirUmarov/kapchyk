package kg.itschool.kapchyk.model.mapper;

import kg.itschool.kapchyk.model.dto.WalletDto;
import kg.itschool.kapchyk.model.entity.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WalletMapper extends BaseMapper<Wallet, WalletDto> {
    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);
}