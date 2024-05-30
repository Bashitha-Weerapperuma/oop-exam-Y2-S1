/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final2020;

/**
 *
 * @author Thilmi.k
 */
public class Main {

    public static void main(String args[]) {

        //creating a alien pack with 5 different alians
        AlienPack pack1 = new AlienPack(5);
        pack1.addAlien(new MarshmalloAlien(), 0);
        pack1.addAlien(new OgreAlien(), 1);
        pack1.addAlien(new OgreAlien(), 2);
        pack1.addAlien(new SnakeAlien(), 3);
        pack1.addAlien(new MarshmalloAlien(), 4);

        MenInBlack AgentK = new MenInBlack(pack1);
        AgentK.kill();
        System.out.println("Your score is " + AgentK.getScore());
        
        MenInBlackLevel2 AgentJ = new MenInBlackLevel2(pack1);
        AgentJ.kill();
        System.out.println("Your score is " + AgentJ.getScore());
    }
}
