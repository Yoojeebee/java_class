package service;

public class Service {
    UserService userService = new UserService();
    BookService bookService = new BookService();
    OrderService orderService = new OrderService();

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
