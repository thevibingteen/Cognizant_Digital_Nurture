public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection completed.");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection completed.");
    }

    public void displayService() {

        System.out.println("Book Service is running.");

        bookRepository.displayBookDetails();

    }

}