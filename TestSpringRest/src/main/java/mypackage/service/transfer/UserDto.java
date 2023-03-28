package mypackage.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mypackage.service.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private int id;
    private String login;

    public static UserDto from (User user) {
        return UserDto.builder()
                .id(user.getId())
                .login(user.getLogin())
                .build();
    }

    public static List<UserDto> from (List<User> users) {
        return users.stream().map(UserDto::from).collect(Collectors.toList());
    }
}
