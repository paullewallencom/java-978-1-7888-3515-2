/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import monsters.Monster;
/**
 *
 * @author Arek
 */
public class Spider extends Monster
{
    void whatever()
    {
        this.getHitPoints();
        this.setHitPoints(60);
    }

    @Override
    protected void description() {
        
    }
}
