package home_work_4.generics;


import home_work_4.utils.DataContainerIterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

//1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например литерал T.
// Данный класс как раз и будет решать задачу поставленную перед нами:
// хранить неограниченное количество передаваемых объектов обобщённого типа.
public class DataContainer <T> implements Iterable <T> {

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
        int i;
        if (item == null) {
            return -1;
        }
        for (i = 0; i <= data.length; i++) {
            if (i == data.length) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                break;
            } else if (data[i] == null) {
                data[i] = item;
                break;
            }
        }
        return i;
    }


    public T get(int index) {
        if (index < data.length && index >= 0) {
            return data[index];
        } else {
            return null;
        }
    }

//7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
    public boolean delete(int index) {
        if (index > data.length - 1 || index < 0) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            data = Arrays.copyOf(data, data.length - 1);
        }
        return true;
    }

//8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
    public boolean delete(T item) {
        if (item == null) {
            return false;
        } else
            for (int i = 0; i <= data.length - 1; i++) {
                if (item.equals(data[i])) {
                    for (int j = i; j < data.length; j++) {
                        if (j < data.length - 1) {
                            data[j] = data[j + 1];
                        } else if (j == data.length - 1)
                            data[j] = null;
                    }
                    data = Arrays.copyOf(data, data.length - 1);

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
        sort(this, comparator);
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
                stb.append(", ").append(data[i]);
            }
        }
        return "[" +  stb + "]";
    }

//11.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
// с дженериком extends Comparable. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
// DataContainer используя реализацию сравнения вызываемый у хранимых объектов. Для этого надо сделать
// дженерик метод.
    public static <E extends Comparable<E>> void sort (DataContainer<E> container){
        Comparator<E> cmp = (E e1, E e2) -> {
            return e1.compareTo(e2);
        };
        sort(container, cmp);
    }



    //12.* В DataContainer добавить СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container,
    // Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию интерфейса
//Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer
// используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
    public static <T> void sort(DataContainer<T> datac, Comparator<T> comparator) {
        Comparator <T> cmp = Comparator.nullsLast(comparator);
        for (int j = datac.data.length - 1; j >= 1; j--){
            for (int i = 0; i < datac.data.length - 1; i++) {
                if (cmp.compare(datac.data[i], datac.data[i + 1]) > 0) {
                    T tmp = datac.data[i];
                    datac.data[i] = datac.data[i + 1];
                    datac.data[i + 1] = tmp;
                }
            }
        }
    }


    //13.** Реализовать в DataContainer интерфейс Iterable

    //eдинственный метод интерфейса, возвращающий объект Iterator.
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator(data);
    }
}


