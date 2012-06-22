/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author VAERON
 */
public class Pasajero implements Persona{
    private boolean isinVehiculo;
    private Veiculo Coche;
    private String Name;


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
        return false;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
