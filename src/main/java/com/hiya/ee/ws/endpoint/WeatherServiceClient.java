package com.hiya.ee.ws.endpoint;


import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class WeatherServiceClient
{
    public static void main(String[] args) throws MalformedURLException
    {
      //定义url，参数为wsdl地址
        URL url = new URL("http://127.0.0.1:1234/weather?wsdl");
        //定义qname，第一个参数是命名空间，第二个参数名称是wsdl里边的服务名
        QName qName = new QName("http://impl.sei.jaxws.ws.itcast.cn/", "WeatherInterfaceImplService");
        //创建服务视图
        Service service = Service.create(url, qName);
        //通过服务视图得到服务端点
        WeatherInterfaceImpl weatherInterfaceImpl =service.getPort(WeatherInterfaceImpl.class);
        //调用webservice
        System.out.println(weatherInterfaceImpl.queryWeather("郑州"));
    }
}
