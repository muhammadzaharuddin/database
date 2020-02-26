package com.example.database;

import lombok.*;

@Getter @Setter @NoArgsConstructor @Data @Builder @AllArgsConstructor
public class Pet {

    private Integer id;
    private String type;
    private String gender;
    private Integer age;

    public Pet(int id, String type, String gender, int age) {
        this.id = id;
        this.type = type;
        this.gender = gender;
        this.age = age;
    }

    public Object getid() {
        return id;
    }

    public Object gettype() { return type; }

    public Object getgender() { return gender; }

    public Object getage() { return age; }

}