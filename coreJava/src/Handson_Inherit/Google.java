package Handson_Inherit;

class mail
{
	void mlogin()
	{
		System.out.println("InMailLogin");
	}
}
abstract class twitter extends mail{
	abstract void tlogin();
	abstract void tauth();
	
	static void twitlogin()
	{
		System.out.println("IntwitLogin");

	}
}

abstract class facebook extends twitter
{
	abstract void flogin();
	abstract void fAuth();
	 
	void facelogin()
	{
		System.out.println("InfaceLogin");

	}
}

abstract class zoom extends facebook
{
	 abstract void loginGoogle();
	abstract void loginAuth();
	
	static void zoomLogin()
	{
		System.out.println("InZoomLogin");

	}
	void zoomAuth()
	{
		System.out.println("InZoomAuth");

	}
}

public class Google extends zoom {
	
	void loginGoogle()
	{
		System.out.println("AbstractLogin");

	}
	
	void loginAuth()
	{
		System.out.println("AbstractAuth");

	}
	
	void flogin()
	{
		System.out.println("Abstractflogin");

	}
	
	void fAuth()
	{
		System.out.println("Abstractfauth");

	}
	
	void tlogin()
	{
		System.out.println("AbstractTwitterLogin");

	}
	
	void tauth()
	{
		System.out.println("AbstracttwitterAuth");

	}
	static void login()
	{
		System.out.println("InGoogleLogin");

	}
	
	void auth()
	{
		System.out.println("InAuth");

	}

	public static void main(String[] args) {
		Google g = new Google();
		g.auth();
		g.loginGoogle();
		g.loginAuth();
		g.facelogin();
		g.fAuth();
		g.tlogin();
		g.tauth();
		login();
		zoomLogin();
		g.zoomAuth();
		g.facelogin();
		twitlogin();
		g.mlogin();
	}

}
