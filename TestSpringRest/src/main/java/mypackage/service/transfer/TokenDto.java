package mypackage.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import mypackage.service.models.Token;

@Data
@AllArgsConstructor
public class TokenDto {
    private String value;

    public static TokenDto from(Token token) {
        return new TokenDto(token.getValue());
    }


}
