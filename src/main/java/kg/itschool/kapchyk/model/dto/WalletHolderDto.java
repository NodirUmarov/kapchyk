package kg.itschool.kapchyk.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class WalletHolderDto implements Serializable {
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final List<WalletDto> wallets;
}
