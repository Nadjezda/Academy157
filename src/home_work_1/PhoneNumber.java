package home_work_1;

public class PhoneNumber {
//    Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр
//    и будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
//    Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
//    Например передан массив: {1,2,3,4,5,6,7,8,9,0}, возвращаемый результат: (123) 456-7890.
//    (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java). В задании нельзя использовать колекции, стрима.
public static void main(String[] args) {
    int [] phone = {1,2,3,4,5,6,7,8,9,0};
    System.out.println(createPhoneNumber(phone));
    System.out.println(createPhoneNumber(new int []{4,8,9,5,7,8,6,4,2,1}));

}

    /**
     * Изменение формата введенного номера телефона
     * @param a номер из 10 цифр
     * @return номер из 10 цифр в формате (XXX) XXX-XXXX.
     */
    public static String createPhoneNumber(int [] a) {
        if(a.length > 10 || a.length < 9) {
            return "ERROR";
        }
    return String.format("(%s%s%s) %s%s%s-%s%s%s%s", a[0],a[1],a[2],a[3],a[4],a[5],a[6],a[7],a[8],a[9]);
    }
}

