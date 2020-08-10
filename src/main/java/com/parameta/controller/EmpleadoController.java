package com.parameta.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.parameta.model.Empleado;
import com.parameta.model.ws.Response;

@WebService
public interface EmpleadoController {
	@WebMethod
	public Response almacenarEmpleado(Empleado empleadoIn);
}
