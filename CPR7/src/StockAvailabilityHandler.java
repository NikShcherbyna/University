public class StockAvailabilityHandler implements OrderHandler{
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processOrder(Order order) {
        // Симулюємо перевірку наявності товару
        if (order.getQuantity() <= 10) {
            System.out.println("Product '" + order.getProductName() + "' is in stock. Processing order.");
        } else {
            System.out.println("Product '" + order.getProductName() + "' is out of stock. Unable to process order.");
        }

        // Передаємо обробку наступному обробнику у ланцюгу
        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }
}
