
package my.code.jax.ws.DepartmentService;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-14T11:20:15.437+08:00
 * Generated source version: 2.7.11
 * 
 */
 
public class DepartmentServiceAgent_DepartmentService_Server{

    protected DepartmentServiceAgent_DepartmentService_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new DepartmentServiceAgentImpl();
        String address = "http://localhost:8080/coc_test/services/DepartmentService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new DepartmentServiceAgent_DepartmentService_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
