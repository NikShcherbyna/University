public class CostCalculationHandler implements OrderHandler{
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processOrder(Order order) {
        // Симулюємо розрахунок вартості
        double totalCost = order.getQuantity() * 20.0; // Припустима ціна за одиницю товару

        System.out.println("Total cost for '" + order.getProductName() + "': $" + totalCost);

        // Передаємо обробку наступному обробнику у ланцюгу
        if (nextHandler != null) {
            nextHandler.processOrder(order);
        }
    }
}
