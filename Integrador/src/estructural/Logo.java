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
public class Logo extends Decorator {

    private ComprobanteElectronico c;

    public Logo(ComprobanteElectronico comprobante) {
        this.c = comprobante;
    }
}
