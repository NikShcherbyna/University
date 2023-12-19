public class Main {
    public static void main(String[] args) {
        // Створення обробників
        OrderHandler stockHandler = new StockAvailabilityHandler();
        OrderHandler costHandler = new CostCalculationHandler();
        OrderHandler confirmationHandler = new ConfirmationHandler();

        // Встановлення ланцюга відповідальності
        ((StockAvailabilityHandler) stockHandler).setNextHandler(costHandler);
        ((CostCalculationHandler) costHandler).setNextHandler(confirmationHandler);

        // Створення замовлення
        Order order = new Order("Laptop", 5);

        // Обробка замовлення
        stockHandler.processOrder(order);
    }
}