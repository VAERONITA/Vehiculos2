/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author VAERON
 */
public interface Persona {
    public boolean subirAVehiculo(Veiculo V);
    public boolean isConductor();
    public String getName();
    public boolean ChecarEstado();
    public boolean BajarVehiculo();
    public Veiculo getVehiculo();
    public void Conducir();
}
