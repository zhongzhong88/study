package functionaltests.cukes.data.redskyproduct;

import java.io.Serializable;

public class RedSkyProductRestResponse implements Serializable {
	
	 /**
	 * Eva Zhong
	 */
	private static final long serialVersionUID = 1L;

	private boolean success;

	    private String errorCode;

	    private RedSkyResponseProduct item;

	   

	    public boolean isSuccess()
	    {
	        return success;
	    }

	    public void setSuccess(boolean success)
	    {
	        this.success = success;
	    }

	    public String getErrorCode()
	    {
	        return errorCode;
	    }

	    public void setErrorCode(String errorCode)
	    {
	        this.errorCode = errorCode;
	    }

		public RedSkyResponseProduct getItem() {
			return item;
		}

		public void setItem(RedSkyResponseProduct item) {
			this.item = item;
		}

		

}
