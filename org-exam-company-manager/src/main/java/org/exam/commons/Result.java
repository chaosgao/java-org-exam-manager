package org.exam.commons;

import lombok.Data;

@Data
public class Result {

    private String status;

    private String code;

    private String desc;

    private Object data;

    public static Result ok(){

        Result result = new Result();
        result.setStatus("成功！");
        return result;
    }

    public static Result ok(Object data){

        Result result = new Result();
        result.setStatus("成功！");
        result.setData(data);
        return result;
    }
}
