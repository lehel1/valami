
public class TestAuthor {

	public static void main(String[] args) {
		Author anAuthor= new Author("Fekete Peter","valami@email.com",'m');
		System.out.println(anAuthor);
		anAuthor.setEmail("masvalami@cim.com");
		System.out.println(anAuthor);
	}

}
