public class Main {
    public static void main(String[] args) {
        /**
         * Создаем новую книжную полку, заполняем её
         */

        Bookshelf closet = new Bookshelf(5);

        closet.addBooks(new Book("Война и мир", "Толстой"));
        closet.addBooks(new Book("Мастер и Маргарита", "Булгаков"));
        closet.addBooks(new Book("Преступление и наказание", "Достоевский"));
        closet.addBooks(new Book("Бесприданница", "Островский"));

        /**
         * Выводим все книги, смотрим, сколько книг на полке
         */

        System.out.println(closet);

        System.out.println(closet.getSize());


        /**
         * Удаляем книгу по названию и проверяем size
         */

        try {
            closet.removeBooksByName("Война и мир");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(closet.getSize());

        /**
         * Добавляем несколько книг, убаждеаемся, что больше 5 (maxCapacity) мы не добавим
         */

        closet.addBooks(new Book("Герой нашего времени", "Лермонтов"));
        closet.addBooks(new Book("Джейн Эйр", "Бронте"));
        closet.addBooks(new Book("Лолита", "Набоков"));

        System.out.println(closet.getSize());


        /**
         * Удаляем книгу по автору и проверяем size
         */

        try {
            closet.removeBooksByAuthor("Островский");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println(closet.getSize());


        /**
         * Ищем книгу по названию (нашли)
         */

        try {
            System.out.println(closet.getBookByName("Мастер и Маргарита"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        /**
         * Ищем книгу по автору (не нашли)
         */

        try {
            System.out.println(closet.getBookByAuthor("Акунин"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}