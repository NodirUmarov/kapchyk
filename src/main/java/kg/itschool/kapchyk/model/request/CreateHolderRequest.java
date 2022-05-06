package kg.itschool.kapchyk.model.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateHolderRequest {

    @Email
    String email;

    @NotBlank
    @Length(min = 2)
    String firstName;

    @NotBlank
    @Length(min = 2)
    String lastName;

    String patronymic;

}
