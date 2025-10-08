public class HouseBuilder implements HousingBuilder {
    private int size;
    private int price;
    private int rooms;
    private String name;
    private House house;

    public HousingBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public HousingBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HousingBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Housing build() {
        this.house = new House();
        house.setSize(size);
        house.setPrice(price);
        house.setRooms(rooms);
        house.setName(name);
        return house;
    }
}