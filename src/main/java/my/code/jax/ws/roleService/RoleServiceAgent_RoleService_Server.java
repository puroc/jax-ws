
package my.code.jax.ws.roleService;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-17T14:56:28.384+08:00
 * Generated source version: 2.7.11
 * 
 */
 
public class RoleServiceAgent_RoleService_Server{

    protected RoleServiceAgent_RoleService_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new RoleServiceAgentImpl();
        String address = "http://localhost:8080/coc_test/services/RoleService";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new RoleServiceAgent_RoleService_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
