package com.najot.dars5oy1dars.dto.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTOAll {
    private String firstName;
    private String lastName;

    public StudentDTOAll(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
