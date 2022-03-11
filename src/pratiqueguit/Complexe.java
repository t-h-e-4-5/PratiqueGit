/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratiqueguit;

/**
 *
 * @author Theophile
 */
public class Complexe {
    private double reel ;
    private double imaginaire ;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public Complexe() {
    }

    public double getReel() {
        return reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public double getImaginaire() {
        return imaginaire;
    }

    public void setImaginaire(double imaginaire) {
        this.imaginaire = imaginaire;
    }

    @Override
    public String toString() {
        return "Complexe{" + "reel=" + reel + ", imaginaire=" + imaginaire + '}';
    }
    
    public Complexe opposer ( Complexe z)
    {
        return new Complexe(-z.reel, -z.imaginaire) ;
    }
    public Complexe addition (Complexe z1, Complexe z2)
    {
        return new Complexe(z1.reel+z2.reel, z1.imaginaire+z2.imaginaire);
    }

            
}
