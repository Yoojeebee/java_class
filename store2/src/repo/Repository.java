package repo;

public class Repository {

    private static BookRepository bookRepository;
    private static UserRepository userRepository;
    private static OrderRepository orderRepository;

    private Repository(){}
    private static Repository repository;
    public static Repository getInstance() {
        if(repository == null) {
            bookRepository = new BookRepository();
            userRepository = new UserRepository();
            orderRepository = new OrderRepository();
            repository = new Repository();
        }
        return repository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

}
