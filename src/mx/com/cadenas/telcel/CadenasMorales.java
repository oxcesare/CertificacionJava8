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

        String moralesSolicitud = "<Solicitud-BCServices>\n"
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

        String moralesSolicitudRespuesta = "<SolicitudRespuesta-BCServices>\n"
                + "  <solicitudRespuesta>\n"
                + "    <idTransaccion>PMS18040511141900000</idTransaccion>\n"
                + "  </solicitudRespuesta>\n"
                + "</SolicitudRespuesta-BCServices>";

        String moralesSolicitudRes = "<SolicitudRespuesta-BCServices>\n"
                + "  <solicitudRespuesta>\n"
                + "    <idTransaccion>PMS18040511141900000</idTransaccion>\n"
                + "  </solicitudRespuesta>\n"
                + "</SolicitudRespuesta-BCServices>";

        String moralesResp = "<Respuesta-BCServices>\n"
                + "<respuesta-reporte-completo>\n"
                + "<encabezado>\n"
                + "<idLote>0000</idLote>\n"
                + "<idConsulta>0000</idConsulta>\n"
                + "<claveRetorno>1</claveRetorno>\n"
                + "<idTransaccion>0088099836</idTransaccion>\n"
                + "<fechaConsulta>05042018</fechaConsulta>\n"
                + "<homonimia>S</homonimia>\n"
                + "<tipoRespuesta>E</tipoRespuesta>\n"
                + "</encabezado><compania><idConsulta>0000</idConsulta><tipoCliente>1</tipoCliente><rfc>SPR170726BW4</rfc><nombre>SOUR PRINT SA DE CV</nombre><direccion1>LOS PINOS 203</direccion1><coloniaPoblacion>EL ROSEDAL</coloniaPoblacion><delegacionMun>COYOACAN</delegacionMun><ciudad>CIUDAD DE MEXICO</ciudad><estado>CDMX</estado><codigoPostal>04330</codigoPostal><pais>MX</pais><telefono>00076798390</telefono><extension>00000000</extension><nacionalidad>MX</nacionalidad><consulFinanUlt3M>0</consulFinanUlt3M><consulFinanUlt12M>1</consulFinanUlt12M><consulFinanUlt24M>1</consulFinanUlt24M><consulFinanMas24M>0</consulFinanMas24M><consulComerUlt3M>1</consulComerUlt3M><consulComerUlt12M>1</consulComerUlt12M><consulComerMas24M1>1</consulComerMas24M1><consulComerMas24M2>0</consulComerMas24M2></compania><hawk><hawkExpediente><idCoincidenciaExpediente>0000</idCoincidenciaExpediente><fechaMsgHawk>05042018</fechaMsgHawk><codigo>000</codigo><descripcion>NO SE ENCONTRO INFORMACION</descripcion></hawkExpediente></hawk><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201705</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201706</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201707</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201708</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201709</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201710</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201711</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201712</periodo></historia><historia><idConsulta>0000</idConsulta>\n"
                + "<rfc>SPR170726BW4</rfc><periodo>201801</periodo></historia><historia><idConsulta>0000</idConsulta>\n"
                + "<rfc>SPR170726BW4</rfc><periodo>201802</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201803</periodo></historia><historia><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><periodo>201804</periodo></historia><comercial><idConsulta>0000</idConsulta><rfc>SPR170726BW4</rfc><otorgante>1</otorgante><montoTotal>0</montoTotal><montoVigente>0</montoVigente><montoVencido>0</montoVencido><montoVencido1a29>0</montoVencido1a29><montoVencido30a59>0</montoVencido30a59><montoVencido60a89>0</montoVencido60a89><montoVencido90a119>0</montoVencido90a119><montoVencido120a179>0</montoVencido120a179><montoVencido180mas>0</montoVencido180mas><fechaActualizacion>032018</fechaActualizacion><historico>1111111</historico></comercial><cierre><idLote>0000</idLote><idConsulta>0000</idConsulta><idTransaccion>0088099836</idTransaccion></cierre>\n"
                + "</respuesta-reporte-completo></Respuesta-BCServices>";

    }
}
