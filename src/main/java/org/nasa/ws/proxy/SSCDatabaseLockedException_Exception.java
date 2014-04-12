
package org.nasa.ws.proxy;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "SSCDatabaseLockedException", targetNamespace = "http://ssc.spdf.gsfc.nasa.gov/")
public class SSCDatabaseLockedException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SSCDatabaseLockedException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SSCDatabaseLockedException_Exception(String message, SSCDatabaseLockedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SSCDatabaseLockedException_Exception(String message, SSCDatabaseLockedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.nasa.ws.proxy.SSCDatabaseLockedException
     */
    public SSCDatabaseLockedException getFaultInfo() {
        return faultInfo;
    }

}
