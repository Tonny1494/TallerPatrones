/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

import creacional.ComprobanteElectronico;

/**
 *
 * @author asus
 */
public class Offline implements Esquema {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setNumeroAutorizacion(comprobante.getClaveAcceso());
        //debido a que según el codigo de acceso es el número de autorización es igual a la clave de acceso.
    }
    
}
