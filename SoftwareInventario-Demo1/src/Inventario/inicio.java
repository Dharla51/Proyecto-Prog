package Inventario;

import Parcial.Taxista;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class inicio {
    public static void main(String[] args) {
        int Elegir;
        Taxista taxis;
        ArrayList<Taxista> listaTaxis = new ArrayList<>();
        
        do {
            taxis = new Taxista();
            taxis.setPlaca(JOptionPane.showInputDialog("DIGITE LA PLACA: "));
            taxis.setMarca(JOptionPane.showInputDialog("DIGITE LA MARCA: "));
            taxis.setModelo(JOptionPane.showInputDialog("DIGITE EL MODELO: "));
            taxis.setLicencia(JOptionPane.showInputDialog("DIGITA LA LICENCIA: "));
            taxis.setNombre(JOptionPane.showInputDialog("DIGITA EL NOMBRE: "));
            taxis.setApellido(JOptionPane.showInputDialog("DIGITA EL APELLIDO: "));
            taxis.setValorCarrera(Integer.parseInt(JOptionPane.showInputDialog("DIGITA EL VALOR DE LA CARRERA: ")));
            
            Elegir = JOptionPane.showConfirmDialog(null, "¿DESEAS REGRESAR AL MENU PRINCIPAL?",
                    "CONFIRMACION", JOptionPane.YES_NO_OPTION);
        } while (Elegir == JOptionPane.YES_NO_OPTION);
    }
}
