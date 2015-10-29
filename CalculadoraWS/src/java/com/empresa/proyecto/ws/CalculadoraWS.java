/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Eric
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "OpSumar")
    public double OpSumar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2) {
        //TODO write your implementation code here:
        
        return numero1+numero2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "OpRestar")
    public double OpRestar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2) {
        //TODO write your implementation code here:
        return numero1-numero2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "OpMultiplicar")
    public double OpMultiplicar(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2) {
        //TODO write your implementation code here:
        return numero1*numero2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "OpDividir")
    public double OpDividir(@WebParam(name = "numero1") double numero1, @WebParam(name = "numero2") double numero2) {
        //TODO write your implementation code here:
        return numero1/numero2;
    }
}
