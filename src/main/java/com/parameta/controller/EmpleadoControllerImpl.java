package com.parameta.controller;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.parameta.jpa.JPAUtil;
import com.parameta.model.Empleado;
import com.parameta.model.ws.Response;

@WebService(endpointInterface = "com.parameta.controller.EmpleadoController")
public class EmpleadoControllerImpl implements EmpleadoController {

	public Response almacenarEmpleado(Empleado empleadoIn) throws PersistenceException {
		
		Response responseFinal=null;
		
		try {
			EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

			System.out.println("Empleado Recibido:" + empleadoIn.toString());

			entity.getTransaction().begin();
			entity.persist(empleadoIn);
			entity.getTransaction().commit();
			System.out.println("Empleado registrado..");

			Response response = new Response(0, "Empleado Registrado Exitosamente...", empleadoIn);
			
			responseFinal=response;
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {			
			if(responseFinal==null) {
				responseFinal.setCodigo(1);
				responseFinal.setDescripcion("Error guardando al empleado...");
				responseFinal.setEmpleado(null);
			}					
		}	
		
		return responseFinal;
	}

}
