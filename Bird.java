/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runanimal.runanimal;

/**
 *
 * @author Comlab
 */
class Bird extends Animal{
    @Override
    public void eat(){
        System.out.print("Birds love to eat seeds and ");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep for 10-12 hours a day.");
    }
    @Override
    public void makeSound(){
        System.out.println("Tweet Tweet");
    }
}
