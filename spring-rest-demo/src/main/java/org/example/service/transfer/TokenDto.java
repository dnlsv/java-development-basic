package org.example.service.transfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.service.models.Token;

@Data
@AllArgsConstructor
public class TokenDto {
    private String value;

    public static TokenDto from(Token token) {
        return new TokenDto(token.getValue());
    }


}
