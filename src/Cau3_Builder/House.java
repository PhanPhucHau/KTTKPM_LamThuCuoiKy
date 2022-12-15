package Cau3_Builder;

public class House {

    private int walls;
    private int doors;
    private boolean hasPool;
    private String name;
    private String color;

    public House(int walls, int doors, boolean hasPool, String name, String color) {
        this.walls = walls;
        this.doors = doors;
        this.hasPool = hasPool;
        this.name = name;
        this.color = color;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
