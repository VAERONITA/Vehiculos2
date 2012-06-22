/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author VAERON
 */
public class Vocho extends Veiculo{
    private int Pasajeros=5;
    private int llantas=4;
    private String Name;
    
    public Vocho(String N){
        this.Name=N;
    }
    
    @Override
    public int GetLlantas() {
        return this.llantas;
    }

    @Override
    public int GetPasajeros() {
        return this.Pasajeros;
    }

    @Override
    public String getNombre() {
        return this.Name;
    }

    @Override
    public void getdatos() {
        JOptionPane.showMessageDialog(null, this.getNombre()+" puede llevar a "+this.GetPasajeros()+" pasajeros, gracias a sus "+this.GetLlantas()+" llantas");
    }

    @Override
    public void ponerCinturones() {
        this.cinturones = true;
    }

    @Override
    public void quitarCinturones() {
        this.cinturones=false;
    }

    @Override
    public boolean checarCinturones(){
        String R="Cinturone NO abrochados";
        boolean RR=false;
        if (cinturones==true){
            R="Cinturones abrochados";
            RR=true;
        }
        JOptionPane.showMessageDialog(null,R);
        return RR;
    }
    
}
