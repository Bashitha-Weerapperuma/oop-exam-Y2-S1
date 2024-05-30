/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final2020;

/**
 *
 * @author Thilmi.k
 */
public class MenInBlack {

    private int score;
    private AlienPack alienpack;

    public MenInBlack(AlienPack alienpack) {
        this.score = 0;
        this.alienpack = alienpack;
    }

    public AlienPack getAlienpack() {
        return alienpack;
    }

    public void setAlienpack(AlienPack alienpack) {
        this.alienpack = alienpack;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
       this.score =score;          
    }
    public void kill() {
        score = 0;
        for (int i = 0; i < alienpack.getAliens().length; i++) {
            score = score + alienpack.getAliens()[i].getScore();
            //setScore(score);
        }
    }
}