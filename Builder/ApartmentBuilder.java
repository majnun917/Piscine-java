class ApartmentBuilder implements HousingBuilder {
    private int size;
    private int price;
    private int rooms;
    private String name;
    private Apartment apartment;

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
        this.apartment = new Apartment();
        apartment.setSize(size);
        apartment.setPrice(price);
        apartment.setRooms(rooms);
        apartment.setName(name);
        return apartment;
    }
}