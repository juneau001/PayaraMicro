/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.employeeservice;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.employeeservice.entity.AcmeEmployee;

/**
 *
 * @author Juneau
 */
@Stateless
@Path("acmeemployee")
public class AcmeEmployeeFacadeREST {

    @PersistenceContext(unitName = "EmployeeService_1.0PU")
    private EntityManager em;

    public AcmeEmployeeFacadeREST() {

    }

    
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<AcmeEmployee> findAll() {
        List<AcmeEmployee> employeeList = null;
        try {
            employeeList = em.createQuery("select object(o) from AcmeEmployee o")
                    .getResultList();
        } catch (NoResultException e){
            
        }
        return employeeList;
        
    }
    
}
