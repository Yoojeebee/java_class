package service;

import repo.Repository;

public class Service {

    private UserService userService = new UserService();
    private BookService bookService = new BookService();
    private OrderService orderService = new OrderService();

    private Service(){}
    private static Service service;
    public static Service getInstance() {
        if(service == null) {
            service = new Service();
        }
        return service;
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
