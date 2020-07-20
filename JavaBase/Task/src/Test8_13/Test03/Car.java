package Test8_13.Test03;

public class Car {
    private String name;
    private String yH;

    public Car() {
    }

    public Car(String name, String yH) {
        this.name = name;
        this.yH = yH;
    }

    public String getName() {
        return name;
    }

    public String getyH() {
        return yH;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setyH(String yH) {
        this.yH = yH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return yH != null ? yH.equals(car.yH) : car.yH == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (yH != null ? yH.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yH='" + yH + '\'' +
                '}';
    }
}
