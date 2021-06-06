package com.avanade.dio.jwt.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
public class UserData implements Serializable {

    public String userName;
    public String password;


}
