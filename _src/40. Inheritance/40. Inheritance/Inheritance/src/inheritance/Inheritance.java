package inheritance;

import monsters.Monster;
import monsters.Skeleton;

public class Inheritance {

    public static void main(String[] args) {
     // MONSTERS - ZOMBIES - SKELETONS - hit points, attack, speed
        
//        Monster monster = new Monster(100, 10);
//        
//        monster.attack();
//        
//        System.out.println(monster.hitPoints);
//        System.out.println(monster.speed);
       
        Skeleton skeleton = new Skeleton(1000, 500);
        Skeleton skeleton2 = new Skeleton(1000, 500, "Bow");
        System.out.println(skeleton.hitPoints);
        skeleton.attack();
                
    }
    
}
