/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final2020;

/**
 *
 * @author Thilmi.k
 */
public class AlienPack {

    private Alien[] aliens;

    //constructor 
    public AlienPack(int numAliens) {
        aliens = new Alien[numAliens];
    }

    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }

    public Alien[] getAliens() {
        return aliens;
    }
}
