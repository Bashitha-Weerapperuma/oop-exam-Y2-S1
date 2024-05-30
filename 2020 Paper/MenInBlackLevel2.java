/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final2020;

/**
 *
 * @author Thilmi.k
 */
public class MenInBlackLevel2 extends MenInBlack{
    
     public MenInBlackLevel2(AlienPack alienpack) {
         super(alienpack);      
    }
    
    public void kill() {
        int sco=0;
        for (int i = 0; i < super.getAlienpack().getAliens().length; i++) {
            int random = (int)(Math.random()*10);          
            sco = sco + super.getAlienpack().getAliens()[i].getScore();
            if(random % 2 == 1){
                 sco = sco - 2;                     
            }
        }
       super.setScore(sco);
    } 
}
