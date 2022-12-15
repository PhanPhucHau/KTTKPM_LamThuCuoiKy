package Cau3_Builder;

public class ClientTest {
    public static void main(String[] args) {
        House house = new  HouseBuilder()
                .buildWalls(4)
                .builDoors(4)
                .buildName("Hau")
                .buildColor("Đỏ")
                .build();

        System.out.println(house);

    }
}
