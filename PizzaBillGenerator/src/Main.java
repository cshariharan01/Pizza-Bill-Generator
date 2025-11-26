//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //   Pizza basePizza = new Pizza(false);
//        basePizza.addExtraCheese();
//        basePizza.addExtraTopping();
//        basePizza.packingCharges();
//        basePizza.generateBill();
        DeluxPizza deluxPizza = new DeluxPizza(true);
        deluxPizza.packingCharges();
        deluxPizza.generateBill();
    }
}