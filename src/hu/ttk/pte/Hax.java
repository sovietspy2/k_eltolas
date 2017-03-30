package hu.ttk.pte;

public class Hax {
	
	private String secret;
	private Integer k;
	
	Hax(Integer i, String sec) {
		this.k = i;
		secret = sec;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	public void encode(){
		StringBuilder sb = new StringBuilder(secret);
		
		for (int i = 0; i < secret.length();i++) {
			char a = (char) (secret.charAt(i));
			//a = (char) (a+k);
			
			if ((a+k) > (int) (122)) {
				 //System.out.println("RAPE");
				 a =(char) ( 96+(k-((char) (122-a))));
			 } else {
				 
				 a = (char) (a+k);
			 }
			 
			sb.setCharAt(i,a);
		}
		secret = sb.toString();
	}
	public void show(){
		System.out.println(secret);
	}
	public void decode(){
		StringBuilder sb = new StringBuilder(secret);
		
		for (int i = 0; i < secret.length();i++) {
			char a = (char) (secret.charAt(i));
			//a = (char) (a+k);
			
			if ((a-k) < (int) (97)) {
				 //System.out.println("RAPE");
				 a =(char) ( 122-(k+((char) (96-a))));
			 } else {
				 
				 a = (char) (a-k);
			 }
			 
			sb.setCharAt(i,a);
		}
		secret = sb.toString();
		
	}

}
