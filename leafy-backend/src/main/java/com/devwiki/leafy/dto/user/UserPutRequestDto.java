package com.devwiki.leafy.dto.user;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class UserPutRequestDto {

    @NotNull
    private String name;
    @NotNull
    private String password;
}
