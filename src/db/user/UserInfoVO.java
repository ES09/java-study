package db.user;

public class UserInfoVO {
	private Integer uiNum;
	private String uiName;
	private String uiId;
	private String uiPwd;
	private String uiEmail;
	
	public Integer getUiNum() {
		return uiNum;
	}
	public void setUiNum(Integer uiNum) {
		this.uiNum = uiNum;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public String getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(String uiPwd) {
		this.uiPwd = uiPwd;
	}
	public String getUiEmail() {
		return uiEmail;
	}
	public void setUiEmail(String uiEmail) {
		this.uiEmail = uiEmail;
	}
	
	@Override
	public String toString() {
		return "UserInfoVO [uiNum=" + uiNum + ", uiName=" + uiName + ", uiId=" + uiId + ", uiPwd=" + uiPwd
				+ ", uiEmail=" + uiEmail + "]";
	}

}
