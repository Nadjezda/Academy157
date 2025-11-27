package home_work_4.generics;


import java.util.Arrays;
import java.util.Comparator;

//1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T.
// Данный класс как раз и будет решать задачу поставленную перед нами:
// хранить неограниченное количество передаваемых объектов обобщённого типа.
public class DataContainer <T> {

//2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено
// для хранения передаваемых объектов. Да, именно T[] а не Object[]. Если использовать Object[]
// то это будет опасно и постоянно придётся делать приведеление типов. Поле обязательно не static и private
    private T[] data;


    public void setData(T[] data) {
        this.data = data;
    }
//6.В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
    public T[] getItems() {
        return data;
    }

//3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
// Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
    public DataContainer(T[] data) {
        this.data = data;
    }

//4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает
// номер позиции в которую были вставлены данные, начиная с 0.
    public int add(T item) {
        int i = 0;
        if (item == null) {
            return -1;
        }
        for (i = 0; i <= data.length; i++) {
            if (i == data.length) {
                T[] copy = Arrays.copyOf(data, data.length + 1);
                copy[copy.length - 1] = item;
                data = copy;
                break;
            } else if (data[i] != null) {
                continue;
            } else if (data[i] == null) {
                data[i] = item;
                break;
            }
        }
        return i;
    }


    public T get(int index) {
        if (index < data.length) {
            return data[index];
        } else {
            return null;
        }
    }

//7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            T[] copy = Arrays.copyOf(data, data.length - 1);
            data = copy;
        }
        return true;
    }

//8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else
            for (int i = 0; i <= data.length - 1; i++) {
                if (!item.equals(data[i])) {
                    continue;
                } else {
                    for (int j = i; j < data.length; j++) {
                        if (j < data.length - 1) {
                            data[j] = data[j + 1];
                        } else if (j == data.length - 1)
                            data[j] = null;
                    }
                    T[] copy = Arrays.copyOf(data, data.length - 1);
                    data = copy;
                    return true;
                }
            }
        return false;
    }

//Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой
// данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator.
// Классом Arrays пользоваться запрещено. Интефейс Comparator обязательно должен быть реализован
// отдельным классом. Для каждого типа данных и сравнений программист создаёт отдельную реализацию интерфейса Comparator.
    public void sort(Comparator<T> comparator) {
        for (int j = data.length - 1; j >= 1; j--){
            for (int i = 0; i < data.length - 1; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 0) {
                    T tmp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = tmp;
                }
                }
            }
    }

//10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
// Запрещено использовать Arrays.toString()
    @Override
    public String toString() {
        StringBuilder  stb = new StringBuilder();
        for (int i = 0; i <= data.length - 1; i++) {
            if (i == 0 & data[i] != null) {
                stb.append(data[i]);
            } else if (i >0 && data[i] != null){
                stb.append(", " + data[i]);
            }
        }
        return "[" +  stb + "]";
    }

//11.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
// с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
// DataContainer используя реализацию сравнения вызываемый у хранимых объектов. Для этого надо сделать
// дженерик метод.
    public static void sort (DataContainer<? extends Comparable> container){

    }
}


