public class ConfirmationHandler implements OrderHandler{
    @Override
    public void processOrder(Order order) {
        // Симулюємо відправлення підтвердження клієнту
        System.out.println("Order confirmation sent for '" + order.getProductName() + "'.");
    }
}
