package running;

import resource.MenuItem;

public class Main {
    public static void main(String[] args) {
        // Kiosk 생성
        Kiosk kiosk = new Kiosk();

        // Burgers 메뉴 생성
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Drinks 메뉴 생성
        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coca-Cola", 2.5, "청량한 코카콜라 음료"));
        drinks.addMenuItem(new MenuItem("Sprite", 2.5, "상쾌한 스프라이트 음료"));

        // Desserts 메뉴 생성
        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 맛 아이스크림"));
        desserts.addMenuItem(new MenuItem("Chocolate Cake", 4.5, "진한 초콜릿 케이크"));

        // 메뉴 추가
        kiosk.addMenu(burgers);
        kiosk.addMenu(drinks);
        kiosk.addMenu(desserts);

        // 키오스크 시작
        kiosk.start();
    }
}
