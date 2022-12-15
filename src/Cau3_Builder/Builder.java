package Cau3_Builder;

public interface Builder {
    Builder buildPool(boolean hasPool);
    Builder buildWalls(int walls);
    Builder builDoors(int doors);
    Builder buildName(String name);
    Builder buildColor(String color);

    House build();
}
