public class Practicum1Car {
    static String brand1, brand2, brand3, brand4, brand5,
                  brand6, brand7, brand8, brand9, brand10;

    static int year1, year2, year3, year4, year5,
               year6, year7, year8, year9, year10;

    static String color1, color2, color3, color4, color5,
                   color6, color7, color8, color9, color10;

    static void setBrand1(String brand) { brand1 = brand; }
    static String getBrand1() { return brand1; }
    static void setYear1(int year) { year1 = year; }
    static int getYear1() { return year1; }
    static void setColor1(String color) { color1 = color; }
    static String getColor1() { return color1; }

    static void setBrand2(String brand) { brand2 = brand; }
    static String getBrand2() { return brand2; }
    static void setYear2(int year) { year2 = year; }
    static int getYear2() { return year2; }
    static void setColor2(String color) { color2 = color; }
    static String getColor2() { return color2; }

    static void setBrand3(String brand) { brand3 = brand; }
    static String getBrand3() { return brand3; }
    static void setYear3(int year) { year3 = year; }
    static int getYear3() { return year3; }
    static void setColor3(String color) { color3 = color; }
    static String getColor3() { return color3; }

    static void setBrand4(String brand) { brand4 = brand; }
    static String getBrand4() { return brand4; }
    static void setYear4(int year) { year4 = year; }
    static int getYear4() { return year4; }
    static void setColor4(String color) { color4 = color; }
    static String getColor4() { return color4; }

    static void setBrand5(String brand) { brand5 = brand; }
    static String getBrand5() { return brand5; }
    static void setYear5(int year) { year5 = year; }
    static int getYear5() { return year5; }
    static void setColor5(String color) { color5 = color; }
    static String getColor5() { return color5; }

    static void setBrand6(String brand) { brand6 = brand; }
    static String getBrand6() { return brand6; }
    static void setYear6(int year) { year6 = year; }
    static int getYear6() { return year6; }
    static void setColor6(String color) { color6 = color; }
    static String getColor6() { return color6; }

    static void setBrand7(String brand) { brand7 = brand; }
    static String getBrand7() { return brand7; }
    static void setYear7(int year) { year7 = year; }
    static int getYear7() { return year7; }
    static void setColor7(String color) { color7 = color; }
    static String getColor7() { return color7; }

    static void setBrand8(String brand) { brand8 = brand; }
    static String getBrand8() { return brand8; }
    static void setYear8(int year) { year8 = year; }
    static int getYear8() { return year8; }
    static void setColor8(String color) { color8 = color; }
    static String getColor8() { return color8; }

    static void setBrand9(String brand) { brand9 = brand; }
    static String getBrand9() { return brand9; }
    static void setYear9(int year) { year9 = year; }
    static int getYear9() { return year9; }
    static void setColor9(String color) { color9 = color; }
    static String getColor9() { return color9; }

    static void setBrand10(String brand) { brand10 = brand; }
    static String getBrand10() { return brand10; }
    static void setYear10(int year) { year10 = year; }
    static int getYear10() { return year10; }
    static void setColor10(String color) { color10 = color; }
    static String getColor10() { return color10; }

    public static void main(String[] args) {
        setBrand1("Toyota"); setYear1(2020); setColor1("Red");
        setBrand2("Honda"); setYear2(2019); setColor2("Black");
        setBrand3("Ford"); setYear3(2021); setColor3("Blue");
        setBrand4("BMW"); setYear4(2018); setColor4("White");
        setBrand5("Audi"); setYear5(2022); setColor5("Silver");
        setBrand6("Nissan"); setYear6(2020); setColor6("Gray");
        setBrand7("Mazda"); setYear7(2021); setColor7("Green");
        setBrand8("Tesla"); setYear8(2022); setColor8("Black");
        setBrand9("Kia"); setYear9(2017); setColor9("Yellow");
        setBrand10("Hyundai"); setYear10(2019); setColor10("Blue");

        System.out.println("Car Data");
        System.out.println("1. " + getBrand1() + " - " + getYear1() + " - " + getColor1());
        System.out.println("2. " + getBrand2() + " - " + getYear2() + " - " + getColor2());
        System.out.println("3. " + getBrand3() + " - " + getYear3() + " - " + getColor3());
        System.out.println("4. " + getBrand4() + " - " + getYear4() + " - " + getColor4());
        System.out.println("5. " + getBrand5() + " - " + getYear5() + " - " + getColor5());
        System.out.println("6. " + getBrand6() + " - " + getYear6() + " - " + getColor6());
        System.out.println("7. " + getBrand7() + " - " + getYear7() + " - " + getColor7());
        System.out.println("8. " + getBrand8() + " - " + getYear8() + " - " + getColor8());
        System.out.println("9. " + getBrand9() + " - " + getYear9() + " - " + getColor9());
        System.out.println("10. " + getBrand10() + " - " + getYear10() + " - " + getColor10());
    }
}
