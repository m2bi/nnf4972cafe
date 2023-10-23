import java.util.ArrayList;
public class Product extends Menu { // 메뉴를 상속
    private String Product;
    private String Name;
    private String Info;
    private float Price;

    public void setName(String name) {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setInfo(String info) {
        this.Info = info;
    }
    public String getInfo() {
        return Info;
    }
    public void setPrice(Float price) {
        this.Price = price;
    }
    public Float getPrice() {
        return Price;
    }
    public Product (String Name, String Info, Float Price) {
        setName(Name);
        setInfo(Info);
        setPrice(Price);
    }

    public void createCoffeeMenu() {
        coffeeList.add(new Product("Espresso", "\t  | W 3.0 | 원두를 블랜딩한 작은 커피 한 잔.", 3.0f));
        coffeeList.add(new Product("Americano Hot", "  | W 3.2 | 에스프레소에 뜨거운 물을 탄 것.", 3.2f));
        coffeeList.add(new Product("Americano Ice", "   | W 3.6 | 에스프레소에 찬 물을 탄 것.", 3.6f));
        coffeeList.add(new Product("CafeLatte Hot", "  | W 4.0 | 우유가 많이든 부드럽고 따뜻한 커피.", 4.0f));
        coffeeList.add(new Product("CafeLatte Ice", "  | W 4.4 | 우유가 많이든 부드럽고 시원한 커피.", 4.4f));
        coffeeList.add(new Product("Cappuccino Hot", " | W 4.0 | 우유 뒤의 커피향이 진하고 따뜻한 커피.", 4.0f));
        coffeeList.add(new Product("Cappuccino Ice", " | W 4.4 | 우유 뒤의 커피향이 진하고 시원한 커피.", 4.4f));
        coffeeList.add(new Product("Affogato", "\t  | W 5.6 | 아이스크림과 같이 먹는 커피.", 5.6f));
        coffeeList.add(new Product("Add Shot", "\t  | W 0.5 | 샷추가 메뉴입니다.", 0.5f));
        coffeeList.add(new Product("Milk Allergy", "\t  | Free  | 우유를 두유로 바꿔드려요.", 0.0f));
    }
    public void createTeaMenu() {
        teaList.add(new Product("Boseong Green Tea", "\t| W 3.6 | 보성에서 직접 가져온 녹찻잎을 우려낸 차", 3.6f));
        teaList.add(new Product("Jasmine Tea", "\t\t| W 4.0 | 심신의 평온함과 안정을 찾아주는 차", 4.0f));
        teaList.add(new Product("Earl Grey Tea", "\t| W 3.8 | 달콤한 디저트와 어울리는 홍차", 3.8f));
        teaList.add(new Product("Oolong Tea", "\t\t| W 3.3 | 향긋하고 진한 우롱차", 3.3f));
        teaList.add(new Product("Apple Mint Tea", "\t| W 3.6 | 입안이 화한기분이 들고 시원한 느낌의 차", 3.6f));
        teaList.add(new Product("Today Tea", "\t\t| W 3.0 | 오늘의 추천 차", 3.0f));
    }
    public void createJuiceMenu() {
        juiceList.add(new Product("Orange Juice", "\t\t| W 5.0 | 상큼한 오렌지를 갈아만든 생과일쥬스", 5.0f));
        juiceList.add(new Product("Strawberry Juice", "\t| W 5.0 | 당도높은 딸기만 선별하여 만든 생과일쥬스", 5.0f));
        juiceList.add(new Product("Kiwi Juice", "\t\t| W 4.8 | 새콤달콤하고 중독성있는 생과일 키위쥬스", 4.8f));
        juiceList.add(new Product("Banana Juice", "\t\t| W 4.8 | 달콤하고 부드러운 맛을 가진 바나나쥬스", 4.8f));
        juiceList.add(new Product("Apple Juice", "\t\t| W 4.6 | 비타민과 달콤함이 둘 다 풍부한 사과쥬스", 4.6f));
        juiceList.add(new Product("Lemonade", "e\t\t| W 5.5 | 레몬향이 물씬 풍기는 레모네이드", 5.5f));
        juiceList.add(new Product("Tengerine Ade", "\t| W 5.3 | 감귤로 된 청이 들어간 에이드", 5.3f));
        juiceList.add(new Product("Green Grape Tea", "\t| W 5.8 | 달콤한 청포도가 들어간 에이드", 5.8f));
    }
    public void createCakeMenu() {
        cakeList.add(new Product("Cheese Cake", "\t\t| W 6.0 | 뉴요커스타일의 치즈케잌", 3.0f));
        cakeList.add(new Product("Chocolate Cake", "\t| W 7.5 | 달콤하고 진한 초코향이 일품", 3.0f));
        cakeList.add(new Product("Sweet Potato Cake", "\t| W 6.8 | 부드럽고 달콤한 고구마케잌", 3.0f));
        cakeList.add(new Product("Whipping Cream Cake", "\t| W 7.7 | 부드러운 생크림에 딸기가 살포시 올라간 케잌", 3.0f));
        cakeList.add(new Product("Apple Pie", "\t\t| W 6.4 | 매일아침 갓 구워낸 달콤한 애플파이", 3.0f));
        cakeList.add(new Product("Walnut Pie", "\t\t| W 7.5 | 매일아침 갓 구운 고소한 호두파이", 3.0f));
    }
    //Product prod = new Product("에스프레소", "진한 원두향을 느낄 수 있습니다!", 3.0f);

}