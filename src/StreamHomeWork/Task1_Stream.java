package StreamHomeWork;

import java.util.*;



public class Task1_Stream {
    public static void main(String[] args) {
        // фильтрация и сборка объектов типа PERSON
        System.out.println("фильтрация и сборка объектов типа PERSON");
        createPersons();
        System.out.println("трансформация данных");
        dataTransform();
        System.out.println("группировка и подсчёт");
        groupAndCalculate();
    }

    private static void createPersons() {
        List<Person> personList = new ArrayList<>();                       // список персон
        String[] names = {"Марина", "Полина", "Галина", "Екатерина", "Ирина", "Кристина", "Андрей", "Владислав", "Антон", "Святослав", "Димитрий", "Иннокентий"};
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int age = (int) (Math.random() * 10 + 25);            // генерируем случайный возраст
            int a = random.nextInt(12);                    // генерируем случайный возраст
            String sexy;
            if (a < 5) {                                           // Раскидываем случайным образом гендерный тип
                sexy = GenderImplem.FEMALE;                       //Обратились через интерфейс к значению константы FEMALE
            } else {
                sexy = GenderImplem.MALE;                         //Обратились через интерфейс к значению константы MALE
            }
            Person person = new Person(names[a], (short) (age + 5), sexy);
            personList.add(person);                              // заполняем список персонами
        }
        // Распечатаем людей
        personList.forEach(System.out::print);
        // отберём женщин старше 18 лет и выведем их имена
        List<String> list = new ArrayList<>();
        personList.stream().filter((person -> person.getAge() > 18)).filter(person ->
                Objects.equals(person.getGender(), GenderImplem.FEMALE)).forEach(person -> list.add(person.getName()));
        System.out.println();
        list.forEach(System.out::println);
    }
    /*
    2.	Трансформация данных:
	Создайте список строк, представляющих числа в виде строк.
	Преобразуйте этот список в список целых чисел.
	Отфильтруйте только четные числа.
	Преобразуйте их в строковое представление.
	Соберите их в строку, разделенную запятыми

     */
    private static void dataTransform() {
        // список чисел в строковом представлении
        List<String> stringList = Arrays.asList("3", "4", "5", "4", "11", "36", "15", "20", "17", "153", "2323","146", "7");
        List<Integer> integerList = new ArrayList<>();// список чисел
        stringList.forEach(s -> integerList.add(Integer.valueOf(s)));                   // заполняем список, преобразуя данные
        StringBuilder builder = new StringBuilder();
        // фильтруем чётные числа, преобразуем их в строковое представление и собираем их в строку, разделённую ","
        integerList.stream().filter(n -> (n % 2) == 0).forEach(n -> builder.append(n).append(';'));
        builder.delete(builder.length() - 1, builder.length());
        System.out.println(builder);
    }
    /*
    3.	Группировка и подсчет:
	Создайте список объектов Product с полями name, category и price.
	Используя Stream, сгруппируйте продукты по категории.
	Для каждой категории подсчитайте количество продуктов и их суммарную стоимость.

     */
    private static void groupAndCalculate() {
        // создаём список для хранения объектов Product
        List<Product> productList = new ArrayList<>();
        // создадим несколько объектов типа Product и добавим их в список
        String[] categoryName = {Category.FISH, Category.FRUIT, Category.MEAT, Category.VEGETABLE};
        String[] productName = {"хлеб", "молоко", "апельсин", "творог", "говядина", "свинина", "сметана", "лук", "чеснок", "картофель",};
        for (int i = 0; i < 10; i++) {
            // заполняем список случайными данными
            String name = productName[new Random().nextInt(10)];
            String category = categoryName[new Random().nextInt(4)];
            short count = (short) new Random().nextInt(20);
            double price = new Random().nextInt(300) + 0.2;
            Product product = new Product(name, category, count, price);
            productList.add(product);
        }


        System.out.println(Arrays.toString(productList.toArray()));
        // фильтруем по категориям, подсчитываем количество и суммарную стоимость продуктов
        for (String s : categoryName) {
            int count;// количество продуктов указанной категории
            count = productList.stream().filter(p -> p.getCategory().equals(s)).mapToInt(Product::getCount).sum();
            double price;
            price = productList.stream().filter(p -> p.getCategory().equals(s)).mapToDouble(p -> p.getPrice() * p.getCount()).sum();
            System.out.println(s + " count=" + count + ", price=" + price);
        }
    }
}

