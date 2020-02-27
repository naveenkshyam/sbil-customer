package com.exp.services.gp.exception;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ApiErrorResponse {
    private int status;
    private int code;
    private String exceptionMsg;
    private String message;
    public ApiErrorResponse(int status, int code,String exceptionMsg, String message) {
        this.status = status;
        this.code = code;
        this.exceptionMsg = exceptionMsg;
        this.message = message;

    }

}
