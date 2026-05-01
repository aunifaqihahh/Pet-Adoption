/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupasg;

/**
 *
 * @author aunif
 */
public class Cat extends Pet {
    private boolean indoor;
  
    public Cat(String name, int age, String breed, boolean indoor){
     super(name, breed, age);
     this.indoor = indoor;
    }
    
    @Override
    public void Sound(){
        System.out.println("Meow");
    }
    
    public boolean isIndoor(){
        return indoor;
    }
    
    public void setIndoor(boolean indoor){
        this.indoor = indoor;
    }
    
}
