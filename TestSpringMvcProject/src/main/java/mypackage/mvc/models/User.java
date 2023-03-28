package mypackage.mvc.models;

import lombok.*;
import mypackage.mvc.forms.UserForm;

import javax.persistence.*;
import java.util.List;

//@ToString
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
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "owner")
    private List<Car> cars;

    public static User from(UserForm userForm) {
        return User
                .builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .build();
    }
}
