import java.sql.SQLOutput;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car() {
    }

    void conclusion() {
        System.out.println(brand +" "+ model +", цвет кузова — " + color + ", год выпуска — "+ productionYear
                +", сборка в "+ productionCountry+", объем двигателя — "+ engineVolume+" л.");
    }

    public Car(String brand, String model, String productionCountry, String color,
        double engineVolume, int productionYear) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public String toString() {
        return brand +" "+ model +", цвет кузова — " + color + ", год выпуска — "+ productionYear
                +", сборка в "+ productionCountry+", объем двигателя — "+ engineVolume+" л.";
    }
}
