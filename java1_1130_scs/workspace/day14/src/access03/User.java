package access03;

public class User {
	
//	회원정보
	private String userId; // 회원 아이디
	private String userPw; // 회원 비밀번호
	private String userName; // 회원 이름
	
//	getter, setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
