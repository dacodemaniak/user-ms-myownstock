package org.myownstock.user.users.dto;

import lombok.Getter;
import lombok.Setter;
import org.myownstock.user.users.Role;

import java.time.LocalDate;

public class UserAddRequestDto {
    @Getter @Setter
    private String lastname;
    @Getter @Setter
    private String firstname;
    @Getter @Setter
    private LocalDate birthdate;
    @Getter @Setter
    private Long role;

}
