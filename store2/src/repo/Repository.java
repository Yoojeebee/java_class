package repo;

public class Repository {

    private BookRepository bookRepository = new BookRepository();
    private UserRepository userRepository = new UserRepository();
    private OrderRepository orderRepository = new OrderRepository();

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
