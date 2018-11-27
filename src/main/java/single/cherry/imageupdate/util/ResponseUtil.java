package single.cherry.imageupdate.util;

/**
 * 根据不同的情况反馈不同的信息
 * @Author: Cherry
 * @Date: 2018/11/27 9:01
 */
public class ResponseUtil {

    //当正确是返回的值
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("OK");
        result.setData(data);
        return result;
    }

    //不需要返回数据时
    public static Result success(){
        return success(null);
    }

    //当错误的时候返回的值
    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
