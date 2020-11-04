package service;

import repo.Repository;

public class Service {

    private UserService userService;
    private BookService bookService;
    private OrderService orderService;

    private Repository repository ;
    /*
    private Service(){}
    private static Service service;
    public static Service getInstance() {
        if(service == null) {
            userService = new UserService();
            bookService = new BookService();
            orderService = new OrderService();
            service = new Service();
        }
        return service;
    }
    */

    public Service() {
        super();
    }
    public Service(UserService userService, BookService bookService, OrderService orderService) {
        this.userService = userService;
        this.bookService = bookService;
        this.orderService = orderService;
        this.repository = new Repository();
    }

    public Repository getRepository() {
        return repository;
    }

    public UserService getUserService() {
        return userService;
    }

    public BookService getBookService() {
        return bookService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

}
