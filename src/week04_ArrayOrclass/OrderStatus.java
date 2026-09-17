public enum OrderStatus {

    PAYMENT,
    PREPARING,
    SHIPPING,
    COMPLETED
}
static void main(String[] args) {

    OrderStatus status =
            OrderStatus.SHIPPING;
    System.out.println(status);
}
