package Cau3_Builder;

public class HouseBuilder implements Builder{
    private int walls;
    private int doors;
    private boolean hasPool;
    private String name;
    private String color;

    @Override
    public Builder buildPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    @Override
    public Builder buildWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder builDoors(int doors) {
        this.doors= doors;
        return this;
    }

    @Override
    public Builder buildName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder buildColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(walls, doors, hasPool, name, color);
    }
}
