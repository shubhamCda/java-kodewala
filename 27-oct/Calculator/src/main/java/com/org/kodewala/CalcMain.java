package com.org.kodewala;

import java.net.Authenticator;

/**
 * @author shubh
 * To perform {@link Authenticator} calculation operation
 *
 */
public class CalcMain 
{
    public int addNumber(int a, int b)
    {
    		int result = 0;
    		if(a == 0 && b == 0) {
    			return result;
    		}
    		result = a+b;
        return result;
    }
}
