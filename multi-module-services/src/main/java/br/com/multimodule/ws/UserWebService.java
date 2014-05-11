package br.com.multimodule.ws;

import javax.jws.WebService;

/**
 * Created by rafaelpossas on 5/9/14.
 */
@WebService
public class UserWebService {
    public String getText(){
        return "This is an example text";
    }
}
