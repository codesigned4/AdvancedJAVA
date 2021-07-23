package springIntro;

public class DBConnection {
	String password;
	String username;
	String url;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void open() {
		System.out.println("password : "+this.password);
		System.out.println("url : "+this.url);
		System.out.println("username : "+this.username);
	}
	public void close() {
		System.out.println("Veritabaný baðlantýsý kapatýldý");
	}
	
}
