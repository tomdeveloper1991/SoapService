package com.parameta.model.ws;

import com.parameta.model.Empleado;

public class Response {

	private int codigo;
	private String descripcion;
	private Empleado empleado;
	
	public Response() {};
	
	public Response(int codigo, String descripcion, Empleado empleado) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.empleado=empleado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
}
