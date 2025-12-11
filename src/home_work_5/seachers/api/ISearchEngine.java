package home_work_5.seachers.api;

public  interface ISearchEngine{
    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте.
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return количестве раз которое встречается слово в тексте
     */
    long search(String text, String word);

}
