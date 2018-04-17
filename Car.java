public class Car {
    Integer occupant;
    String color;
    Integer id;


    public Car(Integer occupant, String color, Integer id) {
        this.occupant = occupant;
        this.color = color;
        this.id = id;
    }

    @Override
    public String toString() {
        return "occupant: " + occupant + "color: " + color + "id: " + id;
    }

    public Integer getOccupant() {
        return occupant;
    }

    public void setOccupant(Integer occupant) {
        this.occupant = occupant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!getOccupant().equals(car.getOccupant())) return false;
        if (!getColor().equals(car.getColor())) return false;
        return getId().equals(car.getId());
    }

    @Override
    public int hashCode() {
        int result = getOccupant().hashCode();
        result = 31 * result + getColor().hashCode();
        result = 31 * result + getId().hashCode();
        return result;
    }
}
