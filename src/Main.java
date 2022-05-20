public class Main {
    public static void main(String[] args) {
        System.out.println("Акция:бесплатные мили за перелеты");
        int ticket = 30000; // рублей за билет
        int price = 20;
        if (ticket<6000) {
            System.out.println("Недостаточно суммы для начисления бонуса");
        }
        else if (ticket>=6000) {
            System.out.println(ticket/price);
            System.out.println("бонусов начислится");
            
        }
    }
}
