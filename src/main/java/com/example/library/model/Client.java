package com.example.library.model;

public class Client {
     private Integer person_id;
     private String first_name;
     private String last_name;


     public Client(Integer person_id, String first_name, String last_name){
         this.person_id = person_id;
         this.first_name = first_name;
         this.last_name = last_name;

     }

     public Integer getId(){
         return person_id;
     }

     public void setId(Integer person_id){
         this.person_id = person_id;
     }

     public String getFirstName(){
         return first_name;
     }

     public void setFirstName(String first_name){
         this.first_name = first_name;
     }

    public String getLastName(){
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
}
