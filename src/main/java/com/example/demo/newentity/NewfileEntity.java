 package com.example.demo.newentity;

  import jakarta.persistence.GenerationValue;
  import jakarta.persistence.GenerationType;
  import jakarta.persistence.Id;
  import jakarta.validation.constranints.Email;
  import jakarta.validation.constranints.NotBlank;
 
 
 
 public class NewfileEntity {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @column(name=unique)
     @NotBlank(message = "no blank allowed")
     @Email(message = "invalid format")
    private String email; 
 }