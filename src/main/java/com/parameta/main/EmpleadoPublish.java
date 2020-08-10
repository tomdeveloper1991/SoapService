package com.parameta.main;

import javax.xml.ws.Endpoint;

import com.parameta.controller.EmpleadoControllerImpl;

public class EmpleadoPublish {

	public static void main(String[] args) {
		
		String endPoint="http://localhost:1234/WS/Empleado";		
		
		Endpoint.publish(endPoint, new EmpleadoControllerImpl());
	}

}
