public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayServiceStatus() {

        System.out.println("Book Service initialized.");

        bookRepository.showRepositoryStatus();

    }

}