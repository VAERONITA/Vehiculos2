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
public class Moto extends Veiculo{
    public int Pasajeros=2;
    public int Llantas=2;
    public String Name;

    public Moto(String Name) {
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
        JOptionPane.showMessageDialog(null, " Casco puesto ");
    }

    @Override
    public void quitarCinturones() {
        JOptionPane.showMessageDialog(null, " Casco retirado ");
    }

    @Override
    public boolean checarCinturones() {
        if(cinturones==true){
            JOptionPane.showMessageDialog(null, " Casco puesto ");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, " Casco retirado ");
            return false;
        }
    }
    
}
