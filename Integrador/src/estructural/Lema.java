/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import creacional.ComprobanteElectronico;

/**
 *
 * @author asus
 */
public class Lema extends Decorator {

    private ComprobanteElectronico c;

    public Lema(ComprobanteElectronico comprobante) {
        this.c = comprobante;
    }
}
