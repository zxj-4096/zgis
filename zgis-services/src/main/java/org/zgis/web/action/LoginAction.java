package org.zgis.web.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String execute() {

        System.out.println("hello");
        //执行了相关操作
        
        return "success";
    }
    private InputStream inputStream;
    public String getData() {
        setInputStream(new ByteArrayInputStream("hhhh".getBytes()));
        
        return SUCCESS;    
        
    }
    public InputStream getInputStream() {
        return inputStream;
    }
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
