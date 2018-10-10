/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.cadenas.telcel;

/**
 *
 * @author consultor006
 */
public class CadenasMorales {

    public static void main(String[] args) {
        String cadenaMoralIn = "<Solicitud-BCServices>\n"
                + "  <solicitudReporte>\n"
                + "    <encabezado>\n"
                + "      <idLote>0000</idLote>\n"
                + "      <codigoInstitucion>0001</codigoInstitucion>\n"
                + "      <usuario>9996USUARIO</usuario>\n"
                + "      <contrasena>CONTRASENA</contrasena>\n"
                + "      <idTransaccion>BPM18040511104297336</idTransaccion>\n"
                + "      <folio>BPM18040511104297336</folio>\n"
                + "      <sistema>SISACT</sistema>\n"
                + "      <historico>180</historico>\n"
                + "      <region>9</region>\n"
                + "      <fechaPeticion>05-04-2018</fechaPeticion>\n"
                + "      <codigoLenguaje>ES</codigoLenguaje>\n"
                + "      <codigoPais>MEX</codigoPais>\n"
                + "      <idioma>ES</idioma>\n"
                + "      <numeroConsultas>1</numeroConsultas>\n"
                + "      <versionArchivoRespuesta>4</versionArchivoRespuesta>\n"
                + "    </encabezado>\n"
                + "    <compania>\n"
                + "      <idConsulta>0000</idConsulta>\n"
                + "      <productoRequerido>001</productoRequerido>\n"
                + "      <rfc>SPR170726BW4</rfc>\n"
                + "      <nombre>SOUR PRINT SA DE CV</nombre>\n"
                + "      <segundoNombre />\n"
                + "      <appPaterno />\n"
                + "      <appMaterno />\n"
                + "      <direccion1>CLLE LOS PINOS 203 COYOACAN</direccion1>\n"
                + "      <direccion2 />\n"
                + "      <codigoPostal>04330</codigoPostal>\n"
                + "      <colonia>ROSEDAL</colonia>\n"
                + "      <ciudad>COYOACAN</ciudad>\n"
                + "      <edoDom>CDMX</edoDom>\n"
                + "      <paisDom>MX</paisDom>\n"
                + "      <firma>S</firma>\n"
                + "      <ambiguedad>R</ambiguedad>\n"
                + "    </compania>\n"
                + "    <cierre>\n"
                + "      <idLote>0000</idLote>\n"
                + "    </cierre>\n"
                + "  </solicitudReporte>\n"
                + "</Solicitud-BCServices>";

        String cadenaMoralSalida = "<SolicitudRespuesta-BCServices>\n"
                + "  <solicitudRespuesta>\n"
                + "    <idTransaccion>PMS18040511141900000</idTransaccion>\n"
                + "  </solicitudRespuesta>\n"
                + "</SolicitudRespuesta-BCServices>";
        
        
        

    }
}
