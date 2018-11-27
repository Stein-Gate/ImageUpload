package single.cherry.imageupdate.util;

/**
 * @Author Cherry
 * @Date 2018/11/2711:57
 */
public class ResultUtil {

	public static Result success(Object data){
		Result result = new Result();
		result.setCode(200);
		result.setMsg("success");
		result.setData(data);
		return result;
	}

	public static Result success(){
	    return success(null);
    }

    public static Result error(int code,String msg){
	    Result result = new Result();
	    result.setCode(code);
	    result.setMsg(msg);
	    return result;
    }

}
