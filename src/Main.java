public class Main {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1");

        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.productionCountry = "России";
        lada.color = "желтый";
        lada.productionYear = 2015;
        lada.engineVolume = 1.7;
        lada.conclusion();

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.productionCountry = "Германии";
        audi.color = "черный";
        audi.productionYear = 2020;
        audi.engineVolume = 3.0;
        audi.conclusion();

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionCountry = "Германии";
        bmw.color = "черный";
        bmw.productionYear = 2021;
        bmw.engineVolume = 3.0;
        bmw.conclusion();

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.productionCountry = "Южной Корее";
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.engineVolume = 2.0;
        kia.conclusion();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionCountry = "Южной Корее";
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.engineVolume = 1.6;
        hyundai.conclusion();


        // Задание 2.
        System.out.println("Задание 2");

        Car lada2 = new Car("Lada", "Granta", "России",
                "желтый", 1.7, 2015);
        Car audi2 = new Car("Audi", "A8 50 L TDI quattro", "Германии",
                "черный ", 3.0, 2020);
        Car bmw2 = new Car("BMW", "Z8", "Германии",
                "черный", 3.0, 2021);
        Car kia2 = new Car("Kia","Sportage 4-го поколения","Южной Корее",
                "красный",2.0, 2018);
        Car hyundai2 = new Car("Hyundai", "Avante", "Южной Корее",
                "оранжевый", 1.6, 2016);
        System.out.println(lada2);
        System.out.println(audi2);
        System.out.println(bmw2);
        System.out.println(kia2);
        System.out.println(hyundai2);


        //Задание 3
        System.out.println("Задание 3");

        Car lada3 = new Car(null, "Granta", "России", "желтый",
                1.7, 2015);
        Car audi3 = new Car("Audi", null, "Германии",
                "черный ", 3.0, 2020);
        Car bmw3 = new Car("BMW", "Z8", null, "черный",
                3.0, 2021);
        Car kia3 = new Car("Kia","Sportage 4-го поколения","Южной Корее",
                null,2.0, 0);
        Car hyundai3 = new Car("Hyundai", "Avante", "Южной Корее",
                "оранжевый", 0, 2016);

        System.out.println(lada3);
        System.out.println(audi3);
        System.out.println(bmw3);
        System.out.println(kia3);
        System.out.println(hyundai3);

    }
}