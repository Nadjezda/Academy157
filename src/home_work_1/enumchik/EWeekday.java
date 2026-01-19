package home_work_1.enumchik;

public enum EWeekday {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String rusName;

    EWeekday(String rusName){
        this.rusName = rusName;
    }

    public String getRusName(){
        return rusName;
    }

}
