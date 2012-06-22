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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     boolean checador=false;
        
     Vocho pulga=new Vocho("Vochillo");
     Camion cham=new Camion("El Chamion");
     Camioneta tlo=new Camioneta("La Cheyenne");
     Moto motillo=new Moto("Motillo");
     /*
     pulga.getdatos();
     checador=pulga.checarCinturones();
     if (checador==false){
         pulga.ponerCinturones();
         checador=pulga.checarCinturones();
     }
     else
         JOptionPane.showConfirmDialog(null, "Los cinturones ya estan puestos ");
     
     cham.getdatos();
     checador=cham.checarCinturones();
     if (checador==false){
         cham.ponerCinturones();
         checador=cham.checarCinturones();
     }
     else
         JOptionPane.showConfirmDialog(null, "Los cinturones ya estan puestos ");
     
     tlo.getdatos();
     checador=tlo.checarCinturones();
     if (checador==false){
         tlo.ponerCinturones();
         checador=tlo.checarCinturones();
     }
     else
         JOptionPane.showConfirmDialog(null, "Los cinturones ya estan puestos ");
     
     motillo.getdatos();
     
     motillo.getdatos();
     checador=motillo.checarCinturones();
     if (checador==false){
         motillo.ponerCinturones();
         checador=motillo.checarCinturones();
     }
     else
         JOptionPane.showConfirmDialog(null, "Cascos ya estan puestos ");
     
     
     */
     Persona Juan=new Conductor("Juan");
     Juan.Conducir();
     
     Juan.subirAVehiculo(tlo);
     Juan.Conducir();
     
     
     
    }
}
