/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import creacional.ComprobanteElectronico;
import java.util.LinkedList;

/**
 *
 * @author asus
 */
public class Decorator {

    private ComprobanteElectronico c;

    public LinkedList<String> getDecorator() {
        return (LinkedList<String>) this.c.getDetallesEmisor();
    }

    public ComprobanteElectronico getComprobante() {
        return this.c;
    }
}
