
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package my.code.jax.ws.userService;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-17T14:56:53.150+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "UserServiceAgentService",
                      portName = "UserService",
                      targetNamespace = "www.cattsoft.com",
                      wsdlLocation = "./WEB-INF/wsdl/UserService.xml",
                      endpointInterface = "my.code.jax.ws.userService.UserServiceAgent")
                      
public class UserServiceAgentImpl implements UserServiceAgent {

    private static final Logger LOG = Logger.getLogger(UserServiceAgentImpl.class.getName());

    /* (non-Javadoc)
     * @see my.code.jax.ws.userService.UserServiceAgent#deletePerson(java.lang.String  personXML )*
     */
    public java.lang.String deletePerson(java.lang.String personXML) { 
        LOG.info("Executing operation deletePerson");
        System.out.println(personXML);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see my.code.jax.ws.userService.UserServiceAgent#updatePerson(java.lang.String  personXML )*
     */
    public java.lang.String updatePerson(java.lang.String personXML) { 
        LOG.info("Executing operation updatePerson");
        System.out.println(personXML);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see my.code.jax.ws.userService.UserServiceAgent#addPerson(java.lang.String  personXML )*
     */
    public java.lang.String addPerson(java.lang.String personXML) { 
        LOG.info("Executing operation addPerson");
        System.out.println(personXML);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
