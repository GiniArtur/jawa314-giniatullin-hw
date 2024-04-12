package Map_works;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
    public class DictionaryWords {
//TODO:     Создать программу по работе со словарем.
//          Например, англо-испанский или французско-немецкий, или любое другое направление. 1 Программа должна:
//            ■ Обеспечивать начальный ввод данных для словаря.
//            ■ Позволять отобразить слово и его переводы.
//            ■ Позволять добавить, заменить, удалить переводы слова.
//            ■ Позволять добавить, заменить, удалить слово.
//            ■ Отображать топ-10 самых популярных слов (определяем популярность на основании счетчика обращений).
//            ■ Отображать топ-10 самых непопулярных слов (определяем непопулярность на основании счетчика обращений)

        private HashMap<String, List<String>> wordsMap = new HashMap<>();
        private HashMap<String, Integer> wordCalls = new HashMap<>();

        public void addWord(String word, String translation) {
            List<String> list = wordsMap.getOrDefault(word, new ArrayList<>());
            list.add(translation);
            wordsMap.put(word, list);
            wordCalls.put(word, 0);
        }

        public void removeWord(String word) {
            wordsMap.remove(word);
            wordCalls.remove(word);
        }

        public void removeTranslation(String word, String translation) {
            List<String> list = wordsMap.getOrDefault(word, null);
            list.remove(translation);
        }

        public String translateWord(String word) {
            int value = wordCalls.get(word);        // получает в качестве аргумента ключ объекта * word* и возвращает его значение
                                                    //количество обращений по этому ключу
            wordCalls.replace(word, value + 1);      // заменяет значение по ключу прибавлением +1 * увеличивает количество обращений*
            return wordsMap.get(word).toString();
        }

        public String[] topMostPopularWords() {
            List<Map.Entry<String, Integer>> topWords = new ArrayList<>(wordCalls.entrySet());
            topWords.sort(Map.Entry.comparingByValue());
            int numberOfPopularWords = 10;
            String[] top = new String[numberOfPopularWords];
            for (int i = 0; i < numberOfPopularWords; i++) {
                top[i] = topWords.getFirst().getKey();
                topWords.removeFirst();
            }
            return top;
        }

        public String[] topLeastPopularWords() {
            List<Map.Entry<String, Integer>> topWords = new ArrayList<>(wordCalls.entrySet());
            topWords.sort(Map.Entry.comparingByValue());
            int numberOfPopularWords = 10;
            String[] top = new String[numberOfPopularWords];
            for (int i = 0; i < numberOfPopularWords; i++) {
                top[i] = topWords.getLast().getKey();
                topWords.removeLast();
            }
            return top;
        }




    }

