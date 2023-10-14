package Arrays;
class login
{

	private String uname="NIkh";
	private String pwd="123";
	private int age=23;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Encap_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
login l=new login();
l.setUname("NikhilaSenthil");
System.out.println(l.getUname());
l.setPwd("233324jh");
System.out.println(l.getPwd());
l.setAge(30);
System.out.println(l.getAge());



	}

}
