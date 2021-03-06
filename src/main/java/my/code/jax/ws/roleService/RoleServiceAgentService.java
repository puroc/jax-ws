package my.code.jax.ws.roleService;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-17T14:56:28.387+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "RoleServiceAgentService", 
                  wsdlLocation = "./WEB-INF/wsdl/RoleService.xml",
                  targetNamespace = "www.cattsoft.com") 
public class RoleServiceAgentService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("www.cattsoft.com", "RoleServiceAgentService");
    public final static QName RoleService = new QName("www.cattsoft.com", "RoleService");
    static {
        URL url = RoleServiceAgentService.class.getResource("./WEB-INF/wsdl/RoleService.xml");
        if (url == null) {
            url = RoleServiceAgentService.class.getClassLoader().getResource("./WEB-INF/wsdl/RoleService.xml");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(RoleServiceAgentService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "./WEB-INF/wsdl/RoleService.xml");
        }       
        WSDL_LOCATION = url;
    }

    public RoleServiceAgentService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RoleServiceAgentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RoleServiceAgentService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns RoleServiceAgent
     */
    @WebEndpoint(name = "RoleService")
    public RoleServiceAgent getRoleService() {
        return super.getPort(RoleService, RoleServiceAgent.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RoleServiceAgent
     */
    @WebEndpoint(name = "RoleService")
    public RoleServiceAgent getRoleService(WebServiceFeature... features) {
        return super.getPort(RoleService, RoleServiceAgent.class, features);
    }

}
