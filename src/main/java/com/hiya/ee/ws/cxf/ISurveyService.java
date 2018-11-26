package com.hiya.ee.ws.cxf;

import javax.jws.WebService;

@WebService
public interface ISurveyService
{
    public String vote(String username,int point);
}
