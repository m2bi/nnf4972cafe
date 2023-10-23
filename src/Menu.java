import java.util.ArrayList;
import java.util.Scanner;
public class Menu { // 메뉴판 클래스
    ArrayList<Product> coffeeList = new ArrayList<>();
    ArrayList<Product> teaList = new ArrayList<>();
    ArrayList<Product> juiceList = new ArrayList<>();
    ArrayList<Product> cakeList = new ArrayList<>();
    String group;
    public void setGroup(String group) {
        this.group = group;
    }
    public void showMyOrderList () {

    }
    public Menu () {

    }

    //public void getCoffeeMenu () {System.out.println(coffeeList);}

    public int showMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("주문 입력");
        System.out.println("1. 커피");
        System.out.println("2. 차");
        System.out.println("3. 쥬스");
        System.out.println("4. 케잌");
        int selectMain = sc.nextInt();
        System.out.println(selectMain+"을 선택하셨습니다.");
        return selectMain;
    }

    public int showDetail(int s) {
        Scanner sc = new Scanner(System.in);
        int selectDetail = 0;
        switch(s) {
            case 1:
                System.out.println("상세주문 입력");
                System.out.println("1. 에스프레소");
                System.out.println("2. 아메리카노");
                System.out.println("3. 카페라떼");
                System.out.println("4. 카푸치노");
                System.out.println("5. 아포가토");
                selectDetail = sc.nextInt();
                break;
            case 2:
                System.out.println("상세주문 입력");
                System.out.println("1. 보성녹차");
                System.out.println("2. 쟈스민");
                System.out.println("3. 얼그레이");
                selectDetail = sc.nextInt();
                break;
            case 3:
                System.out.println("상세주문 입력");
                System.out.println("1. 오렌지쥬스");
                System.out.println("2. 딸기쥬스");
                System.out.println("3. 키위쥬스");
                System.out.println("4. 바나나쥬스");
                System.out.println("5. 사과쥬스");
                selectDetail = sc.nextInt();
                break;
            case 4:
                System.out.println("상세주문 입력");
                System.out.println("1. 치즈케잌");
                System.out.println("2. 초코케잌");
                System.out.println("3. 고구마케잌");
                System.out.println("4. 생크림케잌");
                selectDetail = sc.nextInt();
                break;
        }
        return selectDetail;
    }

    public void show() {
        //System.out.println(showMain());
        int a = showMain();
        int b = showDetail(a);
        System.out.println(b+"를 선택하셨습니다");
    }
}