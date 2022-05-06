package kg.itschool.kapchyk.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class WalletDto implements Serializable {
    private final Long id;
    private final String walletName;
    private final String description;
    private final BigDecimal funds;
}
