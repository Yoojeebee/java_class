package repo;

public class Repository {

    private BookRepository bookRepository;
    private UserRepository userRepository;
    private OrderRepository orderRepository;

    /*
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
    */

    public Repository() {
        super();
    }
    public Repository(BookRepository bookRepository, UserRepository userRepository, OrderRepository orderRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
        System.out.println("레파지토리 생성!");
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

    {
        System.out.println("Repository 클래스 생성!");
    }

}
