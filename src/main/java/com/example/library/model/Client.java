package com.example.library.model;

public class Client {
     private Integer id;
     private String firstname;
     private String lastname;


     public Client(Integer id, String firstname, String lastname){
         this.id = id;
         this.firstname = firstname;
         this.lastname = lastname;

     }

     public Integer getId(){
         return id;
     }

     public void setId(Integer id){
         this.id = id;
     }

     public String getFirstName(){
         return firstname;
     }

     public void setFirstName(String firstname){
         this.firstname = firstname;
     }

    public String getLastName(){
        return lastname;
    }

    public void setEmail(String email) {
        this.lastname = lastname;
    }
}
