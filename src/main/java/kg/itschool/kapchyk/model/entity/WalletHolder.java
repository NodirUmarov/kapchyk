package kg.itschool.kapchyk.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_wallet_holders", schema = "wallet_details")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WalletHolder {

    @Id
    @Column(name = "email")
    String email;

    @Column(name = "first_name", nullable = false)
    String firstName;

    @Column(name = "last_name", nullable = false)
    String lastName;

    @Column(name = "patronymic")
    String patronymic;

    @ToString.Exclude
    @Cascade(CascadeType.SAVE_UPDATE)
    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "wallet_holder_id", referencedColumnName = "email")
    List<Wallet> wallets;

}
