package vo;

// 값을 저장하기 위해 사용하는 객체
public class User {
	
	/* 멤버 변수 */
	private String id;
	private String name;
	private String email;
	private int password;
	
	/* 생성자 */
	// 기본 생성자
	public User() {
		super();
	}
	public User(String id, String name, String email, int password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	/* 메서드 */
	// Object의 메서드 toString()을 오버라이딩
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	// Getter 메서드(private된(= 은닉화) 멤버변수의 값을 반환하는 메서드)
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	// Setter 메서드(private된(= 은닉화) 멤버변수의 값을 변경하는 메서드)
	public int getPassword() {
		return password;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
}
