public class Civil extends Air {
    public int passengerAirCapacity;
    public boolean businessCivil;
    public int passengerAir;

    public String describe() {
        super.describe();
        return super.describe() + "; passengerAirCapacity = " +
                passengerAirCapacity + "; businessCivil = " +
                businessCivil;
    }

    public void pasAir() {
        if (passengerAir <= passengerAirCapacity) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println(" Мест нет, ожидайте следующий рейс");
        }
    }

    public void business() {
        if (businessCivil) {
            System.out.println("Бизнес класс имеется \n");
        } else {
            System.out.println("Бизнес класса не имеется  \n");
        }
    }

}


