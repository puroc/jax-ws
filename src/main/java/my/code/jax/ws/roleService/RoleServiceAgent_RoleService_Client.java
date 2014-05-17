
package my.code.jax.ws.roleService;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-17T14:56:28.347+08:00
 * Generated source version: 2.7.11
 * 
 */
public final class RoleServiceAgent_RoleService_Client {

    private static final QName SERVICE_NAME = new QName("www.cattsoft.com", "RoleServiceAgentService");

    private RoleServiceAgent_RoleService_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = RoleServiceAgentService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        RoleServiceAgentService ss = new RoleServiceAgentService(wsdlURL, SERVICE_NAME);
        RoleServiceAgent port = ss.getRoleService();  
        
        {
        System.out.println("Invoking updateRole...");
        java.lang.String _updateRole_roleXML = "";
        java.lang.String _updateRole__return = port.updateRole(_updateRole_roleXML);
        System.out.println("updateRole.result=" + _updateRole__return);


        }
        {
        System.out.println("Invoking addUserRoleSet...");
        java.lang.String _addUserRoleSet_userRoleXML = "";
        java.lang.String _addUserRoleSet__return = port.addUserRoleSet(_addUserRoleSet_userRoleXML);
        System.out.println("addUserRoleSet.result=" + _addUserRoleSet__return);


        }
        {
        System.out.println("Invoking deleteUserRoleSet...");
        java.lang.String _deleteUserRoleSet_userRoleXML = "";
        java.lang.String _deleteUserRoleSet__return = port.deleteUserRoleSet(_deleteUserRoleSet_userRoleXML);
        System.out.println("deleteUserRoleSet.result=" + _deleteUserRoleSet__return);


        }
        {
        System.out.println("Invoking deleteRole...");
        java.lang.String _deleteRole_roleXML = "";
        java.lang.String _deleteRole__return = port.deleteRole(_deleteRole_roleXML);
        System.out.println("deleteRole.result=" + _deleteRole__return);


        }
        {
        System.out.println("Invoking addRole...");
        java.lang.String _addRole_roleXML = "";
        java.lang.String _addRole__return = port.addRole(_addRole_roleXML);
        System.out.println("addRole.result=" + _addRole__return);


        }

        System.exit(0);
    }

}