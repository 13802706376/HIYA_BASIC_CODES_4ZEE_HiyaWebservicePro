package com.hiya.ee.ws.xfire;

import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

public class XfireClient
{
    public static void main(String[] args)
    {
        String serviceUrl = "http://localhost:8080/Demo/services/MyService";
        Service serviceModel = new ObjectServiceFactory().create(IBookInterface.class, null, "http://localhost:8080/Demo/services/MyService?wsdl", null);
        XFireProxyFactory serviceFactory = new XFireProxyFactory();
        try
        {
            IBookInterface service = (IBookInterface) serviceFactory.create(serviceModel, serviceUrl);
            String hello = service.sayHello("5555");
            System.out.println(hello);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
