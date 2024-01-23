package com.najot.dars5oy1dars.dto.requestDTO;

import com.najot.dars5oy1dars.entities.Student;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDTO {
    String firstName;

    String lastName;


    public Student toStudent(){
        return  Student
                .builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .build();
    }
}
