
public class TestBook {

	public static void main(String[] args) {
		Author anAuthor=new Author("Feher Pista","cim@cim.com",'m');
		Book aBook =new Book("Java",anAuthor,19.99,50);
		System.out.println(aBook);
		
		Book anOtherBook=new Book("More Java",new Author("Nemet Geza","telep@villany.com",'m'),20,20);
		System.out.println(anOtherBook);
		
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getEmail());
		
		System.out.println(anOtherBook.getAuthorName());
		System.out.println(anOtherBook.getAuthorEmail());
		System.out.println(anOtherBook.getAuthorGender());
	}

}