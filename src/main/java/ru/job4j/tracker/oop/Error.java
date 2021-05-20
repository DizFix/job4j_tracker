package ru.job4j.tracker.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error() {
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
    }
    public void printInfo() {
        System.out.println("Активный образ жизни " + active);
        System.out.println("Кол-во проведённых тренировок " + status);
        System.out.println("Не знаю что придумать " + message);
    }

}
