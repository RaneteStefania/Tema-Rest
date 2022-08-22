package com.endava.temaRestpet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Pet {
    @NotNull(message = "Id cannot be null")
    private int id;
    @Size(min=2, max=15, message = "name must be equal or grater than 2 characters and less than 15 characters")
    private String name;
    private String category;
    private String photoUrl;
    private String tag;
    private String status;


}
