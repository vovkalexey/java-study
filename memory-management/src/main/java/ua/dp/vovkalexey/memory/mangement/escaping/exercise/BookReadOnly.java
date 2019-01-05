package ua.dp.vovkalexey.memory.mangement.escaping.exercise;

public interface BookReadOnly {
    int getId();

    String getTitle();

    String getAuthor();

    String toString();

    //  TODO: check if Price is immutable
    Price getPrice();
}
