package home_work_1.api;

public interface ICommunicationPrinter {
    //9. Переделать задание 6.
    //	9.1 Создать интерфейс ICommunicationPrinter. В данном интерфейсе должен быть объявлен метод String welcom(String name)
    //	9.2 Классы созданные ранее должны реализовывать интерфейс ICommunicationPrinter выполняя поставленную задачу
    //	в задании 6 и более не иметь точки входна внутри себя.
    /**
     * Получение приветственного сообщения
     * @param name имя
     * @return привестсвенное сообщение
     */
    String welcome(String name);
}
