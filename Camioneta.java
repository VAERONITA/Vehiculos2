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
public class Camioneta extends Veiculo{
    public int Pasajeros=15;
    public int Llantas=4;
    public String Name;

    public Camioneta(String Name) {
        this.Name = Name;
    }

    @Override
    public int GetLlantas() {
        return this.Llantas;
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
        this.cinturones=true;
    }

    @Override
    public void quitarCinturones() {
        this.cinturones=false;
    }

    @Override
    public boolean checarCinturones(){
        if (cinturones==true){
            JOptionPane.showMessageDialog(null, "Cinturones abrochados");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Cinturones NO abrochados");
            return false;
        }
    }
    
}
