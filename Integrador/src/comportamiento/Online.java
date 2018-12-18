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
public class Online implements Esquema {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        //el número de autorización es un nuevo código asignado por el SRI
        String codigoAsignado= String.valueOf(comprobante.getCodigo());
        comprobante.setNumeroAutorizacion(codigoAsignado);

    }
    
    
}
