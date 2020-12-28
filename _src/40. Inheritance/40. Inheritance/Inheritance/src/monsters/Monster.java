/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author Arek
 */
public class Monster //base Class, super Class, parent class
{
    public double hitPoints;
    public double speed;
    
    public void attack()
    {
        /*
            HERE IS SCRIPT THAT ATTACKS PEOPLE
        */
        System.out.println("I'm attacking from Monster class");
    }
    public Monster()
    {
        System.out.println("I'm DEFAULT constructor from Monster class");
    }
    public Monster(double hitPoints, double speed)
    {
        this.hitPoints = hitPoints;
        this.speed = speed;
        System.out.println("I'm constructor from Monster class with 2 arguments");
    }    
}
