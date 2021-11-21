
package com.webservice.teacher;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Teacher", targetNamespace = "http://server")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Teacher {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "getNameReturn", targetNamespace = "http://server", partName = "getNameReturn")
    public String getName(
        @WebParam(name = "id", targetNamespace = "http://server", partName = "id")
        String id);

    /**
     * 
     * @param sicArg
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "queryStudentInCourseReturn", targetNamespace = "http://server", partName = "queryStudentInCourseReturn")
    public String queryStudentInCourse(
        @WebParam(name = "sicArg", targetNamespace = "http://server", partName = "sicArg")
        SicArg sicArg);

    /**
     * 
     * @param chanPassArg
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "changeTeacherPasswordReturn", targetNamespace = "http://server", partName = "changeTeacherPasswordReturn")
    public boolean changeTeacherPassword(
        @WebParam(name = "chanPassArg", targetNamespace = "http://server", partName = "chanPassArg")
        ChanPassArg chanPassArg);

    /**
     * 
     * @param teacherId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "queryTeacherCourseReturn", targetNamespace = "http://server", partName = "queryTeacherCourseReturn")
    public String queryTeacherCourse(
        @WebParam(name = "teacher_id", targetNamespace = "http://server", partName = "teacher_id")
        String teacherId);

    /**
     * 
     * @param deleCouArg
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "deleteCourseReturn", targetNamespace = "http://server", partName = "deleteCourseReturn")
    public boolean deleteCourse(
        @WebParam(name = "deleCouArg", targetNamespace = "http://server", partName = "deleCouArg")
        DeleCouArg deleCouArg);

    /**
     * 
     * @param openCouArg
     */
    @WebMethod(operationName = "OpenCourse")
    public void openCourse(
        @WebParam(name = "openCouArg", targetNamespace = "http://server", partName = "openCouArg")
        OpenCouArg openCouArg);

    /**
     * 
     * @param nothing
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "queryAllCourseReturn", targetNamespace = "http://server", partName = "queryAllCourseReturn")
    public String queryAllCourse(
        @WebParam(name = "nothing", targetNamespace = "http://server", partName = "nothing")
        int nothing);

    /**
     * 
     * @param regArg
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "teacherRegisterReturn", targetNamespace = "http://server", partName = "teacherRegisterReturn")
    public boolean teacherRegister(
        @WebParam(name = "regArg", targetNamespace = "http://server", partName = "regArg")
        RegArg regArg);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "teacherQueryReturn", targetNamespace = "http://server", partName = "teacherQueryReturn")
    public String teacherQuery();

    /**
     * 
     * @param logArg
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "teacherLoginReturn", targetNamespace = "http://server", partName = "teacherLoginReturn")
    public boolean teacherLogin(
        @WebParam(name = "logArg", targetNamespace = "http://server", partName = "logArg")
        LogArg logArg);

}
