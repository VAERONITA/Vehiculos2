/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author VAERON
 */
abstract public class Veiculo {
    public boolean cinturones;
    
    public Veiculo(){
        cinturones=false;
    }
    abstract public int GetLlantas();
    abstract public int GetPasajeros();
    abstract public String getNombre();
    abstract public void getdatos();
    abstract public void ponerCinturones();
    abstract public void quitarCinturones();
    abstract public boolean checarCinturones();
}
