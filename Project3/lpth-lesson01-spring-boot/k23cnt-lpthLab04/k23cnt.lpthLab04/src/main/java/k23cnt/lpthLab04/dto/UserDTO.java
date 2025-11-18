package k23cnt.lpthLab04.dto;

import jakarta.persistence.Column; import jakarta.validation.constraints.*; import lombok.*;
import lombok.experimental. FieldDefaults;
import java.time.LocalDate;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults (level
        =
public class Users DTO {
    AccessLevel.PRIVATE)
    @NotBlank (message = "Username cannot be blank")
3 and 20 characters")
            = 20, message = "Username must be between
    @Size (min
            =
            3, max
            =
            true)
    @Column (unique
    String username;
    @NotBlank (message
            = "Password cannot be blank")
    @Size (min = 8, max = 30, message = "Password must be between 8 and 30 characters")
    @Pattern (regexp
            =
            message =
    and one number")
    String password;
    @NotBlank (message
    @Size (min =
            " (?=.* [0-9]) (?=.*[a-zA-Z]).{8,30}",
            "Password must contain at least one letter
=
        "Full name cannot be blank")
        2, max 50, message = "Full name must be
    between 2 and 50 characters")
    String fullName;
    @Past (message
            =
            "Birthday must be in the past")
    LocalDate birthDay;
    @Email (message "Email should be valid") @NotBlank (message = "Email cannot be blank") @Column (unique = true)
    String email;