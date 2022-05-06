package kg.itschool.kapchyk.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_wallets", schema = "wallet_details")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Wallet extends AbstractPersistable<Long> {

    @Column(name = "wallet_name", nullable = false)
    String walletName;

    @Column(name = "description")
    String description;

    @Column(name = "funds", nullable = false)
    BigDecimal funds;

}