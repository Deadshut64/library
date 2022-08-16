package com.example.library.model;

public class Client {
     private Integer person_id;
     private String first_name;
     private String last_name;


     public Client(Integer id, String firstname, String lastname){
         this.person_id = id;
         this.first_name = firstname;
         this.last_name = lastname;

     }

     public Integer getId(){
         return person_id;
     }

     public void setId(Integer id){
         this.person_id = id;
     }

     public String getFirstName(){
         return first_name;
     }

     public void setFirstName(String firstname){
         this.first_name = firstname;
     }

    public String getLastName(){
        return last_name;
    }

    public void setLastName(String lastname) {
        this.last_name = lastname;
    }
}
