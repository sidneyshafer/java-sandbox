import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        //String menuString = Arrays.toString(menu);
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5]; // by default, values are null

        for (int i = 0; i < menu.length; i++) {
            //System.out.println(i + ". " + menu[i]);
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
