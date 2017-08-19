/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alumnos
 */
@WebService(serviceName = "WS")
public class WS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName="multiplicacionFracciones")
    public float multiplicacionFracciones(@WebParam(name="numero1") float n1, @WebParam(name="numero2") float n2, @WebParam(name="denominador1")int den1, @WebParam(name="denominador2") int den2)
    {
         return (n1*n2)/(den1*den2);    
    }
    @WebMethod(operationName="sumaFracciones")
    public float sumaFracciones(@WebParam(name="numero1") float n1, @WebParam(name="numero2") float n2, @WebParam(name="denominador1")int den1, @WebParam(name="denominador2") int den2)
    {
        int den=0;
        if(den1==den2){
           return (n1+n2)/den1;
        }
        else
        {
           den=mcm(den1,den2);
           n1=n1*den;
           n2=n2*den;
           return (n1+n2)/den;
        }
    }
    @WebMethod(operationName="expansionDeTaylor")
    public float expansionDeTaylor(@WebParam(name="numero") int numero)
    {
        float result=1;
        for(int i=0;i<numero;i++)
        {
            //math pow es para las potencias
            //calc es la funcion recursiva de factorial 
           result=(float)(result+(Math.pow(numero,(i+1))/calc((i+1))));      
        }
        return result;  
    }
    //función que calcula factorial
    public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n-1);
    }
    
    private int mcd(int num1, int num2) {
        int mcd = 0;
        
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
    }
    
    private int mcm(int num1, int num2) {
        int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a/mcd(a, b))*b;
        return mcm;
    }
    
    
    private int digitoVerificador(String rut)
    {
        int digito=0;
        
        return digito; 
    }
}
