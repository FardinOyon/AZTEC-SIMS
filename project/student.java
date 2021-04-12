/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Bornali
 */
public class student {
    String name;
    String id;
    String courses;
    String status;
    
    public student(String id,String name, String courses, String status){
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.status = status;
    }
}
