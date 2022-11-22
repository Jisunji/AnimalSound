/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runanimal.runanimal;

/**
 *
 * @author Comlab
 */
class Cat extends Animal {
    @Override
    public void eat(){
        System.out.print("Cats love to eat fish and ");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep for 12-16 hours a day.");
    }
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
