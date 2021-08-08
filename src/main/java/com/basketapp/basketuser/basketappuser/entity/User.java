package com.basketapp.basketuser.basketappuser.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String mail;
    private String name;
    private String adress;
}
