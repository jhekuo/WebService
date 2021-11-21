
package com.webservice.teacher;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TeacherService", targetNamespace = "http://server", wsdlLocation = "http://localhost:8080/services/Teacher?wsdl")
public class TeacherService
    extends Service
{

    private final static URL TEACHERSERVICE_WSDL_LOCATION;
    private final static WebServiceException TEACHERSERVICE_EXCEPTION;
    private final static QName TEACHERSERVICE_QNAME = new QName("http://server", "TeacherService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services/Teacher?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TEACHERSERVICE_WSDL_LOCATION = url;
        TEACHERSERVICE_EXCEPTION = e;
    }

    public TeacherService() {
        super(__getWsdlLocation(), TEACHERSERVICE_QNAME);
    }

    public TeacherService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TEACHERSERVICE_QNAME, features);
    }

    public TeacherService(URL wsdlLocation) {
        super(wsdlLocation, TEACHERSERVICE_QNAME);
    }

    public TeacherService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TEACHERSERVICE_QNAME, features);
    }

    public TeacherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TeacherService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Teacher
     */
    @WebEndpoint(name = "Teacher")
    public Teacher getTeacher() {
        return super.getPort(new QName("http://server", "Teacher"), Teacher.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Teacher
     */
    @WebEndpoint(name = "Teacher")
    public Teacher getTeacher(WebServiceFeature... features) {
        return super.getPort(new QName("http://server", "Teacher"), Teacher.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TEACHERSERVICE_EXCEPTION!= null) {
            throw TEACHERSERVICE_EXCEPTION;
        }
        return TEACHERSERVICE_WSDL_LOCATION;
    }

}
