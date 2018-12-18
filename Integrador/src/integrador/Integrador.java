/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import comportamiento.AutorizadorSRI;
import comportamiento.Offline;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FACTURACIÓN
        ComprobantesFactory f1 = new ComprobantesFactory();
        ComprobanteElectronico c = f1.getComprobante("FACTURA");

        c.setClaveAcceso("UTAX1960");
        c.setCodigo(1960);
        ArrayList<String> datos = new ArrayList<>();
        datos.add("utaacc");
        datos.add("comm");
        datos.add("artefacto");
        datos.add("mueble");
        c.setDetallesEmisor(datos);
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 8);
        c.setFecha(date);
        c.setNombreCliente("ThaiBb");
        AutorizadorSRI sri = new AutorizadorSRI(new Offline());
        sri.autorizar(c);
        
        
    }

}
