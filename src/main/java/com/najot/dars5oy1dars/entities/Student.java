package com.najot.dars5oy1dars.entities;

import com.najot.dars5oy1dars.dto.responseDTO.StudentDTO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String firstName;

    String lastName;

    public StudentDTO toDTO(){
        return new StudentDTO(this.firstName);
    }

}
