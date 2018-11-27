package single.cherry.imageupdate.util;

/**
 * @Author Cherry
 * @Date 2018/11/2711:50
 */
public class Result<T> {

	private int code;

	private String msg;

	private Object data;

	public Result() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
