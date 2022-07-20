package org.exam.common;

import lombok.Data;

@Data
public class Result {

    private String status;

    private String desc;

    private Object data;

    private Result(){

    }

    public static Result ok(){

        Result result = new Result();
        result.setStatus("success");
        result.setDesc("操作成功");
        return result;
    }

    public static Result ok(Object data){

        Result result = new Result();
        result.setStatus("success");
        result.setDesc("操作成功");
        result.setData(data);
        return result;
    }

    public static Result ok(Object data,String desc){

        Result result = new Result();
        result.setStatus("success");
        result.setDesc(desc);
        result.setData(data);
        return result;
    }

    public static Result fail(String status,String desc){

        Result result = new Result();
        result.setStatus(status);
        result.setDesc(desc);
        result.setData(null);
        return result;
    }
}
