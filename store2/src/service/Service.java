package service;

public class Service {

    private static UserService userService;
    private static BookService bookService;
    private static OrderService orderService;
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
