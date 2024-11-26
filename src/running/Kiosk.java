package running;

import resource.MenuItem;
import resource.UserType;
import running.Cart;
import running.Menu;

import java.util.*;

public class Kiosk {
    private List<Menu> menus;
    private Cart cart;

    public Kiosk() {
        menus = new ArrayList<>();
        cart = new Cart();
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        UserType userType = null;

        try {
            // 사용자 유형 입력 받기
            while (true) {
                System.out.println("주문자 유형을 입력하세요: 1. 국가유공자 2. 군인 3. 학생 4. 일반");
                try {
                    int userChoice = Integer.parseInt(scanner.nextLine());
                    switch (userChoice) {
                        case 1:
                            userType = UserType.VETERAN;
                            break;
                        case 2:
                            userType = UserType.SOLDIER;
                            break;
                        case 3:
                            userType = UserType.STUDENT;
                            break;
                        case 4:
                            userType = UserType.GENERAL;
                            break;
                        default:
                            System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                            continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                }
            }

            while (true) {
                try {
                    System.out.println("[ MAIN MENU ]");
                    for (int i = 0; i < menus.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
                    }
                    System.out.println("0. 종료");

                    int mainChoice = Integer.parseInt(scanner.nextLine());
                    if (mainChoice == 0) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }

                    if (mainChoice < 1 || mainChoice > menus.size()) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        continue;
                    }

                    Menu selectedMenu = menus.get(mainChoice - 1);
                    System.out.printf("\n[ %s MENU ]\n", selectedMenu.getCategoryName());
                    selectedMenu.displayMenuItems();

                    int subChoice = Integer.parseInt(scanner.nextLine());
                    if (subChoice == 0) continue;

                    if (subChoice < 1 || subChoice > selectedMenu.getMenuItems().size()) {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        continue;
                    }

                    MenuItem selectedItem = selectedMenu.getMenuItems().get(subChoice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n", selectedItem.getName(), selectedItem.getPrice(), selectedItem.getDescription());

                    System.out.println("이 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");
                    int addToCart = Integer.parseInt(scanner.nextLine());
                    if (addToCart == 1) {
                        cart.addItem(selectedItem);
                        System.out.println(selectedItem.getName() + " 이 장바구니에 추가되었습니다.");
                    }

                    if (!cart.isEmpty()) {
                        System.out.println("\n[ ORDER MENU ]");
                        System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                        System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                        int orderChoice = Integer.parseInt(scanner.nextLine());

                        if (orderChoice == 4) {
                            cart.displayCart();
                            System.out.println("\n할인 정보를 입력해주세요.");
                            System.out.println("1. 국가유공자 : 10%  2. 군인 : 5%  3. 학생 : 3%  4. 일반 : 0%");
                            int discountChoice = Integer.parseInt(scanner.nextLine());

                            double total = cart.getTotalPrice(userType);
                            System.out.println("\n[ Total ]");
                            System.out.printf("금액: W %.1f\n", total);
                            System.out.println("1. 주문      2. 메뉴판");

                            int actionChoice = Integer.parseInt(scanner.nextLine());
                            if (actionChoice == 1) {
                                System.out.printf("주문이 완료되었습니다. 총 금액은 W %.1f 입니다.\n", total);
                                cart.clear();
                            } else if (actionChoice == 2) {
                                continue;
                            }
                        } else if (orderChoice == 5) {
                            cart.clear();
                            System.out.println("주문이 취소되었습니다.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                }
            }
        } catch (Exception e) {
            System.out.println("예기치 않은 오류가 발생했습니다: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
