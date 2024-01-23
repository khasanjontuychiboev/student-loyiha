package com.najot.dars5oy1dars.dto.responseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    private String firstName;

    public StudentDTO(String firstName) {
        this.firstName = firstName;
    }
}
