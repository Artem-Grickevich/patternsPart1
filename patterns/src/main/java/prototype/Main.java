package prototype;


import prototype.newimplementation.BookGpt;

public class Main {

    public static void main(String[] args) {
        //попробавл код с refactoring guru но он не работает так как нельза создать в Cookbook конструктор
        //без параметров как предлогает refactoring guru
        /*Cookbook cookbook = new Cookbook();
        cookbook.difficultyLevel = 6;
        cookbook.bookAuthor = "John";
        cookbook.bookName = "Cookbook";*/

        BookGpt book = new BookGpt("patterns", "gpt", 100);
        BookGpt clone = book.clone();

        System.out.println("Original" + book);
        System.out.println("Book clone" + clone);

    }
}