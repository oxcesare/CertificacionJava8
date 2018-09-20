/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

import java.io.IOException;

/**
 *
 * @author consultor006
 */
public class Cambios extends Throwable {

    String cadBuro=" <ProviderData> 		    \n" +
"			<TipoSolicitud>idProv</TipoSolicitud>            \n" +
"			<ResponseProvider>\n" +
"			<Header>\n" +
"               <HoraRespuestaSalida>09052018094138</HoraRespuestaSalida>\n" +
"               <Folio>CEX20180509094192055</Folio> \n" +
"			</Header> 			\n" +
"			<Autenticado> 			\n" +
"			<ReporteDeCredito> 			\n" +
"			<EncabezadoResponseINTL> \n" +
"			    <v_version>11</v_version> \n" +
"                <lis_referencia_operador>CEX20180509094192055</lis_referencia_operador>}\n" +
"			    <v_pais>MX</v_pais> \n" +
"			    <v_buro>0000</v_buro> \n" +
"			    <v_cve_otorga>UT98002491</v_cve_otorga>\n" +
"                <v_cve_retorno_p>1</v_cve_retorno_p>\n" +
"			    <v_cve_retorno_s>0</v_cve_retorno_s> \n" +
"			</EncabezadoResponseINTL>\n" +
"			<Nombre> \n" +
"				<lv_ape_pat>CARRILLO</lv_ape_pat> \n" +
"				<lv_ape_mat>RODRIGUEZ</lv_ape_mat>\n" +
"				<lv_prim_nom>LUIS</lv_prim_nom> \n" +
"				<lv_seg_nom>ANGEL</lv_seg_nom> \n" +
"				<lv_fec_nac>29041998</lv_fec_nac> \n" +
"				<lv_rfc>CARL980429</lv_rfc> \n" +
"				<lis_nacionalidad>MX</lis_nacionalidad>\n" +
"				<lis_estado_civil>D</lis_estado_civil> \n" +
"				<lis_sexo>F</lis_sexo> \n" +
"			</Nombre> \n" +
"			<DireccionesReportadas> 			\n" +
"			<Direccion> \n" +
"			     <lis_direccion1>CDA RIO BRAVO MZ67</lis_direccion1> \n" +
"                 <lis_colonia_poblacion>EL SALADO</lis_colonia_poblacion> \n" +
"				 <lis_delegacion_municipio>LA PAZ</lis_delegacion_municipio> \n" +
"				 <lis_ciudad>LA PAZ</lis_ciudad> \n" +
"				 <lis_estado>EM</lis_estado>\n" +
"                 <lis_cp>56524</lis_cp> \n" +
"				 <lis_tipo_domicilio>H</lis_tipo_domicilio>\n" +
"				 <lis_indicador_esp_domicilio>K</lis_indicador_esp_domicilio>\n" +
"				 <FechaDeReporteDeLaDireccion>07082017</FechaDeReporteDeLaDireccion>\n" +
"            </Direccion> 			\n" +
"			</DireccionesReportadas> \n" +
"			<ConsultasReportadas> 			\n" +
"			<ConsultasEfectuadas> \n" +
"				<v_consulta>09052018</v_consulta> \n" +
"				<v_cve_otorga>UT98002491</v_cve_otorga>\n" +
"				<v_nom_otorga>TELCEL</v_nom_otorga>\n" +
"				<v_cve_t_contr>CC</v_cve_t_contr> \n" +
"				<v_importe_cont>0</v_importe_cont> \n" +
"				<v_cve_respon>I</v_cve_respon> \n" +
"			</ConsultasEfectuadas>			 \n" +
"			 <ConsultasEfectuadas> \n" +
"			    <v_consulta>20042018</v_consulta>\n" +
"                <v_nom_otorga>SIC</v_nom_otorga> \n" +
"				<v_cve_t_contr>CL</v_cve_t_contr> \n" +
"				<v_importe_cont>0</v_importe_cont>\n" +
"				<v_cve_respon>I</v_cve_respon> \n" +
"			</ConsultasEfectuadas>            \n" +
"			<ConsultasEfectuadas> \n" +
"				<v_consulta>07082017</v_consulta> \n" +
"				<v_nom_otorga>SIC</v_nom_otorga> \n" +
"				<v_cve_t_contr>UK</v_cve_t_contr> \n" +
"				<v_importe_cont>0</v_importe_cont> \n" +
"				<v_cve_respon>I</v_cve_respon>\n" +
"				<v_indica_con_n>Y</v_indica_con_n> \n" +
"			</ConsultasEfectuadas>\n" +
"			</ConsultasReportadas>\n" +
"			<ReportesRealizados> 			\n" +
"			<ResumenReporte> \n" +
"				<v_ingre_bd>07082017</v_ingre_bd> \n" +
"				<v_mop_07>00</v_mop_07>\n" +
"				<v_mop_06>00</v_mop_06> \n" +
"				<v_mop_05>00</v_mop_05> \n" +
"				<v_mop_04>00</v_mop_04> \n" +
"				<v_mop_03>00</v_mop_03> \n" +
"				<v_mop_02>00</v_mop_02> \n" +
"				<v_mop_01>00</v_mop_01> \n" +
"				<v_mop_00>00</v_mop_00> \n" +
"				<v_mop_ur>00</v_mop_ur> \n" +
"				<v_n_cuenta>0000</v_n_cuenta> \n" +
"				<v_n_pago_f>0000</v_n_pago_f> \n" +
"				<v_n_cta_ra>0000</v_n_cta_ra> \n" +
"				<v_n_cta_cerr>0000</v_n_cta_cerr> \n" +
"				<v_n_cta_neg>0000</v_n_cta_neg> \n" +
"				<v_n_ctas_mop>0000</v_n_ctas_mop> \n" +
"				<v_n_cta_disp>00</v_n_cta_disp> \n" +
"				<v_n_sol_6_mes>01</v_n_sol_6_mes> \n" +
"				<v_u_dirr>N</v_u_dirr> \n" +
"				<v_msg_allert>NNNNN</v_msg_allert>\n" +
"				<v_declara>N</v_declara>\n" +
"				<v_mop_96>00</v_mop_96> \n" +
"				<v_mop_97>00</v_mop_97> \n" +
"				<v_mop_99>00</v_mop_99> \n" +
"				<v_open_cta_ant>00000000</v_open_cta_ant>\n" +
"				<v_open_cta_rec>00000000</v_open_cta_rec> \n" +
"				<v_n_t_repo>02</v_n_t_repo>\n" +
"				<v_n_t_repo_rec>20042018</v_n_t_repo_rec>\n" +
"				<v_n_t_cta_des_cob>00</v_n_t_cta_des_cob>\n" +
"				<v_open_cc>00000000</v_open_cc> \n" +
"				<v_n_sol_cc>00</v_n_sol_cc>\n" +
"				<v_sol_cc>00000000</v_sol_cc> 				 \n" +
"			 </ResumenReporte> 			 \n" +
"			 </ReportesRealizados> 			 \n" +
"			 <Fin> \n" +
"			    <v_long>00622</v_long> \n" +
"			    <v_ctrl_consul>1560584231</v_ctrl_consul>\n" +
"                 <v_chr_fin>0102</v_chr_fin> \n" +
"			 </Fin> 			 \n" +
"			 </ReporteDeCredito> \n" +
"			</Autenticado> \n" +
"			</ResponseProvider> \n" +
"			</ProviderData>";
    
    
    public void m() {
    }
}
