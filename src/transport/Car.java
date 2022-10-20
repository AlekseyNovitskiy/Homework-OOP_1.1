package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String tipKuzovat;
    private String registrationNumber;
    private final int numberOfSeats;   // количество мест
    private boolean winterTires;
    private final Key key;
    private final Insurance insurance;

/*

    public void conclusion() {
        System.out.println(brand +" "+ model +", цвет кузова — " + color + ", год выпуска — "+ productionYear
                +", сборка в "+ productionCountry+", объем двигателя — "+ engineVolume+" л.");
    }

 */

    public Car(String brand, String model, String productionCountry, String color,
               double engineVolume, int productionYear, String transmission, String tipKuzovat,
               String registrationNumber, int numberOfSeats, boolean winterTires, Key key, Insurance insurance) {
        this.key = key;
        this.insurance = insurance;

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
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (tipKuzovat == null) {
            this.tipKuzovat = "default";
        } else {
            this.tipKuzovat=tipKuzovat;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        setColor(color);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setWinterTires(winterTires);

    }

    public String toString() {
        if (isWinterTires()) {
            return getBrand() + " " + getModel() + ", цвет кузова — " + getColor() + ", год выпуска — " + getProductionYear()
                    + ", сборка в " + getProductionCountry() + ", объем двигателя — " + getEngineVolume() + " л."
                    + " коробка передач " + getTransmission() + " тип кузова " + getTipKuzovat() + " регистрационный знак "
                    + getRegistrationNumber() + " количество мест " + getNumberOfSeats() + " резина зимняя.";
        }
        else {
            return getBrand() + " " + getModel() + ", цвет кузова — " + getColor() + ", год выпуска — " + getProductionYear()
                    + ", сборка в " + getProductionCountry() + ", объем двигателя — " + getEngineVolume() + " л."
                    + " коробка передач " + getTransmission() + " тип кузова " + getTipKuzovat() + " регистрационный знак "
                    + getRegistrationNumber() + " количество мест " + getNumberOfSeats() + " резина летняя.";
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getTipKuzovat() {
        return tipKuzovat;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }
    public String getTransmission() {

        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public boolean isWinterTires() {
        return winterTires;
    }
    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }
    public boolean isCorrectRegistrationNumber(String registrationNumber) {
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.length() != 9
                || isCorrectRegistrationNumber(registrationNumber)!=true) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public  void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth <= 2 || currentMonth >= 12) {
            this.winterTires = true;
        } else {
            this.winterTires = false;
        }
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            if (number == null) {
                this.number = "default";
            } else {
                this.number = number;
            }
            if (!this.isNumberValid()) {
                System.out.println("Номер страховки некорректный!");
            }
            if (!isInsuranceValid()) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.");
            }
        }
        public boolean isNumberValid() {
            return number.length() == 9;
        }
        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }

}
