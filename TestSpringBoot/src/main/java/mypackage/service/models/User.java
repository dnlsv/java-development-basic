package mypackage.service.models;

import lombok.*;
import mypackage.service.forms.UserForm;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;

    private String login;
    private String hashPassword;

    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Enumerated(value = EnumType.STRING)
    private State state;

    public static User from(UserForm userForm) {
        return User
                .builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .build();
    }
}
