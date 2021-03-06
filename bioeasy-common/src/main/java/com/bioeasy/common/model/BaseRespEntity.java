package com.bioeasy.common.model;


import com.bioeasy.common.constants.GlobalErrorcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 响应bean
 */
@XmlRootElement(name = "resp")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseRespEntity extends BaseEntity {

    private String errormsg = GlobalErrorcode.SUCC_CODE;

    private String errorcode = GlobalErrorcode.SUCC_MSG;
    
    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }
}
