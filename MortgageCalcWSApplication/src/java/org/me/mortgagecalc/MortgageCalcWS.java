/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.mortgagecalc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author dhruvinparikh.byethost24.com
 */
@WebService(serviceName = "MortgageCalcWS")
@Stateless()
public class MortgageCalcWS {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcMortgage")
    public Double calcMortgage(@WebParam(name = "amount") double amount, @WebParam(name = "rate") double rate, @WebParam(name = "year") int year, @WebParam(name = "month") int month) {
        double L = amount;
        int n = (year*12)+month;
        double c = (rate/1200);
        return (L*c*Math.pow(1+c, n))/(Math.pow(1+c, n)-1);
    }
}
