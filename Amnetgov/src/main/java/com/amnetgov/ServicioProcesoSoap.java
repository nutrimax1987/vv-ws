package com.amnetgov;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.amnetgov.entities.BiometricAuthResult;
import com.amnetgov.entities.BiometricData;
import com.amnetgov.entities.PersonalBasicInfo;
import com.amnetgov.entities.PersonalOtherInfo;

/**
 * This class was generated by Apache CXF 3.1.4 2016-02-11T15:59:01.593-08:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "http://amnetgov.com/", name = "ServicioProcesoSoap")
public interface ServicioProcesoSoap {

	@WebMethod(operationName = "SeleccionarProcesoDatosComplementarios", action = "http://amnetgov.com/SeleccionarProcesoDatosComplementarios")
	@RequestWrapper(localName = "SeleccionarProcesoDatosComplementarios", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoDatosComplementarios")
	@ResponseWrapper(localName = "SeleccionarProcesoDatosComplementariosResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoDatosComplementariosResponse")
	@WebResult(name = "SeleccionarProcesoDatosComplementariosResult", targetNamespace = "http://amnetgov.com/")
	public PersonalOtherInfo seleccionarProcesoDatosComplementarios(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdProceso", targetNamespace = "http://amnetgov.com/") long idProceso);

	@WebMethod(operationName = "SeleccionarImagenesProceso", action = "http://amnetgov.com/SeleccionarImagenesProceso")
	@RequestWrapper(localName = "SeleccionarImagenesProceso", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarImagenesProceso")
	@ResponseWrapper(localName = "SeleccionarImagenesProcesoResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarImagenesProcesoResponse")
	@WebResult(name = "SeleccionarImagenesProcesoResult", targetNamespace = "http://amnetgov.com/")
	public BiometricData seleccionarImagenesProceso(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdProceso", targetNamespace = "http://amnetgov.com/") long idProceso);

	@WebMethod(operationName = "SeleccionarProcesoPorIdentificacionAspirante", action = "http://amnetgov.com/SeleccionarProcesoPorIdentificacionAspirante")
	@RequestWrapper(localName = "SeleccionarProcesoPorIdentificacionAspirante", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoPorIdentificacionAspirante")
	@ResponseWrapper(localName = "SeleccionarProcesoPorIdentificacionAspiranteResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoPorIdentificacionAspiranteResponse")
	@WebResult(name = "SeleccionarProcesoPorIdentificacionAspiranteResult", targetNamespace = "http://amnetgov.com/")
	public long seleccionarProcesoPorIdentificacionAspirante(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "TipoIdentificacion", targetNamespace = "http://amnetgov.com/") String tipoIdentificacion,
			@WebParam(name = "NumeroIdentificacion", targetNamespace = "http://amnetgov.com/") String numeroIdentificacion);

	@WebMethod(operationName = "RegistroReporteFavorable", action = "http://amnetgov.com/RegistroReporteFavorable")
	@RequestWrapper(localName = "RegistroReporteFavorable", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.RegistroReporteFavorable")
	@ResponseWrapper(localName = "RegistroReporteFavorableResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.RegistroReporteFavorableResponse")
	@WebResult(name = "RegistroReporteFavorableResult", targetNamespace = "http://amnetgov.com/")
	public boolean registroReporteFavorable(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdSeguimiento", targetNamespace = "http://amnetgov.com/") String idSeguimiento,
			@WebParam(name = "NombreReporte", targetNamespace = "http://amnetgov.com/") String nombreReporte,
			@WebParam(name = "Reporte", targetNamespace = "http://amnetgov.com/") byte[] reporte);

	@WebMethod(operationName = "CrearSeguimientoCertificador", action = "http://amnetgov.com/CrearSeguimientoCertificador")
	@RequestWrapper(localName = "CrearSeguimientoCertificador", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.CrearSeguimientoCertificador")
	@ResponseWrapper(localName = "CrearSeguimientoCertificadorResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.CrearSeguimientoCertificadorResponse")
	@WebResult(name = "CrearSeguimientoCertificadorResult", targetNamespace = "http://amnetgov.com/")
	public String crearSeguimientoCertificador(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "Idproceso", targetNamespace = "http://amnetgov.com/") long idproceso,
			@WebParam(name = "IdCertificador", targetNamespace = "http://amnetgov.com/") String idCertificador,
			@WebParam(name = "Observaciones", targetNamespace = "http://amnetgov.com/") String observaciones,
			@WebParam(name = "ResultadoExamen", targetNamespace = "http://amnetgov.com/") int resultadoExamen,
			@WebParam(name = "CategoriaFinal", targetNamespace = "http://amnetgov.com/") String categoriaFinal);

	@WebMethod(operationName = "SeleccionarResultadoCertificador", action = "http://amnetgov.com/SeleccionarResultadoCertificador")
	@RequestWrapper(localName = "SeleccionarResultadoCertificador", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarResultadoCertificador")
	@ResponseWrapper(localName = "SeleccionarResultadoCertificadorResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarResultadoCertificadorResponse")
	@WebResult(name = "SeleccionarResultadoCertificadorResult", targetNamespace = "http://amnetgov.com/")
	public SeleccionarResultadoCertificadorResultado seleccionarResultadoCertificador(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdProceso", targetNamespace = "http://amnetgov.com/") long idProceso);

	@WebMethod(operationName = "SeleccionarProcesoPorIdentificacionAspiranteCombo", action = "http://amnetgov.com/SeleccionarProcesoPorIdentificacionAspiranteCombo")
	@RequestWrapper(localName = "SeleccionarProcesoPorIdentificacionAspiranteCombo", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoPorIdentificacionAspiranteCombo")
	@ResponseWrapper(localName = "SeleccionarProcesoPorIdentificacionAspiranteComboResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoPorIdentificacionAspiranteComboResponse")
	@WebResult(name = "SeleccionarProcesoPorIdentificacionAspiranteComboResult", targetNamespace = "http://amnetgov.com/")
	public long seleccionarProcesoPorIdentificacionAspiranteCombo(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "TipoIdentificacion", targetNamespace = "http://amnetgov.com/") String tipoIdentificacion,
			@WebParam(name = "NumeroIdentificacion", targetNamespace = "http://amnetgov.com/") String numeroIdentificacion);

	@WebMethod(operationName = "SolicitarIdentificadorSeguimiento", action = "http://amnetgov.com/SolicitarIdentificadorSeguimiento")
	@RequestWrapper(localName = "SolicitarIdentificadorSeguimiento", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SolicitarIdentificadorSeguimiento")
	@ResponseWrapper(localName = "SolicitarIdentificadorSeguimientoResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SolicitarIdentificadorSeguimientoResponse")
	@WebResult(name = "SolicitarIdentificadorSeguimientoResult", targetNamespace = "http://amnetgov.com/")
	public String solicitarIdentificadorSeguimiento(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "NumeroProceso", targetNamespace = "http://amnetgov.com/") long numeroProceso,
			@WebParam(name = "RolEspecialista", targetNamespace = "http://amnetgov.com/") String rolEspecialista,
			@WebParam(name = "Especialista", targetNamespace = "http://amnetgov.com/") String especialista,
			@WebParam(name = "Inicio", targetNamespace = "http://amnetgov.com/") boolean inicio);

	@WebMethod(operationName = "SolicitarResultadoIdentificadorSeguimiento", action = "http://amnetgov.com/SolicitarResultadoIdentificadorSeguimiento")
	@RequestWrapper(localName = "SolicitarResultadoIdentificadorSeguimiento", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SolicitarResultadoIdentificadorSeguimiento")
	@ResponseWrapper(localName = "SolicitarResultadoIdentificadorSeguimientoResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SolicitarResultadoIdentificadorSeguimientoResponse")
	@WebResult(name = "SolicitarResultadoIdentificadorSeguimientoResult", targetNamespace = "http://amnetgov.com/")
	public BiometricAuthResult solicitarResultadoIdentificadorSeguimiento(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdSeguimiento", targetNamespace = "http://amnetgov.com/") String idSeguimiento);

	@WebMethod(operationName = "RegistroExamenTemporal", action = "http://amnetgov.com/RegistroExamenTemporal")
	@RequestWrapper(localName = "RegistroExamenTemporal", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.RegistroExamenTemporal")
	@ResponseWrapper(localName = "RegistroExamenTemporalResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.RegistroExamenTemporalResponse")
	@WebResult(name = "RegistroExamenTemporalResult", targetNamespace = "http://amnetgov.com/")
	public long registroExamenTemporal(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdSeguimiento", targetNamespace = "http://amnetgov.com/") String idSeguimiento,
			@WebParam(name = "EstadoExamen", targetNamespace = "http://amnetgov.com/") int estadoExamen,
			@WebParam(name = "ResultadoExamen", targetNamespace = "http://amnetgov.com/") int resultadoExamen,
			@WebParam(name = "Obervaciones", targetNamespace = "http://amnetgov.com/") String obervaciones,
			@WebParam(name = "Detalle", targetNamespace = "http://amnetgov.com/") SpecialistTestResultList detalle);

	@WebMethod(operationName = "SeleccionarProcesoDatosBasicos", action = "http://amnetgov.com/SeleccionarProcesoDatosBasicos")
	@RequestWrapper(localName = "SeleccionarProcesoDatosBasicos", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoDatosBasicos")
	@ResponseWrapper(localName = "SeleccionarProcesoDatosBasicosResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.SeleccionarProcesoDatosBasicosResponse")
	@WebResult(name = "SeleccionarProcesoDatosBasicosResult", targetNamespace = "http://amnetgov.com/")
	public PersonalBasicInfo seleccionarProcesoDatosBasicos(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdProceso", targetNamespace = "http://amnetgov.com/") long idProceso);

	@WebMethod(operationName = "ConsultarResultadoSeguimientoCertificador", action = "http://amnetgov.com/ConsultarResultadoSeguimientoCertificador")
	@RequestWrapper(localName = "ConsultarResultadoSeguimientoCertificador", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.ConsultarResultadoSeguimientoCertificador")
	@ResponseWrapper(localName = "ConsultarResultadoSeguimientoCertificadorResponse", targetNamespace = "http://amnetgov.com/", className = "com.amnetgov.jaxws.ConsultarResultadoSeguimientoCertificadorResponse")
	@WebResult(name = "ConsultarResultadoSeguimientoCertificadorResult", targetNamespace = "http://amnetgov.com/")
	public ConsultarResultadoSeguimientoCertificadorResultado consultarResultadoSeguimientoCertificador(
			@WebParam(name = "UsuarioServicio", targetNamespace = "http://amnetgov.com/") String usuarioServicio,
			@WebParam(name = "ContrasenaServicio", targetNamespace = "http://amnetgov.com/") String contrasenaServicio,
			@WebParam(name = "IdSeguimiento", targetNamespace = "http://amnetgov.com/") String idSeguimiento);
}
