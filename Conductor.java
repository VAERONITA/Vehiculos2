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
public class Conductor implements Persona{

    private String Name;
    private boolean isinVehiculo;
    private Veiculo Coche;
    
    public Conductor(String N) {
        this.Name=N;
        this.isinVehiculo=false;
    }
    
    
    @Override
    public boolean subirAVehiculo(Veiculo V) {
        boolean r=false;
        if(this.ChecarEstado()==false){
        this.isinVehiculo=true;
        this.Coche=V;
        r=true;
        }
        return r;
    }

    @Override
    public boolean isConductor() {
        return true;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public boolean ChecarEstado() {
        return this.isinVehiculo;
    }

    @Override
    public boolean BajarVehiculo() {
        if(this.isinVehiculo){
            this.isinVehiculo=false;
        }
        return true;
    }

    @Override
    public Veiculo getVehiculo() {
        return Coche;
    }

    @Override
    public void Conducir() {
        String r="No tengo Vehiculo";
        if(this.isinVehiculo)
            r="look at me, I'm driving a "+Coche.getNombre();
        JOptionPane.showMessageDialog(null, r);
        
    }
    
}
