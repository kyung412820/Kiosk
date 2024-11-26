package running;

import resource.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;
    private List<MenuItem> menuItems;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void displayMenuItems() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s | W %.1f | %s\n", i + 1, menuItems.get(i).getName(), menuItems.get(i).getPrice(), menuItems.get(i).getDescription());
        }
        System.out.println("0. 뒤로가기");
    }
}
