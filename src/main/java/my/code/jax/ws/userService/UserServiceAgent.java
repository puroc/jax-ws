package my.code.jax.ws.userService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-17T14:56:53.160+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "www.cattsoft.com", name = "UserServiceAgent")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserServiceAgent {

    @WebResult(name = "deletePersonReturn", targetNamespace = "www.cattsoft.com", partName = "deletePersonReturn")
    @WebMethod
    public java.lang.String deletePerson(
        @WebParam(partName = "personXML", name = "personXML")
        java.lang.String personXML
    );

    @WebResult(name = "updatePersonReturn", targetNamespace = "www.cattsoft.com", partName = "updatePersonReturn")
    @WebMethod
    public java.lang.String updatePerson(
        @WebParam(partName = "personXML", name = "personXML")
        java.lang.String personXML
    );

    @WebResult(name = "addPersonReturn", targetNamespace = "www.cattsoft.com", partName = "addPersonReturn")
    @WebMethod
    public java.lang.String addPerson(
        @WebParam(partName = "personXML", name = "personXML")
        java.lang.String personXML
    );
}
