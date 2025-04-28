import java.util.*;
import java.lang.*;
class EventDate {
    int year, month, day;

    EventDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static ArrayList<EventDate> getValidDates() {
      ArrayList<EventDate> validDates = new ArrayList<>();
validDates.add(new EventDate(2022, 2, 24));
validDates.add(new EventDate(2022, 2, 25));
validDates.add(new EventDate(2022, 2, 26));
validDates.add(new EventDate(2022, 2, 27));
validDates.add(new EventDate(2022, 2, 28));
validDates.add(new EventDate(2022, 3, 1));
validDates.add(new EventDate(2022, 3, 2));
validDates.add(new EventDate(2022, 3, 3));
validDates.add(new EventDate(2022, 3, 4));
validDates.add(new EventDate(2022, 3, 5));
validDates.add(new EventDate(2022, 3, 6));
validDates.add(new EventDate(2022, 3, 7));
validDates.add(new EventDate(2022, 3, 8));
validDates.add(new EventDate(2022, 3, 9));
validDates.add(new EventDate(2022, 3, 10));
validDates.add(new EventDate(2022, 3, 11));
validDates.add(new EventDate(2022, 3, 12));
validDates.add(new EventDate(2022, 3, 13));
validDates.add(new EventDate(2022, 3, 14));
validDates.add(new EventDate(2022, 3, 15));
validDates.add(new EventDate(2022, 3, 16));
validDates.add(new EventDate(2022, 3, 17));
validDates.add(new EventDate(2022, 3, 18));
validDates.add(new EventDate(2022, 3, 19));
validDates.add(new EventDate(2022, 3, 20));
validDates.add(new EventDate(2022, 3, 21));
validDates.add(new EventDate(2022, 3, 22));
validDates.add(new EventDate(2022, 3, 23));
validDates.add(new EventDate(2022, 3, 24));
validDates.add(new EventDate(2022, 3, 25));
validDates.add(new EventDate(2022, 3, 26));
validDates.add(new EventDate(2022, 3, 27));
validDates.add(new EventDate(2022, 3, 28));
validDates.add(new EventDate(2022, 3, 29));
validDates.add(new EventDate(2022, 3, 30));
validDates.add(new EventDate(2022, 3, 31));
validDates.add(new EventDate(2022, 4, 1));
validDates.add(new EventDate(2022, 4, 2));
validDates.add(new EventDate(2022, 4, 3));
validDates.add(new EventDate(2022, 4, 4));
validDates.add(new EventDate(2022, 4, 5));
validDates.add(new EventDate(2022, 4, 6));
validDates.add(new EventDate(2022, 4, 7));
validDates.add(new EventDate(2022, 4, 8));
validDates.add(new EventDate(2022, 4, 9));
validDates.add(new EventDate(2022, 4, 10));
validDates.add(new EventDate(2022, 4, 11));
validDates.add(new EventDate(2022, 4, 12));
validDates.add(new EventDate(2022, 4, 13));
validDates.add(new EventDate(2022, 4, 14));
validDates.add(new EventDate(2022, 4, 15));
validDates.add(new EventDate(2022, 4, 16));
validDates.add(new EventDate(2022, 4, 17));
validDates.add(new EventDate(2022, 4, 18));
validDates.add(new EventDate(2022, 4, 19));
validDates.add(new EventDate(2022, 4, 20));
validDates.add(new EventDate(2022, 4, 21));
validDates.add(new EventDate(2022, 4, 22));
validDates.add(new EventDate(2022, 4, 23));
validDates.add(new EventDate(2022, 4, 24));
validDates.add(new EventDate(2022, 4, 25));
validDates.add(new EventDate(2022, 4, 26));
validDates.add(new EventDate(2022, 4, 27));
validDates.add(new EventDate(2022, 4, 28));
validDates.add(new EventDate(2022, 4, 29));
validDates.add(new EventDate(2022, 4, 30));
validDates.add(new EventDate(2022, 5, 1));
validDates.add(new EventDate(2022, 5, 2));
validDates.add(new EventDate(2022, 5, 3));
validDates.add(new EventDate(2022, 5, 4));
validDates.add(new EventDate(2022, 5, 5));
validDates.add(new EventDate(2022, 5, 6));
validDates.add(new EventDate(2022, 5, 7));
validDates.add(new EventDate(2022, 5, 8));
validDates.add(new EventDate(2022, 5, 9));
validDates.add(new EventDate(2022, 5, 10));
validDates.add(new EventDate(2022, 5, 11));
validDates.add(new EventDate(2022, 5, 12));
validDates.add(new EventDate(2022, 5, 13));
validDates.add(new EventDate(2022, 5, 14));
validDates.add(new EventDate(2022, 5, 15));
validDates.add(new EventDate(2022, 5, 16));
validDates.add(new EventDate(2022, 5, 17));
validDates.add(new EventDate(2022, 5, 18));
validDates.add(new EventDate(2022, 5, 19));
validDates.add(new EventDate(2022, 5, 20));
validDates.add(new EventDate(2022, 5, 21));
validDates.add(new EventDate(2022, 5, 22));
validDates.add(new EventDate(2022, 5, 23));
validDates.add(new EventDate(2022, 5, 24));
validDates.add(new EventDate(2022, 5, 25));
validDates.add(new EventDate(2022, 5, 26));
validDates.add(new EventDate(2022, 5, 27));
validDates.add(new EventDate(2022, 5, 28));
validDates.add(new EventDate(2022, 5, 29));
validDates.add(new EventDate(2022, 5, 30));
validDates.add(new EventDate(2022, 5, 31));
validDates.add(new EventDate(2022, 6, 1));
validDates.add(new EventDate(2022, 6, 2));
validDates.add(new EventDate(2022, 6, 3));
validDates.add(new EventDate(2022, 6, 4));
validDates.add(new EventDate(2022, 6, 5));
validDates.add(new EventDate(2022, 6, 6));
validDates.add(new EventDate(2022, 6, 7));
validDates.add(new EventDate(2022, 6, 8));
validDates.add(new EventDate(2022, 6, 9));
validDates.add(new EventDate(2022, 6, 10));
validDates.add(new EventDate(2022, 6, 11));
validDates.add(new EventDate(2022, 6, 12));
validDates.add(new EventDate(2022, 6, 13));
validDates.add(new EventDate(2022, 6, 14));
validDates.add(new EventDate(2022, 6, 15));
validDates.add(new EventDate(2022, 6, 16));
validDates.add(new EventDate(2022, 6, 17));
validDates.add(new EventDate(2022, 6, 18));
validDates.add(new EventDate(2022, 6, 19));
validDates.add(new EventDate(2022, 6, 20));
validDates.add(new EventDate(2022, 6, 21));
validDates.add(new EventDate(2022, 6, 22));
validDates.add(new EventDate(2022, 6, 23));
validDates.add(new EventDate(2022, 6, 24));
validDates.add(new EventDate(2022, 6, 25));
validDates.add(new EventDate(2022, 6, 26));
validDates.add(new EventDate(2022, 6, 27));
validDates.add(new EventDate(2022, 6, 28));
validDates.add(new EventDate(2022, 6, 29));
validDates.add(new EventDate(2022, 6, 30));
validDates.add(new EventDate(2022, 7, 1));
validDates.add(new EventDate(2022, 7, 2));
validDates.add(new EventDate(2022, 7, 3));
validDates.add(new EventDate(2022, 7, 4));
validDates.add(new EventDate(2022, 7, 5));
validDates.add(new EventDate(2022, 7, 6));
validDates.add(new EventDate(2022, 7, 7));
validDates.add(new EventDate(2022, 7, 8));
validDates.add(new EventDate(2022, 7, 9));
validDates.add(new EventDate(2022, 7, 10));
validDates.add(new EventDate(2022, 7, 11));
validDates.add(new EventDate(2022, 7, 12));
validDates.add(new EventDate(2022, 7, 13));
validDates.add(new EventDate(2022, 7, 14));
validDates.add(new EventDate(2022, 7, 15));
validDates.add(new EventDate(2022, 7, 16));
validDates.add(new EventDate(2022, 7, 17));
validDates.add(new EventDate(2022, 7, 18));
validDates.add(new EventDate(2022, 7, 19));
validDates.add(new EventDate(2022, 7, 20));
validDates.add(new EventDate(2022, 7, 21));
validDates.add(new EventDate(2022, 7, 22));
validDates.add(new EventDate(2022, 7, 23));
validDates.add(new EventDate(2022, 7, 24));
validDates.add(new EventDate(2022, 7, 25));
validDates.add(new EventDate(2022, 7, 26));
validDates.add(new EventDate(2022, 7, 27));
validDates.add(new EventDate(2022, 7, 28));
validDates.add(new EventDate(2022, 7, 29));
validDates.add(new EventDate(2022, 7, 30));
validDates.add(new EventDate(2022, 7, 31));
validDates.add(new EventDate(2022, 8, 1));
validDates.add(new EventDate(2022, 8, 2));
validDates.add(new EventDate(2022, 8, 3));
validDates.add(new EventDate(2022, 8, 4));
validDates.add(new EventDate(2022, 8, 5));
validDates.add(new EventDate(2022, 8, 6));
validDates.add(new EventDate(2022, 8, 7));
validDates.add(new EventDate(2022, 8, 8));
validDates.add(new EventDate(2022, 8, 9));
validDates.add(new EventDate(2022, 8, 10));
validDates.add(new EventDate(2022, 8, 11));
validDates.add(new EventDate(2022, 8, 12));
validDates.add(new EventDate(2022, 8, 13));
validDates.add(new EventDate(2022, 8, 14));
validDates.add(new EventDate(2022, 8, 15));
validDates.add(new EventDate(2022, 8, 16));
validDates.add(new EventDate(2022, 8, 17));
validDates.add(new EventDate(2022, 8, 18));
validDates.add(new EventDate(2022, 8, 19));
validDates.add(new EventDate(2022, 8, 20));
validDates.add(new EventDate(2022, 8, 21));
validDates.add(new EventDate(2022, 8, 22));
validDates.add(new EventDate(2022, 8, 23));
validDates.add(new EventDate(2022, 8, 24));
validDates.add(new EventDate(2022, 8, 25));
validDates.add(new EventDate(2022, 8, 26));
validDates.add(new EventDate(2022, 8, 27));
validDates.add(new EventDate(2022, 8, 28));
validDates.add(new EventDate(2022, 8, 29));
validDates.add(new EventDate(2022, 8, 30));
validDates.add(new EventDate(2022, 8, 31));
validDates.add(new EventDate(2022, 9, 1));
validDates.add(new EventDate(2022, 9, 2));
validDates.add(new EventDate(2022, 9, 3));
validDates.add(new EventDate(2022, 9, 4));
validDates.add(new EventDate(2022, 9, 5));
validDates.add(new EventDate(2022, 9, 6));
validDates.add(new EventDate(2022, 9, 7));
validDates.add(new EventDate(2022, 9, 8));
validDates.add(new EventDate(2022, 9, 9));
validDates.add(new EventDate(2022, 9, 10));
validDates.add(new EventDate(2022, 9, 11));
validDates.add(new EventDate(2022, 9, 12));
validDates.add(new EventDate(2022, 9, 13));
validDates.add(new EventDate(2022, 9, 14));
validDates.add(new EventDate(2022, 9, 15));
validDates.add(new EventDate(2022, 9, 16));
validDates.add(new EventDate(2022, 9, 17));
validDates.add(new EventDate(2022, 9, 18));
validDates.add(new EventDate(2022, 9, 19));
validDates.add(new EventDate(2022, 9, 20));
validDates.add(new EventDate(2022, 9, 21));
validDates.add(new EventDate(2022, 9, 22));
validDates.add(new EventDate(2022, 9, 23));
validDates.add(new EventDate(2022, 9, 24));
validDates.add(new EventDate(2022, 9, 25));
validDates.add(new EventDate(2022, 9, 26));
validDates.add(new EventDate(2022, 9, 27));
validDates.add(new EventDate(2022, 9, 28));
validDates.add(new EventDate(2022, 9, 29));
validDates.add(new EventDate(2022, 9, 30));
validDates.add(new EventDate(2022, 10, 1));
validDates.add(new EventDate(2022, 10, 2));
validDates.add(new EventDate(2022, 10, 3));
validDates.add(new EventDate(2022, 10, 4));
validDates.add(new EventDate(2022, 10, 5));
validDates.add(new EventDate(2022, 10, 6));
validDates.add(new EventDate(2022, 10, 7));
validDates.add(new EventDate(2022, 10, 8));
validDates.add(new EventDate(2022, 10, 9));
validDates.add(new EventDate(2022, 10, 10));
validDates.add(new EventDate(2022, 10, 11));
validDates.add(new EventDate(2022, 10, 12));
validDates.add(new EventDate(2022, 10, 13));
validDates.add(new EventDate(2022, 10, 14));
validDates.add(new EventDate(2022, 10, 15));
validDates.add(new EventDate(2022, 10, 16));
validDates.add(new EventDate(2022, 10, 17));
validDates.add(new EventDate(2022, 10, 18));
validDates.add(new EventDate(2022, 10, 19));
validDates.add(new EventDate(2022, 10, 20));
validDates.add(new EventDate(2022, 10, 21));
validDates.add(new EventDate(2022, 10, 22));
validDates.add(new EventDate(2022, 10, 23));
validDates.add(new EventDate(2022, 10, 24));
validDates.add(new EventDate(2022, 10, 25));
validDates.add(new EventDate(2022, 10, 26));
validDates.add(new EventDate(2022, 10, 27));
validDates.add(new EventDate(2022, 10, 28));
validDates.add(new EventDate(2022, 10, 29));
validDates.add(new EventDate(2022, 10, 30));
validDates.add(new EventDate(2022, 10, 31));
validDates.add(new EventDate(2022, 11, 1));
validDates.add(new EventDate(2022, 11, 2));
validDates.add(new EventDate(2022, 11, 3));
validDates.add(new EventDate(2022, 11, 4));
validDates.add(new EventDate(2022, 11, 5));
validDates.add(new EventDate(2022, 11, 6));
validDates.add(new EventDate(2022, 11, 7));
validDates.add(new EventDate(2022, 11, 8));
validDates.add(new EventDate(2022, 11, 9));
validDates.add(new EventDate(2022, 11, 10));
validDates.add(new EventDate(2022, 11, 11));
validDates.add(new EventDate(2022, 11, 12));
validDates.add(new EventDate(2022, 11, 13));
validDates.add(new EventDate(2022, 11, 14));
validDates.add(new EventDate(2022, 11, 15));
validDates.add(new EventDate(2022, 11, 16));
validDates.add(new EventDate(2022, 11, 17));
validDates.add(new EventDate(2022, 11, 18));
validDates.add(new EventDate(2022, 11, 19));
validDates.add(new EventDate(2022, 11, 20));
validDates.add(new EventDate(2022, 11, 21));
validDates.add(new EventDate(2022, 11, 22));
validDates.add(new EventDate(2022, 11, 23));
validDates.add(new EventDate(2022, 11, 24));
validDates.add(new EventDate(2022, 11, 25));
validDates.add(new EventDate(2022, 11, 26));
validDates.add(new EventDate(2022, 11, 27));
validDates.add(new EventDate(2022, 11, 28));
validDates.add(new EventDate(2022, 11, 29));
validDates.add(new EventDate(2022, 11, 30));
validDates.add(new EventDate(2022, 12, 1));
validDates.add(new EventDate(2022, 12, 2));
validDates.add(new EventDate(2022, 12, 3));
validDates.add(new EventDate(2022, 12, 4));
validDates.add(new EventDate(2022, 12, 5));
validDates.add(new EventDate(2022, 12, 6));
validDates.add(new EventDate(2022, 12, 7));
validDates.add(new EventDate(2022, 12, 8));
validDates.add(new EventDate(2022, 12, 9));
validDates.add(new EventDate(2022, 12, 10));
validDates.add(new EventDate(2022, 12, 11));
validDates.add(new EventDate(2022, 12, 12));
validDates.add(new EventDate(2022, 12, 13));
validDates.add(new EventDate(2022, 12, 14));
validDates.add(new EventDate(2022, 12, 15));
validDates.add(new EventDate(2022, 12, 16));
validDates.add(new EventDate(2022, 12, 17));
validDates.add(new EventDate(2022, 12, 18));
validDates.add(new EventDate(2022, 12, 19));
validDates.add(new EventDate(2022, 12, 20));
validDates.add(new EventDate(2022, 12, 21));
validDates.add(new EventDate(2022, 12, 22));
validDates.add(new EventDate(2022, 12, 23));
validDates.add(new EventDate(2022, 12, 24));
validDates.add(new EventDate(2022, 12, 25));
validDates.add(new EventDate(2022, 12, 26));
validDates.add(new EventDate(2022, 12, 27));
validDates.add(new EventDate(2022, 12, 28));
validDates.add(new EventDate(2022, 12, 29));
validDates.add(new EventDate(2022, 12, 30));
validDates.add(new EventDate(2022, 12, 31));
//ArrayList<EventDate> validDates = new ArrayList<>();
validDates.add(new EventDate(2023, 1, 1));
validDates.add(new EventDate(2023, 1, 2));
validDates.add(new EventDate(2023, 1, 3));
validDates.add(new EventDate(2023, 1, 4));
validDates.add(new EventDate(2023, 1, 5));
validDates.add(new EventDate(2023, 1, 6));
validDates.add(new EventDate(2023, 1, 7));
validDates.add(new EventDate(2023, 1, 8));
validDates.add(new EventDate(2023, 1, 9));
validDates.add(new EventDate(2023, 1, 10));
validDates.add(new EventDate(2023, 1, 11));
validDates.add(new EventDate(2023, 1, 12));
validDates.add(new EventDate(2023, 1, 13));
validDates.add(new EventDate(2023, 1, 14));
validDates.add(new EventDate(2023, 1, 15));
validDates.add(new EventDate(2023, 1, 16));
validDates.add(new EventDate(2023, 1, 17));
validDates.add(new EventDate(2023, 1, 18));
validDates.add(new EventDate(2023, 1, 19));
validDates.add(new EventDate(2023, 1, 20));
validDates.add(new EventDate(2023, 1, 21));
validDates.add(new EventDate(2023, 1, 22));
validDates.add(new EventDate(2023, 1, 23));
validDates.add(new EventDate(2023, 1, 24));
validDates.add(new EventDate(2023, 1, 25));
validDates.add(new EventDate(2023, 1, 26));
validDates.add(new EventDate(2023, 1, 27));
validDates.add(new EventDate(2023, 1, 28));
validDates.add(new EventDate(2023, 1, 29));
validDates.add(new EventDate(2023, 1, 30));
validDates.add(new EventDate(2023, 1, 31));
validDates.add(new EventDate(2023, 2, 1));
validDates.add(new EventDate(2023, 2, 2));
validDates.add(new EventDate(2023, 2, 3));
validDates.add(new EventDate(2023, 2, 4));
validDates.add(new EventDate(2023, 2, 5));
validDates.add(new EventDate(2023, 2, 6));
validDates.add(new EventDate(2023, 2, 7));
validDates.add(new EventDate(2023, 2, 8));
validDates.add(new EventDate(2023, 2, 9));
validDates.add(new EventDate(2023, 2, 10));
validDates.add(new EventDate(2023, 2, 11));
validDates.add(new EventDate(2023, 2, 12));
validDates.add(new EventDate(2023, 2, 13));
validDates.add(new EventDate(2023, 2, 14));
validDates.add(new EventDate(2023, 2, 15));
validDates.add(new EventDate(2023, 2, 16));
validDates.add(new EventDate(2023, 2, 17));
validDates.add(new EventDate(2023, 2, 18));
validDates.add(new EventDate(2023, 2, 19));
validDates.add(new EventDate(2023, 2, 20));
validDates.add(new EventDate(2023, 2, 21));
validDates.add(new EventDate(2023, 2, 22));
validDates.add(new EventDate(2023, 2, 23));
validDates.add(new EventDate(2023, 2, 24));
validDates.add(new EventDate(2023, 2, 25));
validDates.add(new EventDate(2023, 2, 26));
validDates.add(new EventDate(2023, 2, 27));
validDates.add(new EventDate(2023, 2, 28));
validDates.add(new EventDate(2023, 3, 1));
validDates.add(new EventDate(2023, 3, 2));
validDates.add(new EventDate(2023, 3, 3));
validDates.add(new EventDate(2023, 3, 4));
validDates.add(new EventDate(2023, 3, 5));
validDates.add(new EventDate(2023, 3, 6));
validDates.add(new EventDate(2023, 3, 7));
validDates.add(new EventDate(2023, 3, 8));
validDates.add(new EventDate(2023, 3, 9));
validDates.add(new EventDate(2023, 3, 10));
validDates.add(new EventDate(2023, 3, 11));
validDates.add(new EventDate(2023, 3, 12));
validDates.add(new EventDate(2023, 3, 13));
validDates.add(new EventDate(2023, 3, 14));
validDates.add(new EventDate(2023, 3, 15));
validDates.add(new EventDate(2023, 3, 16));
validDates.add(new EventDate(2023, 3, 17));
validDates.add(new EventDate(2023, 3, 18));
validDates.add(new EventDate(2023, 3, 19));
validDates.add(new EventDate(2023, 3, 20));
validDates.add(new EventDate(2023, 3, 21));
validDates.add(new EventDate(2023, 3, 22));
validDates.add(new EventDate(2023, 3, 23));
validDates.add(new EventDate(2023, 3, 24));
validDates.add(new EventDate(2023, 3, 25));
validDates.add(new EventDate(2023, 3, 26));
validDates.add(new EventDate(2023, 3, 27));
validDates.add(new EventDate(2023, 3, 28));
validDates.add(new EventDate(2023, 3, 29));
validDates.add(new EventDate(2023, 3, 30));
validDates.add(new EventDate(2023, 3, 31));
validDates.add(new EventDate(2023, 4, 1));
validDates.add(new EventDate(2023, 4, 2));
validDates.add(new EventDate(2023, 4, 3));
validDates.add(new EventDate(2023, 4, 4));
validDates.add(new EventDate(2023, 4, 5));
validDates.add(new EventDate(2023, 4, 6));
validDates.add(new EventDate(2023, 4, 7));
validDates.add(new EventDate(2023, 4, 8));
validDates.add(new EventDate(2023, 4, 9));
validDates.add(new EventDate(2023, 4, 10));
validDates.add(new EventDate(2023, 4, 11));
validDates.add(new EventDate(2023, 4, 12));
validDates.add(new EventDate(2023, 4, 13));
validDates.add(new EventDate(2023, 4, 14));
validDates.add(new EventDate(2023, 4, 15));
validDates.add(new EventDate(2023, 4, 16));
validDates.add(new EventDate(2023, 4, 17));
validDates.add(new EventDate(2023, 4, 18));
validDates.add(new EventDate(2023, 4, 19));
validDates.add(new EventDate(2023, 4, 20));
validDates.add(new EventDate(2023, 4, 21));
validDates.add(new EventDate(2023, 4, 22));
validDates.add(new EventDate(2023, 4, 23));
validDates.add(new EventDate(2023, 4, 24));
validDates.add(new EventDate(2023, 4, 25));
validDates.add(new EventDate(2023, 4, 26));
validDates.add(new EventDate(2023, 4, 27));
validDates.add(new EventDate(2023, 4, 28));
validDates.add(new EventDate(2023, 4, 29));
validDates.add(new EventDate(2023, 4, 30));
validDates.add(new EventDate(2023, 5, 1));
validDates.add(new EventDate(2023, 5, 2));
validDates.add(new EventDate(2023, 5, 3));
validDates.add(new EventDate(2023, 5, 4));
validDates.add(new EventDate(2023, 5, 5));
validDates.add(new EventDate(2023, 5, 6));
validDates.add(new EventDate(2023, 5, 7));
validDates.add(new EventDate(2023, 5, 8));
validDates.add(new EventDate(2023, 5, 9));
validDates.add(new EventDate(2023, 5, 10));
validDates.add(new EventDate(2023, 5, 11));
validDates.add(new EventDate(2023, 5, 12));
validDates.add(new EventDate(2023, 5, 13));
validDates.add(new EventDate(2023, 5, 14));
validDates.add(new EventDate(2023, 5, 15));
validDates.add(new EventDate(2023, 5, 16));
validDates.add(new EventDate(2023, 5, 17));
validDates.add(new EventDate(2023, 5, 18));
validDates.add(new EventDate(2023, 5, 19));
validDates.add(new EventDate(2023, 5, 20));
validDates.add(new EventDate(2023, 5, 21));
validDates.add(new EventDate(2023, 5, 22));
validDates.add(new EventDate(2023, 5, 23));
validDates.add(new EventDate(2023, 5, 24));
validDates.add(new EventDate(2023, 5, 25));
validDates.add(new EventDate(2023, 5, 26));
validDates.add(new EventDate(2023, 5, 27));
validDates.add(new EventDate(2023, 5, 28));
validDates.add(new EventDate(2023, 5, 29));
validDates.add(new EventDate(2023, 5, 30));
validDates.add(new EventDate(2023, 5, 31));
validDates.add(new EventDate(2023, 6, 1));
validDates.add(new EventDate(2023, 6, 2));
validDates.add(new EventDate(2023, 6, 3));
validDates.add(new EventDate(2023, 6, 4));
validDates.add(new EventDate(2023, 6, 5));
validDates.add(new EventDate(2023, 6, 6));
validDates.add(new EventDate(2023, 6, 7));
validDates.add(new EventDate(2023, 6, 8));
validDates.add(new EventDate(2023, 6, 9));
validDates.add(new EventDate(2023, 6, 10));
validDates.add(new EventDate(2023, 6, 11));
validDates.add(new EventDate(2023, 6, 12));
validDates.add(new EventDate(2023, 6, 13));
validDates.add(new EventDate(2023, 6, 14));
validDates.add(new EventDate(2023, 6, 15));
validDates.add(new EventDate(2023, 6, 16));
validDates.add(new EventDate(2023, 6, 17));
validDates.add(new EventDate(2023, 6, 18));
validDates.add(new EventDate(2023, 6, 19));
validDates.add(new EventDate(2023, 6, 20));
validDates.add(new EventDate(2023, 6, 21));
validDates.add(new EventDate(2023, 6, 22));
validDates.add(new EventDate(2023, 6, 23));
validDates.add(new EventDate(2023, 6, 24));
validDates.add(new EventDate(2023, 6, 25));
validDates.add(new EventDate(2023, 6, 26));
validDates.add(new EventDate(2023, 6, 27));
validDates.add(new EventDate(2023, 6, 28));
validDates.add(new EventDate(2023, 6, 29));
validDates.add(new EventDate(2023, 6, 30));
validDates.add(new EventDate(2023, 7, 1));
validDates.add(new EventDate(2023, 7, 2));
validDates.add(new EventDate(2023, 7, 3));
validDates.add(new EventDate(2023, 7, 4));
validDates.add(new EventDate(2023, 7, 5));
validDates.add(new EventDate(2023, 7, 6));
validDates.add(new EventDate(2023, 7, 7));
validDates.add(new EventDate(2023, 7, 8));
validDates.add(new EventDate(2023, 7, 9));
validDates.add(new EventDate(2023, 7, 10));
validDates.add(new EventDate(2023, 7, 11));
validDates.add(new EventDate(2023, 7, 12));
validDates.add(new EventDate(2023, 7, 13));
validDates.add(new EventDate(2023, 7, 14));
validDates.add(new EventDate(2023, 7, 15));
validDates.add(new EventDate(2023, 7, 16));
validDates.add(new EventDate(2023, 7, 17));
validDates.add(new EventDate(2023, 7, 18));
validDates.add(new EventDate(2023, 7, 19));
validDates.add(new EventDate(2023, 7, 20));
validDates.add(new EventDate(2023, 7, 21));
validDates.add(new EventDate(2023, 7, 22));
validDates.add(new EventDate(2023, 7, 23));
validDates.add(new EventDate(2023, 7, 24));
validDates.add(new EventDate(2023, 7, 25));
validDates.add(new EventDate(2023, 7, 26));
validDates.add(new EventDate(2023, 7, 27));
validDates.add(new EventDate(2023, 7, 28));
validDates.add(new EventDate(2023, 7, 29));
validDates.add(new EventDate(2023, 7, 30));
validDates.add(new EventDate(2023, 7, 31));
validDates.add(new EventDate(2023, 8, 1));
validDates.add(new EventDate(2023, 8, 2));
validDates.add(new EventDate(2023, 8, 3));
validDates.add(new EventDate(2023, 8, 4));
validDates.add(new EventDate(2023, 8, 5));
validDates.add(new EventDate(2023, 8, 6));
validDates.add(new EventDate(2023, 8, 7));
validDates.add(new EventDate(2023, 8, 8));
validDates.add(new EventDate(2023, 8, 9));
validDates.add(new EventDate(2023, 8, 10));
validDates.add(new EventDate(2023, 8, 11));
validDates.add(new EventDate(2023, 8, 12));
validDates.add(new EventDate(2023, 8, 13));
validDates.add(new EventDate(2023, 8, 14));
validDates.add(new EventDate(2023, 8, 15));
validDates.add(new EventDate(2023, 8, 16));
validDates.add(new EventDate(2023, 8, 17));
validDates.add(new EventDate(2023, 8, 18));
validDates.add(new EventDate(2023, 8, 19));
validDates.add(new EventDate(2023, 8, 20));
validDates.add(new EventDate(2023, 8, 21));
validDates.add(new EventDate(2023, 8, 22));
validDates.add(new EventDate(2023, 8, 23));
validDates.add(new EventDate(2023, 8, 24));
validDates.add(new EventDate(2023, 8, 25));
validDates.add(new EventDate(2023, 8, 26));
validDates.add(new EventDate(2023, 8, 27));
validDates.add(new EventDate(2023, 8, 28));
validDates.add(new EventDate(2023, 8, 29));
validDates.add(new EventDate(2023, 8, 30));
validDates.add(new EventDate(2023, 8, 31));
validDates.add(new EventDate(2023, 9, 1));
validDates.add(new EventDate(2023, 9, 2));
validDates.add(new EventDate(2023, 9, 3));
validDates.add(new EventDate(2023, 9, 4));
validDates.add(new EventDate(2023, 9, 5));
validDates.add(new EventDate(2023, 9, 6));
validDates.add(new EventDate(2023, 9, 7));
validDates.add(new EventDate(2023, 9, 8));
validDates.add(new EventDate(2023, 9, 9));
validDates.add(new EventDate(2023, 9, 10));
validDates.add(new EventDate(2023, 9, 11));
validDates.add(new EventDate(2023, 9, 12));
validDates.add(new EventDate(2023, 9, 13));
validDates.add(new EventDate(2023, 9, 14));
validDates.add(new EventDate(2023, 9, 15));
validDates.add(new EventDate(2023, 9, 16));
validDates.add(new EventDate(2023, 9, 17));
validDates.add(new EventDate(2023, 9, 18));
validDates.add(new EventDate(2023, 9, 19));
validDates.add(new EventDate(2023, 9, 20));
validDates.add(new EventDate(2023, 9, 21));
validDates.add(new EventDate(2023, 9, 22));
validDates.add(new EventDate(2023, 9, 23));
validDates.add(new EventDate(2023, 9, 24));
validDates.add(new EventDate(2023, 8, 25));
validDates.add(new EventDate(2023, 8, 26));
validDates.add(new EventDate(2023, 8, 27));
validDates.add(new EventDate(2023, 8, 28));
validDates.add(new EventDate(2023, 8, 29));
validDates.add(new EventDate(2023, 8, 30));
validDates.add(new EventDate(2023, 8, 31));
validDates.add(new EventDate(2023, 9, 1));
validDates.add(new EventDate(2023, 9, 2));
validDates.add(new EventDate(2023, 9, 3));
validDates.add(new EventDate(2023, 9, 4));
validDates.add(new EventDate(2023, 9, 5));
validDates.add(new EventDate(2023, 9, 6));
validDates.add(new EventDate(2023, 9, 7));
validDates.add(new EventDate(2023, 9, 8));
validDates.add(new EventDate(2023, 9, 9));
validDates.add(new EventDate(2023, 9, 10));
validDates.add(new EventDate(2023, 9, 11));
validDates.add(new EventDate(2023, 9, 12));
validDates.add(new EventDate(2023, 9, 13));
validDates.add(new EventDate(2023, 9, 14));
validDates.add(new EventDate(2023, 9, 15));
validDates.add(new EventDate(2023, 9, 16));
validDates.add(new EventDate(2023, 9, 17));
validDates.add(new EventDate(2023, 9, 18));
validDates.add(new EventDate(2023, 9, 19));
validDates.add(new EventDate(2023, 9, 20));
validDates.add(new EventDate(2023, 9, 21));
validDates.add(new EventDate(2023, 9, 22));
validDates.add(new EventDate(2023, 9, 23));
validDates.add(new EventDate(2023, 9, 24));
validDates.add(new EventDate(2023, 9, 25));
validDates.add(new EventDate(2023, 9, 26));
validDates.add(new EventDate(2023, 9, 27));
validDates.add(new EventDate(2023, 9, 28));
validDates.add(new EventDate(2023, 9, 29));
validDates.add(new EventDate(2023, 9, 30));
validDates.add(new EventDate(2023, 10, 1));
validDates.add(new EventDate(2023, 10, 2));
validDates.add(new EventDate(2023, 10, 3));
validDates.add(new EventDate(2023, 10, 4));
validDates.add(new EventDate(2023, 10, 5));
validDates.add(new EventDate(2023, 10, 6));
validDates.add(new EventDate(2023, 10, 7));
validDates.add(new EventDate(2023, 10, 8));
validDates.add(new EventDate(2023, 10, 9));
validDates.add(new EventDate(2023, 10, 10));
validDates.add(new EventDate(2023, 10, 11));
validDates.add(new EventDate(2023, 10, 12));
validDates.add(new EventDate(2023, 10, 13));
validDates.add(new EventDate(2023, 10, 14));
validDates.add(new EventDate(2023, 10, 15));
validDates.add(new EventDate(2023, 10, 16));
validDates.add(new EventDate(2023, 10, 17));
validDates.add(new EventDate(2023, 10, 18));
validDates.add(new EventDate(2023, 10, 19));
validDates.add(new EventDate(2023, 10, 20));
validDates.add(new EventDate(2023, 10, 21));
validDates.add(new EventDate(2023, 10, 22));
validDates.add(new EventDate(2023, 10, 23));
validDates.add(new EventDate(2023, 10, 24));
validDates.add(new EventDate(2023, 10, 25));
validDates.add(new EventDate(2023, 10, 26));
validDates.add(new EventDate(2023, 10, 27));
validDates.add(new EventDate(2023, 10, 28));
validDates.add(new EventDate(2023, 10, 29));
validDates.add(new EventDate(2023, 10, 30));
validDates.add(new EventDate(2023, 10, 31));
validDates.add(new EventDate(2023, 11, 1));
validDates.add(new EventDate(2023, 11, 2));
validDates.add(new EventDate(2023, 11, 3));
validDates.add(new EventDate(2023, 11, 4));
validDates.add(new EventDate(2023, 11, 5));
validDates.add(new EventDate(2023, 11, 6));
validDates.add(new EventDate(2023, 11, 7));
validDates.add(new EventDate(2023, 11, 8));
validDates.add(new EventDate(2023, 11, 9));
validDates.add(new EventDate(2023, 11, 10));
validDates.add(new EventDate(2023, 11, 11));
validDates.add(new EventDate(2023, 11, 12));
validDates.add(new EventDate(2023, 11, 13));
validDates.add(new EventDate(2023, 11, 14));
validDates.add(new EventDate(2023, 11, 15));
validDates.add(new EventDate(2023, 11, 16));
validDates.add(new EventDate(2023, 11, 17));
validDates.add(new EventDate(2023, 11, 18));
validDates.add(new EventDate(2023, 11, 19));
validDates.add(new EventDate(2023, 11, 20));
validDates.add(new EventDate(2023, 11, 21));
validDates.add(new EventDate(2023, 11, 22));
validDates.add(new EventDate(2023, 11, 23));
validDates.add(new EventDate(2023, 11, 24));
validDates.add(new EventDate(2023, 11, 25));
validDates.add(new EventDate(2023, 11, 26));
validDates.add(new EventDate(2023, 11, 27));
validDates.add(new EventDate(2023, 11, 28));
validDates.add(new EventDate(2023, 11, 29));
validDates.add(new EventDate(2023, 11, 30));
validDates.add(new EventDate(2023, 12, 1));
validDates.add(new EventDate(2023, 12, 2));
validDates.add(new EventDate(2023, 12, 3));
validDates.add(new EventDate(2023, 12, 4));
validDates.add(new EventDate(2023, 12, 5));
validDates.add(new EventDate(2023, 12, 6));
validDates.add(new EventDate(2023, 12, 7));
validDates.add(new EventDate(2023, 12, 8));
validDates.add(new EventDate(2023, 12, 9));
validDates.add(new EventDate(2023, 12, 10));
validDates.add(new EventDate(2023, 12, 11));
validDates.add(new EventDate(2023, 12, 12));
validDates.add(new EventDate(2023, 12, 13));
validDates.add(new EventDate(2023, 12, 14));
validDates.add(new EventDate(2023, 12, 15));
validDates.add(new EventDate(2023, 12, 16));
validDates.add(new EventDate(2023, 12, 17));
validDates.add(new EventDate(2023, 12, 18));
validDates.add(new EventDate(2023, 12, 19));
validDates.add(new EventDate(2023, 12, 20));
validDates.add(new EventDate(2023, 12, 21));
validDates.add(new EventDate(2023, 12, 22));
validDates.add(new EventDate(2023, 12, 23));
validDates.add(new EventDate(2023, 12, 24));
validDates.add(new EventDate(2023, 12, 25));
validDates.add(new EventDate(2023, 12, 26));
validDates.add(new EventDate(2023, 12, 27));
validDates.add(new EventDate(2023, 12, 28));
validDates.add(new EventDate(2023, 12, 29));
validDates.add(new EventDate(2023, 12, 30));
validDates.add(new EventDate(2023, 12, 31));
validDates.add(new EventDate(2024, 1, 1));
validDates.add(new EventDate(2024, 1, 2));
validDates.add(new EventDate(2024, 1, 3));
validDates.add(new EventDate(2024, 1, 4));
validDates.add(new EventDate(2024, 1, 5));
validDates.add(new EventDate(2024, 1, 6));
validDates.add(new EventDate(2024, 1, 7));
validDates.add(new EventDate(2024, 1, 8));
validDates.add(new EventDate(2024, 1, 9));
validDates.add(new EventDate(2024, 1, 10));
validDates.add(new EventDate(2024, 1, 11));
validDates.add(new EventDate(2024, 1, 12));
validDates.add(new EventDate(2024, 1, 13));
validDates.add(new EventDate(2024, 1, 14));
validDates.add(new EventDate(2024, 1, 15));
validDates.add(new EventDate(2024, 1, 16));
validDates.add(new EventDate(2024, 1, 17));
validDates.add(new EventDate(2024, 1, 18));
validDates.add(new EventDate(2024, 1, 19));
validDates.add(new EventDate(2024, 1, 20));
validDates.add(new EventDate(2024, 1, 21));
validDates.add(new EventDate(2024, 1, 22));
validDates.add(new EventDate(2024, 1, 23));
validDates.add(new EventDate(2024, 1, 24));
validDates.add(new EventDate(2024, 1, 25));
validDates.add(new EventDate(2024, 1, 26));
validDates.add(new EventDate(2024, 1, 27));
validDates.add(new EventDate(2024, 1, 28));
validDates.add(new EventDate(2024, 1, 29));
validDates.add(new EventDate(2024, 1, 30));
validDates.add(new EventDate(2024, 1, 31));
validDates.add(new EventDate(2024, 2, 1));
validDates.add(new EventDate(2024, 2, 2));
validDates.add(new EventDate(2024, 2, 3));
validDates.add(new EventDate(2024, 2, 4));
validDates.add(new EventDate(2024, 2, 5));
validDates.add(new EventDate(2024, 2, 6));
validDates.add(new EventDate(2024, 2, 7));
validDates.add(new EventDate(2024, 2, 8));
validDates.add(new EventDate(2024, 2, 9));
validDates.add(new EventDate(2024, 2, 10));
validDates.add(new EventDate(2024, 2, 11));
validDates.add(new EventDate(2024, 2, 12));
validDates.add(new EventDate(2024, 2, 13));
validDates.add(new EventDate(2024, 2, 14));
validDates.add(new EventDate(2024, 2, 15));
validDates.add(new EventDate(2024, 2, 16));
validDates.add(new EventDate(2024, 2, 17));
validDates.add(new EventDate(2024, 2, 18));
validDates.add(new EventDate(2024, 2, 19));
validDates.add(new EventDate(2024, 2, 20));
validDates.add(new EventDate(2024, 2, 21));
validDates.add(new EventDate(2024, 2, 22));
validDates.add(new EventDate(2024, 2, 23));
validDates.add(new EventDate(2024, 2, 24));
validDates.add(new EventDate(2024, 2, 25));
validDates.add(new EventDate(2024, 2, 26));
validDates.add(new EventDate(2024, 2, 27));
validDates.add(new EventDate(2024, 2, 28));
validDates.add(new EventDate(2024, 2, 29));
validDates.add(new EventDate(2024, 3, 1));
validDates.add(new EventDate(2024, 3, 2));
validDates.add(new EventDate(2024, 3, 3));
validDates.add(new EventDate(2024, 3, 4));
validDates.add(new EventDate(2024, 3, 5));
validDates.add(new EventDate(2024, 3, 6));
validDates.add(new EventDate(2024, 3, 7));
validDates.add(new EventDate(2024, 3, 8));
validDates.add(new EventDate(2024, 3, 9));
validDates.add(new EventDate(2024, 3, 10));
validDates.add(new EventDate(2024, 3, 11));
validDates.add(new EventDate(2024, 3, 12));
validDates.add(new EventDate(2024, 3, 13));
validDates.add(new EventDate(2024, 3, 14));
validDates.add(new EventDate(2024, 3, 15));
validDates.add(new EventDate(2024, 3, 16));
validDates.add(new EventDate(2024, 3, 17));
validDates.add(new EventDate(2024, 3, 18));
validDates.add(new EventDate(2024, 3, 19));
validDates.add(new EventDate(2024, 3, 20));
validDates.add(new EventDate(2024, 3, 21));
validDates.add(new EventDate(2024, 3, 22));
validDates.add(new EventDate(2024, 3, 23));
validDates.add(new EventDate(2024, 3, 24));
validDates.add(new EventDate(2024, 3, 25));
validDates.add(new EventDate(2024, 3, 26));
validDates.add(new EventDate(2024, 3, 27));
validDates.add(new EventDate(2024, 3, 28));
validDates.add(new EventDate(2024, 3, 29));
validDates.add(new EventDate(2024, 3, 30));
validDates.add(new EventDate(2024, 3, 31));
validDates.add(new EventDate(2024, 4, 1));
validDates.add(new EventDate(2024, 4, 2));
validDates.add(new EventDate(2024, 4, 3));
validDates.add(new EventDate(2024, 4, 4));
validDates.add(new EventDate(2024, 4, 5));
validDates.add(new EventDate(2024, 4, 6));
validDates.add(new EventDate(2024, 4, 7));
validDates.add(new EventDate(2024, 4, 8));
validDates.add(new EventDate(2024, 4, 9));
validDates.add(new EventDate(2024, 4, 10));
validDates.add(new EventDate(2024, 4, 11));
validDates.add(new EventDate(2024, 4, 12));
validDates.add(new EventDate(2024, 4, 13));
validDates.add(new EventDate(2024, 4, 14));
validDates.add(new EventDate(2024, 4, 15));
validDates.add(new EventDate(2024, 4, 16));
validDates.add(new EventDate(2024, 4, 17));
validDates.add(new EventDate(2024, 4, 18));
validDates.add(new EventDate(2024, 4, 19));
validDates.add(new EventDate(2024, 4, 20));
validDates.add(new EventDate(2024, 4, 21));
validDates.add(new EventDate(2024, 4, 22));
validDates.add(new EventDate(2024, 4, 23));
validDates.add(new EventDate(2024, 4, 24));
validDates.add(new EventDate(2024, 4, 25));
validDates.add(new EventDate(2024, 4, 26));
validDates.add(new EventDate(2024, 4, 27));
validDates.add(new EventDate(2024, 4, 28));
validDates.add(new EventDate(2024, 4, 29));
validDates.add(new EventDate(2024, 4, 30));
validDates.add(new EventDate(2024, 5, 1));
validDates.add(new EventDate(2024, 5, 2));
validDates.add(new EventDate(2024, 5, 3));
validDates.add(new EventDate(2024, 5, 4));
validDates.add(new EventDate(2024, 5, 5));
validDates.add(new EventDate(2024, 5, 6));
validDates.add(new EventDate(2024, 5, 7));
validDates.add(new EventDate(2024, 5, 8));
validDates.add(new EventDate(2024, 5, 9));
validDates.add(new EventDate(2024, 5, 10));
validDates.add(new EventDate(2024, 5, 11));
validDates.add(new EventDate(2024, 5, 12));
validDates.add(new EventDate(2024, 5, 13));
validDates.add(new EventDate(2024, 5, 14));
validDates.add(new EventDate(2024, 5, 15));
validDates.add(new EventDate(2024, 5, 16));
validDates.add(new EventDate(2024, 5, 17));
validDates.add(new EventDate(2024, 5, 18));
validDates.add(new EventDate(2024, 5, 19));
validDates.add(new EventDate(2024, 5, 20));
validDates.add(new EventDate(2024, 5, 21));
validDates.add(new EventDate(2024, 5, 22));
validDates.add(new EventDate(2024, 5, 23));
validDates.add(new EventDate(2024, 5, 24));
validDates.add(new EventDate(2024, 5, 25));
validDates.add(new EventDate(2024, 5, 26));
validDates.add(new EventDate(2024, 5, 27));
validDates.add(new EventDate(2024, 5, 28));
validDates.add(new EventDate(2024, 5, 29));
validDates.add(new EventDate(2024, 5, 30));
validDates.add(new EventDate(2024, 5, 31));
validDates.add(new EventDate(2024, 6, 1));
validDates.add(new EventDate(2024, 6, 2));
validDates.add(new EventDate(2024, 6, 3));
validDates.add(new EventDate(2024, 6, 4));
validDates.add(new EventDate(2024, 6, 5));
validDates.add(new EventDate(2024, 6, 6));
validDates.add(new EventDate(2024, 6, 7));
validDates.add(new EventDate(2024, 6, 8));
validDates.add(new EventDate(2024, 6, 9));
validDates.add(new EventDate(2024, 6, 10));
validDates.add(new EventDate(2024, 6, 11));
validDates.add(new EventDate(2024, 6, 12));
validDates.add(new EventDate(2024, 6, 13));
validDates.add(new EventDate(2024, 6, 14));
validDates.add(new EventDate(2024, 6, 15));
validDates.add(new EventDate(2024, 6, 16));
validDates.add(new EventDate(2024, 6, 17));
validDates.add(new EventDate(2024, 6, 18));
validDates.add(new EventDate(2024, 6, 19));
validDates.add(new EventDate(2024, 6, 20));
validDates.add(new EventDate(2024, 6, 21));
validDates.add(new EventDate(2024, 6, 22));
validDates.add(new EventDate(2024, 6, 23));
validDates.add(new EventDate(2024, 6, 24));
validDates.add(new EventDate(2024, 6, 25));
validDates.add(new EventDate(2024, 6, 26));
validDates.add(new EventDate(2024, 6, 27));
validDates.add(new EventDate(2024, 6, 28));
validDates.add(new EventDate(2024, 6, 29));
validDates.add(new EventDate(2024, 6, 30));
validDates.add(new EventDate(2024, 7, 1));
validDates.add(new EventDate(2024, 7, 2));
validDates.add(new EventDate(2024, 7, 3));
validDates.add(new EventDate(2024, 7, 4));
validDates.add(new EventDate(2024, 7, 5));
validDates.add(new EventDate(2024, 7, 6));
validDates.add(new EventDate(2024, 7, 7));
validDates.add(new EventDate(2024, 7, 8));
validDates.add(new EventDate(2024, 7, 9));
validDates.add(new EventDate(2024, 7, 10));
validDates.add(new EventDate(2024, 7, 11));
validDates.add(new EventDate(2024, 7, 12));
validDates.add(new EventDate(2024, 7, 13));
validDates.add(new EventDate(2024, 7, 14));
validDates.add(new EventDate(2024, 7, 15));
validDates.add(new EventDate(2024, 7, 16));
validDates.add(new EventDate(2024, 7, 17));
validDates.add(new EventDate(2024, 7, 18));
validDates.add(new EventDate(2024, 7, 19));
validDates.add(new EventDate(2024, 7, 20));
validDates.add(new EventDate(2024, 7, 21));
validDates.add(new EventDate(2024, 7, 22));
validDates.add(new EventDate(2024, 7, 23));
validDates.add(new EventDate(2024, 7, 24));
validDates.add(new EventDate(2024, 7, 25));
validDates.add(new EventDate(2024, 7, 26));
validDates.add(new EventDate(2024, 7, 27));
validDates.add(new EventDate(2024, 7, 28));
validDates.add(new EventDate(2024, 7, 29));
validDates.add(new EventDate(2024, 7, 30));
validDates.add(new EventDate(2024, 7, 31));
validDates.add(new EventDate(2024, 8, 1));
validDates.add(new EventDate(2024, 8, 2));
validDates.add(new EventDate(2024, 8, 3));
validDates.add(new EventDate(2024, 8, 4));
validDates.add(new EventDate(2024, 8, 5));
validDates.add(new EventDate(2024, 8, 6));
validDates.add(new EventDate(2024, 8, 7));
validDates.add(new EventDate(2024, 8, 8));
validDates.add(new EventDate(2024, 8, 9));
validDates.add(new EventDate(2024, 8, 10));
validDates.add(new EventDate(2024, 8, 11));
validDates.add(new EventDate(2024, 8, 12));
validDates.add(new EventDate(2024, 8, 13));
validDates.add(new EventDate(2024, 8, 14));
validDates.add(new EventDate(2024, 8, 15));
validDates.add(new EventDate(2024, 8, 16));
validDates.add(new EventDate(2024, 8, 17));
validDates.add(new EventDate(2024, 8, 18));
validDates.add(new EventDate(2024, 8, 19));
validDates.add(new EventDate(2024, 8, 20));
validDates.add(new EventDate(2024, 8, 21));
validDates.add(new EventDate(2024, 8, 22));
validDates.add(new EventDate(2024, 8, 23));
validDates.add(new EventDate(2024, 8, 24));
validDates.add(new EventDate(2024, 8, 25));
validDates.add(new EventDate(2024, 8, 26));
validDates.add(new EventDate(2024, 8, 27));
validDates.add(new EventDate(2024, 8, 28));
validDates.add(new EventDate(2024, 8, 29));
validDates.add(new EventDate(2024, 8, 30));
validDates.add(new EventDate(2024, 8, 31));
validDates.add(new EventDate(2024, 9, 1));
validDates.add(new EventDate(2024, 9, 2));
validDates.add(new EventDate(2024, 9, 3));
validDates.add(new EventDate(2024, 9, 4));
validDates.add(new EventDate(2024, 9, 5));
validDates.add(new EventDate(2024, 9, 6));
validDates.add(new EventDate(2024, 9, 7));
validDates.add(new EventDate(2024, 9, 8));
validDates.add(new EventDate(2024, 9, 9));
validDates.add(new EventDate(2024, 9, 10));
validDates.add(new EventDate(2024, 9, 11));
validDates.add(new EventDate(2024, 9, 12));
validDates.add(new EventDate(2024, 9, 13));
validDates.add(new EventDate(2024, 9, 14));
validDates.add(new EventDate(2024, 9, 15));
validDates.add(new EventDate(2024, 9, 16));
validDates.add(new EventDate(2024, 9, 17));
validDates.add(new EventDate(2024, 9, 18));
validDates.add(new EventDate(2024, 9, 19));
validDates.add(new EventDate(2024, 9, 20));
validDates.add(new EventDate(2024, 9, 21));
validDates.add(new EventDate(2024, 9, 22));
validDates.add(new EventDate(2024, 9, 23));
validDates.add(new EventDate(2024, 9, 24));
validDates.add(new EventDate(2024, 9, 25));
validDates.add(new EventDate(2024, 9, 26));
validDates.add(new EventDate(2024, 9, 27));
validDates.add(new EventDate(2024, 9, 28));
validDates.add(new EventDate(2024, 9, 29));
validDates.add(new EventDate(2024, 9, 30));
validDates.add(new EventDate(2024, 10, 1));
validDates.add(new EventDate(2024, 10, 2));
validDates.add(new EventDate(2024, 10, 3));
validDates.add(new EventDate(2024, 10, 4));
validDates.add(new EventDate(2024, 10, 5));
validDates.add(new EventDate(2024, 10, 6));
validDates.add(new EventDate(2024, 10, 7));
validDates.add(new EventDate(2024, 10, 8));
validDates.add(new EventDate(2024, 10, 9));
validDates.add(new EventDate(2024, 10, 10));
validDates.add(new EventDate(2024, 10, 11));
validDates.add(new EventDate(2024, 10, 12));
validDates.add(new EventDate(2024, 10, 13));
validDates.add(new EventDate(2024, 10, 14));
validDates.add(new EventDate(2024, 10, 15));
validDates.add(new EventDate(2024, 10, 16));
validDates.add(new EventDate(2024, 10, 17));
validDates.add(new EventDate(2024, 10, 18));
validDates.add(new EventDate(2024, 10, 19));
validDates.add(new EventDate(2024, 10, 20));
validDates.add(new EventDate(2024, 10, 21));
validDates.add(new EventDate(2024, 10, 22));
validDates.add(new EventDate(2024, 10, 23));
validDates.add(new EventDate(2024, 10, 24));
validDates.add(new EventDate(2024, 10, 25));
validDates.add(new EventDate(2024, 10, 26));
validDates.add(new EventDate(2024, 10, 27));
validDates.add(new EventDate(2024, 10, 28));
validDates.add(new EventDate(2024, 10, 29));
validDates.add(new EventDate(2024, 10, 30));
validDates.add(new EventDate(2024, 10, 31));
validDates.add(new EventDate(2024, 11, 1));
validDates.add(new EventDate(2024, 11, 2));
validDates.add(new EventDate(2024, 11, 3));
validDates.add(new EventDate(2024, 11, 4));
validDates.add(new EventDate(2024, 11, 5));
validDates.add(new EventDate(2024, 11, 6));
validDates.add(new EventDate(2024, 11, 7));
validDates.add(new EventDate(2024, 11, 8));
validDates.add(new EventDate(2024, 11, 9));
validDates.add(new EventDate(2024, 11, 10));
validDates.add(new EventDate(2024, 11, 11));
validDates.add(new EventDate(2024, 11, 12));
validDates.add(new EventDate(2024, 11, 13));
validDates.add(new EventDate(2024, 11, 14));
validDates.add(new EventDate(2024, 11, 15));
validDates.add(new EventDate(2024, 11, 16));
validDates.add(new EventDate(2024, 11, 17));
validDates.add(new EventDate(2024, 11, 18));
validDates.add(new EventDate(2024, 11, 19));
validDates.add(new EventDate(2024, 11, 20));
validDates.add(new EventDate(2024, 11, 21));
validDates.add(new EventDate(2024, 11, 22));
validDates.add(new EventDate(2024, 11, 23));
validDates.add(new EventDate(2024, 11, 24));
validDates.add(new EventDate(2024, 11, 25));
validDates.add(new EventDate(2024, 11, 26));
validDates.add(new EventDate(2024, 11, 27));
validDates.add(new EventDate(2024, 11, 28));
validDates.add(new EventDate(2024, 11, 29));
validDates.add(new EventDate(2024, 11, 30));
validDates.add(new EventDate(2024, 12, 1));
validDates.add(new EventDate(2024, 12, 2));
validDates.add(new EventDate(2024, 12, 3));
validDates.add(new EventDate(2024, 12, 4));
validDates.add(new EventDate(2024, 12, 5));
validDates.add(new EventDate(2024, 12, 6));
validDates.add(new EventDate(2024, 12, 7));
validDates.add(new EventDate(2024, 12, 8));
validDates.add(new EventDate(2024, 12, 9));
validDates.add(new EventDate(2024, 12, 10));
validDates.add(new EventDate(2024, 12, 11));
validDates.add(new EventDate(2024, 12, 12));
validDates.add(new EventDate(2024, 12, 13));
validDates.add(new EventDate(2024, 12, 14));
validDates.add(new EventDate(2024, 12, 15));
validDates.add(new EventDate(2024, 12, 16));
validDates.add(new EventDate(2024, 12, 17));
validDates.add(new EventDate(2024, 12, 18));
validDates.add(new EventDate(2024, 12, 19));
validDates.add(new EventDate(2024, 12, 20));
validDates.add(new EventDate(2024, 12, 21));
validDates.add(new EventDate(2024, 12, 22));
validDates.add(new EventDate(2024, 12, 23));
validDates.add(new EventDate(2024, 12, 24));
validDates.add(new EventDate(2024, 12, 25));
validDates.add(new EventDate(2024, 12, 26));
validDates.add(new EventDate(2024, 12, 27));
validDates.add(new EventDate(2024, 12, 28));
validDates.add(new EventDate(2024, 12, 29));
validDates.add(new EventDate(2024, 12, 30));
validDates.add(new EventDate(2024, 12, 31));
validDates.add(new EventDate(2025, 1, 1));
validDates.add(new EventDate(2025, 1, 2));
validDates.add(new EventDate(2025, 1, 3));
validDates.add(new EventDate(2025, 1, 4));
validDates.add(new EventDate(2025, 1, 5));
validDates.add(new EventDate(2025, 1, 6));
validDates.add(new EventDate(2025, 1, 7));
validDates.add(new EventDate(2025, 1, 8));
validDates.add(new EventDate(2025, 1, 9));
validDates.add(new EventDate(2025, 1, 10));
validDates.add(new EventDate(2025, 1, 11));
validDates.add(new EventDate(2025, 1, 12));
validDates.add(new EventDate(2025, 1, 13));
validDates.add(new EventDate(2025, 1, 14));
validDates.add(new EventDate(2025, 1, 15));
validDates.add(new EventDate(2025, 1, 16));
validDates.add(new EventDate(2025, 1, 17));
validDates.add(new EventDate(2025, 1, 18));
validDates.add(new EventDate(2025, 1, 19));
validDates.add(new EventDate(2025, 1, 20));
validDates.add(new EventDate(2025, 1, 21));
validDates.add(new EventDate(2025, 1, 22));
validDates.add(new EventDate(2025, 1, 23));
validDates.add(new EventDate(2025, 1, 24));
validDates.add(new EventDate(2025, 1, 25));
validDates.add(new EventDate(2025, 1, 26));
validDates.add(new EventDate(2025, 1, 27));
validDates.add(new EventDate(2025, 1, 28));
validDates.add(new EventDate(2025, 1, 29));
validDates.add(new EventDate(2025, 1, 30));
validDates.add(new EventDate(2025, 1, 31));
validDates.add(new EventDate(2025, 2, 1));
validDates.add(new EventDate(2025, 2, 2));
validDates.add(new EventDate(2025, 2, 3));
validDates.add(new EventDate(2025, 2, 4));
validDates.add(new EventDate(2025, 2, 5));
validDates.add(new EventDate(2025, 2, 6));
validDates.add(new EventDate(2025, 2, 7));
validDates.add(new EventDate(2025, 2, 8));
validDates.add(new EventDate(2025, 2, 9));
validDates.add(new EventDate(2025, 2, 10));
validDates.add(new EventDate(2025, 2, 11));
validDates.add(new EventDate(2025, 2, 12));
validDates.add(new EventDate(2025, 2, 13));
validDates.add(new EventDate(2025, 2, 14));
validDates.add(new EventDate(2025, 2, 15));
validDates.add(new EventDate(2025, 2, 16));
validDates.add(new EventDate(2025, 2, 17));
validDates.add(new EventDate(2025, 2, 18));
validDates.add(new EventDate(2025, 2, 19));
validDates.add(new EventDate(2025, 2, 20));
validDates.add(new EventDate(2025, 2, 21));
validDates.add(new EventDate(2025, 2, 22));
validDates.add(new EventDate(2025, 2, 23));
validDates.add(new EventDate(2025, 2, 24));
      return validDates;
  }
  
}

class Ukraine{
  
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int year,day,month,o;
Ukraine u=new Ukraine();
ArrayList<EventDate> validDates = EventDate.getValidDates();
while(true){
System.out.println("KOZATSKOHO RODU (Cossack Nation)-RUSSO-UKRAINIAN WAR TIMELINE TRACKER");
System.out.println("------------------------------");
System.out.println("|                            |");
System.out.println("|                            |");
System.out.println("|                            |");
System.out.println("------------------------------");
System.out.println("|                            |");
System.out.println("|                            |");
System.out.println("|                            |");
System.out.println("------------------------------");
System.out.println("Enter operations:\n1. Get an event by giving day, month and year\n2. Random event generator\n3. Search for a keyword\nPress 0 to exit");
o=s.nextInt();
if (o == 0) {
  System.out.println("\nSlava Ukraini, Heroyam Slava!\n(Glory to Ukraine, Glory to Heroes!)");
  System.exit(0); // exits the program
}
switch(o){
case 1:
          System.out.println("1. Enter a year from 2022-2025:");
          year=s.nextInt();
          switch(year){
            case 2022:
                 //month in 2022
                 System.out.println("1. Enter a month in 2022(2-February,....,12-December):");
                 month=s.nextInt();
                 switch(month){
                    //day in 2022
                 case 2:
                    System.out.println("1. Enter a day in February 2022(24-28) :");
                    day=s.nextInt();
                    switch(day){
            case 24:
System.out.println("Battle of Chernobyl:Russian troops enter the Chernobyl Exclusion Zone. Ukraine says that Russian forces have captured the Chernobyl Nuclear Power Plant. Ukrainian President Volodymyr Zelenskyy calls the attack on Chernobyl a 'declaration of war on all of Europe'. (Daily Sabah) (The Independent) (Uni");
System.out.println("an) Attack on Snake IslandUkraine reports that Russian Navy warships have attacked Snake Island near the Danube Delta. (IndiaTV) Battle of SumyRussian troops enter Sumy and take control of the road leading from Kyiv to Moscow. Battles for strategic cities on the railway to Sumy are also underway. (N");
System.out.println("ovoye Vremya) Battle of Antonov AirportRussian gunships bombard Hostomel Airport near Kyiv. Ukraine says that three helicopters were shot down in defence. Russian Airborne Forces seized control of the airport, but the Ukrainian Ground Forces have recaptured the airport. (The Moscow Times) (Reuters) ");
System.out.println("(Ukrinform) An-225 Mriya, the largest aircraft in the world by weight and by wingspan, is destroyed during a Russian air strike on the suburb of Kyiv. The plane did not manage to leave Hostomel before hostilities began. (Radio Liberty Ukraine)Battle of Kyiv, Kyiv Offensive The Mayor of Kyiv, Vitali ");
System.out.println("Klitschko, announces a curfew in the capital from 10 p.m. to 7 a.m. (Reuters) Russian President Vladimir Putin orders a military operation to 'demilitarise and denazify' Ukraine. Putin also warns of 'consequences you have never seen in history' for anyone who tries to interfere or 'create threats fo");
System.out.println("r our country'. (CNN) (AP) Ukraine confirms that Russian Ground Forces have entered Luhansk, Sumy, Kharkiv, Kherson, Chernihiv, and Zhytomyr Oblasts and have also crossed the border from occupied Crimea. Russian troops also attack the port cities of Odesa and Mariupol in amphibious landings. (CNN) (");
System.out.println("The Business Standard) Russia announces that they have taken control of the North Crimean Canal in the Kherson Oblast and have restored the supply of water to Crimea. (Reuters) Russian ballistic and cruise missiles strike multiple Ukrainian cities and airfields, with eighteen people being killed in ");
System.out.println("Odesa. A missile also strikes the Ministry of Defence intelligence headquarters in Kyiv. (CNN) (NDTV) (Reuters) A Ukrainian Air Force Antonov An-26 is shot down and crashes in Obukhiv, killing five crew members, according to the State Emergency Service of Ukraine. (Interfax) An attack on a military ");
System.out.println("unit in Podilsk kills six civilians and injures seven others. (BBC News) Ukraine's military reports that at least 137 of its soldiers have been killed in Eastern Ukraine, with a senior Ukrainian government official estimating that hundreds of Ukrainian troops have been killed by airstrikes. Ukraine'");
System.out.println("s military also says that 50 Russian soldiers have been killed in action. (The Wall Street Journal) (CNN) (The Guardian) Ukrainian President Volodymyr Zelenskyy declares martial law across the country in response to the invasion. Zelenskyy also orders a general military mobilization of fit-to-serve ");
System.out.println("Ukrainian citizens, with men between the ages of 18 and 60 years prohibited from leaving the country. (TASS) (CNN) The Russian Armed Forces says that its 'lightning offensive' has crippled the Ukrainian military and suppressed its air defense systems. However, the Ukrainian Air Force says that it is");
System.out.println(" repelling Russian invaders. (TASS) (BBC News) The Russian Defence Ministry says that it has destroyed 83 Ukrainian 'above-ground military facilities', including 11 aerodromes. (Reuters) Ukraine says that it has shot down six Russian warplanes and two helicopters, and destroyed dozens of enemy armor");
System.out.println("ed vehicles, according to its Joint Centre of Control and Coordination. However, Russian military representatives deny the claims. (Mil.gov.ua) (Firstpost) Russia says that two Russian civilian ships have been hit by anti-ship missiles in the Sea of Azov, causing multiple deaths. Russia subsequently");
System.out.println(" restricts access for civilian vessels on the Sea of Azov. (Ynet) (Reuters) A Turkish-owned vessel is bombed off the coast of Odesa, according to Turkey's Directorate General of Coastal Safety. No casualties are reported. (Daily Sabah) Reactions to the 2021–2022 Russo-Ukrainian crisis Russia–NATO re");
System.out.println("lations Romania, Poland, and the Baltic states agree to trigger article 4 of NATO's North Atlantic Treaty in response to Russian aggression. (ERR) (Digi24) German Foreign Minister Annalena Baerbock states that Germany will launch the full package with the most massive sanctions against Russia. (EURA");
System.out.println("CTIV) Russia–Ukraine relations Ukraine suspends diplomatic relations with Russia in response to the invasion. (The Times of Israel) Lithuanian president Gitanas Nausėda announces that he will sign a decree declaring a state of emergency and asks Seimas to ratify it in an extraordinary session. (ERR)");
System.out.println(" Moldova declares a state of emergency in response to the invasion. Hundreds of Ukrainians are crossing the border, according to President Maia Sandu. (National Post) Ukraine, Belarus and Moldova close their airspaces to commercial aircraft. (ABC News Australia) (Reuters) U.S. President Joe Biden or");
System.out.println("ders Secretary of Defense Lloyd Austin to send 7,000 troops to Germany in order to assist NATO allies. (Reuters) (Army Times)"); 
            break;
case 25:
System.out.println("\nKyiv offensive, Battle of Kyiv: The Ukrainian military says that it has blown up a bridge in order to prevent Russian forces from advancing to Kyiv. (Ukrinform) Ukraine says that Russian troops have entered Kyiv and heavy fighting is underway. Videos on social media show tanks advancing through th");
System.out.println("e city's Obolon neighbourhood. Gunfire and explosions are also reported in the city's Podilskyi District. (BBC News) (The Guardian) The US Department of Defense says that Russia is losing momentum in its attack on Ukraine. (CNN) Millerovo air base attack Ukrainian OTR-21 Tochka missiles attack the M");
System.out.println("illerovo air base in Rostov oblast, Russia, destroying two Russian Air Force warplanes according to Ukrainian officials. Images appear to show the airbase on fire. (Newsweek) (RostovGazeta) Battle of Starobilsk A column of Russian soldiers is defeated by the Ukrainian army in Starobilsk. (Gazeta.ua)");
System.out.println(" Battle of Ivankiv Ukrainian airborne assault troops engage Russian soldiers at Ivankiv and Dymer. (Gazeta.ua) Battle of Chernihiv A captain and corporal from the Russian 11th Guards Air Assault Brigade surrender to the Armed Forces of Ukraine near Chernihiv. (Gazeta.ua) Battle of Sumy Russian force");
System.out.println("s reportedly retreat from Sumy. (Channel 24) Battle of Chernobyl The Ukrainian government's State Nuclear Regulatory Inspectorate says that higher than usual gamma radiation levels have been detected in the Chernobyl Exclusion Zone after the power plant was captured by Russia. (The Telegraph) Battle");
System.out.println(" of Antonov Airport The Russian Defence Ministry says that Russian Airborne Forces have recaptured the strategic Hostomel Airport near Kyiv, after assaulting the airbase with 200 helicopters. (BBC News) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations, 2022 NATO virtual summi");
System.out.println("t During an emergency NATO summit, Secretary General Jens Stoltenberg announces that NATO will provide weapons to Ukraine. He also announces that the NATO Response Force will be activated for the first time in history. (Reuters) (Stars and Stripes) Kazakhstan–Russia relations Kazakhstan will deny Ru");
System.out.println("ssia’s request for troops to join the war. It will also not join Putin’s recognition of Donetsk People's Republic or Luhansk People's Republic. (NBC News) Ukrainian President Volodymyr Zelenskyy accuses European leadership of 'inaction' in face of the Russian invasion, saying 'Like World War II, you");
System.out.println(" said never again, but here it is again and you're not doing enough to respond'. Zelenskyy also calls on citizens across the European Union to protest and force their governments to take more decisive action. (The Business Standard) A Moldovan-flagged chemical tanker is hit by a missile near the Por");
System.out.println("t of Odesa, seriously injuring two crew members, according to Moldova's naval agency. It is unclear who launched the missile. (Reuters) Russian President Vladimir Putin urges the Armed Forces of Ukraine to 'take power in your own hands' and overthrow the Ukrainian government, which he referred to as");
System.out.println(" a 'gang of drug addicts and neo-Nazis'. (The Guardian) Russian foreign ministry spokesperson Maria Zakharova warns both Finland and Sweden that they could face 'detrimental military and political consequences' if they attempt to join NATO. (The Guardian)"); 
            break;
case 26:
System.out.println("Kyiv offensive, Battle of Kyiv Russian Ground Forces attempt to attack an army base near Kyiv on Victory Avenue as well as an electricity generating station in the city. The Ukrainian military says that they repelled both attacks. (Reuters) A residential tower block near Kyiv International Airport i");
System.out.println("s hit by a missile. (Al Jazeera) Ukraine's army claims that its air defences shot down two Russian Ilyushin Il-76 transport planes carrying paratroopers near the cities of Vasylkiv and Bila Tserkva in Kyiv Oblast, but did not provide any video evidence or details on crash sites. Ukraine also claims ");
System.out.println("that a Sukhoi Su-25 attack jet was shot down. (Times of Israel) Battle of Melitopol The Russian Armed Forces report that they have captured the city of Melitopol in Zaporizhzhia Oblast. However, this claim is disputed. Russian state media says that Russian troops entered the city after facing 'no re");
System.out.println("sistance'. (Reuters) (TASS) Ukrainian President Volodymyr Zelenskyy posts a video of himself in the capital Kyiv amid rumors that he left the country. (Times of Israel) The Russian Navy warns that all civilian ships and vessels attempting to approach the Ukrainian Black Sea coast will be destroyed a");
System.out.println("s 'terrorist threats'. (Ukrainska Pravda) Poland says that around 100,000 Ukrainians have crossed the border since the invasion began. (Reuters) Russian President Vladimir Putin issues orders to expand the offensive, after declaring peace talks 'dead'. (Bloomberg) The Ukrainian military destroys rai");
System.out.println("ls at all railway junctions leading to Russia as part of an attempt to prevent Russian military supplies from being delivered by freight trains. (Ukrainska Pravda) Sergey Aksyonov, the head of the Republic of Crimea, says that supplies of water via the North Crimean Canal returned after Russians des");
System.out.println("troyed the dam that prevented the flow of water from the Dnieper river. (TASS) Russian forces shell the city of Sartana, Ukraine, and the nearby village of Buhas, killing ten Greek nationals. (Al Jazeera)"); 
            break;
case 27:
System.out.println("Battle of Kharkiv, Battle of Kyiv Russian Ground Forces begin targeting gas and oil pipelines outside Kharkiv and Kyiv in an attempt to incapacitate their defenses, with multiple explosions being reported at an oil depot near Vasylkiv, Kyiv Oblast. (BBC News) The Ukrainian Army announces that they r");
System.out.println("emain in control of Kyiv. Additionally, regional governor Oleh Synyehubov announces that Ukraine remains in control of Kharkiv. (India Today) (Daily Sabah) Ukraine's military says that it has destroyed a convoy of 56 tanks near the capital Kyiv and killed Chechen General Magomed Tushayev. (Times of ");
System.out.println("Israel) Kherson offensive Russian troops enter the port city of Berdiansk and seize all administrative buildings, according to the city's mayor. (The Jerusalem Post) (Ukrinform) 368,000 refugees have fled Ukraine since the invasion started, according to an estimate by the United Nations High Commiss");
System.out.println("ioner for Refugees. (Euronews) Russian President Vladimir Putin orders Russia's nuclear forces placed on high alert, in response to what he considered 'aggressive statements' by NATO members. (AP) Ukraine says that they have used Baykar Bayraktar TB2 drones against Russian forces. (The Wall Street J");
System.out.println("ournal) The European Union says that it will provide fighter aircraft and finance €500 million in procurement and delivery of weapons to Ukraine, the first time that the EU has done so. The EU will also provide €50 million in medical supplies. (Ukrinform) (Reuters) Danish Prime Minister Mette Freder");
System.out.println("iksen allows volunteers to join Ukrainian soldiers to fight against Russia. (Jyllands Posten)"); 
            break;
case 28:
System.out.println("Battle of Kharkiv Dozens of people are killed and hundreds more are injured in a massive MLRS attack on Kharkiv, according to the Ukrainian Interior Ministry. Videos appear to show cluster munitions being used in the rocket attack. (The Guardian) (Sky News) Hennadiy Matsehora, the mayor of Kupiansk ");
System.out.println("who surrendered the city to the Russians in exchange for peace the previous day, is now indicted for treason by Ukrainian officials. (Ukrainska Pravda) (Ukrainska Pravda 2) Kyiv offensive A 64-kilometre (40 mi) long convoy of Russian Ground Forces armoured vehicles, tanks and artillery continues to ");
System.out.println("advance towards Kyiv. (BBC News) Battle of Okhtyrka Ukrainian Ambassador to the U.S. Oksana Markarova confirms that Russian forces attacked Okhtyrka with a vacuum bomb. (Reuters) (The Independent) Zhytomyr Airport attack Russia attacks the Zhytomyr Airport using Iskander ballistic missiles launched ");
System.out.println("from Belarus. (The Times of Israel) Kherson offensive The Russian Defence Ministry says Russian Ground Forces have captured the Zaporizhzhia Nuclear Power Plant in Zaporizhzhia Oblast, and that the plant's operations have continued normally under the guard of soldiers. However, Ukraine denies that t");
System.out.println("he power plant has been seized by Russian forces. (Reuters) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations Ukrainian President Volodymyr Zelenskyy calls for U.S. President Joe Biden and NATO to impose a no-fly zone over Ukraine. However, White House Press Secretary Jen Psak");
System.out.println("i, British Defense Secretary Ben Wallace, and NATO Secretary-General Jens Stoltenberg state that NATO and the U.S. have ruled out imposing a no-fly zone. (Axios) Kremlin Press Secretary Dmitry Peskov accuses the European Union of 'hostile behaviour' towards Russia, and says that the arming of Ukrain");
System.out.println("e was an 'extremely dangerous and destabilising factor'. Peskov says that Western arms supplies to Kyiv shows that Moscow was justified in demilitarising Ukraine. (Reuters) Dmitry Peskov says that Vladimir Putin's nuclear deterrent order remarks were in response to comments made by British Foreign S");
System.out.println("ecretary Liz Truss. (The Independent) Latvia allows volunteers to participate in the Russo-Ukrainian war. (Reuters) Belarus–Ukraine relations Belarus is expected to directly deploy its armed forces in Ukraine, thereby aiding Russia in its invasion. However, a senior U.S. defense official says that t");
System.out.println("here are no indications that Belarusian troops have been deployed yet. (The Washington Post) (The Hill) France–Russia relations The office of French President Emmanuel Macron states that during a phone call with the Russian President, 'Putin confirmed his willingness to make commitments' to stop att");
System.out.println("acks against civilians and civilian infrastructure and secure major roadways. (Times of Israel) (Reuters) The United Nations reports at least 406 civilian casualties in Ukraine. (CNN) The Ukrainian engineer of the Russian yacht Princess Anastasia attempts to scuttle the vessel in the port of Mallorc");
System.out.println("a, Spain, damaging the yacht's engine room. (Newsweek) Two ethnic Greeks are killed after the city of Sartana is bombarded by the Russian Air Force. (Greek City Times) Ukrainian Air Force pilots begin arriving in Poland to begin taking control of fighter aircraft donated by European Union countries.");
System.out.println(" The Ukrainian government says that the EU is handing over 70 fighter jets to its air force including 28 MiG-29s from Poland, 12 from Slovakia, 16 from Bulgaria, and 14 Sukhoi Su-25s from Bulgaria. Bulgarian Prime Minister Kiril Petkov said he had rejected the request. European Union security chief ");
System.out.println("Josep Borrell later clarified that the donations were done 'bilaterally' by individual EU member states and not from the EU itself. (Politico)"); 
            break;
            default:
            System.out.println("Enter a day from 24 to 28:");



                    
                           

                    }
                    break;
case 3:
                    System.out.println(" Enter a day in March 2022:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Kyiv offensive A Russian military convoy that is about 64 kilometers (40 miles) long continues to advance toward Kyiv, as the invasion enters its sixth day. (BBC News) A senior U.S. defense official asserts that the convoy has 'stalled' amid the Ukrainian military response and fuel and food shortage");
System.out.println("s, but also warns that the Russian troops are 'certain to regroup'. (NBC News) Russian forces strike the Kyiv TV Tower with a missile, causing a temporary disruption of TV and radio broadcasting. Five people are killed in the bombing, according to Ukrainian emergency services. A Russian missile also");
System.out.println(" strikes the Babi Yar Holocaust Memorial Center. (APA) (CNN) (Ynetnews) (PBS) The Russian Armed Forces warn Kyiv residents to leave the city as its armoured convoy approaches the city's outskirts. The Russians also warn people living around the headquarters of the Security Service of Ukraine to evac");
System.out.println("uate, with the stated purpose of 'thwarting informational attacks against Russia'. (Reuters) (TASS) (The Guardian) The Ukrainian Armed Forces foil an assassination plot against President Volodymyr Zelenskyy by killing a group of Chechen paramilitaries known as Kadyrovtsy, who were attempting to ente");
System.out.println("r Kyiv on February 26, according to Ukrainian intelligence information. (Ukrayinska Pravda) Belarusian involvement in the 2022 Russian invasion of Ukraine Belarusian Ground Forces units enter northern Chernihiv Oblast, according to a senior Ukrainian territorial defence forces official. However, the");
System.out.println(" Ukrainian presidential office says that there is no evidence that this has happened. Belarus previously said that it would not send its armed forces to Ukraine. (Ukrayinska Pravda) (Rzeczpospolita) Battle of Okhtyrka Ukraine confirms that more than 70 troops were killed in a Russian ballistic missi");
System.out.println("le strike on a base in Okhtyrka, Sumy Oblast, yesterday. It is the largest loss of life for Ukrainian forces in a single attack since the invasion began. (The Guardian) Battle of Kharkiv A Russian missile strikes the Kharkiv Oblast state administration building on Freedom Square at 8 a.m. local time");
System.out.println(". Six people are injured in the strike, with the building being severely damaged. The Slovenian honorary consulate is also destroyed by a Russian missile. (Sky News) (Delo) Siege of Mariupol The head of the Donetsk People's Republic, Denis Pushilin, says that separatist forces are being assembled to");
System.out.println(" encircle the port city of Mariupol. (CNN) The European Court of Human Rights orders an immediate cessation of bombarding and targeting of civilian targets in Ukraine. (Europeiska Pravda) A senior U.S. defense official says that some Russian troop units have surrendered to Ukrainian forces 'without ");
System.out.println("a fight'. (Business Insider)"); 
            break;
case 2:
System.out.println("Kyiv offensive Battle of Kyiv The Ukrainian Air Force says that it has destroyed two Russian warplanes in a dogfight over Kyiv. A Ukrainian MiG-29 is also shot down during the air battle. (Sky News) Kherson offensive Battle of Kherson Russian Ground Forces say that they have captured the Black Sea p");
System.out.println("ort of Kherson. The Ukrainian Ministry of Defense denies this claim, stating that the battle is ongoing. (CNN) The mayor of Kherson says that the city has fallen to the invading Russian forces. (The New York Times) Siege of Mariupol The mayor of Mariupol reports mass casualties and a water outage fr");
System.out.println("om 'non-stop' Russian bombardments. (Reuters) Horlivka offensive Ukrainian forces begin an offensive towards Horlivka. (Ukrinform) Siege of Chernihiv Two Kalibr cruise missiles strike a hospital in Chernihiv after Russian troops were forced to retreat. (TIME) (CBC) Battle of Kharkiv Russian forces l");
System.out.println("aunch airstrikes on Kharkiv National University and a local police department. (CNN) Siege of Enerhodar Russia says that its troops have captured the Zaporizhzhia Nuclear Power Plant, the largest nuclear power plant in Europe. The International Atomic Energy Agency confirms that Russia had communica");
System.out.println("ted that the plant was under their control and that personnel at the plant were continuing to perform their normal duties. (The Drive) A missile strikes the Bangladeshi-flagged cargo ship Banglar Samriddhi docked at the Port of Olvia in Mykolaiv Oblast, killing a Bangladeshi engineer. (The Daily Sta");
System.out.println("r) An emergency special session of the UN General Assembly adopts a resolution calling for Russia to end the invasion. (The Washington Post) (The Guardian) In an unprecedented move, the European Court of Human Rights (ECHR) suspends all judicial proceedings against Ukraine pending before the ECHR. (");
System.out.println("Europeiska Pravda) The Ukrainian Armed Forces say that Ukraine has retaken the city of Makariv from Russia. (Jerusalem Post) (Ukrinform)"); 
            break;
case 3:
System.out.println("Siege of Chernihiv The governor of Chernihiv Oblast says that at least 33 people have been killed and at least 18 others injured in Russian airstrikes on residential areas in Chernihiv. (National Post) (U.S. News & World Report) (NDTV) Battle of Kharkiv Thirteen students are killed at the National U");
System.out.println("niversity of Kharkiv after a Russian shell struck a dormitory at the university's Academy of Culture. Five foreign students are among the dead, including four Chinese and one Indian student. (Taiwan News) Kherson offensive The Ukrainian Navy patrol vessel Sloviansk is destroyed in a Russian anti-shi");
System.out.println("p missile strike off the Port of Odesa, resulting in the disappearance of all its crew. (Debrief) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says that over one million Ukrainians have fled the country since the invasion began. (Al Jazeera) Reactions to the 2022 Russia");
System.out.println("n invasion of Ukraine Russia–United States relations Russia and the U.S. establish a hotline in an effort to prevent escalation between the two nuclear powers. (Reuters) Russian Foreign Minister Sergey Lavrov says that the war on Ukraine will continue 'until the end', and accuses Ukrainian President");
System.out.println(" Volodymyr Zelenskyy of allowing 'a society where Nazism is flourishing'. Lavrov also says that Russia is not planning a nuclear war. (Reuters)"); 
            break;
case 4:
System.out.println("Kherson offensive Battle of Mykolaiv Ukrainian forces say that they have recaptured the Mykolaiv Airport. (Ukrinform) Russia renews its assault on Mykolaiv with naval gunfire support. (The Guardian) The Ukrainian Navy scuttles its flagship frigate Hetman Sahaidachny at the port of Mykolaiv to preven");
System.out.println("t its capture by Russian forces. (The Independent) Siege of Enerhodar The Zaporizhzhia Nuclear Power Plant in Enerhodar catches fire following shelling by Russian troops. The fire is later extinguished. (Reuters) (NDTV) Ukrainian officials confirm that the power plant has been captured by Russian fo");
System.out.println("rces. (BBC News) Eastern Ukraine offensive Ukrainian air defences shoot down a Russian Sukhoi Su-25 jet over the city of Volnovakha in Donetsk Oblast. (Forbes) Kyiv offensive Sky News chief correspondent Stuart Ramsay is shot and wounded by Russian troops near Kyiv. (Wales Online) Ukrainian refugee ");
System.out.println("crisis The Czech Republic introduces a state of emergency for 30 days as thousands of Ukrainian refugees arrive in the country. (Novinky) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations NATO announces that they will not declare a no-fly zone over Ukrainian airspace, as such ");
System.out.println("a declaration could create an avenue for further escalation by enabling NATO nations to potentially fire upon Russian aircraft in the area. (FOX News) President Volodymyr Zelenskyy condemns NATO for rejecting his appeal for a no-fly zone over his country, saying 'All the people who die starting toda");
System.out.println("y will also die because of you. Because of your weakness, because of your disconnection'. (DW) Head of the Chechen Republic Ramzan Kadyrov calls on President Vladimir Putin to let his forces seize Ukraine's major cities, saying that it is the 'only way to save the Russian people and our state'. (WeF");
System.out.println("orNews) By a unanimous vote, Ukraine becomes a contributor to NATO's Cooperative Cyber Defence Centre of Excellence. (Kyiv Independent) "); 
            break;
case 5:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Russian and Ukrainian forces agree to open a humanitarian corridor for five hours for people who want to leave Mariupol and Volnovakha, expecting 200,000 people from Mariupol and 15,000 people from Volnovakha to use the corridor. However, the implementatio");
System.out.println("n of the corridor is postponed as the two parties accused each other of violating cease-fire agreement. (Reuters) (The Wall Street Journal) Head of the Donetsk People's Republic Denis Pushilin announces that Sparta Battalion Commander Volodymyr Zhoha has been killed in Volnovakha. (Ukrayinska Pravda");
System.out.println(") Siege of Chernihiv A Russian Air Force warplane is shot down on the outskirts of Chernihiv, crashing into a residential area, according to Ukraine's State Emergency Service. (CNN) A Russian Sukhoi Su-34 is shot down in Chernihiv Oblast and one of its pilots is taken prisoner by Ukrainian forces. T");
System.out.println("he other pilot died. (Ukranews) (India Today) Kyiv offensive Russian troops seize control of Borodianka in Kyiv Oblast after days of heavy shelling and airstrikes. Ukrainian authorities say that they were unable to evacuate a psychiatric hospital in the town which holds 670 patients. The hospital is");
System.out.println(" now under Russian control. (CNN) (Sky News) The Ukrainian military begins a mass evacuation of civilians from Irpin after the city was bombarded by Russian jets and artillery. Much of the city has now been destroyed. (BBC News) Battle of Mykolaiv Ukrainian Ground Forces retake control of Mykolaiv a");
System.out.println("nd seize Russian military equipment. (The Kyiv Independent) Ukrainian refugee crisis The International Organization for Migration says that the refugee crisis has now become the largest and fastest exodus of people in Europe since World War II. (Fox News) Russian President Vladimir Putin says that W");
System.out.println("estern sanctions on Russia are akin to a 'declaration of war', and warns that any attempt to impose a no-fly zone over Ukraine could lead to 'catastrophic consequences' for the world. (Reuters) War in Donbas Russian President Putin says that around 13,000 to 14,000 people have been killed in Donbas ");
System.out.println("since 2014. (TASS)"); 
            break;
case 6:
System.out.println("In a phone call with French president Emmanuel Macron, Russian president Vladimir Putin says that Russia will no longer attack nuclear power plants and is open to holding a trilateral meeting between Russia, Ukraine, and the International Atomic Energy Agency. (Politico.eu) (FactoPress) Ukrainian pr");
System.out.println("esident Volodymyr Zelenskyy says that Havryshivka Vinnytsia International Airport in Vinnytsia Oblast has been 'completely destroyed' after being hit with eight Russian ballistic missiles. (The Guardian) The Ukrainian military says that it has killed over 11,000 Russian troops since the invasion beg");
System.out.println("an, while Russian Defence Ministry spokesman Maj. Gen. Igor Konashenkov said on Wednesday that 498 Russian troops had been killed. (Reuters) (The Week) U.S. officials claim that Russia has started recruiting Syrian mercenaries experienced in urban combat. (The Wall Street Journal)"); 
            break;
case 7:
System.out.println("Battle of Kharkiv The International Atomic Energy Agency confirms that the Kharkiv Institute of Physics and Technology in Kharkiv, which holds a neutron generator, has been destroyed by Russian shelling. The IAEA says that no radiation release has been detected from the facility, which housed a 'sma");
System.out.println("ll inventory of radioactive material'. (Bloomberg) Ukraine says that it has killed 41st Combined Arms Army general Vitaly Gerasimov, who allegedly took part in the annexation of Crimea, Russia's intervention in Syria, and the Second Chechen War, in the Kharkiv Oblast. He is the second general to be ");
System.out.println("killed by Ukrainian forces after Andrey Sukhovetsky. (Ukrinform) (The Independent) Kherson offensive Ukrainian Navy forces strike Russian Navy patrol boat Vasily Bykov with missiles in the Black Sea. (The Telegraph) (Mirror) Russia–Ukraine relations Russia and Ukraine set up another ceasefire in ord");
System.out.println("er to allow humanitarian evacuations in some cities. (ABC News) Kremlin Press Secretary Dmitry Peskov says that Russia will end its military campaign if Ukraine ends its fighting campaign, does not join NATO, recognizes Crimea as Russian territory, and recognizes Donetsk and Luhansk as independent s");
System.out.println("tates. (Newsweek)"); 
            break;
case 8:
System.out.println("Battle of Kharkiv The Albanian consulate in Kharkiv is destroyed during Russian shelling. No casualties are reported. (Euractiv) White House Press Secretary Jen Psaki reaffirms that the U.S. will not impose a no-fly zone over Ukraine. (Wall Street Journal) A report from the Irish Times said that the");
System.out.println(" United Nations told its employees in a communications guidance to refer to the war in Ukraine as a 'conflict' or 'military offensive' rather than as a 'war' or an 'invasion', and also ordered employees to not put the Ukrainian flag on any of their social media accounts to 'avoid reputational risk',");
System.out.println(" in an attempt to avoid upsetting Russia. However, Stéphane Dujarric, spokesman for the secretary-general of the United Nations, wrote in an email to The Guardian that no such recommendation was ever issued. (The Irish Times) (The Guardian)"); 
            break;
case 9:
System.out.println("Eastern Ukraine offensive Siege of Mariupol A Russian airstrike destroys a maternity ward and a children's hospital in Mariupol, Ukraine, killing three people and injuring at least 17 people. President Volodymyr Zelenskyy says that many people are unaccounted for. (Business Insider) (AP) (The Chicag");
System.out.println("o Tribune) (Sky News) Battle of Kharkiv Ukrainian forces announce that they have regained control of Derhachi, a city located in the Kharkiv Raion district of the Kharkiv Oblast. (Ukrinform) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says over two million Ukrainians h");
System.out.println("ave now fled the country since the invasion began. Most have gone to neighbouring Poland, with Hungary, Romania and Slovakia also taking in several hundred thousand refugees each. (DW) Poland–United States relations The Pentagon rejects an offer from Poland's foreign ministry to 'deploy – immediatel");
System.out.println("y and free of charge – all their MIG-29 jets to the Ramstein Air Base and place them at the disposal of the Government of the United States of America' for transfer to the Ukrainian Air Force. (Reuters) (Reuters 2) Reactions to the 2022 Russian invasion of Ukraine The British Army confirms that a nu");
System.out.println("mber of active-duty soldiers have disobeyed orders and gone AWOL, and have likely gone to Ukraine to fight against the Russian military. Defence Minister Ben Wallace says that the serving members are 'breaking the law and will be prosecuted' when they return to the United Kingdom. (Sky News) The Uni");
System.out.println("ted Kingdom's Defence Ministry says that it is sending another 1,615 MBT LAWs, and a small number of FGM-148 Javelin anti-tank missiles to the Ukrainian army. More small arms, body armour and medical supplies have also been sent. (BBC News) Business and economy  2021–2022 Russo-Ukrainian crisis 2022");
System.out.println(" Russian financial crisis Fitch Ratings downgrades Russia from 'B' to 'C', one grade above default, and warns that Russian default on its obligations is 'imminent'. (BBC News) The Russian Ministry of Economic Development proposes a draft nationalisation bill that will impose receivership for up to 3");
System.out.println(" months on assets of companies that boycotted the Russian market due to the Russian invasion of Ukraine if the ownership share by legal entities from 'unfriendly countries' exceeds 25%. If the companies still do not resume their business in the country, their assets will be auctioned. More than 300 ");
System.out.println("companies that left Russia or suspended operations in Russia could be targeted. (TASS) The Ukrainian state grid operator warns that Russian forces, which are in control of the Chernobyl Nuclear Power Plant, have disconnected the plant from the electricity grid, which the operator says will impact nu");
System.out.println("clear fuel cooling, and which also caused a blackout in the nearby city of Slavutych. The nuclear plant previously suspended all communications with the IAEA, the United Nations-based organisation specialising in nuclear energy production. (The Independent) (Interfax Ukraine) Ukrainian Foreign Minis");
System.out.println("ter Dmytro Kuleba says that reserve diesel generators that cool spent nuclear fuel can only last for another 48 hours and that a radiation leak from Chernobyl is 'imminent' if power is not restored immediately. Kuleba also says that 'Putin's barbaric war' puts all of Europe in danger. However, the I");
System.out.println("nternational Atomic Energy Agency says there is 'no critical impact on security' imminent. (Times of Israel) (Reuters)"); 
            break;
case 10:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Russian forces resume shelling the port city of Mariupol after yesterday's airstrike on a children's hospital which killed three people. A humanitarian aid convoy trying to reach the city is also forced to turn back due to heavy fighting. (BBC News) Afterm");
System.out.println("ath of 2021 Kyrgyzstan–Tajikistan clashes An armed incident occurs between border guards at the Kyrgyzstan–Tajikistan border, killing one Tajik border guard. Following the incident, officials from the Batken Region in Kyrgyzstan and the Sughd Region in Tajikistan hold talks. (Trend) (RFE/RL) Busines");
System.out.println("s and economy  2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Video game companies Nintendo and Sony Interactive Entertainment suspend all product sales in Russia. Sony's online PlayStation Store will also no longer be available in Russia. (CNBC) U.S. bank Goldman Sachs announce");
System.out.println("s that it is closing its operations in Russia, becoming the first major Wall Street bank to leave the country following the invasion of Ukraine. (Reuters) 2022 Russian financial crisis Kremlin spokesman Dmitry Peskov says that the Russian economy is experiencing a 'shock' following an 'absolutely un");
System.out.println("precedented' economic war being waged against the country. Peskov also says that 'the economic war that has started against our country has never taken place before. So it is very hard to forecast anything'. (Reuters) The International Monetary Fund no longer considers Russian default 'improbable', ");
System.out.println("and the World Bank also considers Russia's and Belarus's default likely. (Reuters) (Reuters 2) The Central Bank of Russia limits withdrawals of US dollars, euros, British pounds and Japanese yen for Russian firms to the equivalent of $5,000, with the withdrawal of larger sums only possible with the ");
System.out.println("Central Bank's permission. The withdrawn funds may only be used for covering overseas work trips. (Reuters) International sanctions during the Russo-Ukrainian War Russian President Vladimir Putin admits that the sanctions have created problems for Russia. However, he also called the sanctions illegi");
System.out.println("timate and warned the West that Russia will emerge stronger and solve the problems. (Reuters) (Sky News) The Ukrainian parliament begins to debate a new law which would allow the forced seizure of all assets belonging to Russians citizens as well as Ukrainians deemed by the courts or the National Se");
System.out.println("curity and Defense Council of Ukraine to be Russian collaborators. Last week, a bill was approved that allowed forced seizure of assets owned by the Russian government and Russian companies. (Ekonomichna Pravda) Russia's Ministry of Transport prepares a draft regulation which would allow airlines to");
System.out.println(" not have to honour the request of the lessor to return leased aircraft unless a special government commission orders them to do so and would also allow companies to pay the lessor in rubles. The law comes amid EU sanctions which forces all lease contracts for Russian aircraft to be voided by late M");
System.out.println("arch and also forbids E.U. companies from insuring Russian aircraft. (Interfax Russia) Russia introduces retaliatory sanctions against most foreign countries, with the exception of members of the Russian-led Eurasian Economic Union. The export of more than 200 items, mostly of technical and agricult");
System.out.println(" The Russian government abolishes penalties for theft of patents if they are held by natural or legal persons from countries considered by the Russian government as unfriendly. The decriminalisation of the piracy of s");
System.out.println("oftware from 'unfriendly' countries is also being considered. (Euractiv) (The Register) Facebook and Instagram starts to allow users in Eastern Europe, the Baltics, and the Caucasus to promote violence against Russians and Russian soldiers in the context of the war in Ukraine, which is normally rest");
System.out.println("ricted, according to internal emails. A Meta spokesperson states that 'As a result of the Russian invasion of Ukraine we have temporarily made allowances for forms of political expression that would normally violate our rules like violent speech such as 'death to the Russian invaders.'' However, cal");
System.out.println("ls for violence against Russian prisoners of war and 'credible calls for violence against Russian civilians' will remain prohibited. Death threats against Russian President Vladimir Putin and Belarusian President Alexander Lukashenko will also be permitted. Meta's spokesperson adds that they are, 'f");
System.out.println("or the time being, making a narrow exception for praise of the Azov Regiment strictly in the context of defending Ukraine, or in their role as part of the Ukraine National Guard,' which was previously forbidden. (Reuters) Russian Foreign Minister Sergey Lavrov and Ukrainian Foreign Minister Dmytro K");
System.out.println("uleba hold talks in Ankara, Turkey. These are the highest level talks between the two nations since the invasion. No ceasefire is reached, but the possibility of a meeting with Ukrainian President Volodymyr Zelenskyy and Russian President Vladimir Putin was discussed. (Reuters) Ukrainian Defense Min");
System.out.println("ister Oleksii Reznikov says that Ukraine is willing to accept Russia’s surrender “with understanding”. (Ukrinform)"); 
            break;
case 11:
System.out.println("Southern Ukraine offensive Battle of Melitopol Russian troops capture the mayor of Melitopol Ivan Fedorov, and take him to an unknown location after he refused to cooperate with Russian occupation forces. Fedorov's capture is confirmed by Ukrainian Internal Affairs Ministry official Anton Herashchen");
System.out.println("ko. (BBC News) Kyiv offensive A large convoy of Russian military vehicles, including tanks and self-propelled artillery, begins 'fanning out' to forests and towns near Kyiv as it prepares to advance on the capital. (BBC News) Siege of Chernihiv Ukrainian Ground Forces launch a counter-offensive in C");
System.out.println("hernihiv Oblast, regaining control of five settlements from Russian forces, and seizing two Russian armoured personnel carriers and ammunition. (Ukrinform) Northeastern Ukraine offensive Battle of Sumy Around 104 Russian soldiers are taken as prisoners of war in Sumy. (Ukrinform) Russia allows forei");
System.out.println("gn volunteers to join its armed forces to fight the war against Ukraine. Russian defense minister Sergei Shoigu says that he has received around 16,000 applications, mostly from people in the Middle East. (AP) Russia launches 'high-precision' airstrikes on airfields in Lutsk and Ivano-Frankivsk in W");
System.out.println("estern Ukraine, killing four Ukrainian service members and injuring six others. Russian Air Force jets also bomb the city of Dnipro for the first time, destroying a shoe factory and killing one person. (AP) 2020–present global chip shortage Two Ukrainian semiconductor-grade neon gas producers, makin");
System.out.println("g about half of the world's supply of the gas, have shut down their operations due to the invasion. This will likely worsen semiconductor shortages that started with the COVID-19 pandemic. (Reuters) The Central Bank of Russia orders all banks not to take any commission for the withdrawal of foreign-");
System.out.println("denominated cash from bank accounts of natural persons. Additionally, all remittances from abroad can only be withdrawn after they are converted to rubles. (Meduza) Stock prices increase in the United States and other global markets after Russian president Vladimir Putin said that there was progress");
System.out.println(" during talks with Ukraine. Following Putin's reports, the DOW increased by 300 points. (Nasdaq) (Reuters) (MarketWatch)Russia–United States relations U.S. president Joe Biden announces that he will revoke Russia's most favoured nation trade status in coordination with the European Union and the Gro");
System.out.println("up of Seven. The U.S. will also ban all imports of Russian seafood, alcohol, and diamonds; forbid new investment in Russia by American citizens; and criminalise the export of U.S. banknotes to Russia. (AP) (Reuters) U.S. Treasury Secretary Janet Yellen announces that the U.S. Treasury has imposed sa");
System.out.println("nctions against Viktor Vekselberg and the family of Putin spokesperson Dmitry Peskov. (Reuters) Russia–European Union relations The EU announces that it will ban all imports of iron and steel goods from Russia, ban the export of luxury goods to Russia, and freeze Russia's cryptocurrency assets. (Reu");
System.out.println("ters) Russia–Ukraine relations Kremlin Press Secretary Dmitry Peskov says that Russian president Vladimir Putin is open to holding a meeting with Ukrainian president Volodymyr Zelenskyy. (Ukraine News Today) Igor Zhovkva, deputy head of the Office of the President of Ukraine, says that President Zel");
System.out.println("enskyy is 'ready to talk to President Putin anytime he is ready'. (CNN) Belarus–Russia relations In a meeting with Belarusian president Alexander Lukashenko, President Putin says that there are 'positive shifts' and progress during talks with Ukraine. (Reuters)"); 
            break;
case 12:
System.out.println(" Russia warns that it could fire on any future NATO armaments shipments to Ukraine, saying that the weapons shipments are 'legitimate military targets' for its military. (Financial Times) Iraqi conflict, 2022 Erbil rocket attacks Iran launches twelve ballistic missiles at the Iraqi city of Erbil, Ku");
System.out.println("rdistan Region, with explosions reported near the U.S. consulate and Erbil International Airport. The missiles are believed to be Fateh-110s. There are no reports of injuries or deaths. (The Jerusalem Post) (MSN) (Al Arabiya) Iraqi security officials confirm that the missiles were launched from Iran");
System.out.println(" and that several missiles hit the U.S. consulate building. (DW) Business and economy  Economic impact of the 2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Pokémon Go suspends operations in Russia and Belarus following the invasion. (Gamerant.com) The Central Bank of Russia ann");
System.out.println("ounces that stock trading on the Moscow Stock Exchange will remain suspended until at least March 18 due to the fallout from the Russian invasion. (The Wall Street Journal)"); 
                     break;
case 13:
System.out.println("Eastern Ukraine offensive Usage of white phosphorus bombs is reported overnight in the town of Popasna in Luhansk Oblast. (Ukrayinska Pravda) Kyiv offensive Brent Renaud, a filmmaker and photojournalist formerly affiliated with The New York Times, is shot and killed by Russian troops in Irpin, Kyiv ");
System.out.println("Oblast. His colleague, another U.S. citizen, is wounded and evacuated to a hospital. (Jerusalem Post) Battle of Melitopol Russian occupation forces install Halyna Danylchenko as the new mayor of Melitopol following the abduction of Ivan Fedorov. Danilchenko, a former member of the city council, call");
System.out.println("s on residents to 'adapt to the new reality' and stop 'committing extremist acts'. However, the city council refuses to recognise Danilchenko as mayor and calls on Ukrainian authorities to indict her for treason. (Sky News) (Ukrayinska Pravda) Siege of Mariupol Ukrainian authorities say that 2,187 c");
System.out.println("ivilians have now been killed in Mariupol, Donetsk Oblast. Mariupol's City Council says that Russian forces are deliberately targeting residential buildings and densely populated areas in the port city. (Ukrayinska Pravda) Aftermath of the Battle of Chernobyl Ukrainian Energy Minister Herman Halushc");
System.out.println("henko announces that power has been restored to the former power plant in Chernobyl. (Axios) Russian airstrikes inflict significant damage on the Ivano-Frankivsk International Airport in western Ukraine, with no casualties immediately reported. (CNN) An airstrike on the NATO–Ukraine Partnership for ");
System.out.println("Peace Yavoriv military base some 10–20 km (6.2–12.4 mi) from the border with Poland kills 35 people and injures 134 others. (USA Today) White House national security adviser Jake Sullivan warns that Russia could be preparing to use chemical weapons in Ukraine. (USA Today) Russian forces abduct Yevge");
System.out.println("ny Matveyev, the mayor of Dniprorudne in Zaporizhzhia Oblast, after he refused to cooperate with the military. (The Jerusalem Post) Ukrainian President Volodymyr Zelenskyy again calls for a no-fly zone over Ukraine, saying 'it is only a matter of time before Russian rockets fall on your territory, o");
System.out.println("n NATO territory'. (NDTV)"); 
            break;
case 14:
System.out.println("Siege of Mariupol Local officials in Mariupol, Donetsk Oblast, say that over 160 cars have left the city in the first successful attempt to arrange a humanitarian corridor to evacuate the city. (Reuters) Russia denies having requested military assistance from China, as alleged by several US official");
System.out.println("s. (BBC News) (Al Jazeera) A Russian Air Force airstrike on a television tower in Rivne Oblast in Western Ukraine kills at least nine people, according to Rivne governor Vitaliy Koval. (Reuters) A Russian Orlan-10 UAV crashes near a village in Bistrița-Năsăud County, Romania. (Euronews)Russia–Ukrain");
System.out.println("e relations The fourth round of talks between the Ukrainian and Russian delegations resumes in an effort to end the war but is delayed until tomorrow due to technical issues. (Wall Street Journal) (Reuters) Russia–Slovakia relations Slovakia expels three Russian diplomats for alleged espionage and b");
System.out.println("ribery. (AP) Germany–United States relations Germany announces that it will buy 35 F-35 Lightning II fighter jets from the United States to replace its aging fleet of Panavia Tornados. Germany will also purchase 15 Eurofighter Typhoon jets from Airbus. (Reuters) Law and crime  2022 Russian invasion ");
System.out.println("of Ukraine Protests against the 2022 Russian invasion of Ukraine 2022 anti-war protests in Russia Marina Ovsyannikova, a Russian state television journalist, interrupts a live news broadcast of Channel One Russia, holding a sign saying 'No War' and 'Stop the war. Do not believe propaganda, they tell");
System.out.println(" you lies here', and is promptly arrested. (MSN) Anti-war protesters seize the mansion of Oleg Deripaska in London. Four of the protesters who were seen on the balcony of Deripaska's mansion are later arrested. (The Guardian) International sanctions during the Russo-Ukrainian War Andrey Turchak, the");
System.out.println(" secretary-general of the ruling party United Russia, declares that the party will draft a bill criminalising compliance with the Western sanctions. (Kommersant)"); 
                     break;
case 15:
System.out.println("Kyiv offensive Battle of Kyiv The Kyiv city government and Kyiv Oblast administration impose a 35-hour curfew starting at 20:00 local time (18:00 UTC). (Reuters) Fox News cameraman Pierre Zakrzewski and producer Oleksandra Kuvshynova are killed, and war correspondent Benjamin Hall is injured, while ");
System.out.println("covering the fighting between Russian and Ukrainian forces in Horenka, Kyiv Oblast. (The Guardian) Eastern Ukraine offensive Siege of Mariupol Around 2,000 private cars have left Mariupol since a humanitarian corridor was imposed, with another 2,000 cars waiting to leave. (Deccan Herald) Russian tro");
System.out.println("ops storm the Mariupol regional intensive care hospital and take around 400 people hostage. Local authorities confirm that the damaged hospital is now under Russian control. (BBC News) Southern Ukraine offensive The Russian Defence Ministry says that its forces have taken full control of Ukraine's K");
System.out.println("herson Oblast and that they destroyed six Ukrainian Air Force jets, seven helicopters, and 13 UAVs in the last 24 hours. (The Nation) Satellite images from Planet Labs appear to show multiple Russian helicopters burning at Kherson International Airport after Ukrainian forces said they struck the air");
System.out.println("port. This is the second major Ukrainian attack on the facility since it fell to Russian forces on 2 March. (The Drive) (CNN) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says that over three million people have now fled Ukraine since the invasion began. (The Independen");
System.out.println("t)Russia–Ukraine relations The fourth round of talks between the Russian and Ukrainian delegations resumes a day after talks were suspended for technical reasons. (The Quint) (CBS News) Ukrainian presidential aide Mykhailo Podolyak reaffirms that ceasefire negotiations are ongoing. (The Free Press J");
System.out.println("ournal) Podolyak says that talks between Ukraine and Russia are difficult but also says that there is 'certainly room for compromise'. Talks between both countries will continue tomorrow. (AP) (Reuters) Ukraine–European Union relations The prime ministers of Poland, Slovenia, and the Czech Republic ");
System.out.println("travel to Kyiv by train to meet with Ukrainian President Volodymyr Zelenskyy and Prime Minister Denys Shmyhal in order to demonstrate 'unequivocal support' of the European Union for the sovereignty and independence of Ukraine. (CNN) International sanctions during the Russo-Ukrainian War Russia–Unite");
System.out.println("d States relations Russia sanctions U.S. President Joe Biden, Secretary of State Antony Blinken, Secretary of Defense Lloyd Austin, CIA Director William Burns, and former Secretary of State Hillary Clinton in response to United States sanctions on Russian officials. (Sky News) Canada–Russia relation");
System.out.println("s Russia sanctions Canadian Prime Minister Justin Trudeau, Foreign Affairs Minister Mélanie Joly, General Wayne Eyre and most members of the Canadian parliament. All those sanctioned are banned from entering Russia. (CBC News) Russia–Spain relations Spanish police seize a superyacht at the Port of B");
System.out.println("arcelona which is owned by Russian oligarch Sergey Chemezov, after Chemezov was sanctioned by the European Union. (Reuters) Belarus–United States relations The United States imposes additional sanctions on Belarusian President Alexander Lukashenko. (CNN) Enlargement of NATO Ukrainian President Volod");
System.out.println("ymyr Zelenskyy acknowledges that Ukraine will not be able to join NATO. (The Independent) Russia in the Council of Europe Russia formally withdraws from the Council of Europe. (Reuters)"); 
            break;
case 16:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Mariupol theatre airstrike The Donetsk Regional Drama Theatre in Mariupol, which is currently being used as an air raid shelter holding up to 1,200 civilians, is largely destroyed by bombing. Ukraine accuses Russia of conducting an airstrike targeting the ");
System.out.println("theatre, while Russian authorities deny responsibility, instead accusing the Azov Battalion of having planned and carried out the bombing. (BBC News) (RadioFreeEurope/RadioLiberty) Northeastern Ukraine offensive Siege of Chernihiv Russian troops reportedly shoot dead ten people queuing for food in C");
System.out.println("hernihiv. The Russian Defence Ministry denies Russian forces were behind the killings. (Sky News) (Reuters) Southern Ukraine offensive Battle of Melitopol Captured Melitopol mayor Ivan Fedorov is freed in exchange for nine Russian POWs. (Ukrinform) Foreign aid to Ukraine during the Russo-Ukrainian W");
System.out.println("ar British Defence Secretary Ben Wallace says that the UK has begun supplying Starstreak anti-aircraft missiles to the Ukrainian military. (Reuters) U.S. President Joe Biden announces a further $800 million in 'security assistance' to Ukraine, including 800 anti-aircraft systems, and thousands of an");
System.out.println("ti-tank missiles and armed combat drones to counter Russia's invasion. (Reuters) Russian President Vladimir Putin addresses his ministers on the ongoing situation in Ukraine and the Russian economy, saying that Russian 'traitors' and 'scum' would be 'spat out like a midge that accidentally flew into");
System.out.println(" their mouths', and also accuses a so-called 'fifth column' of attempting to destroy the country from within. (Reuters) Russia–Ukraine relations Russian Foreign Minister Sergey Lavrov says that there is hope of reaching a compromise aimed at a ceasefire. (Politico.eu) In a report from the Financial ");
System.out.println("Times, a peace plan is drafted by Ukraine and Russia. The conditions include a ceasefire and Russian withdrawal if Ukraine abandons all attempts of joining NATO and accepts limits on its armed forces. (Naharnet) (Financial Times) Japan–Russia relations Japan announces that it will revoke Russia's mo");
System.out.println("st favoured nation trade status as part of further sanctions on Russia. (Reuters) Belarus–Canada relations Canada bans Belarusian aircraft from its airspace due to Belarus's support of Russia in the invasion. (The Hill) Russia in the Council of Europe Russia is expelled from the Council of Europe du");
System.out.println("e to the invasion of Ukraine, although the Russian Foreign Ministry had previously announced that it would be quitting the organisation. (AP)"); 
            break;
case 17:
System.out.println("British Defence Secretary Ben Wallace announces that the UK is deploying a Sky Sabre air defence system to Poland, and 100 troops to operate it as part of NATO's response to Russian military aggression. (Sky News) Panama's maritime authority states that Russia has attacked three Panamanian-flagged c");
System.out.println("ivil vessels in the Black Sea since the Russian invasion of Ukraine began on February 24, causing one of the ships to sink. No deaths have been reported. (Reuters) According to Ukrainian intelligence information, Syrian President Bashar al-Assad pledges to supply Russia with 40,000 mercenaries. (The");
System.out.println(" Jerusalem Post) Business and economy  Economic impact of the 2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Steam announces that they will stop payments to Belarus, Russia, and Ukraine. (PCMag) The U.S. House of Representatives votes 424–8 to suspend trade relations with Russia");
System.out.println(" and Belarus following the invasion. (NBC News)"); 
            break;
case 18:
System.out.println("2022 Russian invasion of Ukraine Battle of Zaporizhzhia Nine people die after they are hit by Russian shelling in Zaporizhzhia. (National Post) Southern Ukraine offensive A Russian missile strike destroys a Ukrainian military barracks in Mykolaiv, killing at least 50 soldiers, many more are believed");
System.out.println(" to be buried under rubble. (Sky News)"); 
            break;
case 19:
                      System.out.println("Russia says that on Friday it used the Kh-47M2 Kinzhal hypersonic missile for the first time in Ukraine to destroy a weapons storage facility in the Ivano-Frankivsk region. (Reuters)");
            break;
case 20:
System.out.println("Siege of Mariupol The city council of Mariupol says that Russian Armed Forces have forcefully deported 'several thousand' people to camps and remote cities in Russia. (Reuters) (CNN)Bulgaria says it will end gas imports from Russia's Gazprom when its 10-year deal with Gazprom expires at the end of 2");
System.out.println("022, signalling a shift away from Russian energy. Bulgarian Energy Minister Alexander Nikolov says Bulgaria will also seek increased gas imports from Azerbaijan. (Politico)"); 
            break;
case 21:
System.out.println("Kyiv offensive Battle of Kyiv Kyiv shopping centre bombing A Russian airstrike destroys a shopping mall in Kyiv, killing at least eight people. (The Washington Post) Siege of Mariupol Russia gives Ukraine a 5 a.m. (3 a.m. UTC) deadline to surrender the city of Mariupol. (The Guardian) Ukraine reject");
System.out.println("s the Russian ultimatum to surrender its control of Mariupol, with Deputy Prime Minister Iryna Vereshchuk saying 'we have already informed the Russian side about this'. (BBC News) Sumykhimprom chemical plant ammonia leak An ammonia leak occurs at the Sumykhimprom chemical plant in Sumy. (The Kyiv In");
System.out.println("dependent)"); 
            break;
case 22:
System.out.println("Kyiv offensive Battle of Kyiv Ukrainian forces say that they have retaken Makariv, a suburb near Kyiv. (BBC News) Siege of Mariupol Russian Navy warships in the Sea of Azov shell Ukrainian-held areas of Mariupol. (ABP Live) 2022 Russia–Ukraine peace negotiations UN Secretary-General António Guterres");
System.out.println(" says that there is diplomatic progress on several key issues in the situation in Ukraine in an effort to end the 'unwinnable' war. (United Nations) Kremlin Press Secretary Dmitry Peskov says that Russia will only use its nuclear weapons if the country faces an 'existential threat' amid growing conc");
System.out.println("erns that Russia will use nuclear weapons in Ukraine. (Reuters)"); 
            break;
case 23:
System.out.println("Kyiv offensive Battle of Kyiv Four people are injured by a series of Russian Air Force strikes on infrastructure in Kyiv. (Euronews) Russian journalist Oksana Baulina is killed in shelling in Kyiv's Podilskyi District. (BBC News) A laboratory near the Chernobyl Exclusion Zone is looted and destroyed");
System.out.println(" by Russian soldiers. (CNN)"); 
            break;
case 24:
System.out.println("Southern Ukraine offensive Battle of Berdiansk Ukrainian forces destroy a Russian Navy Alligator-class landing ship at the port of Berdiansk. Images on social media appear to show the Orsk landing ship burning at the port. (Sky News) Belarusian involvement in the 2022 Russian invasion of Ukraine Ukr");
System.out.println("ainian Foreign Minister Dmytro Kuleba says that Belarusian troops are not willing to fight alongside Russia in Ukraine. (Prensa Latina) (Ukrinform) Battle of Kharkiv Russian forces airstrike a Nova Poshta post office in Kharkiv, killing six civilians. (Times of Israel) Ukrainian volunteer battalions");
System.out.println(", International Legion of Territorial Defense of Ukraine Canada bans its soldiers from joining the volunteer forces in Ukraine, stating that their presence could be used in Russian propaganda. (Rzeczpospolita) Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom says it is doubli");
System.out.println("ng the number of missiles it is sending to Ukraine, with 6,000 more missiles, including anti-tank guided missiles and surface-to-air missiles, and is also sending £30 million to help Ukraine pay the wages of its soldiers and air force pilots. (Reuters) "); 
            break;
case 25:
System.out.println("Kyiv offensive Battle of Kyiv Russia says that it used Kalibr cruise missiles to destroy a major oil terminal near Kyiv. (Reuters) Battle of Kherson A United States defense official states that the Russian forces are no longer in full control of Kherson, the only major city they had captured in Ukra");
System.out.println("ine. (The New York Times) Belarusian involvement in the 2022 Russian invasion of Ukraine Belarusian President Alexander Lukashenko reaffirms that Belarus has 'no plans to fight in Ukraine'. However, he also warned that Belarus could join the war if aggression is launched against it. (TASS) Russia sa");
System.out.println("ys that the first phase of the invasion has been completed. (BBC News) The Russian Defence Ministry updates its official casualty figures in Ukraine, stating that 1,351 troops have been killed in action and 3,825 others have been injured since the 'special military operation' began on February 24. (");
System.out.println("Eurasian Times)"); 
            break;
case 26:
System.out.println("Northeastern Ukraine offensive Battle of Kharkiv The Holocaust memorial at Drobytsky Yar is hit by Russian shelling, damaging the memorial's menorah. (Jerusalem Post) Russian forces airstrike the western city of Lviv, injuring five people. (Reuters) "); 
            break;
case 27:
System.out.println("Ukrainian delegate Davyd Arakhamia announces that in-person ceasefire talks between the Ukrainian and Russian delegations will occur in Turkey. The talks are expected to occur from March 28 to March 30. (Ukrinform) "); 
            break;
case 28:
System.out.println("Battle of Irpin Mayor Oleksandr Markushyn says that Irpin has been recaptured by Ukrainian Ground Forces. (Times of Israel) Northeastern Ukraine offensive Battle of Kharkiv Russian artillery damages a school in Kharkiv. (Yahoo News) (Sky News) Eastern Ukraine offensive Russian troops shell Rubizhne,");
System.out.println(" Luhansk Oblast, killing one person. (Ukrinform) Trostyanets is retaken by Ukrainian Armed Forces. (Jerusalem Post) 2022 Russia–Ukraine peace negotiations Russia cautions against expecting any 'significant breakthroughs' ahead of the first round of in-person negotiations with Ukraine. (MSN) Two Ukra");
System.out.println("inian negotiators as well as sanctioned Russian oligarch Roman Abramovich are reported to have fallen victim to suspected poisoning during peace talks on the Belarus–Ukraine border earlier this month. Their health has since improved. (Reuters) (BBC News) Ukrainian President Volodymyr Zelenskyy says ");
System.out.println("that some mayors abducted by invading Russian forces have been found dead. (Ukrayinska Pravda) (The Economist) "); 
            break;
case 29:
System.out.println("Southern Ukraine offensive Battle of Mykolaiv Mykolaiv government building airstrike A missile strike hits the regional administration's headquarters in Mykolaiv, killing twelve people and injuring 22 others. (Reuters) Kyiv offensive, Northeastern Ukraine offensive Russian troops begin retreating fr");
System.out.println("om positions in Kyiv Oblast and Chernihiv Oblast, according to Ukrainian and American officials. The United States European Command confirms the Russian withdrawal, observing a 'major strategy shift'. (U.S. News & World Report) (Times of Israel) Attack on Snake Island Roman Hrybov, the border guard ");
System.out.println("who told the Russian warship command over the radio 'Russian warship, go fuck yourself' in defiance of its order to surrender Snake Island, is freed in a prisoner swap. Initial reports erroneously suggested that 13 border guards on the island had died. (The Guardian) Reactions to the 2022 Russian in");
System.out.println("vasion of Ukraine Russia–NATO relations The U.S. deploys 200 marines from the Marine Air Control Group 28, 10 F/A-18 Hornet fighter jets, and an unspecified number of C-130s to Lithuania as part of NATO's response to Russian military aggression in Eastern Europe. (USNI) 2022 Russia–Ukraine peace neg");
System.out.println("otiations The Ukrainian and Russian delegations hold face-to-face peace talks in Turkey for the first time in two weeks. (AP) Russian officials agree to 'fundamentally cut back military activity in the direction of Kyiv and Chernihiv' during the negotiations. (The Guardian) A shell strikes a tempora");
System.out.println("ry Russian military camp near the city of Belgorod, 25 km from the Russia–Ukraine border. Russian authorities report at least four injuries, and say that the shell was fired from Ukrainian territory. Ukraine denies firing the missile, instead attributing the strike to an error on Russia's part. (Reu");
System.out.println("ters)"); 
            break;
case 30:
System.out.println("2022 Russian invasion of Ukraine Eastern Ukraine offensive Siege of Mariupol Ukraine says that Russian artillery and aircraft have targeted a Red Cross hospital in the city of Mariupol. (Times of Israel) Battle of Chernobyl Ukrainian Deputy Prime Minister Iryna Vereshchuk calls for Russia to withdra");
System.out.println("w from the Chernobyl Exclusion Zone area and for Russian troops occupying the former nuclear plant to pull out. (Reuters) A U.S. official says that Russian forces have begun withdrawing from the Chernobyl area and have moved into Belarus. (France 24) 2022 Ukrainian refugee crisis The United Nations ");
System.out.println("High Commissioner for Refugees says more than four million Ukrainians have fled the country since the invasion began on February 24. (France 24)"); 
            break;
case 31:
System.out.println("Battle of Chernobyl Energoatom confirms that the Russian forces who occupied the former nuclear power plant in Chernobyl have left the Chernobyl Exclusion Zone. (Ukrinform) The International Atomic Energy Agency confirms that Russian forces have handed over control of the former nuclear power plant ");
System.out.println("back to Ukraine. Russian troops also withdraw from the city of Slavutych, returning to Belarus. (CNBC) Siege of Mariupol Ukrainian Deputy Prime Minister Iryna Vereshchuk says that Ukraine has sent buses to Mariupol in an effort to evacuate citizens from the city. (BBC News)"); 
            break;
                      default:
                      System.out.println("Select a day from 1 to 31:");
            break;
                     }
                     break;
case 4:
                    System.out.println("1. Enter a day in April(1-30):");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Battle of Bucha Ukrainian forces recapture Bucha, Kyiv Oblast, from Russian troops. (Ukrinform) Battle of Irpin Ukrainian forces recapture the city of Irpin after driving out the last Russian troops. Mayor Oleksandr Markushyn confirms that the city has been fully liberated. (BBC News) The body of Re");
System.out.println("uters journalist Maks Levin is found in the town of Huta Mezhyhirska, near Kyiv. Levin had already disappeared several days before and is the sixth journalist to be killed in the country since Russia invaded. (The Guardian) Attack on Belgorod Russia claims that the Ukrainian Air Force conducted an a");
System.out.println("irstrike on Belgorod, hitting several fuel facilities. Videos on social media show low-flying attack helicopters firing rockets at a fuel depot in the city. (AP) 2022 Russia–Ukraine peace negotiations Ceasefire talks between the Russian and Ukrainian delegations resume via video link. (Times of Isra");
System.out.println("el) "); 
                     break;
case 2:
System.out.println("Battle of Bucha Bucha massacre, War crimes in the 2022 Russian invasion of Ukraine Hundreds of civilians are found dead on the streets in Bucha after the city is recaptured by Ukrainian forces. Journalists and Ukrainian forces say that they have uncovered evidence of war crimes by the Russian milita");
System.out.println("ry. (Times of Israel) (The Guardian) (The Kyiv Independent) Battle of Chernobyl The Ukrainian flag is raised over the Chernobyl Nuclear Power Plant following its recapture from Russian forces. A ceremony is held to honour the staff at the former plant who continued to work under Russian occupation. ");
System.out.println("(CNN) Ukraine retakes full control of the Kyiv Oblast as the last Russian troops return to Belarus. (Reuters) Southern Ukraine offensive Aftermath of the Siege of Enerhodar Residents say that Russian occupiers have violently dispersed a pro-Ukrainian demonstration in Enerhodar. Several protesters ar");
System.out.println("e arrested. Russian troops are also alleged to have used explosions in order to disperse the crowd. (Reuters) Eastern Ukraine offensive Siege of Mariupol Lithuanian documentary filmmaker Mantas Kvedaravičius is killed in Mariupol. (Reuters)"); 
                     break;
case 3:
System.out.println("Southern Ukraine offensive Battle of Odesa Large explosions are reported in the port city of Odesa as residents are urged to seek shelter. Ukrainian officials say the Russian Air Force has fired missiles at the city, and that some missiles have been intercepted. (BBC News) (NDTV) Bucha massacre, War");
System.out.println(" crimes in the 2022 Russian invasion of Ukraine Human Rights Watch, an independent human rights group, says that it has documented allegations of war crimes perpetrated by Russian forces in Ukraine against civilians, including rape, summary execution, and looting of civilian properties. (CNN) The Un");
System.out.println("ited States, the European Union, and NATO leaders react to emerging reports of the massacre in Bucha, accusing the Russian Armed Forces of war crimes and calling for more sanctions against Russia. (BBC News)"); 
                     break;
case 4:
System.out.println("Battle of Bucha U.S. President Joe Biden calls for Russian President Vladimir Putin to face trials for war crimes after more images emerge of the Bucha massacre. (CNN) 2022 Russia–Ukraine peace negotiations Ukrainian President Volodymyr Zelenskyy says that peace talks will continue despite the Bucha");
System.out.println(" massacre. (BBC News)"); 
                     break;
case 5:
System.out.println("Eastern Ukraine offensive Siege of Mariupol A Dominica-flagged vessel berthed at the port in Mariupol is hit by artillery from the Russian Navy. One person is injured, but all crew members are successfully evacuated. (Reuters)"); 
                     break;
case 6:
System.out.println("Eastern Ukraine offensive Battle of Sievierodonetsk Russian forces shell Sievierodonetsk, Luhansk Oblast, setting ten high-rise buildings on fire. (The Guardian) Four civilians are reported to have been killed by the Russian military in Vuhledar, Donetsk Oblast. (Reuters) 2022 Russia–Ukraine peace n");
System.out.println("egotiations Russia says it will end its invasion if Ukrainian President Volodymyr Zelenskyy agrees to conditions set during negotiations, specifically a legal guarantee that Ukraine will not join NATO by changing the Ukrainian constitution to include such a provision. Russia also says it suspended o");
System.out.println("perations in Kyiv as a 'goodwill gesture' in order to promote peace talks. (Hindustan Times)"); 
                     break;
case 7:
System.out.println("The governor of Luhansk Oblast, Serhiy Haidai, reports that all hospitals in the province have been completely destroyed by the Russian Armed Forces. Russia denies the claim, accusing Ukraine of destroying their own hospitals. (CNN) Mayor Borys Filatov requests that all women, children, and elderly ");
System.out.println("leave the city of Dnipro in preparation for a possible Russian attack. (The Guardian)"); 
                     break;
case 8:
System.out.println("Eastern Ukraine offensive Kramatorsk railway station attack A pair of Russian missiles strike a railway station in Kramatorsk, killing at least 50 people and injuring at least 87 others. (Reuters) (Al Jazeera) "); 
                     break;
case 9:
System.out.println("Ukrainian President Volodymyr Zelenskyy says that Ukraine is still ready to continue peace negotiations with Russia. (RTÉ) Eastern Ukraine offensive Four people in Vuhledar and one person in Novomykhailivka, Marinka Raion, are killed by Russian shelling. Two people are injured. (Times of Israel) Ukr");
System.out.println("ainian Minister of Reintegration of Temporarily Occupied Territories Iryna Vereshchuk announces that President Zelenskyy has ordered a third prisoner exchange with Russia, with 12 Ukrainian soldiers and 14 civilians returning to Ukraine. (RFerl)"); 
                     break;
case 10:
System.out.println("Kyiv offensive A mass grave of Ukrainian civilians is discovered near the village of Buzova, Kyiv Oblast. (Radio Free Europe/Radio Liberty) (Reuters) Prosecutor General of Ukraine Iryna Venediktova says that 1,222 bodies have been discovered so far in Kyiv Oblast. (Times of Israel) Northeastern Ukra");
System.out.println("ine offensive Two people are killed and several others are injured by Russian shelling in the town of Derhachi, Kharkiv Oblast. (Reuters) Dnipro International Airport is completely destroyed by Russian missile strikes. Five people are injured. (Reuters)"); 
                     break;
case 11:
System.out.println("Siege of Mariupol Ukrainian President Volodymyr Zelenskyy announces that the city of Mariupol has been 'completely destroyed', stating the death toll as 'tens of thousands'. (Washington Examiner) Governor of Donetsk Oblast Pavlo Kyrylenko says that three people have been killed and eight more injure");
System.out.println("d by rocket attacks in the region. (Reuters)"); 
                     break;
case 12:
System.out.println("2022 Russian invasion of Ukraine U.S. President Joe Biden calls the Russian war in Ukraine a 'genocide'. (AP) "); 
                     break;
case 13:
System.out.println("Siege of Mariupol The Russian defence ministry claims that around 1,000 Ukrainian marines have surrendered to Russia. Ukraine makes no comment. (Rferl) Foreign aid to Ukraine during the Russo-Ukrainian War The United States says that it is sending an additional $800 million in military aid to Ukrain");
System.out.println("e, as well as heavy weapons, including artillery systems, artillery rounds, armored personnel carriers, Mi-17 helicopters transferred from Afghanistan, 300 Switchblade drones and unmanned surface vehicles for coastal defence. (Reuters) Russian deputy foreign minister Sergei Ryabkov says U.S. and NAT");
System.out.println("O vehicles transporting weapons on Ukrainian territory are 'legal military targets'. (Reuters) Northeastern Ukraine offensive Governor of Kharkiv Oblast Oleh Synyehubov says that seven people have been killed and 22 others have been injured in the oblast during the past 24 hours. (The Jerusalem Post");
System.out.println(") Kyiv offensive The Russian defence ministry says it will begin to target Ukrainian 'decision-makers', including President Volodymyr Zelenskyy, and command centres in the capital Kyiv if Ukrainian forces continue to attack Russian territory. (NDTV) Presidents Andrzej Duda of Poland, Gitanas Nausėda");
System.out.println(" of Lithuania, Egils Levits of Latvia, and Alar Karis of Estonia arrive in Kyiv and meet with Ukrainian president Volodymyr Zelenskyy. (AP) The Ukrainian military says that it has struck the Russian Navy's cruiser Moskva with Neptune anti-ship missiles hours after the warship was reported to be on f");
System.out.println("ire in the Black Sea. (FCB News) (NDTV)"); 
                     break;
case 14:
System.out.println("April 2022 Belgorod and Bryansk attacks Russian authorities say that they have temporarily evacuated the entire populations of two villages after Ukrainian forces allegedly shelled the Russian settlement of Spodaryushino in Belgorod Oblast. (Times of Israel) Russia says that two Ukrainian helicopter");
System.out.println("s 'carried out at least six air strikes on residential buildings in the village of Klimovo' in Bryansk Oblast, injuring seven people. Ukraine denies the accusations, saying that Russians shot the villages themselves as part of a plan to 'whip up anti-Ukrainian hysteria'. (Radio Free Europe/Radio Lib");
System.out.println("erty) (Reuters) 2022 Russia–Ukraine peace negotiations Turkish Foreign Minister Mevlüt Çavuşoğlu says that Turkey is still working on organizing a potential meeting between Ukrainian President Volodymyr Zelenskyy and Russian President Vladimir Putin. (APA.az) The Russian defence ministry confirms th");
System.out.println("at the Russian Navy flagship cruiser Moskva sank in the Black Sea after an explosion and fire onboard. Ukraine claims to have hit the warship with Neptune anti-ship missiles. (TASS) (RIA)"); 
                     break;
case 15:
                     System.out.println("Russia launches major missile strikes on Kyiv, saying that the strikes are in retaliation for the April 2022 Belgorod and Bryansk attacks. (Reuters)");
                     break;
case 16:
System.out.println("Northeastern Ukraine offensive Battle of Kharkiv Russian missile strikes hit Kharkiv, killing one person. (Reuters) A restaurant operated by the World Central Kitchen is confirmed to be destroyed by the missile strike. (The Hill) 2022 Russia–Ukraine peace negotiations It is reported that Russian oli");
System.out.println("garch Roman Abramovich has visited Kyiv in an effort to revive peace talks between Russia and Ukraine. (Bloomberg.com) The Russian Air Force launches airstrikes on Kyiv. (CTV News)"); 
                     break;
case 17:
System.out.println("Siege of Mariupol The Russian Armed Forces give an ultimatum to the last remaining holdout of Ukrainian troops and 'foreign fighters' at the Azovstal iron and steel works plant in Mariupol to surrender. Defenders of the Azov Sea port ignore the ultimatum. (Reuters) (Al Jazeera) 2022 Ukrainian refuge");
System.out.println("e crisis For the first time since the invasion began, more Ukrainians entered Ukraine from Poland than left, according to the Polish Border Guard. (BBC News) Six people are killed by Russian missile strikes on Lviv. (Independent)"); 
            break;
case 18:
System.out.println("Eastern Ukraine offensive Russian troops capture the city of Kreminna in Luhansk Oblast. Local authorities say that four refugees have been shot dead trying to escape the city. (Ukrinform) (Reuters) The Russian defence ministry says that its forces have destroyed 16 Ukrainian military facilities, in");
System.out.println("cluding five command posts, a fuel depot and three ammunition warehouses in 'mass strikes' overnight. Russia also says that it shot down two Ukrainian MiG-29s and one Su-25. (Reuters)"); 
                     break;
case 19:
System.out.println("Eastern Ukraine offensive Ukraine says that Russian forces have begun an anticipated military offensive in the Donbas with explosions reported in multiple cities. (BBC News) (Reuters) War in Donbas A civilian is killed and several others are injured by an explosion in Kramatorsk. (Times of Israel) N");
System.out.println("uclear threats during the Russian invasion of Ukraine Amidst American allegations that Russia may use nuclear weapons, Russian Foreign Minister Sergey Lavrov says that the country will not use them and will continue using conventional weapons. (Newsweek)"); 
                     break;
case 20:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Ukrainian negotiator Mykhailo Podolyak says in a tweet that Ukraine is ready to hold a special round of negotiations in Mariupol in an effort 'To save our guys, Azov (battalion), military, civilians, children, the living and the wounded'. (Reuters) A 91-ye");
System.out.println("ar-old Holocaust survivor is confirmed to have died on April 4, making her the second Holocaust survivor to be killed during the 2022 Russian invasion of Ukraine. (BBC News) Presidential advisor Oleksiy Arestovych claims that Ukraine is blocking an attempted Russian advance on Sloviansk. (Reuters) F");
System.out.println("oreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that Ukraine has received fighter aircraft and aircraft parts to bolster the Ukrainian Air Force. However, the number of aircraft sent or their origin are not disclosed. (Euractiv)"); 
                     break;
case 21:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Vladimir Putin tells his troops not to storm the Azovstal iron and steel works building in Mariupol, Donetsk Oblast, calling that plan 'impractical' and instead ordering a blockade of the area. (The Guardian) "); 
                     break;
case 22:
System.out.println("Southern Ukraine offensive, Russian occupation of Kherson Russian Major general Rustam Minnekayev says that the goal of the military operation is now to seize territory in Southern Ukraine in order to create a land corridor from Crimea to Ukraine's border with Transnistria, a pro-Russian unrecognize");
System.out.println("d breakaway state that is internationally recognized as part of Moldova. (BBC News) (The Guardian) 2022 Ukrainian refugee crisis Ukraine says that it will not allow residents to evacuate Mariupol today over concerns that the route is too dangerous. (Times of Israel) The mayor of Balakliia in Kharkiv");
System.out.println(" Oblast is charged with treason by Ukrainian authorities for accepting aid from Russian occupation forces. The mayor is believed to have fled to Russia with his family. (Newsweek) "); 
                     break;
case 23:
System.out.println("2022 bombing of Odesa Infrastructure in the Southern Ukrainian city of Odesa is hit by airstrikes, killing at least five people, including a baby, and injuring 18 others, according to the local authorities. (Reuters) (Times of Israel) The Investigative Committee of Russia announces that they are inv");
System.out.println("estigating allegations by RIA Novosti that troops from the British SAS have been deployed to Western Ukraine. (Reuters) (Al Jazeera)"); 
                     break;
case 24:
System.out.println("Ukrainian authorities claim that a person has been killed by overnight shelling in Dnipropetrovsk Oblast. (Reuters) Russian state media reports that Ukraine has launched rockets into a village in Belgorod Oblast, Russia. (Reuters) The Swiss Federal Department of Economic Affairs vetoes Germany's req");
System.out.println("uest to re-export Swiss ammunition to Ukraine on the basis of Switzerland's neutrality. (Reuters) U.S. Secretary of State Antony Blinken and Defense Secretary Lloyd Austin arrive in Ukraine and meet with Ukrainian president Volodymyr Zelenskyy. In the highest-level American visit in Kyiv since the b");
System.out.println("eginning of the Russian invasion, Zelenskyy is informed of the approved new military assistance for Ukraine. (CBS News) The Russian embassy in Tehran denies that Iran is a secret armament supplier for the Russian war effort. (Tasnim News Agency) "); 
                     break;
case 25:
System.out.println("April 2022 Belgorod and Bryansk attacks Two large fires occur at an oil refinery and a military depot in Bryansk, Russia. (The Guardian) Russian occupation of Kherson Oblast Kherson mayor Ihor Kolykhaiev announces that Russian forces have taken control of the Kherson City Council. (Ukrinform) Accord");
System.out.println("ing to Ukraine, Russian missile strikes hit numerous train stations across Ukraine. (The Guardian) A person is killed after Russia bombs the Kremenchuk Oil Refinery in Kremenchuk, Poltava Oblast. (Reuters) (Ukrinform) Regional authorities say that five people have been killed by airstrikes on Zhmery");
System.out.println("nka and Koziatyn, Vinnytsia Oblast. (Reuters) Russia's foreign ministry expels 40 German diplomatic staff in a retaliatory move after Germany expelled the same number of Russian diplomats. (Reuters)"); 
                     break;
case 26:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom's Armed Forces Secretary James Heappey says that Ukraine can strike targets inside Russia with British weapons, saying that it is 'completely legitimate' in order to disrupt attacks on Ukraine. (The Guardian) The Russian Defenc");
System.out.println("e Ministry accuses the UK of 'provoking Ukraine' into attacking Russian territory, and warns of a 'proportional response' should any attacks occur. (BBC News) Germany announces the delivery of 50 ex-Bundeswehr Gepard anti-air tanks to Ukraine, the first heavy weaponry supplied by Germany since the s");
System.out.println("tart of the invasion. (Reuters) 2022 Russia–Ukraine peace negotiations UN Secretary-General António Guterres visits Moscow in order to meet with Russian President Vladimir Putin. Before the meeting, Guterres calls for a ceasefire to end the war. (The Hindu) President Putin says that Russia and Ukrai");
System.out.println("ne are continuing ceasefire talks online. (Reuters) A Russian missile strike destroys a strategic bridge across the Dniester Estuary in Odesa Oblast, according to Ukrainian authorities. (AP) Russian Foreign Minister Sergey Lavrov says that weapons supplied to Ukraine 'will be a legitimate target for");
System.out.println(" Russia's military' and further stating 'storage facilities in western Ukraine have been targeted'. Lavrov also stated that 'NATO, in essence, is engaged in a war with Russia through a proxy and is arming that proxy. War means war.'(Al Jazeera) (The Independent)"); 
                     break;
case 27:
System.out.println("Southern Ukraine offensive, Russian occupation of Kherson Oblast The Ukrainian Air Force strikes the Kherson TV Tower with a missile temporarily forcing Russian television off-air in the occupied Kherson Oblast. (Canadian Press via Yahoo News) Russia says that it has struck 59 Ukrainian weapon facil");
System.out.println("ities during the night, including a depot in Zaporizhzhia Oblast which is being used to store weapons from the United States and Europe. (Reuters) Russia says that its air defences have shot down a Ukrainian unmanned aerial vehicle over the Kursk Oblast, while several explosions and a fire at an amm");
System.out.println("unition depot are reported in Belgorod Oblast. Ukraine describes the explosions in Russia as 'payback' and 'karma' for Moscow's invasion. (Reuters) "); 
                     break;
case 28:
System.out.println("Two major explosions hit Kyiv after Russia conducts missile strikes during a high-level visit to the city by UN Secretary-General António Guterres. At least ten civilians are injured and a Radio Free Europe/Radio Liberty journalist is killed. (Reuters) (VOA) "); 
            break;
case 29:
                     System.out.println("Russian President Vladimir Putin accepts an invitation to the upcoming G20 summit in Bali, Indonesia, despite Russia’s invasion of Ukraine. Ukrainian President Volodymyr Zelenskyy is also invited to the summit. (FirstPost)");
                     break;
case 30:
System.out.println("2022 Russia–Ukraine peace negotiations Russian Foreign Minister Sergey Lavrov says that sanctions must be lifted as part of the peace negotiations between Ukraine and Russia. (Reuters) April 2022 Belgorod and Bryansk attacks Governor of Kursk Oblast Roman Starovoyt says that shells have been launche");
System.out.println("d at a border checkpoint from the direction of Ukraine. (Reuters) Around 20 civilians have left the steel plant, a deputy commander of the Azov Battalion says. (The Times of Israel) "); 
            break;
                     default:
                     System.out.println("Enter a day from 1 to 30:");                     

                    //System.out.println(""); 
                    }
                    break;
case 5:
                    System.out.println("1. Enter a day in May:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Some civilian evacuations begin from the Azovstal iron and steel works in Mariupol. Officials believe that up to 1,000 people have sought refuge at the plant, which has been the target of Russian airstrikes for days. However, evacuations are suspended unti");
System.out.println("l 8 a.m. tomorrow due to 'security concerns'. (The Washington Post) (CNN) Five people are killed by Russian shelling in the town of Lyman. (Times of Israel) April 2022 Belgorod and Bryansk attacks A fire reportedly occurs at a military facility in Belgorod Oblast, Russia, slightly injuring one perso");
System.out.println("n and damaging seven houses. (Reuters) Transnistria conflict Ukrainian intelligence officials report that Russia is poised to launch a second front from the breakaway area of Transnistria in order to take over the rest of Moldova. (The Times)"); 
                     break;
case 2:
System.out.println("Southern Ukraine offensive 2022 bombing of Odesa A Russian missile hits a dormitory in Odesa, killing a 14-year-old boy and wounding a 17-year-old girl, according to Ukrainian officials. An Orthodox Church was also damaged in the missile strike. (Reuters) Siege of Mariupol The resumption of civilian");
System.out.println(" evacuations from the Azovstal steel mill which was expected to begin at 8 a.m. local time does not occur, as Russia begins a non-stop barrage of airstrikes and bombings following the departure of Red Cross personnel, who had left the previous day after the evacuations were suspended. (CNN) Five Rus");
System.out.println("sian troops are allegedly killed during a supposed incursion into the steel plant. (CNN) Belgorod and Bryansk attacks Explosions are reported in the city of Belgorod, Belgorod Oblast, Russia. Governor Vyacheslav Gladkov states that there were no casualties or damage. (Reuters via NDTV) A Ukrainian A");
System.out.println("ir Force Bayraktar TB2 drone destroys two Russian Raptor-class patrol boats near Snake Island in the Black Sea. (CBS News)"); 
                     break;
case 3:
System.out.println("Eastern Ukraine offensive Governor of Donetsk Oblast Pavlo Kyrylenko says that nine people have been killed by Russian shelling in Donetsk Oblast, Ukraine. (Reuters) Ten people are killed after projectiles hit a coking plant in Avdiivka, Donetsk Oblast. (Reuters) The United Nations says that 127 peo");
System.out.println("ple have been evacuated from the besieged Azovstal plant and nearby areas. (PBS News) 2022 Russia–Ukraine peace negotiations Russian President Vladimir Putin tells French President Emmanuel Macron that his country is ready to continue peace negotiations with Ukraine amidst fears that talks between t");
System.out.println("he two countries have stalled. (TASS) (KMGH-TV) "); 
                     break;
case 4:
System.out.println("The Associated Press confirms that approximately 600 people died in the Mariupol theatre airstrike. (AP) Russian forces bombard the Azovstal steel works plant in Mariupol with thermobaric missiles. Mariupol mayor Vadym Boychenko confirms that contact has been lost with Ukrainian soldiers trapped ins");
System.out.println("ide the plant. (Mirror) Ukraine confirms that Russian troops have entered the steel works plant after launching an all-out assault. (BBC News) Finland says that a Russian Air Force Mi-17 violated its airspace this morning, flying four to five kilometres inside Finnish airspace. The incursion comes a");
System.out.println("head of an expected Finnish application to join NATO. (RTÉ) Business and economy  International sanctions during the 2022 Russian invasion of Ukraine The European Union proposes to ban all oil imports from Russia by the end of the year, and also remove Russia's biggest bank, Sberbank, from SWIFT. (C");
System.out.println("NN) "); 
                     break;
case 5:
System.out.println("Siege of Mariupol Ukrainian forces say they have repelled a Russian military thrust onto the Azovstal iron and steel works in Mariupol, Ukraine. (PBS News)"); 
                     break;
case 6:
System.out.println("2022 Russia–Ukraine peace negotiations Ukrainian President Volodymyr Zelenskyy says that Ukraine is open to continue peace talks with Russia if they guarantee the restoration of preinvasion borders, return the Ukrainians who were forcefully evacuated to Russia, and if Russian troops withdraw from th");
System.out.println("e country. (The Independent) (Axios) Ukrainian MP Oleksiy Goncharenko claims that the Russian frigate Admiral Makarov was struck with Neptune anti-ship missiles off of Snake Island. Russia denies having any information of the strike. (Newsweek)"); 
                     break;
case 7:
System.out.println("2022 bombing of Odesa Four Russian missiles strike the Ukrainian port city of Odesa. (Reuters) Siege of Mariupol Ukraine says that all women, children, and elderly have been evacuated from the besieged Azovstal steel plant. (Reuters) Bilohorivka school bombing Russian forces bomb a school in Bilohor");
System.out.println("ivka, Sievierodonetsk Raion, Luhansk Oblast. Only two deaths are confirmed but sixty people are believed to have been killed. (Reuters)"); 
                     break;
case 8:
System.out.println("Prime Minister of Canada Justin Trudeau, Deputy Prime Minister Chrystia Freeland and Minister of Foreign Affairs Mélanie Joly make an unannounced visit to Kyiv to meet with President of Ukraine Volodymyr Zelenskyy amid the ongoing Russian invasion. (CTV News) Trudeau announces the reopening of the C");
System.out.println("anadian Embassy in Kyiv. (Politico) Ukraine–United States relations U.S. First Lady Jill Biden makes an unannounced visit to Uzhhorod, Ukraine, and holds a Mother’s Day meeting with Ukrainian First Lady Olena Zelenska. (AP) (CNN)"); 
                     break;
case 9:
System.out.println("Enlargement of NATO The Swedish Social Democratic Party announces that it will decide on May 15 whether to pursue a course of action to join NATO. Finnish President Sauli Niinistö is expected to also announce Finland's intention to join NATO on May 12. (Al Jazeera)"); 
                     break;
case 10:
System.out.println("The operator of Ukraine's natural gas system GTSOU announces that it will stop shipments of Russian gas through the Sokhranivka route on Wednesday. (Reuters) International relations  Lithuania–Russia relations, Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine The Se");
System.out.println("imas of Lithuania unanimously votes to designate Russia as a terrorist state and to classify Russia's actions in Ukraine as genocide. (NPR)"); 
                     break;
case 11:
System.out.println("2022 bombing of Odesa Russian forces continue to fire missiles at the Ukrainian port city of Odesa in an apparent attempt to cut supplies to the city. (AP) Battle of Kharkiv Ukrainian military forces recapture several settlements north of Kharkiv, driving Russian troops to less than a dozen miles fr");
System.out.println("om the Russian border. (MSN)"); 
                     break;
case 12:
System.out.println("Eastern Ukraine offensive Ukrainian forces repel an attempted Russian military crossing of the Donets river, west of Sievierodonetsk, in Luhansk Oblast. At least one Russian battalion tactical group is reportedly destroyed, as well as the pontoon bridge deployed in the crossing. (Reuters) The Russia");
System.out.println("n Air Force launches around a dozen missiles at the city of Kremenchuk, including four at the Kremenchuk Oil Refinery, in Poltava Oblast. (Ukrinform)"); 
                     break;
case 13:
System.out.println("RAO Nordic, a subsidiary of Russian energy company Inter RAO, announces it will suspend deliveries of electricity to Finland, saying it has not been paid for prior deliveries. The suspension comes as Russia threatens retaliation if Finland joins NATO. (BBC News) Finland–Turkey relations, Sweden–Turk");
System.out.println("ey relations Turkish president Recep Tayyip Erdoğan says that Turkey will oppose Sweden and Finland's applications to join NATO, asserting that the countries are guesthouses for terrorist organisations, without giving details. Turkey has repeatedly criticized Sweden and other Western European countr");
System.out.println("ies for its handling of organisations labeled terrorist by the Turkish government, including the Kurdish militant groups PKK and YPG, and the followers of U.S.-based Islamic cleric Fethullah Gülen. (Reuters) Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine Russia–Un");
System.out.println("ited States relations U.S. Defense Secretary Lloyd Austin holds talks with Russian Defense Minister Sergei Shoigu in the first meeting between the two since the start of the invasion. (Reuters)"); 
                     break;
case 14:
System.out.println("Proposed Russian annexation of South Ossetia Outgoing South Ossetian President Anatoly Bibilov announces that a referendum on joining Russia will be held on July 17. (Reuters)"); 
                     break;
case 15:
                     System.out.println("Russia launches missile strikes from the Black Sea on military infrastructure in Yavoriv Raion, Lviv Oblast, located near Ukraine's western border with Poland. The target was completely destroyed, according to the region's governor Maksym Kozytskyy. (Reuters)");
                     break;
case 16:
System.out.println("Battle of Kharkiv Ukraine says that its troops have pushed back Russian forces in a counter-offensive, reaching the border with Russia. Kharkiv governor Oleh Synyehubov confirms that Ukrainian forces have restored control of a border crossing with Russia in the region. (Reuters) Siege of Mariupol Fi");
System.out.println("ve buses and an armored personnel carrier evacuate several hundred soldiers from the Azovstal steel works following negotiations with the Russian Armed Forces. The evacuated soldiers will be exchanged for Russian prisoners of war. (BBC News) (Reuters) The Russian Defence Ministry says that its force");
System.out.println("s have shot down three Ukrainian Air Force warplanes, including a Su-25 over Mykolaiv and a Su-24 strike jet near Snake Island in the Black Sea. (Reuters)"); 
                     break;
case 17:
                     System.out.println("A Russian airstrike kills eight people and injures twelve others in Desna, Chernihiv Oblast. (Reuters)");
                     break;
case 18:
                     System.out.println("Google's Russian subsidiary announces its intention to file for bankruptcy after Russian authorities seize the company's bank account. (Reuters)");
                     break;
case 19:
                     System.out.println("The United States Senate votes 86–11 to pass a $40 billion package aimed at sending aid to Ukraine. The legislation will head to U.S. President Joe Biden for his signature. (Reuters)");
                     break;
case 20:
System.out.println("Siege of Mariupol Ukraine's chief military command orders all remaining troops in the Azovstal steel plant to stop defending Mariupol. (AFP via Le Devoir) (Sky News) Russia says that its forces have seized the Azovstal steel plant after the last remaining Ukrainian troops surrender. (BBC News) Donba");
System.out.println("s offensive Ukraine says that it has repelled a Russian advance on the cities of Sievierodonetsk and Lysychansk in Luhansk Oblast. Authorities say that twelve people were killed in the offensive and that over 60 houses were destroyed. (AP)"); 
                     break;
case 21:
System.out.println("Siege of Mariupol Russia declares victory in capturing the city of Mariupol. (The Guardian) United States President Joe Biden signs into law a bill that would provide $40 billion in military and economic aid for Ukraine, replenish stocks of U.S. equipment sent to Ukraine, fund European Command opera");
System.out.println("tions, and address the global food crisis. (CNN) (Reuters) "); 
                     break;
case 22:
                     System.out.println("The Russian-appointed mayor of Enerhodar, in Russian-occupied Zaporizhzhia Oblast, is severely injured in an explosion. The cause of the blast is unclear. (Reuters)");
                     break;
case 23:
System.out.println("Russian diplomat Boris Bondarev says that he has resigned to protest the invasion of Ukraine. (Reuters) "); 
                     break;
case 24:
System.out.println("Siege of Mariupol Ukrainian authorities say that about 200 dead people are found in the rubble of an apartment building in Mariupol, Donetsk Oblast. (AP) Battle of Donbas Russian Ground Forces seize control of Svitlodarsk in Donetsk Oblast, according to regional governor Pavlo Kyrylenko. (Reuters) H");
System.out.println("ungary declares a state of emergency over the war in Ukraine and problems in the Hungarian economy caused in part by the conflict. (Reuters) "); 
                     break;
case 25:
System.out.println("Donbas offensive The Ukrainian city of Pokrovsk, Donetsk Oblast, is hit by Russian missiles, injuring several people. (AP) Southern Ukraine offensive A Russian cruise missile strike destroys a shopping centre and several homes in the city of Zaporizhzhia, killing one person and injuring three others");
System.out.println(". At least 62 homes were damaged, according to local officials. (Ukrinform)"); 
                     break;
case 26:
System.out.println("Eastern Ukraine offensive Battle of Kharkiv Seven people are killed by Russian shelling in downtown Kharkiv, according to local authorities. (Ukrinform) The Russian defense ministry says that civil vessels are allowed to use a maritime humanitarian corridor to access the port of Mariupol, which Russ");
System.out.println("ia captured last week. (Reuters) "); 
                     break;
case 27:
System.out.println("Battle of Lyman Russian forces announce they have captured the city of Lyman. (AP)"); 
                     break;
case 28:
System.out.println("Battle of Sievierodonetsk Russian troops enter the strategic city of Sievierodonetsk in Luhansk Oblast with heavy street-to-street fighting underway. Luhansk governor Serhiy Haidai says that Ukrainian forces may have to retreat from the city in order to avoid capture. (Reuters) Foreign aid to Ukrain");
System.out.println("e during the Russo-Ukrainian War Ukraine confirms that it has received shipments of Harpoon anti-ship missiles from Denmark, and self-propelled howitzers from the United States in order to counter the Russian invasion. (Reuters)"); 
                     break;
case 29:
                     System.out.println("Nothing significant to report");
            break;
case 30:
System.out.println(" Battle of Donbas Battle of Sievierodonetsk Ukrainian authorities say that Russian forces have entered Sieverodonetsk, Luhansk Oblast, leaving the city without water. (Al Jazeera) Rebel forces say a Ukrainian shelling attack in Donetsk has killed five civilians (including a teenager) and left 13 inj");
System.out.println("ured. (AP) (Le Monde) A French journalist is killed by Russian shelling in Luhansk Oblast, according to the region's governor Serhiy Haidai. (Reuters) A car bomb is detonated in Russian-occupied Melitopol, Zaporizhzhia Oblast, injuring at least three people. Russian authorities blame pro-Ukrainian r");
System.out.println("esidents for the incident. (Reuters)"); 
                     break;           
case 31:
System.out.println("Eastern Ukraine offensive Battle of Sievierodonetsk An airstrike hits a tank filled with nitric acid in Sievierodonetsk, Luhansk Oblast, prompting the region's governor to ask residents to remain inside bomb shelters due to the risk of exposure to toxic fumes. (Reuters) Ukraine says that Russian for");
System.out.println("ces have taken control of most of Sievierodonetsk after launching a full-scale assault on the city. Luhansk governor Serhiy Haidai says that 60% of structures in the city have been destroyed in the fighting. (Reuters) A Russian missile hits an apartment in Sloviansk, Donetsk Oblast, killing three pe");
System.out.println("ople and injuring six others. (AP)"); 
                     break;
                     default:
                      System.out.println("Select a day from 1 to 31:");

                     //System.out.println("");
                     
                    }
                    break;
case 6:
                    System.out.println("1. Enter a day in June:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Eastern Ukraine offensive Three civilians are killed after Russian forces shell the Sviatohirsk Lavra monastery. (Ukrayinska Pravda via Yahoo! News) Foreign aid to Ukraine during the Russo-Ukrainian War Germany says that it will send the IRIS-T air defence missile system to Ukraine following a reque");
System.out.println("st from Ukraine for heavy weapons. (Reuters) U.S. President Joe Biden agrees to provide Ukraine with long-range rocket artillery systems after Ukraine reportedly gave assurances that they will not use the missile systems to strike Russian cities. The weapons systems are a part of a new $700 million ");
System.out.println("weapons package to Ukraine that will also include ammunition, counter-fire radars, a number of air surveillance radars, and additional Javelin anti-tank missiles. (Reuters) Russia says the U.S. decision to supply advanced long-range rocket systems and munitions to Ukraine could widen the conflict, a");
System.out.println("nd also risks direct confrontation with Russia, accusing the United States of purposefully and diligently adding fuel to the fire. (Reuters) "); 
                     break;
case 2:
System.out.println("Southern Ukraine offensive Ukrainian officials say that the Armed Forces of Ukraine have recaptured 20 settlements in Kherson Oblast. (VOA) Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces that it will send M270 Multiple Launch Rocket Systems to Ukraine to counter t");
System.out.println("he Russian invasion. (Euro Weekly News) Sweden announces that it will send additional military aid to Ukraine, including anti-ship missiles, anti-tank guided missiles, and rifles for the Ukrainian Ground Forces. (Reuters)"); 
                     break;
case 3:
System.out.println("Battle of Donbas Battle of Sievierodonetsk Two Reuters journalists are injured and their driver is killed after their vehicle is attacked while travelling to Sievierodonetsk. The perpetrators have not been identified. (Times of Israel) Russian occupation of Kharkiv Oblast Vitaly Ganchev is announced");
System.out.println(" as head of the Kharkiv Military-Civilian Administration. His appointment might have happened earlier as he was de facto Governor since April 2022."); 
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("2022 Russian invasion of Ukraine Battle of Donbas Russian major general Roman Kutuzov is killed in Mykolaivka, Luhansk Oblast. (Reuters) (Ukrayinska Pravda) Russia launches airstrikes on the Ukrainian capital Kyiv for the first time since April 28. The Russian Defence Ministry says that the missile ");
System.out.println("strikes targeted T-72 tanks that had been supplied to Ukraine by several EU countries. At least one person is injured. (The Guardian)"); 
                     break;
case 6:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces that it will send several M270 long-range rocket artillery systems to Ukraine. (The Guardian)"); 
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
                     System.out.println("Vitaliy Khotsenko is sworn as new Prime Minister of the Donetsk People's Republic following dimission of Alexander Ananchenko. (TASS)");
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
                     System.out.println("The Ministry of Foreign Affairs of Ukraine states that the country has installed naval mines in the exercise of our right to self-defence. (Reuters)");
                     break;
case 11:
System.out.println("Battle of Sievierodonetsk Russian forces shell the Azot chemical plant in Sievierodonetsk, Luhansk Oblast. Governor Serhiy Haidai says that the attack has caused a massive fire at the plant. (Reuters) "); 
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
System.out.println("Battle of Sievierodonetsk Russian forces destroy the last remaining bridge leading to Sievierodonetsk in Luhansk Oblast, Ukraine, trapping all remaining Ukrainian civilians in the city, according to regional governor Serhiy Haidai. (Reuters) Battle of Donbas The Donetsk People's Republic says that f");
System.out.println("ive people have been killed and 22 others injured in an artillery attack on a marketplace in central Donetsk. Pro-Russian media accuses NATO of supplying the munitions used in the attack. (Reuters)"); 
                     break;
case 14:
System.out.println("2022 Western Russia attacks Six people are reported injured in an alleged shelling attack on Klintsy, Bryansk Oblast, Russia. (Reuters)"); 
                     break;
case 15:
                     System.out.println("The United States announces a new $1 billion military aid package to Ukraine that includes 18 howitzers, artillery rockets, night vision devices, and for the first time, two Harpoon anti-ship missile units. (Reuters)");
                     break;
case 16:
System.out.println("2022 Russian invasion of Ukraine Ukrainian officials say that four people have been killed and six others have been injured in a rocket attack in Sumy overnight. (Reuters) The mayor of Melitopol claims that Ukrainian farmers caused mass illness in Russian troops by poisoning cherries. (The Daily B");
System.out.println("east)"); 
                     break;
case 17:
System.out.println("Nuclear threats during the Russian invasion of Ukraine Russian President Vladimir Putin says that Russia would only use nuclear weapons if the sovereignty of the country is threatened. (Ukrinform) Ukrainian authorities say that its forces hit the Russian tugboat Vasiliy Bekh transporting soldiers, w");
System.out.println("eapons, and ammunition to Snake Island with Harpoon missiles. (Al Arabiya)"); 
                     break;
case 18:
System.out.println("Donetsk People's Republic authorities accuse Ukrainian forces of shelling the Zasyadko coal mine and trapping 77 miners. (Al Arabiya) 2022 Russia–Ukraine peace negotiations Ukrainian delegate Davyd Arakhamia says that Ukraine is planning to resume ceasefire negotiations with Russia this August. (Fin");
System.out.println("ger Lake Times)"); 
                     break;
case 19:
System.out.println("Russian occupation of Kharkiv Oblast Ukraine says that Russian forces are advancing on the city of Kharkiv. (Reuters) Battle of Sievierodonetsk Russia says that its forces captured a district in the outskirts of Sieverodonetsk and that it launched Kalibr cruise missiles against a command centre in D");
System.out.println("nipro, killing several Ukrainian generals and officers. (Reuters) "); 
                     break;
case 20:
System.out.println("Pro-Russian forces of the Luhansk People's Republic claim to have taken the key town of Toshkivka, 25 km south of Sieverodonetsk. (Reuters) Ukrainian forces fire missiles at a Chornomornaftogaz drilling oil facility in the Black Sea, off Crimea, injuring three workers, with seven others missing. Rus");
System.out.println("sia launches missile strikes on Odesa in retaliation for the attack. (The Telegraph) (The Telegraph 2) A second American volunteer fighter dies in Ukraine, after triggering a landmine. (Rolling Stone)"); 
                     break;
case 21:
System.out.println("Russian occupation of the Luhansk Oblast Luhansk Governor Serhiy Haidai says that Russian forces captured the towns of Pidlisne and Myrna Dolyna, south of Lysychansk, and also confirms reports that separatist forces captured Toshkivka yesterday. (Reuters) The Governor of Kharkiv Oblast, Oleh Synyehu");
System.out.println("bov, reports that Russian shelling killed 15 civilians in and near Kharkiv. (Reuters)"); 
                     break;
case 22:
System.out.println("The Ukrainian Air Force launches drone strikes on an oil refinery in Novoshakhtinsk, Rostov Oblast, Russia, causing a large explosion and fire. Operations at the refinery have been suspended. Footage on social media appears to show at least one armed drone striking the facility. (Reuters) War crimes");
System.out.println(" in the 2022 Russian invasion of Ukraine Reporters Without Borders releases a report claiming that a Ukrainian photojournalist was summarily executed while injured on the ground by Russian soldiers during the early stages of the conflict. (Al Jazeera) Southern Ukraine offensive Seven Russian missile");
System.out.println("s strike the city of Mykolaiv, killing at least one person and damaging a number of residential and commercial buildings, according to Mykolaiv governor Vitaliy Kim. (The Telegraph) The Ukrainian military says that it has inflicted significant losses on Russian forces after launching airstrikes on S");
System.out.println("nake Island in the Black Sea, destroying a Pantsir missile system, a radar station and numerous vehicles on the occupied island. (Euronews) "); 
                     break;
case 23:
System.out.println("The Governor of Luhansk Oblast, Serhiy Haidai, says that Russia is just destroying everything in Lysychansk as pro-Russian separatists say they are close to capturing both that city and Sieverodonetsk. (AFP via Dunya News) War crimes in the 2022 Russian invasion of Ukraine The first trial for rape d");
System.out.println("uring the war in Ukraine is set to begin in absentia against a 32-year-old Russian soldier accused of murdering a civilian and repeatedly raping his wife during the offensive in Kyiv. (Reuters)"); 
                     break;
case 24:
System.out.println("Battle of Sievierodonetsk Governor of Luhansk Oblast Serhiy Haidai announces that Ukrainian forces will withdraw from Sievierodonetsk amid the advance of Russian and pro-Russian forces. (Axios) A Russian-appointed senior official for the Kherson youth department is killed by a car bombing in Kherson");
System.out.println(" in an apparent assassination. (Al Jazeera) (The Moscow Times) Ukrainian authorities say that Russian forces have captured the city of Hirske, south of Lysychansk, in Luhansk Oblast. Chechen leader Ramzan Kadyrov says that his forces also captured the town of Zolote. (Reuters) (Newsweek)"); 
                     break;
case 25:
System.out.println("Battle of Sievierodonetsk The mayor of Sieverodonetsk announces that Russian forces have fully occupied the city. (Reuters) Eastern Ukraine offensive Pro-Russian forces say that they have entered the city of Lysychansk, the last major city still held by Ukrainian forces in Luhansk Oblast, and that s");
System.out.println("treet-to-street fighting is underway. (First Post) Russia launches dozens of cruise missiles at targets in multiple Ukrainian cities, including Yavoriv, Zhytomyr, and Desna. At least 20 missiles were fired from Belarusian airspace. (Reuters) (Yahoo! News)"); 
                     break;
case 26:
System.out.println("Several Russian cruise missiles strike Kyiv, killing one civilian and injuring four others, according to Ukraine's Prosecutor General. Some of the missiles were launched from Tupolev Tu-95 strategic bombers over the Caspian Sea. (BBC News) (Al Jazeera) (Ukrinform) A missile strike kills a civilian a");
System.out.println("nd destroys a strategic bridge connecting western Ukraine with eastern battlefields in Cherkasy Oblast. (Reuters)"); 
                     break;
case 27:
System.out.println("Kremenchuk shopping mall attack Two missiles strike a crowded mall in the city of Kremenchuk, killing at least 13 people and injuring at least 50 others. Ukrainian President Volodymyr Zelenskyy says that more than a thousand people were in the mall at time of the attack. (Reuters) (Al Jazeera) The G");
System.out.println("overnor of Luhansk Oblast claims that a Russian strike in Lysychansk killed eight civilians who were collecting water and injured 21 others. (NDTV) Business and economy  2022 Russian debt default Russia defaults on two Taiwanese-owned Eurobonds worth US$100 million after Western sanctions on Russia ");
System.out.println("led Euroclear to block Russian attempts to service the debt before yesterday's deadline. Russia describes the default as artificially manufactured and a farce. The default will have few immediate consequences for Russia since the country is currently unable to borrow internationally due to the SWIFT");
System.out.println(" ban against Russian banks. (Reuters) (BBC News)"); 
                     break;
case 28:
                     System.out.println("Nothing significant to report");
                     break;
case 29:
System.out.println("Russian occupation of Kherson Oblast De jure mayor of Kherson Ihor Kolykhaiev is detained by Russian security forces after Russian-installed officials say that he refused to follow orders. (Reuters) The Russian-appointed military-civilian authorities in Kherson announce a referendum on whether to jo");
System.out.println("in Russia. (Reuters)"); 
                     break;
case 30:
                     System.out.println("Russia announces that it has withdrawn from Snake Island, in the Black Sea, as a gesture of goodwill, ending the occupation of the island that began in February. However, Ukraine says that it drove out Russian forces from the island after a massive artillery assault. (Reuters)");
                     break;
                     //System.out.println("");
                     default:
                     System.out.println("Select a day from 1 to 30:");  
                  }
                  break;

case 7:
                    System.out.println("1. Enter a day in July :");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Serhiivka missile strike At least 21 civilians are killed and 38 others injured when two Russian missiles strike a multi-story building and a recreation centre in Serhiivka, Odesa Oblast. (The Guardian)"); 
                     break;
case 2:
System.out.println("The Mariupol City Council claims that over 10,000 of the city's residents are being held prisoner by the separatist Donetsk People's Republic. (UkInterfax) Belarusian President Alexander Lukashenko claims that his country intercepted Ukrainian missiles directed at Belarus three days ago and says tha");
System.out.println("t Belarus does not want war with Ukraine. (CNBC)"); 
                     break;
case 3:
System.out.println("2022 Western Russia attacks Three people are killed by explosions at residential buildings in Belgorod, Russia, near the border with Ukraine. Fifty buildings are partially destroyed by the explosions. (BBC News) Armed forces of Russia and the separatist Luhansk People's Republic capture the entire L");
System.out.println("uhansk Oblast after seizing Lysychansk. Ukrainian forces confirm that they were forced to retreat. (CNN) Six people are killed and many others are injured as heavy shelling from rocket launchers hit the city of Sloviansk, in Donetsk Oblast, according to a report from the city's mayor. (Yahoo! News)"); 
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("Battle of Donbas According to Ukraine, two civilians are killed in a Russian missile attack on Sloviansk in Donetsk Oblast. (Reuters) The Governor of Donetsk Oblast urges civilians to evacuate as Russia advances. Around 350,000 civilians have already evacuated. (Al Jazeera)"); 
                     break;
case 6:
System.out.println("Battle of Donbas At least twelve civilians are killed and 25 others are injured by heavy Russian shelling in Donetsk Oblast, according to a report by Governor Pavlo Kyrylenko. (AP) (VOA) Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine Latvia plans to reintroduce co");
System.out.println("nscription, which had been abolished in 2006, as a result of the Russian invasion of Ukraine. The final decision will be determined by the country's parliament, the Saeima. (Baltic News Network) (AFP via The Guardian)"); 
                     break;
case 7:
System.out.println("Battle of Donbas Russian forces launch airstrikes on the city of Kramatorsk, in Donetsk Oblast, with casualties reported, according to the city's mayor. (Reuters) Russia says that it fired missiles at Snake Island, killing an unspecified number of Ukrainian troops. However, Ukraine denies that any c");
System.out.println("asualties have occurred. (Evening Standard) "); 
                     break;
case 8:
System.out.println("2022 Russian invasion of Ukraine Serhiy Haidai, Governor of Luhansk Oblast, says that Russian shelling continues across the oblast and that the 8,000 residents of Sievierodonetsk are on the verge of a humanitarian catastrophe. (ABC News) "); 
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
System.out.println("Battle of Donbas Missile strike on Chasiv Yar A Russian airstrike on an apartment complex in Chasiv Yar, Donetsk Oblast, kills at least 47 people and leaves nine others injured. (Sky News)"); 
                     break;
case 11:
System.out.println("Three civilians are killed and 31 others are injured in a Russian shelling of Kharkiv. The city's mayor says that the latest shelling has targeted civilian infrastructure. (SwissInfo) Russian occupation of Kharkiv Oblast The Russian-appointed military-civilian administration leader of Velykyi Burluk");
System.out.println(" in Kharkiv Oblast, Yevgeny Yunakov, is assassinated in a car bombing. (Reuters) 2022 Ukrainian summer counteroffensive Ukrainian Ground Forces recapture the town of Ivanivka in Kherson Oblast after launching a counter-offensive against Russian forces. (Reuters)"); 
                     break;
case 12:
System.out.println("2022 Ukrainian summer counteroffensive Nova Kakhovka airstrike A massive explosion occurs in the city of Nova Kakhovka after Ukrainian forces destroy a Russian arms depot. Russian state news agency TASS claims that a market, hospital, and civilian housing were also damaged, and that multiple civilia");
System.out.println("ns were killed. Russian 22nd Army Corps general Artem Nasbulin is allegedly among the dead. (Ukrayinska Pravda) (Reuters) (UPI) U.S. National Security Advisor Jake Sullivan claims that Iran will provide Russia with hundreds of drones along with the necessary training for their use. (The Washington P");
System.out.println("ost)"); 
                     break;
case 13:
System.out.println("Battle of Donbas Heavy Russian shelling is reported in Bakhmut, Donetsk Oblast, with at least one person killed and five others injured in the largely evacuated town. (The Guardian)"); 
                     break;
case 14:
System.out.println("2022 Vinnytsia attacks July 2022 Vinnytsia missile strike At least 23 civilians are killed and more than 100 others are injured by three Russian missile strikes in Vinnytsia. (BBC News)"); 
                     break;
case 15:
                     System.out.println("At least three civilians are killed and 15 others are injured in Russian cruise missile strikes on the city of Dnipro. (Reuters)");
                     break;
case 16:
System.out.println("Russian missiles strike the city of Chuhuiv in Kharkiv Oblast, killing three civilians and injuring three others, while more than 50 Grad rockets hit the city of Nikopol in Dnipropetrovsk Oblast, killing two people. The missile strikes come after Russian defence minister Sergei Shoigu ordered the mi");
System.out.println("litary to expand operations in Ukraine in order to protect the Donbas. (Reuters) The president of Energoatom, the Ukrainian nuclear energy authority, accuses Russian forces of using the Zaporizhzhia Nuclear Power Plant to store weapons and shell the surrounding area. (The Journal.ie) "); 
                     break;
case 17:
                     System.out.println("Nothing significant to report");
                     break;
case 18:
System.out.println("Russian shelling kills six civilians in Toretsk, Donetsk Oblast, as Ukraine says that Russia appears to be preparing for a new ground offensive near Sloviansk. (BBC News) Russian occupation of Zaporizhzhia Oblast Russia announces Anton Koltsov, former Prime Minister of Vologda Oblast, as the new Pri");
System.out.println("me Minister in Zaporizhzhia Military-Civilian Administration. His appointment probably took place some days earlier.[1] Business and economy  Russia in the European energy sector Russia's Gazprom says that it 'cannot guarantee' gas supplies to Europe due to 'extraordinary circumstances' as it declar");
System.out.println("es force majeure on gas supplies dating from June 14. (Reuters)"); 
                     break;
case 19:
                     System.out.println("Gazprom signs a memorandum of understanding for the development of Iranian oil and gas fields and related infrastructure worth $40 billion. (Reuters)");
                     break;
case 20:
                     System.out.println("Russian Foreign Minister Sergey Lavrov says that his country's military goals are no longer limited to the Donbas region and have expanded to also include 'the Kherson region, the Zaporizhzhia region and a number of other territories'. (Al Jazeera)");
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
                     System.out.println("Russia and Ukraine sign a UN-backed agreement to allow the export of millions of tonnes of grain from blockaded Black Sea ports. (The Guardian)");
                     break;
case 23:
System.out.println("2022 bombing of Odesa Two Russian Kalibr cruise missiles hit Odesa's port less than a day after a deal to export grain from Ukraine was signed between Russia and Ukraine. Initial reports indicate no related infrastructure damage. (AP) A Russian cruise missile attack destroys a railway station in Kir");
System.out.println("ovohrad Oblast, killing three people and injuring several others. (France 24)"); 
                     break;
case 24:
                     System.out.println("Nothing significant to report");
                     break;
case 25:
System.out.println("War crimes in the 2022 Russian invasion of Ukraine Head of the Investigative Committee of Russia, Alexander Bastrykin, says that Russia has charged 92 members of the Armed Forces of Ukraine with crimes against the peace and security of humanity, with a further 96 people being wanted. There are also ");
System.out.println("1,300 ongoing criminal investigations. (BBC News)"); 
                     break;
case 26:
System.out.println("2022 Ukrainian summer counteroffensive Ukrainian forces strike the strategic Antonivka Road Bridge in Kherson Oblast using its M142 HIMARS missile system, causing severe damage to the bridge and preventing vehicles from crossing. Ukraine also claims to have destroyed a Russian ammunition depot, arti");
System.out.println("llery and other military equipment in the region, killing 51 Russian troops. (AP) Ukraine says that Russia has launched cruise missile strikes at targets along its Black Sea coast, including at Odesa and Mykolaiv port infrastructure. (Voice of America)"); 
                     break;
case 27:
System.out.println("Russia captures the Vuhlehirska Power Station, Ukraine's second largest power plant, near the city of Svitlodarsk, Donetsk Oblast. (Reuters) Russia says that it has destroyed more than 100 M142 HIMARS missiles in an airstrike on Dnipro. (Reuters)"); 
                     break;
case 28:
System.out.println("2022 Ukrainian summer counteroffensive Ukrainian presidential advisor Oleksiy Arestovych says that an operation to recapture the Kherson Oblast has started. (The Guardian) Battle of Donbas Russian forces shell Bakhmut in Donetsk Oblast with the BM-27 Uragan MLRS, killing three civilians and injuring");
System.out.println(" three others. Six apartment blocks and six detached houses are also destroyed or damaged. (Ukrinform) Belarusian involvement in the 2022 Russian invasion of Ukraine Russian forces in Belarus launch 25 ballistic missiles into northern Ukraine. (The Guardian) Russia launches cruise missile strikes fr");
System.out.println("om the Black Sea on the Kyiv Oblast for the first time in weeks, with missiles striking Bucha, Lyutizh, and Vyshhorod. At least fifteen people, including five civilians, are injured, according to Kyiv governor Oleksiy Kuleba. (AP) (Axios) Russian missiles strike Kropyvnytskyi, damaging facilities ow");
System.out.println("ned by Kropyvnytskyi Flight Academy and Air Urga. Five people are killed and 25 others are injured. (Yahoo! News)"); 
                     break;
case 29:
System.out.println("Olenivka prison explosion Russia and the Donetsk People's Republic (DPR) say that 53 people were killed and 75 others injured after shelling hit a prison holding Ukrainian prisoners of war in the DPR-controlled city of Olenivka, Donetsk Oblast. Russia and Ukraine accuse each other of carrying out th");
System.out.println("e strike. (AP) War crimes in the 2022 Russian invasion of Ukraine A video emerges on social media of a Russian soldier castrating a Ukrainian prisoner of war in the town of Sievierodonetsk, Donetsk Oblast. The video has not been independently verified. The Ukrainian government voices outrage over th");
System.out.println("e incident and vows retaliation against the perpetrators. (BBC News) (The Telegraph) (The Guardian) (Sky News) A Russian strike kills five civilians and injures seven others at a bus stop in Mykolaiv, according to regional governor Vitaliy Kim. (AFP News via Barron's)"); 
                     break;
case 30:
                     System.out.println("Russia's Gazprom suspends gas supplies to Latvia after accusing it of violating conditions of purchase. The Latvian government says the suspension of gas from Russia is not expected to have a major impact on the economy. (BBC News)");
                     break;
case 31:
System.out.println("Southern Ukraine offensive A Russian missile strike on Mykolaiv in Kherson Oblast, kills Nibulon owner Oleksiy Vadaturskyi and his wife. (BBC News) A drone strikes Russia's Black Sea Fleet headquarters, injuring five people, according to the mayor of Sevastopol. (The Guardian)"); 
                     break;
                     default:
                      System.out.println("Select a day from 1 to 31:");
                     

                    //System.out.println("");
                    }
                    break;
case 8:
                    System.out.println("1. Enter a day in August:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("The first ship with Ukrainian grain leaves the port of Odesa for Lebanon after an agreement was signed with Russia. (DW)");
                     break;
case 2:
                     System.out.println("Three people evacuating in a minibus are killed by Russian shelling near Kherson Oblast, according to Ukraine's Operational Command South. (The Guardian)");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
System.out.println("Battle of Donbas A Russian strike kills eight civilians and injures four others, at a bus stop in Toretsk, according to regional governor Pavlo Kyrylenko. (Ukrinform)"); 
                     break;
case 5:
System.out.println("Southern Ukraine campaign Ukraine's nuclear agency Energoatom says that Russian rockets have caused damage to the Zaporizhzhia Nuclear Power Plant, including a nitrogen-oxygen unit and a high-voltage power line. (BBC News) Russian occupation of Kherson Oblast Volodymyr Saldo, the head of the Russian");
System.out.println(" occupational administration in Kherson Oblast, is hospitalized, with former FSB officer Sergei Eliseev taking over his post temporarily. (Newsweek)"); 
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that it will send Ukraine an additional $1 billion in military assistance, including tens of thousands more munitions and explosives, the largest such aid package to the country since the start of the invasion. (The Washing");
System.out.println("ton Post)"); 
                     break;
case 8:
System.out.println("2022 Ukrainian summer counteroffensive Multiple explosions are reported at a Russian military air base near Novofedorivka in western Crimea. At least one person is killed and six others are injured, according to Crimean authorities. (Reuters) (Sky News)"); 
                     break;
case 9:
System.out.println("Russian occupation of Zaporizhzhia Oblast Russian forces install air defence systems at the Zaporizhzhia Nuclear Power Plant in Zaporizhzhia Oblast, Ukraine, according to the head of Moscow-appointed administration of Zaporizhzhia Oblast Yevhen Balytskyi. (MSN) A Russian missile strike in Nikopol Ra");
System.out.println("ion, Dnipropetrovsk Oblast, kills at least 13 civilians and injures 11 others. (The New York Times)"); 
                     break;
case 10:
System.out.println("Russian occupation of Zaporizhzhia Oblast At least ten shells hit the Zaporizhzhia Nuclear Power Plant with both Russia and Ukraine blaming each other for the attack, which damaged an office building and the plant's fire station. (BBC News)\n2022 Russian-occupied Ukraine annexation referendums The R");
System.out.println("ussian occupation of Zaporizhzhia Oblast begins preparations for a referendum on the region's accession to Russia, which will be held on September 11. (RBK) (TV Center)"); 
                     break;
case 11:
                     System.out.println("A Belize-flagged ship departs Chornomorsk for Turkey, becoming the first wheat export from Ukraine under a United Nations-brokered deal. (Swissinfo)");
                     break;
case 12:
System.out.println("Russia says that it has captured the village of Pisky, in Donetsk Oblast, while Ukrainian forces say that they have destroyed a bridge in Russian-occupied Kherson Oblast. (AP) Russian occupation of Mykolaiv Oblast Establishment of pro-Russian Mykolaiv military–civilian administration with seat in Sn");
System.out.println("ihurivka is announced, Yuri Barbashov [pl] becomes its head. It probably began functioning some days earlier. (360tv.ru)"); 
                     break;
case 13:
                     System.out.println("Nothing significant to report");
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
                     System.out.println("An explosion occurs at an ammunition depot in northern Crimea, forcing the evacuation of civilians. Observers suggest that the depot may have been hit by Ukrainian forces. (Radio Free Europe/Radio Liberty)");
                     break;
case 17:
System.out.println("Northeastern Ukraine campaign Battle of Kharkiv A Russian missile hits a dormitory in Kharkiv, killing seven civilians and injuring 16 others, according to the city's mayor and top military administrator. (Ukrainska Pravda) (The Guardian) Southern Ukraine campaign Russia launches missile strikes on ");
System.out.println("Odesa and Mykolaiv in Southern Ukraine in response to sabotage bombings of military facilities in Crimea. (MSN)"); 
                     break;
case 18:
System.out.println("Southern Ukraine campaign, 2022 Western Russia attacks Explosions are reported at military facilities in Crimea and Belgorod Oblast, Russia, and are believed to have been launched by Ukraine. An explosion and large fire occur at an arms depot near Timonovo. Explosions are also reported at Stary Osko");
System.out.println("l Airport and in Russian-occupied Nova Kakhovka, Kherson Oblast. (Forbes) Explosions are reported at Sevastopol International Airport. The Governor of Sevastopol Mikhail Razvozhayev says that Russian air defences have shot down a Ukrainian Air Force drone near the airport. (Reuters) Residents of Ker");
System.out.println("ch and nearby villages in eastern Crimea report multiple explosions. Crimean officials say that air defences were activated near the city but that there is no danger to the town or the Crimean Bridge. (Yahoo! News)"); 
                     break;
case 19:
System.out.println("2022 Western Russia attacks Explosions are reported overnight at Russian military bases in Crimea and Belgorod Oblast, Russia. Two villages have been evacuated. (Reuters)"); 
                     break;
case 20:
System.out.println("Southern Ukraine campaign, War crimes in the 2022 Russian invasion of Ukraine Nine civilians, including four children, are injured by Russian shelling on a residential building in Voznesensk, Mykolaiv Oblast, according to regional governor Vitaliy Kim. (The Washington Post) Russia says that a number");
System.out.println(" of its soldiers in Zaporizhzhia have been poisoned by Ukraine, with tests showing Botulinum toxin type B present in their bodies. (Reuters)"); 
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
                     System.out.println("Nothing significant to report");
                     break;
case 23:
System.out.println("Battle of Donbas Ukrainian forces reportedly shell the administration headquarters of the Donetsk People's Republic in separatist-held Donetsk, killing three people, according to pro-Russian officials. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War Slovakia announces that it will se");
System.out.println("nd an additional 30 BMP-1 infantry fighting vehicles and ammunition to Ukraine. (Reuters)"); 
                     break;
case 24:
System.out.println("Russian occupation of Zaporizhzhia Oblast The Russian-appointed head of Mykhailivka in Zaporizhzhia Oblast, Ivan Sushko, is assassinated in a car bombing. (Euro Weekly News) Chaplyne railway station attack At least 25 people are killed and more than 50 others are injured in a Russian rocket attack o");
System.out.println("n a passenger train in Chaplyne, Dnipropetrovsk Oblast. (The Guardian) (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War The United States announces a security package of nearly $3 billion from the Ukraine Security Assistance Initiative. (CBS News)"); 
                     break;
case 25:
System.out.println("Southern Ukraine campaign Ukraine says that the Zaporizhzhia Nuclear Power Plant has been completely disconnected from its power grid after shelling near the Russian-occupied plant caused several fires. Security systems at the plant were activated shortly after the power failure, according to a loca");
System.out.println("l official. (NBC News)"); 
                     break;
case 26:
System.out.println("Southern Ukraine campaign Ukraine's state nuclear company, Energoatom, says that the Russian-occupied Zaporizhzhia Nuclear Power Plant has resumed supplying electricity to Ukraine's power grid after being disconnected yesterday from it for the first time in history. (Al Jazeera) (Reuters) A traffic ");
System.out.println("police deputy chief is killed by a bombing in the Russian-occupied city of Berdiansk, Zaporizhzhia Oblast. Russian authorities accuse the Ukrainian forces of the attack. (Reuters)"); 
                     break;
case 27:
                     System.out.println("Nothing significant to report");
                     break;
case 28:
                     System.out.println("Nothing significant to report");
                     break;
case 29:
System.out.println("2022 Ukrainian southern counteroffensive Ukraine says it has begun a ground offensive in the Kherson Oblast. (Reuters) Russian-occupation officials say that the Ukrainian military launched a barrage of missiles at the town of Nova Kakhovka, leaving the town without water or power. (Reuters) Two peop");
System.out.println("le are killed and five others are injured after Russian forces shelled the city of Mykolaiv, according to regional governor Vitaliy Kim. (Reuters)"); 
                     break;
case 30:
                     System.out.println("Nothing significant to report");
                     break;
case 31:
                     System.out.println("European Union foreign ministers agree to suspend a visa facilitation agreement with Russia, making it more difficult and more expensive for Russian tourists to enter the EU. (Al Arabiya)");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
                    
case 9:
                    System.out.println("1. Enter a day in September:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian forces recapture the town of Vysokopillia in Kherson Oblast, which has been under Russian occupation since March, and raise the Ukrainian flag over the town's hospital. (Newsweek)"); 
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Amid a renewed counter-offensive in the region, Ukrainian forces reportedly break through Russian defenses and advance more than 30 kilometers into Russian held territory in the Kharkiv Oblast, capturing many towns and cities including Balakliia. (The Guardian");
System.out.println(")"); 
                     break;
case 8:
                     System.out.println("Poland and the Baltic states announce a ban on Russian tourists entering their countries beginning on September 19. (EER)");
                     break;
case 9:
System.out.println("Northeastern Ukraine campaign Governor of Sumy Oblast Dmytro Zhyvytskyi says that Russian forces have shelled a hospital in Velyka Pysarivka, causing an unspecified number of casualties. (Radio Free Europe/Radio Liberty) 2022 Ukrainian Kharkiv counteroffensive Ukraine claims to have retaken more tha");
System.out.println("n 1,000 square kilometers of territory previously occupied by Russia, within the last week. (BBC News)"); 
                     break;
case 10:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Ukrainian troops retake the cities of Balakliia, Kupiansk, and Izium from Russian occupation. The Russian Defence Ministry confirms the withdrawal of troops from several towns in Kharkiv Oblast in order to allow its forces to regroup and reinforce the Donbas. ");
System.out.println("(BBC News) (Mirror)"); 
                     break;
case 11:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Russian forces withdraw from most of the Kharkiv Oblast as the Russian occupation of Kharkiv Oblast collapses. Ukrainian soldiers retake Chkalovske and Velykyi Burluk. Governor of Belgorod Oblast Vyacheslav Gladkov says that thousands of civilians are fleeing ");
System.out.println("across the border into the region. (Financial Post) (BBC News) Russia launches missile strikes with Kalibr cruise missiles on critical infrastructure objects, including Kharkiv TEC-5, causing a total blackout and water shutdown in Northeastern Ukraine and the Kharkiv and Donetsk Oblasts. Ukrainian o");
System.out.println("fficials confirm at least 40 electrical substations have been destroyed in the wave of missile strikes. (The New York Times) (Reuters) (Ukrinform)"); 
                     break;
case 12:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Ukrainian forces continue to recapture Russian-occupied territory in Kharkiv Oblast, saying that they have seized 20 more settlements in the last 24 hours, including Dvorichna, and also claim to have captured many Russian prisoners of war. (AP) Battle of Donba");
System.out.println("s The Ukrainian general staff reports that Russian troops abandoned the city of Svatove in Luhansk Oblast as Ukrainian forces advanced. (Reuters) 2022 Western Russia attacks Multiple explosions are reported near the city of Taganrog in Rostov Oblast, Russia. (Meduza) (HalkTV) More than 30 municipal ");
System.out.println("deputies of Russian cities sign a petition calling for Russian President Vladimir Putin's resignation amid substantial Ukrainian advances in the war. (The Hill)"); 
                     break;
case 13:
System.out.println("2022 Ukrainian Kharkiv counteroffensive The Ukrainian military says that it has shot down an Iranian HESA Shahed 136 combat drone operated by Russia near Kupiansk, Kharkiv Oblast. An inscription on the drone identified it as an M214 Geran-2, which did not immediately correspond to known Russian weap");
System.out.println("onry. (ABC News)"); 
                     break;
case 14:
System.out.println("Russian forces launch eight cruise missiles at the dam of the Karachunivske reservoir causing extensive flooding in Kryvyi Rih and a 2.5 metres (8 ft 2 in) increase of water level in the Inhulets River. (The Guardian) "); 
                     break;
case 15:
System.out.println("2022 Ukrainian Kharkiv counteroffensive War crimes in the 2022 Russian invasion of Ukraine Izium mass graves Ukrainian police say that a mass grave containing more than 440 bodies has been discovered in the recently recaptured city of Izium. (Reuters)"); 
                     break;
case 16:
                     System.out.println("A civilian is killed and two others are injured by Ukrainian shelling on Valuyki, Belgorod Oblast, according to Governor Vyacheslav Gladkov. (UrduPoint) (MSN)");
                     break;
case 17:
                     System.out.println("Nothing significant to report");
                     break;
case 18:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell a psychiatric hospital in Strelechya, Kharkiv Oblast, killing four medics and injuring two patients. (The Guardian)"); 
                     break;
case 19:
System.out.println("Battle of Donbas Thirteen people are killed and many others are injured in explosions in the Donetsk People's Republic-held city of Donetsk. DPR leader Denis Pushilin accuses Ukraine of being behind the attacks. (BBC News) The Ukrainian Ground Forces recapture the village of Bilohorivka in Luhansk O");
System.out.println("blast as it advances on Lysychansk. (The Telegraph) Luhansk People's Republic authorities say that a Ukrainian shelling attack has killed seven civilians including three children in the town of Krasnorichenske. (Reuters)\nThe State Duma of Russia reports that a referendum on the accession of the Luh");
System.out.println("ansk People's Republic to Russia will be held in the near future. (TASS)"); 
                     break;
case 20:
System.out.println("2022 Russian mobilization Russian State Duma deputies approve the introduction of the concepts of mobilization, martial law, wartime and armed conflict, as well as punishment for desertion, into the Criminal Code. (Forbes)\nIt is announced that the referendums on the entry of the Luhansk People's Re");
System.out.println("public, the Donetsk People's Republic, and the occupied parts of Kherson and Zaporizhzhia Oblasts into Russia as federal subjects will be held from September 23 to 27. (RIA Novosti)"); 
                     break;
case 21:
System.out.println("2022 Russian mobilization: In a major address to the nation, Russian president Vladimir Putin announces a partial mobilization, with the exceptions of students and conscripts. (AP)\n Lithuania places its rapid reaction force on high alert in response to Russia's mobilization, according to Defence Mi");
System.out.println("nister Arvydas Anušauskas. (LRT)\n NATO Secretary General Jens Stoltenberg says that Russia's military mobilization is 'dangerous and reckless', and condemns Putin's use of 'nuclear rhetoric'. (NTV) (Reuters)\nAnti-mobilization and anti-war protests occur across Russia, with many arrests also occurr");
System.out.println("ing. (Reuters)"); 
                     break;
case 22:
System.out.println("Large numbers of fighting-age men leave Russia after the announcement of the mobilization. Long traffic jams occur at international border crossings and the price of tickets for international flights sharply increases. (BBC News) At least 1,300 protesters rallying against the mobilization are arrest");
System.out.println("ed throughout Russia. (BBC News) Donetsk People's Republic authorities accuse Ukraine of shelling a market in Donetsk, killing six civilians. (Times of Israel) Ukraine and Russia release 55 Russian prisoners of war and 215 fighters from the Siege of Mariupol as part of a prisoner exchange mediated b");
System.out.println("y Turkey and Saudi Arabia. Among those released are pro-Russian Ukrainian politician Viktor Medvedchuk, Azov Regiment commander Denys Prokopenko, British volunteers Aiden Aslin and Shaun Pinner, and Moroccan volunteer Saadun Brahim. (Times of Israel), (BBC News)"); 
                     break;
case 23:
                     System.out.println("Referendums begin in the Russian-occupied Ukrainian oblasts of Kherson and Zaporizhzhia and the separatist republics of Donetsk and Luhansk on whether to join Russia, in what Ukraine and other countries consider to be sham referendums. (AFP via Barron's)");
                     break;
case 24:
System.out.println("2022 Russian mobilization Thousands of fighting-age men continue to leave Russia due to the mobilization. Massive lines are reported at the country's borders with Georgia and Finland. (iNews) 2022 anti-war protests in Russia At least 700 people are detained during anti-war protests across Russia. (I");
System.out.println("TV News)"); 
                     break;
case 25:
System.out.println("2022 anti-war protests in Russia, 2022 North Caucasian protests Mass protests against mobilization take place in Dagestan with protesters clashing with police. (Reuters), (Radio Liberty) The number of people detained in anti-war protests across Russia increases to more than 2,000. (BBC News) Ukraini");
System.out.println("an president Volodymyr Zelenskyy confirms that Ukraine has received NASAMS air defence systems from the United States. (Reuters)"); 
                     break;
case 26:
System.out.println("2022 Russian mobilization 2022 anti-war protests in Russia, 2022 North Caucasian protests Spontaneous protests against the mobilization continue in Dagestan and Kabardino-Balkaria. (Radio Liberty) "); 
                     break;
case 27:
System.out.println("Kazakhstan says that around 98,000 Russian civilians have entered the country by land and air since Russian president Vladimir Putin ordered a military mobilization. (HuffPost) Latvia announces a state of emergency over the influx of Russian citizens fleeing mobilization. Special measures are taken ");
System.out.println("in the border regions of the country and at all ports of entry. (ERR)"); 
                     break;
case 28:
System.out.println("North Ossetia–Alania which contains the only border crossing between Russia and Georgia-controlled territory, bans all Russian cars that do not have the licence plate of the republic, with the exception of tourists travelling to the region. This comes as those fleeing the draft overwhelm the border.");
System.out.println(" (Reuters) A mobile draft centre is built at the Torfyanovka checkpoint, the busiest checkpoint on the Finland–Russia border, in order to prevent people who are fit to serve from fleeing the country. However, as of midday, the centre is not yet open. (The Insider) "); 
                     break;
case 29:
System.out.println("War crimes in the 2022 Russian invasion of Ukraine Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces strike a residential neighborhood in Dnipro with a cruise missile, killing a family of four, including two children, and injuring 18 other civilians, according to local auth");
System.out.println("orities. (Ukrinform) (Ukrainska Pravda) Three people are killed and 12 others are injured by a Russian cluster munition attack on a bus stop in Mykolaiv, according to mayor Oleksandr Sienkievych. (Ukrainska Pravda) Russian emigration following the 2022 invasion of Ukraine Finland announces that it w");
System.out.println("ill deny entry to Russian tourists beginning on Thursday night, thereby cutting off the last direct link between Russia and the European Union. (Reuters)\nPress Secretary of the President of Russia Dmitry Peskov says that the Kremlin is scheduled to sign agreements on the annexation of the occupied ");
System.out.println("territories of Ukraine by Russia on September 30. (Forbes) President of Ukraine Volodymyr Zelenskyy announces that he will convene an urgent meeting of the National Security and Defense Council of Ukraine on September 30. (Ukrainska Pravda) Russian President Vladimir Putin signs a decree recognizing");
System.out.println(" the independence of Kherson and Zaporizhzhia Oblasts, which were proclaimed yesterday. (The Guardian) (RIA Novosti)"); 
                     break;
case 30:
System.out.println("Russian attack on civilian convoy in Zaporizhzhia Russian forces launch 16 missiles at areas near the city of Zaporizhzhia, including a gathering point for civilians preparing to cross into Russian-occupied territory, where at least 25 people are killed and 50 others are injured. (NBC News) Ukraine–");
System.out.println("NATO relations Ukrainian President Volodymyr Zelenskyy requests fast-track NATO membership following the Russian annexation of Southern and Eastern Ukraine. (BBC News) 2022 Russian mobilization Uzbekistan says that it will not deport Russians fleeing conscription. (Reuters)\nRussian president Vladim");
System.out.println("ir Putin signs accession treaties to annex the occupied Ukrainian territories to Russia. However, the accession treaties must be ratified by both houses of the Russian parliament before becoming effective under Russian law. (Reuters) (Reuters 2)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                     }
                     break;
case 10:
                    System.out.println("1. Enter a day in October:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Battle of Donbas Second Battle of Lyman Ukrainian troops recapture Lyman after weeks of fighting for the city and one day after the annexation of the Donetsk People's Republic to Russia. (The Guardian) The Ministry of Defence of Russia says that it has withdrawn troops from the town of Lyman due to ");
System.out.println("a threat of encirclement. (BBC News) After the defeat in Lyman, the head of Chechnya, Ramzan Kadyrov, calls on the Russian government to introduce martial law and use low-yield nuclear weapons in Ukraine. (Moskovskij Komsomolets) (CNN) (Reuters) (Al Jazeera) War crimes in the 2022 Russian invasion o");
System.out.println("f Ukraine Attacks on civilians in the 2022 Russian invasion of Ukraine A civilian convoy of seven cars attacked by Russian forces is discovered in Kupiansk Raion in Kharkiv Oblast with 24 people being killed, including a pregnant woman and 13 children, according to local governor Oleh Synyehubov. (U");
System.out.println("krainska Pravda)"); 
                     break;
case 2:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian troops recapture Khreshchenivka as they continue to advance southwards in the Russian-occupied Kherson Oblast, with Russia's 49th Combined Arms Army reportedly withdrawing some troops from the frontline to Beryslav. (Forbes)"); 
                     break;
case 3:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian forces advance more than 20 kilometres (12 mi) along the Dnieper towards Dudchany, Kherson Oblast, in what is being called a major breakthrough. (Reuters) The Russian Defence Ministry dismisses Colonel General Alexander Zhuravlyov in response to a s");
System.out.println("eries of military defeats in Ukraine. He is replaced as commander of the Western Military District by Major General Roman Berdnikov. (Reuters) "); 
                     break;
case 4:
System.out.println("Annexation of Southern and Eastern Ukraine The Federation Council of Russia unanimously approves the annexation of Ukraine's Donetsk, Luhansk, Kherson, and Zaporizhzhia regions. The annexation documents will now receive final signing by President Vladimir Putin. (Reuters) 2022 Ukrainian southern cou");
System.out.println("nteroffensive Ukraine's 35th Marine Brigade recaptures the village of Davydiv Brid in Beryslav Raion, Kherson Oblast, as it continues its ground offensive. The Ukrainian Interior Ministry says that around 3,500 citizens have been freed from Russian occupation in recent days. (BBC News)"); 
                     break;
case 5:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian troops recapture the strategic village of Dudchany on the west bank of the Dnieper following the withdrawal of Russian forces. (Al Jazeera) Annexation of Southern and Eastern Ukraine Russian President Vladimir Putin signs a law formally annexing the");
System.out.println(" Donetsk People's Republic, Luhansk People's Republic, Kherson, and Zaporizhzhia into Russia. (Reuters)"); 
                     break;
case 6:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell residential buildings in Zaporizhzhia, killing at least three people, injuring twelve others, and causing widespread fires. (Reuters)"); 
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
System.out.println("Crimean Bridge explosion The Kerch Strait Bridge is hit by an explosion, resulting in a fire and the partial collapse of a road section. Three people are killed. The cause is currently unknown, with a Russian investigative committee saying it was a Ukrainian truck bomb. (The Guardian) The death toll");
System.out.println(" from last Thursday's shelling by Russian forces of a residential area in Zaporizhzhia rises to 17 civilians, including a child. (The Times of Israel)"); 
                     break;
case 9:
System.out.println("Zaporizhzhia residential building airstrike A Russian missile attack kills at least 13 people and injures 89 others in Zaporizhzhia, Ukraine. (Reuters) Crimean Bridge explosion Russian president Vladimir Putin formally accuses Ukraine, and specifically the Security Service of Ukraine, of being behin");
System.out.println("d the explosion on the Crimean Bridge that killed three people and partially destroyed part of the bridge, saying that the explosion was an act of terrorism. (BBC News)"); 
                     break;
case 10:
System.out.println("10 October 2022 missile strikes on Ukraine The Russian Armed Forces launch missile strikes on the Ukrainian cities and towns of Kyiv, Kharkiv, Khmelnytskyi, Zhytomyr, Zaporizhzhia, Ivano-Frankivsk, Sumy, Dnipro, Lviv, Ternopil and Poltava, killing at least nineteen people and injuring hundreds more.");
System.out.println(" (Unian) (UkrInform) (Interfax) (The Guardian) (Financial Times) (Kyiv Post) Moldova–Russia relations Moldova confirms that Russian Navy warships in the Black Sea fired cruise missiles through its airspace to strike targets inside Ukraine. The Russian ambassador is subsequently summoned by Moldovan ");
System.out.println("authorities to explain the violation. (Reuters)"); 
                     break;
case 11:
System.out.println("Thousands of Russian troops enter Belarus by the trainload as Ukrainian President Volodymyr Zelenskyy warns G7 nations that Russia is planning on launching another offensive against Kyiv with direct Belarusian involvement. The troop movements come a day after Belarusian President Alexander Lukashenk");
System.out.println("o accused Ukraine of planning to launch an attack on the country. (The Independent) Lviv experiences a major power outage after a Russian missile strike damages critical infrastructure. (Reuters) Russia adds Meta Platforms, the parent company of Instagram and Facebook, to its list of terrorists and ");
System.out.println("extremists for tolerating Russophobia and allowing calls to violence against Russians. (Al Jazeera)"); 
                     break;
case 12:
System.out.println("Crimean Bridge explosion Russia says that it has arrested eight people, five Russians and three people from Ukraine and Armenia, over the Crimea Bridge explosion. (Reuters via Al Arabiya) Battle of Donbas Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces strike a marketplac");
System.out.println("e in Avdiivka, Donetsk Oblast, killing at least seven civilians and injuring eight others. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War French President Emmanuel Macron announces that France will send radar and air defense systems to Ukraine in the coming weeks. (Reuters) The Unit");
System.out.println("ed Kingdom's Ministry of Defence announces that it will donate AMRAAM air-to-air missiles to Ukraine in the coming weeks. The missiles are capable of intercepting cruise missiles. A further 18 howitzers will also be donated to the Ukrainian military. (Reuters) Canada says that it will provide C$47 m");
System.out.println("illion in new military aid to Ukraine including artillery rounds, winter clothing, drone cameras, and satellite communications. (Reuters) Annexation of southeastern Ukraine by the Russian Federation United Nations General Assembly Resolution ES-11/4 The United Nations General Assembly passes a resol");
System.out.println("ution condemning Russia's attempted illegal annexation of Ukrainian territory. Only Belarus, Nicaragua, North Korea, Russia and Syria voted against the resolution. (Al Jazeera) Moldova urges its citizens to reduce their use of electricity after Ukraine suspended exports of electricity due to Russian");
System.out.println(" missile attacks damaging critical infrastructure. (Reuters)"); 
                     break;
case 13:
System.out.println("2022 Ukrainian southern counteroffensive Russia announces that it will evacuate civilians from Kherson to other regions of the country following an appeal from Kherson Military-Civilian Administration leader Volodymyr Saldo. (The Guardian) Attacks on civilians in the 2022 Russian invasion of Ukraine");
System.out.println(" Russian forces launch eight missiles at Mykolaiv, hitting a five-story residential building. One of the victims was an 11-year-old boy, who was rescued with broken legs after spending hours under the rubble, but later died in a hospital due to heart failure. (The New York Times) (NBC News)"); 
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
System.out.println("Soloti military training ground shooting At least 11 people are killed and 15 others injured after two shooters open fire on a group of volunteers at a Russian military training ground in Belgorod Oblast, near the border with Ukraine. (Reuters)"); 
                     break;
case 16:
System.out.println("Battle of Donbas Donetsk People's Republic authorities say that a Ukrainian rocket attack hit the office of the pro-Russian mayor of Donetsk. No casualties have been reported. (AP)"); 
                     break;
case 17:
System.out.println("Russian forces attack the Shevchenkivskyi District, Kyiv, and an energy facility in the city of Sumy with HESA Shahed 136 suicide drones, killing eight people. (BBC News) (CNBC) The European Union establishes EUMAM Ukraine, a special military mission that will provide training for the Ukrainian Arme");
System.out.println("d Forces in EU member states. (Council of the EU/the European Council)"); 
                     break;
case 18:
System.out.println("Crisis at the Zaporizhzhia Nuclear Power Plant Ukraine accuses Russia of kidnapping two senior employees of the Zaporizhzhia Nuclear Power Plant. (Agence France Presse via Barron's) Three people are killed and critical infrastructure is destroyed by Russian missiles in Kyiv, causing fires, explosion");
System.out.println("s, and power outages. Several other cities across Ukraine are also hit in targeted attacks against water supplies and energy facilities, with power outages being reported in 1,162 towns and villages. (Reuters) (BBC News) Iran agrees to provide Russia with medium-range missiles, surface-to-surface mi");
System.out.println("ssiles and combat drones for the war in Ukraine. (The Guardian)"); 
                     break;
case 19:
System.out.println("2022 Ukrainian southern counteroffensive Russian forces begin evacuating thousands of civilians from occupied areas of Kherson Oblast, according to Russian-installed governor Volodymyr Saldo. Ukraine calls on residents to ignore the Russian orders to leave their towns and villages. (BBC News) 2022 R");
System.out.println("ussian martial law Russian President Vladimir Putin introduces martial law, beginning Thursday at midnight, in the recently annexed territories of Ukraine. Additionally, an intermediate level of preparednessis introduced in Crimea and the federal subjects bordering Ukraine. (AP) (The Insider)"); 
                     break;
case 20:
System.out.println("A Russian missile strikes a major thermal power station in Burshtyn, Ivano-Frankivsk Oblast, Ukraine, causing quite serious damage, according to governor Svitlana Onyshchuk. (Reuters) The United States reports that Iranian troops are in Crimea, assisting the Russian military in using Iranian drones.");
System.out.println(" (The Hill)"); 
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
                     System.out.println("Power outages are reported across Ukraine and citizens are advised to store water as Russian airstrikes across the country continue to damage critical infrastructure and energy facilities. (Reuters)");
                     break;
case 23:
                     System.out.println("A Sukhoi Su-30 crashes into a residential building in Irkutsk, Irkutsk Oblast, Russia. Both pilots are killed. No casualties on the ground are reported, but the crash causes a power outage that affects more than 150 houses. (Reuters) (Meduza)");
                     break;
case 24:
                     System.out.println("Nothing significant to report");
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine A Russian missile strike on Dnipro kills two people, including a pregnant woman. (The Guardian)\n2022 boycott of Russia and Belarus Mercedes-Benz withdraws from Russia due to the 2022 Russian invasion of Ukraine and plans to sell shares in");
System.out.println(" its subsidiaries to a local investor. (BBC News) International relations  Poland–Russia relations The Polish Senate approves a resolution formally recognizing the Russian government under Vladimir Putin as a terrorist regime. (Ukrinform)"); 
                     break;
case 27:
                     System.out.println("Russian forces strike Kyiv's energy system facilities and launch BM-30 Smerch missiles on Zaporizhzhia as Ukraine repels attacks in the Donbas. (RFE/RL)");
                     break;
case 28:
System.out.println("US Secretary of State Antony Blinken announces that the United States will provide another $275 million in additional military aid to Ukraine. (Reuters) 2022 Russian mobilization Russian Defence Minister Sergei Shoigu announces the end of the mobilization campaign as 300,000 reservists are reached. ");
System.out.println("(ABC News Australia)"); 
                     break;
case 29:
                     System.out.println("Russia accuses Ukraine of a drone attack on its Black Sea Fleet headquarters in Sevastopol, Crimea. The Russian-installed Governor of Sevastopol Mikhail Razvozhayev says the Russian Navy repelled the attack, which he calls the most massive since the invasion began. Russia consequently suspends its p");
System.out.println("articipation in the Black Sea Grain Initiative. (NPR) (BBC News)");
                     break;
case 30:
                     System.out.println("Nothing significant to report");
                     break;
case 31:
System.out.println("Russian forces damage critical infrastructure in Kyiv again, leaving parts of the capital without energy and water. Other energy facilities are damaged in Zaporizhzhia, Kherson, and Cherkasy. (The Guardian) A Russian cruise missile reportedly shot down by a Ukrainian anti-aircraft system crashes in ");
System.out.println("the outskirts of Naslavcea, Moldova. No casualties are reported, though some houses were damaged by the blast, according to the Moldovan government. (Romania Journal) Norwegian Prime Minister Jonas Gahr Støre announces that the country's military alert level will be increased tomorrow, in response t");
System.out.println("o military drone sightings near offshore oil rigs in the past few weeks. (Euronews)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 11:
                    System.out.println("1. Enter a day in November:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
                     System.out.println("The United States says that North Korea is secretly supplying artillery shells to Russia for use in Russia's war in Ukraine. (Axios)");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
                     System.out.println("The Voice of America reports that the Republic of Georgia is receiving an economic boost from the war in Ukraine. It is 'expected to record a vigorous 10% growth in economic output for 2022 amid a consumption-led boom,' due largely to the arrival of refugees from Russia, seeking to avoid conscriptio");
System.out.println("n or Putin's crackdown on dissent. (VOA News)");
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War Ukraine confirms that it has received the first delivery of the NASAMS surface-to-air missile system, which will significantly strengthen its armed forces, according to Defence Minister Oleksii Reznikov. (Reuters)"); 
                     break;
case 8:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War Ukraine confirms that it has received the first delivery of the NASAMS surface-to-air missile system, which will significantly strengthen its armed forces, according to Defence Minister Oleksii Reznikov. (Reuters)"); 
                     break;
case 9:
System.out.println("2022 Ukrainian southern counteroffensive Russian forces announce a retreat from the city of Kherson, the western bank of the Dnieper River in Mykolaiv Oblast, and the western part of Kherson Oblast. (BBC News) Russian officials say that deputy head of the Kherson military–civilian administration Kir");
System.out.println("ill Stremousov has been killed in a car crash while travelling to Crimea. Russian President Vladimir Putin issues a decree posthumously awarding Stremousov the Order of Courage. (BBC News)   "); 
                     break;
case 10:
System.out.println("2022 Ukrainian southern counteroffensive The Ukrainian military says that it recaptured the city of Snihurivka in Mykolaiv Oblast, the last remaining city controlled by Russia in the oblast. (Voice of America) Ukrainian troops recapture the village of Kyselivka, advancing within nine miles of the ci");
System.out.println("ty centre of Kherson. Explosions are reported near the Kakhovka Hydroelectric Power Plant. (The Guardian) Foreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that it will send four AN/TWQ-1 Avenger surface-to-air missile systems, Stinger missiles, 400 grenade launchers, 100 ");
System.out.println("humvees, and other artillery rounds and small arms ammunition to Ukraine as part of its latest $400 million weapons package to support the Ukrainian military. (The Hill)"); 
                     break;
case 11:
System.out.println("Ukrainian troops enter the city of Kherson, the only Ukrainian regional capital captured by Russia during the invasion, ending the city's eight-month occupation by Russian forces. (CNN) Russian forces destroy the Antonivka Road Bridge as they retreat from the west of the Dnieper. (The New York Times");
System.out.println(") United States and the 2022 Russian invasion of Ukraine The Russian Foreign Ministry bans 200 U.S. citizens from entering Russia, including White House Press Secretary Karine Jean-Pierre and three siblings of President Joe Biden. (Reuters) Business and economy  2022 food crises, Economic impact of ");
System.out.println("the 2022 Russian invasion of Ukraine The Food and Agriculture Organization forecasts that by the year's end, global spending on food imports will have increased by 10 percent from the previous year to reach an all-time high of US$1.94 trillion, due to currency depreciations and the war in Ukraine. T");
System.out.println("he bulk of this increase in spending will be by high-income countries while food import volumes are also expected to rise. (AFP via The Economic Times)"); 
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
                     System.out.println("Nothing significant to report");
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
System.out.println("2022 missile explosion in Poland A missile strike kills two people in the village of Przewodów in eastern Poland. President of the United States Joe Biden says that the missile blast in Poland was caused by a Ukrainian air defense missile. U.S. officials had earlier told the Associated Press that pr");
System.out.println("eliminary findings suggested that the missile that hit Poland was fired by Ukrainian forces at an incoming Russian missile. (Reuters) (Reuters 2) The Polish Ministry of Foreign Affairs says that it was a Russian-made missile and summons the Russian ambassador to provide an explanation. (Reuters) (AP");
System.out.println(") November 2022 nationwide missile strikes on Ukraine Russian missiles strike several cities across Ukraine, including Kyiv, causing critical damage to energy facilities. (The Guardian)"); 
                     break;
case 16:
System.out.println("Economic impact of the 2022 Russian invasion of Ukraine The economy of Russia enters a recession, after gross domestic product decreased by four percent in the third quarter. (AFP via Al Arabiya)"); 
                     break;
case 17:
System.out.println("2022 missile explosion in Poland Germany offers to deploy its Air Force jets to protect Polish airspace in response to Tuesday's missile explosion in Przewodów, Lublin Voivodeship, that killed two people. (A News) October–November 2022 nationwide missile strikes on Ukraine Russia carries out another");
System.out.println(" wave of cruise missile strikes on Ukraine, with strikes reported in Dnipro, Odesa, Kharkiv, and Zaporizhzhia, where two people were confirmed to have been killed overnight by a missile. In Dnipro and Odesa, critical infrastructure is also targeted. (The Guardian)"); 
                     break;
case 18:
System.out.println("October–November 2022 nationwide missile strikes on Ukraine Ukrainian President Volodymyr Zelenskyy says that Russian missile strikes have left at least 10 million Ukrainians without electricity as the death toll from yesterday's missile strikes increases to seven with many more people injured. (BBC");
System.out.println(" News)"); 
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The Russian-controlled Zaporizhzhia Nuclear Power Plant in Enerhodar is shelled, with damage occurring to some buildings, systems, and equipment, according to the International Atomic Energy Agency. (Reuters)"); 
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
System.out.println("2022 missile explosion in Poland Germany says that it will deploy Patriot surface-to-air missile systems on the Poland–Ukraine border in order to protect Polish airspace. Polish Defense Minister Mariusz Błaszczak says that he has accepted the German proposal. (International Business Times) "); 
                     break;
case 23:
System.out.println("October–November 2022 nationwide missile strikes on Ukraine Widespread blackouts are reported in Western Ukraine as Russian forces launch another wave of cruise missile strikes, including in the city of Lviv, which is currently experiencing a power outage. Moldova also reports massive power outages,");
System.out.println(" although the country has not been directly hit by missiles. (BBC News) At least six people, all civilians, are killed in the latest missile strikes, including three in an apartment block in Vyshhorod, Kyiv Oblast, where 15 other people were injured. Kyiv Mayor Vitali Klitschko says that 21 of the 3");
System.out.println("1 missiles targeting Kyiv were intercepted before they reached their targets. (The Guardian) Foreign aid to Ukraine during the Russo-Ukrainian War British Defence Secretary Ben Wallace announces that the United Kingdom will send three Sea King helicopters to the Ukrainian Air Force as part of a new ");
System.out.println("£50 million support package to Ukraine. (The Telegraph)"); 
                     break;
case 24:
System.out.println("Southern Ukraine campaign At least 15 people are killed and 35 others are injured when Russian Armed Forces bombard Kherson. (AFP via NDTV)"); 
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
                     System.out.println("Nothing significant to report");
                     break;
case 28:
                     System.out.println("Nothing significant to report");
                     break;
case 29:
                     System.out.println("Nothing significant to report");
                     break;
case 30:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 12:
                    System.out.println("1. Enter a day in December:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
System.out.println("2022 Russian oil price cap Australia, the European Union, and the G7 member states decide to impose a US$60-per-barrel price ceiling on Russian seaborne oil. (AP)\nRussia–Ukraine relations Ukrainian President Volodymyr Zelenskyy signs a decree that bans religious organizations with links to Russia a");
System.out.println("nd imposes personal sanctions against their representatives. Zelenskyy also announces that the Ukrainian government will draft a law banning churches affiliated with Russia, which he says is necessary in order to counter Russian government efforts to weaken Ukraine from within. (AP) (Reuters)"); 
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("2022 Russian strikes against Ukrainian infrastructure Russian forces launch another wave of cruise missile strikes on Ukraine, destroying homes and killing two people in Zaporizhzhia Oblast, while causing power outages in many other areas after damaging critical infrastructure. (Reuters) 2022 Wester");
System.out.println("n Russia attacks Russia says that a long-range drone attack on its Dyagilevo Air Base and Engels-2 Air Base has killed three servicemen, injured four others, and damaged two aircraft. (Reuters)"); 
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell Kurakhove, Donetsk Oblast, killing ten civilians and injuring five others. (The Kyiv Independent) (The New Voice of Ukraine via Yahoo! News)"); 
                     break;
case 8:
                     System.out.println("Russian forces shell the front line in the Donetsk region, killing one civilian and damaging buildings in Toretsk. (Reuters)");
                     break;
case 9:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis Ukraine's Energoatom says that Russian soldiers have abducted two senior staff members from the Zaporizhzhia Nuclear Power Plant. Energoatom says that the two workers were beaten before being driven off in an unknown direction. (Reuters) Battle of Bakhmut Ukra");
System.out.println("inian President Volodymyr Zelenskyy accuses Russia of destroying the front line city of Bakhmut after weeks of relentless shelling by Russian forces. (Newsweek)"); 
                     break;
case 10:
                     System.out.println("More than 1.5 million people are left without electricity in Odesa Oblast as a result of Russian drone strikes on two power facilities. (Reuters)");
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
                     System.out.println("Nothing significant to report");
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
System.out.println("Southern Ukraine campaign Shelling by Russian forces kills two people and leaves the entire city of Kherson without power. (BBC News)"); 
                     break;
case 16:
System.out.println("2022 Russian strikes against Ukrainian infrastructure Russian forces launch a barrage of at least 76 missiles across Ukraine, damaging at least nine power stations and killing at least three civilians, with many more civilians being injured. (BBC News)"); 
                     break;
case 17:
                     System.out.println("Nothing significant to report");
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
                     System.out.println("Nothing significant to report");
                     break;
case 21:
                     System.out.println("Two people are killed and five others are injured during the shelling of a hotel and a restaurant in Donetsk. Former Russian Deputy Prime Minister and head of Roscosmos Dmitry Rogozin and Prime Minister of the Donetsk People's Republic Vitaliy Khotsenko are among the injured. (BBC News)");
                     break;
case 22:
                     System.out.println("The Russian-installed head of Liubymivka, Kakhovka Raion, Andrei Shlepa, is assassinated in a car bombing in the Russian-occupied part of the Kherson region. Russia accuses Ukraine of being behind the attack. (Reuters via The Straits Times)");
                     break;
case 23:
                     System.out.println("Nothing significant to report");
                     break;
case 24:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell the city of Kherson, killing at least ten civilians and injuring 58 others. (Daily Express)"); 
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
System.out.println("2022 Western Russia attacks Three Russian military members are killed by debris after Russia shoots down a drone that was approaching the Engels air base in Saratov Oblast, Russia. (AFP via Times of Israel)"); 
                     break;
case 27:
System.out.println("Battle of the Svatove-Kreminna line Ukrainian forces claim that they are closing in on the city of Kreminna in Luhansk Oblast. According to governor Serhiy Haidai, Russian fighters in some parts of the city were forced to retreat to neighboring Rubizhne. (The Guardian)"); 
                     break;
case 28:
                     System.out.println("Nothing significant to report");
                     break;
case 29:
                     System.out.println("Russia carries out a series of drone and cruise missile strikes on Ukraine, with strikes reported in the cities of Kyiv, Kharkiv, Odesa, Lviv, and Zhytomyr, injuring at least three people. (BBC News)");
                     break;
case 30:
                     System.out.println("Nothing significant to report");
                     break;
case 31:
System.out.println("Makiivka military quarters shelling Hundreds of Russian mobilized soldiers are claimed by Ukraine to be killed and injured as a result of an Ukrainian missile attack on a vocational school building serving as military barracks. Russian authorities acknowledge several casualties, but suggest lower fi");
System.out.println("gures. (Reuters) (BBC News)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;


                 }
                 break;
case 2023:
                 
                 //month in 2023
                 System.out.println("1. Enter a month in 2023(1-January,2-February,....,12-December):");
                 month=s.nextInt();
                 switch(month){
                    //day in 2023
case 1:
                    System.out.println("1. Enter a day in January 2023 :");
                    day=s.nextInt();
                      switch(day){
case 1:
                        System.out.println("Nothing significant to report");
                        break;
case 2:
                        System.out.println("Nothing significant to report");
                        break;
case 3:
System.out.println("Makiivka military quarters shelling The Russian defense ministry increases the death toll of soldiers from a December 31 Ukrainian missile attack in Makiivka, Donetsk Oblast, to 89. The ministry attributes the casualties to the soldiers' use of mobile phones with tracking systems. (AFP via ABS-CBN N");
System.out.println("ews)"); 
                        break;
case 4:
                        System.out.println("Nothing significant to report");
                        break;
case 5:
System.out.println("2023 Russian Christmas truce proposal Following the suggestion of Patriarch Kirill of Moscow, Russian President Vladimir Putin announces a unilateral ceasefire on January 6–7 in connection with Orthodox Christmas. However, Ukraine rejects an offer to respond with a mutual ceasefire, citing lack of t");
System.out.println("rust. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War The United States and Germany agree to send Bradley Fighting Vehicles and Marder infantry fighting vehicles to Ukraine. Germany will also supply the Ukrainian military with a MIM-104 Patriot surface-to-air missile system. (The Gua");
System.out.println("rdian) (AFP via The Times of Israel)"); 
                        break;
case 6:
System.out.println("Battle of Donbas, 2023 Russian Christmas truce proposal Russian forces shell the front line city of Kramatorsk, damaging at least fourteen homes, according to the city's mayor, with no reports of casualties. Meanwhile, Donetsk People's Republic officials accuse Ukraine of shelling Donetsk with artil");
System.out.println("lery. (Reuters via The Straits Times) (BBC News) Southern Ukraine campaign A Russian missile strike near a fire station in Kherson, kills one person and injures four others, according to regional official Yaroslav Yanushevych. (Ukrinform)"); 
                        break;
case 7:
                        System.out.println("Nothing significant to report");
                        break;
case 8:
                        System.out.println("Nothing significant to report");
                        break;
case 9:
                        System.out.println("Nothing significant to report");
                        break;
case 10:
System.out.println("Battle of Soledar The UK Defence Ministry says that Russian forces are in control of most of Soledar in Donetsk Oblast. Wagner Group leader Yevgeny Prigozhin, however, claims the city had been taken in its entirety. (The Guardian)"); 
                        break;
case 11:
System.out.println("Order of battle for the 2022 Russian invasion of Ukraine Chief of the General Staff of the Russian Armed Forces Valery Gerasimov is appointed commander of the Joint Group of Forces participating in the war with Ukraine. Generals Oleg Salyukov, Alexei Kim, and Sergei Surovikin, who previously held th");
System.out.println("is position, become his deputies. (Fontanka.ru) "); 
                        break;
case 12:
                        System.out.println("Nothing significant to report");
                        break;
case 13:
System.out.println("Battle of Soledar Russia's defence ministry says that its forces have taken full control of Soledar in Donetsk Oblast. However, Ukraine denies the fall of the city and its salt mines, claiming that the battle was still ongoing. (BBC News)"); 
                        break;
case 14:
System.out.println("2023 Dnipro residential building airstrike Russia strikes a nine-story residential building in Dnipro with a cruise missile, killing at least 40 people, injuring 73 others and leaving dozens more missing. (Reuters) (Al Jazeera) Foreign aid to Ukraine during the Russo-Ukrainian War UK Prime Minister ");
System.out.println("Rishi Sunak confirms that the United Kingdom will send 14 Challenger 2 main battle tanks to Ukraine in the coming weeks, as well as 30 self-propelled AS-90 howitzers. Ukrainian troops will also be trained by the British Armed Forces to operate the tanks. (Reuters)"); 
                        break;
case 15:
                        System.out.println("Nothing significant to report");
                        break;
case 16:
System.out.println("Battle of Soledar Ukraine announces defeat at Soledar after days of intense fighting. (MSN)"); 
                        break;
case 17:
                        System.out.println("Commander-in-Chief of the Armed Forces of Ukraine Valerii Zaluzhnyi and Chairman of the Joint Chiefs of Staff of the United States Mark Milley meet for the first time in person. (AFP)");
                        break;
case 18:
System.out.println("2022 Russian invasion of Ukraine During a visit to Kyiv, Canadian National Defence Minister Anita Anand announces that Canada will send 200 Roshel Senator armoured personnel carriers to Ukraine. (CBC News)"); 
                        break;
case 19:
System.out.println("Swedish Defence Minister Pål Jonson announces that Sweden will send its self-propelled Archer Artillery System, 50 Combat Vehicle 90 IFVs, and NLAW anti-tank missiles to Ukraine as part of its latest military support package for the Ukrainian military. (Politico) "); 
                        break;
case 20:
System.out.println("Battle of Bakhmut Russia claims that it captured the village of Klishchiivka in Donetsk Oblast, south of Bakhmut, and the village of Lobkove in Zaporizhzhia Oblast. (Al Jazeera)"); 
                        break;
case 21:
                        System.out.println("The Russian military says that it has launched offensive operations in Zaporizhzhia Oblast and taken more advantageous lines and positions. (France 24)");
                        break;
case 22:
                        System.out.println("German Foreign Affairs Minister Annalena Baerbock says that Germany will not prevent Poland from sending Leopard 2 main battle tanks to Ukraine which Ukrainian officials say are pivotal to defeating Russian forces. (Reuters)");
                        break;
case 23:
System.out.println("Turkish President Recep Tayyip Erdoğan rules out Turkish support for Sweden's bid for NATO membership following the burning of a Quran outside the Turkish embassy in Stockholm by Rasmus Paludan and a series of pro-Kurdish demonstrations where protestors waved PKK flags. (AP) Estonia–Russia relations");
System.out.println(" Estonia announces the expulsion of the Russian ambassador in Tallinn Vladimir Lipayev to reciprocate Russia's expulsion of the Estonian ambassador in Moscow Margus Laidre due to a downgrade of relations. Both envoys will depart their respective assignments on February 7. (AP) Latvia–Russia relation");
System.out.println("s Latvia asks Russian ambassador Mikhail Vanin to leave the country by February 24 in full solidarity with Estonia. (Politico)"); 
                        break;
case 24:
System.out.println("Battle of Soledar Two British aid workers are killed during a humanitarian evacuation from Soledar in Donetsk Oblast, Ukraine. (BBC News) Germany–Ukraine relations German Chancellor Olaf Scholz announces that Germany will send Leopard 2 main battle tanks to Ukraine, and will also allow other operato");
System.out.println("rs of the tanks, such as Poland, to send them to Ukraine. (Reuters) "); 
                        break;
case 25:
System.out.println("United States and the 2022 Russian invasion of Ukraine President of the United States Joe Biden announces that the United States will send 31 M1 Abrams main battle tanks to Ukraine. (CNBC)"); 
                        break;
case 26:
System.out.println("Russia launches a wave of cruise missile and Shahed 129 drone strikes across Ukraine, targeting major cities and critical infrastructure, killing at least 11 people and injuring 11 others. Ukrainian general Valerii Zaluzhnyi says that at least 20 missiles have been intercepted over the capital Kyiv.");
System.out.println(" (The Guardian) "); 
                        break;
case 27:
System.out.println("Eastern Ukraine campaign Ukraine says that fierce fighting is underway in the east and northeast of the country as Russian troops try to break through Ukrainian defensive lines in Kharkiv, Donetsk, Luhansk and Zaporizhzhia Oblasts. (Reuters) "); 
                        break;
case 28:
System.out.println("Battle of Donbas Russia claims that a Ukrainian HIMARS missile strike on a hospital in Novoaidar, Luhansk Oblast, has killed 14 people and injured 24 others, including patients and medical staff. (Reuters) Attacks on civilians in the 2022 Russian invasion of Ukraine The Russian Air Force launches an");
System.out.println(" airstrike on the city of Seredyna-Buda in Sumy Oblast, destroying a kindergarten and damaging nearby residential buildings. No casualties have been reported. The towns of Esman and Shalyhyne are also damaged by cross-border shelling. (Ukrinform) "); 
                        break;
case 29:
System.out.println("Eastern Ukraine campaign Forces of the Wagner Group say that they have captured the village of Blahodatne, north of Bakhmut. However, Ukraine rejects the claim and says that it repelled the attack. (AFP via The Moscow Times) Southern Ukraine campaign Russian forces shell the city of Kherson, killing");
System.out.println(" three people, injuring six others, and damaging a hospital, school, and bus station. (Reuters via U.S. News & World Report)"); 
                        break;
case 30:
                        System.out.println("Nothing significant to report");
                        break;
case 31:
System.out.println("Foreign involvement in the 2022 Russian invasion of Ukraine French Armed Forces Minister Sébastien Lecornu announces that France will send 12 additional CAESAR self-propelled howitzers to Ukraine, and could also train Ukrainian Air Force pilots to operate French fighter jets as part of their latest ");
System.out.println("military support package. (Reuters)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                                 }
                                 break;
case 2:
                    System.out.println("1. Enter a day in February 2023 :");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine A Russian Iskander-K ballistic missile destroys an apartment complex in Kramatorsk, Donetsk Oblast, killing at least three people and injuring 20 others, according to local officials. (Reuters)"); 
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
System.out.println("2023 visit by Volodymyr Zelenskyy to the United Kingdom Ukrainian president Volodymyr Zelenskyy visits the United Kingdom in his second trip outside Ukraine since the beginning of the Russian invasion, meeting with King Charles III and Prime Minister Rishi Sunak, and addressing Parliament at Westmin");
System.out.println("ster Hall. (Reuters) France–Ukraine relations, Germany–Ukraine relations Following his UK visit, Zelenskyy visits France to meet President Emmanuel Macron and German chancellor Olaf Scholz. (AFP via RFI)"); 
                     break;
case 9:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches drone and cruise missile strikes across the south and east of Ukraine with large explosions reported in the Dnipropetrovsk, Luhansk, Mykolaiv, and Zaporizhzhia oblasts. (The Guardian)"); 
                     break;
case 10:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure, Moldova–Russia relations Moldova says that Russia has fired missiles over the country at targets inside Ukraine, condemning the missile flyover as a violation of its sovereignty, and also summons the Russian ambassador for an official expla");
System.out.println("nation. (BBC News) Southern Ukraine campaign A Russian Navy drone boat strikes the Zatoka railway bridge on Highway H33 near Odesa. It is believed to be the first use of the naval weapon in the war by Russian forces. (The Telegraph) "); 
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
                     System.out.println("Nothing significant to report");
                     break;
case 14:
System.out.println("Battle of Bakhmut Ukrainian forces blow up a bridge located between Bakhmut and Kostiantynivka as Russian troops and Wagner Group fighters advance on the city. (The Guardian)"); 
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
                     System.out.println("Lawmakers in the State Duma vote to withdraw Russia from 21 conventions of the Council of Europe. (RFE/RL)");
                     break;
case 17:
System.out.println("Battle of Bakhmut Russian forces shell Bakhmut with artillery and Grad rockets, killing five people and injuring nine others. (The Kyiv Independent via Yahoo! News)"); 
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
                     System.out.println("U.S. President Joe Biden makes an unannounced visit to Kyiv, Ukraine, where he meets with President Volodymyr Zelenskyy. (The Guardian)");
                     break;
case 21:
System.out.println("Russian forces shell the city of Kherson, killing at least six people and injuring 12 others, according to local officials. (Reuters) "); 
                     break;
case 22:
                     System.out.println("Russian President Vladimir Putin revokes a 2012 foreign policy decree which underpinned Moldova's sovereignty in resolving the political status of the breakaway Transnistria region. (Reuters)");
                     break;
case 23:
                     System.out.println("Pro-Ukraine protesters confront visitors heading to the Russian embassy in Washington, D.C., United States. (The Hill)");
                     break;
case 24:
System.out.println("China unveils a 12-point position paper on ending the war in Ukraine, ahead of an expected speech by President Xi Jinping on the conflict. Ukraine says that it hopes China can urge Russia to withdraw its troops in response to the paper. (The Guardian) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an War Poland delivers the first Leopard 2 main battle tanks to Ukraine. (DW)"); 
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
                     System.out.println("Nothing significant to report");
                     break;
case 28:
                     System.out.println("Finland begins construction of a border barrier on its border with Russia due to the 2022 Russian invasion of Ukraine. (BBC News)");
            break;
            default:
                      System.out.println("Select a day from 1 to 28:");
                    }
                    break;
case 3:
                    System.out.println("1. Enter a day in March 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
System.out.println("2022–23 Western Russia attacks 2023 Bryansk Oblast attack Russia accuses a Ukrainian sabotage group of attacking the villages of Lyubechane and Sushany in Bryansk Oblast and taking hostages. However, Ukraine accuses Russia of staging a false provocation. (Reuters) Attacks on civilians in the 2022 Ru");
System.out.println("ssian invasion of Ukraine A Russian missile strike on an apartment building in the city of Zaporizhzhia kills three civilians and injures at least four others, according to Ukrainian police. (Reuters)"); 
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
System.out.println("Battle of Bakhmut Heavy street fighting takes place between Russian and Ukrainian troops in Bakhmut, Donetsk Oblast. The city's deputy mayor Oleksandr Marchenko says that not a single building has remained untouched by fighting, and that the city is almost destroyed. (BBC News) In a rare high-level ");
System.out.println("visit to the Donbas, Russian Defence Minister Sergei Shoigu is filmed inspecting troops in the eastern military district in the south Donetsk direction. (The Guardian)"); 
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
                     System.out.println("Nothing significant to report");
                     break;
case 9:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches cruise missiles at targets across Ukraine. Buildings and critical infrastructure are damaged, and at least five civilians were killed in Lviv Oblast when a missile destroyed their home, according to the region's governor Maks");
System.out.println("ym Kozytskyy. (BBC News)"); 
                     break;
case 10:
                     System.out.println("Nothing significant to report");
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
                     System.out.println("Nothing significant to report");
                     break;
case 14:
System.out.println("2023 Black Sea drone incident Russian Air Force Su-27 fighter jets intercept and hit a United States Air Force MQ-9 Reaper drone over the Black Sea, with the collision damaging the drone's propeller and causing the United States to crash the drone into international waters. (The Washington Post) (Re");
System.out.println("uters)"); 
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Poland announces that it will deliver four MiG-29 fighter jets to Ukraine, becoming the first NATO member state to send warplanes to Ukraine. (Sky News)"); 
                     break;
case 17:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Slovakia announces that it will donate its MiG-29 fighter jets, and supply part of its Kub air-defense system to Ukraine. (Reuters) "); 
                     break;
case 18:
                     System.out.println("Russian forces shell Kramatorsk, Donetsk Oblast, with cluster munitions, killing at least two civilians and injuring five others. (Ukrinform)");
                     break;
case 19:
                     System.out.println("Russian president Vladimir Putin visits Mariupol, Donetsk Oblast, in Russian-occupied Ukraine, for the first time since the invasion began. (AP)");
                     break;
case 20:
System.out.println("The European Union approves a €2 billion plan to supply 1 million artillery shells to Ukraine. (The Washington Post) (Kyiv Post) Southern Ukraine campaign Ukraine's Ministry of Defence says that a Russian shipment of Kalibr cruise missiles was blown up as it was being transported by rail in Dzhankoi");
System.out.println(", Crimea. At least one person is reportedly injured. (Reuters)"); 
                     break;
case 21:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–United Kingdom relations The United Kingdom confirms that it will provide Ukraine with depleted uranium armour-piercing shells, alongside its Challenger 2 main battle tanks, saying that there is a low risk of radiation contamination. Rus");
System.out.println("sian president Vladimir Putin says Russia would be forced to react to the British move. (BBC News) (BBC News)"); 
                     break;
case 22:
System.out.println("Zaporizhzhia residential building airstrikes A Russian missile strike on an apartment building in the city of Zaporizhzhia kills a civilian and injures 25 others. (AP) A Russian drone strike in Rzhyshchiv kills at least nine civilians and injures 29 others. (Yahoo)"); 
                     break;
case 23:
                     System.out.println("Nothing significant to report");
                     break;
case 24:
                     System.out.println("Nothing significant to report");
                     break;
case 25:
System.out.println("Russian President Vladimir Putin announces that Russia will station tactical nuclear weapons in Belarus by July. The nuclear missiles will be operated by Russian forces. It will be the first time that Russian nuclear weapons have been deployed abroad since 1996. (BBC News) (Reuters) Law and crime  R");
System.out.println("ussian invasion of Ukraine Yevgeny Prigozhin, leader of the Wagner Group, says that more than 5,000 prisoners have been pardoned following the completion of their contracts in Ukraine. (Reuters) "); 
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on Sloviansk, Donetsk Oblast, kills at least two civilians and injures 29 others. (Euronews) The head of the Blagodarnensky District in Stavropol Krai, Russia, announces the death of Dmitry Lisitsky, commander of a batt");
System.out.println("alion of the 247th Guards Air Assault Regiment who participated in the 2014 Battle of Ilovaisk. Ukraine says that he was killed in battle while pro-Russian sources say that he committed suicide. (Novaya Gazeta Europe)"); 
                     break;
case 28:
                     System.out.println("Nothing significant to report");
                     break;
case 29:
                     System.out.println("Nothing significant to report");
                     break;
case 30:
                     System.out.println("Lawmakers from the right-wing Freedom Party of Austria walkout from the lower house of Austria's parliament during a speech by Ukrainian President Volodymyr Zelenskyy as a protest against the violation of Austria's national principle of neutrality. (Al Jazeera)");
                     break;
case 31:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 4:
                    System.out.println("1. Enter a day in April 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Russia assumes the Presidency of the United Nations Security Council as part of the standard monthly rotation among the council's 15 members. (BBC News)");
                     break;
case 2:
System.out.println("2022–2023 Western Russia attacks 2023 Saint Petersburg bombing Russian pro-government war correspondent Vladlen Tatarsky is killed by a bombing at a café in Saint Petersburg owned by oligarch Yevgeny Prigozhin. Sixteen others are injured. (TASS) Attacks on civilians in the Russian invasion of Ukrain");
System.out.println("e Russian forces shell Kostiantynivka, Donetsk Oblast, killing six civilians and injuring eight others, according to the Ukrainian government. (Reuters)"); 
                     break;
case 3:
System.out.println("Battle of Bakhmut Yevgeny Prigozhin, the head of the Wagner Group, claims legal control of Bakhmut, although Ukraine denies this, stating that its troops continue to remain in the city's western districts. (CNBC)"); 
                     break;
case 4:
                     System.out.println("Finland officially joins NATO, becoming the 31st member of the military alliance and expanding NATO's border with Russia by 1,300 kilometres (810 mi). (Time) (BBC News)");
                     break;
case 5:
                     System.out.println("President of Ukraine Volodymyr Zelenskyy makes an official visit to Poland. During his meeting with Polish President Andrzej Duda, Zelenskyy receives the Order of the White Eagle, Poland's highest order. (Reuters) (European Pravda)");
                     break;
case 6:
System.out.println("2022 Russia–Ukraine peace negotiations Deputy leader Andrii Sybiha says that Ukraine is willing to hold talks on the future of Crimea if a Ukrainian counter-offensive reaches the Crimean administrative border. (The Guardian)"); 
                     break;
case 7:
System.out.println("Battle of Bakhmut The UK defence ministry says that Russian forces have captured the Bakhmutka river west banks, endangering Ukrainian supply lines. (Reuters)"); 
                     break;
case 8:
System.out.println("Two sets of classified documents of the United States relating to the Russo-Ukrainian War are leaked online. The leaks also include intelligence that the United States holds on other nations, including North Korea, China, Iran, and the United Arab Emirates. (CNN) The documents are compiled from mult");
System.out.println("iple sources, including the Central Intelligence Agency, National Security Agency, and the Bureau of Intelligence and Research of the State Department. (CNN)"); 
                     break;
case 9:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on Zaporizhzhia destroys a residential building and damages dozens of other buildings, killing two civilians and injuring another. Russian attacks are also reported in other settlements, including Orikhiv and Huliaipole");
System.out.println(". (Reuters) (Anadolu Agency) "); 
                     break;
case 10:
                     System.out.println("U.S. officials confirm that top secret U.S. government documents relating to the war in Ukraine have been leaked on social media, revealing details of Ukrainian military vulnerabilities. The Pentagon refers the leak to the Department of Justice, which has opened a criminal investigation into the lea");
System.out.println("k. (Reuters)");
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
System.out.println("The European Council agrees to donate a billion euros worth of ammunition to Ukraine through an EU financing instrument. (Tagesschau) The German government approves a request by Poland for the export of former GDR MiG-29 fighter jets to Ukraine. (Tagesschau) Battle of Bakhmut In the battle of Bakhmu");
System.out.println("t, Russian forces are able to reach the centre of the city, according to Ukrainian and Russian sources. (Spiegel) "); 
                     break;
case 14:
                     System.out.println("A Russian missile strike on Sloviansk, Donetsk Oblast, kills at least eight civilians and injures 21 others. (The New York Times)");
                     break;
case 15:
                     System.out.println("Poland and Hungary ban imports of grain and other food from Ukraine to protect the local agricultural sector, due to Ukrainian supplies lowering the price of food. (Reuters)");
                     break;
case 16:
System.out.println("Ukraine and Russia conduct a prisoner swap for soldiers who fought in Bakhmut, with 130 Ukrainian soldiers returning and an unknown amount of Russian soldiers returning. (PBS) International relations  China–Russia relations Chinese Minister of Defense Li Shangfu meets President of Russia Vladimir Pu");
System.out.println("tin and Russian Defence Minister Sergei Shoigu in Moscow, as part of his four-day visit to Russia. (CBS News)"); 
                     break;
case 17:
                     System.out.println("Slovakia transfers 13 MiG-29 fighter jets to Ukraine, according to the Slovak Defence Ministry. (Reuters)");
                     break;
case 18:
System.out.println("Russian annexation of Donetsk, Kherson, Luhansk and Zaporizhzhia oblasts Russian president Vladimir Putin makes a rare visit to Russian-occupied Kherson and Luhansk oblasts and meets with military commanders in charge of military operations. (Reuters) Former People's Deputy of Ukraine Oleh Barna is ");
System.out.println("killed in combat. (UNIAN)"); 
                     break;
case 19:
                     System.out.println("Bulgaria temporarily bans the import of grain from Ukraine, except for those in transit, following similar decisions made by Poland, Hungary, and Slovakia. (Reuters)");
                     break;
case 20:
                     System.out.println("Russian authorities report an explosion in Belgorod near the border with Ukraine, saying that it left a 20-metre (66 ft) crater in the city center. It resulted from an accidental discharge of ammunition from a Russian airplane. (Barron's via AFP) (Reuters)");
                     break;
case 21:
                     System.out.println("Latvian Defence Minister Ināra Mūrniece announces that Latvia will send all of its FIM-92 Stinger missile systems to Ukraine, following a meeting with NATO allies at Ramstein Air Base in Germany. (Yahoo! News)");
                     break;
case 22:
                     System.out.println("Russia announces the expulsion of several German diplomatic personnel in a tit-for-tat decision following the expulsion of Russian personnel from Germany. (RFE/RL)");
                     break;
case 23:
                     System.out.println("According to the Institute for the Study of War and various Russian military bloggers, the Ukrainian military have taken up positions on the east bank of the Dnieper river north of the town of Oleshky. (Novaya Gazeta Europe)");
                     break;
case 24:
                     System.out.println("Russian forces in Crimea repel a drone attack on Sevastopol, according to governor Mikhail Razvozhaev, in the first attack on the peninsula since February. (The Guardian)");
                     break;
case 25:
                     System.out.println("A Russian S-300-type missile strike in Kupiansk, Kharkiv Oblast, kills at least one civilian and injures 10 others. (RFE/RL)");
                     break;
case 26:
System.out.println("Battle of Donbas Russia uses its T-14 Armata main battle tanks in combat against Ukrainian forces for the first time. (Reuters) China and the Russian invasion of Ukraine Chinese leader Xi Jinping calls Ukrainian President Volodymyr Zelenskyy, with both countries announcing the dispatch of representa");
System.out.println("tives to establish a diplomatic presence after the call. (NPR)"); 
                     break;
case 27:
                     System.out.println("One person is killed and 23 others are injured by a Russian Kalibr missile strike in Mykolaiv. (Euronews)");
                     break;
case 28:
                     System.out.println("At least 25 civilians are killed and many others are injured in a new wave of Russian cruise missile strikes across Ukraine. The capital Kyiv is hit for the first time in 51 days. (BBC News) (Reuters)");
                     break;
case 29:
                     System.out.println("A huge fire engulfs a fuel depot in the port of Sevastopol, in Russian-occupied Crimea, in what governor Mikhail Razvozhaev says was a drone attack. (Al Jazeera)");
                     break;
case 30:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 5:
                    System.out.println("1. Enter a day in May 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Russia launches cruise missile and drone strikes across Ukraine. Among the targets hit is an industrial zone in Pavlohrad, Dnipropetrovsk Oblast, where a large explosion damaged or destroyed 19 apartment buildings and 25 homes, with 34 people reportedly injured. Ukrainian forces say that they shot d");
System.out.println("own 15 of 18 missiles launched by Russia. (The Guardian) Battle of Bakhmut Ukrainian colonel general Oleksandr Syrskyi says that Ukrainian troops have recaptured parts of central Bakhmut, but that the situation on the ground remains difficult. (Reuters)"); 
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
System.out.println("2023 Kremlin drone attack Russia accuses Ukraine of attempting to assassinate President Vladimir Putin after two drones were shot down near the Kremlin. A spokesman claimed that Putin was not inside the Kremlin at the time of the attack. A video shows at least one drone hitting the compound. Ukraine");
System.out.println(" denies any involvement in the attack. (BBC News) 2022–2023 Crimea attacks Russia's Federal Security Service says that it has arrested seven Ukrainian agents who were allegedly planning a series of high-profile sabotage and terrorist acts in Crimea, including an attack on the Head of the Republic of");
System.out.println(" Crimea Sergey Aksyonov. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Russian forces shell Kherson Oblast, killing 16 civilians and injuring 22 others. (Reuters)"); 
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin announces that, due to a lack of ammunition, his fighters will leave Bakhmut, Donetsk Oblast, on May 10 and hand over their positions to units of the Russian Defense Ministry. (CBC News) "); 
                     break;
case 6:
System.out.println("2022–2023 Western Russia attacks Russian nationalist writer Zakhar Prilepin is injured and his driver is killed when their vehicle is hit by a car bomb in Nizhny Novgorod Oblast, Russia. (BBC News)"); 
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
                     System.out.println("Nothing significant to report");
                     break;
case 9:
System.out.println("Battle of Donbas French journalist Arman Soldin is killed by a Russian rocket strike in Chasiv Yar, Donetsk Oblast, while working for Agence France-Presse. (Le Monde)"); 
                     break;
case 10:
                     System.out.println("A court in Tver Oblast, Russia, sentences a poet to four years in prison for reciting poetry critical of the Russian invasion of Ukraine. (RFE/RL)");
                     break;
case 11:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin confirms that Ukrainian troops have recaptured parts of Bakhmut in Donetsk Oblast from his forces. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom's Defence Ministry confirms that it has supplied Ukraine with");
System.out.println(" Storm Shadow cruise missiles. (BBC News) "); 
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches cruise missiles at the city of Ternopil in Western Ukraine, injuring two civilians. (BBC News) Two Russian Mi-8 helicopters and two fighter jets, an Su-34 and an Su-35, are reportedly shot down in Bryansk Oblast. (Reuters via");
System.out.println(" MSN)"); 
                     break;
case 14:
System.out.println("Battle of Donbas The Russian Ministry of Defence announces the deaths of two of their commanders in Bakhmut and the village of Sontsivka west of Donetsk. (Novaya Gazeta Europe)"); 
                     break;
case 15:
System.out.println("Ukrainian President Volodymyr Zelenskyy meets with British Prime Minister Rishi Sunak at Chequers. (BBC News) Moldova announces that it will initiate a procedure to withdraw from the CIS Interparliamentary Assembly. (Anadolu Agency)"); 
                     break;
case 16:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure More than a dozen explosions are reported in Kyiv as Russia launches a missile barrage at the capital and other Ukrainian cities. Ukrainian forces say that they have shot down six Kh-47M2 Kinzhal hypersonic missiles. (Financial Times) (Reute");
System.out.println("rs) The Russian Ministry of Defense claims that it destroyed a Patriot air defense system in Kyiv. However a United States official says that the system was likely damaged but not destroyed. (CNN) "); 
                     break;
case 17:
System.out.println("Southern Ukraine campaign Russian forces shell Ukrainian-held areas of Kherson Oblast, killing at least five civilians, including a child, while 17 others are reportedly injured. (BBC News)"); 
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin says that they have captured all of Bakhmut in Donetsk Oblast. The Ukrainian Defence Ministry rejects this claim, saying that its forces still control a district on the westernmost edge of the city. (CNN)"); 
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
                     System.out.println("Governor of Belgorod Oblast Vyacheslav Gladkov says that Ukrainian sabotage groups have entered Grayvoronsky District. Ukrainian media reports that the cross-border excursion is being performed by the Russian rebel opposition groups, the Russian Volunteer Corps and the Freedom of Russia Legion. The ");
System.out.println("Freedom of Russia Legion reports that it has captured the Russian towns of Kozinka and Gora-Podol. A bridge crossing the Vorskla near Grayvoron is destroyed in an explosion. (The New York Times) (Ukrainska Pravda via Yahoo! News) (Meduza) (Reuters)");
                     break;
case 23:
                     System.out.println("Nothing significant to report");
                     break;
case 24:
                     System.out.println("Japan announces that it will donate 100 military vehicles to the Armed Forces of Ukraine. (ABC News)");
                     break;
case 25:
                     System.out.println("Wagner Group forces begin withdrawing from Bakhmut, Donetsk Oblast, transferring control over to the Russian Ground Forces. (BBC News)");
                     break;
case 26:
                     System.out.println("A Russian missile strike on Dnipro damages a medical facility, killing two people and injuring 23 others. (Ukrainska Pravda) (The Guardian)");
                     break;
case 27:
                     System.out.println("Russian authorities say that shelling has killed a person in Shebekino, Belgorod Oblast and Kursk, Kursk Oblast, respectively. Russia accuses Ukraine of the attacks, although Ukraine denies any involvement. (AFP via The Moscow Times)");
                     break;
case 28:
                     System.out.println("Two people are killed and three others are injured in a 'record drone attack' on Kyiv. Ukrainian authorities say they have shot down 52 of 54 drones. (Euronews)");
                     break;
case 29:
System.out.println(" Russian forces strike Kyiv using Iskander ballistic and cruise missiles, with debris injuring one civilian and damaging infrastructure. Ukraine claims to have shot down all of the missiles. (AP via Los Angeles Times) \n Russian airstrikes on Toretsk, Donetsk Oblast, target a petrol station and a mu");
System.out.println("lti-storey building, killing two people and injuring eight others. (Reuters)"); 
                     break;
case 30:
System.out.println("30 May 2023 Moscow drone strikes Russian authorities say they have intercepted eight drones over Moscow. (BBC News) A Russian drone attack on Kyiv results in the death of a civilian and injures several others. (The New York Times)"); 
                     break;
case 31:
System.out.println("Southern Ukraine campaign Russia says that it destroyed the Ukrainian Navy warship Yuri Olefirenko at the Port of Odesa in a missile strike on May 29. (Reuters) 2022–2023 Western Russia attacks Russian authorities say that a Ukrainian drone strike has caused a fire at an oil refinery in Krasnodar Kr");
System.out.println("ai, and also caused damage in Shebekino, Belgorod Oblast. (Reuters) Battle of Donbas According to Russian authorities, five people are killed and 19 others are injured by Ukrainian shelling in Karpaty, in Russian-occupied Luhansk Oblast. (US News)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 6:
                    System.out.println("1. Enter a day in June 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Russia says they have prevented three attacks by the Russian Volunteer Corps in Belgorod Oblast. (The New Voice of Ukraine via Yahoo! News) (Reuters) Belgorod Governor Vyacheslav Gladkov says that Ukrainian forces have shelled Shebekino with BM-21 Grad rockets, damaging a dormitory and an administra");
System.out.println("tive building in the town. Hundreds of people are evacuated. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Russia launches cruise missiles and ballistic missiles at Kyiv, killing three civilians and injuring 12 others. (AFP via Arab News)"); 
                     break;
case 2:
System.out.println("Southern Ukraine campaign Russian occupation official Vladimir Rogov says Ukrainian forces have shelled the port of Berdiansk in Zaporizhzhia Oblast, injuring nine people. (Reuters)"); 
                     break;
case 3:
System.out.println("Russian forces strike a residential area in Dnipro Raion with Iskander cruise missiles, killing a two-year-old girl and injuring 22 other civilians, including five children. (Reuters) "); 
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("2023 Belgorod Oblast incursions The Russian Volunteer Corps claims to have captured the village of Novaya Tavolzhanka in the Belgorod region of Russia. The governor of Belgorod, Vyacheslav Gladkov, says that about 100 civilians are still trapped in the village and cannot be evacuated because of cont");
System.out.println("inued shelling. (Novaya Gazeta Europe) Wagner Group mercenaries publish a video of a captured Russian commander claiming that he had ordered his troops to fire on a Wagner convoy leaving Bakhmut. (The Guardian)"); 
                     break;
case 6:
System.out.println("Destruction of the Kakhovka Dam The Nova Kakhovka dam in the Russian-occupied part of Ukraine's Kherson Oblast is destroyed, releasing a huge amount of water downstream on the Dnieper. The dam had held back 18 cubic kilometres of water in the Kakhovka reservoir. (Reuters) Thousands of civilians are ");
System.out.println("being evacuated from the town of Nova Kakhovka and surrounding villages as the floods spread. (BBC News)"); 
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
System.out.println("Southern Ukraine campaign Russian forces shell Kherson, injuring nine civilians near an evacuation point in a flooded part of the city following the destruction of the Kakhovka dam. (The New York Times) The Russian Defence Ministry says it has destroyed several Ukrainian army tanks in Zaporizhzhia O");
System.out.println("blast, including a Leopard 2 main battle tank, the first Western-made tank to be destroyed by Russian forces in the war. A video released by the ministry shows a column of tanks being hit in a field, with one of them confirmed to be a Leopard 2. (Business Insider)"); 
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
                     System.out.println("Russian forces attack Odesa with drones and missiles, killing three civilians and injuring 27 others. (Reuters)");
                     break;
case 11:
System.out.println("2023 Ukrainian counteroffensive Ukrainian forces claim to have retaken three villages south of Velyka Novosilka in the southern Donetsk region. (The Guardian)"); 
                     break;
case 12:
                     System.out.println("Moldova and Ukraine sign an agreement to build a bridge across their border over the Dniester river between Cosăuți, Moldova, and Yampil, Ukraine, bypassing the unrecognised state of Transnistria. (Yahoo! News)");
                     break;
case 13:
                     System.out.println("Russian rockets hit a residential building in the city of Kryvyi Rih, Dnipropetrovsk oblast, killing 11 people and injuring 28 others. (Al Jazeera) (AP)");
                     break;
case 14:
System.out.println("At least three people are killed and 13 others are injured in a rocket attack on a residential area in Odesa, Ukraine. (Al Jazeera) Adam Delimkhanov, a Russian-Chechen member of the State Duma, is reportedly injured in Ukraine. (BBC News)"); 
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine 2022–2023 bombing of Kherson Russian forces attack Kherson, injuring 23 civilians and damaging infrastructure. (The Kyiv Independent) A peace mission visit of African officials to Ukraine is interrupted by a Russian missile attack according to ");
System.out.println("the Ukrainian Air Force, which says it has shot down six Kinzhal ballistic missiles, six Kalibr missiles, and two reconnaissance UAVs. (AFP via Yahoo! News)"); 
                     break;
case 17:
                     System.out.println("Nothing significant to report");
                     break;
case 18:
System.out.println("\n2023 Ukrainian counteroffensive: Ukrainian forces capture the front line village of Piatykhatky in Zaporizhzhia Oblast as heavy fighting continues. (Reuters)"); 
                     break;
case 19:
                     System.out.println("\nNothing significant to report");
                     break;
case 20:
                     System.out.println("\nNothing significant to report");
                     break;
case 21:
                     System.out.println("\nNothing significant to report");
                     break;
case 22:
System.out.println("2023 Ukrainian counteroffensive: A bridge between southern Ukraine and Russian-occupied Crimea has been damaged by a British-made Storm Shadow missile. (BBC News)"); 
                     break;
case 23:
System.out.println("Wagner Group rebellion Wagner Group leader Yevgeny Prigozhin declares that he will stop the Russian military leadership and calls for a march of justice, claiming that his forces have been killed in airstrikes by Russian government forces. The defence ministry rejects the claims, stating that they a");
System.out.println("re not true and are an information provocation. (BBC News) (CBC News) (The Moscow Times) (The Guardian) The Prosecutor-General of Russia Igor Krasnov formally orders the arrest of Yevgeny Prigozhin on charges of calling for an armed rebellion, with authorities urging Wagner personnel to refuse Prigo");
System.out.println("zhin's criminal and treacherous orders and to detain him. The FSB begins a mutiny investigation into Yevgeny Prigozhin. (TASS) (TASS 2) (NPR) BBC News Russian reports that there are roadblocks on the M4 highway between Moscow and Voronezh, with the FSB and other security services being placed on hig");
System.out.println("h alert in the Moscow Oblast. (BBC News Russian)"); 
                     break;
case 24:
System.out.println("Wagner Group rebellion The Wagner Group seizes and occupies the cities of Rostov-on-Don and Voronezh as clashes occur across both oblasts. Wagner Group forces capture the Southern Military District headquarters in Rostov-on-Don. Rostov Governor Vasily Golubev asks residents to remain indoors. (9News");
System.out.println(") (Ukraine Today) (CNN) Yevgeny Prigozhin warns that his troops will march on Moscow unless Russian military leadership meet with him for talks. Russian president Vladimir Putin addresses the nation, saying that a coup d'état attempt is under way. (The New York Times) (AP) An Antonov An-26 transport");
System.out.println(" plane is reportedly shot down over Voronezh Oblast, while Russian Air Force Ka-50 helicopters strike an oil refinery and depot in Voronezh, causing a large explosion and fire.(Defence Blog) (Hindustan Times) Authorities in Lipetsk Oblast tell residents to remain indoors, with the M4 highway closed ");
System.out.println("off to traffic. Wagner forces later enter Lipetsk. (Live Mint) (Al Arabiya) (DNP India) The Wagner Group withdraws after Yevgeny Prigozhin, Vladimir Putin, and President of Belarus Alexander Lukashenko negotiate a deal to end the rebellion. (AP) 2022–2023 Russian strikes against Ukrainian infrastruc");
System.out.println("ture The debris of a Russian cruise missile shot down last night damages a 25-storey building in Kyiv, Ukraine, killing three civilians and injuring eight others. The Ukrainian military says that air defences destroyed 41 out of 51 cruise missiles launched by Russia, as well as two drones. (Reuters)"); 
                     break;
case 25:
                     System.out.println("\nNothing significant to report");
                     break;
case 26:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Australian Prime Minister Anthony Albanese announces a AU$110 million military aid package to Ukraine. (The Guardian) Ukrainian forces recapture the uninhabited village of Rivnopil in Donetsk Oblast, according to Deputy Defence Minister Hanna Ma");
System.out.println("liar, the ninth in the past month. (Reuters)"); 
                     break;
case 27:
System.out.println("Kramatorsk restaurant attack A Russian missile strike on a restaurant in Kramatorsk, Donetsk Oblast, Ukraine, kills 13 civilians and injures 61 others. (The Guardian) (The Independent) Wagner Group rebellion Belarusian President Alexander Lukashenko confirms that the head of the Wagner Group, Yevgen");
System.out.println("y Prigozhin, has arrived in Belarus in accordance with the agreement reached with the Russian government. (Reuters)"); 
                     break;
case 28:
                     System.out.println("\nNothing significant to report");
                     break;
case 29:
                     System.out.println("\nNothing significant to report");
                     break;
case 30:
                     System.out.println("\nNothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 7:
                    System.out.println("1. Enter a day in July 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("\nNothing significant to report");
                     break;
case 2:
                     System.out.println("\nNothing significant to report");
                     break;
case 3:
                     System.out.println("Russia launches drone attacks on Sumy, Ukraine, killing two people and injuring 19 others. In response to the attack, Ukrainian President Volodymyr Zelenskyy calls for a major upgrade of anti-aircraft defences. (Reuters)");
                     break;
case 4:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces attack Pervomaiskyi, Kharkiv Oblast, with missiles, injuring at least 38 civilians and damaging infrastructure, according to Ukrainian officials. (Reuters) Two people are killed during Russian shelling of Kherson. Three more peop");
System.out.println("le are injured by Russian shelling in Chernihiv. (The Guardian)"); 
                     break;
case 5:
System.out.println("2023 Kyiv court explosion Ihor Humenyuk, a defendant at the Shevchenkivskyi District Court in Kyiv and a former member of the Sich Battalion, dies after injuring two police officers in an apparent escape attempt. (Meduza)"); 
                     break;
case 6:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches a Kalibr cruise missile attack on Lviv from the Black Sea, killing 10 civilians and injuring 48 others. Ukrainian forces say that they shot down seven of the ten missiles. (Reuters) (Lviv City Council)"); 
                     break;
case 7:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War The United States announces an $800 million aid package for Ukraine that includes cluster munitions for the first time. While the weapons are outlawed by over 100 countries under the Convention on Cluster Munitions, the United States, Ukraine, a");
System.out.println("nd Russia are not signatories. (CNN) The U.S. package also includes M777 howitzers, munitions for MIM-104 Patriot and M142 HIMARS missile systems, anti-tank weapons, UAVs, and additional Bradley Fighting Vehicles and Stryker armoured personnel carriers. (Reuters)"); 
                     break;
case 8:
System.out.println("Battle of Donbas Russian forces shell Lyman in Donetsk Oblast, Ukraine, killing eight people and injuring 13 others, according to governor Pavlo Kyrylenko. (BBC News)"); 
                     break;
case 9:
                     System.out.println("President of Poland Andrzej Duda and President of Ukraine Volodymyr Zelenskyy commemorate the victims of the 1943 massacres in Volhynia and Eastern Galicia at a ceremony held at the Saint Peter and Paul Cathedral in Lutsk, Ukraine. (DW)");
                     break;
case 10:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Orikhiv, Zaporizhzhia Oblast, killing seven civilians and injuring 11 others, according to Governor Yuriy Malashko. (Reuters) Russian military commissariats attacks Stanislav Rzhitsky, deputy chief in");
System.out.println(" charge of military mobilization in the Russian city of Krasnodar and commander of the Russian Navy submarine B-265 Krasnodar, is shot dead near the city's sports complex. (The Guardian) (Reuters via The Jerusalem Post)"); 
                     break;
case 11:
System.out.println("2023 Ukrainian counteroffensive Russian Lieutenant General Oleg Tsokov is reportedly killed by a missile strike near Berdiansk, Zaporizhzhia Oblast. (CNN)"); 
                     break;
case 12:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Zaporizhzhia, injuring 18 civilians, including six children. (Reuters) An 81-year-old man is killed and his wife is injured due to Russian shelling in Kherson. (The Guardian)"); 
                     break;
case 13:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Zaporizhzhia, injuring 18 civilians, including six children. (Reuters) An 81-year-old man is killed and his wife is injured due to Russian shelling in Kherson. (The Guardian)"); 
                     break;
case 14:
                     System.out.println("\nNothing significant to report");
                     break;
case 15:
                     System.out.println("\nNothing significant to report");
                     break;
case 16:
                     System.out.println("Russian President Vladimir Putin authorizes a temporary state takeover of French agribusiness Danone and Carlsberg-owned brewer Baltika's shares, as part of a wider response to many private companies, including these two, reducing their business operations in Russia amid the ongoing war in Ukraine. ");
System.out.println("(AFP via SCMP)");
                     break;
case 17:
System.out.println("2023 Crimean Bridge explosion A couple are killed and their daughter is injured by explosions at the Crimean Bridge. (Reuters) (The Guardian) Black Sea Grain Initiative The agreement to allow safe passage of grain exports from Ukrainian ports, in effect since July 2022, expires following Russia's re");
System.out.println("fusal to renew the deal. (Reuters)"); 
                     break;
case 18:
System.out.println("2022 Russian mobilization The Russian Federal Assembly amends its mobilization laws, raising the age limits for conscription to 70 years old from 65 for the highest-ranking officers of the armed forces. (Reuters)"); 
                     break;
case 19:
System.out.println("Bombing of Odesa At least 12 people are injured in a night-time Russian missile attack on Odesa, Ukraine. (AP via ABC News) Crimea attacks A fire occurs at the military training grounds in Crimea, forcing the evacuation of more than 2,000 people and the closure of a nearby highway. (Reuters) List of");
System.out.println(" military aid to Ukraine during the Russo-Ukrainian War The United States announces a $1.3 billion military aid package to Ukraine. The package includes four NASAMS air defense systems, anti-tank missiles, Phoenix Ghost and Switchblade attack drones, and landmine clearing equipment, among others. (T");
System.out.println("he New York Times)"); 
                     break;
case 20:
System.out.println("\nOdesa attacks: At least three people are killed and eight civilians are injured in a Russian strike on Odesa, Ukraine. (Reuters) (Reuters 2) The consulate general of China in Odesa suffers minor damage during the Russian strike. (Reuters) Mykolaiv attacks Russian forces strike Mykolaiv, Ukraine, i");
System.out.println("njuring at least 19 civilians. (Reuters) (The Kyiv Independent) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency reports that it is still awaiting access to the rooftops of Ukraine's Russian-occupied Zaporizhzhia Nuclear Power Plant in Enerhodar, despite being permitted");
System.out.println(" to view the fuel cooling pools amid allegations of the plant's usage as an atomic bargaining chip. (AFP via The Manila Times)"); 
                     break;
case 21:
System.out.println("Russian strikes against Ukrainian infrastructure Bombing of Odesa The Russian Armed Forces strike grain warehouses in Odesa with Kalibr missiles, destroying 120 tons of crops and injuring two civilians, according to Governor Oleh Kiper. (CNN) Bombing of Mykolaiv The Russian Armed Forces strike a bui");
System.out.println("lding in Mykolaiv, killing two civilians. (Yeni Şafak)"); 
                     break;
case 22:
System.out.println("Crimea attacks Ukraine strikes an ammunition depot in occupied Crimea, leading to the evacuation of houses within a 5-kilometre (3.1 mi) radius. (AP)"); 
                     break;
case 23:
System.out.println("Bombing of Odesa A nighttime Russian missile attack on Odesa kills at least one person, injures 22 others, and severely damages the Transfiguration Cathedral. (AP) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency finds anti-personnel mines at the Russian-occupied Zapori");
System.out.println("zhzhia Nuclear Power Plant, but notes that any detonation 'should not affect the site's nuclear safety and security systems'. (AFP via Barron's) (IAEA)"); 
                     break;
case 24:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine:\n A child is killed and six people are wounded in a Russian missile strike on Kostiantynivka. (The Guardian) Dylan Collins, a journalist for Agence France-Presse, is wounded in Bakhmut by a Russian drone attack. (The Guardian) Russian strikes ");
System.out.println("against Ukrainian infrastructure Russian forces attack Odesa Oblast with drones, destroying grain warehouses at the Reni Commercial Seaport and injuring seven civilians. (Reuters) 2022–2023 western Russia attacks Two drones damage buildings in Moscow, including one near the Defence Ministry headquar");
System.out.println("ters. (Reuters)"); 
                     break;
case 25:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A child is killed and six people are wounded in a Russian missile strike on Kostiantynivka. (The Guardian) Dylan Collins, a journalist for Agence France-Presse, is wounded in Bakhmut by a Russian drone attack. (The Guardian) Russian strikes aga");
System.out.println("inst Ukrainian infrastructure Russian forces attack Odesa Oblast with drones, destroying grain warehouses at the Reni Commercial Seaport and injuring seven civilians. (Reuters) 2022–2023 western Russia attacks Two drones damage buildings in Moscow, including one near the Defence Ministry headquarter");
System.out.println("s. (Reuters)"); 
                     break;
case 26:
System.out.println("Russia launches cruise missiles at Kyiv Oblast, Khmelnytskyi Oblast, and Kirovohrad Oblast in Ukraine. Air Force Commander Mykola Oleschuk says that 36 targets, including three Kalibr and 33 Kh-101/Kh-55 cruise missiles were shot down. (Reuters) "); 
                     break;
case 27:
System.out.println("2023 Ukrainian counteroffensive Ukrainian forces reportedly retake the village of Staromaiorske, Donetsk Oblast. (CNN International)"); 
                     break;
case 28:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Nine civilians are injured in a Russian missile strike on a residential complex and a nearby building of the SBU in Dnipro. (Reuters) At least four civilians are injured in a Russian shelling of a residential area in Beryslav Raion, Kherson Obl");
System.out.println("ast, according to Governor Oleksandr Prokudin. (CNN) 2022–2023 western Russia attacks Russia claim to have shot down two Ukrainian S-200 missiles, with the debris injuring at least nine civilians in Taganrog, Rostov Oblast. (The New York Times)"); 
                     break;
case 29:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike Zaporizhzhia, killing two civilians and injuring another, as well as damaging infrastructure. (CNN International) Two people are killed and 20 injured in a Russian missile strike on civilian infrastructure in Sumy. (The Ky");
System.out.println("iv Independent)"); 
                     break;
case 30:
System.out.println("2022–2023 western Russia attacks Russia says that it destroyed three Ukrainian drones over Moscow, which injured one person, prompting officials to close the Vnukovo International Airport to traffic. (AFP via The Guardian)"); 
                     break;
case 31:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kryvyi Rih At least six civilians are killed and 75 others are injured in a Russian ballistic missile strike on an apartment complex and a university building in Kryvyi Rih, Dnipropetrovsk Oblast. (The Washington Post) Bombing of Khe");
System.out.println("rson Russian forces strike residential areas in Kherson, killing at least four civilians and injuring 17 others. (CNN International) "); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 8:
                    System.out.println("1. Enter a day in August 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kherson A civilian is killed and five others are injured by a Russian airstrike on a Kherson hospital. (The Kyiv Independent via Yahoo! News) 2022–2023 western Russia attacks Russia says that it destroyed three drones near Moscow. On");
System.out.println("e drone damaged the 21st floor of the IQ-quarter mixed-use complex, which hosts offices for the Ministry of Economic Development. The Vnukovo International Airport temporarily closed for the second time in two days. (The Guardian) (Meduza) Turkmenistan Airlines announces that they will temporarily s");
System.out.println("uspend flights from Ashgabat to Moscow following the drone attacks. Flights will instead travel to Kazan, located in Tatarstan. (The Moscow Times) (Turkmenportal)"); 
                     break;
case 2:
                     System.out.println("A Russian drone strike in Izmail, Odesa Oblast, damages administrative buildings and grain storage facilities. (Bloomberg)");
                     break;
case 3:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kherson Eight civilians are injured in Russian strikes on the St. Catherine's Cathedral in Kherson. (AP) (The Kyiv Independent via Yahoo! News) "); 
                     break;
case 4:
System.out.println("2022–2023 western Russia attacks The Russian Olenegorsky Gornyak landing ship is damaged by a Ukrainian naval drone attack at the naval base at the Port of Novorossiysk, Krasnodar Krai. (BBC News)"); 
                     break;
case 5:
System.out.println("Crimea attacks Ukraine says that it damaged the Russian tanker Sig in a naval drone attack in the Black Sea near the Crimean Bridge. (BBC News) (The Guardian) Peace negotiations in the Russian invasion of Ukraine Peace talks begin in Jeddah, Saudi Arabia. The talks will last for two days and are bei");
System.out.println("ng attended by officials from around 40 countries, including those from the Global South, but not Russia. (Reuters) (The New York Times) Attacks on civilians in the Russian invasion of Ukraine Russia hits a blood transfusion centre in Kupiansk, Kharkiv Oblast, killing two people and injuring four. (");
System.out.println("BBC News)"); 
                     break;
case 6:
                     System.out.println("An Armed Forces of Ukraine missile damages a bridge connecting the Russian-occupied Kherson Oblast and Crimea over the Chonhar Strait. (Reuters)");
                     break;
case 7:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine At least seven people are killed and 88 others are injured in a Russian Iskander double tap strike on residential buildings in Pokrovsk, Donetsk Oblast. (Reuters) (The Kyiv Independent via Yahoo! News) (The Guardian) Russian forces strike priva");
System.out.println("te houses in Kruglyakivka, Kharkiv Oblast, with guided aerial bombs, killing at least two civilians and injuring at least five others. (CNN International) Assassination attempts on Volodymyr Zelenskyy The Security Service of Ukraine says that it has arrested a Ukrainian citizen for allegedly assisti");
System.out.println("ng Russian intelligence, including his suspected role in a plot to assassinate President Volodymyr Zelenskyy. (The Washington Post)"); 
                     break;
case 8:
                     System.out.println("\nNothing significant to report");
                     break;
case 9:
System.out.println("Russian invasion of Ukraine Attacks on civilians in the Russian invasion of Ukraine Bombing of Zaporizhzhia At least two people are killed and seven others are injured in a Russian missile strike on a residential area in Zaporizhzhia. (Reuters) North Korean Supreme Leader Kim Jong-un appoints Vice M");
System.out.println("arshal Ri Yong-gil to replace General Park Su-il as the chief of the General Staff Department of the Korean People's Army, and calls for enhancing war preparations, including increased weapons production and more drills. (AFP via Arab News)"); 
                     break;
case 10:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Zaporizhzhia At least one person is killed and 14 others are injured in a Russian Iskander missile strike on a hotel in Zaporizhzhia. (Reuters) Russian forces attack Toretsk, Donetsk Oblast, with mortars and aerial bombs, injuring at");
System.out.println(" least six people. (The Kyiv Independent) The Kupiansk city military administration says it will begin evacuating civilians from the Kupiansk Raion of the Kharkiv Oblast due to intense Russian shelling. (Meduza)"); 
                     break;
case 11:
System.out.println("Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy announces the dismissal of all heads of regional military recruitment centres due to corruption. (NOS) (CNN) Russia temporarily closes its airspace above Moscow due to detection of drones. A drone is later shot down. (NOS)"); 
                     break;
case 12:
System.out.println("A government investigation uncovers corruption at recruitment centres in 11 regions with 112 criminal proceedings opened. Bribes averaged around US$6,000 for a medical certificate granting an exemption from military service. (Financial Times) (The Guardian) Investigative news website Dzerkalo Tyzhni");
System.out.println("a reveals documents showing the Ministry of Defence overpaid for summer camouflage kits bought as winter coats for troops. The documents are suspected to be related to a investigation launched in June by Ukraine’s security services into Former Deputy Defense Minister Vyacheslav Shapovalov. (The Guar");
System.out.println("dian) A New York Times investigation reveals that a company tied to Serhiy Pashynskyi, who was previously under investigation for corruption, has become the biggest private arms supplier to the Ministry of Defence. (Insider) Crimea attacks The Russian Ministry of Defense says that it shot down twent");
System.out.println("y Ukrainian drones over Crimea. (NOS) Head of the Republic of Crimea Sergey Aksyonov says that three Ukrainian missiles were shot down over the Kerch bridge. (CNN International) Russian Defence Minister Sergei Shoigu inspects the Northern Fleet and visits a Rosatom nuclear weapons test site in Novay");
System.out.println("a Zemlya. (Reuters) (Hindustan Times) (The Barents Observer) One person is killed and 12 others are injured in a Russian guided aerial bomb strike on Orikhiv, Zaporizhzhia Oblast. (CNN International)"); 
                     break;
case 13:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike Kherson Oblast, killing seven people, including an infant, and injuring 20 others. (Reuters)"); 
                     break;
case 14:
                     System.out.println("Russian forces strike Odesa with missiles and drones, injuring three people and damaging civilian infrastructure. (CNN International)");
                     break;
case 15:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches a large-scale airstrike on Lviv and northwestern Volyn Oblast, killing at least three civilians and injuring more than a dozen others. (Reuters) 2022–2023 western Russia attacks Bryansk Oblast Governor Alexander Bogomaz says ");
System.out.println("that Russian soldiers and security services stopped a Ukrainian sabotage group from infiltrating the border near the village of Kurkovichi. (AFP via Al Arabiya)"); 
                     break;
case 16:
System.out.println("Russia's Federal Security Service says that it has stopped a Ukrainian sabotage group, consisting of four fighters, from infiltrating the border in Starodubsky District, Bryansk Oblast. (AFP via Al Arabiya) 2023 Ukrainian counteroffensive Ukraine recaptures the village of Urozhaine, Donetsk Oblast, ");
System.out.println("from Russian forces. (CNN) A Russian strike in Dnipropetrovsk Oblast kills a civilian and injures six others, and damaging agriculture and civilian infrastructure. (CNN International)"); 
                     break;
case 17:
                     System.out.println("The U.S. approves the transfer of F-16 Fighting Falcons to Ukraine from Denmark and the Netherlands after training for Ukrainian Air Force pilots is completed. (Reuters)");
                     break;
case 18:
System.out.println("2022–2023 western Russia attacks Russia says that Ukraine launched a drone attack on Moscow, striking a building in the International Business Center. Mayor Sergey Sobyanin says that air defences shot down a drone with debris falling over the Expocentre. (BBC News)"); 
                     break;
case 19:
System.out.println("Chernihiv missile strike At least seven people are killed and 129 others are injured in a Russian ballistic missile strike on a theater in Chernihiv hosting a meeting of military and engineers at an exhibition on the use of consumer drones in the conflict. (BBC News) (CNN)"); 
                     break;
case 20:
                     System.out.println("\nNothing significant to report");
                     break;
case 21:
System.out.println("2022–2023 western Russia attacks Ukraine claims that saboteurs coordinated by military intelligence destroyed a Tupolev Tu-22M heavy bomber at the Soltsy-2 airbase in Novgorod Oblast, Russia. (AP) Two people are injured by falling debris from a Ukrainian drone strike on Moscow and flights are disrup");
System.out.println("ted at the city's airports. Russia says they shot down one drone and jammed another. (Reuters)"); 
                     break;
case 22:
System.out.println("Eastern Ukraine campaign Russian forces shell Torske and Zavitne in Donetsk Oblast, Ukraine, killing three people and injuring two others. (BBC News) Military aid to Ukraine during the Russo-Ukrainian War France delivers the first shipment of its SCALP-EG air-launched cruise missiles to Ukraine. (Al");
System.out.println(" Arabiya)"); 
                     break;
case 23:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine 2022–2023 western Russia attacks The governor of Belgorod Oblast, Russia, says that a Ukrainian attack killed three civilians in the region. (AFP via Al Arabiya) Four people are killed and four others are injured in a Russian drone strike on a ");
System.out.println("school in Romny, Sumy Oblast. (Reuters) Russian strikes against Ukrainian infrastructure A Russian drone strike on agricultural facilities in Izmail, Odesa Oblast, destroys 13,000 tons of grain and damages infrastructure. (CNN International)"); 
                     break;
case 24:
                     System.out.println("\nNothing significant to report");
                     break;
case 25:
                     System.out.println("Three Ukrainian Air Force pilots are killed when two L-39 trainer aircraft collide in midair in Zhytomyr, Ukraine. Andrii Pilshchykov was among the dead. (Al Jazeera) (The Guardian)");
                     break;
case 26:
System.out.println("2022–2023 western Russia attacks The governor of Belgorod Oblast says that Ukrainian shelling and usage of cluster munitions injured six civilians in Urazovo. (Al Jazeera) Russian forces shell the front-line city of Kupiansk, killing two people and injuring another. (AP via MSN) Russia's Northern Fl");
System.out.println("eet conducts navy exercises in the Barents Sea aimed at preventing the passage of unauthorised and foreign ships. (Al Jazeera)"); 
                     break;
case 27:
                     System.out.println("Russia's Investigative Committee confirms the identities of the bodies recovered at crash site corresponds to the names on the flight list. (AFP via The Moscow Times)");
                     break;
case 28:
System.out.println("2022–2023 western Russia attacks Russia says that it shot down two aerial drones over the north and west of Crimea. (Al Jazeera) 2023 Ukrainian counteroffensive Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency warns that Ukraine's offensive in Zaporizhzhia Oblast has in");
System.out.println("creased the risk of damage to the Zaporizhzhia Nuclear Power Plant. (Al Jazeera) Ukraine claims they retook the village of Robotyne, Zaporizhzhia Oblast from the Russian forces. Russia says they have repelled attacks in the area. (Reuters) Russia–United States relations Russia's Federal Security Ser");
System.out.println("vice charges Robert Shonov, a former U.S. consulate employee, with passing information on Russia's mobilization campaign to U.S. embassy staffers in Moscow. (Al Jazeera)"); 
                     break;
case 29:
System.out.println("2022–2023 western Russia attacks At least four Ilyushin Il-76 military transport aircraft in Pskov are damaged in a drone attack on Pskov. Russian authorities say they have shot down eight drones over the Bryansk, Oryol, Ryazan, Kaluga and Moscow oblasts. (The Guardian)"); 
                     break;
case 30:
System.out.println("Bombing of Kyiv Two people are killed and three others are injured in a Russian drone and missile strike on Kyiv. Ukraine says that it shot down several missiles and drones during the strike. (Reuters) Russia says that its aircraft destroyed four military boats carrying up to 50 members from landing");
System.out.println(" groups of the special forces of Ukraine operating in the Black Sea as well as two Ukrainian military speedboats carrying military personnel east of Snake Island. (Al Jazeera) (Reuters)"); 
                     break;
case 31:
                     System.out.println("\nNothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 9:
                    System.out.println(" Enter a day in September 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("\nNothing significant to report");
                     break;
case 2:
System.out.println("The Russian Defense Ministry says that it has destroyed 281 Ukrainian drones in the past week, including 29 over western Russia. (South China Morning Post) Crimea attacks The Russian Defense Ministry says that it has thwarted attacks on the Crimean Bridge by destroying a Ukrainian boat. (Reuters)"); 
                     break;
case 3:
System.out.println("President of Ukraine Volodymyr Zelenskyy dismisses Defense Minister Oleksii Reznikov amid graft allegations within the Ministry of Defence. The head of the State Property Fund, Rustem Umerov replaces Reznikov. (Reuters) (CNN) "); 
                     break;
case 4:
                     System.out.println("\nNothing significant to report");
                     break;
case 5:
System.out.println("2022–2023 western Russia attacks Russia's defense ministry says it has shot down three Ukrainian aerial drones over Istra, Moscow, and over the Kaluga and Tver regions near Moscow. (Al Jazeera) Governor of Bryansk Oblast Alexander Bogomaz says border guards and security services prevented an attempt");
System.out.println(" by an Ukrainian sabotage and reconnaissance group to cross into Russia. (Al Arabiya) Foreign involvement in the Russian invasion of Ukraine The Cuban foreign ministry says criminal proceedings have been initiated against a recruiting group primarily seeking to enlist Cuban citizens residing in Russ");
System.out.println("ia to fight for the country in Ukraine as mercenary activities are prohibited in Cuba, and reiterated that it was not part of the war. (The Guardian) (New York Times) Russia's defense ministry says it destroyed four Ukrainian military boats carrying troops in the Black Sea travelling in the directio");
System.out.println("n of Cape Tarkhankut on the Crimean coast. (Al Jazeera) Russia's defense ministry says it repelled a Ukrainian aerial drone attack over the Black Sea. (Al Jazeera)"); 
                     break;
case 6:
System.out.println("September 2023 Kostiantynivka missile strike At least 15 people are killed and 30 others are injured in a missile strike on a marketplace in Kostiantynivka, Donetsk Oblast Kyiv blamed the attack on Russia, who denied involvement in the attack. An investigation by the New York Times found evidence wh");
System.out.println("ich suggested a Ukrainian 9M38 missile fired by a mobile Buk antiaircraft vehicle was responsible for the strike. (New York Times) Military aid to Ukraine during the Russo-Ukrainian War The United States announces a $175 million aid package for Ukraine that includes depleted uranium ammunition for t");
System.out.println("he first time, intended for use with Abrams tanks. (CBS News) British Defence Secretary Grant Shapps confirms reports by Russian officials that a Challenger 2 tank was destroyed in Ukraine, marking the first loss of the model on the battlefield. (The Kyiv Independent) Russian pilot Maxim Kuzminov, w");
System.out.println("ho defected to Ukraine with a MI-8 helicopter, receives a $500,000 reward for defecting. (Al Jazeera) The Romanian Ministry of National Defence confirms that debris from a Russian drone has been found on Romanian territory in Tulcea County. Romania denied claims that drones launched by Russia explod");
System.out.println("ed on Romanian territory. (AP)"); 
                     break;
case 7:
System.out.println("Eastern Ukraine campaign Ukrainian forces enter the deserted villages of Stroivka and Topoli at the Russia–Ukraine border in Kharkiv Oblast. The villages were abandoned by Russia after the 2022 Kharkiv counteroffensive but Ukraine was previously unable to enter the villages due to the presence of mi");
System.out.println("nes in the area. (The Kyiv Independent)"); 
                     break;
case 8:
System.out.println("Russia's security services detain a man for allegedly plotting to blow up a railway in Crimea and collecting information on the deployment of Russian defense ministry facilities and units. (Al Jazeera) 2023 Russian elections Russia says that its air defense systems shot down two Ukrainian drones tha");
System.out.println("t were attempting to attack a polling station in Skadovsk, Kherson Oblast, while voting was occurring. (Al Jazeera)"); 
                     break;
case 9:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency warns of a nuclear threat at the Zaporizhzhia Nuclear Power Plant after explosions were heard near the plant amidst the Ukrainian counteroffensive. (PBS News)"); 
                     break;
case 10:
System.out.println("Russia says its air defence shot down three Ukrainian drones over Crimea, one in the northwest and two in the west of the peninsula. (Reuters) Two foreign aid workers are killed and two others are injured by Russian shelling near Chasiv Yar, Donetsk Oblast. (AP)"); 
                     break;
case 11:
                     System.out.println("Ukraine says that it has recaptured from Russia four Black Sea oil platforms known as the Boyko Towers in Crimea. (Politico) (The New York Times)");
                     break;
case 12:
                     System.out.println("\nNothing significant to report");
                     break;
case 13:
System.out.println("2023 Ukrainian counteroffensive Rosatom chief Alexei Likhachev says Ukraine launched a drone strike on Enerhodar near the Zaporizhzhia nuclear plant with all six drones being destroyed. (Reuters) Crimea attacks Russia says that at least 24 people were injured in Ukrainian missile strikes in Sevastop");
System.out.println("ol and two boats were damaged in the attack. Ukraine claims to have destroyed the Russian landing ship Minsk, submarine B-237 and a KC-701-class patrol boat of the Russian Navy's Black Sea Fleet. (AP) (Reuters) (MSN)"); 
                     break;
case 14:
System.out.println("Crimea attacks Russia's defence ministry says that it destroyed a Ukrainian boat in the Black Sea. (Al Jazeera)"); 
                     break;
case 15:
                     System.out.println("Ukraine claims that it has recaptured the village of Andriivka, near Bakhmut, in Donetsk Oblast. Russia denied the claim and said its forces remained in control of village. (Al Jazeera)(AP)");
                     break;
case 16:
                     System.out.println("\nNothing significant to report");
                     break;
case 17:
System.out.println("2023 Ukrainian counteroffensive Ukraine says that it has recaptured the village of Klishchiivka, near Bakhmut, in Donetsk Oblast. (Reuters)"); 
                     break;
case 18:
                     System.out.println("Russia announces that it will withdraw from the Barents Euro-Arctic Council, citing a lack of cooperation between the members of the council. (Bloomberg)");
                     break;
case 19:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Nine people are killed in Russian attacks across Ukraine, including six civilians in Kupiansk, Kharkiv Oblast. (Reuters) "); 
                     break;
case 20:
System.out.println("Polish Prime Minister Mateusz Morawiecki announces that Poland will stop supplying Ukraine with weapons, amid tensions between the two countries over the former's import ban on Ukrainian agricultural products. (CNN) Vasyl Zvarych, Ukrainian Ambassador to Poland, is summoned by the Polish Foreign Min");
System.out.println("istry to convey its strong protest over the statement of President Volodymyr Zelenskyy at the United Nations General Assembly. Zelenskyy's statement that some European countries' actions indirectly help Russia, drew condemnation from Poland. (Ukrainian News)"); 
                     break;
case 21:
                     System.out.println("At least two civilians are killed and 21 others are injured in Russian missile strikes across Ukraine. (AP)");
                     break;
case 22:
System.out.println("Crimea attacks 2023 missile strike on the Sevastopol Naval Base The headquarters of the Black Sea Fleet in Sevastopol, Crimea, is hit in a Ukrainian missile attack, killing at least one person and causing a fire in the building. (Al Jazeera) "); 
                     break;
case 23:
                     System.out.println("\nNothing significant to report");
                     break;
case 24:
                     System.out.println("Canadian Speaker of the House Anthony Rota apologizes for inviting Yaroslav Hunka to Parliament during a visit by Ukrainian president Volodymyr Zelenskyy after it was revealed that he had fought for the Galicia Division under Nazi command. (BBC)");
                     break;
case 25:
                     System.out.println("Ukraine receives its first shipment of M1 Abrams tanks from the United States. (RFE/RL)");
                     break;
case 26:
                     System.out.println("\nNothing significant to report");
                     break;
case 27:
                     System.out.println("\nNothing significant to report");
                     break;
case 28:
                     System.out.println("\nNothing significant to report");
                     break;
case 29:
                     System.out.println("\nNothing significant to report");
                     break;
case 30:
                     System.out.println("\nNothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 10:
                    System.out.println("1. Enter a day in October 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("\nNothing significant to report");
                     break;
case 2:
                     System.out.println("For the first time in the history of the European Union, representatives of all EU states, most of them foreign ministers, meet informally outside the EU. They meet with the Ukrainian government in Kyiv and assure it of their further support. (Euronews)");
                     break;
case 3:
                     System.out.println("Kharkiv Mayor Ihor Terekhov announces the construction of Ukraine's first underground school to protect students from missile strikes. (Tagesschau)");
                     break;
case 4:
System.out.println("Protests against the Russian invasion of Ukraine Russian journalist Marina Ovsyannikova is sentenced to eight and a half years in prison in absentia for interrupting a news broadcast with anti-war slogans. (Reuters) Around 11 anti-war protesters involved with Code Pink are arrested outside the offic");
System.out.println("e of U.S. Senator Bernie Sanders after calling for the Biden administration to bring an end to the war. (The Hill)"); 
                     break;
case 5:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Hroza missile attack Ukraine says that Russia has attacked a store and cafe in Hroza, Kharkiv Oblast, with a ballistic missile, killing at least 51 civilians. (AP) Russia says that a child has been killed and three others are injured while tryi");
System.out.println("ng to dismantle cluster munitions fired from Ukrainian forces, in the occupied city of Horlivka. (Al Jazeera) Military aid to Ukraine during the Russo-Ukrainian War The United States transfers 1.1 million rounds of Iranian ammunition to Ukraine after the U.S. Navy seized them from a shipment enroute");
System.out.println(" to Yemen in December. (BBC News) German Chancellor Olaf Scholz pledges a second Patriot air defense system to Ukraine. (Spiegel) Russia announces the successful test of the Burevestnik, a nuclear-powered and nuclear-capable cruise missile with a potential range of thousands of miles. (Reuters)"); 
                     break;
case 6:
                     System.out.println("\nNothing significant to report");
                     break;
case 7:
                     System.out.println("\nNothing significant to report");
                     break;
case 8:
                     System.out.println("\nNothing significant to report");
                     break;
case 9:
                     System.out.println("\nNothing significant to report");
                     break;
case 10:
                     System.out.println("\nNothing significant to report");
                     break;
case 11:
                     System.out.println("\nNothing significant to report");
                     break;
case 12:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Three people are killed and two others are injured in Belgorod Oblast, Russia, after debris from a downed Ukrainian drone hit several houses. (Al Jazeera) Battle of Avdiivka Ukraine says that Russia has begun an assault on the city of Avdiivka");
System.out.println(", in Donetsk Oblast, supported by tanks and armored vehicles. (The New York Times)"); 
                     break;
case 13:
                     System.out.println("\nNothing significant to report");
                     break;
case 14:
                     System.out.println("\nNothing significant to report");
                     break;
case 15:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian attacks across Ukraine over a 24-hour period kill at least six people, including two civilians in Kherson, which was bombarded with over 100 shells by Russian forces. In a separate incident, a 14-year-old boy is killed by a land mine in");
System.out.println(" Mykolaiv Oblast. (AP)"); 
                     break;
case 16:
                     System.out.println("\nNothing significant to report");
                     break;
case 17:
System.out.println("2023 Ukrainian counteroffensive Ukraine launches ATACMS tactical ballistic missiles at Russian bases in Berdiansk and Luhansk, saying that they destroyed nine helicopters and a supply depot and killed several Russian military personnel. (BBC News) (AP) International relations  Hungary–Russia relatio");
System.out.println("ns Hungarian Prime Minister Viktor Orbán and Russian President Vladimir Putin hold talks at the Belt and Road Initiative forum in Beijing, China. (AP) Russia and weapons of mass destruction The State Duma votes unanimously to revoke Russia's ratification of the Comprehensive Nuclear-Test-Ban Treaty.");
System.out.println(" (AFP via The Moscow Times)"); 
                     break;
case 18:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian missile strikes across Ukraine, kill at least 10 people, including five civilians in a strike on an apartment building in Zaporizhzhia, according to Ukrainian officials. (Reuters) (The New York Times) Military aid to Ukraine during the ");
System.out.println("Russo-Ukrainian War, Russia–United States relations Russia says that the U.S. decision to supply Ukraine with long-range ATACMS tactical ballistic missiles is a grave mistake which will have serious consequences. Ukrainian forces used the missiles in combat for the first time yesterday. (Reuters)"); 
                     break;
case 19:
                     System.out.println("\nNothing significant to report");
                     break;
case 20:
System.out.println("Battle of Avdiivka Ukrainian forces repel Russian forces from Avdiivka, Donetsk Oblast, saying it has destroyed at least 175 vehicles, including 55 tanks. (Forbes)"); 
                     break;
case 21:
                     System.out.println("A Russian missile strike on a postal office in Kharkiv kills 6 workers and injures 16 others. (BBC)");
                     break;
case 22:
                     System.out.println("\nNothing significant to report");
                     break;
case 23:
                     System.out.println("Turkish president Recep Tayyip Erdoğan submits a bill on granting Sweden membership into NATO to the Grand National Assembly. (Al Jazeera)");
                     break;
case 24:
                     System.out.println("\nNothing significant to report");
                     break;
case 25:
                     System.out.println("The Russian Federation Council unanimously approves the State Duma's bill to revoke Russia's membership in the Comprehensive Nuclear-Test-Ban Treaty. (The Guardian)");
                     break;
case 26:
System.out.println("Eastern Ukraine campaign U.S. National Security Council spokesperson John Kirby reports that the Russian Armed Forces execute insubordinate personnel during its offensive in eastern Ukraine. (AFP via Politiko)"); 
                     break;
case 27:
System.out.println("Crimea attacks Pro-Russian official Oleg Tsaryov is critically injured in an assassination attempt by unknown assailants in Crimea and is reported to be in intensive care. (Reuters)"); 
                     break;
case 28:
                     System.out.println("\nNothing significant to report");
                     break;
case 29:
System.out.println("Crimea attacks Russia says that it has shot down 36 Ukrainian drones over the Black Sea and the Crimea. (DW)"); 
                     break;
case 30:
                     System.out.println("\nNothing significant to report");
                     break;
case 31:
                     System.out.println("Ukraine launches airstrikes on Crimea, destroying a Russian S-300 missile system near Yevpatoria. (The Kyiv Post)");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 11:
                    System.out.println("1. Enter a day in November 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("South Korea's National Intelligence Service reports that North Korea has supplied Russia with over one million rounds of artillery shells for its ongoing invasion of Ukraine. (Al Jazeera) Russian strikes against Ukrainian infrastructure Russia strikes 118 Ukrainian towns and villages with artillery,");
System.out.println(" missiles, and drones over a 24-hour period, the most in a single day this year. More than 40 attacks are reported in Avdiivka. (BBC News)"); 
                     break;
case 2:
System.out.println("Italian Prime Minister Giorgia Meloni states that European leaders are tired of the war in Ukraine and want to broker a deal with the Kremlin, saying that we need a way out during a phone call in which she thought she was talking with a senior African Union official, but was actually speaking to Rus");
System.out.println("sian comedians Vovan and Lexus. (The Telegraph) Russia and weapons of mass destruction Russian President Vladimir Putin signs a law formally withdrawing Russia's ratification of the Comprehensive Nuclear-Test-Ban Treaty. However, Russia maintains that it will not resume nuclear weapons testing unles");
System.out.println("s the United States also resumes testing. (Reuters)"); 
                     break;
case 3:
System.out.println("Southern Ukraine campaign A Russian missile strike kills more than 20 Ukrainian soldiers at an awards ceremony near the front line in Zaporizhzhia Oblast. President Volodymyr Zelenskyy says the incident could have been avoided amid anger over the losses. (BBC News)"); 
                     break;
case 4:
System.out.println("Crimea attacks Ukrainian forces strike Zalyv Shipbuilding yard in the Russian-occupied Kerch, Crimea, with cruise missiles, damaging the Russian corvette Askold [ru]. (Reuters)"); 
                     break;
case 5:
                     System.out.println("\nNothing significant to report");
                     break;
case 6:
System.out.println(" Russian forces attack Odesa with drones and missiles, injuring at least eight people and damaging infrastructure, including the Odesa Fine Arts Museum. (Reuters)"); 
                     break;
case 7:
                     System.out.println("\nNothing significant to report");
                     break;
case 8:
System.out.println("Southern Ukraine campaign A Russian missile strike on a Liberian-flagged vessel entering the Pivdennyi Port in Odesa Oblast kills one crew member and injures four others. The vessel was being used to transport iron ore to China. (Reuters)"); 
                     break;
case 9:
                     System.out.println("\nNothing significant to report");
                     break;
case 10:
                     System.out.println("\nNothing significant to report");
                     break;
case 11:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches its first missile attacks against Kyiv in 52 days. Most of the ballistic missiles are intercepted by Ukrainian air defences. No casualties are reported. (Reuters) Ukraine–NATO relations Former NATO Secretary General Anders Fogh Rasmuss");
System.out.println("en puts forward a proposal for Ukraine to join the military alliance but without the territories occupied by Russia. (The Guardian)"); 
                     break;
case 12:
                     System.out.println("\nNothing significant to report");
                     break;
case 13:
                     System.out.println("\nNothing significant to report");
                     break;
case 14:
                     System.out.println("\nNothing significant to report");
                     break;
case 15:
System.out.println("Southern Ukraine campaign A Russian missile strike kills two emergency workers and injures seven others in Zaporizhzhia Oblast, Ukraine. (Reuters)"); 
                     break;
case 16:
                     System.out.println("Russian activist Aleksandra Skochilenko is sentenced to seven years in prison on charges related to her protest of the Russian invasion of Ukraine. (The Guardian)");
                     break;
case 17:
                     System.out.println("\nNothing significant to report");
                     break;
case 18:
                     System.out.println("\nNothing significant to report");
                     break;
case 19:
System.out.println("Eastern Ukraine campaign The Ukrainian military shells Russian-occupied Kalmiuske Raion, Donetsk Oblast, striking a dance hall in Kumachove during a performance, killing about 20 Russian troops and Russian actress Polina Menshikh. (BBC News) "); 
                     break;
case 20:
                     System.out.println("\nNothing significant to report");
                     break;
case 21:
System.out.println("Casualties of the Russo-Ukrainian War The United Nations Human Rights Office says that more than 10,000 civilians have been killed in Ukraine since the Russian invasion in February 2022, though it expects the actual death toll to be significantly higher. (Reuters)"); 
                     break;
case 22:
                     System.out.println("Finnish Prime Minister Petteri Orpo announces that Finland will close all but the northernmost border crossing with Russia, amid an increase in asylum seekers entering Finland via Russia. (Reuters)");
                     break;
case 23:
System.out.println("Southern Ukraine campaign A Russian cluster munition strike in Chornobaivka, Kherson, kills at least three civilians. Five people are also injured by Russian artillery shelling with more than 60 residential buildings reportedly damaged. (AP via ABC News)"); 
                     break;
case 24:
                     System.out.println("\nNothing significant to report");
                     break;
case 25:
                     System.out.println("Russia launches 75 drones against Ukraine from two directions, Primorsko-Akhtarsk and the Kursk region. In response, Ukraine launches 20 drones against Russia, including the capital, Moscow. (CNN) (Reuters) (AP)");
                     break;
case 26:
                     System.out.println("\nNothing significant to report");
                     break;
case 27:
                     System.out.println("\nNothing significant to report");
                     break;
case 28:
System.out.println("Eastern Ukraine campaign Battle of Avdiivka Russian forces advance on all sides of Avdiivka in Donetsk Oblast, Ukraine as they move to encircle the city. Heavy fighting is reported for control of the Avdiivka Coke Plant. (Reuters) (The Independent)"); 
                     break;
case 29:
                     System.out.println("\nNothing significant to report");
                     break;
case 30:
                     System.out.println("Ukraine says its special forces bombed a freight train as it was passing through the Severomuysky Tunnel in Buryatia, Russia. Russia's Investigative Committee acknowledges an explosion and fire inside the tunnel, and says that a preliminary probe is underway to determine the cause. (Reuters)");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 12:
                    System.out.println("1. Enter a day in December 2023:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("The International Committee of the Red Cross suspends the Belarus Red Cross after its Secretary General Dzmitry Shautsou refuses to resign following statements that the organization was involved in bringing Ukrainian children to Belarus for health improvement purposes. (AP) (Nasha Niva)");
                     break;
case 2:
                     System.out.println("\nNothing significant to report");
                     break;
case 3:
                     System.out.println("\nNothing significant to report");
                     break;
case 4:
System.out.println("Eastern Ukraine campaign Battle of Marinka The British Defense Ministry reports that Russia likely controls most of Marinka in Donetsk Oblast. (Kyiv Independent via Yahoo News) Foreign involvement in the Russian invasion of Ukraine The White House says that United States Congress funds designated fo");
System.out.println("r providing aid to Ukraine would run out by the end of the year, due to opposition from members of the Republican Party, in a letter made available to the public. (Al Jazeera) The Financial Times reports that the European Union is facing difficulties in agreeing on a new aid package, due to oppositi");
System.out.println("on from Hungary. (Al Jazeera) President of Bulgaria Rumen Radev vetoes a proposed agreement to provide Ukraine with armored vehicles, returning the agreement to parliament. (Kyiv Independent) Russian generals killed during the Russian invasion of Ukraine Voronezh Oblast governor Aleksandr Gusev anno");
System.out.println("unces the death of major general Vladimir Zavadsky, deputy commander of the 14th Army Corps, at his combat post in Ukraine. (Reuters)"); 
                     break;
case 5:
                     System.out.println("\nNothing significant to report");
                     break;
case 6:
System.out.println("Foreign involvement in the Russian invasion of Ukraine The United States Senate blocks a supplemental funding bill that included financial aid for Ukraine. (The Guardian) International sanctions during the Russian invasion of Ukraine 2022 Russian crude oil price cap sanctions Politico reports that e");
System.out.println("fforts to cap Russia's oil revenues has essentially failed, due to widespread circumvention, loopholes and the ongoing fuel business. (Politico) In October, Russia earned $11.3 billion from oil exports, exceeding the amount earned prior to the start of the war. (Bloomberg) G7 nations agree to impose");
System.out.println(" trade restrictions on non-industrial diamonds from Russia. (AFP via RFI)"); 
                     break;
case 7:
                     System.out.println("\nNothing significant to report");
                     break;
case 8:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches 19 cruise missiles from Tu-95s at Ukrainian cities, including the capital Kyiv, killing at least one civilian in Dnipropetrovsk Oblast and injuring several others. At least 14 missiles are intercepted. (Reuters) Military aid to Ukraine");
System.out.println(" The Kiel Institute reports that pledges of aid to Ukraine have significantly decreased, reaching their lowest level since the beginning of the war. The amount of aid pledged to Ukraine has dropped by nearly 90% compared to the same period in 2022. (Al Jazeera)"); 
                     break;
case 9:
                     System.out.println("\nNothing significant to report");
                     break;
case 10:
                     System.out.println("\nNothing significant to report");
                     break;
case 11:
System.out.println("Representatives of Prime Minister of Hungary Viktor Orbán meet with United States Republicans in Washington to discuss ending EU and US military support to Ukraine. (WION) The United Kingdom announces that it will donate two Royal Navy Sandown-class minehunters to Ukraine. Doubts are raised over the");
System.out.println(" logistics and timing of their arrival, with Turkey controlling access to the Black Sea through the Bosphorus. (BBC News) United States Senator JD Vance says that Ukraine should be willing to give up part of its territory to end the war. Vance and other Republicans have opposed the aid package propo");
System.out.println("sed in the United States Congress for Ukraine. (The Guardian)"); 
                     break;
case 12:
                     System.out.println("\nNothing significant to report");
                     break;
case 13:
System.out.println("A Russian ballistic missile attack in Kyiv injures over 50 people. (The Guardian) "); 
                     break;
case 14:
                     System.out.println("Romania says that a Russian drone has crashed in its territory, leaving a crater in Grindu, Tulcea, near the Ukrainian border. Romanian Air Force F-16s and German Air Force Eurofighter Typhoons conducted joint patrols in response to the violation of NATO airspace. (Reuters)");
                     break;
case 15:
                     System.out.println("\nNothing significant to report");
                     break;
case 16:
                     System.out.println("Russia says that two civilians are killed and two others are injured in a Ukrainian missile strike on the Russian-occupied village of Nova Maiachka in Kherson Raion. (AFP via Al Arabiya)");
                     break;
case 17:
                     System.out.println("\nNothing significant to report");
                     break;
case 18:
                     System.out.println("\nNothing significant to report");
                     break;
case 19:
                     System.out.println("\nNothing significant to report");
                     break;
case 20:
                     System.out.println("\nNothing significant to report");
                     break;
case 21:
                     System.out.println("\nNothing significant to report");
                     break;
case 22:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches a mass drone attack on Kyiv, Ukraine, striking multiple residential districts. A block of flats is damaged in Solomianskyi District, injuring at least two people, and heavy damage is also reported in Holosiivskyi District. (Reuters)"); 
                     break;
case 23:
                     System.out.println("\nNothing significant to report");
                     break;
case 24:
                     System.out.println("\nNothing significant to report");
                     break;
case 25:
                     System.out.println("\nNothing significant to report");
                     break;
case 26:
System.out.println("Eastern Ukraine campaign Battle of Marinka Ukraine's commander-in-chief Valerii Zaluzhnyi confirms the loss of the city of Marinka to Russian forces. (BBC News) (The New York Times) Crimea attacks The Russian Ropucha-class landing ship Novocherkassk is destroyed by a Ukrainian airstrike in Feodosia,");
System.out.println(" Crimea, killing at least one person and injuring four others. (Al Jazeera) (AP)"); 
                     break;
case 27:
System.out.println("Russian strikes against infrastructure Russian drone and artillery strikes kill at least five people and cause power outages for around 70% of households in Kherson, according to Kherson governor Oleksandr Prokudin. (AP)"); 
                     break;
case 28:
System.out.println("Southern Ukraine campaign Greek-owned cargo ship Vyssos travelling to Ukraine hits a Russian naval mine in the Black Sea, injuring three crew members, Ukraine says. (BBC News) (Xinhua)"); 
                     break;
case 29:
System.out.println("29 December 2023 Russian strikes on Ukraine Russia launches the largest wave of drones and missiles on Ukrainian cities since the start of the war in a widespread overnight assault across the country, killing at least 39 people and injuring at least 160 others. (AP) (Ukrainian Pravda) One of the Rus");
System.out.println("sian cruise missiles enters NATO airspace as it travels over Polish territory, prompting the Polish government to summon the Russian charge d'affaires for an explanation. (Reuters) (Bloomberg) "); 
                     break;
case 30:
System.out.println("30 December 2023 Belgorod shelling Ukraine launches drone and missile strikes against the city of Belgorod, Russia, killing 25 people, and injuring 110 others, according to the Russian Defense Ministry. (AP) (BBC News) Russian invasion of Ukraine Bombing of Kharkiv Russian forces attack Kharkiv with");
System.out.println(" missiles, injuring at least 16 people, including a foreign journalist, and damaging civilian infrastructure. (The Kyiv Independent)"); 
                     break;
case 31:
                     System.out.println("Russian forces bombard Kharkiv. Ukrainian authorities say that 26 people were injured and many residential buildings in the city center were destroyed. The Ukrainian Air Force reports shooting down 21 of 49 attacking drones. (tagesschau.de) (tagesschau.de 2)");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;


                 }
                 break;
case 2024:
                 //month in 2024
                 
                 System.out.println("1. Enter a month in 2024(1-January,2-February,....,12-December):");
                 month=s.nextInt();
                 switch(month){
                    //day in 2024
case 1:
                    System.out.println("1. Enter a day in January 2024 :");
                    day=s.nextInt();
                      switch(day){
case 1:
                        System.out.println("Nothing significant to report ");
                        break;
case 2:
System.out.println("Russian strikes against infrastructure 2 January 2024 Russian strikes on Ukraine Four civilians are killed and nearly 100 others are injured by a Russian missile attack in Kharkiv and at least 27 civilians are injured by a Russian missile attack in Kyiv. (AP)"); 
                        break;
case 3:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Turkey–Ukraine relations Turkey denies access to the Black Sea for two Royal Navy minehunters saying their transit of the Bosporus and Dardanelles straits would be in violation of the Montreux Convention of 1936. (The Independent) Ukraine and R");
System.out.println("ussia complete their first prisoner exchange in nearly five months, releasing over 200 people on each side, facilitated by mediation from the United Arab Emirates. (Reuters)"); 
                        break;
case 4:
                        System.out.println("Russian President Vladimir Putin issues a decree granting Russian citizenship to foreigners who fight for Russia in the war against Ukraine,");
                        break;
case 5:
                        System.out.println("Nepal suspends the issuance of permits to its citizens to work in Russia and Ukraine after 10 Nepalis are killed while serving in the Russian Army. (Reuters)");
                        break;
case 6:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces attack Pokrovsk Raion, Donetsk Oblast, with S-300 missiles according to local authorities, killing at least 11 people, including five children, and injuring eight others. (CNN) "); 
                        break;
case 7:
                        System.out.println("Nothing significant to report");
                        break;
case 8:
                        System.out.println("Russia launches a massive missile and drone attack across Ukraine, killing at least four people and injuring 38 others in Dnipropetrovsk, Kharkiv, Khmelnytskyi and Zaporizhzhia Oblasts. Ukraine says that it shot down all eight drones and 18 of 51 missiles. (AP) (Reuters)");
                        break;
case 9:
                        System.out.println("Nothing significant to report");
                        break;
case 10:
                        System.out.println("Nothing significant to report");
                        break;
case 11:
                        System.out.println("Nothing significant to report");
                        break;
case 12:
System.out.println("Russian invasion of Ukraine, Ukraine–United Kingdom relations British prime minister Rishi Sunak visits Kyiv to reiterate his support for Ukraine. (The Washington Post) (GOV.UK)"); 
                        break;
case 13:
                        System.out.println("Nothing significant to report");
                        break;
case 14:
                        System.out.println("Nothing significant to report");
                        break;
case 15:
System.out.println("Southern Ukraine campaign Ukraine claims it shot down a Russian Beriev A-50 airborne early warning and control aircraft and an Ilyushin Il-22 airborne control center over the Sea of Azov. (CNN)"); 
                        break;
case 16:
                        System.out.println("Seventeen people are injured in a Russian missile strike on a residential area in Kharkiv, Ukraine. (Reuters)");
                        break;
case 17:
                        System.out.println("Ukraine says that it struck an oil terminal in Saint Petersburg, Russia, with a domestic-produced long-range drone, as part of a new campaign against strategic targets inside Russian territory. However, Russia reports that the attack failed. (Reuters)");
                        break;
case 18:
                        System.out.println("Nothing significant to report");
                        break;
case 19:
                        System.out.println("Nothing significant to report");
                        break;
case 20:
System.out.println("The Ust-Luga Multimodal Complex in Leningrad Oblast is hit by a drone attack, causing a large fire. Russian gas producer Novatek subsequently suspends all operations at the complex in response to the attack. Ukraine claims responsibility. (NOS) (Reuters) (Kyiv Post) Eastern Ukraine campaign\n At lea");
System.out.println("st 27 people are killed by alleged Ukrainian artillery strikes on Donetsk, according to Russian-appointed local officials. Donetsk People's Republic leader Denis Pushilin declares a day of mourning in response. Ukraine denies responsibility.(AP) (Reuters) "); 
                        break;
case 21:
System.out.println("Russian invasion of Ukraine President of Ukraine Volodymyr Zelenskyy signs a decree recognizing some Russian territories, including parts of Bryansk Oblast and Krasnodar Krai, as historically inhabited by Ukrainians. (The Kyiv Independent)"); 
                        break;
case 22:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Six civilians are killed and at least 77 others are injured by Russian missile strikes in Kyiv and Kharkiv. Ukraine says that it shot down 21 of 41 missiles. (AP) (BBC News) Military aid to Ukraine during the Russo-Ukrainian War Germany announc");
System.out.println("es that it will donate six SH-3 Sea King helicopters to the Ukrainian Air Force to help it patrol the Black Sea. (Reuters)"); 
                        break;
case 23:
                        System.out.println("Nothing significant to report");
                        break;
case 24:
                        System.out.println("Nothing significant to report");
                        break;
case 25:
                        System.out.println("Nothing significant to report");
                        break;
case 26:
                        System.out.println("Nothing significant to report");
                        break;
case 27:
                        System.out.println("Nothing significant to report");
                        break;
case 28:
                        System.out.println("Nothing significant to report");
                        break;
case 29:
System.out.println("Russian invasion of Ukraine Russia claims control of the village of Tabaivka, but this is denied by Ukraine. (Kyiv Independent) Business and economy"); 
                        break;
case 30:
System.out.println("Eastern Ukraine campaign Ukrainian forces say that they shot down a Russian Su-34 fighter jet over Luhansk Oblast. (Kyiv Post) "); 
                        break;
case 31:
System.out.println("The Ukrainian Air Force launches a wave of Storm Shadow cruise missile strikes on Russian military infrastructure in Crimea, with explosions reported near Sevastopol International Airport. Russia says it shot down 20 Ukrainian missiles over the Black Sea. (The Telegraph) Russia and Ukraine conduct a");
System.out.println(" prisoner exchange on the border, with 195 soldiers being returned to Russia, and 207 military personnel and civilians being returned to Ukraine, respectively. The deal was facilitated by the United Arab Emirates. (BBC News)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                                 }
                                 break;
case 2:
                    System.out.println("1. Enter a day in February 2024 :");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Ukrainian unmanned surface vehicles sink the Tarantul-class missile corvette RFS Ivanovets in Donuzlav Bay. (BBC News) Southern Ukraine campaign Two French aid workers are killed in a Russian drone strike near Beryslav in Kherson Oblast, Ukraine. Four people are also injured in the strike. (BBC News");
System.out.println(") Business and economy  Humanitarian aid to Ukraine during the Russo-Ukrainian War, Ukraine–European Union relations The European Union formally approves a €50 billion financial support package for Ukraine after Hungary withdraws its veto. The package is expected to help the Ukrainian government cov");
System.out.println("er some costs of pensions and salaries over the next four years with the first funds being released in March. (BBC News) (The Economist)"); 
                        break;
case 2:
                        System.out.println("Nothing significant to report");
                        break;
case 3:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A Lukoil oil refinery in Volgograd Oblast, Russia, is attacked by Ukrainian long-range drones, causing a large fire and disrupting operations. Volgograd governor Andrey Bocharov says that the attack was repelled by air defences. (Kyiv Post) Ea");
System.out.println("stern Ukraine campaign \nAt least 28 civilians are killed by Ukrainian shelling in Russian-occupied Lysychansk, Luhansk Oblast, according to Russian-appointed local officials. The officials added that ten others were rescued after being trapped under rubble. (AP)"); 
                        break;
case 4:
                        System.out.println("Nothing significant to report");
                        break;
case 5:
                        System.out.println("Hungary's ruling party Fidesz boycotts a National Assembly session called by opposition parties to speed up the approval of Sweden's NATO membership bid. (Politico)");
                        break;
case 6:
                        System.out.println("Nothing significant to report");
                        break;
case 7:
                        System.out.println("Russian forces launch a wave of missile and drone strikes across Ukraine, killing at least five civilians and injuring 11 others, including two in Kyiv. (BBC News)");
                        break;
case 8:
System.out.println("Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy dismisses Valerii Zaluzhnyi from the post of Commander-in-Chief of the Armed Forces of Ukraine, following months of rumors about a disagreement between Zelenskyy and Zaluzhnyi. Ground Forces commander Oleksandr Syrskyi is appointed ");
System.out.println("Commander-in-Chief to replace Zaluzhnyi. (BBC News)"); 
                        break;
case 9:
                        System.out.println("Nothing significant to report");
                        break;
case 10:
                        System.out.println("Nothing significant to report");
                        break;
case 11:
                        System.out.println("Nothing significant to report");
                        break;
case 12:
                        System.out.println("Nothing significant to report");
                        break;
case 13:
System.out.println("Estonia–Russia relations Estonian Prime Minister Kaja Kallas is reportedly placed on the Russian Interior Ministry's register of wanted people due to the country's removal of Soviet war memorials, making Kallas the first known government leader to be added to a wanted list by Russian authorities. (T");
System.out.println("he Guardian)"); 
                        break;
case 14:
System.out.println("Crimea attacks Ukraine claims to have sunk the Russian ship Tsezar Kunikov off the coast of Katsiveli, Crimea. A video appears to show the vessel being struck with unmanned surface drones. (RFE/RL)"); 
                        break;
case 15:
System.out.println("The Kremlin dismisses a warning by the United States that Russia intends to imminently place nuclear weapons in space as a 'malicious fabrication'. The claims were widely circulated yesterday by ABC News and the New York Times after U.S. House Speaker Mike Johnson warned of a 'serious national secur");
System.out.println("ity threat'. (Reuters) (Reuters 2) Reuters reports that it is highly unlikely that Russia intends to put a nuclear warhead in space. The antisatellite weapon is more likely a nuclear-powered space-based device that utilizes electronic warfare to blind, jam or fry the electronics inside targets. (Reu");
System.out.println("ters)"); 
                        break;
case 16:
System.out.println("Battle of Avdiivka Ukraine announces the withdrawal of its troops from positions in the south of Avdiivka amid heavy clashes with Russian forces for control of the city. The withdrawal comes a day after Russian soldiers entered the city from multiple directions. (Kyiv Post)"); 
                        break;
case 17:
System.out.println("Battle of Avdiivka Commander-in-Chief Oleksandr Syrskyi announces the full withdrawal of Ukrainian forces from Avdiivka, following months of heavy fighting and Russian attempts to capture the city. (The Kyiv Independent)"); 
                        break;
case 18:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Prime Minister of Denmark Mette Frederiksen announces that the country will donate all of its artillery shells to Ukraine. (The Telegraph)"); 
                        break;
case 19:
                        System.out.println("Nothing significant to report");
                        break;
case 20:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Sweden donates its largest military aid package to Ukraine to date with a further $680 million in aid. (Reuters)"); 
                        break;
case 21:
                        System.out.println("Nothing significant to report");
                        
                        break;
case 22:
                        System.out.println("Nothing significant to report");
                        break;
case 23:
System.out.println("Ukraine claims responsibility for the downing of a Russian Beriev A-50 over Krasnodar Krai, Russia, which is their second downing of an A-50 this year. (Kyiv Independent) (Business Insider) "); 
                        break;
case 24:
                        System.out.println("Nothing significant to report");
                        break;
case 25:
                        System.out.println("Nothing significant to report");

                        break;
case 26:
                        System.out.println("The Hungarian parliament approves Sweden's accession into NATO. (BBC News)");
                        break;
case 27:
System.out.println("Eastern Ukraine campaign The Ukrainian military withdraws from the villages of Sieverne and Stepove near Avdiivka, Donetsk Oblast, following the announcement of its withdrawal from the nearby village of Lastochkyne on February 26. (Reuters)"); 
                        break;
case 28:
                        System.out.println("Russia announces that it will take retaliatory military-technical steps in response to Sweden joining NATO. (Al Arabiya)");
                        break;
case 29:
                        System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 29:");
                    }
                    break;
case 3:
                    System.out.println("1. Enter a day in March:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
System.out.println("Russian invasion of Ukraine Bombing of Odesa Eight people, including two children, are killed and eight others are injured in a Russian drone strike on an apartment block in Odesa, Ukraine. (Ukrinform)"); 
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("Russian invasion of Ukraine The Russian Navy patrol ship Sergey Kotov is sunk in the Black Sea after being struck by Ukrainian MAGURA V5 naval drones. (The Guardian)\nThe International Criminal Court issues arrest warrants for Sergey Kobylash, the commander of the Long-Range Aviation of the Russian ");
System.out.println("Aerospace Forces, and Viktor Sokolov, the commander of the Black Sea Fleet, for their involvement in Russian strikes against Ukrainian infrastructure. (Reuters)"); 
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("Sweden–NATO relations Sweden officially joins NATO, becoming its 32nd member. (Reuters) (NATO) Lithuania–Russia relations Lithuania strips Russian ballerina Ilze Liepa of her Lithuanian citizenship after she openly shows her sympathies for President Vladimir Putin. (The Moscow Times) Ukraine–United ");
System.out.println("Kingdom relations Former Ukrainian Chief of Staff Valerii Zaluzhnyi is appointed Ukrainian ambassador to the United Kingdom by President Volodymyr Zelenskyy. (Reuters)"); 
                     break;
case 8:
                     System.out.println("Nothing significant to report");
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
                     System.out.println("Nothing significant to report");
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
System.out.println("The Freedom of Russia Legion, the Sibir Battalion, and the Russian Volunteer Corps enter Belgorod and Kursk oblasts. Russia claims to have repelled the attacks. (The Guardian) Ukraine launches 25 drones at Russian cities, hitting a major oil refinery in Nizhny Novgorod Oblast. (The Guardian) 2024 Iv");
System.out.println("anovo Ilyushin Il-76 crash A Russian Aerospace Forces Ilyushin Il-76 military transport plane with 15 people on board crashes in Ivanovo Oblast, Russia. (The Guardian) Bombing of Kryvyi Rih Three people are killed and at least 36 others are injured in a Russian missile strike on apartment buildings ");
System.out.println("in Kryvyi Rih, Dnipropetrovsk Oblast, Ukraine. (Reuters)"); 
                     break;
case 13:
System.out.println("Ukraine launches a wave of drone strikes in Russia for a second consecutive day, causing a fire at a Rosneft oil refinery in Ryazan Oblast, while a Ukrainian drone is reportedly shot down near Kirishi refinery in Leningrad Oblast. Russian President Vladimir Putin says the attacks are an attempt to d");
System.out.println("isrupt the upcoming presidential election. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Two people are killed and at least eight others are injured in a Russian drone attack on an apartment building in Sumy. (The Kyiv Independent) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an War The European Union agrees to provide an additional €5 billion to their Ukrainian military aid fund. (Reuters) "); 
                     break;
case 14:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A civilian is killed and three others are injured by airstrikes launched by Ukraine in Belgorod Oblast, Russia. (TASS) Zaporizhzhia Nuclear Power Plant crisis Russian-installed officials at the Zaporizhzhia Nuclear Power Plant in Enerhodar, Uk");
System.out.println("raine, say that shelling has hit critical infrastructure at the plant and that 'such attacks are unacceptable'. (Reuters)"); 
                     break;
case 15:
System.out.println("Odesa strikes At least 20 people are killed and at least 73 others are injured in a Russian double tap missile strike in Odesa, Ukraine. (CNN)\n2024 Russian presidential election Voters elect the next president of Russia. Incumbent president Vladimir Putin is seeking a fifth term in office. (TASS)"); 
                     break;
case 16:
System.out.println("Russian invasion of Ukraine Attacks in Russia during the Russian invasion of Ukraine Russia says that two civilians have been killed by Ukrainian shelling in the city of Belgorod. (AP)"); 
                     break;
case 17:
System.out.println("Northern Ukraine skirmishes Ukraine says that three Russian sabotage groups have been intercepted in Sumy Oblast. (The Kyiv Independent)"); 
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
System.out.println("Russia claims to have captured the village of Orlivka in Donetsk Oblast, Ukraine. (Anadolu Agency) "); 
                     break;
case 20:
System.out.println("Kharkiv strikes A Russian missile strike kills at least five people and injures eight others in an industrial area of Kharkiv, Ukraine. (Reuters) "); 
                     break;
case 21:
System.out.println("The Russian Ministry of Defence announces that its forces have captured the Ukrainian village of Tonenke in Donetsk Oblast. (Al Arabiya) Kyiv strikes Russia launches a massive attack on Kyiv and the surrounding region with ballistic and cruise missiles, injuring at least 17 people. (CNN) Mykolaiv st");
System.out.println("rikes At least one civilian is killed and four others are injured in a Russian ballistic missile attack on Mykolaiv, Ukraine. (Reuters)"); 
                     break;
case 22:
System.out.println("March 2024 Ukraine missile strikes Russia launches dozens of ballistic missiles at Ukrainian cities for a second consecutive day with reports of power outages in Kharkiv after critical infrastructure was damaged. At least eight missile strikes on Zaporizhzhia are reported, while a 'critical infrastr");
System.out.println("ucture object' is damaged in Vinnytsia. More than a million people are left without power across Ukraine due to the strikes, with five people killed and dozens more reportedly injured. (BBC News) (U.S. News & World Report) The Dnieper Hydroelectric Station in Zaporizhzhia is hit by a missile causing");
System.out.println(" extensive damage and a large fire. A trolleybus initially reported as carrying civilians was destroyed in the attack, later confirmed to have been empty apart from the driver who was killed. Shelling also damages one of the two power lines connected to the Russian-occupied Zaporizhzhia Nuclear Powe");
System.out.println("r Plant. (The Guardian) (The Kyiv Independent) The Russian government states in a press conference that the invasion of Ukraine is now a war and is no longer a 'special military operation', the official term used for the war by the Russian government. In another press conference later in the day, Kr");
System.out.println("emlin Press Secretary Dmitry Peskov tells reporters that although the invasion is a de facto war, the Russian government is not currently planning to change the invasion's de jure status as a special military operation. (NOS) (Reuters) (Meduza) Crocus City Hall attack At least 135 people, including ");
System.out.println("two attackers, are killed and more than 140 others are injured in a mass shooting at the Crocus City Hall music venue in Krasnogorsk, Moscow Oblast, Russia, with the building subsequently catching on fire following an explosion. The perpetrators remain at large after escaping in a vehicle. (Baza) (M");
System.out.println("eduza) (Baza 2) (Reuters) The Islamic State claims responsibility for the attack in a statement issued by its official Amaq News Agency. (CNN) The Freedom of Russia Legion claims that the Russian government committed the attack. (Ukrainska Pravda) The Russian government claims that the Ukrainian gov");
System.out.println("ernment committed the attack. This was denied by them, who instead claim that the attack was a false flag attack by the Russian government designed to provoke public opinion in Russia against Ukraine and allow the Russian Army to mobilize more troops in its invasion of Ukraine. (Anadolu Agency)"); 
                     break;
case 23:
System.out.println("Crimea attacks The Ukrainian Air Force launches a wave of airstrikes across Crimea, with several explosions reported in Sevastopol. Russian officials say at least ten missiles have been shot down over the peninsula, and that at least two civilians have been injured. (NDTV) Eastern Ukraine campaign T");
System.out.println("he Russian military states that it has captured the town of Ivanivske in Donetsk Oblast, Ukraine. (Barron's) Crocus City Hall attack The death toll from yesterday's terrorist attack at the Crocus City Hall music venue in Krasnogorsk, Moscow Oblast, Russia, increases to at least 137 people. Russian a");
System.out.println("uthorities report that 11 suspects, including the four assailants, have been arrested. (Reuters) (The Moscow Times) Red Sea crisis A Houthi missile hits Panamanian-flagged, Chinese-owned and operated oil tanker Huang Pu. It suffers minimal damage and a fire on board is quickly extinguished. No casua");
System.out.println("lties are reported, and the vessel resumes its course. (X) (Newsweek) (Marine Log) "); 
                     break;
case 24:
System.out.println("A Russian cruise missile violates NATO airspace over Poland, prompting the activation of aircraft from the Polish Air Force. (Reuters) (Sky News) Russian strikes against Ukrainian infrastructure Russia launches major airstrikes on Kyiv and Lviv in Western Ukraine using Kinzhal hypersonic missiles an");
System.out.println("d drones with strikes damaging ground level infrastructure at Ukraine's main gas storage site. (Reuters)"); 
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
System.out.println("Bombing of Kharkiv One person is killed, and sixteen others are injured, by Russian guided bomb strikes on Kharkiv, Ukraine. (Reuters)"); 
                     break;
case 28:
                     System.out.println("A Russian Sukhoi Su-35 crashes into the Black Sea off Sevastopol, Crimea. The pilot is reported to have safely ejected. (Reuters)");
                     break;
case 29:
System.out.println("Eastern Ukraine campaign The Telegraph reports Russia has captured approximately 195 square miles (510 km2) and is taking around 1,000 casualties per day since the start of the Second Russian winter campaign in October 2023. (The Telegraph) Russia strikes several power plants in Ukraine. (The Washin");
System.out.println("gton Post)"); 
                     break;
case 30:
                     System.out.println("Nothing significant to report");
                     break;
case 31:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 4:
                    System.out.println("1. Enter a day in April 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches airstrikes more than 1,000 kilometres (620 mi) inside Russia, targeting an oil refinery and the dormitory of a factory producing Iranian-designed Shahed drones in Yelabuga, Tatarstan. Several people are injured. (The Guardian)");
System.out.println(" (Al Jazeera)"); 
                     break;
case 3:
                     System.out.println("Ukraine lowers the age of conscription from 27 years to 25. (The Guardian) (The New York Times)");
                     break;
case 4:
System.out.println("Kharkiv strikes Russia launches multiple Shahed drone strikes on Kharkiv, Ukraine, killing at least five people, including three rescue workers, and injuring five others. (Reuters) Russian appointed officials claim that Ukrainian shelling has killed two civilians and injured nine others in Donetsk. ");
System.out.println("Separately, four people are killed in drone attacks in Russian-occupied Kherson Oblast. (Reuters) U.S Secretary of State Antony Blinken says that Ukraine will eventually become a NATO member. (Reuters)"); 
                     break;
case 5:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Doctors Without Borders office in Pokrovsk is completely destroyed by a Russian missile strike. Five civilians are injured in the attack. (The Guardian) Attacks in Russia during the Russian invasion of Ukraine Ukraine's SBU claims to have des");
System.out.println("troyed six Russian military aircraft and heavily damaged eight others in a drone attack on Morozovsk Air Base in Rostov Oblast. (Reuters) (NOS) Zaporizhzhia strikes At least three people are killed and at least 13 others are injured in a Russian double-tap missile strike in Zaporizhzhia. (The Kyiv I");
System.out.println("ndependent) (Reuters)"); 
                     break;
case 6:
System.out.println("Kharkiv strikes A Russian drone strike on Kharkiv kills eight civilians and injures ten others. At least nine high-rise buildings and a petrol station are badly damaged. (Al Jazeera) (Reuters)"); 
                     break;
case 7:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The IAEA reports that the Zaporizhzhia Nuclear Power Plant's Unit 6 was targeted by a drone strike, although nuclear safety has not been compromised, according to the statement. (IAEA)"); 
                     break;
case 8:
System.out.println("Battle of Chasiv Yar Heavy fighting between Russian and Ukrainian troops occurs around the city of Chasiv Yar, with Ukraine describing the situation as difficult and tense. (Al Jazeera) Shelling kills three civilians in Huliaipole, Zaporizhzhia Oblast. (Al Jazeera) Ukraine claims to have damaged the");
System.out.println(" Russian Navy missile ship Serpukhov in the Baltic Sea near Kaliningrad. (Kyiv Independent)"); 
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
System.out.println("Kharkiv strikes Russian airstrikes in Kharkiv Oblast kill at least three people and injure four others. (Reuters) Odesa strikes Four people are killed and seven others are injured in a Russian missile strike in Odesa. (Reuters)"); 
                     break;
case 11:
System.out.println("Mykolaiv strikes At least four people are killed and five others are injured in a Russian missile strike in Mykolaiv. (Reuters) Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, damaging power facilities and causing widespread power outages fo");
System.out.println("r about 200,000 people. Ukraine says that the Trypilska thermal power plant in Kyiv Oblast was destroyed in an overnight attack. (Reuters) (Bloomberg)"); 
                     break;
case 12:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches drone strikes across Ukraine. Critical infrastructure is damaged in Kherson Oblast and a fire occurs at the Dnieper Hydroelectric Station in Zaporizhzhia causing around half a tonne of oil products to leak into the Dnieper river. (Reut");
System.out.println("ers) (Ukrainska Pravda)"); 
                     break;
case 13:
System.out.println("Russian invasion of Ukraine The Russian Ministry of Defense claims that the village of Pervomaiske near Donetsk has been captured by Russian troops. (Barron's)"); 
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
                     System.out.println("Ukrainian President Volodymyr Zelenskyy signs a new army draft law. (Reuters)");
                     break;
case 17:
                     System.out.println("18 people are killed and 78 others are injured in a Russian missile strike which damaged an eight-storey building in a densely populated area of Chernihiv. (BBC News) (Reuters)");
                     break;
case 18:
System.out.println("Foreign involvement in the Russian invasion of Ukraine Germany arrests two German-Russian nationals for an alleged military sabotage plot on behalf of Russia to undermine military support for Ukraine. (Reuters)"); 
                     break;
case 19:
System.out.println("Russian strikes against Ukrainian infrastructure Russian missile strikes kill seven civilians in Dnipropetrovsk Oblast, including five in Synelnykove and two in Dnipro, with several others critically injured. (BBC News) A Russian Air Force Tupolev Tu-22M3 aircraft is shot down in Russian airspace ov");
System.out.println("er Stavropol Krai after launching missiles at targets in Ukraine. (BBC News)"); 
                     break;
case 20:
                     System.out.println("The Governor of Smolensk Oblast, Russia, says that a Ukrainian drone attack caused a fire at a fuel depot in Kardymovsky. (Reuters)\nThe U.S. House of Representatives passes a series of bills that would provide $95 billion in military aid to countries including Ukraine, Israel, and Taiwan. (ABC News");
System.out.println(")");
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
System.out.println("Eastern Ukraine campaign The Russian Ministry of Defence claims control over the village of Novomykhailivka in Donetsk Oblast. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces its largest ever military support package for the Ukrainian military, pledging ");
System.out.println("400 vehicles, including 162 MXT-MVs, 60 boats, 1,600 air defence missiles, 4 million rounds of firearm ammunition, and an additional £500 million in funding. (The Guardian) Russian strikes against Ukrainian infrastructure Russia strikes the Kharkiv TV Tower with a Kh-59 cruise missile, causing the u");
System.out.println("pper half of the tower to collapse and disrupting the broadcasting signal in Kharkiv, Ukraine. (Reuters)"); 
                     break;
case 23:
                     System.out.println("Nothing significant to report");
                     break;
case 24:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War The United States announces a $61 billion aid package for Ukraine as part of a bill that was recently approved after being stalled in the US Congress for months. The package includes ammunition for artillery and air defense systems, along with a");
System.out.println("rmoured fighting vehicles. (CNN)"); 
                     break;
case 25:
                     System.out.println("Russian Deputy Foreign Minister Sergei Ryabkov warns that Russia will make NATO nuclear weapons in Poland one of its primary targets if they are deployed there. (The Jerusalem Post)");
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
System.out.println("Ukraine says that it attacked two oil refineries and an airfield in Krasnodar Krai, Russia, using drones. (Al Arabiya) (Reuters) Russian strikes against Ukrainian infrastructure Russian missiles strike Ukrainian power plants and natural gas storage facilities in Lviv, Ivano-Frankivsk, and Dnipropetr");
System.out.println("ovsk Oblasts. (Reuters) (Reuters)"); 
                     break;
case 28:
                     System.out.println("Ukraine withdraws from the villages of Berdychi, Semenivka, and Novomykhailivka in Donetsk Oblast. (Reuters)");
                     break;
case 29:
System.out.println("Four people are killed and 28 others are injured in a Russian missile strike in Odesa. Ukraine says that Russia used an Iskander-M ballistic missile with a cluster warhead in the attack. (Reuters) "); 
                     break;
case 30:
                     System.out.println("Russian forces strike Kharkiv with guided bombs, killing at least two people and injuring six others. (Reuters)");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 5:
                    System.out.println("1. Enter a day in May 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Odesa strikes Two Russian ballistic missiles strike the port city of Odesa, killing three people and injuring sixteen others. (Reuters) (Reuters 2) (Kyiv Post)\n Russia displays captured NATO military vehicles and equipment at an open-air exhibition in Victory Park on Poklonnaya Hill in Moscow. Amon");
System.out.println("g the captured vehicles are a German Leopard 2 tank and an American M1 Abrams tank. (BBC News) (Fox News)"); 
                     break;
case 2:
System.out.println("Russian forces take control of the village of Berdychi in Donetsk Oblast. (Al-Arabiya News)\n At least nine people, including eight children, are injured in a Russian guided airstrike in Derhachi, Kharkiv Oblast. (AFP via Barron's) (Reuters)"); 
                     break;
case 3:
System.out.println("Two people are killed and two others are injured by Russian shelling in the city of Kurakhove in the Donetsk oblast. (The Moscow Times) British Foreign Secretary David Cameron promises £3 billion of annual military aid to Ukraine for as long as it takes. (Reuters)"); 
                     break;
case 4:
                     System.out.println("Two people are killed and six others are injured in Russian overnight drone strikes on the Kharkiv and Dnipro regions of Ukraine. (Reuters) (VOA)");
                     break;
case 5:
                     System.out.println("A woman is killed and 17 other people are injured in Russian attacks on Kharkiv, Ukraine. (Reuters)");
                     break;
case 6:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Six people are killed and 35 others are injured in Ukrainian drone attacks in Belgorod Oblast, Russia. (The Moscow Times)"); 
                     break;
case 7:
System.out.println("Assassination attempts on Volodymyr Zelenskyy The Security Service of Ukraine says that it detained two Ukrainian government protection unit colonels recruited by Russia's Federal Security Service who were planning an assassination of President Volodymyr Zelenskyy and other top Ukrainian officials. ");
System.out.println("(Reuters) Ukrainian forces launch a missile strike on an oil terminal in Luhansk, causing a large fire and injuring at least five workers. (Reuters)"); 
                     break;
case 8:
System.out.println("Russia launches missile and drone strikes across Ukraine, injuring three people and damaging critical infrastructure. Ukraine says that it shot down 39 of 55 missiles and 20 of 21 drones. (AP) (Bloomberg News) Kharkiv strikes At least seven people, including four children, are injured in a Russian a");
System.out.println("irstrike on Kharkiv. (Reuters) Russia occupies the villages of Novokalynove in Donetsk Oblast and Kyslivka in Kharkiv Oblast. (Anadolu Agency)"); 
                     break;
case 9:
System.out.println("Assassination attempts on Volodymyr Zelenskyy Ukrainian President Volodymyr Zelenskyy fires the head of the state guards Serhiy Rud after allegations that two members of the guards were involved in an assassination plot against Zelenskyy. (Al Jazeera) (Reuters)"); 
                     break;
case 10:
System.out.println("2024 Kharkiv offensive Russian forces launch an attack on Ukraine's Kharkiv Oblast, near the town of Vovchansk, opening up a new front. (Reuters) A Ukrainian strike against oil infrastructure kills three in Luhansk. (Reuters)"); 
                     break;
case 11:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Three people are killed in a Ukrainian strike in Donetsk. Separately, two people are killed in Ukrainian strikes in Belgorod and Kursk. (Reuters)"); 
                     break;
case 12:
System.out.println("2024 Kharkiv offensive The Russian Defence Ministry states that its forces have captured several villages in Kharkiv Oblast. (CNN) May 2024 Belgorod missile strike At least 17 civilians are killed and 30 others are injured when a missile hit an apartment block in Belgorod, Russia. (AP) (Reuters) Pre");
System.out.println("sident of Russia Vladimir Putin reassigns Defence Minister Sergei Shoigu to the National Security Council and replaces him with Deputy Prime Minister Andrey Belousov. (The Washington Post)"); 
                     break;
case 13:
                     System.out.println("Russia claims that its troops have entered the town of Vovchansk, 74 kilometres (46 mi) from Kharkiv. (BBC News)");
                     break;
case 14:
System.out.println("2024 Kharkiv offensive, Kharkiv strikes At least 20 people are injured when Russian airstrikes hit a residential building in Kharkiv, Ukraine. (Reuters) Ukraine pulls back from positions near Lukyantsi and Vovchansk in Kharkiv Oblast. (Reuters) "); 
                     break;
case 15:
System.out.println("Southern Ukraine campaign, 2024 Kharkiv offensive Russia says its forces have captured the village of Robotyne in Zaporizhzhia Oblast, and several more villages in Kharkiv Oblast. Ukraine confirms it has pulled back its troops from Vovchansk to preserve the lives of our servicemen and avoid losses. ");
System.out.println("(BBC News)"); 
                     break;
case 16:
                     System.out.println("United States Secretary of State Antony Blinken announces a $2 billion military aid package for Ukraine, aimed at investing in Ukraine's industrial base. (Al Jazeera)");
                     break;
case 17:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches a massive drone attack across southwestern Russia, causing fires at several oil refineries, including at the port of Novorossiysk. (The New York Times) Kharkiv strikes At least three civilians are killed and 28 others are inju");
System.out.println("red by Russian guided bombs in Kharkiv. (Reuters)"); 
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
                     System.out.println("At least six people are killed and 27 others are injured in a Russian double tap missile strike on a recreation area near Kharkiv. Separately, five people are killed and nine others are injured in a Russian strike using a multiple launch rocket system on two villages in Kupiansk Raion, Kharkiv Oblas");
System.out.println("t. (Reuters)");
                     break;
case 20:
                     System.out.println("A court in Novosibirsk, Russia, sentences a 24-year-old man to 25 years in prison for allegedly plotting an arson attack on a military recruitment office with alleged directions from Ukraine. (Al Jazeera)");
                     break;
case 21:
                     System.out.println("A court in Saint Petersburg, Russia, sentences Anatoly Maslov, a 77-year-old hypersonic missiles expert, to 14 years in prison for state treason. (Reuters)");
                     break;
case 22:
System.out.println("Eastern Ukraine campaign Russia captures the village of Klishchiivka in Donetsk Oblast, Ukraine. (Al Jazeera) At least two people are killed and four are injured by Ukrainian shelling in Lysychansk, Luhansk Oblast, Ukraine. (Al Jazeera) Military aid to Ukraine during the Russo-Ukrainian War Sweden a");
System.out.println("nnounces US$7 billion in military aid to Ukraine from 2024 to 2026. (Bloomberg) Russia returns six Ukrainian children displaced by the war back to Ukraine, in a deal brokered by Qatar. (Al Jazeera)"); 
                     break;
case 23:
System.out.println("2024 Kharkiv offensive Seven people are killed and at least 28 others are injured in Russian missile strikes in Liubotyn and Kharkiv, Ukraine. (Reuters) Crimea attacks At least two people are killed in a Ukrainian missile strike on Alushta, Crimea. Explosions are reported across the peninsula and Uk");
System.out.println("rainian media reports that multiple targets were hit. (Reuters) Eastern Ukraine campaign Russian forces captures the village of Andriivka in Donetsk Oblast. (The Daily Telegraph)"); 
                     break;
case 24:
System.out.println("Sources claim that Russian President Vladimir Putin is interested in negotiating a ceasefire, which would freeze the conflict at the current frontlines. (Reuters) The European Union makes a decision allowing Ukraine to use interest funds from frozen Russian bank accounts, totaling €2.5 billion ($2.7");
System.out.println(" billion) per year. (Al Jazeera)"); 
                     break;
case 25:
System.out.println("Eastern Ukraine campaign Russia captures the village of Arkhanhelske in Donetsk Oblast. (The Moscow Times) Kharkiv strikes At least fourteen people are killed and 58 others are injured in Russian strikes on a hardware store and residential area in Kharkiv, Ukraine. (The Kyiv Independent) (Reuters)"); 
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Prime Minister of Spain Pedro Sánchez signs a bilateral security pact with Ukrainian President Volodymyr Zelenskyy and pledges €1 billion (US$1.1 billion) of military aid to Ukraine. (Al Jazeera) Russia captures the villages of Netailove in Done");
System.out.println("tsk Oblast and Ivanivka in Kharkiv Oblast. (Arab News)"); 
                     break;
case 28:
System.out.println("Eastern Ukraine campaign Russian guided bombs hit a block of apartments in Toretsk, Donetsk Oblast, killing at least two civilians and injuring six others. (Reuters)"); 
                     break;
case 29:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations, Ukraine–NATO relations Sweden announces a package of $1.23 billion in military aid to Ukraine, the largest given by Sweden so far. (AP) France and Germany announce that French and German weapons sent to Ukraine, including");
System.out.println(" long-range missiles, are permitted to target bases inside Russia. (CNN) The Polish Defence Ministry says it has given Ukraine permission to use Polish-supplied weapons to strike targets inside Russian territory. (Babel)"); 
                     break;
case 30:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations 2024 Kharkiv offensive The United States gives Ukraine permission to strike Russian territory near Kharkiv Oblast with U.S.-supplied weapons, but not with long-range missiles. (Politico) (CNN) Danish Foreign Minister Lars ");
System.out.println("Løkke Rasmussen says Denmark has approved Ukrainian airstrikes on Russian territory using Danish-supplied F-16 jets. (The Moscow Times) "); 
                     break;
case 31:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches missile and drone strikes across Krasnodar Krai, Russia, injuring two people and damaging several oil refineries. (Reuters) Kharkiv strikes At least three people are killed and 16 others are injured when Russian missiles hit c");
System.out.println("ivilian infrastructure in Kharkiv. (Reuters) Treatment of prisoners of war in the Russian invasion of Ukraine Ukraine and Russia announce their first exchange of prisoners of war in nearly four months, with 150 people freed following negotiations mediated by the United Arab Emirates. (Reuters)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 6:
                    System.out.println("1. Enter a day in June 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, injuring at least four people and damaging critical infrastructure, including energy facilities. Ukraine says that it shot down 35 of 53 missiles and 46 of 47 drones. (Reuters)"); 
                     break;
case 2:
System.out.println("Russia–NATO relations, Russia–United States relations Russia accuses NATO and the United States of 'provoking a new level of tension' after some allies agreed to let Ukraine's military use Western-supplied weapons to strike targets inside Russia. (BBC News) "); 
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Russian Foreign Minister Sergey Lavrov warns that French military instructors will be legitimate targets if they are deployed to Ukraine. (France 24)");
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
                     System.out.println("President of France Emmanuel Macron announces that the country will send Dassault Mirage 2000-5 fighter aircraft to Ukraine and train its pilots by the end of 2024. (The Telegraph)");
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
                     System.out.println("Nothing significant to report");
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
System.out.println("Crimea attacks Ukraine's military says that its missile strikes near Yevpatoriya and Chornomorske in Russian-occupied Crimea damaged three Russian air defense systems. (Reuters) Eastern Ukraine campaign The Russian Defence Ministry says that its forces have recaptured the village of Staromaiorske in");
System.out.println(" Donetsk Oblast. (Fakti) (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United States lifts a ban on sending U.S. weaponry to Ukraine's Azov Brigade. (The Washington Post)"); 
                     break;
case 11:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Ukraine–European Union relations, Ukraine–United States relations European Commission President Ursula von der Leyen announces that the European Union will give Ukraine €3.4 billion (USD$3.6 billion) throughout the summer from Russian frozen as");
System.out.println("sets revenue. (The Kyiv Independent) The United States approves a move to send a second Patriot missile system to Ukraine. (AP) Belarus–Russia relations Russia and Belarus begin the second stage of their tactical nuclear weapons drills. (The Independent) Russia says that it has captured the villages");
System.out.println(" of Tymkivka in Kharkiv Oblast and Miasozharivka in Luhansk Oblast. (Barron's via AFP) "); 
                     break;
case 12:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, India–Russia relations Two Indians recruited by the Russian army are killed in Ukraine with the Indian foreign ministry urging Moscow to quickly return all Indian nationals who are serving in the Russian army. (BBC News) Kryvyi Rih strikes Nine");
System.out.println(" people are killed and 26 others are injured in a Russian airstrike on Kryvyi Rih. (Reuters) (NDTV) Kyiv strikes Russia launches a wave of cruise missiles and drone attacks at Kyiv. Ukraine claims to have intercepted all missiles and drones, although debris did cause some damage to infrastructure. (");
System.out.println("Reuters)"); 
                     break;
case 13:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Leaders at the G7 summit agree to loan Ukraine US$50 billion and use interest from Russia's frozen central bank assets as collateral for the loan. (AP) United States and the Russian invasion of Ukraine U.S. President Joe Biden and Ukrainian Pres");
System.out.println("ident Volodymyr Zelenskyy sign a ten-year security agreement to strengthen Ukraine's defensive capabilities. (AP)"); 
                     break;
case 14:
System.out.println("International sanctions during the Russian invasion of Ukraine Germany vetoes a European Union sanction package that would prevent EU members from re-exporting Russian liquefied natural gas from EU ports and prevent EU companies from selling sanctioned products to Russia. (The Kyiv Independent) Peac");
System.out.println("e negotiations in the Russian invasion of Ukraine Russian President Vladimir Putin announces that he is ready for a ceasefire if Ukraine withdraws from Russian-claimed territories, including liberated areas, and stops its accession to NATO. However, Ukraine rejects the offer. (AP) "); 
                     break;
case 15:
System.out.println("Eastern Ukraine campaign Three people are killed and five others are injured in a Russian cluster munition strike on the village of Ulakly in Donetsk Oblast. (The Kyiv Independent) Humanitarian aid to Ukraine during the Russo-Ukrainian War The United States announces a $1.5 billion aid package to Uk");
System.out.println("raine, focused primarily on the country's energy industry and humanitarian assistance. (Politico) June 2024 Ukraine peace summit World leaders meet at the Bürgenstock Resort in Switzerland to advance the Ukrainian peace process. (The Guardian)"); 
                     break;
case 16:
System.out.println("Norway announces that it will give Ukraine 1.1 billion kroner (US$103 million) to help repair its energy infrastructure and secure the country's electricity supply before the winter. (Le Monde) Peace negotiations in the Russian invasion of Ukraine The two-day Global Peace Summit, dedicated to the di");
System.out.println("scussion of 'Ukraine's Peace Formula', ends at the Bürgenstock Resort in Switzerland. (CNN) Russia claims that it captured the village of Zahirne in Zaporizhzhia Oblast, Ukraine. (Barron's)"); 
                     break;
case 17:
                     System.out.println("Russian President Vladimir Putin announces that he will visit North Korea this week, the first state visit by a Russian President in 24 years. (Al Jazeera)");
                     break;
case 18:
                     System.out.println("Ukraine experiences rolling blackouts due to Russian attacks on power plants across the country. (Al Jazeera)");
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
System.out.println("United States and the Russian invasion of Ukraine Ukraine is prioritized first among the countries to receive ordered deliveries of MIM-104 Patriot missile systems from the United States. (CNN) United States officials announce that they will allow Ukraine to use US weapons to strike Russian forces w");
System.out.println("ithin Russia, provided they are located right across the border with Ukraine, removing the prior limit of only allowing strikes across the Kharkiv front. (Politico) Eastern Ukraine campaign Three people are killed and four others are injured in Russian cluster munitions strikes on the village of Roz");
System.out.println("kishne, Donetsk Oblast, Ukraine. (Al Jazeera)"); 
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
System.out.println("Kharkiv strikes At least three people are killed and 38 others are injured when Russian guided bombs hit civilian infrastructure in Kharkiv, Ukraine. (The Washington Post) Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, injuring two people a");
System.out.println("nd damaging energy infrastructure. Ukraine says that it shot down 12 of 16 missiles and all 13 drones. (Reuters)"); 
                     break;
case 23:
System.out.println("Crimea attacks June 2024 Sevastopol missile attack Ukrainian forces launch an ATACMS missile bombardment on Sevastopol, Crimea, with missile fragments hitting a beach, killing five people and injuring at least 153 others of which 27 were children. Russia's ministry of defense says that it holds the ");
System.out.println("United States responsible for the attack and vows that there will be a response. (Reuters) Kharkiv strikes One person is killed and ten others are injured in Russian strikes on civilian infrastructure in Kharkiv, Ukraine. (Reuters)"); 
                     break;
case 24:
System.out.println("Eastern Ukraine campaign At least four people are killed and 40 others are injured when Russian Iskander-M ballistic missiles hit Pokrovsk in Donetsk Oblast, Ukraine. (The Kyiv Independent) (Reuters)"); 
                     break;
case 25:
System.out.println("The European Court of Human Rights unanimously finds Russia guilty of systematic violations of human rights in the Crimean peninsula. (Al Jazeera) Russia and Ukraine each return 90 prisoners of war in a prisoner exchange mediated by the United Arab Emirates. (Reuters)"); 
                     break;
case 26:
System.out.println("The leaders of Poland, Lithuania, Latvia, and Estonia call on the European Union to construct a €2.5 billion (US$2.67 billion) defence line between them and Russia and Belarus to secure the EU from military, economic, and migrant-related threats. (Reuters) Dutch Prime Minister Mark Rutte is formally");
System.out.println(" selected as the next NATO Secretary-General. (CNN)"); 
                     break;
case 27:
System.out.println("Foreign involvement in the Russian invasion of Ukraine According to an anonymous South Korean government official, North Korea is preparing to send engineering forces to the Russian-occupied Donetsk region of Ukraine in July. (NK News)"); 
                     break;
case 28:
System.out.println("Dnipro strikes At least one person is killed and 12 others are injured when a Russian missile hits a nine-storey residential building in Dnipro, Ukraine. (Reuters) Eastern Ukraine campaign The Russian Ministry of Defence claims that its forces have taken control of the village of Rozdolivka in Donet");
System.out.println("sk Oblast, Ukraine. (Anadolu Agency)"); 
                     break;
case 29:
                     System.out.println("At least twelve people, including four children, are killed by Russian attacks in Ukraine. (Al Jazeera)");
                     break;
case 30:
System.out.println("Kharkiv strikes At least one person is killed and ten others are injured when a Russian guided bomb hits a postal sorting hub in Kharkiv, Ukraine. (Bloomberg) Eastern Ukraine campaign The Russian Defence Ministry says that its forces have taken the villages of Spirne and Novooleksandrivka in Ukraine");
System.out.println("'s eastern Donetsk Oblast. (Reuters) "); 
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 7:
                    System.out.println("1. Enter a day in July 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Eastern Ukraine campaign Russia says that it has captured the villages of Novopokrovske in Donetsk Oblast and Stepova Novoselivka in Kharkiv Oblast. (Al Arabiya)"); 
                     break;
case 2:
System.out.println("Two people are killed and nine others are injured when Russian artillery and drones hit Nikopol in Dnipropetrovsk Oblast, Ukraine. (Reuters) (Ukrinform) Kazakh dissident Aydos Sadykov has died two weeks after being shot outside his home in Kyiv, Ukraine. (Al Jazeera)"); 
                     break;
case 3:
System.out.println("Battle of Chasiv Yar Russian forces take control of the Novy district of Chasiv Yar, Donetsk Oblast, Ukraine. (CBS News) One person is killed and at least 14 others are injured in Russian guided bomb and missile attacks across Kharkiv Oblast, Ukraine. (Reuters) Russian strikes against infrastructure");
System.out.println(" Dnipro strikes At least five people are killed and 53 others are injured when Russian drones and missiles hits civilian infrastructure in Dnipro, Ukraine. (BBC News) Military aid to Ukraine during the Russo-Ukrainian War NATO nations agree to grant Ukraine €40 billion (US$43 billion) in military ai");
System.out.println("d in 2025. (Reuters) Zaporizhzhia Nuclear Power Plant crisis Three kamikaze drones attack an electrical substation for the Russian-held Zaporizhzhia Nuclear Power Plant, injuring eight workers, causing forest fires near the plant's switchyard, and leaving Enerhodar without power or water. (Reuters) ");
System.out.println("(RFE/RL)"); 
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
System.out.println("Russia–Hungary relations, 2024 peace missions by Viktor Orbán Hungarian Prime Minister Viktor Orbán meets with Russian President Vladimir Putin in Moscow, Russia, after meeting with Ukrainian President Volodymyr Zelenskyy on Tuesday, prompting condemnation among European Union member states. (Politi");
System.out.println("co)"); 
                     break;
case 6:
                     System.out.println("Hungary suddenly cancels a meeting between Foreign Minister Péter Szijjártó and German Foreign Minister Annalena Baerbock on 8 July in Budapest, after she planned to discuss Hungarian PM Viktor Orbán's uncoordinated meeting with Russian President Vladimir Putin in Moscow. (Politico)");
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
System.out.println("Russian strikes against infrastructure 8 July 2024 Ukraine missile strikes Russia launches a massive missile attack striking residential buildings and civilian infrastructure in cities across Ukraine, including the Okhmatdyt children's hospital in Kyiv. At least 47 people are killed and 189 others a");
System.out.println("re injured as a result of the strikes. (BBC News) Poland–Ukraine relations Ukrainian President Volodymyr Zelenskyy and Polish Prime Minister Donald Tusk sign a security agreement in Warsaw, Poland, allowing Poland to shoot down Russian missiles inside Ukrainian airspace. (Ukrinform)"); 
                     break;
case 9:
System.out.println("Eastern Ukraine campaign Russian forces reportedly capture the village of Yasnobrodivka in Donetsk Oblast, Ukraine. (Barron's)"); 
                     break;
case 10:
System.out.println("Russian invasion of Ukraine Two Ukrainians are killed by Russian drone and missile attacks on a port in southern Odesa Oblast, Ukraine, which damaged port infrastructure, an energy facility, and a civilian ship. (Reuters)"); 
                     break;
case 11:
                     System.out.println("Nothing significant to report");
                     break;
case 12:
                     System.out.println("Six people are killed and at least 19 others are injured in Russian attacks across Donetsk Oblast, Ukraine. (The Kyiv Independent)");
                     break;
case 13:
System.out.println("Kharkiv strikes Two people are killed and twenty-five people, including two children, are injured in a Russian double tap strike on the village of Budy, Kharkiv Oblast, Ukraine. (Reuters)"); 
                     break;
case 14:
System.out.println("Eastern Ukraine campaign Russia takes control of Urozhaine in Donetsk Oblast, which Ukraine had previously recaptured in July 2023. (Reuters)"); 
                     break;
case 15:
System.out.println("Ukraine–NATO relations NATO establishes a new command centre in Wiesbaden, Germany, to plan and coordinate support for the Ukrainian military as part of the NATO Security Assistance and Training for Ukraine. (Euronews)"); 
                     break;
case 16:
System.out.println("2024 European heatwaves Ukrainian state electrical grid operator Ukrenergo begins emergency power shutdowns in seven eastern and central oblasts amid a record heat wave and equipment failures worsened by ongoing Russian attacks. (Reuters)\nCzech Republic–Ukraine relations The Czech Republic announce");
System.out.println("s plans to facilitate Colt CZ Group assault rifle production and the construction of an ammunition factory in Ukraine. (RFE/RL)\n Estonia–Russia relations, Latvia–Russia relations, Lithuania–Russia relations The Baltic states announce their exit from Russia's and Belarus's electricity grid along wit");
System.out.println("h plans to synchronize their grid with the continental Europe grid on February 9, 2025. (AP)"); 
                     break;
case 17:
                     System.out.println("Germany issues plans to halve its military aid to Ukraine in 2025. (Reuters)");
                     break;
case 18:
System.out.println("Southern Ukraine campaign- Dnieper campaign: Ukrainian forces withdraw from the village of Krynky in Kherson Oblast. (Bloomberg) Eastern Ukraine campaign Five people are killed and three others are injured in Russian attacks on villages in the Donetsk region, Ukraine. (Reuters)"); 
                     break;
case 19:
System.out.println("Eastern Ukraine campaign Ukrainian forces retreat from Urozhaine in Donetsk Oblast. (The Independent) The Russian Ministry of Defence announces that its troops captured the village of Yuryivka in Donetsk Oblast. (Al Arabiya)"); 
                     break;
case 20:
System.out.println("Southern Ukraine campaign Five people, including a child, are killed in Russian missile strikes on Mykolaiv and Kherson, Ukraine. (Euronews) (The Moscow Times) "); 
                     break;
case 21:
System.out.println("Eastern Ukraine campaign Russian forces capture the villages of Andriivka in Luhansk Oblast and Pishchane in Kharkiv Oblast. (Anadolu Agency) (RTL)"); 
                     break;
case 22:
System.out.println("The U.S. Air Force delivers the first of 14 F-16 Fighting Falcons to the Slovak Air Force as part of a $1.6 billion deal signed in 2018. (Reuters) Belarusian foreign minister Maxim Ryzhenkov is invited to make Belarus's first foreign ministry visit to North Korea regarding cooperation with Russia in");
System.out.println(" conflicts with the Western world. (AP)"); 
                     break;
case 23:
                     System.out.println("The European Union deprives Hungary of its ability to host the next set of foreign and defense ministry meetings as a symbolic signal against Viktor Orbán's uncoordinated meetings in Russia and China, moving the ministry meetings from Budapest, Hungary, to Brussels, Belgium. (BBC News) (The Independ");
System.out.println("ent)");
                     break;
case 24:
                     System.out.println("Polish Defense Minister Władysław Kosiniak-Kamysz states that Poland will block Ukraine's bid to join the European Union if it doesn't resolve issues regarding Ukrainian nationalists' massacre of Poles during WWII, including finding and burying all victims killed on current Ukrainian territory. (The");
System.out.println(" Kyiv Independent)");
                     break;
case 25:
System.out.println("Economic impact of the Russian invasion of Ukraine Fitch Ratings downgrades Ukraine's credit rating from 'CC' to 'C' due to the country's need to restructure US$20 billion in international bonds to foreign investors, increasing the country's risk of default. (Al Jazeera)"); 
                     break;
case 26:
System.out.println("The European Union sends its first transfer of €1.5 billion (US$1.63 billion) in proceeds from frozen Russian assets to Ukraine for military and infrastructure support. The Kremlin denounces the transfer as illegal under international law and pledges legal retaliation. (AP) (Reuters) Finland–Russia ");
System.out.println("relations Finland reports that a Russian Navy Baltic Sea fleet vessel trespassed on Finnish territorial waters in the eastern Gulf of Finland. (Reuters)"); 
                     break;
case 27:
System.out.println("2024 Ukrainian cyberattacks against Russia Hackers from the Ministry of Defense of Ukraine escalate massive cyberattacks on Russia's largest banks, prohibiting any cash or credit transactions. Cyberattacks also target Russian public transport systems, internet and mobile providers, and social networ");
System.out.println("ks. (Kyiv Post) Russian forces capture the village of Lozovatske in Donetsk Oblast. (Anadolu Agency)"); 
                     break;
case 28:
                     System.out.println("Russian President Vladimir Putin threatens to position long-range missiles that could strike throughout Europe following the United States's announcement of plans to set up long-range missiles in Germany beginning in 2026. (Reuters)");
                     break;
case 29:
System.out.println("Eastern Ukraine campaign Ukrainian army sergeant Oleh Chaus reports that the Russian army captured the eastern Donetsk villages of Prohres and Vovche, citing insufficient weapon supplies, deficient training, and decreased motivation as causes of the setback. (AP)"); 
                     break;
case 30:
                     System.out.println("The Russian defense ministry says that its forces have taken control of the settlement of Pivdenne in Donetsk region, Ukraine. (Reuters)");
                     break;
case 31:
                     System.out.println("Ukraine demands that Russia explain the death of Ukrainian POW Oleksandr Ishchenko in Russian captivity, who was being tried with 21 other captured Ukrainian troops for being part of the Azov Brigade that Russian prosecutors allege is far-right affiliated. (Reuters)");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 8:
                    System.out.println("1. Enter a day in August 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
                     System.out.println("S&P Global downgrades Ukraine's credit rating to 'SD' for 'selective' default after Ukraine was unable to pay a US$34 million international bond payment, and also stating that Ukraine's credit rating could fall to 'D', which would represent a complete default following restructuring of Ukraine's deb");
System.out.println("t. (Reuters)");
                     break;
case 4:
System.out.println("Eastern Ukraine campaign Russia said its armed forces captured the village of Novoselivka Persha in Donetsk Oblast, Ukraine. (Times of India) Military aid to Ukraine during the Russo-Ukrainian War President of Ukraine Volodymyr Zelenskyy announces that the country has received its first F-16 fighter");
System.out.println(" aircraft from NATO allies. (The New York Times)\nMali cuts all diplomatic relations with Ukraine for providing intelligence to Tuareg rebels that enabled them to ambush and kill large numbers of Wagner Group mercenaries and Malian troops. (CNN)"); 
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
System.out.println("2024 Kursk offensive Ukraine launches an incursion into Kursk Oblast, Russia. (Reuters) Eastern Ukraine campaign Russia claims that it captured the village of Tymofiivka in Donetsk Oblast. (AA)\nNiger suspends diplomatic relations with Ukraine over Ukraine's alleged support for rebels who ambushed a");
System.out.println("nd killed dozens of Malian soldiers and Russian mercenaries during the Battle of Tinzaouaten in July. (Reuters)"); 
                     break;
case 7:
System.out.println("Russian Chief of General Staff Valery Gerasimov says that the Ukrainian advance into Kursk Oblast has been stopped as reports emerge of continued heavy fighting in the vicinity of Sudzha. (BBC News) Acting Governor of Kursk Oblast Alexei Smirnov declares a state of emergency in the region. (DW)"); 
                     break;
case 8:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Ukrainian President Volodymyr Zelenskyy appears to confirm ordering a major cross-border operation inside Russia, saying that 'Russia brought war to our land, and it should feel what it has done'. (BBC News) Large explosio");
System.out.println("ns are reported near the town of Rylsk in Kursk Oblast, Russia, with videos on social media appearing to show a destroyed column of military vehicles. (The Kyiv Independent) Ukraine launches twelve rockets and 14 drones into Russia, according to both acting Governor of Kursk Oblast Alexei Smirnov an");
System.out.println("d the Russian Ministry of Defence. (DW Russian) Ukrainian forces capture dozens of Russian soldiers in their offensive in Kursk Oblast. Russian authorities say that fighting is still ongoing for control of several settlements near the border. (Al Jazeera) Ukrainian troops and tanks enter the town of");
System.out.println(" Sudzha, forcing the local residents to flee. (Sky News) (BBC Russian Service)"); 
                     break;
case 9:
System.out.println("2024 Kursk offensive Russia declares a federal-level emergency in Kursk Oblast as Ukrainian forces continue to advance. (AP via ABC News) Akhmat special forces commander Apti Alaudinov says that Ukrainian troops simply passed-by their positions without engaging them, with Akhmat troops choosing to r");
System.out.println("etreat until more Russian reinforcements could arrive. Other reports indicate that Akhmat troops fled from Ukrainian forces. (The New Voice of Ukraine via MSN) A Russian military convoy is destroyed on the E38 highway in Oktyabrsky District. (The Guardian) Ukrainian troops capture the Gazprom gas fa");
System.out.println("cility in Sudzha. A video shows Ukrainian soldiers inside the natural gas facility, with much of the town reportedly under Ukrainian control. (Reuters via Al Arabiya) Ukraine launches a massive drone attack on Lipetsk Oblast, Russia, with Lipetsk air base reportedly on fire. Several villages are eva");
System.out.println("cuated, with six people reportedly injured. (Reuters) Eastern Ukraine campaign 2024 Kostiantynivka supermarket missile attack A Russian missile attack on a supermarket in Kostiantynivka, Donetsk Oblast, kills 14 people and injures 43 others. (Reuters) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an war The United States announces it will send Ukraine a $125 million military aid package, including FIM-92 Stinger missiles, artillery ammunition, and anti-armor systems. (Reuters)"); 
                     break;
case 10:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Russia introduces a counter-terrorist regime in Belgorod, Bryansk, and Kursk Oblasts in response to the ongoing incursion, resulting in travel restrictions and an increased security presence. (Novinite) (Ukrainska Pravda) ");
System.out.println("The state-run Russian news agency TASS reports that over 76,000 residents have evacuated from Kursk Oblast this week. (DW) Ukrainian forces enter Belgorod Oblast for the first time during the ongoing incursion, reportedly capturing the village of Poroz. (Kyiv Independent) The Ukrainian Navy strikes ");
System.out.println("and heavily damages a Russian offshore natural gas platform in the Black Sea being used by the Russian Armed Forces. (Reuters) Belarusian involvement in the Russian invasion of Ukraine President of Belarus Alexander Lukashenko increases Belarus's defensive presence on the Belarus–Ukraine border afte");
System.out.println("r accusing Ukraine of illegally sending about a dozen intercepted drones across the border into Belarusian airspace. (RFE/RL) Russian strikes against Ukrainian infrastructure One worker is killed and several others are injured in a Russian missile strike on a critical infrastructure facility in Kram");
System.out.println("atorsk. (Ukrainska Pravda)"); 
                     break;
case 11:
System.out.println("Kyiv strikes Two people, including a 4-year-old child, are killed and three others are injured in a Russian KN-23 ballistic missile attack in Kyiv, Ukraine. (Reuters)"); 
                     break;
case 12:
System.out.println("2024 Kursk offensive Acting Governor of Kursk Oblast Alexei Smirnov accuses the Ukrainian military of using chemical weapons that poisoned Russian civilians. Ukraine's State Security Service denies these claims and accuses Russia of falsifying war crimes. (Newsweek) (Reuters) Ukrainian colonel gener");
System.out.println("al Oleksandr Syrskyi announces that Ukrainian forces now control over 1,000 km2 (386 sq mi) of Russia's Kursk region. (AP) Eastern Ukraine campaign Russian forces take the settlement of Lysychne in Donetsk Oblast. (Reuters)"); 
                     break;
case 13:
System.out.println("2024 Kursk offensive Ukraine says that its troops are still advancing in Kursk Oblast and now control 74 settlements inside Russia. The Russian Defence Ministry says that its forces are fighting the Ukrainians about 28 km (17 mi) from the border. (Reuters) Akhmat special forces commander Apti Alaudi");
System.out.println("nov says that the Ukrainian advance into Kursk Oblast is currently stopped due to Russian counter-attacks. (Reuters)"); 
                     break;
case 14:
System.out.println("2024 Kursk offensive Ukrainian President Volodymyr Zelenskyy says that Ukrainian forces have captured more than 100 Russian soldiers in the last 24 hours during their offensive in Kursk Oblast. Zelenskyy also says that he is open to exchanging the prisoners for Ukrainian prisoners of war. (BBC News)");
System.out.println(" Ukraine announces that it will create a strategic buffer zone on the Russia–Ukraine border that is designed to protect our border communities from daily enemy attacks. (Reuters) Russia evacuates thousands more civilians from borderlands in the Kursk Oblast amid deeper progression of the Armed Force");
System.out.println("s of Ukraine into the region. (Reuters) Ukrainian drones strike the Borisoglebsk air base in Voronezh Oblast, Russia, destroying several hangars. (Pravda) (The Washington Post)"); 
                     break;
case 15:
System.out.println("2024 Kursk offensive Ukrainian occupation of Kursk Oblast Ukraine establishes a military administration in Sudzha with major general Eduard Moskalyov appointed as its senior commander. General Oleksandr Syrskyi says that the administration will maintain law and order in the region. (BBC News) Russia");
System.out.println(" announces the mandatory evacuation of all civilians from Glushkovsky District in Kursk Oblast. (Reuters) The Russian Defence Ministry claims that Russian forces have retaken the settlement of Krupets. (Anadolu Agency) The Security Service of Ukraine captures 102 Russian servicemen as prisoners of w");
System.out.println("ar, marking the largest single group of Russian soldiers to surrender during the conflict. (Bloomberg) Ukrainian troops and military vehicles enter Russia's Belgorod Oblast with the region declaring a state of emergency. Heavy fighting is reportedly underway. (The Washington Post) Eastern Ukraine ca");
System.out.println("mpaign Pokrovsk offensive Pokrovsk's military administration issues immediate evacuation orders for its citizens due to shelling from Russian troops about 10 km away from the city in Donetsk Oblast, Ukraine. (UNN) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom says that Uk");
System.out.println("raine can use British weaponry, including Challenger 2 tanks, for its military operations inside Russia. (Sky News)"); 
                     break;
case 16:
System.out.println("2024 Kursk offensive Ukraine reports capturing 82 Russian settlements within an area of 1,150 square kilometres (440 sq mi) since the start of the Kursk incursion on August 6. (Reuters) Over 120,000 Russian citizens have been evacuated according to Russia, and at least 100 Russian soldiers are captu");
System.out.println("red according to Ukraine. (AP) Russia accuses the United States and European nations of directly helping Ukraine in its incursion on Kursk Oblast by planning operations and providing military support, and states that their involvement created all the prerequisites for Ukraine to lose its sovereignty");
System.out.println(" and lose part of its territories. (Reuters) A Russian Iskander-M ballistic missile strike on an airbase in Dnipropetrovsk Oblast, Ukraine, destroys a MiG-29 jet that was equipped with Storm Shadow missiles. Ukraine's air force spokesperson Yurii Ihnat later confirms the loss of the aircraft on Augu");
System.out.println("st 20. There are no casualties reported. (The Kyiv Independent)"); 
                     break;
case 17:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Rockets launched by the Armed Forces of Ukraine destroy a Russian bridge over the Seym river in Glushkovo, Kursk Oblast. Russia's foreign ministry claims that the missiles were launched using Western-made rocket launchers ");
System.out.println("and that the missiles killed volunteers who were evacuating Russian civilians. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War, Budget of Germany, Germany–Ukraine relations Germany issues an indefinite ban on requesting or providing new military aid to Ukraine that has not already b");
System.out.println("een approved in order to reduce federal budget spending. The moratorium results in a tangible dispute within the Scholz coalition government. (Politico) (The Kyiv Independent) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency declares that the safety of the Zaporizhzhia ");
System.out.println("Nuclear Power Plant is deteriorating, following an investigation into an explosive drone strike that targeted a perimeter access road at the power plant. (Reuters)"); 
                     break;
case 18:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive The Armed Forces of Ukraine destroy a second bridge over the Seym river in Zvannoye. (BBC News) Belarusian involvement in the Russian invasion of Ukraine Belarusian President Alexander Lukashenko reports that nearly one th");
System.out.println("ird of the Belarusian Army has been deployed along the Belarus–Ukraine border, in response to Ukraine stationing more than 120,000 troops at the border. However, Ukraine claims no movement of Belarusian troops has been observed. (Reuters) Eastern Ukraine campaign The Russian Ministry of Defence clai");
System.out.println("ms that Russian forces have captured the village of Svyrydonivka in Donetsk Oblast, Ukraine. (Anadolu Agency)"); 
                     break;
case 19:
System.out.println("Eastern Ukraine campaign Pokrovsk offensive Ukrainian officials order the immediate evacuation of the remaining 53,000 citizens in Pokrovsk due to the advancement of the Russian Armed Forces. (Al Jazeera) Russia captures the city of Zalizne and the Vyimka railway station in Donetsk Oblast. (Reuters)");
System.out.println(" Belarusian involvement in the Russian invasion of Ukraine Belarus announces that it has further increased its Belarus–Ukraine border presence against Ukraine significantly, adding aircraft and air defense forces following its accusations of Ukraine's military sending 120,000 troops to its border an");
System.out.println("d conducting aggressive policies. Ukraine denies Lukashenko's claims, stating its forces have not observed unusual movements of Belarusian troops on the border. (Reuters)"); 
                     break;
case 20:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Russian military sources claim that Ukrainian forces have destroyed or damaged all three bridges over the Seym river in western Russia, potentially trapping Russian forces between the river, the Ukrainian border, and advan");
System.out.println("cing Ukrainian forces. (AP) Eastern Ukraine campaign Pokrovsk offensive, Battle of Toretsk Russia claims that its forces have taken control of the settlement of New York in Donetsk Oblast, Ukraine. (Reuters) Ukraine says that Russian forces are launching heavy attacks on the Toretsk and Pokrovsk fro");
System.out.println("nts. (Reuters) Russian strikes against Ukrainian infrastructure Ternopil residents are urged to remain indoors after Russian drone strikes an industrial facility, causing a large fire and an increased concentration of chlorine in the air. (Reuters) (The Kyiv Indepenent)"); 
                     break;
case 21:
System.out.println("2024 Kursk offensive The Ukrainian military reports that it used United States-made weapons to destroy several pontoon bridges constructed by Russia following its destruction of at least three bridges over the Seym river in Kursk Oblast. (Reuters) Mayor of Moscow Sergey Sobyanin states that Ukraine ");
System.out.println("launched one of its largest drone attacks on the Russian capital, and claims that all drones were taken down without casualties or damage based on preliminary information. (Reuters) Eastern Ukraine campaign Pokrovsk offensive The Russian Ministry of Defense states it has fully captured the village o");
System.out.println("f Zhelanne in Donetsk Oblast, Ukraine. (Anadolu Agency) Ukrainian President Volodymyr Zelenskyy acknowledges advancements made by Russian Armed Forces on the Pokrovsk front, and announces the strengthening of regional Ukrainian positions in order to resist further advancements. (Reuters)"); 
                     break;
case 22:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A ferry carrying 30 fuel tanks sinks in the port of Kavkaz, in Krasnodar Krai, Russia, following a Ukrainian attack. (Reuters) The International Atomic Energy Agency announces an investigation of the Kursk Nuclear Power Plant following accusat");
System.out.println("ions from Russia that a Ukrainian drone targeted the power plant. (Reuters)"); 
                     break;
case 23:
System.out.println("Military aid to Ukraine during the Russo-Ukraine War The United States announces a new military aid package to Ukraine, including air defense missiles, munitions for High Mobility Artillery Rocket Systems (HIMARS), an array of anti-armor missiles, vehicles, and other equipment. (AP)"); 
                     break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Governor of Belgorod Oblast Vyacheslav Gladkov says that five civilians have been killed by Ukrainian shelling in Rakitnoye, Russia. (Reuters)"); 
                     break;
case 25:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine At least five people, including three children, are killed and 13 others are injured in an overnight Ukrainian strike on Rakitnoye, Belgorod Oblast, Russia, according to Russian officials. (Al Jazeera) Belarusian involvement in the Russian inv");
System.out.println("asion of Ukraine Ukraine accuses Belarus of building up a significant level of troops and weaponry, including artillery, multiple-launch rocket systems and air defense systems along the border under the guise of military exercises, and demands their immediate withdrawal. (The Kyiv Independent) (Reut");
System.out.println("ers) Eastern Ukraine campaign A British safety adviser working for Reuters is killed and two other journalists are injured in a Russian ballistic missile strike on their hotel in Kramatorsk, Donetsk Oblast, Ukraine. (Reuters) Northern Ukraine skirmishes, Chernihiv strikes At least four people are ki");
System.out.println("lled and 37 others are injured in overnight Russian attacks in Chernihiv, Sumy, Kharkiv, and Donetsk Oblasts, Ukraine. (Reuters) President of Ukraine Volodymyr Zelenskyy publicly presents the Ukrainian-produced Palianytsia rocket drone and loitering munition, intended to serve as the Ukrainian count");
System.out.println("erpart to the Russian ZALA Kub-BLA. (Ukrainska Pravda)"); 
                     break;
case 26:
System.out.println("Russian strikes against Ukrainian infrastructure 26 August 2024 Russian strikes on Ukraine Massive Russian attacks are launched on cities across Ukraine, killing at least seven people. Ukrainian officials call it the largest Russian attack on Ukraine since the beginning of the Russian invasion of Uk");
System.out.println("raine. (Kyiv Independent) (Kyiv Independent 2) (Reuters) Poland says that a Russian Shahed drone had likely entered its airspace during the attacks on Ukraine and that searches are underway for the object as it may have landed in Polish territory around 30 kilometers (18 miles) from the Poland–Ukrai");
System.out.println("ne border. (The Defense Post) (Radio Free Europe/Radio Liberty) (Reuters) A Ukrainian F-16 fighter jet crashes after shooting down several missiles fired from Russia, killing the pilot. (CNN) Military aid to Ukraine during the Russo-Ukrainian War, Corruption in Ukraine Audits conducted by the Ukrain");
System.out.println("ian Ministry of Defense determine that between March and July, multiple Armed Forces of Ukraine units never received nearly US$4.2 million in military aid labeled as humanitarian aid to bypass customs fees, prompting embezzlement and illicit enrichment investigations. (Kyiv Independent)"); 
                     break;
case 27:
System.out.println("26 August 2024 Russian strikes on Ukraine Russian missile and drone attacks resume across Ukraine, killing at least six people and injuring five others in Kryvyi Rih and Zaporizhzhia. (The Independent) (Kyiv Independent) 2024 Kursk offensive The Ukrainian military says it has captured 594 Russian tr");
System.out.println("oops and 100 settlements in Kursk Oblast since the start of the incursion. (DW) Ukrainian conscription crisis, Poland–Ukraine relations President of Ukraine Volodymyr Zelenskyy announces that Poland will cooperate with Ukraine to return Ukrainians who violated the law, traitors, and collaborators wh");
System.out.println("o illegally crossed the Poland–Ukraine border in order to evade conscription in the Russo-Ukrainian War. (UNN) United States and the Russian invasion of Ukraine, Russia–NATO relations Russian Foreign Minister Sergey Lavrov warns the United States and other NATO members against giving Ukraine approva");
System.out.println("l to use long-range missiles to target Russia. (Reuters) Ukrainian President Volodymyr Zelenskyy announces that Ukraine has successfully tested a domestically-produced ballistic missile for the first time. (Ukrainska Pravda)"); 
                     break;
case 28:
                     System.out.println("Ukrainian drones strike an oil terminal in Kamensky District, Rostov Oblast, Russia, causing a large fire. Ukraine also launches drone attacks on Kirov Oblast for the first time, striking an oil depot in Kotelnich. The Russian Defence Ministry says that air defences have shot down eight drones over ");
System.out.println("Voronezh Oblast. (Reuters)");
                     break;
case 29:
System.out.println("The Russian defence ministry claims that its forces have captured the settlements of Mykolaivka in Donetsk Oblast and Stelmakhivka in Luhansk Oblast, Ukraine. (Al Arabiya) "); 
                     break;
case 30:
System.out.println("Kharkiv strikes Seven people are killed when a Russian guided bomb strikes a residential building and playground in Kharkiv, Ukraine. (Reuters) Ukrainian President Volodymyr Zelenskyy dismisses the commander of the Ukrainian Air Force Mykola Oleshchuk following the crash of an F-16 fighter jet and t");
System.out.println("he death of its pilot while defending against Russian strikes. (Reuters) "); 
                     break;
case 31:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Five civilians are killed in Ukrainian missile strikes on Belgorod, Russia. (Reuters)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 9:
                    System.out.println("1. Enter a day in September 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches more than a hundred drones against targets in Russia, including the Konakovo Power Station in Konakovo, Tver Oblast, and the Moscow Refinery in Moscow. (Reuters) Eastern Ukraine campaign Russia reports that its forces have tak");
System.out.println("en control of the settlements of Ptyche and Vyimka in Donetsk Oblast, Ukraine. (Reuters) Kharkiv strikes At least 47 people are injured when Russian missiles hit a shopping mall and events complex in Kharkiv, Ukraine. (Reuters)"); 
                     break;
case 2:
System.out.println("President of Russia Vladimir Putin arrives in Mongolia to discuss a China–Russia gas pipeline meant to recoup Russian losses from Western sanctions, despite Ukraine and the European Union urging Mongolia to arrest Putin under his International Criminal Court warrant. (Reuters) (Euronews) Ukraine's F");
System.out.println("oreign Ministry states that Mongolia's refusal to arrest Vladimir Putin while on a state visit means that it shares responsibility for the war crimes committed by Russia, and vows to work with allies to enforce punitive measures on Mongolia. (Reuters)"); 
                     break;
case 3:
System.out.println("Russian strikes against Ukrainian infrastructure September 2024 Poltava strike Russian missile strikes on Poltava, Ukraine, kill at least 55 people and injure more than 328 others. (Reuters) (AP) "); 
                     break;
case 4:
System.out.println("Lviv strikes At least seven people are killed and 53 others are injured when Russian drones and missiles hit buildings in Lviv, Ukraine. (Reuters)"); 
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
                     System.out.println("Russian artillery targets the city of Kostiantynivka in Donetsk Oblast, Ukraine, killing three civilians and injuring three others. (Reuters)");
                     break;
case 8:
System.out.println("Russia formally claims control of Novohrodivka, Donetsk Oblast, twelve kilometers (seven miles) from the strategically important Ukrainian logistical hub city Pokrovsk. (Reuters) "); 
                     break;
case 9:
System.out.println("Russian troops capture the village of Memryk in Donetsk Oblast, Ukraine. (Al Jazeera) Russia–NATO relations The Latvian Defence Ministry confirms that a Russian military Shahed drone that crashed near the village of Gaigalava, Latvia, last week was carrying explosives and was likely intended to stri");
System.out.println("ke Ukraine. (Reuters) Use of incendiary weapons in the Russo-Ukrainian War Ukraine begins the implementation of dragon drones that spray molten thermite on forest cover to reveal and help destroy Russian units and military equipment. (Al Jazeera)"); 
                     break;
case 10:
System.out.println("Ukraine launches drone attacks on multiple Oblasts of Russia, including Moscow, prompting all flights to be suspended at Vnukovo International Airport and Moscow Domodedovo Airport. Bryansk Governor Alexander Bogomaz says that at least 59 Ukrainian drones have been shot down over the region. Russia ");
System.out.println("also reports that two people were killed in the Ukrainian drone attack on Moscow. (Reuters) (Times of Israel) Iran and the Russian invasion of Ukraine, International sanctions against Iran U.S. Secretary of State Antony Blinken says that Russia has received a shipment of Fath 360 tactical ballistic ");
System.out.println("missiles from Iran, and expects their deployment within weeks. Iran denies the claim, calling it psychological warfare. In response, the United Kingdom, France, and Germany announce new sanctions on Iran for supplying Russia with ballistic missiles. (BBC News) (The Telegraph) Military aid to Ukraine");
System.out.println(" during the Russo-Ukrainian War The Netherlands lifts all of its weapons restrictions on military equipment that it provided to Ukraine, allowing the Ukrainian military to target Russia with long-range weapons, while also urging NATO allies to lift their own weapons restrictions. (Kyiv Post)"); 
                     break;
case 11:
System.out.println("Russian forces reportedly recapture 10 settlements in Kursk Oblast. (Anadolu Agency) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom reportedly approves the use of Storm Shadow cruise missiles to strike targets inside Russian territory. (The Kyiv Independent)"); 
                     break;
case 12:
System.out.println("Eastern Ukraine campaign Russian artillery shelling kills three Red Cross workers and injures two others in Donetsk Oblast, Ukraine. (Reuters) Foreign involvement in the Russian invasion of Ukraine A spokesperson for the Indian Foreign Ministry say that about 45 Indian nationals have been discharged");
System.out.println(" from the Russian military, with efforts currently underway to get a further 50 Indians released. (Reuters) Kharkiv strikes Russian shelling of the settlement of Borova in Kharkiv Oblast, Ukraine, kills three civilians and injures nine others, including several emergency service personnel. (Reuters)");
System.out.println(" Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations Russian president Vladimir Putin warns that Ukrainian use of NATO weapons to strike deep into Russian territory indicates NATO's formal entry into war against Russia, due to the programming of these weapons by NATO person");
System.out.println("nel representing a direct confrontation. (The Independent) Southern Ukraine campaign Ukraine accuses Russia of conducting missile strikes on a Saint Kitts and Nevis-flagged bulk carrier carrying grain to Egypt in the exclusive economic zone of Romania in the Black Sea. No casualties are reported. (R");
System.out.println("euters)"); 
                     break;
case 13:
System.out.println("Russian artillery targets 15 areas in Sumy Oblast, Ukraine, killing two civilians near the village of Yampil and injuring nine others. (Reuters) China and the Russian invasion of Ukraine Reuters reports that Russia has begun production of thousands of Garpiya-A1 long-range combat drones used against");
System.out.println(" Ukrainian civilian and military targets, that incorporate engines, parts, and technology from China. (Reuters) Humanitarian impacts of the Russian invasion of Ukraine The U.S. Central Intelligence Agency reports that due to the ongoing war, Ukraine's death rate is now the highest in the world at 18");
System.out.println(".6 per thousand people, while its birth rate is the lowest at six children born per thousand people. (Kyiv Post)"); 
                     break;
case 14:
System.out.println("Russia–NATO relations Russian officials say that the approval of Ukrainian use of long-range weapons to strike inside Russia will result in an uncontrolled escalation with the West and the destruction of Kyiv. (Reuters) NATO Chair Rob Bauer backs the use of long-range weapons by Ukrainian forces to ");
System.out.println("strike targets inside Russia. (ABC News) Ukrainian conscription crisis Following a meeting in Kyiv, Ukraine, the foreign ministers of Poland and Ukraine call for ending social benefits for Ukrainian men in Poland, and for programs in the European Union to return them to Ukraine in order to stop draf");
System.out.println("t evasion. (Reuters)"); 
                     break;
case 15:
                     System.out.println("At least 41 people are injured when a Russian guided bomb hits an apartment building in Kharkiv, Ukraine. (CNN)");
                     break;
case 16:
System.out.println("2024 Kursk offensive The Ukrainian ministry of foreign affairs invites the United Nations and the Red Cross to join humanitarian efforts in Kursk Oblast, Russia. (Reuters) Ukraine–United States relations, United States and the Russian invasion of Ukraine Ukrainian officials publicly distance themsel");
System.out.println("ves from the Donald Trump-involved shooting suspect and warn that Russia will use the situation for anti-Ukraine propaganda, following reports of the suspect protesting for the Azov Brigade and regularly calling for international support and troops for Ukraine. (Reuters) (Reuters 2)"); 
                     break;
case 17:
System.out.println("Russian artillery targets the town of Komyshuvakha in Zaporizhzhia Oblast, Ukraine, killing two people and injuring five others. (Reuters) Doctors Without Borders halts its operations in Russia after its government removed the organization from its roster of approved foreign charities. (Al Jazeera)"); 
                     break;
case 18:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Toropets depot explosions A Ukrainian drone attack on a Russian weapons depot in Toropets, Tver Oblast, causes an explosion large enough to be detected as an earthquake by monitoring stations. Local residents are told to evacuate and schools i");
System.out.println("n the region are closed. (The Guardian) "); 
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis Russian management at the Zaporizhzhia Nuclear Power Plant accuses the Armed Forces of Ukraine of creating threats to the plant's safety by launching a drone to attack a nearby electrical substation. (Reuters)"); 
                     break;
case 21:
System.out.println("Kharkiv strikes Twenty-one people are injured when a Russian guided bomb hits an apartment building in Kharkiv, Ukraine. (Reuters)"); 
                     break;
case 22:
                     System.out.println("At least 16 people are injured in Russian airstrikes in Zaporizhzhia, Ukraine. (Reuters)");
                     break;
case 23:
System.out.println("2024 Kursk offensive The Russian Foreign Ministry reports that at least 56 Russian civilians were killed and 266 others were injured by the Armed Forces of Ukraine in Kursk Oblast, Russia, which the Ukrainian Foreign Ministry denies as Russian propaganda. (Reuters)"); 
                     break;
case 24:
                     System.out.println("At least three people are killed and 22 others are injured in a Russian guided bomb attack on an apartment building in Kharkiv, Ukraine. (Reuters)");
                     break;
case 25:
                     System.out.println("Ukrainian President Volodymyr Zelenskyy accuses Brazil and China of using their proposed peace plan for ending the Russo-Ukrainian War to increase their geopolitical power 'at Ukraine's expense' by urging developing nations to agree to the peace plan. (Reuters)\nRepublican Speaker of the House Mike ");
System.out.println("Johnson demands that Ukrainian President Volodymyr Zelenskyy dismiss Ukrainian ambassador to the United States Oksana Markarova after Zelenskyy visited an ammunition factory in Pennsylvania with several Democratic politicians, which Johnson claims represented foreign electoral intervention. (Reuters");
System.out.println(")");
                     break;
case 26:
System.out.println("The Russian Defense Ministry claims that Russian forces have taken the city of Ukrainsk in Donetsk Oblast, Ukraine. (The Moscow Times) United States and the Russian invasion of Ukraine Prior to a meeting with Ukrainian President Volodymyr Zelenskyy, U.S. President Joe Biden announces a military aid ");
System.out.println("package of more than $8 billion for Ukraine and directs The Pentagon to allocate all remaining security funds to Ukraine by the end of his presidential term in January 2025. (Reuters) "); 
                     break;
case 27:
System.out.println("Eastern Ukraine campaign The Russian Ministry of Defense claims soldiers captured the village of Marynivka in Donetsk Oblast, Ukraine. (Al Arabiya) Kryvyi Rih strikes At least one person is killed and five others are injured in a Russian missile strike on a police department in Kryvyi Rih, Dnipropet");
System.out.println("rovsk Oblast, Ukraine. (Reuters) Nuclear risk during the Russian invasion of Ukraine, Belarusian involvement in the Russian invasion of Ukraine Belarusian President Alexander Lukashenko warns that Belarus will use Russian nuclear weapons if the country is attacked by NATO. (Anadolu Agency) Southern ");
System.out.println("Ukraine campaign Russian loitering munitions hit the city of Izmail in Odesa Oblast, Ukraine, killing three people and wounding fourteen. (Reuters) "); 
                     break;
case 28:
                     System.out.println("Ten people are killed and 22 others are injured in a Russian double tap strike on a medical facility in Sumy, Ukraine. (Reuters)");
                     break;
case 29:
                     System.out.println("Nothing significant to report");
                     break;
case 30:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 10:
                    System.out.println("1. Enter a day in October 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
System.out.println("Battle of Vuhledar Russian forces capture the town of Vuhledar in Donetsk Oblast, Ukraine, after Ukrainian forces retreat from the town. (The Daily Telegraph) Southern Ukraine campaign Seven people are killed and 12 others are injured in Russian strikes in Kherson and Zaporizhzhia, Ukraine. (Reuters");
System.out.println(")"); 
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
System.out.println("Pokrovsk offensive The head of military administration of Pokrovsk, Donetsk Oblast, Ukraine, Serhiy Dobriak reports that Russian forces are now about 7 kilometres (4.3 mi) from the city, and have destroyed or damaged 80% of the city's critical infrastructure. (Reuters)"); 
                     break;
case 5:
System.out.println("Russian forces claim that they captured the village of Bazhane Druhe in Donetsk Oblast, Ukraine. (The Economic Times) Ukrainian forces say that they have shot down a Russian aircraft near Kostiantynivka. The aircraft crashed into a house, causing it to catch fire. No casualties are reported. The air");
System.out.println("craft is later reported to be a S-70 Okhotnik-B and was reportedly shot down by a Russian Su-57 jet to prevent its capture by Ukraine. (Defence Blog) (Forbes) (AP) "); 
                     break;
case 6:
                     System.out.println("Nothing significant to report");
                     break;
case 7:
System.out.println("Crimea attacks An oil terminal in Feodosia, the largest oil facility in Russian-occupied Crimea, catches fire following an overnight drone attack by Ukrainian forces. Russian state media reports that a state of emergency has been declared in Feodosia due to a human-made disaster. (Ukrainska Pravda) ");
System.out.println("Eastern Ukraine campaign One person is killed and six others, including two children, are injured in Russian shelling that hit several apartment buildings in Sloviansk, Donetsk Oblast, Ukraine. (Reuters) Southern Ukraine campaign Russian missiles strike two cargo ships in the Port of Odesa, includin");
System.out.println("g a Palau-flagged ship carrying grain, killing a port worker and injuring five crew members. (Reuters)"); 
                     break;
case 8:
                     System.out.println("Nothing significant to report");
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
System.out.println("The World Bank approves a new financial intermediary fund consisting of grants from the United States, Japan, Canada, and other countries coupled with interest from frozen Russian assets to give to Ukraine as part of a $50 billion loan. (Reuters) Ukraine's Coordination Headquarters for the Treatment");
System.out.println(" of Prisoners of War confirms the death of journalist Victoria Roshchyna, who had been held prisoner by Russia since August 2023. (The Kyiv Independent)"); 
                     break;
case 11:
System.out.println("Battle of Toretsk The military administrator of the city of Toretsk in Donetsk Oblast, Ukraine, reports that more than half of the city has been taken by Russian Armed Forces, with the Armed Forces of Ukraine fighting back at eight different locations. (Reuters) "); 
                     break;
case 12:
System.out.println("Local media outlets report that Ukrainian military recruitment officers raided shopping centers, bars, restaurants, and a large concert venue across several Ukrainian cities including Kyiv, Dnipro, and Kharkiv to detain men not in compliance with conscription orders. (AP) "); 
                     break;
case 13:
System.out.println("Foreign involvement in the Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy states that North Korean troops have been deployed to Ukraine to fight alongside the Russian military. (Reuters)"); 
                     break;
case 14:
System.out.println("Southern Ukraine campaign Russian forces claim that they took the village of Levadne in Zaporizhzhia Oblast, Ukraine. (Voice of America)"); 
                     break;
case 15:
System.out.println("Eastern Ukraine campaign Governor of Kharkiv Oblast Oleh Syniehubov orders the mandatory evacuation of all civilians from Kupiansk and Borova in Kharkiv Oblast, Ukraine. (Reuters)"); 
                     break;
case 16:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, North Korea–Ukraine relations Ukrainian President Volodymyr Zelenskyy says that North Korea has now become directly involved in the war in Ukraine, with a senior Ukrainian intelligence official saying that around 3,000 North Korean troops are c");
System.out.println("urrently in Russia and are training for deployment to Russian-occupied territories. (Politico) United States and the Russian invasion of Ukraine U.S. President Joe Biden announces a new $425 million military aid package for Ukraine, containing long-range weaponry. (The Kyiv Independent)"); 
                     break;
case 17:
                     System.out.println("Nothing significant to report");
                     break;
case 18:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, North Korea–Ukraine relations The South Korean National Intelligence Service says that North Korea has started sending troops to fight with Russia in Ukraine. South Korean President Yoon Suk Yeol calls for a security meeting and says the intern");
System.out.println("ational community must respond with all available means. (BBC)"); 
                     break;
case 19:
                     System.out.println("Nothing significant to report");
                     break;
case 20:
                     System.out.println("Nothing significant to report");
                     break;
case 21:
                     System.out.println("Nothing significant to report");
                     break;
case 22:
                     System.out.println("Nothing significant to report");
                     break;
case 23:
System.out.println("Eastern Ukraine campaign The Russian Defense Ministry claims that Russian forces have captured the villages of Mykolaivka and Serebrianka in Donetsk Oblast, while Ukrainian military newspage DeepState reports heavy conflict surrounding Selydove. (Reuters) Foreign involvement in the Russian invasion ");
System.out.println("of Ukraine The U.S. State Department reports that it has confirmed evidence that North Korean troops are now present in Russia and are preparing to travel to the battlefield in Ukraine. South Korea says that Pyongyang has promised to send up to 10,000 troops to support the war effort. (The Guardian)");
System.out.println(" United States and the Russian invasion of Ukraine The U.S. Defense Department finalizes a US$20 billion loan to Ukraine for military and economic support as part of a collective US$50 billion loan between G7 members. (Reuters) "); 
                     break;
case 24:
System.out.println("Eastern Ukraine campaign The Armed Forces of Ukraine reports that Russian Armed Forces have made significant advances in the strategic city of Selydove, predicting that it could be captured in a few days. (Euronews)"); 
                     break;
case 25:
System.out.println("2024 Kursk offensive, Foreign involvement in the Russian invasion of Ukraine Ukraine reports that the first North Korean units have entered the active warzones in Russia's Kursk Oblast. The North Korean soldiers are reportedly under the command of Deputy Defence Minister Yunus-bek Yevkurov. (Yonhap ");
System.out.println("News Agency) Dnipro strikes A Russian missile attack on a residential area in Dnipro, central Ukraine, kills five people and injures 21 others. (AP) Kyiv strikes, Attacks on civilians in the Russian invasion of Ukraine One person is killed and five others are injured when a Russian drone strikes a r");
System.out.println("esidential building in Solomianskyi District, Kyiv, Ukraine. (Reuters)"); 
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
                     System.out.println("Nothing significant to report");
                     break;
case 28:
System.out.println("Kharkiv strikes At least 21 people are injured when Russian guided bombs and rocket artillery hit Kharkiv Oblast, Ukraine. (Reuters) "); 
                     break;
case 29:
System.out.println("Eastern Ukraine campaign Russia claims that it has taken the cities of Selydove and Hirnyk in Donetsk Oblast, Ukraine, with open-source data indicating that Russian forces are advancing at their fastest pace in at least one year amid signs of North Korean involvement in the war. (Reuters) Kyiv strik");
System.out.println("es, Attacks on civilians in the Russian invasion of Ukraine At least six people are killed and 13 others are injured in overnight Russian attacks in Kharkiv, Kherson, and Kyiv, Ukraine. (Reuters) Head of the Chechen Republic Ramzan Kadyrov vows to retaliate harshly against Ukraine after a drone stri");
System.out.println("ke targeted a Special Forces University in Gudermes, Chechnya, Russia, representing the first known drone attack in Chechnya by the Armed Forces of Ukraine. (Reuters), (The Kyiv Independent)"); 
                     break;
case 30:
                     System.out.println("Nothing significant to report");
                     break;
case 31:
System.out.println("Ukrainian President Volodymyr Zelenskyy strongly condemns the United States and European nations for making zero response to the Russian deployment of North Korean soldiers against Ukraine. (Reuters) Kharkiv strikes A Russian glide bomb strikes a residential building in Kharkiv, killing three people");
System.out.println(" and injuring 35 others, according to Ukrainian Interior Minister Ihor Klymenko. (AP)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;
case 11:
                    System.out.println("Enter a day in November 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("Nothing significant to report");
                     break;
case 2:
                     System.out.println("Nothing significant to report");
                     break;
case 3:
System.out.println("Eastern Ukraine campaign Pokrovsk offensive The Russian Ministry of Defense and Ukrainian military news site DeepStateUA report that Russia has captured the settlement of Vyshneve in Donetsk Oblast, Ukraine, with Russian troops advancing towards Hryhorivka to the west. (Reuters)"); 
                     break;
case 4:
System.out.println("2024 Kursk offensive Ukraine says that its forces have engaged North Korean troops for the first time in Kursk Oblast, Russia. (The Independent)"); 
                     break;
case 5:
System.out.println("Zaporizhzhian strikes Six people are killed and at least 20 others are injured in a Russian missile strike on Zaporizhzhia, Ukraine. (Reuters)"); 
                     break;
case 6:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War U.S. President Joe Biden announces the expedited granting of more than US$6 billion in military aid to Ukraine prior to president-elect Donald Trump's inauguration in January. (Reuters)"); 
                     break;
case 7:
System.out.println("Zaporizhzhia strikes Four people are killed and 33 others are injured when Russian guided bombs hit residences, an apartment building, and a medical center in Zaporizhzhia, Ukraine. (Reuters)"); 
                     break;
case 8:
System.out.println("Kharkiv strikes, Kyiv strikes, Odesa strikes One person is killed and at least 38 others are injured in Russian airstrikes in Kharkiv, Kyiv, and Odesa, Ukraine. (AP)"); 
                     break;
case 9:
                     System.out.println("Russian President Vladimir Putin signs into law the North Korean–Russian Treaty on Comprehensive Strategic Partnership, a mutual defense pact with North Korea. (Reuters)");
                     break;
case 10:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine November 2024 Moscow drone attack One person is injured and at least 36 flights are diverted when 34 Ukrainian drones strike Moscow, Russia. (CBC News) "); 
                     break;
case 11:
System.out.println("Mykolaiv strikes, Zaporizhzhia strikes Five people are killed and 18 others, including five children, are injured in Russian air strikes on Mykolaiv and Zaporizhzhia, Ukraine. (DW) (Arab News)"); 
                     break;
case 12:
                     System.out.println("Nothing significant to report");
                     break;
case 13:
System.out.println("Nothing significant to report" ); break; case 14: System.out.println("Eastern Ukraine campaign The Russian Defence Ministry claims that Russian forces have captured the village of Voznesenka in Donetsk Oblast, Ukraine. (Anadolu Agency) Odesa strikes, Russian strikes against Ukrainian infrastructure ");
System.out.println("One person is killed and ten others are injured in Russian airstrikes on an apartment building and energy facilities in Odesa, Ukraine. (Reuters)"); 
                     break;
case 15:
System.out.println("Austrian energy company OMV announces, that Russian state-owned energy company Gazprom will stop supplying natural gas to Austria, who receives their natural gas primarily from Russia, starting this weekend. (DW) Russian invasion of Ukraine, Germany–Russia relations German Chancellor Olaf Scholz hol");
System.out.println("ds a telephone call with Russian President Vladimir Putin about the war in Ukraine, their first contact since 2022. Putin tells Scholz that any negotiated settlement to end the war must recognize the territories that Russia has occupied as part of Russia and that Ukraine must abandon its aspiration ");
System.out.println("to join NATO. (AP) (The New York Times)"); 
                     break;
case 16:
                     System.out.println("Nothing significant to report");
                     break;
case 17:
System.out.println("17 November 2024 Russian strikes on Ukraine Russia launches its largest aerial attack on Ukraine in months. According to President of Ukraine Volodymyr Zelenskyy, around 120 missiles and 90 drones were launched, damaging energy infrastructure across the country, killing at least seven people, and ca");
System.out.println("using widespread damage. (CNN) (BBC News) Ten people are killed and 52 others are injured in a Russian missile strike on an apartment building in Sumy, Ukraine. (Reuters) United States President Joe Biden lifts restrictions on the Ukrainian use of U.S. weapons for deep attacks inside Russia, with Uk");
System.out.println("rainian forces planning to use the weapons in long-distance attacks in the coming days. (Reuters)"); 
                     break;
case 18:
System.out.println("Odesa strikes Russian forces launch a missile attack on the city of Odesa, Ukraine, for the second consecutive day, killing at least ten civilians, injuring dozens of others and damaging civilian infrastructure, including residential buildings. (Ukrainska Pravda) Ukrainian energy crisis, 17 November");
System.out.println(" 2024 Russian strikes on Ukraine Ukraine re-implements nationwide rolling blackouts primarily due to yesterday's destruction of energy infrastructure by Russian airstrikes. (Reuters)"); 
                     break;
case 19:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War United States and the Russian invasion of Ukraine U.S. President Joe Biden approves of sending non-persistent anti-personnel mines to Ukraine, with Ukraine committing to not use them in areas with civilians. (Al Jazeera) The United Kingdom and F");
System.out.println("rance both prepare new military packages containing long-range missiles to send to Ukraine following President Biden's decision to allow deep strikes into Russian territory using American weapons. (Newsweek) Attacks in Russia during the Russian invasion of Ukraine Ukraine launches ATACMS ballistic m");
System.out.println("issiles at targets in Bryansk Oblast, Russia, according to the Russian Defence Ministry. It is the first time that Ukraine has used the American-supplied missiles to strike targets inside Russia. (BBC News) Nuclear risk during the Russian invasion of Ukraine, Russia and weapons of mass destruction R");
System.out.println("ussian President Vladimir Putin signs a decree that allows Russia to use nuclear weapons in response to conventional attacks by a non-nuclear state supported by a nuclear power. (Reuters)"); 
                     break;
case 20:
System.out.println("United Kingdom and the Russian invasion of Ukraine British-produced Storm Shadow cruise missiles are launched into Russian territory by Ukraine for the first time, following approval by the Starmer cabinet. (The Guardian) The U.S., Italian, Greek, and Spanish governments temporarily close their emba");
System.out.println("ssies in Kyiv, Ukraine, following threats of a significant air attack from Russia. (The Washington Times) The embassies of Kazakhstan and Kyrgyzstan urge their citizens to leave areas near Ukrainian combat zones or to leave Ukraine altogether amid an escalating risk of Russian retaliatory attacks. (");
System.out.println("The Times of Central Asia) "); 
                     break;
case 21:
System.out.println("Dnipro strikes, Russian strikes against Ukrainian infrastructure Russia strikes Dnipro, Ukraine, with a projectile stated by Russian President Vladimir Putin to be a new Oreshnik intermediate-range ballistic missile (IRBM) model. This confirms earlier reports from the United States and other western");
System.out.println(" officials, who said that Russia had used an IRBM after initial reports misidentified the missile as a RS-26 Rubezh intercontinental ballistic missile. (Reuters) (CBS News) (BBC News) Hungary and the Russian invasion of Ukraine Hungary announces the deployment of a missile defense system on its bord");
System.out.println("er with Ukraine, saying that the threat of escalation with Russia is now greater than ever. (Reuters) United Kingdom and the Russian invasion of Ukraine Russian ambassador to the United Kingdom Andrey Kelin says that the UK is now directly involved in the war in Ukraine following yesterday's use of ");
System.out.println("British Storm Shadow cruise missiles by Ukraine to strike targets inside Russia. (Sky News)"); 
                     break;
case 22:
System.out.println("2024 Kursk offensive Russian human rights commissioner Tatyana Moskalkova states that 46 of one thousand Russian civilians who claimed to have been forcibly relocated by Ukraine into its territory have been returned, following extensive negotiations involving the Red Cross. (Reuters) Two people are ");
System.out.println("killed and 12 others are injured in a Russian drone attack on civilian infrastructure in Sumy, Ukraine. (Reuter"); 
                     break;
case 23:
                     System.out.println("The United States Intelligence Community declassifies a document which accuses Russia of assassinating political opponents to President Vladimir Putin abroad. (Kyiv Independent) (Bloomberg)");
                     break;
case 24:
                     System.out.println("Nothing significant to report");
                     break;
case 25:
                     System.out.println("Nothing significant to report");
                     break;
case 26:
System.out.println("Battle of Kurakhove Russian forces enter the city of Kurakhove in Donetsk Oblast, Ukraine, with heavy fighting reportedly underway. (Al Arabiya)"); 
                     break;
case 27:
                     System.out.println("Nothing significant to report");
                     break;
case 28:
System.out.println("Eastern front of the Russian invasion of Ukraine The Russian Defence Ministry claims that Russian forces have taken the village of Nova Illinka in Donetsk Oblast, Ukraine. (Reuters) Russian strikes against Ukrainian infrastructure, Ukrainian energy crisis Russia launches a massive missile and drone ");
System.out.println("attack on civilian and critical infrastructure in Ukraine, injuring at least five people and causing blackouts for more than a million households. (CNN)"); 
                     break;
case 29:
System.out.println("Russian invasion of Ukraine, Ukraine–NATO relations Peace negotiations in the Russian invasion of Ukraine Ukrainian president Volodymyr Zelenskyy says that his country is ready to agree to a ceasefire if NATO protects parts of Ukraine. (Kyiv Post)"); 
                     break;
case 30:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 30:");
                    }
                    break;
case 12:
                    System.out.println("1. Enter a day in December 2024:");
                    day=s.nextInt();
                    switch(day){
case 1:
                     System.out.println("U.S. National Security Advisor Jake Sullivan says that the United States will not return the nuclear weapons that they dismantled to Ukraine. (Reuters)");
                     break;
case 2:
                     System.out.println("U.S. Secretary of State Antony Blinken announces that the United States will provide Ukraine with a $725 million weapons package. (Reuters)");
                     break;
case 3:
                     System.out.println("Nothing significant to report");
                     break;
case 4:
                     System.out.println("Nothing significant to report");
                     break;
case 5:
                     System.out.println("Nothing significant to report");
                     break;
case 6:
System.out.println("Southern front of the Russian invasion of Ukraine, Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike kills ten civilians in Zaporizhzhia, Ukraine, and injures four others, including two children. Separately, a missile attack on an administrative building in Kryvyi Rih,");
System.out.println(" Ukraine, kills two people and injures 16 others. (Reuters)"); 
                     break;
case 7:
                     System.out.println("Nothing significant to report");
                     break;
case 8:
                     System.out.println("Ukrainian President Volodymyr Zelenskyy says that 43,000 Ukrainian soldiers have been killed in action since Russia invaded Ukraine in 2022 and that 370,000 soldiers have been injured, while estimating the number of Russian casualties at 198,000 soldiers killed and more than 550,000 soldiers injured");
System.out.println(". (Politico)");
                     break;
case 9:
                     System.out.println("Nothing significant to report");
                     break;
case 10:
System.out.println("Southern front of the Russian invasion of Ukraine A Russian missile strike on a private clinic in Zaporizhzhia, Ukraine, kills four civilians and injures 20 others. (Interfax Ukraine) (Al Arabiya)"); 
                     break;
case 11:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War United States and the Russian invasion of Ukraine The United States Department of State approves a $266.4 million sale of F-16 maintenance equipment to Ukraine. (Ukrainska Pravda) (DSCA) (Newsweek) The Parliament of Canada approves the allocatio");
System.out.println("n of CA$764 million (US$587 million) in military aid to Ukraine. (Ukrainska Pravda)"); 
                     break;
case 12:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Four police officers are injured in a drone attack on the barracks of a police regiment building in Grozny, Chechnya, Russia. (Kyiv Independent)"); 
                     break;
case 13:
System.out.println("Moldova and the Russo-Ukrainian War The Parliament of Moldova votes in favor of declaring a 60-day national state of emergency beginning on December 16 due to Ukraine not renewing its transit contract with Gazprom to deliver Russian gas to Moldova. (Reuters) Russian strikes against Ukrainian infrast");
System.out.println("ructure Russia launches one of its largest attacks on the Ukrainian energy infrastructure since the conflict began, with about 290 missiles fired and drones striking multiple regions. The Russian Defense Ministry claims that the attack was in response to a recent Ukrainian ATACMS attack on Taganrog-");
System.out.println("Central air base in Rostov Oblast, Russia. (The Kyiv Independent) (UNN)"); 
                     break;
case 14:
                     System.out.println("Nothing significant to report");
                     break;
case 15:
                     System.out.println("Nothing significant to report");
                     break;
case 16:
                     System.out.println("Nothing significant to report");
                     break;
case 17:
System.out.println("Russian Lieutenant General Igor Kirillov, head of the NBC Protection Troops, and his assistant are assassinated by an IED hidden inside of an e-scooter in Moscow, Russia. A Ukrainian source claims that the Security Service of Ukraine is responsible for the killings, after Kirillov was charged in abs");
System.out.println("entia yesterday for the use of chemical weapons, which made him a legitimate target. Dmitry Medvedev, deputy chairman of the Security Council of Russia, says that the Ukrainian leadership would face an imminent revenge for the killings. (BBC News) (Deccan Herald) Military aid to Ukraine during the R");
System.out.println("usso-Ukrainian War, Russia–NATO relations NATO's Security Assistance and Training for Ukraine command center in Wiesbaden, Germany, takes over coordination of Western military support to Ukraine from the United States. (Reuters)"); 
                     break;
case 18:
                     System.out.println("Nothing significant to report");
                     break;
case 19:
                     System.out.println("British defence secretary John Healey announces a proposal to send military advisors to train Ukrainian forces. (BBC News)");
                     break;
case 20:
System.out.println("A Ukrainian missile strike kills six people and injures 10 others in Rylsk, Kursk Oblast, Russia, according to acting Kursk Oblast governor Alexander Khinshtein. Russia says that it will raise the issue of the missile strike at the United Nations Security Council. (Reuters) Kryvyi Rih strikes, Kyiv ");
System.out.println("strikes At least one person is killed and eight others are injured in Russian missile strikes on civilian infrastructure in Kryvyi Rih and Kyiv, Ukraine. (The Kyiv Independent) (Reuters)"); 
                     break;
case 21:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine At least seven Ukrainian drones strike Kazan, Russia, six of which reportedly hit residential areas, including a 32-story apartment building. (Ukrainska Pravda) (Reuters)"); 
                     break;
case 22:
System.out.println("Slovak Prime Minister Robert Fico holds a previously unannounced meeting with Russian President Vladimir Putin at the Kremlin in Moscow, Russia. (The Moscow Times) "); 
                     break;
case 23:
                     System.out.println("Nothing significant to report");
                     break;
case 24:
                     System.out.println("Nothing significant to report");
                     break;
case 25:
                     System.out.println("A series of Russian ballistic missile and drone strikes target critical energy infrastructure in cities across in Ukraine, killing at least two people, injuring 20 others, and causing widespread emergency blackouts. Ukrainian President Volodymyr Zelenskyy condemns Russian President Vladimir Putin fo");
System.out.println("r the inhumane attacks on Ukrainian infrastructure. (The Kyiv Independent) (The Guardian) (RTÉ)");
                     break;
case 26:
                     System.out.println("Nothing significant to report");
                     break;
case 27:
System.out.println("South Korea confirms the first capture of a North Korean soldier fighting against Ukrainian forces in Kursk Oblast, Russia, with the soldier later dying from his injuries. (BBC News) (Reuters) "); 
                     break;
case 28:
                     System.out.println("Russian company Gazprom announces the supply of gas to Moldova will cease on January 1, 2025, alleging fails to fulfill its payment obligations. The Moldovan Prime Minister, Dorin Recean, accuses the Russian Government of deliberately weaponising energy flows to destabilise the country. (Euronews).");
                     break;
case 29:
                     System.out.println("Nothing significant to report");
                     break;
case 30:
System.out.println("Prisoners of war in the Russian invasion of Ukraine Russia and Ukraine exchange hundreds of prisoners of war in a deal brokered by the United Arab Emirates. Ukraine says that many of those released by Russia are soldiers captured during the Siege of Mariupol in 2022. (BBC News)"); 
                     break;
case 31:
                     System.out.println("Nothing significant to report");
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                    }
                    break;


                 }
                 break;
case 2025:
                //month in 2025
                 
                System.out.println("1. Enter a month in 2025(1-January,2-February,....,12-December):");
                month=s.nextInt();
                switch(month){
                   //day in 2025
case 1:
                   System.out.println("1. Enter a day in January 2025(1-31):");
                   day=s.nextInt();
                     switch(day){
case 1:
                        System.out.println("Russia's gas firm Gazprom suspends exports of Russian natural gas through Ukrainian pipelines after Ukraine refused to renew the transit agreement between its operator Naftogaz and Gazprom. However, Hungary will continue receiving Russian natural gas via the TurkStream pipeline. (Reuters)");
                        break;
case 2:
                        System.out.println("Ukrainian president Volodymyr Zelenskyy says that Ukraine will pledge support to the Syrian transitional government. (The Press Democrat)");
                        break;
case 3:
                        System.out.println("Ukrainian President Volodymyr Zelenskyy says that the country will not hold presidential elections as long as the country is under martial law, even if Russia puts it as a pre-condition for negotiations. (Kyiv Independent)");
                        break;
case 4:
System.out.println("Eastern Ukraine campaign, Journalists killed during the Russo-Ukrainian War A war correspondent for the Russian newspaper Izvestia is killed in a Ukrainian drone strike in Donetsk Oblast, Ukraine. (Reuters) The Russian Armed Forces claims to have shot down eight American ATACMS missiles fired by Ukr");
System.out.println("aine and vows retaliation. (CNN)"); 
                        break;
case 5:
System.out.println("Kursk offensive The Ukrainian Army launches a new offensive in Kursk Oblast, Russia. (BBC News)"); 
                        break;
case 6:
System.out.println("Kherson strikes, Attacks on civilians in the Russian invasion of Ukraine A Russian drone attacks a civilian passenger bus in Kherson, Ukraine, reportedly killing at least one person and injuring at least nine others. (Reuters)"); 
                        break;
case 7:
                        System.out.println("Nothing significant to report");
                        break;
case 8:
System.out.println("Zaporizhzhia strikes, Attacks on civilians in the Russian invasion of Ukraine Russian forces attack an industrial facility in Zaporizhzhia, Ukraine, killing 13 people and injuring 18 others. Further strikes on Zaporizhzhia with guided aerial bombs kill 13 more people and injure 32 others. (Ukrainska");
System.out.println(" Pravda) (Ukrainska Pravda 2)"); 
                        break;
case 9:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian artillery strikes kill two people in Siversk, Donetsk Oblast, Ukraine, according to the region's governor. In the Russian-controlled area of Kamianka-Dniprovska, Zaporizhzhia Oblast, Ukraine, the region's Russia-appointed governor says ");
System.out.println("that two people were killed by Ukrainian artillery strikes. (Reuters)"); 
                        break;
case 10:
                        System.out.println("The United States government imposes a new series of sanctions targeting Russia's energy sector, including the Gazprom Neft and Surgutneftegas oil companies. (CNN)");
                        break;
case 11:
System.out.println("Eastern Ukraine campaign The Russian Army says that it has gained control of the settlement of Shevchenko in Donetsk Oblast, Ukraine. (Anadolu Agency) Kursk offensive, North Korean involvement in the Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy announces that Ukraine has captu");
System.out.println("red two North Korean soldiers in healthy condition in Kursk Oblast, Russia, for the first time since North Korea entered the war, as the two previous North Korean prisoners of war died of their injuries shortly following their capture. (Reuters)"); 
                        break;
case 12:
                        System.out.println("Nothing significant to report");
                        break;
case 13:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Russia accuses Ukraine of targeting the Russkaya compressor station in the Krasnodar Krai, which feeds gas for the TurkStream pipeline, in a failed drone attack two days ago. (S&P Global)"); 
                        break;
case 14:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine strikes targets in the Republic of Tatarstan and Bryansk, Saratov, and Tula oblasts, Russia, with more than 200 drones and five ATACMS ballistic missiles, hitting ammunition depots, industrial plants and a refinery, in what Ukraine say");
System.out.println("s is its most massive and deepest attack inside Russia so far. (CNN) (BBC News) "); 
                        break;
case 15:
                        System.out.println("Russia launches a major ballistic and cruise missile attack on regions across Ukraine, targeting energy production and compelling authorities to shut down the power grid. (AP)");
                        break;
case 16:
                        System.out.println("British Prime Minister Keir Starmer visits Kyiv, Ukraine, to sign a 100-year agreement with Ukraine that will formalize British economic and military support for Ukraine. (Sky News) (BBC News)");
                        break;
case 17:
                        System.out.println("Iranian president Masoud Pezeshkian and Russian president Vladimir Putin sign the Iranian–Russian Treaty on Comprehensive Strategic Partnership. The 20-year deal will see cooperation between the two countries in multiple areas, including nuclear energy, counterterrorism, and environmental issues. (M");
System.out.println("iddle East Eye)");
                        break;
case 18:
System.out.println("Four people are killed and 14 others are injured in a Russian ballistic missile strike on Kryvyi Rih, Ukraine, according to the Governor of Dnipropetrovsk Oblast Serhiy Lysak. (Euronews) Russian strikes against Ukrainian infrastructure At least four people are killed in Russian missile and drone att");
System.out.println("acks on Kyiv, Ukraine. (Al Jazeera) "); 
                        break;
case 19:
                        System.out.println("Nothing significant to report");
                        break;
case 20:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukrainian drones attack industrial facilities in Tatarstan, Russia, prompting the Russian Federal Air Transport Agency to temporarily suspend flights at Kazan International Airport in Kazan and Begishevo Airport in Nizhnekamsk. (ABC News) "); 
                        break;
case 21:
                        System.out.println("Nothing significant to report");
                        break;
case 22:
                        System.out.println("Nothing significant to report");
                        break;
case 23:
                        System.out.println("Nothing significant to report");
                        break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A Ukrainian drone strike targets an oil refinery in Ryazan Oblast, Russia, in one of the largest Ukrainian drone attacks inside Russia of the conflict to date. The Russian military says it shot down at least 121 drones over 13 regions overnigh");
System.out.println("t. (BBC News) Kyiv strikes A Russian drone strikes a ten-storey apartment building in Fastiv, Kyiv Oblast, Ukraine, killing at least three people. (Euronews) Mobilization in Ukraine Ukraine finalizes military reforms aimed at recruiting 18- to 25-year-olds to the armed forces, penalizing draft dodge");
System.out.println("rs, and lowering the minimum compulsory military service age to 25 from 27. (The Kyiv Independent) The Ukrainian Coordination Headquarters for the Treatment of Prisoners of War announces that, with assistance from the International Committee of the Red Cross, the bodies of 757 Ukrainian soldiers hav");
System.out.println("e been returned to Ukraine. (The Kyiv Independent)"); 
                        break;
case 25:
                        System.out.println("Nothing significant to report");
                        break;
case 26:
System.out.println("Velyka Novosilka offensive The Russian Ministry of Defence claims that Russian forces have captured the village of Velyka Novosilka, Donetsk Oblast. (Mathrubhumi)"); 
                        break;
case 27:
                        System.out.println("Nothing significant to report");
                        break;
case 28:
                        System.out.println("Nothing significant to report");
                        
                        break;
case 29:
System.out.println("Battle of Chasiv Yar Russian forces capture the city of Chasiv Yar in Donetsk Oblast, Ukraine, after a year of intense fighting for control of the front line city. (The Moscow Times)"); 
                        break;
case 30:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian drone strikes a multi-storey apartment building in Sumy, Ukraine, killing nine people and injuring 13 others. (Reuters)"); 
                        break;
case 31:
System.out.println("Odesa strikes Russian forces launch ballistic missiles at the centre of Odesa and its port, severely damaging numerous civilian buildings, including the historic Bristol Hotel. At least two people are reportedly injured. (Reuters)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 31:");
                                }
                                break;
case 2:
                   System.out.println("1. Enter a day in February 2025(1-24) :");
                   day=s.nextInt();
                   switch(day){
case 1:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on a residential building in Poltava, Ukraine, reportedly kills at least fourteen people and injures at least 17 others. A separate strike kills three police officers in Sumy Oblast. (Reuters)"); 
                        break;
case 2:
                        System.out.println("Nothing significant to report");
                        break;
case 3:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A bomb explodes inside a building in Moscow, Russia, killing two people and wounding three. The presumed main target, Armen Sarkisyan, a pro-Russia leader in the Donbas, is among the dead. (Reuters)"); 
                        break;
case 4:
System.out.println("Russian invasion of Ukraine Russian attacks on civilians in the Russo-Ukrainian War A Russian missile strikes a residential building in Izium, Kharkiv Oblast, Ukraine, killing four people and injuring twenty others. (Ukrainska Pravda) Peace negotiations in the Russian invasion of Ukraine Ukraine Pre");
System.out.println("sident Volodymyr Zelenskyy says in a interview with British journalist Piers Morgan that he is ready for direct talks with Russian President Vladimir Putin if it is a setup to end the war. (Kyiv Independent)"); 
                        break;
case 5:
                        System.out.println("Nothing significant to report");
                        break;
case 6:
System.out.println("Attacks on civilians during the Russian invasion of Ukraine Three people are killed in a Russian guided bomb attack that destroyed a residential building in Myropillia, Sumy Oblast, Ukraine, according to Ukrainian officials. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The Ukrain");
System.out.println("ian Air Force receives the first shipment of Mirage 2000 fighter jets from France and more F-16 Fighting Falcons from the Netherlands. (DW)"); 
                        break;
case 7:
System.out.println("Battle of Toretsk Russia says its forces have taken full control of Toretsk, Donetsk Oblast, after months of urban warfare. (Reuters)"); 
                        break;
case 8:
                        System.out.println("Nothing significant to report");
                        break;
case 9:
                        System.out.println("Nothing significant to report");
                        break;
case 10:
                        System.out.println("Nothing significant to report");
                        break;
case 11:
                        System.out.println("Nothing significant to report");
                        break;
case 12:
System.out.println("Kyiv strikes Russian forces launch an overnight ballistic missile attack on Kyiv, Ukraine, killing one person and injuring four others. (Reuters) United States and the Russian invasion of Ukraine, Peace negotiations in the Russian invasion of Ukraine After holding a telephone call with Russian presi");
System.out.println("dent Vladimir Putin, U.S. president Donald Trump says negotiations to end the war will start immediately. (CNN) (Euronews)"); 
                        break;
case 13:
System.out.println("Chernobyl Nuclear Power Plant drone strike A drone strikes the New Safe Confinement structure housing the site of the Chernobyl disaster. Ukrainian President Volodymyr Zelenskyy states that a Russian combat drone caused significant damage to the structure, but did not produce an increase in external");
System.out.println(" radiation levels. (CNN)"); 
                        break;
case 14:
                        System.out.println("Nothing significant to report");
                        break;
case 15:
System.out.println("Russia–United States relations Russian Foreign Minister Sergey Lavrov and U.S. Secretary of State Marco Rubio speak by telephone about the Russo-Ukrainian War, the Gaza war, the sanctions against Russia, and removing restrictions on each country's diplomatic missions. They also discuss preparations ");
System.out.println("for a high-level summit in Saudi Arabia. This is the first time the U.S. and Russia had contact at the foreign minister level in almost two years. (Financial Times)"); 
                        break;
case 16:
System.out.println("Mykolaiv strikes, Russian strikes against Ukrainian infrastructure Russia launches drone strikes across Ukraine, injuring at least one person and damaging a thermal power station in Mykolaiv, leaving 46,000 people without heat. Ukraine says that it shot down 95 of 143 drones while disrupting 46 othe");
System.out.println("rs by electronic countermeasures. (Reuters)"); 
                        break;
case 17:
System.out.println("2024 Kharkiv offensive Russia says its forces have captured the village of Fyholivka in Kharkiv Oblast, Ukraine. (Reuters)"); 
                        break;
case 18:
                        System.out.println("Nothing significant to report");
                        break;
case 19:
System.out.println("Russian strikes against Ukrainian infrastructure At least one person is killed and 14 others are injured in Russian missile and drone strikes across Ukraine, including a large drone attack on energy infrastructure in Odesa that leaves 160,000 residents without heating and electricity. (The Kyiv Inde");
System.out.println("pendent)"); 
                        break;
case 20:
                        System.out.println("Nothing significant to report");
                        break;
case 21:
                        System.out.println("Nothing significant to report");
                        break;
case 22:
                        System.out.println("Nothing significant to report");
                        break;
case 23:
                        System.out.println("Protests are held across Europe and Canada to mark the 3rd year anniversary of the Russian invasion of Ukraine. (Kyiv Independent)");
                        break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine The Ryazan Refinery in Ryazan, Russia, suspends operations after an overnight drone attack by Ukraine destroys the main crude distillation unit at the facility. Locals report hearing at least five explosions during the attack. (Reuters)"); 
            break;
            default:
                      System.out.println("Select a day from 1 to 24:");
                   }
                   break;
                   


                }
          }
          break;
case 2:
Random rand = new Random();
int randomIndex = rand.nextInt(validDates.size());
EventDate randomDate = validDates.get(randomIndex);

System.out.println("\n Exploring a random event...");
System.out.printf(" Date: %d-%02d-%02d\n", randomDate.year, randomDate.month, randomDate.day);

// Simulate option 1 automatically by assigning values
year = randomDate.year;
month = randomDate.month;
day = randomDate.day;
switch(year){
  case 2022:
       //month in 2022
       System.out.println("1. Enter a month in 2022(2-February,....,12-December):");
       month=s.nextInt();
       switch(month){
          //day in 2022
       case 2:
          System.out.println("1. Enter a day in February 2022(24-28) :");
          day=s.nextInt();
          switch(day){
  case 24:
System.out.println("Battle of Chernobyl:Russian troops enter the Chernobyl Exclusion Zone. Ukraine says that Russian forces have captured the Chernobyl Nuclear Power Plant. Ukrainian President Volodymyr Zelenskyy calls the attack on Chernobyl a 'declaration of war on all of Europe'. (Daily Sabah) (The Independent) (Uni");
System.out.println("an) Attack on Snake IslandUkraine reports that Russian Navy warships have attacked Snake Island near the Danube Delta. (IndiaTV) Battle of SumyRussian troops enter Sumy and take control of the road leading from Kyiv to Moscow. Battles for strategic cities on the railway to Sumy are also underway. (N");
System.out.println("ovoye Vremya) Battle of Antonov AirportRussian gunships bombard Hostomel Airport near Kyiv. Ukraine says that three helicopters were shot down in defence. Russian Airborne Forces seized control of the airport, but the Ukrainian Ground Forces have recaptured the airport. (The Moscow Times) (Reuters) ");
System.out.println("(Ukrinform) An-225 Mriya, the largest aircraft in the world by weight and by wingspan, is destroyed during a Russian air strike on the suburb of Kyiv. The plane did not manage to leave Hostomel before hostilities began. (Radio Liberty Ukraine)Battle of Kyiv, Kyiv Offensive The Mayor of Kyiv, Vitali ");
System.out.println("Klitschko, announces a curfew in the capital from 10 p.m. to 7 a.m. (Reuters) Russian President Vladimir Putin orders a military operation to 'demilitarise and denazify' Ukraine. Putin also warns of 'consequences you have never seen in history' for anyone who tries to interfere or 'create threats fo");
System.out.println("r our country'. (CNN) (AP) Ukraine confirms that Russian Ground Forces have entered Luhansk, Sumy, Kharkiv, Kherson, Chernihiv, and Zhytomyr Oblasts and have also crossed the border from occupied Crimea. Russian troops also attack the port cities of Odesa and Mariupol in amphibious landings. (CNN) (");
System.out.println("The Business Standard) Russia announces that they have taken control of the North Crimean Canal in the Kherson Oblast and have restored the supply of water to Crimea. (Reuters) Russian ballistic and cruise missiles strike multiple Ukrainian cities and airfields, with eighteen people being killed in ");
System.out.println("Odesa. A missile also strikes the Ministry of Defence intelligence headquarters in Kyiv. (CNN) (NDTV) (Reuters) A Ukrainian Air Force Antonov An-26 is shot down and crashes in Obukhiv, killing five crew members, according to the State Emergency Service of Ukraine. (Interfax) An attack on a military ");
System.out.println("unit in Podilsk kills six civilians and injures seven others. (BBC News) Ukraine's military reports that at least 137 of its soldiers have been killed in Eastern Ukraine, with a senior Ukrainian government official estimating that hundreds of Ukrainian troops have been killed by airstrikes. Ukraine'");
System.out.println("s military also says that 50 Russian soldiers have been killed in action. (The Wall Street Journal) (CNN) (The Guardian) Ukrainian President Volodymyr Zelenskyy declares martial law across the country in response to the invasion. Zelenskyy also orders a general military mobilization of fit-to-serve ");
System.out.println("Ukrainian citizens, with men between the ages of 18 and 60 years prohibited from leaving the country. (TASS) (CNN) The Russian Armed Forces says that its 'lightning offensive' has crippled the Ukrainian military and suppressed its air defense systems. However, the Ukrainian Air Force says that it is");
System.out.println(" repelling Russian invaders. (TASS) (BBC News) The Russian Defence Ministry says that it has destroyed 83 Ukrainian 'above-ground military facilities', including 11 aerodromes. (Reuters) Ukraine says that it has shot down six Russian warplanes and two helicopters, and destroyed dozens of enemy armor");
System.out.println("ed vehicles, according to its Joint Centre of Control and Coordination. However, Russian military representatives deny the claims. (Mil.gov.ua) (Firstpost) Russia says that two Russian civilian ships have been hit by anti-ship missiles in the Sea of Azov, causing multiple deaths. Russia subsequently");
System.out.println(" restricts access for civilian vessels on the Sea of Azov. (Ynet) (Reuters) A Turkish-owned vessel is bombed off the coast of Odesa, according to Turkey's Directorate General of Coastal Safety. No casualties are reported. (Daily Sabah) Reactions to the 2021–2022 Russo-Ukrainian crisis Russia–NATO re");
System.out.println("lations Romania, Poland, and the Baltic states agree to trigger article 4 of NATO's North Atlantic Treaty in response to Russian aggression. (ERR) (Digi24) German Foreign Minister Annalena Baerbock states that Germany will launch the full package with the most massive sanctions against Russia. (EURA");
System.out.println("CTIV) Russia–Ukraine relations Ukraine suspends diplomatic relations with Russia in response to the invasion. (The Times of Israel) Lithuanian president Gitanas Nausėda announces that he will sign a decree declaring a state of emergency and asks Seimas to ratify it in an extraordinary session. (ERR)");
System.out.println(" Moldova declares a state of emergency in response to the invasion. Hundreds of Ukrainians are crossing the border, according to President Maia Sandu. (National Post) Ukraine, Belarus and Moldova close their airspaces to commercial aircraft. (ABC News Australia) (Reuters) U.S. President Joe Biden or");
System.out.println("ders Secretary of Defense Lloyd Austin to send 7,000 troops to Germany in order to assist NATO allies. (Reuters) (Army Times)"); 
  break;
case 25:
System.out.println("\nKyiv offensive, Battle of Kyiv: The Ukrainian military says that it has blown up a bridge in order to prevent Russian forces from advancing to Kyiv. (Ukrinform) Ukraine says that Russian troops have entered Kyiv and heavy fighting is underway. Videos on social media show tanks advancing through th");
System.out.println("e city's Obolon neighbourhood. Gunfire and explosions are also reported in the city's Podilskyi District. (BBC News) (The Guardian) The US Department of Defense says that Russia is losing momentum in its attack on Ukraine. (CNN) Millerovo air base attack Ukrainian OTR-21 Tochka missiles attack the M");
System.out.println("illerovo air base in Rostov oblast, Russia, destroying two Russian Air Force warplanes according to Ukrainian officials. Images appear to show the airbase on fire. (Newsweek) (RostovGazeta) Battle of Starobilsk A column of Russian soldiers is defeated by the Ukrainian army in Starobilsk. (Gazeta.ua)");
System.out.println(" Battle of Ivankiv Ukrainian airborne assault troops engage Russian soldiers at Ivankiv and Dymer. (Gazeta.ua) Battle of Chernihiv A captain and corporal from the Russian 11th Guards Air Assault Brigade surrender to the Armed Forces of Ukraine near Chernihiv. (Gazeta.ua) Battle of Sumy Russian force");
System.out.println("s reportedly retreat from Sumy. (Channel 24) Battle of Chernobyl The Ukrainian government's State Nuclear Regulatory Inspectorate says that higher than usual gamma radiation levels have been detected in the Chernobyl Exclusion Zone after the power plant was captured by Russia. (The Telegraph) Battle");
System.out.println(" of Antonov Airport The Russian Defence Ministry says that Russian Airborne Forces have recaptured the strategic Hostomel Airport near Kyiv, after assaulting the airbase with 200 helicopters. (BBC News) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations, 2022 NATO virtual summi");
System.out.println("t During an emergency NATO summit, Secretary General Jens Stoltenberg announces that NATO will provide weapons to Ukraine. He also announces that the NATO Response Force will be activated for the first time in history. (Reuters) (Stars and Stripes) Kazakhstan–Russia relations Kazakhstan will deny Ru");
System.out.println("ssia’s request for troops to join the war. It will also not join Putin’s recognition of Donetsk People's Republic or Luhansk People's Republic. (NBC News) Ukrainian President Volodymyr Zelenskyy accuses European leadership of 'inaction' in face of the Russian invasion, saying 'Like World War II, you");
System.out.println(" said never again, but here it is again and you're not doing enough to respond'. Zelenskyy also calls on citizens across the European Union to protest and force their governments to take more decisive action. (The Business Standard) A Moldovan-flagged chemical tanker is hit by a missile near the Por");
System.out.println("t of Odesa, seriously injuring two crew members, according to Moldova's naval agency. It is unclear who launched the missile. (Reuters) Russian President Vladimir Putin urges the Armed Forces of Ukraine to 'take power in your own hands' and overthrow the Ukrainian government, which he referred to as");
System.out.println(" a 'gang of drug addicts and neo-Nazis'. (The Guardian) Russian foreign ministry spokesperson Maria Zakharova warns both Finland and Sweden that they could face 'detrimental military and political consequences' if they attempt to join NATO. (The Guardian)"); 
  break;
case 26:
System.out.println("Kyiv offensive, Battle of Kyiv Russian Ground Forces attempt to attack an army base near Kyiv on Victory Avenue as well as an electricity generating station in the city. The Ukrainian military says that they repelled both attacks. (Reuters) A residential tower block near Kyiv International Airport i");
System.out.println("s hit by a missile. (Al Jazeera) Ukraine's army claims that its air defences shot down two Russian Ilyushin Il-76 transport planes carrying paratroopers near the cities of Vasylkiv and Bila Tserkva in Kyiv Oblast, but did not provide any video evidence or details on crash sites. Ukraine also claims ");
System.out.println("that a Sukhoi Su-25 attack jet was shot down. (Times of Israel) Battle of Melitopol The Russian Armed Forces report that they have captured the city of Melitopol in Zaporizhzhia Oblast. However, this claim is disputed. Russian state media says that Russian troops entered the city after facing 'no re");
System.out.println("sistance'. (Reuters) (TASS) Ukrainian President Volodymyr Zelenskyy posts a video of himself in the capital Kyiv amid rumors that he left the country. (Times of Israel) The Russian Navy warns that all civilian ships and vessels attempting to approach the Ukrainian Black Sea coast will be destroyed a");
System.out.println("s 'terrorist threats'. (Ukrainska Pravda) Poland says that around 100,000 Ukrainians have crossed the border since the invasion began. (Reuters) Russian President Vladimir Putin issues orders to expand the offensive, after declaring peace talks 'dead'. (Bloomberg) The Ukrainian military destroys rai");
System.out.println("ls at all railway junctions leading to Russia as part of an attempt to prevent Russian military supplies from being delivered by freight trains. (Ukrainska Pravda) Sergey Aksyonov, the head of the Republic of Crimea, says that supplies of water via the North Crimean Canal returned after Russians des");
System.out.println("troyed the dam that prevented the flow of water from the Dnieper river. (TASS) Russian forces shell the city of Sartana, Ukraine, and the nearby village of Buhas, killing ten Greek nationals. (Al Jazeera)"); 
  break;
case 27:
System.out.println("Battle of Kharkiv, Battle of Kyiv Russian Ground Forces begin targeting gas and oil pipelines outside Kharkiv and Kyiv in an attempt to incapacitate their defenses, with multiple explosions being reported at an oil depot near Vasylkiv, Kyiv Oblast. (BBC News) The Ukrainian Army announces that they r");
System.out.println("emain in control of Kyiv. Additionally, regional governor Oleh Synyehubov announces that Ukraine remains in control of Kharkiv. (India Today) (Daily Sabah) Ukraine's military says that it has destroyed a convoy of 56 tanks near the capital Kyiv and killed Chechen General Magomed Tushayev. (Times of ");
System.out.println("Israel) Kherson offensive Russian troops enter the port city of Berdiansk and seize all administrative buildings, according to the city's mayor. (The Jerusalem Post) (Ukrinform) 368,000 refugees have fled Ukraine since the invasion started, according to an estimate by the United Nations High Commiss");
System.out.println("ioner for Refugees. (Euronews) Russian President Vladimir Putin orders Russia's nuclear forces placed on high alert, in response to what he considered 'aggressive statements' by NATO members. (AP) Ukraine says that they have used Baykar Bayraktar TB2 drones against Russian forces. (The Wall Street J");
System.out.println("ournal) The European Union says that it will provide fighter aircraft and finance €500 million in procurement and delivery of weapons to Ukraine, the first time that the EU has done so. The EU will also provide €50 million in medical supplies. (Ukrinform) (Reuters) Danish Prime Minister Mette Freder");
System.out.println("iksen allows volunteers to join Ukrainian soldiers to fight against Russia. (Jyllands Posten)"); 
  break;
case 28:
System.out.println("Battle of Kharkiv Dozens of people are killed and hundreds more are injured in a massive MLRS attack on Kharkiv, according to the Ukrainian Interior Ministry. Videos appear to show cluster munitions being used in the rocket attack. (The Guardian) (Sky News) Hennadiy Matsehora, the mayor of Kupiansk ");
System.out.println("who surrendered the city to the Russians in exchange for peace the previous day, is now indicted for treason by Ukrainian officials. (Ukrainska Pravda) (Ukrainska Pravda 2) Kyiv offensive A 64-kilometre (40 mi) long convoy of Russian Ground Forces armoured vehicles, tanks and artillery continues to ");
System.out.println("advance towards Kyiv. (BBC News) Battle of Okhtyrka Ukrainian Ambassador to the U.S. Oksana Markarova confirms that Russian forces attacked Okhtyrka with a vacuum bomb. (Reuters) (The Independent) Zhytomyr Airport attack Russia attacks the Zhytomyr Airport using Iskander ballistic missiles launched ");
System.out.println("from Belarus. (The Times of Israel) Kherson offensive The Russian Defence Ministry says Russian Ground Forces have captured the Zaporizhzhia Nuclear Power Plant in Zaporizhzhia Oblast, and that the plant's operations have continued normally under the guard of soldiers. However, Ukraine denies that t");
System.out.println("he power plant has been seized by Russian forces. (Reuters) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations Ukrainian President Volodymyr Zelenskyy calls for U.S. President Joe Biden and NATO to impose a no-fly zone over Ukraine. However, White House Press Secretary Jen Psak");
System.out.println("i, British Defense Secretary Ben Wallace, and NATO Secretary-General Jens Stoltenberg state that NATO and the U.S. have ruled out imposing a no-fly zone. (Axios) Kremlin Press Secretary Dmitry Peskov accuses the European Union of 'hostile behaviour' towards Russia, and says that the arming of Ukrain");
System.out.println("e was an 'extremely dangerous and destabilising factor'. Peskov says that Western arms supplies to Kyiv shows that Moscow was justified in demilitarising Ukraine. (Reuters) Dmitry Peskov says that Vladimir Putin's nuclear deterrent order remarks were in response to comments made by British Foreign S");
System.out.println("ecretary Liz Truss. (The Independent) Latvia allows volunteers to participate in the Russo-Ukrainian war. (Reuters) Belarus–Ukraine relations Belarus is expected to directly deploy its armed forces in Ukraine, thereby aiding Russia in its invasion. However, a senior U.S. defense official says that t");
System.out.println("here are no indications that Belarusian troops have been deployed yet. (The Washington Post) (The Hill) France–Russia relations The office of French President Emmanuel Macron states that during a phone call with the Russian President, 'Putin confirmed his willingness to make commitments' to stop att");
System.out.println("acks against civilians and civilian infrastructure and secure major roadways. (Times of Israel) (Reuters) The United Nations reports at least 406 civilian casualties in Ukraine. (CNN) The Ukrainian engineer of the Russian yacht Princess Anastasia attempts to scuttle the vessel in the port of Mallorc");
System.out.println("a, Spain, damaging the yacht's engine room. (Newsweek) Two ethnic Greeks are killed after the city of Sartana is bombarded by the Russian Air Force. (Greek City Times) Ukrainian Air Force pilots begin arriving in Poland to begin taking control of fighter aircraft donated by European Union countries.");
System.out.println(" The Ukrainian government says that the EU is handing over 70 fighter jets to its air force including 28 MiG-29s from Poland, 12 from Slovakia, 16 from Bulgaria, and 14 Sukhoi Su-25s from Bulgaria. Bulgarian Prime Minister Kiril Petkov said he had rejected the request. European Union security chief ");
System.out.println("Josep Borrell later clarified that the donations were done 'bilaterally' by individual EU member states and not from the EU itself. (Politico)"); 
  break;
  default:
  System.out.println("Enter a day from 24 to 28:");



          
                 

          }
          break;
case 3:
          System.out.println(" Enter a day in March 2022:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Kyiv offensive A Russian military convoy that is about 64 kilometers (40 miles) long continues to advance toward Kyiv, as the invasion enters its sixth day. (BBC News) A senior U.S. defense official asserts that the convoy has 'stalled' amid the Ukrainian military response and fuel and food shortage");
System.out.println("s, but also warns that the Russian troops are 'certain to regroup'. (NBC News) Russian forces strike the Kyiv TV Tower with a missile, causing a temporary disruption of TV and radio broadcasting. Five people are killed in the bombing, according to Ukrainian emergency services. A Russian missile also");
System.out.println(" strikes the Babi Yar Holocaust Memorial Center. (APA) (CNN) (Ynetnews) (PBS) The Russian Armed Forces warn Kyiv residents to leave the city as its armoured convoy approaches the city's outskirts. The Russians also warn people living around the headquarters of the Security Service of Ukraine to evac");
System.out.println("uate, with the stated purpose of 'thwarting informational attacks against Russia'. (Reuters) (TASS) (The Guardian) The Ukrainian Armed Forces foil an assassination plot against President Volodymyr Zelenskyy by killing a group of Chechen paramilitaries known as Kadyrovtsy, who were attempting to ente");
System.out.println("r Kyiv on February 26, according to Ukrainian intelligence information. (Ukrayinska Pravda) Belarusian involvement in the 2022 Russian invasion of Ukraine Belarusian Ground Forces units enter northern Chernihiv Oblast, according to a senior Ukrainian territorial defence forces official. However, the");
System.out.println(" Ukrainian presidential office says that there is no evidence that this has happened. Belarus previously said that it would not send its armed forces to Ukraine. (Ukrayinska Pravda) (Rzeczpospolita) Battle of Okhtyrka Ukraine confirms that more than 70 troops were killed in a Russian ballistic missi");
System.out.println("le strike on a base in Okhtyrka, Sumy Oblast, yesterday. It is the largest loss of life for Ukrainian forces in a single attack since the invasion began. (The Guardian) Battle of Kharkiv A Russian missile strikes the Kharkiv Oblast state administration building on Freedom Square at 8 a.m. local time");
System.out.println(". Six people are injured in the strike, with the building being severely damaged. The Slovenian honorary consulate is also destroyed by a Russian missile. (Sky News) (Delo) Siege of Mariupol The head of the Donetsk People's Republic, Denis Pushilin, says that separatist forces are being assembled to");
System.out.println(" encircle the port city of Mariupol. (CNN) The European Court of Human Rights orders an immediate cessation of bombarding and targeting of civilian targets in Ukraine. (Europeiska Pravda) A senior U.S. defense official says that some Russian troop units have surrendered to Ukrainian forces 'without ");
System.out.println("a fight'. (Business Insider)"); 
  break;
case 2:
System.out.println("Kyiv offensive Battle of Kyiv The Ukrainian Air Force says that it has destroyed two Russian warplanes in a dogfight over Kyiv. A Ukrainian MiG-29 is also shot down during the air battle. (Sky News) Kherson offensive Battle of Kherson Russian Ground Forces say that they have captured the Black Sea p");
System.out.println("ort of Kherson. The Ukrainian Ministry of Defense denies this claim, stating that the battle is ongoing. (CNN) The mayor of Kherson says that the city has fallen to the invading Russian forces. (The New York Times) Siege of Mariupol The mayor of Mariupol reports mass casualties and a water outage fr");
System.out.println("om 'non-stop' Russian bombardments. (Reuters) Horlivka offensive Ukrainian forces begin an offensive towards Horlivka. (Ukrinform) Siege of Chernihiv Two Kalibr cruise missiles strike a hospital in Chernihiv after Russian troops were forced to retreat. (TIME) (CBC) Battle of Kharkiv Russian forces l");
System.out.println("aunch airstrikes on Kharkiv National University and a local police department. (CNN) Siege of Enerhodar Russia says that its troops have captured the Zaporizhzhia Nuclear Power Plant, the largest nuclear power plant in Europe. The International Atomic Energy Agency confirms that Russia had communica");
System.out.println("ted that the plant was under their control and that personnel at the plant were continuing to perform their normal duties. (The Drive) A missile strikes the Bangladeshi-flagged cargo ship Banglar Samriddhi docked at the Port of Olvia in Mykolaiv Oblast, killing a Bangladeshi engineer. (The Daily Sta");
System.out.println("r) An emergency special session of the UN General Assembly adopts a resolution calling for Russia to end the invasion. (The Washington Post) (The Guardian) In an unprecedented move, the European Court of Human Rights (ECHR) suspends all judicial proceedings against Ukraine pending before the ECHR. (");
System.out.println("Europeiska Pravda) The Ukrainian Armed Forces say that Ukraine has retaken the city of Makariv from Russia. (Jerusalem Post) (Ukrinform)"); 
  break;
case 3:
System.out.println("Siege of Chernihiv The governor of Chernihiv Oblast says that at least 33 people have been killed and at least 18 others injured in Russian airstrikes on residential areas in Chernihiv. (National Post) (U.S. News & World Report) (NDTV) Battle of Kharkiv Thirteen students are killed at the National U");
System.out.println("niversity of Kharkiv after a Russian shell struck a dormitory at the university's Academy of Culture. Five foreign students are among the dead, including four Chinese and one Indian student. (Taiwan News) Kherson offensive The Ukrainian Navy patrol vessel Sloviansk is destroyed in a Russian anti-shi");
System.out.println("p missile strike off the Port of Odesa, resulting in the disappearance of all its crew. (Debrief) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says that over one million Ukrainians have fled the country since the invasion began. (Al Jazeera) Reactions to the 2022 Russia");
System.out.println("n invasion of Ukraine Russia–United States relations Russia and the U.S. establish a hotline in an effort to prevent escalation between the two nuclear powers. (Reuters) Russian Foreign Minister Sergey Lavrov says that the war on Ukraine will continue 'until the end', and accuses Ukrainian President");
System.out.println(" Volodymyr Zelenskyy of allowing 'a society where Nazism is flourishing'. Lavrov also says that Russia is not planning a nuclear war. (Reuters)"); 
  break;
case 4:
System.out.println("Kherson offensive Battle of Mykolaiv Ukrainian forces say that they have recaptured the Mykolaiv Airport. (Ukrinform) Russia renews its assault on Mykolaiv with naval gunfire support. (The Guardian) The Ukrainian Navy scuttles its flagship frigate Hetman Sahaidachny at the port of Mykolaiv to preven");
System.out.println("t its capture by Russian forces. (The Independent) Siege of Enerhodar The Zaporizhzhia Nuclear Power Plant in Enerhodar catches fire following shelling by Russian troops. The fire is later extinguished. (Reuters) (NDTV) Ukrainian officials confirm that the power plant has been captured by Russian fo");
System.out.println("rces. (BBC News) Eastern Ukraine offensive Ukrainian air defences shoot down a Russian Sukhoi Su-25 jet over the city of Volnovakha in Donetsk Oblast. (Forbes) Kyiv offensive Sky News chief correspondent Stuart Ramsay is shot and wounded by Russian troops near Kyiv. (Wales Online) Ukrainian refugee ");
System.out.println("crisis The Czech Republic introduces a state of emergency for 30 days as thousands of Ukrainian refugees arrive in the country. (Novinky) Reactions to the 2021–2022 Russo-Ukrainian crisis Ukraine–NATO relations NATO announces that they will not declare a no-fly zone over Ukrainian airspace, as such ");
System.out.println("a declaration could create an avenue for further escalation by enabling NATO nations to potentially fire upon Russian aircraft in the area. (FOX News) President Volodymyr Zelenskyy condemns NATO for rejecting his appeal for a no-fly zone over his country, saying 'All the people who die starting toda");
System.out.println("y will also die because of you. Because of your weakness, because of your disconnection'. (DW) Head of the Chechen Republic Ramzan Kadyrov calls on President Vladimir Putin to let his forces seize Ukraine's major cities, saying that it is the 'only way to save the Russian people and our state'. (WeF");
System.out.println("orNews) By a unanimous vote, Ukraine becomes a contributor to NATO's Cooperative Cyber Defence Centre of Excellence. (Kyiv Independent) "); 
  break;
case 5:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Russian and Ukrainian forces agree to open a humanitarian corridor for five hours for people who want to leave Mariupol and Volnovakha, expecting 200,000 people from Mariupol and 15,000 people from Volnovakha to use the corridor. However, the implementatio");
System.out.println("n of the corridor is postponed as the two parties accused each other of violating cease-fire agreement. (Reuters) (The Wall Street Journal) Head of the Donetsk People's Republic Denis Pushilin announces that Sparta Battalion Commander Volodymyr Zhoha has been killed in Volnovakha. (Ukrayinska Pravda");
System.out.println(") Siege of Chernihiv A Russian Air Force warplane is shot down on the outskirts of Chernihiv, crashing into a residential area, according to Ukraine's State Emergency Service. (CNN) A Russian Sukhoi Su-34 is shot down in Chernihiv Oblast and one of its pilots is taken prisoner by Ukrainian forces. T");
System.out.println("he other pilot died. (Ukranews) (India Today) Kyiv offensive Russian troops seize control of Borodianka in Kyiv Oblast after days of heavy shelling and airstrikes. Ukrainian authorities say that they were unable to evacuate a psychiatric hospital in the town which holds 670 patients. The hospital is");
System.out.println(" now under Russian control. (CNN) (Sky News) The Ukrainian military begins a mass evacuation of civilians from Irpin after the city was bombarded by Russian jets and artillery. Much of the city has now been destroyed. (BBC News) Battle of Mykolaiv Ukrainian Ground Forces retake control of Mykolaiv a");
System.out.println("nd seize Russian military equipment. (The Kyiv Independent) Ukrainian refugee crisis The International Organization for Migration says that the refugee crisis has now become the largest and fastest exodus of people in Europe since World War II. (Fox News) Russian President Vladimir Putin says that W");
System.out.println("estern sanctions on Russia are akin to a 'declaration of war', and warns that any attempt to impose a no-fly zone over Ukraine could lead to 'catastrophic consequences' for the world. (Reuters) War in Donbas Russian President Putin says that around 13,000 to 14,000 people have been killed in Donbas ");
System.out.println("since 2014. (TASS)"); 
  break;
case 6:
System.out.println("In a phone call with French president Emmanuel Macron, Russian president Vladimir Putin says that Russia will no longer attack nuclear power plants and is open to holding a trilateral meeting between Russia, Ukraine, and the International Atomic Energy Agency. (Politico.eu) (FactoPress) Ukrainian pr");
System.out.println("esident Volodymyr Zelenskyy says that Havryshivka Vinnytsia International Airport in Vinnytsia Oblast has been 'completely destroyed' after being hit with eight Russian ballistic missiles. (The Guardian) The Ukrainian military says that it has killed over 11,000 Russian troops since the invasion beg");
System.out.println("an, while Russian Defence Ministry spokesman Maj. Gen. Igor Konashenkov said on Wednesday that 498 Russian troops had been killed. (Reuters) (The Week) U.S. officials claim that Russia has started recruiting Syrian mercenaries experienced in urban combat. (The Wall Street Journal)"); 
  break;
case 7:
System.out.println("Battle of Kharkiv The International Atomic Energy Agency confirms that the Kharkiv Institute of Physics and Technology in Kharkiv, which holds a neutron generator, has been destroyed by Russian shelling. The IAEA says that no radiation release has been detected from the facility, which housed a 'sma");
System.out.println("ll inventory of radioactive material'. (Bloomberg) Ukraine says that it has killed 41st Combined Arms Army general Vitaly Gerasimov, who allegedly took part in the annexation of Crimea, Russia's intervention in Syria, and the Second Chechen War, in the Kharkiv Oblast. He is the second general to be ");
System.out.println("killed by Ukrainian forces after Andrey Sukhovetsky. (Ukrinform) (The Independent) Kherson offensive Ukrainian Navy forces strike Russian Navy patrol boat Vasily Bykov with missiles in the Black Sea. (The Telegraph) (Mirror) Russia–Ukraine relations Russia and Ukraine set up another ceasefire in ord");
System.out.println("er to allow humanitarian evacuations in some cities. (ABC News) Kremlin Press Secretary Dmitry Peskov says that Russia will end its military campaign if Ukraine ends its fighting campaign, does not join NATO, recognizes Crimea as Russian territory, and recognizes Donetsk and Luhansk as independent s");
System.out.println("tates. (Newsweek)"); 
  break;
case 8:
System.out.println("Battle of Kharkiv The Albanian consulate in Kharkiv is destroyed during Russian shelling. No casualties are reported. (Euractiv) White House Press Secretary Jen Psaki reaffirms that the U.S. will not impose a no-fly zone over Ukraine. (Wall Street Journal) A report from the Irish Times said that the");
System.out.println(" United Nations told its employees in a communications guidance to refer to the war in Ukraine as a 'conflict' or 'military offensive' rather than as a 'war' or an 'invasion', and also ordered employees to not put the Ukrainian flag on any of their social media accounts to 'avoid reputational risk',");
System.out.println(" in an attempt to avoid upsetting Russia. However, Stéphane Dujarric, spokesman for the secretary-general of the United Nations, wrote in an email to The Guardian that no such recommendation was ever issued. (The Irish Times) (The Guardian)"); 
  break;
case 9:
System.out.println("Eastern Ukraine offensive Siege of Mariupol A Russian airstrike destroys a maternity ward and a children's hospital in Mariupol, Ukraine, killing three people and injuring at least 17 people. President Volodymyr Zelenskyy says that many people are unaccounted for. (Business Insider) (AP) (The Chicag");
System.out.println("o Tribune) (Sky News) Battle of Kharkiv Ukrainian forces announce that they have regained control of Derhachi, a city located in the Kharkiv Raion district of the Kharkiv Oblast. (Ukrinform) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says over two million Ukrainians h");
System.out.println("ave now fled the country since the invasion began. Most have gone to neighbouring Poland, with Hungary, Romania and Slovakia also taking in several hundred thousand refugees each. (DW) Poland–United States relations The Pentagon rejects an offer from Poland's foreign ministry to 'deploy – immediatel");
System.out.println("y and free of charge – all their MIG-29 jets to the Ramstein Air Base and place them at the disposal of the Government of the United States of America' for transfer to the Ukrainian Air Force. (Reuters) (Reuters 2) Reactions to the 2022 Russian invasion of Ukraine The British Army confirms that a nu");
System.out.println("mber of active-duty soldiers have disobeyed orders and gone AWOL, and have likely gone to Ukraine to fight against the Russian military. Defence Minister Ben Wallace says that the serving members are 'breaking the law and will be prosecuted' when they return to the United Kingdom. (Sky News) The Uni");
System.out.println("ted Kingdom's Defence Ministry says that it is sending another 1,615 MBT LAWs, and a small number of FGM-148 Javelin anti-tank missiles to the Ukrainian army. More small arms, body armour and medical supplies have also been sent. (BBC News) Business and economy  2021–2022 Russo-Ukrainian crisis 2022");
System.out.println(" Russian financial crisis Fitch Ratings downgrades Russia from 'B' to 'C', one grade above default, and warns that Russian default on its obligations is 'imminent'. (BBC News) The Russian Ministry of Economic Development proposes a draft nationalisation bill that will impose receivership for up to 3");
System.out.println(" months on assets of companies that boycotted the Russian market due to the Russian invasion of Ukraine if the ownership share by legal entities from 'unfriendly countries' exceeds 25%. If the companies still do not resume their business in the country, their assets will be auctioned. More than 300 ");
System.out.println("companies that left Russia or suspended operations in Russia could be targeted. (TASS) The Ukrainian state grid operator warns that Russian forces, which are in control of the Chernobyl Nuclear Power Plant, have disconnected the plant from the electricity grid, which the operator says will impact nu");
System.out.println("clear fuel cooling, and which also caused a blackout in the nearby city of Slavutych. The nuclear plant previously suspended all communications with the IAEA, the United Nations-based organisation specialising in nuclear energy production. (The Independent) (Interfax Ukraine) Ukrainian Foreign Minis");
System.out.println("ter Dmytro Kuleba says that reserve diesel generators that cool spent nuclear fuel can only last for another 48 hours and that a radiation leak from Chernobyl is 'imminent' if power is not restored immediately. Kuleba also says that 'Putin's barbaric war' puts all of Europe in danger. However, the I");
System.out.println("nternational Atomic Energy Agency says there is 'no critical impact on security' imminent. (Times of Israel) (Reuters)"); 
  break;
case 10:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Russian forces resume shelling the port city of Mariupol after yesterday's airstrike on a children's hospital which killed three people. A humanitarian aid convoy trying to reach the city is also forced to turn back due to heavy fighting. (BBC News) Afterm");
System.out.println("ath of 2021 Kyrgyzstan–Tajikistan clashes An armed incident occurs between border guards at the Kyrgyzstan–Tajikistan border, killing one Tajik border guard. Following the incident, officials from the Batken Region in Kyrgyzstan and the Sughd Region in Tajikistan hold talks. (Trend) (RFE/RL) Busines");
System.out.println("s and economy  2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Video game companies Nintendo and Sony Interactive Entertainment suspend all product sales in Russia. Sony's online PlayStation Store will also no longer be available in Russia. (CNBC) U.S. bank Goldman Sachs announce");
System.out.println("s that it is closing its operations in Russia, becoming the first major Wall Street bank to leave the country following the invasion of Ukraine. (Reuters) 2022 Russian financial crisis Kremlin spokesman Dmitry Peskov says that the Russian economy is experiencing a 'shock' following an 'absolutely un");
System.out.println("precedented' economic war being waged against the country. Peskov also says that 'the economic war that has started against our country has never taken place before. So it is very hard to forecast anything'. (Reuters) The International Monetary Fund no longer considers Russian default 'improbable', ");
System.out.println("and the World Bank also considers Russia's and Belarus's default likely. (Reuters) (Reuters 2) The Central Bank of Russia limits withdrawals of US dollars, euros, British pounds and Japanese yen for Russian firms to the equivalent of $5,000, with the withdrawal of larger sums only possible with the ");
System.out.println("Central Bank's permission. The withdrawn funds may only be used for covering overseas work trips. (Reuters) International sanctions during the Russo-Ukrainian War Russian President Vladimir Putin admits that the sanctions have created problems for Russia. However, he also called the sanctions illegi");
System.out.println("timate and warned the West that Russia will emerge stronger and solve the problems. (Reuters) (Sky News) The Ukrainian parliament begins to debate a new law which would allow the forced seizure of all assets belonging to Russians citizens as well as Ukrainians deemed by the courts or the National Se");
System.out.println("curity and Defense Council of Ukraine to be Russian collaborators. Last week, a bill was approved that allowed forced seizure of assets owned by the Russian government and Russian companies. (Ekonomichna Pravda) Russia's Ministry of Transport prepares a draft regulation which would allow airlines to");
System.out.println(" not have to honour the request of the lessor to return leased aircraft unless a special government commission orders them to do so and would also allow companies to pay the lessor in rubles. The law comes amid EU sanctions which forces all lease contracts for Russian aircraft to be voided by late M");
System.out.println("arch and also forbids E.U. companies from insuring Russian aircraft. (Interfax Russia) Russia introduces retaliatory sanctions against most foreign countries, with the exception of members of the Russian-led Eurasian Economic Union. The export of more than 200 items, mostly of technical and agricult");
System.out.println(" The Russian government abolishes penalties for theft of patents if they are held by natural or legal persons from countries considered by the Russian government as unfriendly. The decriminalisation of the piracy of s");
System.out.println("oftware from 'unfriendly' countries is also being considered. (Euractiv) (The Register) Facebook and Instagram starts to allow users in Eastern Europe, the Baltics, and the Caucasus to promote violence against Russians and Russian soldiers in the context of the war in Ukraine, which is normally rest");
System.out.println("ricted, according to internal emails. A Meta spokesperson states that 'As a result of the Russian invasion of Ukraine we have temporarily made allowances for forms of political expression that would normally violate our rules like violent speech such as 'death to the Russian invaders.'' However, cal");
System.out.println("ls for violence against Russian prisoners of war and 'credible calls for violence against Russian civilians' will remain prohibited. Death threats against Russian President Vladimir Putin and Belarusian President Alexander Lukashenko will also be permitted. Meta's spokesperson adds that they are, 'f");
System.out.println("or the time being, making a narrow exception for praise of the Azov Regiment strictly in the context of defending Ukraine, or in their role as part of the Ukraine National Guard,' which was previously forbidden. (Reuters) Russian Foreign Minister Sergey Lavrov and Ukrainian Foreign Minister Dmytro K");
System.out.println("uleba hold talks in Ankara, Turkey. These are the highest level talks between the two nations since the invasion. No ceasefire is reached, but the possibility of a meeting with Ukrainian President Volodymyr Zelenskyy and Russian President Vladimir Putin was discussed. (Reuters) Ukrainian Defense Min");
System.out.println("ister Oleksii Reznikov says that Ukraine is willing to accept Russia’s surrender “with understanding”. (Ukrinform)"); 
  break;
case 11:
System.out.println("Southern Ukraine offensive Battle of Melitopol Russian troops capture the mayor of Melitopol Ivan Fedorov, and take him to an unknown location after he refused to cooperate with Russian occupation forces. Fedorov's capture is confirmed by Ukrainian Internal Affairs Ministry official Anton Herashchen");
System.out.println("ko. (BBC News) Kyiv offensive A large convoy of Russian military vehicles, including tanks and self-propelled artillery, begins 'fanning out' to forests and towns near Kyiv as it prepares to advance on the capital. (BBC News) Siege of Chernihiv Ukrainian Ground Forces launch a counter-offensive in C");
System.out.println("hernihiv Oblast, regaining control of five settlements from Russian forces, and seizing two Russian armoured personnel carriers and ammunition. (Ukrinform) Northeastern Ukraine offensive Battle of Sumy Around 104 Russian soldiers are taken as prisoners of war in Sumy. (Ukrinform) Russia allows forei");
System.out.println("gn volunteers to join its armed forces to fight the war against Ukraine. Russian defense minister Sergei Shoigu says that he has received around 16,000 applications, mostly from people in the Middle East. (AP) Russia launches 'high-precision' airstrikes on airfields in Lutsk and Ivano-Frankivsk in W");
System.out.println("estern Ukraine, killing four Ukrainian service members and injuring six others. Russian Air Force jets also bomb the city of Dnipro for the first time, destroying a shoe factory and killing one person. (AP) 2020–present global chip shortage Two Ukrainian semiconductor-grade neon gas producers, makin");
System.out.println("g about half of the world's supply of the gas, have shut down their operations due to the invasion. This will likely worsen semiconductor shortages that started with the COVID-19 pandemic. (Reuters) The Central Bank of Russia orders all banks not to take any commission for the withdrawal of foreign-");
System.out.println("denominated cash from bank accounts of natural persons. Additionally, all remittances from abroad can only be withdrawn after they are converted to rubles. (Meduza) Stock prices increase in the United States and other global markets after Russian president Vladimir Putin said that there was progress");
System.out.println(" during talks with Ukraine. Following Putin's reports, the DOW increased by 300 points. (Nasdaq) (Reuters) (MarketWatch)Russia–United States relations U.S. president Joe Biden announces that he will revoke Russia's most favoured nation trade status in coordination with the European Union and the Gro");
System.out.println("up of Seven. The U.S. will also ban all imports of Russian seafood, alcohol, and diamonds; forbid new investment in Russia by American citizens; and criminalise the export of U.S. banknotes to Russia. (AP) (Reuters) U.S. Treasury Secretary Janet Yellen announces that the U.S. Treasury has imposed sa");
System.out.println("nctions against Viktor Vekselberg and the family of Putin spokesperson Dmitry Peskov. (Reuters) Russia–European Union relations The EU announces that it will ban all imports of iron and steel goods from Russia, ban the export of luxury goods to Russia, and freeze Russia's cryptocurrency assets. (Reu");
System.out.println("ters) Russia–Ukraine relations Kremlin Press Secretary Dmitry Peskov says that Russian president Vladimir Putin is open to holding a meeting with Ukrainian president Volodymyr Zelenskyy. (Ukraine News Today) Igor Zhovkva, deputy head of the Office of the President of Ukraine, says that President Zel");
System.out.println("enskyy is 'ready to talk to President Putin anytime he is ready'. (CNN) Belarus–Russia relations In a meeting with Belarusian president Alexander Lukashenko, President Putin says that there are 'positive shifts' and progress during talks with Ukraine. (Reuters)"); 
  break;
case 12:
System.out.println(" Russia warns that it could fire on any future NATO armaments shipments to Ukraine, saying that the weapons shipments are 'legitimate military targets' for its military. (Financial Times) Iraqi conflict, 2022 Erbil rocket attacks Iran launches twelve ballistic missiles at the Iraqi city of Erbil, Ku");
System.out.println("rdistan Region, with explosions reported near the U.S. consulate and Erbil International Airport. The missiles are believed to be Fateh-110s. There are no reports of injuries or deaths. (The Jerusalem Post) (MSN) (Al Arabiya) Iraqi security officials confirm that the missiles were launched from Iran");
System.out.println(" and that several missiles hit the U.S. consulate building. (DW) Business and economy  Economic impact of the 2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Pokémon Go suspends operations in Russia and Belarus following the invasion. (Gamerant.com) The Central Bank of Russia ann");
System.out.println("ounces that stock trading on the Moscow Stock Exchange will remain suspended until at least March 18 due to the fallout from the Russian invasion. (The Wall Street Journal)"); 
           break;
case 13:
System.out.println("Eastern Ukraine offensive Usage of white phosphorus bombs is reported overnight in the town of Popasna in Luhansk Oblast. (Ukrayinska Pravda) Kyiv offensive Brent Renaud, a filmmaker and photojournalist formerly affiliated with The New York Times, is shot and killed by Russian troops in Irpin, Kyiv ");
System.out.println("Oblast. His colleague, another U.S. citizen, is wounded and evacuated to a hospital. (Jerusalem Post) Battle of Melitopol Russian occupation forces install Halyna Danylchenko as the new mayor of Melitopol following the abduction of Ivan Fedorov. Danilchenko, a former member of the city council, call");
System.out.println("s on residents to 'adapt to the new reality' and stop 'committing extremist acts'. However, the city council refuses to recognise Danilchenko as mayor and calls on Ukrainian authorities to indict her for treason. (Sky News) (Ukrayinska Pravda) Siege of Mariupol Ukrainian authorities say that 2,187 c");
System.out.println("ivilians have now been killed in Mariupol, Donetsk Oblast. Mariupol's City Council says that Russian forces are deliberately targeting residential buildings and densely populated areas in the port city. (Ukrayinska Pravda) Aftermath of the Battle of Chernobyl Ukrainian Energy Minister Herman Halushc");
System.out.println("henko announces that power has been restored to the former power plant in Chernobyl. (Axios) Russian airstrikes inflict significant damage on the Ivano-Frankivsk International Airport in western Ukraine, with no casualties immediately reported. (CNN) An airstrike on the NATO–Ukraine Partnership for ");
System.out.println("Peace Yavoriv military base some 10–20 km (6.2–12.4 mi) from the border with Poland kills 35 people and injures 134 others. (USA Today) White House national security adviser Jake Sullivan warns that Russia could be preparing to use chemical weapons in Ukraine. (USA Today) Russian forces abduct Yevge");
System.out.println("ny Matveyev, the mayor of Dniprorudne in Zaporizhzhia Oblast, after he refused to cooperate with the military. (The Jerusalem Post) Ukrainian President Volodymyr Zelenskyy again calls for a no-fly zone over Ukraine, saying 'it is only a matter of time before Russian rockets fall on your territory, o");
System.out.println("n NATO territory'. (NDTV)"); 
  break;
case 14:
System.out.println("Siege of Mariupol Local officials in Mariupol, Donetsk Oblast, say that over 160 cars have left the city in the first successful attempt to arrange a humanitarian corridor to evacuate the city. (Reuters) Russia denies having requested military assistance from China, as alleged by several US official");
System.out.println("s. (BBC News) (Al Jazeera) A Russian Air Force airstrike on a television tower in Rivne Oblast in Western Ukraine kills at least nine people, according to Rivne governor Vitaliy Koval. (Reuters) A Russian Orlan-10 UAV crashes near a village in Bistrița-Năsăud County, Romania. (Euronews)Russia–Ukrain");
System.out.println("e relations The fourth round of talks between the Ukrainian and Russian delegations resumes in an effort to end the war but is delayed until tomorrow due to technical issues. (Wall Street Journal) (Reuters) Russia–Slovakia relations Slovakia expels three Russian diplomats for alleged espionage and b");
System.out.println("ribery. (AP) Germany–United States relations Germany announces that it will buy 35 F-35 Lightning II fighter jets from the United States to replace its aging fleet of Panavia Tornados. Germany will also purchase 15 Eurofighter Typhoon jets from Airbus. (Reuters) Law and crime  2022 Russian invasion ");
System.out.println("of Ukraine Protests against the 2022 Russian invasion of Ukraine 2022 anti-war protests in Russia Marina Ovsyannikova, a Russian state television journalist, interrupts a live news broadcast of Channel One Russia, holding a sign saying 'No War' and 'Stop the war. Do not believe propaganda, they tell");
System.out.println(" you lies here', and is promptly arrested. (MSN) Anti-war protesters seize the mansion of Oleg Deripaska in London. Four of the protesters who were seen on the balcony of Deripaska's mansion are later arrested. (The Guardian) International sanctions during the Russo-Ukrainian War Andrey Turchak, the");
System.out.println(" secretary-general of the ruling party United Russia, declares that the party will draft a bill criminalising compliance with the Western sanctions. (Kommersant)"); 
           break;
case 15:
System.out.println("Kyiv offensive Battle of Kyiv The Kyiv city government and Kyiv Oblast administration impose a 35-hour curfew starting at 20:00 local time (18:00 UTC). (Reuters) Fox News cameraman Pierre Zakrzewski and producer Oleksandra Kuvshynova are killed, and war correspondent Benjamin Hall is injured, while ");
System.out.println("covering the fighting between Russian and Ukrainian forces in Horenka, Kyiv Oblast. (The Guardian) Eastern Ukraine offensive Siege of Mariupol Around 2,000 private cars have left Mariupol since a humanitarian corridor was imposed, with another 2,000 cars waiting to leave. (Deccan Herald) Russian tro");
System.out.println("ops storm the Mariupol regional intensive care hospital and take around 400 people hostage. Local authorities confirm that the damaged hospital is now under Russian control. (BBC News) Southern Ukraine offensive The Russian Defence Ministry says that its forces have taken full control of Ukraine's K");
System.out.println("herson Oblast and that they destroyed six Ukrainian Air Force jets, seven helicopters, and 13 UAVs in the last 24 hours. (The Nation) Satellite images from Planet Labs appear to show multiple Russian helicopters burning at Kherson International Airport after Ukrainian forces said they struck the air");
System.out.println("port. This is the second major Ukrainian attack on the facility since it fell to Russian forces on 2 March. (The Drive) (CNN) Ukrainian refugee crisis The United Nations High Commissioner for Refugees says that over three million people have now fled Ukraine since the invasion began. (The Independen");
System.out.println("t)Russia–Ukraine relations The fourth round of talks between the Russian and Ukrainian delegations resumes a day after talks were suspended for technical reasons. (The Quint) (CBS News) Ukrainian presidential aide Mykhailo Podolyak reaffirms that ceasefire negotiations are ongoing. (The Free Press J");
System.out.println("ournal) Podolyak says that talks between Ukraine and Russia are difficult but also says that there is 'certainly room for compromise'. Talks between both countries will continue tomorrow. (AP) (Reuters) Ukraine–European Union relations The prime ministers of Poland, Slovenia, and the Czech Republic ");
System.out.println("travel to Kyiv by train to meet with Ukrainian President Volodymyr Zelenskyy and Prime Minister Denys Shmyhal in order to demonstrate 'unequivocal support' of the European Union for the sovereignty and independence of Ukraine. (CNN) International sanctions during the Russo-Ukrainian War Russia–Unite");
System.out.println("d States relations Russia sanctions U.S. President Joe Biden, Secretary of State Antony Blinken, Secretary of Defense Lloyd Austin, CIA Director William Burns, and former Secretary of State Hillary Clinton in response to United States sanctions on Russian officials. (Sky News) Canada–Russia relation");
System.out.println("s Russia sanctions Canadian Prime Minister Justin Trudeau, Foreign Affairs Minister Mélanie Joly, General Wayne Eyre and most members of the Canadian parliament. All those sanctioned are banned from entering Russia. (CBC News) Russia–Spain relations Spanish police seize a superyacht at the Port of B");
System.out.println("arcelona which is owned by Russian oligarch Sergey Chemezov, after Chemezov was sanctioned by the European Union. (Reuters) Belarus–United States relations The United States imposes additional sanctions on Belarusian President Alexander Lukashenko. (CNN) Enlargement of NATO Ukrainian President Volod");
System.out.println("ymyr Zelenskyy acknowledges that Ukraine will not be able to join NATO. (The Independent) Russia in the Council of Europe Russia formally withdraws from the Council of Europe. (Reuters)"); 
  break;
case 16:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Mariupol theatre airstrike The Donetsk Regional Drama Theatre in Mariupol, which is currently being used as an air raid shelter holding up to 1,200 civilians, is largely destroyed by bombing. Ukraine accuses Russia of conducting an airstrike targeting the ");
System.out.println("theatre, while Russian authorities deny responsibility, instead accusing the Azov Battalion of having planned and carried out the bombing. (BBC News) (RadioFreeEurope/RadioLiberty) Northeastern Ukraine offensive Siege of Chernihiv Russian troops reportedly shoot dead ten people queuing for food in C");
System.out.println("hernihiv. The Russian Defence Ministry denies Russian forces were behind the killings. (Sky News) (Reuters) Southern Ukraine offensive Battle of Melitopol Captured Melitopol mayor Ivan Fedorov is freed in exchange for nine Russian POWs. (Ukrinform) Foreign aid to Ukraine during the Russo-Ukrainian W");
System.out.println("ar British Defence Secretary Ben Wallace says that the UK has begun supplying Starstreak anti-aircraft missiles to the Ukrainian military. (Reuters) U.S. President Joe Biden announces a further $800 million in 'security assistance' to Ukraine, including 800 anti-aircraft systems, and thousands of an");
System.out.println("ti-tank missiles and armed combat drones to counter Russia's invasion. (Reuters) Russian President Vladimir Putin addresses his ministers on the ongoing situation in Ukraine and the Russian economy, saying that Russian 'traitors' and 'scum' would be 'spat out like a midge that accidentally flew into");
System.out.println(" their mouths', and also accuses a so-called 'fifth column' of attempting to destroy the country from within. (Reuters) Russia–Ukraine relations Russian Foreign Minister Sergey Lavrov says that there is hope of reaching a compromise aimed at a ceasefire. (Politico.eu) In a report from the Financial ");
System.out.println("Times, a peace plan is drafted by Ukraine and Russia. The conditions include a ceasefire and Russian withdrawal if Ukraine abandons all attempts of joining NATO and accepts limits on its armed forces. (Naharnet) (Financial Times) Japan–Russia relations Japan announces that it will revoke Russia's mo");
System.out.println("st favoured nation trade status as part of further sanctions on Russia. (Reuters) Belarus–Canada relations Canada bans Belarusian aircraft from its airspace due to Belarus's support of Russia in the invasion. (The Hill) Russia in the Council of Europe Russia is expelled from the Council of Europe du");
System.out.println("e to the invasion of Ukraine, although the Russian Foreign Ministry had previously announced that it would be quitting the organisation. (AP)"); 
  break;
case 17:
System.out.println("British Defence Secretary Ben Wallace announces that the UK is deploying a Sky Sabre air defence system to Poland, and 100 troops to operate it as part of NATO's response to Russian military aggression. (Sky News) Panama's maritime authority states that Russia has attacked three Panamanian-flagged c");
System.out.println("ivil vessels in the Black Sea since the Russian invasion of Ukraine began on February 24, causing one of the ships to sink. No deaths have been reported. (Reuters) According to Ukrainian intelligence information, Syrian President Bashar al-Assad pledges to supply Russia with 40,000 mercenaries. (The");
System.out.println(" Jerusalem Post) Business and economy  Economic impact of the 2022 Russian invasion of Ukraine 2022 boycott of Russia and Belarus Steam announces that they will stop payments to Belarus, Russia, and Ukraine. (PCMag) The U.S. House of Representatives votes 424–8 to suspend trade relations with Russia");
System.out.println(" and Belarus following the invasion. (NBC News)"); 
  break;
case 18:
System.out.println("2022 Russian invasion of Ukraine Battle of Zaporizhzhia Nine people die after they are hit by Russian shelling in Zaporizhzhia. (National Post) Southern Ukraine offensive A Russian missile strike destroys a Ukrainian military barracks in Mykolaiv, killing at least 50 soldiers, many more are believed");
System.out.println(" to be buried under rubble. (Sky News)"); 
  break;
case 19:
            System.out.println("Russia says that on Friday it used the Kh-47M2 Kinzhal hypersonic missile for the first time in Ukraine to destroy a weapons storage facility in the Ivano-Frankivsk region. (Reuters)");
  break;
case 20:
System.out.println("Siege of Mariupol The city council of Mariupol says that Russian Armed Forces have forcefully deported 'several thousand' people to camps and remote cities in Russia. (Reuters) (CNN)Bulgaria says it will end gas imports from Russia's Gazprom when its 10-year deal with Gazprom expires at the end of 2");
System.out.println("022, signalling a shift away from Russian energy. Bulgarian Energy Minister Alexander Nikolov says Bulgaria will also seek increased gas imports from Azerbaijan. (Politico)"); 
  break;
case 21:
System.out.println("Kyiv offensive Battle of Kyiv Kyiv shopping centre bombing A Russian airstrike destroys a shopping mall in Kyiv, killing at least eight people. (The Washington Post) Siege of Mariupol Russia gives Ukraine a 5 a.m. (3 a.m. UTC) deadline to surrender the city of Mariupol. (The Guardian) Ukraine reject");
System.out.println("s the Russian ultimatum to surrender its control of Mariupol, with Deputy Prime Minister Iryna Vereshchuk saying 'we have already informed the Russian side about this'. (BBC News) Sumykhimprom chemical plant ammonia leak An ammonia leak occurs at the Sumykhimprom chemical plant in Sumy. (The Kyiv In");
System.out.println("dependent)"); 
  break;
case 22:
System.out.println("Kyiv offensive Battle of Kyiv Ukrainian forces say that they have retaken Makariv, a suburb near Kyiv. (BBC News) Siege of Mariupol Russian Navy warships in the Sea of Azov shell Ukrainian-held areas of Mariupol. (ABP Live) 2022 Russia–Ukraine peace negotiations UN Secretary-General António Guterres");
System.out.println(" says that there is diplomatic progress on several key issues in the situation in Ukraine in an effort to end the 'unwinnable' war. (United Nations) Kremlin Press Secretary Dmitry Peskov says that Russia will only use its nuclear weapons if the country faces an 'existential threat' amid growing conc");
System.out.println("erns that Russia will use nuclear weapons in Ukraine. (Reuters)"); 
  break;
case 23:
System.out.println("Kyiv offensive Battle of Kyiv Four people are injured by a series of Russian Air Force strikes on infrastructure in Kyiv. (Euronews) Russian journalist Oksana Baulina is killed in shelling in Kyiv's Podilskyi District. (BBC News) A laboratory near the Chernobyl Exclusion Zone is looted and destroyed");
System.out.println(" by Russian soldiers. (CNN)"); 
  break;
case 24:
System.out.println("Southern Ukraine offensive Battle of Berdiansk Ukrainian forces destroy a Russian Navy Alligator-class landing ship at the port of Berdiansk. Images on social media appear to show the Orsk landing ship burning at the port. (Sky News) Belarusian involvement in the 2022 Russian invasion of Ukraine Ukr");
System.out.println("ainian Foreign Minister Dmytro Kuleba says that Belarusian troops are not willing to fight alongside Russia in Ukraine. (Prensa Latina) (Ukrinform) Battle of Kharkiv Russian forces airstrike a Nova Poshta post office in Kharkiv, killing six civilians. (Times of Israel) Ukrainian volunteer battalions");
System.out.println(", International Legion of Territorial Defense of Ukraine Canada bans its soldiers from joining the volunteer forces in Ukraine, stating that their presence could be used in Russian propaganda. (Rzeczpospolita) Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom says it is doubli");
System.out.println("ng the number of missiles it is sending to Ukraine, with 6,000 more missiles, including anti-tank guided missiles and surface-to-air missiles, and is also sending £30 million to help Ukraine pay the wages of its soldiers and air force pilots. (Reuters) "); 
  break;
case 25:
System.out.println("Kyiv offensive Battle of Kyiv Russia says that it used Kalibr cruise missiles to destroy a major oil terminal near Kyiv. (Reuters) Battle of Kherson A United States defense official states that the Russian forces are no longer in full control of Kherson, the only major city they had captured in Ukra");
System.out.println("ine. (The New York Times) Belarusian involvement in the 2022 Russian invasion of Ukraine Belarusian President Alexander Lukashenko reaffirms that Belarus has 'no plans to fight in Ukraine'. However, he also warned that Belarus could join the war if aggression is launched against it. (TASS) Russia sa");
System.out.println("ys that the first phase of the invasion has been completed. (BBC News) The Russian Defence Ministry updates its official casualty figures in Ukraine, stating that 1,351 troops have been killed in action and 3,825 others have been injured since the 'special military operation' began on February 24. (");
System.out.println("Eurasian Times)"); 
  break;
case 26:
System.out.println("Northeastern Ukraine offensive Battle of Kharkiv The Holocaust memorial at Drobytsky Yar is hit by Russian shelling, damaging the memorial's menorah. (Jerusalem Post) Russian forces airstrike the western city of Lviv, injuring five people. (Reuters) "); 
  break;
case 27:
System.out.println("Ukrainian delegate Davyd Arakhamia announces that in-person ceasefire talks between the Ukrainian and Russian delegations will occur in Turkey. The talks are expected to occur from March 28 to March 30. (Ukrinform) "); 
  break;
case 28:
System.out.println("Battle of Irpin Mayor Oleksandr Markushyn says that Irpin has been recaptured by Ukrainian Ground Forces. (Times of Israel) Northeastern Ukraine offensive Battle of Kharkiv Russian artillery damages a school in Kharkiv. (Yahoo News) (Sky News) Eastern Ukraine offensive Russian troops shell Rubizhne,");
System.out.println(" Luhansk Oblast, killing one person. (Ukrinform) Trostyanets is retaken by Ukrainian Armed Forces. (Jerusalem Post) 2022 Russia–Ukraine peace negotiations Russia cautions against expecting any 'significant breakthroughs' ahead of the first round of in-person negotiations with Ukraine. (MSN) Two Ukra");
System.out.println("inian negotiators as well as sanctioned Russian oligarch Roman Abramovich are reported to have fallen victim to suspected poisoning during peace talks on the Belarus–Ukraine border earlier this month. Their health has since improved. (Reuters) (BBC News) Ukrainian President Volodymyr Zelenskyy says ");
System.out.println("that some mayors abducted by invading Russian forces have been found dead. (Ukrayinska Pravda) (The Economist) "); 
  break;
case 29:
System.out.println("Southern Ukraine offensive Battle of Mykolaiv Mykolaiv government building airstrike A missile strike hits the regional administration's headquarters in Mykolaiv, killing twelve people and injuring 22 others. (Reuters) Kyiv offensive, Northeastern Ukraine offensive Russian troops begin retreating fr");
System.out.println("om positions in Kyiv Oblast and Chernihiv Oblast, according to Ukrainian and American officials. The United States European Command confirms the Russian withdrawal, observing a 'major strategy shift'. (U.S. News & World Report) (Times of Israel) Attack on Snake Island Roman Hrybov, the border guard ");
System.out.println("who told the Russian warship command over the radio 'Russian warship, go fuck yourself' in defiance of its order to surrender Snake Island, is freed in a prisoner swap. Initial reports erroneously suggested that 13 border guards on the island had died. (The Guardian) Reactions to the 2022 Russian in");
System.out.println("vasion of Ukraine Russia–NATO relations The U.S. deploys 200 marines from the Marine Air Control Group 28, 10 F/A-18 Hornet fighter jets, and an unspecified number of C-130s to Lithuania as part of NATO's response to Russian military aggression in Eastern Europe. (USNI) 2022 Russia–Ukraine peace neg");
System.out.println("otiations The Ukrainian and Russian delegations hold face-to-face peace talks in Turkey for the first time in two weeks. (AP) Russian officials agree to 'fundamentally cut back military activity in the direction of Kyiv and Chernihiv' during the negotiations. (The Guardian) A shell strikes a tempora");
System.out.println("ry Russian military camp near the city of Belgorod, 25 km from the Russia–Ukraine border. Russian authorities report at least four injuries, and say that the shell was fired from Ukrainian territory. Ukraine denies firing the missile, instead attributing the strike to an error on Russia's part. (Reu");
System.out.println("ters)"); 
  break;
case 30:
System.out.println("2022 Russian invasion of Ukraine Eastern Ukraine offensive Siege of Mariupol Ukraine says that Russian artillery and aircraft have targeted a Red Cross hospital in the city of Mariupol. (Times of Israel) Battle of Chernobyl Ukrainian Deputy Prime Minister Iryna Vereshchuk calls for Russia to withdra");
System.out.println("w from the Chernobyl Exclusion Zone area and for Russian troops occupying the former nuclear plant to pull out. (Reuters) A U.S. official says that Russian forces have begun withdrawing from the Chernobyl area and have moved into Belarus. (France 24) 2022 Ukrainian refugee crisis The United Nations ");
System.out.println("High Commissioner for Refugees says more than four million Ukrainians have fled the country since the invasion began on February 24. (France 24)"); 
  break;
case 31:
System.out.println("Battle of Chernobyl Energoatom confirms that the Russian forces who occupied the former nuclear power plant in Chernobyl have left the Chernobyl Exclusion Zone. (Ukrinform) The International Atomic Energy Agency confirms that Russian forces have handed over control of the former nuclear power plant ");
System.out.println("back to Ukraine. Russian troops also withdraw from the city of Slavutych, returning to Belarus. (CNBC) Siege of Mariupol Ukrainian Deputy Prime Minister Iryna Vereshchuk says that Ukraine has sent buses to Mariupol in an effort to evacuate citizens from the city. (BBC News)"); 
  break;
            default:
            System.out.println("Select a day from 1 to 31:");
  break;
           }
           break;
case 4:
          System.out.println("1. Enter a day in April(1-30):");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Battle of Bucha Ukrainian forces recapture Bucha, Kyiv Oblast, from Russian troops. (Ukrinform) Battle of Irpin Ukrainian forces recapture the city of Irpin after driving out the last Russian troops. Mayor Oleksandr Markushyn confirms that the city has been fully liberated. (BBC News) The body of Re");
System.out.println("uters journalist Maks Levin is found in the town of Huta Mezhyhirska, near Kyiv. Levin had already disappeared several days before and is the sixth journalist to be killed in the country since Russia invaded. (The Guardian) Attack on Belgorod Russia claims that the Ukrainian Air Force conducted an a");
System.out.println("irstrike on Belgorod, hitting several fuel facilities. Videos on social media show low-flying attack helicopters firing rockets at a fuel depot in the city. (AP) 2022 Russia–Ukraine peace negotiations Ceasefire talks between the Russian and Ukrainian delegations resume via video link. (Times of Isra");
System.out.println("el) "); 
           break;
case 2:
System.out.println("Battle of Bucha Bucha massacre, War crimes in the 2022 Russian invasion of Ukraine Hundreds of civilians are found dead on the streets in Bucha after the city is recaptured by Ukrainian forces. Journalists and Ukrainian forces say that they have uncovered evidence of war crimes by the Russian milita");
System.out.println("ry. (Times of Israel) (The Guardian) (The Kyiv Independent) Battle of Chernobyl The Ukrainian flag is raised over the Chernobyl Nuclear Power Plant following its recapture from Russian forces. A ceremony is held to honour the staff at the former plant who continued to work under Russian occupation. ");
System.out.println("(CNN) Ukraine retakes full control of the Kyiv Oblast as the last Russian troops return to Belarus. (Reuters) Southern Ukraine offensive Aftermath of the Siege of Enerhodar Residents say that Russian occupiers have violently dispersed a pro-Ukrainian demonstration in Enerhodar. Several protesters ar");
System.out.println("e arrested. Russian troops are also alleged to have used explosions in order to disperse the crowd. (Reuters) Eastern Ukraine offensive Siege of Mariupol Lithuanian documentary filmmaker Mantas Kvedaravičius is killed in Mariupol. (Reuters)"); 
           break;
case 3:
System.out.println("Southern Ukraine offensive Battle of Odesa Large explosions are reported in the port city of Odesa as residents are urged to seek shelter. Ukrainian officials say the Russian Air Force has fired missiles at the city, and that some missiles have been intercepted. (BBC News) (NDTV) Bucha massacre, War");
System.out.println(" crimes in the 2022 Russian invasion of Ukraine Human Rights Watch, an independent human rights group, says that it has documented allegations of war crimes perpetrated by Russian forces in Ukraine against civilians, including rape, summary execution, and looting of civilian properties. (CNN) The Un");
System.out.println("ited States, the European Union, and NATO leaders react to emerging reports of the massacre in Bucha, accusing the Russian Armed Forces of war crimes and calling for more sanctions against Russia. (BBC News)"); 
           break;
case 4:
System.out.println("Battle of Bucha U.S. President Joe Biden calls for Russian President Vladimir Putin to face trials for war crimes after more images emerge of the Bucha massacre. (CNN) 2022 Russia–Ukraine peace negotiations Ukrainian President Volodymyr Zelenskyy says that peace talks will continue despite the Bucha");
System.out.println(" massacre. (BBC News)"); 
           break;
case 5:
System.out.println("Eastern Ukraine offensive Siege of Mariupol A Dominica-flagged vessel berthed at the port in Mariupol is hit by artillery from the Russian Navy. One person is injured, but all crew members are successfully evacuated. (Reuters)"); 
           break;
case 6:
System.out.println("Eastern Ukraine offensive Battle of Sievierodonetsk Russian forces shell Sievierodonetsk, Luhansk Oblast, setting ten high-rise buildings on fire. (The Guardian) Four civilians are reported to have been killed by the Russian military in Vuhledar, Donetsk Oblast. (Reuters) 2022 Russia–Ukraine peace n");
System.out.println("egotiations Russia says it will end its invasion if Ukrainian President Volodymyr Zelenskyy agrees to conditions set during negotiations, specifically a legal guarantee that Ukraine will not join NATO by changing the Ukrainian constitution to include such a provision. Russia also says it suspended o");
System.out.println("perations in Kyiv as a 'goodwill gesture' in order to promote peace talks. (Hindustan Times)"); 
           break;
case 7:
System.out.println("The governor of Luhansk Oblast, Serhiy Haidai, reports that all hospitals in the province have been completely destroyed by the Russian Armed Forces. Russia denies the claim, accusing Ukraine of destroying their own hospitals. (CNN) Mayor Borys Filatov requests that all women, children, and elderly ");
System.out.println("leave the city of Dnipro in preparation for a possible Russian attack. (The Guardian)"); 
           break;
case 8:
System.out.println("Eastern Ukraine offensive Kramatorsk railway station attack A pair of Russian missiles strike a railway station in Kramatorsk, killing at least 50 people and injuring at least 87 others. (Reuters) (Al Jazeera) "); 
           break;
case 9:
System.out.println("Ukrainian President Volodymyr Zelenskyy says that Ukraine is still ready to continue peace negotiations with Russia. (RTÉ) Eastern Ukraine offensive Four people in Vuhledar and one person in Novomykhailivka, Marinka Raion, are killed by Russian shelling. Two people are injured. (Times of Israel) Ukr");
System.out.println("ainian Minister of Reintegration of Temporarily Occupied Territories Iryna Vereshchuk announces that President Zelenskyy has ordered a third prisoner exchange with Russia, with 12 Ukrainian soldiers and 14 civilians returning to Ukraine. (RFerl)"); 
           break;
case 10:
System.out.println("Kyiv offensive A mass grave of Ukrainian civilians is discovered near the village of Buzova, Kyiv Oblast. (Radio Free Europe/Radio Liberty) (Reuters) Prosecutor General of Ukraine Iryna Venediktova says that 1,222 bodies have been discovered so far in Kyiv Oblast. (Times of Israel) Northeastern Ukra");
System.out.println("ine offensive Two people are killed and several others are injured by Russian shelling in the town of Derhachi, Kharkiv Oblast. (Reuters) Dnipro International Airport is completely destroyed by Russian missile strikes. Five people are injured. (Reuters)"); 
           break;
case 11:
System.out.println("Siege of Mariupol Ukrainian President Volodymyr Zelenskyy announces that the city of Mariupol has been 'completely destroyed', stating the death toll as 'tens of thousands'. (Washington Examiner) Governor of Donetsk Oblast Pavlo Kyrylenko says that three people have been killed and eight more injure");
System.out.println("d by rocket attacks in the region. (Reuters)"); 
           break;
case 12:
System.out.println("2022 Russian invasion of Ukraine U.S. President Joe Biden calls the Russian war in Ukraine a 'genocide'. (AP) "); 
           break;
case 13:
System.out.println("Siege of Mariupol The Russian defence ministry claims that around 1,000 Ukrainian marines have surrendered to Russia. Ukraine makes no comment. (Rferl) Foreign aid to Ukraine during the Russo-Ukrainian War The United States says that it is sending an additional $800 million in military aid to Ukrain");
System.out.println("e, as well as heavy weapons, including artillery systems, artillery rounds, armored personnel carriers, Mi-17 helicopters transferred from Afghanistan, 300 Switchblade drones and unmanned surface vehicles for coastal defence. (Reuters) Russian deputy foreign minister Sergei Ryabkov says U.S. and NAT");
System.out.println("O vehicles transporting weapons on Ukrainian territory are 'legal military targets'. (Reuters) Northeastern Ukraine offensive Governor of Kharkiv Oblast Oleh Synyehubov says that seven people have been killed and 22 others have been injured in the oblast during the past 24 hours. (The Jerusalem Post");
System.out.println(") Kyiv offensive The Russian defence ministry says it will begin to target Ukrainian 'decision-makers', including President Volodymyr Zelenskyy, and command centres in the capital Kyiv if Ukrainian forces continue to attack Russian territory. (NDTV) Presidents Andrzej Duda of Poland, Gitanas Nausėda");
System.out.println(" of Lithuania, Egils Levits of Latvia, and Alar Karis of Estonia arrive in Kyiv and meet with Ukrainian president Volodymyr Zelenskyy. (AP) The Ukrainian military says that it has struck the Russian Navy's cruiser Moskva with Neptune anti-ship missiles hours after the warship was reported to be on f");
System.out.println("ire in the Black Sea. (FCB News) (NDTV)"); 
           break;
case 14:
System.out.println("April 2022 Belgorod and Bryansk attacks Russian authorities say that they have temporarily evacuated the entire populations of two villages after Ukrainian forces allegedly shelled the Russian settlement of Spodaryushino in Belgorod Oblast. (Times of Israel) Russia says that two Ukrainian helicopter");
System.out.println("s 'carried out at least six air strikes on residential buildings in the village of Klimovo' in Bryansk Oblast, injuring seven people. Ukraine denies the accusations, saying that Russians shot the villages themselves as part of a plan to 'whip up anti-Ukrainian hysteria'. (Radio Free Europe/Radio Lib");
System.out.println("erty) (Reuters) 2022 Russia–Ukraine peace negotiations Turkish Foreign Minister Mevlüt Çavuşoğlu says that Turkey is still working on organizing a potential meeting between Ukrainian President Volodymyr Zelenskyy and Russian President Vladimir Putin. (APA.az) The Russian defence ministry confirms th");
System.out.println("at the Russian Navy flagship cruiser Moskva sank in the Black Sea after an explosion and fire onboard. Ukraine claims to have hit the warship with Neptune anti-ship missiles. (TASS) (RIA)"); 
           break;
case 15:
           System.out.println("Russia launches major missile strikes on Kyiv, saying that the strikes are in retaliation for the April 2022 Belgorod and Bryansk attacks. (Reuters)");
           break;
case 16:
System.out.println("Northeastern Ukraine offensive Battle of Kharkiv Russian missile strikes hit Kharkiv, killing one person. (Reuters) A restaurant operated by the World Central Kitchen is confirmed to be destroyed by the missile strike. (The Hill) 2022 Russia–Ukraine peace negotiations It is reported that Russian oli");
System.out.println("garch Roman Abramovich has visited Kyiv in an effort to revive peace talks between Russia and Ukraine. (Bloomberg.com) The Russian Air Force launches airstrikes on Kyiv. (CTV News)"); 
           break;
case 17:
System.out.println("Siege of Mariupol The Russian Armed Forces give an ultimatum to the last remaining holdout of Ukrainian troops and 'foreign fighters' at the Azovstal iron and steel works plant in Mariupol to surrender. Defenders of the Azov Sea port ignore the ultimatum. (Reuters) (Al Jazeera) 2022 Ukrainian refuge");
System.out.println("e crisis For the first time since the invasion began, more Ukrainians entered Ukraine from Poland than left, according to the Polish Border Guard. (BBC News) Six people are killed by Russian missile strikes on Lviv. (Independent)"); 
  break;
case 18:
System.out.println("Eastern Ukraine offensive Russian troops capture the city of Kreminna in Luhansk Oblast. Local authorities say that four refugees have been shot dead trying to escape the city. (Ukrinform) (Reuters) The Russian defence ministry says that its forces have destroyed 16 Ukrainian military facilities, in");
System.out.println("cluding five command posts, a fuel depot and three ammunition warehouses in 'mass strikes' overnight. Russia also says that it shot down two Ukrainian MiG-29s and one Su-25. (Reuters)"); 
           break;
case 19:
System.out.println("Eastern Ukraine offensive Ukraine says that Russian forces have begun an anticipated military offensive in the Donbas with explosions reported in multiple cities. (BBC News) (Reuters) War in Donbas A civilian is killed and several others are injured by an explosion in Kramatorsk. (Times of Israel) N");
System.out.println("uclear threats during the Russian invasion of Ukraine Amidst American allegations that Russia may use nuclear weapons, Russian Foreign Minister Sergey Lavrov says that the country will not use them and will continue using conventional weapons. (Newsweek)"); 
           break;
case 20:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Ukrainian negotiator Mykhailo Podolyak says in a tweet that Ukraine is ready to hold a special round of negotiations in Mariupol in an effort 'To save our guys, Azov (battalion), military, civilians, children, the living and the wounded'. (Reuters) A 91-ye");
System.out.println("ar-old Holocaust survivor is confirmed to have died on April 4, making her the second Holocaust survivor to be killed during the 2022 Russian invasion of Ukraine. (BBC News) Presidential advisor Oleksiy Arestovych claims that Ukraine is blocking an attempted Russian advance on Sloviansk. (Reuters) F");
System.out.println("oreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that Ukraine has received fighter aircraft and aircraft parts to bolster the Ukrainian Air Force. However, the number of aircraft sent or their origin are not disclosed. (Euractiv)"); 
           break;
case 21:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Vladimir Putin tells his troops not to storm the Azovstal iron and steel works building in Mariupol, Donetsk Oblast, calling that plan 'impractical' and instead ordering a blockade of the area. (The Guardian) "); 
           break;
case 22:
System.out.println("Southern Ukraine offensive, Russian occupation of Kherson Russian Major general Rustam Minnekayev says that the goal of the military operation is now to seize territory in Southern Ukraine in order to create a land corridor from Crimea to Ukraine's border with Transnistria, a pro-Russian unrecognize");
System.out.println("d breakaway state that is internationally recognized as part of Moldova. (BBC News) (The Guardian) 2022 Ukrainian refugee crisis Ukraine says that it will not allow residents to evacuate Mariupol today over concerns that the route is too dangerous. (Times of Israel) The mayor of Balakliia in Kharkiv");
System.out.println(" Oblast is charged with treason by Ukrainian authorities for accepting aid from Russian occupation forces. The mayor is believed to have fled to Russia with his family. (Newsweek) "); 
           break;
case 23:
System.out.println("2022 bombing of Odesa Infrastructure in the Southern Ukrainian city of Odesa is hit by airstrikes, killing at least five people, including a baby, and injuring 18 others, according to the local authorities. (Reuters) (Times of Israel) The Investigative Committee of Russia announces that they are inv");
System.out.println("estigating allegations by RIA Novosti that troops from the British SAS have been deployed to Western Ukraine. (Reuters) (Al Jazeera)"); 
           break;
case 24:
System.out.println("Ukrainian authorities claim that a person has been killed by overnight shelling in Dnipropetrovsk Oblast. (Reuters) Russian state media reports that Ukraine has launched rockets into a village in Belgorod Oblast, Russia. (Reuters) The Swiss Federal Department of Economic Affairs vetoes Germany's req");
System.out.println("uest to re-export Swiss ammunition to Ukraine on the basis of Switzerland's neutrality. (Reuters) U.S. Secretary of State Antony Blinken and Defense Secretary Lloyd Austin arrive in Ukraine and meet with Ukrainian president Volodymyr Zelenskyy. In the highest-level American visit in Kyiv since the b");
System.out.println("eginning of the Russian invasion, Zelenskyy is informed of the approved new military assistance for Ukraine. (CBS News) The Russian embassy in Tehran denies that Iran is a secret armament supplier for the Russian war effort. (Tasnim News Agency) "); 
           break;
case 25:
System.out.println("April 2022 Belgorod and Bryansk attacks Two large fires occur at an oil refinery and a military depot in Bryansk, Russia. (The Guardian) Russian occupation of Kherson Oblast Kherson mayor Ihor Kolykhaiev announces that Russian forces have taken control of the Kherson City Council. (Ukrinform) Accord");
System.out.println("ing to Ukraine, Russian missile strikes hit numerous train stations across Ukraine. (The Guardian) A person is killed after Russia bombs the Kremenchuk Oil Refinery in Kremenchuk, Poltava Oblast. (Reuters) (Ukrinform) Regional authorities say that five people have been killed by airstrikes on Zhmery");
System.out.println("nka and Koziatyn, Vinnytsia Oblast. (Reuters) Russia's foreign ministry expels 40 German diplomatic staff in a retaliatory move after Germany expelled the same number of Russian diplomats. (Reuters)"); 
           break;
case 26:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom's Armed Forces Secretary James Heappey says that Ukraine can strike targets inside Russia with British weapons, saying that it is 'completely legitimate' in order to disrupt attacks on Ukraine. (The Guardian) The Russian Defenc");
System.out.println("e Ministry accuses the UK of 'provoking Ukraine' into attacking Russian territory, and warns of a 'proportional response' should any attacks occur. (BBC News) Germany announces the delivery of 50 ex-Bundeswehr Gepard anti-air tanks to Ukraine, the first heavy weaponry supplied by Germany since the s");
System.out.println("tart of the invasion. (Reuters) 2022 Russia–Ukraine peace negotiations UN Secretary-General António Guterres visits Moscow in order to meet with Russian President Vladimir Putin. Before the meeting, Guterres calls for a ceasefire to end the war. (The Hindu) President Putin says that Russia and Ukrai");
System.out.println("ne are continuing ceasefire talks online. (Reuters) A Russian missile strike destroys a strategic bridge across the Dniester Estuary in Odesa Oblast, according to Ukrainian authorities. (AP) Russian Foreign Minister Sergey Lavrov says that weapons supplied to Ukraine 'will be a legitimate target for");
System.out.println(" Russia's military' and further stating 'storage facilities in western Ukraine have been targeted'. Lavrov also stated that 'NATO, in essence, is engaged in a war with Russia through a proxy and is arming that proxy. War means war.'(Al Jazeera) (The Independent)"); 
           break;
case 27:
System.out.println("Southern Ukraine offensive, Russian occupation of Kherson Oblast The Ukrainian Air Force strikes the Kherson TV Tower with a missile temporarily forcing Russian television off-air in the occupied Kherson Oblast. (Canadian Press via Yahoo News) Russia says that it has struck 59 Ukrainian weapon facil");
System.out.println("ities during the night, including a depot in Zaporizhzhia Oblast which is being used to store weapons from the United States and Europe. (Reuters) Russia says that its air defences have shot down a Ukrainian unmanned aerial vehicle over the Kursk Oblast, while several explosions and a fire at an amm");
System.out.println("unition depot are reported in Belgorod Oblast. Ukraine describes the explosions in Russia as 'payback' and 'karma' for Moscow's invasion. (Reuters) "); 
           break;
case 28:
System.out.println("Two major explosions hit Kyiv after Russia conducts missile strikes during a high-level visit to the city by UN Secretary-General António Guterres. At least ten civilians are injured and a Radio Free Europe/Radio Liberty journalist is killed. (Reuters) (VOA) "); 
  break;
case 29:
           System.out.println("Russian President Vladimir Putin accepts an invitation to the upcoming G20 summit in Bali, Indonesia, despite Russia’s invasion of Ukraine. Ukrainian President Volodymyr Zelenskyy is also invited to the summit. (FirstPost)");
           break;
case 30:
System.out.println("2022 Russia–Ukraine peace negotiations Russian Foreign Minister Sergey Lavrov says that sanctions must be lifted as part of the peace negotiations between Ukraine and Russia. (Reuters) April 2022 Belgorod and Bryansk attacks Governor of Kursk Oblast Roman Starovoyt says that shells have been launche");
System.out.println("d at a border checkpoint from the direction of Ukraine. (Reuters) Around 20 civilians have left the steel plant, a deputy commander of the Azov Battalion says. (The Times of Israel) "); 
  break;
           default:
           System.out.println("Enter a day from 1 to 30:");                     

          //System.out.println(""); 
          }
          break;
case 5:
          System.out.println("1. Enter a day in May:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Eastern Ukraine offensive Siege of Mariupol Some civilian evacuations begin from the Azovstal iron and steel works in Mariupol. Officials believe that up to 1,000 people have sought refuge at the plant, which has been the target of Russian airstrikes for days. However, evacuations are suspended unti");
System.out.println("l 8 a.m. tomorrow due to 'security concerns'. (The Washington Post) (CNN) Five people are killed by Russian shelling in the town of Lyman. (Times of Israel) April 2022 Belgorod and Bryansk attacks A fire reportedly occurs at a military facility in Belgorod Oblast, Russia, slightly injuring one perso");
System.out.println("n and damaging seven houses. (Reuters) Transnistria conflict Ukrainian intelligence officials report that Russia is poised to launch a second front from the breakaway area of Transnistria in order to take over the rest of Moldova. (The Times)"); 
           break;
case 2:
System.out.println("Southern Ukraine offensive 2022 bombing of Odesa A Russian missile hits a dormitory in Odesa, killing a 14-year-old boy and wounding a 17-year-old girl, according to Ukrainian officials. An Orthodox Church was also damaged in the missile strike. (Reuters) Siege of Mariupol The resumption of civilian");
System.out.println(" evacuations from the Azovstal steel mill which was expected to begin at 8 a.m. local time does not occur, as Russia begins a non-stop barrage of airstrikes and bombings following the departure of Red Cross personnel, who had left the previous day after the evacuations were suspended. (CNN) Five Rus");
System.out.println("sian troops are allegedly killed during a supposed incursion into the steel plant. (CNN) Belgorod and Bryansk attacks Explosions are reported in the city of Belgorod, Belgorod Oblast, Russia. Governor Vyacheslav Gladkov states that there were no casualties or damage. (Reuters via NDTV) A Ukrainian A");
System.out.println("ir Force Bayraktar TB2 drone destroys two Russian Raptor-class patrol boats near Snake Island in the Black Sea. (CBS News)"); 
           break;
case 3:
System.out.println("Eastern Ukraine offensive Governor of Donetsk Oblast Pavlo Kyrylenko says that nine people have been killed by Russian shelling in Donetsk Oblast, Ukraine. (Reuters) Ten people are killed after projectiles hit a coking plant in Avdiivka, Donetsk Oblast. (Reuters) The United Nations says that 127 peo");
System.out.println("ple have been evacuated from the besieged Azovstal plant and nearby areas. (PBS News) 2022 Russia–Ukraine peace negotiations Russian President Vladimir Putin tells French President Emmanuel Macron that his country is ready to continue peace negotiations with Ukraine amidst fears that talks between t");
System.out.println("he two countries have stalled. (TASS) (KMGH-TV) "); 
           break;
case 4:
System.out.println("The Associated Press confirms that approximately 600 people died in the Mariupol theatre airstrike. (AP) Russian forces bombard the Azovstal steel works plant in Mariupol with thermobaric missiles. Mariupol mayor Vadym Boychenko confirms that contact has been lost with Ukrainian soldiers trapped ins");
System.out.println("ide the plant. (Mirror) Ukraine confirms that Russian troops have entered the steel works plant after launching an all-out assault. (BBC News) Finland says that a Russian Air Force Mi-17 violated its airspace this morning, flying four to five kilometres inside Finnish airspace. The incursion comes a");
System.out.println("head of an expected Finnish application to join NATO. (RTÉ) Business and economy  International sanctions during the 2022 Russian invasion of Ukraine The European Union proposes to ban all oil imports from Russia by the end of the year, and also remove Russia's biggest bank, Sberbank, from SWIFT. (C");
System.out.println("NN) "); 
           break;
case 5:
System.out.println("Siege of Mariupol Ukrainian forces say they have repelled a Russian military thrust onto the Azovstal iron and steel works in Mariupol, Ukraine. (PBS News)"); 
           break;
case 6:
System.out.println("2022 Russia–Ukraine peace negotiations Ukrainian President Volodymyr Zelenskyy says that Ukraine is open to continue peace talks with Russia if they guarantee the restoration of preinvasion borders, return the Ukrainians who were forcefully evacuated to Russia, and if Russian troops withdraw from th");
System.out.println("e country. (The Independent) (Axios) Ukrainian MP Oleksiy Goncharenko claims that the Russian frigate Admiral Makarov was struck with Neptune anti-ship missiles off of Snake Island. Russia denies having any information of the strike. (Newsweek)"); 
           break;
case 7:
System.out.println("2022 bombing of Odesa Four Russian missiles strike the Ukrainian port city of Odesa. (Reuters) Siege of Mariupol Ukraine says that all women, children, and elderly have been evacuated from the besieged Azovstal steel plant. (Reuters) Bilohorivka school bombing Russian forces bomb a school in Bilohor");
System.out.println("ivka, Sievierodonetsk Raion, Luhansk Oblast. Only two deaths are confirmed but sixty people are believed to have been killed. (Reuters)"); 
           break;
case 8:
System.out.println("Prime Minister of Canada Justin Trudeau, Deputy Prime Minister Chrystia Freeland and Minister of Foreign Affairs Mélanie Joly make an unannounced visit to Kyiv to meet with President of Ukraine Volodymyr Zelenskyy amid the ongoing Russian invasion. (CTV News) Trudeau announces the reopening of the C");
System.out.println("anadian Embassy in Kyiv. (Politico) Ukraine–United States relations U.S. First Lady Jill Biden makes an unannounced visit to Uzhhorod, Ukraine, and holds a Mother’s Day meeting with Ukrainian First Lady Olena Zelenska. (AP) (CNN)"); 
           break;
case 9:
System.out.println("Enlargement of NATO The Swedish Social Democratic Party announces that it will decide on May 15 whether to pursue a course of action to join NATO. Finnish President Sauli Niinistö is expected to also announce Finland's intention to join NATO on May 12. (Al Jazeera)"); 
           break;
case 10:
System.out.println("The operator of Ukraine's natural gas system GTSOU announces that it will stop shipments of Russian gas through the Sokhranivka route on Wednesday. (Reuters) International relations  Lithuania–Russia relations, Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine The Se");
System.out.println("imas of Lithuania unanimously votes to designate Russia as a terrorist state and to classify Russia's actions in Ukraine as genocide. (NPR)"); 
           break;
case 11:
System.out.println("2022 bombing of Odesa Russian forces continue to fire missiles at the Ukrainian port city of Odesa in an apparent attempt to cut supplies to the city. (AP) Battle of Kharkiv Ukrainian military forces recapture several settlements north of Kharkiv, driving Russian troops to less than a dozen miles fr");
System.out.println("om the Russian border. (MSN)"); 
           break;
case 12:
System.out.println("Eastern Ukraine offensive Ukrainian forces repel an attempted Russian military crossing of the Donets river, west of Sievierodonetsk, in Luhansk Oblast. At least one Russian battalion tactical group is reportedly destroyed, as well as the pontoon bridge deployed in the crossing. (Reuters) The Russia");
System.out.println("n Air Force launches around a dozen missiles at the city of Kremenchuk, including four at the Kremenchuk Oil Refinery, in Poltava Oblast. (Ukrinform)"); 
           break;
case 13:
System.out.println("RAO Nordic, a subsidiary of Russian energy company Inter RAO, announces it will suspend deliveries of electricity to Finland, saying it has not been paid for prior deliveries. The suspension comes as Russia threatens retaliation if Finland joins NATO. (BBC News) Finland–Turkey relations, Sweden–Turk");
System.out.println("ey relations Turkish president Recep Tayyip Erdoğan says that Turkey will oppose Sweden and Finland's applications to join NATO, asserting that the countries are guesthouses for terrorist organisations, without giving details. Turkey has repeatedly criticized Sweden and other Western European countr");
System.out.println("ies for its handling of organisations labeled terrorist by the Turkish government, including the Kurdish militant groups PKK and YPG, and the followers of U.S.-based Islamic cleric Fethullah Gülen. (Reuters) Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine Russia–Un");
System.out.println("ited States relations U.S. Defense Secretary Lloyd Austin holds talks with Russian Defense Minister Sergei Shoigu in the first meeting between the two since the start of the invasion. (Reuters)"); 
           break;
case 14:
System.out.println("Proposed Russian annexation of South Ossetia Outgoing South Ossetian President Anatoly Bibilov announces that a referendum on joining Russia will be held on July 17. (Reuters)"); 
           break;
case 15:
           System.out.println("Russia launches missile strikes from the Black Sea on military infrastructure in Yavoriv Raion, Lviv Oblast, located near Ukraine's western border with Poland. The target was completely destroyed, according to the region's governor Maksym Kozytskyy. (Reuters)");
           break;
case 16:
System.out.println("Battle of Kharkiv Ukraine says that its troops have pushed back Russian forces in a counter-offensive, reaching the border with Russia. Kharkiv governor Oleh Synyehubov confirms that Ukrainian forces have restored control of a border crossing with Russia in the region. (Reuters) Siege of Mariupol Fi");
System.out.println("ve buses and an armored personnel carrier evacuate several hundred soldiers from the Azovstal steel works following negotiations with the Russian Armed Forces. The evacuated soldiers will be exchanged for Russian prisoners of war. (BBC News) (Reuters) The Russian Defence Ministry says that its force");
System.out.println("s have shot down three Ukrainian Air Force warplanes, including a Su-25 over Mykolaiv and a Su-24 strike jet near Snake Island in the Black Sea. (Reuters)"); 
           break;
case 17:
           System.out.println("A Russian airstrike kills eight people and injures twelve others in Desna, Chernihiv Oblast. (Reuters)");
           break;
case 18:
           System.out.println("Google's Russian subsidiary announces its intention to file for bankruptcy after Russian authorities seize the company's bank account. (Reuters)");
           break;
case 19:
           System.out.println("The United States Senate votes 86–11 to pass a $40 billion package aimed at sending aid to Ukraine. The legislation will head to U.S. President Joe Biden for his signature. (Reuters)");
           break;
case 20:
System.out.println("Siege of Mariupol Ukraine's chief military command orders all remaining troops in the Azovstal steel plant to stop defending Mariupol. (AFP via Le Devoir) (Sky News) Russia says that its forces have seized the Azovstal steel plant after the last remaining Ukrainian troops surrender. (BBC News) Donba");
System.out.println("s offensive Ukraine says that it has repelled a Russian advance on the cities of Sievierodonetsk and Lysychansk in Luhansk Oblast. Authorities say that twelve people were killed in the offensive and that over 60 houses were destroyed. (AP)"); 
           break;
case 21:
System.out.println("Siege of Mariupol Russia declares victory in capturing the city of Mariupol. (The Guardian) United States President Joe Biden signs into law a bill that would provide $40 billion in military and economic aid for Ukraine, replenish stocks of U.S. equipment sent to Ukraine, fund European Command opera");
System.out.println("tions, and address the global food crisis. (CNN) (Reuters) "); 
           break;
case 22:
           System.out.println("The Russian-appointed mayor of Enerhodar, in Russian-occupied Zaporizhzhia Oblast, is severely injured in an explosion. The cause of the blast is unclear. (Reuters)");
           break;
case 23:
System.out.println("Russian diplomat Boris Bondarev says that he has resigned to protest the invasion of Ukraine. (Reuters) "); 
           break;
case 24:
System.out.println("Siege of Mariupol Ukrainian authorities say that about 200 dead people are found in the rubble of an apartment building in Mariupol, Donetsk Oblast. (AP) Battle of Donbas Russian Ground Forces seize control of Svitlodarsk in Donetsk Oblast, according to regional governor Pavlo Kyrylenko. (Reuters) H");
System.out.println("ungary declares a state of emergency over the war in Ukraine and problems in the Hungarian economy caused in part by the conflict. (Reuters) "); 
           break;
case 25:
System.out.println("Donbas offensive The Ukrainian city of Pokrovsk, Donetsk Oblast, is hit by Russian missiles, injuring several people. (AP) Southern Ukraine offensive A Russian cruise missile strike destroys a shopping centre and several homes in the city of Zaporizhzhia, killing one person and injuring three others");
System.out.println(". At least 62 homes were damaged, according to local officials. (Ukrinform)"); 
           break;
case 26:
System.out.println("Eastern Ukraine offensive Battle of Kharkiv Seven people are killed by Russian shelling in downtown Kharkiv, according to local authorities. (Ukrinform) The Russian defense ministry says that civil vessels are allowed to use a maritime humanitarian corridor to access the port of Mariupol, which Russ");
System.out.println("ia captured last week. (Reuters) "); 
           break;
case 27:
System.out.println("Battle of Lyman Russian forces announce they have captured the city of Lyman. (AP)"); 
           break;
case 28:
System.out.println("Battle of Sievierodonetsk Russian troops enter the strategic city of Sievierodonetsk in Luhansk Oblast with heavy street-to-street fighting underway. Luhansk governor Serhiy Haidai says that Ukrainian forces may have to retreat from the city in order to avoid capture. (Reuters) Foreign aid to Ukrain");
System.out.println("e during the Russo-Ukrainian War Ukraine confirms that it has received shipments of Harpoon anti-ship missiles from Denmark, and self-propelled howitzers from the United States in order to counter the Russian invasion. (Reuters)"); 
           break;
case 29:
           System.out.println("Nothing significant to report");
  break;
case 30:
System.out.println(" Battle of Donbas Battle of Sievierodonetsk Ukrainian authorities say that Russian forces have entered Sieverodonetsk, Luhansk Oblast, leaving the city without water. (Al Jazeera) Rebel forces say a Ukrainian shelling attack in Donetsk has killed five civilians (including a teenager) and left 13 inj");
System.out.println("ured. (AP) (Le Monde) A French journalist is killed by Russian shelling in Luhansk Oblast, according to the region's governor Serhiy Haidai. (Reuters) A car bomb is detonated in Russian-occupied Melitopol, Zaporizhzhia Oblast, injuring at least three people. Russian authorities blame pro-Ukrainian r");
System.out.println("esidents for the incident. (Reuters)"); 
           break;           
case 31:
System.out.println("Eastern Ukraine offensive Battle of Sievierodonetsk An airstrike hits a tank filled with nitric acid in Sievierodonetsk, Luhansk Oblast, prompting the region's governor to ask residents to remain inside bomb shelters due to the risk of exposure to toxic fumes. (Reuters) Ukraine says that Russian for");
System.out.println("ces have taken control of most of Sievierodonetsk after launching a full-scale assault on the city. Luhansk governor Serhiy Haidai says that 60% of structures in the city have been destroyed in the fighting. (Reuters) A Russian missile hits an apartment in Sloviansk, Donetsk Oblast, killing three pe");
System.out.println("ople and injuring six others. (AP)"); 
           break;
           default:
            System.out.println("Select a day from 1 to 31:");

           //System.out.println("");
           
          }
          break;
case 6:
          System.out.println("1. Enter a day in June:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Eastern Ukraine offensive Three civilians are killed after Russian forces shell the Sviatohirsk Lavra monastery. (Ukrayinska Pravda via Yahoo! News) Foreign aid to Ukraine during the Russo-Ukrainian War Germany says that it will send the IRIS-T air defence missile system to Ukraine following a reque");
System.out.println("st from Ukraine for heavy weapons. (Reuters) U.S. President Joe Biden agrees to provide Ukraine with long-range rocket artillery systems after Ukraine reportedly gave assurances that they will not use the missile systems to strike Russian cities. The weapons systems are a part of a new $700 million ");
System.out.println("weapons package to Ukraine that will also include ammunition, counter-fire radars, a number of air surveillance radars, and additional Javelin anti-tank missiles. (Reuters) Russia says the U.S. decision to supply advanced long-range rocket systems and munitions to Ukraine could widen the conflict, a");
System.out.println("nd also risks direct confrontation with Russia, accusing the United States of purposefully and diligently adding fuel to the fire. (Reuters) "); 
           break;
case 2:
System.out.println("Southern Ukraine offensive Ukrainian officials say that the Armed Forces of Ukraine have recaptured 20 settlements in Kherson Oblast. (VOA) Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces that it will send M270 Multiple Launch Rocket Systems to Ukraine to counter t");
System.out.println("he Russian invasion. (Euro Weekly News) Sweden announces that it will send additional military aid to Ukraine, including anti-ship missiles, anti-tank guided missiles, and rifles for the Ukrainian Ground Forces. (Reuters)"); 
           break;
case 3:
System.out.println("Battle of Donbas Battle of Sievierodonetsk Two Reuters journalists are injured and their driver is killed after their vehicle is attacked while travelling to Sievierodonetsk. The perpetrators have not been identified. (Times of Israel) Russian occupation of Kharkiv Oblast Vitaly Ganchev is announced");
System.out.println(" as head of the Kharkiv Military-Civilian Administration. His appointment might have happened earlier as he was de facto Governor since April 2022."); 
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("2022 Russian invasion of Ukraine Battle of Donbas Russian major general Roman Kutuzov is killed in Mykolaivka, Luhansk Oblast. (Reuters) (Ukrayinska Pravda) Russia launches airstrikes on the Ukrainian capital Kyiv for the first time since April 28. The Russian Defence Ministry says that the missile ");
System.out.println("strikes targeted T-72 tanks that had been supplied to Ukraine by several EU countries. At least one person is injured. (The Guardian)"); 
           break;
case 6:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces that it will send several M270 long-range rocket artillery systems to Ukraine. (The Guardian)"); 
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
           System.out.println("Vitaliy Khotsenko is sworn as new Prime Minister of the Donetsk People's Republic following dimission of Alexander Ananchenko. (TASS)");
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
           System.out.println("The Ministry of Foreign Affairs of Ukraine states that the country has installed naval mines in the exercise of our right to self-defence. (Reuters)");
           break;
case 11:
System.out.println("Battle of Sievierodonetsk Russian forces shell the Azot chemical plant in Sievierodonetsk, Luhansk Oblast. Governor Serhiy Haidai says that the attack has caused a massive fire at the plant. (Reuters) "); 
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
System.out.println("Battle of Sievierodonetsk Russian forces destroy the last remaining bridge leading to Sievierodonetsk in Luhansk Oblast, Ukraine, trapping all remaining Ukrainian civilians in the city, according to regional governor Serhiy Haidai. (Reuters) Battle of Donbas The Donetsk People's Republic says that f");
System.out.println("ive people have been killed and 22 others injured in an artillery attack on a marketplace in central Donetsk. Pro-Russian media accuses NATO of supplying the munitions used in the attack. (Reuters)"); 
           break;
case 14:
System.out.println("2022 Western Russia attacks Six people are reported injured in an alleged shelling attack on Klintsy, Bryansk Oblast, Russia. (Reuters)"); 
           break;
case 15:
           System.out.println("The United States announces a new $1 billion military aid package to Ukraine that includes 18 howitzers, artillery rockets, night vision devices, and for the first time, two Harpoon anti-ship missile units. (Reuters)");
           break;
case 16:
System.out.println("2022 Russian invasion of Ukraine Ukrainian officials say that four people have been killed and six others have been injured in a rocket attack in Sumy overnight. (Reuters) The mayor of Melitopol claims that Ukrainian farmers caused mass illness in Russian troops by poisoning cherries. (The Daily B");
System.out.println("east)"); 
           break;
case 17:
System.out.println("Nuclear threats during the Russian invasion of Ukraine Russian President Vladimir Putin says that Russia would only use nuclear weapons if the sovereignty of the country is threatened. (Ukrinform) Ukrainian authorities say that its forces hit the Russian tugboat Vasiliy Bekh transporting soldiers, w");
System.out.println("eapons, and ammunition to Snake Island with Harpoon missiles. (Al Arabiya)"); 
           break;
case 18:
System.out.println("Donetsk People's Republic authorities accuse Ukrainian forces of shelling the Zasyadko coal mine and trapping 77 miners. (Al Arabiya) 2022 Russia–Ukraine peace negotiations Ukrainian delegate Davyd Arakhamia says that Ukraine is planning to resume ceasefire negotiations with Russia this August. (Fin");
System.out.println("ger Lake Times)"); 
           break;
case 19:
System.out.println("Russian occupation of Kharkiv Oblast Ukraine says that Russian forces are advancing on the city of Kharkiv. (Reuters) Battle of Sievierodonetsk Russia says that its forces captured a district in the outskirts of Sieverodonetsk and that it launched Kalibr cruise missiles against a command centre in D");
System.out.println("nipro, killing several Ukrainian generals and officers. (Reuters) "); 
           break;
case 20:
System.out.println("Pro-Russian forces of the Luhansk People's Republic claim to have taken the key town of Toshkivka, 25 km south of Sieverodonetsk. (Reuters) Ukrainian forces fire missiles at a Chornomornaftogaz drilling oil facility in the Black Sea, off Crimea, injuring three workers, with seven others missing. Rus");
System.out.println("sia launches missile strikes on Odesa in retaliation for the attack. (The Telegraph) (The Telegraph 2) A second American volunteer fighter dies in Ukraine, after triggering a landmine. (Rolling Stone)"); 
           break;
case 21:
System.out.println("Russian occupation of the Luhansk Oblast Luhansk Governor Serhiy Haidai says that Russian forces captured the towns of Pidlisne and Myrna Dolyna, south of Lysychansk, and also confirms reports that separatist forces captured Toshkivka yesterday. (Reuters) The Governor of Kharkiv Oblast, Oleh Synyehu");
System.out.println("bov, reports that Russian shelling killed 15 civilians in and near Kharkiv. (Reuters)"); 
           break;
case 22:
System.out.println("The Ukrainian Air Force launches drone strikes on an oil refinery in Novoshakhtinsk, Rostov Oblast, Russia, causing a large explosion and fire. Operations at the refinery have been suspended. Footage on social media appears to show at least one armed drone striking the facility. (Reuters) War crimes");
System.out.println(" in the 2022 Russian invasion of Ukraine Reporters Without Borders releases a report claiming that a Ukrainian photojournalist was summarily executed while injured on the ground by Russian soldiers during the early stages of the conflict. (Al Jazeera) Southern Ukraine offensive Seven Russian missile");
System.out.println("s strike the city of Mykolaiv, killing at least one person and damaging a number of residential and commercial buildings, according to Mykolaiv governor Vitaliy Kim. (The Telegraph) The Ukrainian military says that it has inflicted significant losses on Russian forces after launching airstrikes on S");
System.out.println("nake Island in the Black Sea, destroying a Pantsir missile system, a radar station and numerous vehicles on the occupied island. (Euronews) "); 
           break;
case 23:
System.out.println("The Governor of Luhansk Oblast, Serhiy Haidai, says that Russia is just destroying everything in Lysychansk as pro-Russian separatists say they are close to capturing both that city and Sieverodonetsk. (AFP via Dunya News) War crimes in the 2022 Russian invasion of Ukraine The first trial for rape d");
System.out.println("uring the war in Ukraine is set to begin in absentia against a 32-year-old Russian soldier accused of murdering a civilian and repeatedly raping his wife during the offensive in Kyiv. (Reuters)"); 
           break;
case 24:
System.out.println("Battle of Sievierodonetsk Governor of Luhansk Oblast Serhiy Haidai announces that Ukrainian forces will withdraw from Sievierodonetsk amid the advance of Russian and pro-Russian forces. (Axios) A Russian-appointed senior official for the Kherson youth department is killed by a car bombing in Kherson");
System.out.println(" in an apparent assassination. (Al Jazeera) (The Moscow Times) Ukrainian authorities say that Russian forces have captured the city of Hirske, south of Lysychansk, in Luhansk Oblast. Chechen leader Ramzan Kadyrov says that his forces also captured the town of Zolote. (Reuters) (Newsweek)"); 
           break;
case 25:
System.out.println("Battle of Sievierodonetsk The mayor of Sieverodonetsk announces that Russian forces have fully occupied the city. (Reuters) Eastern Ukraine offensive Pro-Russian forces say that they have entered the city of Lysychansk, the last major city still held by Ukrainian forces in Luhansk Oblast, and that s");
System.out.println("treet-to-street fighting is underway. (First Post) Russia launches dozens of cruise missiles at targets in multiple Ukrainian cities, including Yavoriv, Zhytomyr, and Desna. At least 20 missiles were fired from Belarusian airspace. (Reuters) (Yahoo! News)"); 
           break;
case 26:
System.out.println("Several Russian cruise missiles strike Kyiv, killing one civilian and injuring four others, according to Ukraine's Prosecutor General. Some of the missiles were launched from Tupolev Tu-95 strategic bombers over the Caspian Sea. (BBC News) (Al Jazeera) (Ukrinform) A missile strike kills a civilian a");
System.out.println("nd destroys a strategic bridge connecting western Ukraine with eastern battlefields in Cherkasy Oblast. (Reuters)"); 
           break;
case 27:
System.out.println("Kremenchuk shopping mall attack Two missiles strike a crowded mall in the city of Kremenchuk, killing at least 13 people and injuring at least 50 others. Ukrainian President Volodymyr Zelenskyy says that more than a thousand people were in the mall at time of the attack. (Reuters) (Al Jazeera) The G");
System.out.println("overnor of Luhansk Oblast claims that a Russian strike in Lysychansk killed eight civilians who were collecting water and injured 21 others. (NDTV) Business and economy  2022 Russian debt default Russia defaults on two Taiwanese-owned Eurobonds worth US$100 million after Western sanctions on Russia ");
System.out.println("led Euroclear to block Russian attempts to service the debt before yesterday's deadline. Russia describes the default as artificially manufactured and a farce. The default will have few immediate consequences for Russia since the country is currently unable to borrow internationally due to the SWIFT");
System.out.println(" ban against Russian banks. (Reuters) (BBC News)"); 
           break;
case 28:
           System.out.println("Nothing significant to report");
           break;
case 29:
System.out.println("Russian occupation of Kherson Oblast De jure mayor of Kherson Ihor Kolykhaiev is detained by Russian security forces after Russian-installed officials say that he refused to follow orders. (Reuters) The Russian-appointed military-civilian authorities in Kherson announce a referendum on whether to jo");
System.out.println("in Russia. (Reuters)"); 
           break;
case 30:
           System.out.println("Russia announces that it has withdrawn from Snake Island, in the Black Sea, as a gesture of goodwill, ending the occupation of the island that began in February. However, Ukraine says that it drove out Russian forces from the island after a massive artillery assault. (Reuters)");
           break;
           //System.out.println("");
           default:
           System.out.println("Select a day from 1 to 30:");  
        }
        break;

case 7:
          System.out.println("1. Enter a day in July :");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Serhiivka missile strike At least 21 civilians are killed and 38 others injured when two Russian missiles strike a multi-story building and a recreation centre in Serhiivka, Odesa Oblast. (The Guardian)"); 
           break;
case 2:
System.out.println("The Mariupol City Council claims that over 10,000 of the city's residents are being held prisoner by the separatist Donetsk People's Republic. (UkInterfax) Belarusian President Alexander Lukashenko claims that his country intercepted Ukrainian missiles directed at Belarus three days ago and says tha");
System.out.println("t Belarus does not want war with Ukraine. (CNBC)"); 
           break;
case 3:
System.out.println("2022 Western Russia attacks Three people are killed by explosions at residential buildings in Belgorod, Russia, near the border with Ukraine. Fifty buildings are partially destroyed by the explosions. (BBC News) Armed forces of Russia and the separatist Luhansk People's Republic capture the entire L");
System.out.println("uhansk Oblast after seizing Lysychansk. Ukrainian forces confirm that they were forced to retreat. (CNN) Six people are killed and many others are injured as heavy shelling from rocket launchers hit the city of Sloviansk, in Donetsk Oblast, according to a report from the city's mayor. (Yahoo! News)"); 
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("Battle of Donbas According to Ukraine, two civilians are killed in a Russian missile attack on Sloviansk in Donetsk Oblast. (Reuters) The Governor of Donetsk Oblast urges civilians to evacuate as Russia advances. Around 350,000 civilians have already evacuated. (Al Jazeera)"); 
           break;
case 6:
System.out.println("Battle of Donbas At least twelve civilians are killed and 25 others are injured by heavy Russian shelling in Donetsk Oblast, according to a report by Governor Pavlo Kyrylenko. (AP) (VOA) Government and intergovernmental reactions to the 2022 Russian invasion of Ukraine Latvia plans to reintroduce co");
System.out.println("nscription, which had been abolished in 2006, as a result of the Russian invasion of Ukraine. The final decision will be determined by the country's parliament, the Saeima. (Baltic News Network) (AFP via The Guardian)"); 
           break;
case 7:
System.out.println("Battle of Donbas Russian forces launch airstrikes on the city of Kramatorsk, in Donetsk Oblast, with casualties reported, according to the city's mayor. (Reuters) Russia says that it fired missiles at Snake Island, killing an unspecified number of Ukrainian troops. However, Ukraine denies that any c");
System.out.println("asualties have occurred. (Evening Standard) "); 
           break;
case 8:
System.out.println("2022 Russian invasion of Ukraine Serhiy Haidai, Governor of Luhansk Oblast, says that Russian shelling continues across the oblast and that the 8,000 residents of Sievierodonetsk are on the verge of a humanitarian catastrophe. (ABC News) "); 
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
System.out.println("Battle of Donbas Missile strike on Chasiv Yar A Russian airstrike on an apartment complex in Chasiv Yar, Donetsk Oblast, kills at least 47 people and leaves nine others injured. (Sky News)"); 
           break;
case 11:
System.out.println("Three civilians are killed and 31 others are injured in a Russian shelling of Kharkiv. The city's mayor says that the latest shelling has targeted civilian infrastructure. (SwissInfo) Russian occupation of Kharkiv Oblast The Russian-appointed military-civilian administration leader of Velykyi Burluk");
System.out.println(" in Kharkiv Oblast, Yevgeny Yunakov, is assassinated in a car bombing. (Reuters) 2022 Ukrainian summer counteroffensive Ukrainian Ground Forces recapture the town of Ivanivka in Kherson Oblast after launching a counter-offensive against Russian forces. (Reuters)"); 
           break;
case 12:
System.out.println("2022 Ukrainian summer counteroffensive Nova Kakhovka airstrike A massive explosion occurs in the city of Nova Kakhovka after Ukrainian forces destroy a Russian arms depot. Russian state news agency TASS claims that a market, hospital, and civilian housing were also damaged, and that multiple civilia");
System.out.println("ns were killed. Russian 22nd Army Corps general Artem Nasbulin is allegedly among the dead. (Ukrayinska Pravda) (Reuters) (UPI) U.S. National Security Advisor Jake Sullivan claims that Iran will provide Russia with hundreds of drones along with the necessary training for their use. (The Washington P");
System.out.println("ost)"); 
           break;
case 13:
System.out.println("Battle of Donbas Heavy Russian shelling is reported in Bakhmut, Donetsk Oblast, with at least one person killed and five others injured in the largely evacuated town. (The Guardian)"); 
           break;
case 14:
System.out.println("2022 Vinnytsia attacks July 2022 Vinnytsia missile strike At least 23 civilians are killed and more than 100 others are injured by three Russian missile strikes in Vinnytsia. (BBC News)"); 
           break;
case 15:
           System.out.println("At least three civilians are killed and 15 others are injured in Russian cruise missile strikes on the city of Dnipro. (Reuters)");
           break;
case 16:
System.out.println("Russian missiles strike the city of Chuhuiv in Kharkiv Oblast, killing three civilians and injuring three others, while more than 50 Grad rockets hit the city of Nikopol in Dnipropetrovsk Oblast, killing two people. The missile strikes come after Russian defence minister Sergei Shoigu ordered the mi");
System.out.println("litary to expand operations in Ukraine in order to protect the Donbas. (Reuters) The president of Energoatom, the Ukrainian nuclear energy authority, accuses Russian forces of using the Zaporizhzhia Nuclear Power Plant to store weapons and shell the surrounding area. (The Journal.ie) "); 
           break;
case 17:
           System.out.println("Nothing significant to report");
           break;
case 18:
System.out.println("Russian shelling kills six civilians in Toretsk, Donetsk Oblast, as Ukraine says that Russia appears to be preparing for a new ground offensive near Sloviansk. (BBC News) Russian occupation of Zaporizhzhia Oblast Russia announces Anton Koltsov, former Prime Minister of Vologda Oblast, as the new Pri");
System.out.println("me Minister in Zaporizhzhia Military-Civilian Administration. His appointment probably took place some days earlier.[1] Business and economy  Russia in the European energy sector Russia's Gazprom says that it 'cannot guarantee' gas supplies to Europe due to 'extraordinary circumstances' as it declar");
System.out.println("es force majeure on gas supplies dating from June 14. (Reuters)"); 
           break;
case 19:
           System.out.println("Gazprom signs a memorandum of understanding for the development of Iranian oil and gas fields and related infrastructure worth $40 billion. (Reuters)");
           break;
case 20:
           System.out.println("Russian Foreign Minister Sergey Lavrov says that his country's military goals are no longer limited to the Donbas region and have expanded to also include 'the Kherson region, the Zaporizhzhia region and a number of other territories'. (Al Jazeera)");
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
           System.out.println("Russia and Ukraine sign a UN-backed agreement to allow the export of millions of tonnes of grain from blockaded Black Sea ports. (The Guardian)");
           break;
case 23:
System.out.println("2022 bombing of Odesa Two Russian Kalibr cruise missiles hit Odesa's port less than a day after a deal to export grain from Ukraine was signed between Russia and Ukraine. Initial reports indicate no related infrastructure damage. (AP) A Russian cruise missile attack destroys a railway station in Kir");
System.out.println("ovohrad Oblast, killing three people and injuring several others. (France 24)"); 
           break;
case 24:
           System.out.println("Nothing significant to report");
           break;
case 25:
System.out.println("War crimes in the 2022 Russian invasion of Ukraine Head of the Investigative Committee of Russia, Alexander Bastrykin, says that Russia has charged 92 members of the Armed Forces of Ukraine with crimes against the peace and security of humanity, with a further 96 people being wanted. There are also ");
System.out.println("1,300 ongoing criminal investigations. (BBC News)"); 
           break;
case 26:
System.out.println("2022 Ukrainian summer counteroffensive Ukrainian forces strike the strategic Antonivka Road Bridge in Kherson Oblast using its M142 HIMARS missile system, causing severe damage to the bridge and preventing vehicles from crossing. Ukraine also claims to have destroyed a Russian ammunition depot, arti");
System.out.println("llery and other military equipment in the region, killing 51 Russian troops. (AP) Ukraine says that Russia has launched cruise missile strikes at targets along its Black Sea coast, including at Odesa and Mykolaiv port infrastructure. (Voice of America)"); 
           break;
case 27:
System.out.println("Russia captures the Vuhlehirska Power Station, Ukraine's second largest power plant, near the city of Svitlodarsk, Donetsk Oblast. (Reuters) Russia says that it has destroyed more than 100 M142 HIMARS missiles in an airstrike on Dnipro. (Reuters)"); 
           break;
case 28:
System.out.println("2022 Ukrainian summer counteroffensive Ukrainian presidential advisor Oleksiy Arestovych says that an operation to recapture the Kherson Oblast has started. (The Guardian) Battle of Donbas Russian forces shell Bakhmut in Donetsk Oblast with the BM-27 Uragan MLRS, killing three civilians and injuring");
System.out.println(" three others. Six apartment blocks and six detached houses are also destroyed or damaged. (Ukrinform) Belarusian involvement in the 2022 Russian invasion of Ukraine Russian forces in Belarus launch 25 ballistic missiles into northern Ukraine. (The Guardian) Russia launches cruise missile strikes fr");
System.out.println("om the Black Sea on the Kyiv Oblast for the first time in weeks, with missiles striking Bucha, Lyutizh, and Vyshhorod. At least fifteen people, including five civilians, are injured, according to Kyiv governor Oleksiy Kuleba. (AP) (Axios) Russian missiles strike Kropyvnytskyi, damaging facilities ow");
System.out.println("ned by Kropyvnytskyi Flight Academy and Air Urga. Five people are killed and 25 others are injured. (Yahoo! News)"); 
           break;
case 29:
System.out.println("Olenivka prison explosion Russia and the Donetsk People's Republic (DPR) say that 53 people were killed and 75 others injured after shelling hit a prison holding Ukrainian prisoners of war in the DPR-controlled city of Olenivka, Donetsk Oblast. Russia and Ukraine accuse each other of carrying out th");
System.out.println("e strike. (AP) War crimes in the 2022 Russian invasion of Ukraine A video emerges on social media of a Russian soldier castrating a Ukrainian prisoner of war in the town of Sievierodonetsk, Donetsk Oblast. The video has not been independently verified. The Ukrainian government voices outrage over th");
System.out.println("e incident and vows retaliation against the perpetrators. (BBC News) (The Telegraph) (The Guardian) (Sky News) A Russian strike kills five civilians and injures seven others at a bus stop in Mykolaiv, according to regional governor Vitaliy Kim. (AFP News via Barron's)"); 
           break;
case 30:
           System.out.println("Russia's Gazprom suspends gas supplies to Latvia after accusing it of violating conditions of purchase. The Latvian government says the suspension of gas from Russia is not expected to have a major impact on the economy. (BBC News)");
           break;
case 31:
System.out.println("Southern Ukraine offensive A Russian missile strike on Mykolaiv in Kherson Oblast, kills Nibulon owner Oleksiy Vadaturskyi and his wife. (BBC News) A drone strikes Russia's Black Sea Fleet headquarters, injuring five people, according to the mayor of Sevastopol. (The Guardian)"); 
           break;
           default:
            System.out.println("Select a day from 1 to 31:");
           

          //System.out.println("");
          }
          break;
case 8:
          System.out.println("1. Enter a day in August:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("The first ship with Ukrainian grain leaves the port of Odesa for Lebanon after an agreement was signed with Russia. (DW)");
           break;
case 2:
           System.out.println("Three people evacuating in a minibus are killed by Russian shelling near Kherson Oblast, according to Ukraine's Operational Command South. (The Guardian)");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
System.out.println("Battle of Donbas A Russian strike kills eight civilians and injures four others, at a bus stop in Toretsk, according to regional governor Pavlo Kyrylenko. (Ukrinform)"); 
           break;
case 5:
System.out.println("Southern Ukraine campaign Ukraine's nuclear agency Energoatom says that Russian rockets have caused damage to the Zaporizhzhia Nuclear Power Plant, including a nitrogen-oxygen unit and a high-voltage power line. (BBC News) Russian occupation of Kherson Oblast Volodymyr Saldo, the head of the Russian");
System.out.println(" occupational administration in Kherson Oblast, is hospitalized, with former FSB officer Sergei Eliseev taking over his post temporarily. (Newsweek)"); 
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that it will send Ukraine an additional $1 billion in military assistance, including tens of thousands more munitions and explosives, the largest such aid package to the country since the start of the invasion. (The Washing");
System.out.println("ton Post)"); 
           break;
case 8:
System.out.println("2022 Ukrainian summer counteroffensive Multiple explosions are reported at a Russian military air base near Novofedorivka in western Crimea. At least one person is killed and six others are injured, according to Crimean authorities. (Reuters) (Sky News)"); 
           break;
case 9:
System.out.println("Russian occupation of Zaporizhzhia Oblast Russian forces install air defence systems at the Zaporizhzhia Nuclear Power Plant in Zaporizhzhia Oblast, Ukraine, according to the head of Moscow-appointed administration of Zaporizhzhia Oblast Yevhen Balytskyi. (MSN) A Russian missile strike in Nikopol Ra");
System.out.println("ion, Dnipropetrovsk Oblast, kills at least 13 civilians and injures 11 others. (The New York Times)"); 
           break;
case 10:
System.out.println("Russian occupation of Zaporizhzhia Oblast At least ten shells hit the Zaporizhzhia Nuclear Power Plant with both Russia and Ukraine blaming each other for the attack, which damaged an office building and the plant's fire station. (BBC News)\n2022 Russian-occupied Ukraine annexation referendums The R");
System.out.println("ussian occupation of Zaporizhzhia Oblast begins preparations for a referendum on the region's accession to Russia, which will be held on September 11. (RBK) (TV Center)"); 
           break;
case 11:
           System.out.println("A Belize-flagged ship departs Chornomorsk for Turkey, becoming the first wheat export from Ukraine under a United Nations-brokered deal. (Swissinfo)");
           break;
case 12:
System.out.println("Russia says that it has captured the village of Pisky, in Donetsk Oblast, while Ukrainian forces say that they have destroyed a bridge in Russian-occupied Kherson Oblast. (AP) Russian occupation of Mykolaiv Oblast Establishment of pro-Russian Mykolaiv military–civilian administration with seat in Sn");
System.out.println("ihurivka is announced, Yuri Barbashov [pl] becomes its head. It probably began functioning some days earlier. (360tv.ru)"); 
           break;
case 13:
           System.out.println("Nothing significant to report");
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
           System.out.println("An explosion occurs at an ammunition depot in northern Crimea, forcing the evacuation of civilians. Observers suggest that the depot may have been hit by Ukrainian forces. (Radio Free Europe/Radio Liberty)");
           break;
case 17:
System.out.println("Northeastern Ukraine campaign Battle of Kharkiv A Russian missile hits a dormitory in Kharkiv, killing seven civilians and injuring 16 others, according to the city's mayor and top military administrator. (Ukrainska Pravda) (The Guardian) Southern Ukraine campaign Russia launches missile strikes on ");
System.out.println("Odesa and Mykolaiv in Southern Ukraine in response to sabotage bombings of military facilities in Crimea. (MSN)"); 
           break;
case 18:
System.out.println("Southern Ukraine campaign, 2022 Western Russia attacks Explosions are reported at military facilities in Crimea and Belgorod Oblast, Russia, and are believed to have been launched by Ukraine. An explosion and large fire occur at an arms depot near Timonovo. Explosions are also reported at Stary Osko");
System.out.println("l Airport and in Russian-occupied Nova Kakhovka, Kherson Oblast. (Forbes) Explosions are reported at Sevastopol International Airport. The Governor of Sevastopol Mikhail Razvozhayev says that Russian air defences have shot down a Ukrainian Air Force drone near the airport. (Reuters) Residents of Ker");
System.out.println("ch and nearby villages in eastern Crimea report multiple explosions. Crimean officials say that air defences were activated near the city but that there is no danger to the town or the Crimean Bridge. (Yahoo! News)"); 
           break;
case 19:
System.out.println("2022 Western Russia attacks Explosions are reported overnight at Russian military bases in Crimea and Belgorod Oblast, Russia. Two villages have been evacuated. (Reuters)"); 
           break;
case 20:
System.out.println("Southern Ukraine campaign, War crimes in the 2022 Russian invasion of Ukraine Nine civilians, including four children, are injured by Russian shelling on a residential building in Voznesensk, Mykolaiv Oblast, according to regional governor Vitaliy Kim. (The Washington Post) Russia says that a number");
System.out.println(" of its soldiers in Zaporizhzhia have been poisoned by Ukraine, with tests showing Botulinum toxin type B present in their bodies. (Reuters)"); 
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
           System.out.println("Nothing significant to report");
           break;
case 23:
System.out.println("Battle of Donbas Ukrainian forces reportedly shell the administration headquarters of the Donetsk People's Republic in separatist-held Donetsk, killing three people, according to pro-Russian officials. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War Slovakia announces that it will se");
System.out.println("nd an additional 30 BMP-1 infantry fighting vehicles and ammunition to Ukraine. (Reuters)"); 
           break;
case 24:
System.out.println("Russian occupation of Zaporizhzhia Oblast The Russian-appointed head of Mykhailivka in Zaporizhzhia Oblast, Ivan Sushko, is assassinated in a car bombing. (Euro Weekly News) Chaplyne railway station attack At least 25 people are killed and more than 50 others are injured in a Russian rocket attack o");
System.out.println("n a passenger train in Chaplyne, Dnipropetrovsk Oblast. (The Guardian) (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War The United States announces a security package of nearly $3 billion from the Ukraine Security Assistance Initiative. (CBS News)"); 
           break;
case 25:
System.out.println("Southern Ukraine campaign Ukraine says that the Zaporizhzhia Nuclear Power Plant has been completely disconnected from its power grid after shelling near the Russian-occupied plant caused several fires. Security systems at the plant were activated shortly after the power failure, according to a loca");
System.out.println("l official. (NBC News)"); 
           break;
case 26:
System.out.println("Southern Ukraine campaign Ukraine's state nuclear company, Energoatom, says that the Russian-occupied Zaporizhzhia Nuclear Power Plant has resumed supplying electricity to Ukraine's power grid after being disconnected yesterday from it for the first time in history. (Al Jazeera) (Reuters) A traffic ");
System.out.println("police deputy chief is killed by a bombing in the Russian-occupied city of Berdiansk, Zaporizhzhia Oblast. Russian authorities accuse the Ukrainian forces of the attack. (Reuters)"); 
           break;
case 27:
           System.out.println("Nothing significant to report");
           break;
case 28:
           System.out.println("Nothing significant to report");
           break;
case 29:
System.out.println("2022 Ukrainian southern counteroffensive Ukraine says it has begun a ground offensive in the Kherson Oblast. (Reuters) Russian-occupation officials say that the Ukrainian military launched a barrage of missiles at the town of Nova Kakhovka, leaving the town without water or power. (Reuters) Two peop");
System.out.println("le are killed and five others are injured after Russian forces shelled the city of Mykolaiv, according to regional governor Vitaliy Kim. (Reuters)"); 
           break;
case 30:
           System.out.println("Nothing significant to report");
           break;
case 31:
           System.out.println("European Union foreign ministers agree to suspend a visa facilitation agreement with Russia, making it more difficult and more expensive for Russian tourists to enter the EU. (Al Arabiya)");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
          
case 9:
          System.out.println("1. Enter a day in September:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian forces recapture the town of Vysokopillia in Kherson Oblast, which has been under Russian occupation since March, and raise the Ukrainian flag over the town's hospital. (Newsweek)"); 
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Amid a renewed counter-offensive in the region, Ukrainian forces reportedly break through Russian defenses and advance more than 30 kilometers into Russian held territory in the Kharkiv Oblast, capturing many towns and cities including Balakliia. (The Guardian");
System.out.println(")"); 
           break;
case 8:
           System.out.println("Poland and the Baltic states announce a ban on Russian tourists entering their countries beginning on September 19. (EER)");
           break;
case 9:
System.out.println("Northeastern Ukraine campaign Governor of Sumy Oblast Dmytro Zhyvytskyi says that Russian forces have shelled a hospital in Velyka Pysarivka, causing an unspecified number of casualties. (Radio Free Europe/Radio Liberty) 2022 Ukrainian Kharkiv counteroffensive Ukraine claims to have retaken more tha");
System.out.println("n 1,000 square kilometers of territory previously occupied by Russia, within the last week. (BBC News)"); 
           break;
case 10:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Ukrainian troops retake the cities of Balakliia, Kupiansk, and Izium from Russian occupation. The Russian Defence Ministry confirms the withdrawal of troops from several towns in Kharkiv Oblast in order to allow its forces to regroup and reinforce the Donbas. ");
System.out.println("(BBC News) (Mirror)"); 
           break;
case 11:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Russian forces withdraw from most of the Kharkiv Oblast as the Russian occupation of Kharkiv Oblast collapses. Ukrainian soldiers retake Chkalovske and Velykyi Burluk. Governor of Belgorod Oblast Vyacheslav Gladkov says that thousands of civilians are fleeing ");
System.out.println("across the border into the region. (Financial Post) (BBC News) Russia launches missile strikes with Kalibr cruise missiles on critical infrastructure objects, including Kharkiv TEC-5, causing a total blackout and water shutdown in Northeastern Ukraine and the Kharkiv and Donetsk Oblasts. Ukrainian o");
System.out.println("fficials confirm at least 40 electrical substations have been destroyed in the wave of missile strikes. (The New York Times) (Reuters) (Ukrinform)"); 
           break;
case 12:
System.out.println("2022 Ukrainian Kharkiv counteroffensive Ukrainian forces continue to recapture Russian-occupied territory in Kharkiv Oblast, saying that they have seized 20 more settlements in the last 24 hours, including Dvorichna, and also claim to have captured many Russian prisoners of war. (AP) Battle of Donba");
System.out.println("s The Ukrainian general staff reports that Russian troops abandoned the city of Svatove in Luhansk Oblast as Ukrainian forces advanced. (Reuters) 2022 Western Russia attacks Multiple explosions are reported near the city of Taganrog in Rostov Oblast, Russia. (Meduza) (HalkTV) More than 30 municipal ");
System.out.println("deputies of Russian cities sign a petition calling for Russian President Vladimir Putin's resignation amid substantial Ukrainian advances in the war. (The Hill)"); 
           break;
case 13:
System.out.println("2022 Ukrainian Kharkiv counteroffensive The Ukrainian military says that it has shot down an Iranian HESA Shahed 136 combat drone operated by Russia near Kupiansk, Kharkiv Oblast. An inscription on the drone identified it as an M214 Geran-2, which did not immediately correspond to known Russian weap");
System.out.println("onry. (ABC News)"); 
           break;
case 14:
System.out.println("Russian forces launch eight cruise missiles at the dam of the Karachunivske reservoir causing extensive flooding in Kryvyi Rih and a 2.5 metres (8 ft 2 in) increase of water level in the Inhulets River. (The Guardian) "); 
           break;
case 15:
System.out.println("2022 Ukrainian Kharkiv counteroffensive War crimes in the 2022 Russian invasion of Ukraine Izium mass graves Ukrainian police say that a mass grave containing more than 440 bodies has been discovered in the recently recaptured city of Izium. (Reuters)"); 
           break;
case 16:
           System.out.println("A civilian is killed and two others are injured by Ukrainian shelling on Valuyki, Belgorod Oblast, according to Governor Vyacheslav Gladkov. (UrduPoint) (MSN)");
           break;
case 17:
           System.out.println("Nothing significant to report");
           break;
case 18:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell a psychiatric hospital in Strelechya, Kharkiv Oblast, killing four medics and injuring two patients. (The Guardian)"); 
           break;
case 19:
System.out.println("Battle of Donbas Thirteen people are killed and many others are injured in explosions in the Donetsk People's Republic-held city of Donetsk. DPR leader Denis Pushilin accuses Ukraine of being behind the attacks. (BBC News) The Ukrainian Ground Forces recapture the village of Bilohorivka in Luhansk O");
System.out.println("blast as it advances on Lysychansk. (The Telegraph) Luhansk People's Republic authorities say that a Ukrainian shelling attack has killed seven civilians including three children in the town of Krasnorichenske. (Reuters)\nThe State Duma of Russia reports that a referendum on the accession of the Luh");
System.out.println("ansk People's Republic to Russia will be held in the near future. (TASS)"); 
           break;
case 20:
System.out.println("2022 Russian mobilization Russian State Duma deputies approve the introduction of the concepts of mobilization, martial law, wartime and armed conflict, as well as punishment for desertion, into the Criminal Code. (Forbes)\nIt is announced that the referendums on the entry of the Luhansk People's Re");
System.out.println("public, the Donetsk People's Republic, and the occupied parts of Kherson and Zaporizhzhia Oblasts into Russia as federal subjects will be held from September 23 to 27. (RIA Novosti)"); 
           break;
case 21:
System.out.println("2022 Russian mobilization: In a major address to the nation, Russian president Vladimir Putin announces a partial mobilization, with the exceptions of students and conscripts. (AP)\n Lithuania places its rapid reaction force on high alert in response to Russia's mobilization, according to Defence Mi");
System.out.println("nister Arvydas Anušauskas. (LRT)\n NATO Secretary General Jens Stoltenberg says that Russia's military mobilization is 'dangerous and reckless', and condemns Putin's use of 'nuclear rhetoric'. (NTV) (Reuters)\nAnti-mobilization and anti-war protests occur across Russia, with many arrests also occurr");
System.out.println("ing. (Reuters)"); 
           break;
case 22:
System.out.println("Large numbers of fighting-age men leave Russia after the announcement of the mobilization. Long traffic jams occur at international border crossings and the price of tickets for international flights sharply increases. (BBC News) At least 1,300 protesters rallying against the mobilization are arrest");
System.out.println("ed throughout Russia. (BBC News) Donetsk People's Republic authorities accuse Ukraine of shelling a market in Donetsk, killing six civilians. (Times of Israel) Ukraine and Russia release 55 Russian prisoners of war and 215 fighters from the Siege of Mariupol as part of a prisoner exchange mediated b");
System.out.println("y Turkey and Saudi Arabia. Among those released are pro-Russian Ukrainian politician Viktor Medvedchuk, Azov Regiment commander Denys Prokopenko, British volunteers Aiden Aslin and Shaun Pinner, and Moroccan volunteer Saadun Brahim. (Times of Israel), (BBC News)"); 
           break;
case 23:
           System.out.println("Referendums begin in the Russian-occupied Ukrainian oblasts of Kherson and Zaporizhzhia and the separatist republics of Donetsk and Luhansk on whether to join Russia, in what Ukraine and other countries consider to be sham referendums. (AFP via Barron's)");
           break;
case 24:
System.out.println("2022 Russian mobilization Thousands of fighting-age men continue to leave Russia due to the mobilization. Massive lines are reported at the country's borders with Georgia and Finland. (iNews) 2022 anti-war protests in Russia At least 700 people are detained during anti-war protests across Russia. (I");
System.out.println("TV News)"); 
           break;
case 25:
System.out.println("2022 anti-war protests in Russia, 2022 North Caucasian protests Mass protests against mobilization take place in Dagestan with protesters clashing with police. (Reuters), (Radio Liberty) The number of people detained in anti-war protests across Russia increases to more than 2,000. (BBC News) Ukraini");
System.out.println("an president Volodymyr Zelenskyy confirms that Ukraine has received NASAMS air defence systems from the United States. (Reuters)"); 
           break;
case 26:
System.out.println("2022 Russian mobilization 2022 anti-war protests in Russia, 2022 North Caucasian protests Spontaneous protests against the mobilization continue in Dagestan and Kabardino-Balkaria. (Radio Liberty) "); 
           break;
case 27:
System.out.println("Kazakhstan says that around 98,000 Russian civilians have entered the country by land and air since Russian president Vladimir Putin ordered a military mobilization. (HuffPost) Latvia announces a state of emergency over the influx of Russian citizens fleeing mobilization. Special measures are taken ");
System.out.println("in the border regions of the country and at all ports of entry. (ERR)"); 
           break;
case 28:
System.out.println("North Ossetia–Alania which contains the only border crossing between Russia and Georgia-controlled territory, bans all Russian cars that do not have the licence plate of the republic, with the exception of tourists travelling to the region. This comes as those fleeing the draft overwhelm the border.");
System.out.println(" (Reuters) A mobile draft centre is built at the Torfyanovka checkpoint, the busiest checkpoint on the Finland–Russia border, in order to prevent people who are fit to serve from fleeing the country. However, as of midday, the centre is not yet open. (The Insider) "); 
           break;
case 29:
System.out.println("War crimes in the 2022 Russian invasion of Ukraine Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces strike a residential neighborhood in Dnipro with a cruise missile, killing a family of four, including two children, and injuring 18 other civilians, according to local auth");
System.out.println("orities. (Ukrinform) (Ukrainska Pravda) Three people are killed and 12 others are injured by a Russian cluster munition attack on a bus stop in Mykolaiv, according to mayor Oleksandr Sienkievych. (Ukrainska Pravda) Russian emigration following the 2022 invasion of Ukraine Finland announces that it w");
System.out.println("ill deny entry to Russian tourists beginning on Thursday night, thereby cutting off the last direct link between Russia and the European Union. (Reuters)\nPress Secretary of the President of Russia Dmitry Peskov says that the Kremlin is scheduled to sign agreements on the annexation of the occupied ");
System.out.println("territories of Ukraine by Russia on September 30. (Forbes) President of Ukraine Volodymyr Zelenskyy announces that he will convene an urgent meeting of the National Security and Defense Council of Ukraine on September 30. (Ukrainska Pravda) Russian President Vladimir Putin signs a decree recognizing");
System.out.println(" the independence of Kherson and Zaporizhzhia Oblasts, which were proclaimed yesterday. (The Guardian) (RIA Novosti)"); 
           break;
case 30:
System.out.println("Russian attack on civilian convoy in Zaporizhzhia Russian forces launch 16 missiles at areas near the city of Zaporizhzhia, including a gathering point for civilians preparing to cross into Russian-occupied territory, where at least 25 people are killed and 50 others are injured. (NBC News) Ukraine–");
System.out.println("NATO relations Ukrainian President Volodymyr Zelenskyy requests fast-track NATO membership following the Russian annexation of Southern and Eastern Ukraine. (BBC News) 2022 Russian mobilization Uzbekistan says that it will not deport Russians fleeing conscription. (Reuters)\nRussian president Vladim");
System.out.println("ir Putin signs accession treaties to annex the occupied Ukrainian territories to Russia. However, the accession treaties must be ratified by both houses of the Russian parliament before becoming effective under Russian law. (Reuters) (Reuters 2)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
           }
           break;
case 10:
          System.out.println("1. Enter a day in October:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Battle of Donbas Second Battle of Lyman Ukrainian troops recapture Lyman after weeks of fighting for the city and one day after the annexation of the Donetsk People's Republic to Russia. (The Guardian) The Ministry of Defence of Russia says that it has withdrawn troops from the town of Lyman due to ");
System.out.println("a threat of encirclement. (BBC News) After the defeat in Lyman, the head of Chechnya, Ramzan Kadyrov, calls on the Russian government to introduce martial law and use low-yield nuclear weapons in Ukraine. (Moskovskij Komsomolets) (CNN) (Reuters) (Al Jazeera) War crimes in the 2022 Russian invasion o");
System.out.println("f Ukraine Attacks on civilians in the 2022 Russian invasion of Ukraine A civilian convoy of seven cars attacked by Russian forces is discovered in Kupiansk Raion in Kharkiv Oblast with 24 people being killed, including a pregnant woman and 13 children, according to local governor Oleh Synyehubov. (U");
System.out.println("krainska Pravda)"); 
           break;
case 2:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian troops recapture Khreshchenivka as they continue to advance southwards in the Russian-occupied Kherson Oblast, with Russia's 49th Combined Arms Army reportedly withdrawing some troops from the frontline to Beryslav. (Forbes)"); 
           break;
case 3:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian forces advance more than 20 kilometres (12 mi) along the Dnieper towards Dudchany, Kherson Oblast, in what is being called a major breakthrough. (Reuters) The Russian Defence Ministry dismisses Colonel General Alexander Zhuravlyov in response to a s");
System.out.println("eries of military defeats in Ukraine. He is replaced as commander of the Western Military District by Major General Roman Berdnikov. (Reuters) "); 
           break;
case 4:
System.out.println("Annexation of Southern and Eastern Ukraine The Federation Council of Russia unanimously approves the annexation of Ukraine's Donetsk, Luhansk, Kherson, and Zaporizhzhia regions. The annexation documents will now receive final signing by President Vladimir Putin. (Reuters) 2022 Ukrainian southern cou");
System.out.println("nteroffensive Ukraine's 35th Marine Brigade recaptures the village of Davydiv Brid in Beryslav Raion, Kherson Oblast, as it continues its ground offensive. The Ukrainian Interior Ministry says that around 3,500 citizens have been freed from Russian occupation in recent days. (BBC News)"); 
           break;
case 5:
System.out.println("2022 Ukrainian southern counteroffensive Ukrainian troops recapture the strategic village of Dudchany on the west bank of the Dnieper following the withdrawal of Russian forces. (Al Jazeera) Annexation of Southern and Eastern Ukraine Russian President Vladimir Putin signs a law formally annexing the");
System.out.println(" Donetsk People's Republic, Luhansk People's Republic, Kherson, and Zaporizhzhia into Russia. (Reuters)"); 
           break;
case 6:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell residential buildings in Zaporizhzhia, killing at least three people, injuring twelve others, and causing widespread fires. (Reuters)"); 
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
System.out.println("Crimean Bridge explosion The Kerch Strait Bridge is hit by an explosion, resulting in a fire and the partial collapse of a road section. Three people are killed. The cause is currently unknown, with a Russian investigative committee saying it was a Ukrainian truck bomb. (The Guardian) The death toll");
System.out.println(" from last Thursday's shelling by Russian forces of a residential area in Zaporizhzhia rises to 17 civilians, including a child. (The Times of Israel)"); 
           break;
case 9:
System.out.println("Zaporizhzhia residential building airstrike A Russian missile attack kills at least 13 people and injures 89 others in Zaporizhzhia, Ukraine. (Reuters) Crimean Bridge explosion Russian president Vladimir Putin formally accuses Ukraine, and specifically the Security Service of Ukraine, of being behin");
System.out.println("d the explosion on the Crimean Bridge that killed three people and partially destroyed part of the bridge, saying that the explosion was an act of terrorism. (BBC News)"); 
           break;
case 10:
System.out.println("10 October 2022 missile strikes on Ukraine The Russian Armed Forces launch missile strikes on the Ukrainian cities and towns of Kyiv, Kharkiv, Khmelnytskyi, Zhytomyr, Zaporizhzhia, Ivano-Frankivsk, Sumy, Dnipro, Lviv, Ternopil and Poltava, killing at least nineteen people and injuring hundreds more.");
System.out.println(" (Unian) (UkrInform) (Interfax) (The Guardian) (Financial Times) (Kyiv Post) Moldova–Russia relations Moldova confirms that Russian Navy warships in the Black Sea fired cruise missiles through its airspace to strike targets inside Ukraine. The Russian ambassador is subsequently summoned by Moldovan ");
System.out.println("authorities to explain the violation. (Reuters)"); 
           break;
case 11:
System.out.println("Thousands of Russian troops enter Belarus by the trainload as Ukrainian President Volodymyr Zelenskyy warns G7 nations that Russia is planning on launching another offensive against Kyiv with direct Belarusian involvement. The troop movements come a day after Belarusian President Alexander Lukashenk");
System.out.println("o accused Ukraine of planning to launch an attack on the country. (The Independent) Lviv experiences a major power outage after a Russian missile strike damages critical infrastructure. (Reuters) Russia adds Meta Platforms, the parent company of Instagram and Facebook, to its list of terrorists and ");
System.out.println("extremists for tolerating Russophobia and allowing calls to violence against Russians. (Al Jazeera)"); 
           break;
case 12:
System.out.println("Crimean Bridge explosion Russia says that it has arrested eight people, five Russians and three people from Ukraine and Armenia, over the Crimea Bridge explosion. (Reuters via Al Arabiya) Battle of Donbas Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces strike a marketplac");
System.out.println("e in Avdiivka, Donetsk Oblast, killing at least seven civilians and injuring eight others. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War French President Emmanuel Macron announces that France will send radar and air defense systems to Ukraine in the coming weeks. (Reuters) The Unit");
System.out.println("ed Kingdom's Ministry of Defence announces that it will donate AMRAAM air-to-air missiles to Ukraine in the coming weeks. The missiles are capable of intercepting cruise missiles. A further 18 howitzers will also be donated to the Ukrainian military. (Reuters) Canada says that it will provide C$47 m");
System.out.println("illion in new military aid to Ukraine including artillery rounds, winter clothing, drone cameras, and satellite communications. (Reuters) Annexation of southeastern Ukraine by the Russian Federation United Nations General Assembly Resolution ES-11/4 The United Nations General Assembly passes a resol");
System.out.println("ution condemning Russia's attempted illegal annexation of Ukrainian territory. Only Belarus, Nicaragua, North Korea, Russia and Syria voted against the resolution. (Al Jazeera) Moldova urges its citizens to reduce their use of electricity after Ukraine suspended exports of electricity due to Russian");
System.out.println(" missile attacks damaging critical infrastructure. (Reuters)"); 
           break;
case 13:
System.out.println("2022 Ukrainian southern counteroffensive Russia announces that it will evacuate civilians from Kherson to other regions of the country following an appeal from Kherson Military-Civilian Administration leader Volodymyr Saldo. (The Guardian) Attacks on civilians in the 2022 Russian invasion of Ukraine");
System.out.println(" Russian forces launch eight missiles at Mykolaiv, hitting a five-story residential building. One of the victims was an 11-year-old boy, who was rescued with broken legs after spending hours under the rubble, but later died in a hospital due to heart failure. (The New York Times) (NBC News)"); 
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
System.out.println("Soloti military training ground shooting At least 11 people are killed and 15 others injured after two shooters open fire on a group of volunteers at a Russian military training ground in Belgorod Oblast, near the border with Ukraine. (Reuters)"); 
           break;
case 16:
System.out.println("Battle of Donbas Donetsk People's Republic authorities say that a Ukrainian rocket attack hit the office of the pro-Russian mayor of Donetsk. No casualties have been reported. (AP)"); 
           break;
case 17:
System.out.println("Russian forces attack the Shevchenkivskyi District, Kyiv, and an energy facility in the city of Sumy with HESA Shahed 136 suicide drones, killing eight people. (BBC News) (CNBC) The European Union establishes EUMAM Ukraine, a special military mission that will provide training for the Ukrainian Arme");
System.out.println("d Forces in EU member states. (Council of the EU/the European Council)"); 
           break;
case 18:
System.out.println("Crisis at the Zaporizhzhia Nuclear Power Plant Ukraine accuses Russia of kidnapping two senior employees of the Zaporizhzhia Nuclear Power Plant. (Agence France Presse via Barron's) Three people are killed and critical infrastructure is destroyed by Russian missiles in Kyiv, causing fires, explosion");
System.out.println("s, and power outages. Several other cities across Ukraine are also hit in targeted attacks against water supplies and energy facilities, with power outages being reported in 1,162 towns and villages. (Reuters) (BBC News) Iran agrees to provide Russia with medium-range missiles, surface-to-surface mi");
System.out.println("ssiles and combat drones for the war in Ukraine. (The Guardian)"); 
           break;
case 19:
System.out.println("2022 Ukrainian southern counteroffensive Russian forces begin evacuating thousands of civilians from occupied areas of Kherson Oblast, according to Russian-installed governor Volodymyr Saldo. Ukraine calls on residents to ignore the Russian orders to leave their towns and villages. (BBC News) 2022 R");
System.out.println("ussian martial law Russian President Vladimir Putin introduces martial law, beginning Thursday at midnight, in the recently annexed territories of Ukraine. Additionally, an intermediate level of preparednessis introduced in Crimea and the federal subjects bordering Ukraine. (AP) (The Insider)"); 
           break;
case 20:
System.out.println("A Russian missile strikes a major thermal power station in Burshtyn, Ivano-Frankivsk Oblast, Ukraine, causing quite serious damage, according to governor Svitlana Onyshchuk. (Reuters) The United States reports that Iranian troops are in Crimea, assisting the Russian military in using Iranian drones.");
System.out.println(" (The Hill)"); 
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
           System.out.println("Power outages are reported across Ukraine and citizens are advised to store water as Russian airstrikes across the country continue to damage critical infrastructure and energy facilities. (Reuters)");
           break;
case 23:
           System.out.println("A Sukhoi Su-30 crashes into a residential building in Irkutsk, Irkutsk Oblast, Russia. Both pilots are killed. No casualties on the ground are reported, but the crash causes a power outage that affects more than 150 houses. (Reuters) (Meduza)");
           break;
case 24:
           System.out.println("Nothing significant to report");
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine A Russian missile strike on Dnipro kills two people, including a pregnant woman. (The Guardian)\n2022 boycott of Russia and Belarus Mercedes-Benz withdraws from Russia due to the 2022 Russian invasion of Ukraine and plans to sell shares in");
System.out.println(" its subsidiaries to a local investor. (BBC News) International relations  Poland–Russia relations The Polish Senate approves a resolution formally recognizing the Russian government under Vladimir Putin as a terrorist regime. (Ukrinform)"); 
           break;
case 27:
           System.out.println("Russian forces strike Kyiv's energy system facilities and launch BM-30 Smerch missiles on Zaporizhzhia as Ukraine repels attacks in the Donbas. (RFE/RL)");
           break;
case 28:
System.out.println("US Secretary of State Antony Blinken announces that the United States will provide another $275 million in additional military aid to Ukraine. (Reuters) 2022 Russian mobilization Russian Defence Minister Sergei Shoigu announces the end of the mobilization campaign as 300,000 reservists are reached. ");
System.out.println("(ABC News Australia)"); 
           break;
case 29:
           System.out.println("Russia accuses Ukraine of a drone attack on its Black Sea Fleet headquarters in Sevastopol, Crimea. The Russian-installed Governor of Sevastopol Mikhail Razvozhayev says the Russian Navy repelled the attack, which he calls the most massive since the invasion began. Russia consequently suspends its p");
System.out.println("articipation in the Black Sea Grain Initiative. (NPR) (BBC News)");
           break;
case 30:
           System.out.println("Nothing significant to report");
           break;
case 31:
System.out.println("Russian forces damage critical infrastructure in Kyiv again, leaving parts of the capital without energy and water. Other energy facilities are damaged in Zaporizhzhia, Kherson, and Cherkasy. (The Guardian) A Russian cruise missile reportedly shot down by a Ukrainian anti-aircraft system crashes in ");
System.out.println("the outskirts of Naslavcea, Moldova. No casualties are reported, though some houses were damaged by the blast, according to the Moldovan government. (Romania Journal) Norwegian Prime Minister Jonas Gahr Støre announces that the country's military alert level will be increased tomorrow, in response t");
System.out.println("o military drone sightings near offshore oil rigs in the past few weeks. (Euronews)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 11:
          System.out.println("1. Enter a day in November:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
           System.out.println("The United States says that North Korea is secretly supplying artillery shells to Russia for use in Russia's war in Ukraine. (Axios)");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
           System.out.println("The Voice of America reports that the Republic of Georgia is receiving an economic boost from the war in Ukraine. It is 'expected to record a vigorous 10% growth in economic output for 2022 amid a consumption-led boom,' due largely to the arrival of refugees from Russia, seeking to avoid conscriptio");
System.out.println("n or Putin's crackdown on dissent. (VOA News)");
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War Ukraine confirms that it has received the first delivery of the NASAMS surface-to-air missile system, which will significantly strengthen its armed forces, according to Defence Minister Oleksii Reznikov. (Reuters)"); 
           break;
case 8:
System.out.println("Foreign aid to Ukraine during the Russo-Ukrainian War Ukraine confirms that it has received the first delivery of the NASAMS surface-to-air missile system, which will significantly strengthen its armed forces, according to Defence Minister Oleksii Reznikov. (Reuters)"); 
           break;
case 9:
System.out.println("2022 Ukrainian southern counteroffensive Russian forces announce a retreat from the city of Kherson, the western bank of the Dnieper River in Mykolaiv Oblast, and the western part of Kherson Oblast. (BBC News) Russian officials say that deputy head of the Kherson military–civilian administration Kir");
System.out.println("ill Stremousov has been killed in a car crash while travelling to Crimea. Russian President Vladimir Putin issues a decree posthumously awarding Stremousov the Order of Courage. (BBC News)   "); 
           break;
case 10:
System.out.println("2022 Ukrainian southern counteroffensive The Ukrainian military says that it recaptured the city of Snihurivka in Mykolaiv Oblast, the last remaining city controlled by Russia in the oblast. (Voice of America) Ukrainian troops recapture the village of Kyselivka, advancing within nine miles of the ci");
System.out.println("ty centre of Kherson. Explosions are reported near the Kakhovka Hydroelectric Power Plant. (The Guardian) Foreign aid to Ukraine during the Russo-Ukrainian War The Pentagon announces that it will send four AN/TWQ-1 Avenger surface-to-air missile systems, Stinger missiles, 400 grenade launchers, 100 ");
System.out.println("humvees, and other artillery rounds and small arms ammunition to Ukraine as part of its latest $400 million weapons package to support the Ukrainian military. (The Hill)"); 
           break;
case 11:
System.out.println("Ukrainian troops enter the city of Kherson, the only Ukrainian regional capital captured by Russia during the invasion, ending the city's eight-month occupation by Russian forces. (CNN) Russian forces destroy the Antonivka Road Bridge as they retreat from the west of the Dnieper. (The New York Times");
System.out.println(") United States and the 2022 Russian invasion of Ukraine The Russian Foreign Ministry bans 200 U.S. citizens from entering Russia, including White House Press Secretary Karine Jean-Pierre and three siblings of President Joe Biden. (Reuters) Business and economy  2022 food crises, Economic impact of ");
System.out.println("the 2022 Russian invasion of Ukraine The Food and Agriculture Organization forecasts that by the year's end, global spending on food imports will have increased by 10 percent from the previous year to reach an all-time high of US$1.94 trillion, due to currency depreciations and the war in Ukraine. T");
System.out.println("he bulk of this increase in spending will be by high-income countries while food import volumes are also expected to rise. (AFP via The Economic Times)"); 
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
           System.out.println("Nothing significant to report");
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
System.out.println("2022 missile explosion in Poland A missile strike kills two people in the village of Przewodów in eastern Poland. President of the United States Joe Biden says that the missile blast in Poland was caused by a Ukrainian air defense missile. U.S. officials had earlier told the Associated Press that pr");
System.out.println("eliminary findings suggested that the missile that hit Poland was fired by Ukrainian forces at an incoming Russian missile. (Reuters) (Reuters 2) The Polish Ministry of Foreign Affairs says that it was a Russian-made missile and summons the Russian ambassador to provide an explanation. (Reuters) (AP");
System.out.println(") November 2022 nationwide missile strikes on Ukraine Russian missiles strike several cities across Ukraine, including Kyiv, causing critical damage to energy facilities. (The Guardian)"); 
           break;
case 16:
System.out.println("Economic impact of the 2022 Russian invasion of Ukraine The economy of Russia enters a recession, after gross domestic product decreased by four percent in the third quarter. (AFP via Al Arabiya)"); 
           break;
case 17:
System.out.println("2022 missile explosion in Poland Germany offers to deploy its Air Force jets to protect Polish airspace in response to Tuesday's missile explosion in Przewodów, Lublin Voivodeship, that killed two people. (A News) October–November 2022 nationwide missile strikes on Ukraine Russia carries out another");
System.out.println(" wave of cruise missile strikes on Ukraine, with strikes reported in Dnipro, Odesa, Kharkiv, and Zaporizhzhia, where two people were confirmed to have been killed overnight by a missile. In Dnipro and Odesa, critical infrastructure is also targeted. (The Guardian)"); 
           break;
case 18:
System.out.println("October–November 2022 nationwide missile strikes on Ukraine Ukrainian President Volodymyr Zelenskyy says that Russian missile strikes have left at least 10 million Ukrainians without electricity as the death toll from yesterday's missile strikes increases to seven with many more people injured. (BBC");
System.out.println(" News)"); 
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The Russian-controlled Zaporizhzhia Nuclear Power Plant in Enerhodar is shelled, with damage occurring to some buildings, systems, and equipment, according to the International Atomic Energy Agency. (Reuters)"); 
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
System.out.println("2022 missile explosion in Poland Germany says that it will deploy Patriot surface-to-air missile systems on the Poland–Ukraine border in order to protect Polish airspace. Polish Defense Minister Mariusz Błaszczak says that he has accepted the German proposal. (International Business Times) "); 
           break;
case 23:
System.out.println("October–November 2022 nationwide missile strikes on Ukraine Widespread blackouts are reported in Western Ukraine as Russian forces launch another wave of cruise missile strikes, including in the city of Lviv, which is currently experiencing a power outage. Moldova also reports massive power outages,");
System.out.println(" although the country has not been directly hit by missiles. (BBC News) At least six people, all civilians, are killed in the latest missile strikes, including three in an apartment block in Vyshhorod, Kyiv Oblast, where 15 other people were injured. Kyiv Mayor Vitali Klitschko says that 21 of the 3");
System.out.println("1 missiles targeting Kyiv were intercepted before they reached their targets. (The Guardian) Foreign aid to Ukraine during the Russo-Ukrainian War British Defence Secretary Ben Wallace announces that the United Kingdom will send three Sea King helicopters to the Ukrainian Air Force as part of a new ");
System.out.println("£50 million support package to Ukraine. (The Telegraph)"); 
           break;
case 24:
System.out.println("Southern Ukraine campaign At least 15 people are killed and 35 others are injured when Russian Armed Forces bombard Kherson. (AFP via NDTV)"); 
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
           System.out.println("Nothing significant to report");
           break;
case 28:
           System.out.println("Nothing significant to report");
           break;
case 29:
           System.out.println("Nothing significant to report");
           break;
case 30:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 12:
          System.out.println("1. Enter a day in December:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
System.out.println("2022 Russian oil price cap Australia, the European Union, and the G7 member states decide to impose a US$60-per-barrel price ceiling on Russian seaborne oil. (AP)\nRussia–Ukraine relations Ukrainian President Volodymyr Zelenskyy signs a decree that bans religious organizations with links to Russia a");
System.out.println("nd imposes personal sanctions against their representatives. Zelenskyy also announces that the Ukrainian government will draft a law banning churches affiliated with Russia, which he says is necessary in order to counter Russian government efforts to weaken Ukraine from within. (AP) (Reuters)"); 
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("2022 Russian strikes against Ukrainian infrastructure Russian forces launch another wave of cruise missile strikes on Ukraine, destroying homes and killing two people in Zaporizhzhia Oblast, while causing power outages in many other areas after damaging critical infrastructure. (Reuters) 2022 Wester");
System.out.println("n Russia attacks Russia says that a long-range drone attack on its Dyagilevo Air Base and Engels-2 Air Base has killed three servicemen, injured four others, and damaged two aircraft. (Reuters)"); 
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell Kurakhove, Donetsk Oblast, killing ten civilians and injuring five others. (The Kyiv Independent) (The New Voice of Ukraine via Yahoo! News)"); 
           break;
case 8:
           System.out.println("Russian forces shell the front line in the Donetsk region, killing one civilian and damaging buildings in Toretsk. (Reuters)");
           break;
case 9:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis Ukraine's Energoatom says that Russian soldiers have abducted two senior staff members from the Zaporizhzhia Nuclear Power Plant. Energoatom says that the two workers were beaten before being driven off in an unknown direction. (Reuters) Battle of Bakhmut Ukra");
System.out.println("inian President Volodymyr Zelenskyy accuses Russia of destroying the front line city of Bakhmut after weeks of relentless shelling by Russian forces. (Newsweek)"); 
           break;
case 10:
           System.out.println("More than 1.5 million people are left without electricity in Odesa Oblast as a result of Russian drone strikes on two power facilities. (Reuters)");
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
           System.out.println("Nothing significant to report");
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
System.out.println("Southern Ukraine campaign Shelling by Russian forces kills two people and leaves the entire city of Kherson without power. (BBC News)"); 
           break;
case 16:
System.out.println("2022 Russian strikes against Ukrainian infrastructure Russian forces launch a barrage of at least 76 missiles across Ukraine, damaging at least nine power stations and killing at least three civilians, with many more civilians being injured. (BBC News)"); 
           break;
case 17:
           System.out.println("Nothing significant to report");
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
           System.out.println("Nothing significant to report");
           break;
case 21:
           System.out.println("Two people are killed and five others are injured during the shelling of a hotel and a restaurant in Donetsk. Former Russian Deputy Prime Minister and head of Roscosmos Dmitry Rogozin and Prime Minister of the Donetsk People's Republic Vitaliy Khotsenko are among the injured. (BBC News)");
           break;
case 22:
           System.out.println("The Russian-installed head of Liubymivka, Kakhovka Raion, Andrei Shlepa, is assassinated in a car bombing in the Russian-occupied part of the Kherson region. Russia accuses Ukraine of being behind the attack. (Reuters via The Straits Times)");
           break;
case 23:
           System.out.println("Nothing significant to report");
           break;
case 24:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine Russian forces shell the city of Kherson, killing at least ten civilians and injuring 58 others. (Daily Express)"); 
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
System.out.println("2022 Western Russia attacks Three Russian military members are killed by debris after Russia shoots down a drone that was approaching the Engels air base in Saratov Oblast, Russia. (AFP via Times of Israel)"); 
           break;
case 27:
System.out.println("Battle of the Svatove-Kreminna line Ukrainian forces claim that they are closing in on the city of Kreminna in Luhansk Oblast. According to governor Serhiy Haidai, Russian fighters in some parts of the city were forced to retreat to neighboring Rubizhne. (The Guardian)"); 
           break;
case 28:
           System.out.println("Nothing significant to report");
           break;
case 29:
           System.out.println("Russia carries out a series of drone and cruise missile strikes on Ukraine, with strikes reported in the cities of Kyiv, Kharkiv, Odesa, Lviv, and Zhytomyr, injuring at least three people. (BBC News)");
           break;
case 30:
           System.out.println("Nothing significant to report");
           break;
case 31:
System.out.println("Makiivka military quarters shelling Hundreds of Russian mobilized soldiers are claimed by Ukraine to be killed and injured as a result of an Ukrainian missile attack on a vocational school building serving as military barracks. Russian authorities acknowledge several casualties, but suggest lower fi");
System.out.println("gures. (Reuters) (BBC News)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;


       }
       break;
case 2023:
       
       //month in 2023
       System.out.println("1. Enter a month in 2023(1-January,2-February,....,12-December):");
       month=s.nextInt();
       switch(month){
          //day in 2023
case 1:
          System.out.println("1. Enter a day in January 2023 :");
          day=s.nextInt();
            switch(day){
case 1:
              System.out.println("Nothing significant to report");
              break;
case 2:
              System.out.println("Nothing significant to report");
              break;
case 3:
System.out.println("Makiivka military quarters shelling The Russian defense ministry increases the death toll of soldiers from a December 31 Ukrainian missile attack in Makiivka, Donetsk Oblast, to 89. The ministry attributes the casualties to the soldiers' use of mobile phones with tracking systems. (AFP via ABS-CBN N");
System.out.println("ews)"); 
              break;
case 4:
              System.out.println("Nothing significant to report");
              break;
case 5:
System.out.println("2023 Russian Christmas truce proposal Following the suggestion of Patriarch Kirill of Moscow, Russian President Vladimir Putin announces a unilateral ceasefire on January 6–7 in connection with Orthodox Christmas. However, Ukraine rejects an offer to respond with a mutual ceasefire, citing lack of t");
System.out.println("rust. (Reuters) Foreign aid to Ukraine during the Russo-Ukrainian War The United States and Germany agree to send Bradley Fighting Vehicles and Marder infantry fighting vehicles to Ukraine. Germany will also supply the Ukrainian military with a MIM-104 Patriot surface-to-air missile system. (The Gua");
System.out.println("rdian) (AFP via The Times of Israel)"); 
              break;
case 6:
System.out.println("Battle of Donbas, 2023 Russian Christmas truce proposal Russian forces shell the front line city of Kramatorsk, damaging at least fourteen homes, according to the city's mayor, with no reports of casualties. Meanwhile, Donetsk People's Republic officials accuse Ukraine of shelling Donetsk with artil");
System.out.println("lery. (Reuters via The Straits Times) (BBC News) Southern Ukraine campaign A Russian missile strike near a fire station in Kherson, kills one person and injures four others, according to regional official Yaroslav Yanushevych. (Ukrinform)"); 
              break;
case 7:
              System.out.println("Nothing significant to report");
              break;
case 8:
              System.out.println("Nothing significant to report");
              break;
case 9:
              System.out.println("Nothing significant to report");
              break;
case 10:
System.out.println("Battle of Soledar The UK Defence Ministry says that Russian forces are in control of most of Soledar in Donetsk Oblast. Wagner Group leader Yevgeny Prigozhin, however, claims the city had been taken in its entirety. (The Guardian)"); 
              break;
case 11:
System.out.println("Order of battle for the 2022 Russian invasion of Ukraine Chief of the General Staff of the Russian Armed Forces Valery Gerasimov is appointed commander of the Joint Group of Forces participating in the war with Ukraine. Generals Oleg Salyukov, Alexei Kim, and Sergei Surovikin, who previously held th");
System.out.println("is position, become his deputies. (Fontanka.ru) "); 
              break;
case 12:
              System.out.println("Nothing significant to report");
              break;
case 13:
System.out.println("Battle of Soledar Russia's defence ministry says that its forces have taken full control of Soledar in Donetsk Oblast. However, Ukraine denies the fall of the city and its salt mines, claiming that the battle was still ongoing. (BBC News)"); 
              break;
case 14:
System.out.println("2023 Dnipro residential building airstrike Russia strikes a nine-story residential building in Dnipro with a cruise missile, killing at least 40 people, injuring 73 others and leaving dozens more missing. (Reuters) (Al Jazeera) Foreign aid to Ukraine during the Russo-Ukrainian War UK Prime Minister ");
System.out.println("Rishi Sunak confirms that the United Kingdom will send 14 Challenger 2 main battle tanks to Ukraine in the coming weeks, as well as 30 self-propelled AS-90 howitzers. Ukrainian troops will also be trained by the British Armed Forces to operate the tanks. (Reuters)"); 
              break;
case 15:
              System.out.println("Nothing significant to report");
              break;
case 16:
System.out.println("Battle of Soledar Ukraine announces defeat at Soledar after days of intense fighting. (MSN)"); 
              break;
case 17:
              System.out.println("Commander-in-Chief of the Armed Forces of Ukraine Valerii Zaluzhnyi and Chairman of the Joint Chiefs of Staff of the United States Mark Milley meet for the first time in person. (AFP)");
              break;
case 18:
System.out.println("2022 Russian invasion of Ukraine During a visit to Kyiv, Canadian National Defence Minister Anita Anand announces that Canada will send 200 Roshel Senator armoured personnel carriers to Ukraine. (CBC News)"); 
              break;
case 19:
System.out.println("Swedish Defence Minister Pål Jonson announces that Sweden will send its self-propelled Archer Artillery System, 50 Combat Vehicle 90 IFVs, and NLAW anti-tank missiles to Ukraine as part of its latest military support package for the Ukrainian military. (Politico) "); 
              break;
case 20:
System.out.println("Battle of Bakhmut Russia claims that it captured the village of Klishchiivka in Donetsk Oblast, south of Bakhmut, and the village of Lobkove in Zaporizhzhia Oblast. (Al Jazeera)"); 
              break;
case 21:
              System.out.println("The Russian military says that it has launched offensive operations in Zaporizhzhia Oblast and taken more advantageous lines and positions. (France 24)");
              break;
case 22:
              System.out.println("German Foreign Affairs Minister Annalena Baerbock says that Germany will not prevent Poland from sending Leopard 2 main battle tanks to Ukraine which Ukrainian officials say are pivotal to defeating Russian forces. (Reuters)");
              break;
case 23:
System.out.println("Turkish President Recep Tayyip Erdoğan rules out Turkish support for Sweden's bid for NATO membership following the burning of a Quran outside the Turkish embassy in Stockholm by Rasmus Paludan and a series of pro-Kurdish demonstrations where protestors waved PKK flags. (AP) Estonia–Russia relations");
System.out.println(" Estonia announces the expulsion of the Russian ambassador in Tallinn Vladimir Lipayev to reciprocate Russia's expulsion of the Estonian ambassador in Moscow Margus Laidre due to a downgrade of relations. Both envoys will depart their respective assignments on February 7. (AP) Latvia–Russia relation");
System.out.println("s Latvia asks Russian ambassador Mikhail Vanin to leave the country by February 24 in full solidarity with Estonia. (Politico)"); 
              break;
case 24:
System.out.println("Battle of Soledar Two British aid workers are killed during a humanitarian evacuation from Soledar in Donetsk Oblast, Ukraine. (BBC News) Germany–Ukraine relations German Chancellor Olaf Scholz announces that Germany will send Leopard 2 main battle tanks to Ukraine, and will also allow other operato");
System.out.println("rs of the tanks, such as Poland, to send them to Ukraine. (Reuters) "); 
              break;
case 25:
System.out.println("United States and the 2022 Russian invasion of Ukraine President of the United States Joe Biden announces that the United States will send 31 M1 Abrams main battle tanks to Ukraine. (CNBC)"); 
              break;
case 26:
System.out.println("Russia launches a wave of cruise missile and Shahed 129 drone strikes across Ukraine, targeting major cities and critical infrastructure, killing at least 11 people and injuring 11 others. Ukrainian general Valerii Zaluzhnyi says that at least 20 missiles have been intercepted over the capital Kyiv.");
System.out.println(" (The Guardian) "); 
              break;
case 27:
System.out.println("Eastern Ukraine campaign Ukraine says that fierce fighting is underway in the east and northeast of the country as Russian troops try to break through Ukrainian defensive lines in Kharkiv, Donetsk, Luhansk and Zaporizhzhia Oblasts. (Reuters) "); 
              break;
case 28:
System.out.println("Battle of Donbas Russia claims that a Ukrainian HIMARS missile strike on a hospital in Novoaidar, Luhansk Oblast, has killed 14 people and injured 24 others, including patients and medical staff. (Reuters) Attacks on civilians in the 2022 Russian invasion of Ukraine The Russian Air Force launches an");
System.out.println(" airstrike on the city of Seredyna-Buda in Sumy Oblast, destroying a kindergarten and damaging nearby residential buildings. No casualties have been reported. The towns of Esman and Shalyhyne are also damaged by cross-border shelling. (Ukrinform) "); 
              break;
case 29:
System.out.println("Eastern Ukraine campaign Forces of the Wagner Group say that they have captured the village of Blahodatne, north of Bakhmut. However, Ukraine rejects the claim and says that it repelled the attack. (AFP via The Moscow Times) Southern Ukraine campaign Russian forces shell the city of Kherson, killing");
System.out.println(" three people, injuring six others, and damaging a hospital, school, and bus station. (Reuters via U.S. News & World Report)"); 
              break;
case 30:
              System.out.println("Nothing significant to report");
              break;
case 31:
System.out.println("Foreign involvement in the 2022 Russian invasion of Ukraine French Armed Forces Minister Sébastien Lecornu announces that France will send 12 additional CAESAR self-propelled howitzers to Ukraine, and could also train Ukrainian Air Force pilots to operate French fighter jets as part of their latest ");
System.out.println("military support package. (Reuters)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
                       }
                       break;
case 2:
          System.out.println("1. Enter a day in February 2023 :");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Attacks on civilians in the 2022 Russian invasion of Ukraine A Russian Iskander-K ballistic missile destroys an apartment complex in Kramatorsk, Donetsk Oblast, killing at least three people and injuring 20 others, according to local officials. (Reuters)"); 
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
System.out.println("2023 visit by Volodymyr Zelenskyy to the United Kingdom Ukrainian president Volodymyr Zelenskyy visits the United Kingdom in his second trip outside Ukraine since the beginning of the Russian invasion, meeting with King Charles III and Prime Minister Rishi Sunak, and addressing Parliament at Westmin");
System.out.println("ster Hall. (Reuters) France–Ukraine relations, Germany–Ukraine relations Following his UK visit, Zelenskyy visits France to meet President Emmanuel Macron and German chancellor Olaf Scholz. (AFP via RFI)"); 
           break;
case 9:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches drone and cruise missile strikes across the south and east of Ukraine with large explosions reported in the Dnipropetrovsk, Luhansk, Mykolaiv, and Zaporizhzhia oblasts. (The Guardian)"); 
           break;
case 10:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure, Moldova–Russia relations Moldova says that Russia has fired missiles over the country at targets inside Ukraine, condemning the missile flyover as a violation of its sovereignty, and also summons the Russian ambassador for an official expla");
System.out.println("nation. (BBC News) Southern Ukraine campaign A Russian Navy drone boat strikes the Zatoka railway bridge on Highway H33 near Odesa. It is believed to be the first use of the naval weapon in the war by Russian forces. (The Telegraph) "); 
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
           System.out.println("Nothing significant to report");
           break;
case 14:
System.out.println("Battle of Bakhmut Ukrainian forces blow up a bridge located between Bakhmut and Kostiantynivka as Russian troops and Wagner Group fighters advance on the city. (The Guardian)"); 
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
           System.out.println("Lawmakers in the State Duma vote to withdraw Russia from 21 conventions of the Council of Europe. (RFE/RL)");
           break;
case 17:
System.out.println("Battle of Bakhmut Russian forces shell Bakhmut with artillery and Grad rockets, killing five people and injuring nine others. (The Kyiv Independent via Yahoo! News)"); 
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
           System.out.println("U.S. President Joe Biden makes an unannounced visit to Kyiv, Ukraine, where he meets with President Volodymyr Zelenskyy. (The Guardian)");
           break;
case 21:
System.out.println("Russian forces shell the city of Kherson, killing at least six people and injuring 12 others, according to local officials. (Reuters) "); 
           break;
case 22:
           System.out.println("Russian President Vladimir Putin revokes a 2012 foreign policy decree which underpinned Moldova's sovereignty in resolving the political status of the breakaway Transnistria region. (Reuters)");
           break;
case 23:
           System.out.println("Pro-Ukraine protesters confront visitors heading to the Russian embassy in Washington, D.C., United States. (The Hill)");
           break;
case 24:
System.out.println("China unveils a 12-point position paper on ending the war in Ukraine, ahead of an expected speech by President Xi Jinping on the conflict. Ukraine says that it hopes China can urge Russia to withdraw its troops in response to the paper. (The Guardian) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an War Poland delivers the first Leopard 2 main battle tanks to Ukraine. (DW)"); 
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
           System.out.println("Nothing significant to report");
           break;
case 28:
           System.out.println("Finland begins construction of a border barrier on its border with Russia due to the 2022 Russian invasion of Ukraine. (BBC News)");
  break;
  default:
            System.out.println("Select a day from 1 to 28:");
          }
          break;
case 3:
          System.out.println("1. Enter a day in March 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
System.out.println("2022–23 Western Russia attacks 2023 Bryansk Oblast attack Russia accuses a Ukrainian sabotage group of attacking the villages of Lyubechane and Sushany in Bryansk Oblast and taking hostages. However, Ukraine accuses Russia of staging a false provocation. (Reuters) Attacks on civilians in the 2022 Ru");
System.out.println("ssian invasion of Ukraine A Russian missile strike on an apartment building in the city of Zaporizhzhia kills three civilians and injures at least four others, according to Ukrainian police. (Reuters)"); 
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
System.out.println("Battle of Bakhmut Heavy street fighting takes place between Russian and Ukrainian troops in Bakhmut, Donetsk Oblast. The city's deputy mayor Oleksandr Marchenko says that not a single building has remained untouched by fighting, and that the city is almost destroyed. (BBC News) In a rare high-level ");
System.out.println("visit to the Donbas, Russian Defence Minister Sergei Shoigu is filmed inspecting troops in the eastern military district in the south Donetsk direction. (The Guardian)"); 
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
           System.out.println("Nothing significant to report");
           break;
case 9:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches cruise missiles at targets across Ukraine. Buildings and critical infrastructure are damaged, and at least five civilians were killed in Lviv Oblast when a missile destroyed their home, according to the region's governor Maks");
System.out.println("ym Kozytskyy. (BBC News)"); 
           break;
case 10:
           System.out.println("Nothing significant to report");
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
           System.out.println("Nothing significant to report");
           break;
case 14:
System.out.println("2023 Black Sea drone incident Russian Air Force Su-27 fighter jets intercept and hit a United States Air Force MQ-9 Reaper drone over the Black Sea, with the collision damaging the drone's propeller and causing the United States to crash the drone into international waters. (The Washington Post) (Re");
System.out.println("uters)"); 
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Poland announces that it will deliver four MiG-29 fighter jets to Ukraine, becoming the first NATO member state to send warplanes to Ukraine. (Sky News)"); 
           break;
case 17:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Slovakia announces that it will donate its MiG-29 fighter jets, and supply part of its Kub air-defense system to Ukraine. (Reuters) "); 
           break;
case 18:
           System.out.println("Russian forces shell Kramatorsk, Donetsk Oblast, with cluster munitions, killing at least two civilians and injuring five others. (Ukrinform)");
           break;
case 19:
           System.out.println("Russian president Vladimir Putin visits Mariupol, Donetsk Oblast, in Russian-occupied Ukraine, for the first time since the invasion began. (AP)");
           break;
case 20:
System.out.println("The European Union approves a €2 billion plan to supply 1 million artillery shells to Ukraine. (The Washington Post) (Kyiv Post) Southern Ukraine campaign Ukraine's Ministry of Defence says that a Russian shipment of Kalibr cruise missiles was blown up as it was being transported by rail in Dzhankoi");
System.out.println(", Crimea. At least one person is reportedly injured. (Reuters)"); 
           break;
case 21:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–United Kingdom relations The United Kingdom confirms that it will provide Ukraine with depleted uranium armour-piercing shells, alongside its Challenger 2 main battle tanks, saying that there is a low risk of radiation contamination. Rus");
System.out.println("sian president Vladimir Putin says Russia would be forced to react to the British move. (BBC News) (BBC News)"); 
           break;
case 22:
System.out.println("Zaporizhzhia residential building airstrikes A Russian missile strike on an apartment building in the city of Zaporizhzhia kills a civilian and injures 25 others. (AP) A Russian drone strike in Rzhyshchiv kills at least nine civilians and injures 29 others. (Yahoo)"); 
           break;
case 23:
           System.out.println("Nothing significant to report");
           break;
case 24:
           System.out.println("Nothing significant to report");
           break;
case 25:
System.out.println("Russian President Vladimir Putin announces that Russia will station tactical nuclear weapons in Belarus by July. The nuclear missiles will be operated by Russian forces. It will be the first time that Russian nuclear weapons have been deployed abroad since 1996. (BBC News) (Reuters) Law and crime  R");
System.out.println("ussian invasion of Ukraine Yevgeny Prigozhin, leader of the Wagner Group, says that more than 5,000 prisoners have been pardoned following the completion of their contracts in Ukraine. (Reuters) "); 
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on Sloviansk, Donetsk Oblast, kills at least two civilians and injures 29 others. (Euronews) The head of the Blagodarnensky District in Stavropol Krai, Russia, announces the death of Dmitry Lisitsky, commander of a batt");
System.out.println("alion of the 247th Guards Air Assault Regiment who participated in the 2014 Battle of Ilovaisk. Ukraine says that he was killed in battle while pro-Russian sources say that he committed suicide. (Novaya Gazeta Europe)"); 
           break;
case 28:
           System.out.println("Nothing significant to report");
           break;
case 29:
           System.out.println("Nothing significant to report");
           break;
case 30:
           System.out.println("Lawmakers from the right-wing Freedom Party of Austria walkout from the lower house of Austria's parliament during a speech by Ukrainian President Volodymyr Zelenskyy as a protest against the violation of Austria's national principle of neutrality. (Al Jazeera)");
           break;
case 31:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 4:
          System.out.println("1. Enter a day in April 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Russia assumes the Presidency of the United Nations Security Council as part of the standard monthly rotation among the council's 15 members. (BBC News)");
           break;
case 2:
System.out.println("2022–2023 Western Russia attacks 2023 Saint Petersburg bombing Russian pro-government war correspondent Vladlen Tatarsky is killed by a bombing at a café in Saint Petersburg owned by oligarch Yevgeny Prigozhin. Sixteen others are injured. (TASS) Attacks on civilians in the Russian invasion of Ukrain");
System.out.println("e Russian forces shell Kostiantynivka, Donetsk Oblast, killing six civilians and injuring eight others, according to the Ukrainian government. (Reuters)"); 
           break;
case 3:
System.out.println("Battle of Bakhmut Yevgeny Prigozhin, the head of the Wagner Group, claims legal control of Bakhmut, although Ukraine denies this, stating that its troops continue to remain in the city's western districts. (CNBC)"); 
           break;
case 4:
           System.out.println("Finland officially joins NATO, becoming the 31st member of the military alliance and expanding NATO's border with Russia by 1,300 kilometres (810 mi). (Time) (BBC News)");
           break;
case 5:
           System.out.println("President of Ukraine Volodymyr Zelenskyy makes an official visit to Poland. During his meeting with Polish President Andrzej Duda, Zelenskyy receives the Order of the White Eagle, Poland's highest order. (Reuters) (European Pravda)");
           break;
case 6:
System.out.println("2022 Russia–Ukraine peace negotiations Deputy leader Andrii Sybiha says that Ukraine is willing to hold talks on the future of Crimea if a Ukrainian counter-offensive reaches the Crimean administrative border. (The Guardian)"); 
           break;
case 7:
System.out.println("Battle of Bakhmut The UK defence ministry says that Russian forces have captured the Bakhmutka river west banks, endangering Ukrainian supply lines. (Reuters)"); 
           break;
case 8:
System.out.println("Two sets of classified documents of the United States relating to the Russo-Ukrainian War are leaked online. The leaks also include intelligence that the United States holds on other nations, including North Korea, China, Iran, and the United Arab Emirates. (CNN) The documents are compiled from mult");
System.out.println("iple sources, including the Central Intelligence Agency, National Security Agency, and the Bureau of Intelligence and Research of the State Department. (CNN)"); 
           break;
case 9:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on Zaporizhzhia destroys a residential building and damages dozens of other buildings, killing two civilians and injuring another. Russian attacks are also reported in other settlements, including Orikhiv and Huliaipole");
System.out.println(". (Reuters) (Anadolu Agency) "); 
           break;
case 10:
           System.out.println("U.S. officials confirm that top secret U.S. government documents relating to the war in Ukraine have been leaked on social media, revealing details of Ukrainian military vulnerabilities. The Pentagon refers the leak to the Department of Justice, which has opened a criminal investigation into the lea");
System.out.println("k. (Reuters)");
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
System.out.println("The European Council agrees to donate a billion euros worth of ammunition to Ukraine through an EU financing instrument. (Tagesschau) The German government approves a request by Poland for the export of former GDR MiG-29 fighter jets to Ukraine. (Tagesschau) Battle of Bakhmut In the battle of Bakhmu");
System.out.println("t, Russian forces are able to reach the centre of the city, according to Ukrainian and Russian sources. (Spiegel) "); 
           break;
case 14:
           System.out.println("A Russian missile strike on Sloviansk, Donetsk Oblast, kills at least eight civilians and injures 21 others. (The New York Times)");
           break;
case 15:
           System.out.println("Poland and Hungary ban imports of grain and other food from Ukraine to protect the local agricultural sector, due to Ukrainian supplies lowering the price of food. (Reuters)");
           break;
case 16:
System.out.println("Ukraine and Russia conduct a prisoner swap for soldiers who fought in Bakhmut, with 130 Ukrainian soldiers returning and an unknown amount of Russian soldiers returning. (PBS) International relations  China–Russia relations Chinese Minister of Defense Li Shangfu meets President of Russia Vladimir Pu");
System.out.println("tin and Russian Defence Minister Sergei Shoigu in Moscow, as part of his four-day visit to Russia. (CBS News)"); 
           break;
case 17:
           System.out.println("Slovakia transfers 13 MiG-29 fighter jets to Ukraine, according to the Slovak Defence Ministry. (Reuters)");
           break;
case 18:
System.out.println("Russian annexation of Donetsk, Kherson, Luhansk and Zaporizhzhia oblasts Russian president Vladimir Putin makes a rare visit to Russian-occupied Kherson and Luhansk oblasts and meets with military commanders in charge of military operations. (Reuters) Former People's Deputy of Ukraine Oleh Barna is ");
System.out.println("killed in combat. (UNIAN)"); 
           break;
case 19:
           System.out.println("Bulgaria temporarily bans the import of grain from Ukraine, except for those in transit, following similar decisions made by Poland, Hungary, and Slovakia. (Reuters)");
           break;
case 20:
           System.out.println("Russian authorities report an explosion in Belgorod near the border with Ukraine, saying that it left a 20-metre (66 ft) crater in the city center. It resulted from an accidental discharge of ammunition from a Russian airplane. (Barron's via AFP) (Reuters)");
           break;
case 21:
           System.out.println("Latvian Defence Minister Ināra Mūrniece announces that Latvia will send all of its FIM-92 Stinger missile systems to Ukraine, following a meeting with NATO allies at Ramstein Air Base in Germany. (Yahoo! News)");
           break;
case 22:
           System.out.println("Russia announces the expulsion of several German diplomatic personnel in a tit-for-tat decision following the expulsion of Russian personnel from Germany. (RFE/RL)");
           break;
case 23:
           System.out.println("According to the Institute for the Study of War and various Russian military bloggers, the Ukrainian military have taken up positions on the east bank of the Dnieper river north of the town of Oleshky. (Novaya Gazeta Europe)");
           break;
case 24:
           System.out.println("Russian forces in Crimea repel a drone attack on Sevastopol, according to governor Mikhail Razvozhaev, in the first attack on the peninsula since February. (The Guardian)");
           break;
case 25:
           System.out.println("A Russian S-300-type missile strike in Kupiansk, Kharkiv Oblast, kills at least one civilian and injures 10 others. (RFE/RL)");
           break;
case 26:
System.out.println("Battle of Donbas Russia uses its T-14 Armata main battle tanks in combat against Ukrainian forces for the first time. (Reuters) China and the Russian invasion of Ukraine Chinese leader Xi Jinping calls Ukrainian President Volodymyr Zelenskyy, with both countries announcing the dispatch of representa");
System.out.println("tives to establish a diplomatic presence after the call. (NPR)"); 
           break;
case 27:
           System.out.println("One person is killed and 23 others are injured by a Russian Kalibr missile strike in Mykolaiv. (Euronews)");
           break;
case 28:
           System.out.println("At least 25 civilians are killed and many others are injured in a new wave of Russian cruise missile strikes across Ukraine. The capital Kyiv is hit for the first time in 51 days. (BBC News) (Reuters)");
           break;
case 29:
           System.out.println("A huge fire engulfs a fuel depot in the port of Sevastopol, in Russian-occupied Crimea, in what governor Mikhail Razvozhaev says was a drone attack. (Al Jazeera)");
           break;
case 30:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 5:
          System.out.println("1. Enter a day in May 2023:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Russia launches cruise missile and drone strikes across Ukraine. Among the targets hit is an industrial zone in Pavlohrad, Dnipropetrovsk Oblast, where a large explosion damaged or destroyed 19 apartment buildings and 25 homes, with 34 people reportedly injured. Ukrainian forces say that they shot d");
System.out.println("own 15 of 18 missiles launched by Russia. (The Guardian) Battle of Bakhmut Ukrainian colonel general Oleksandr Syrskyi says that Ukrainian troops have recaptured parts of central Bakhmut, but that the situation on the ground remains difficult. (Reuters)"); 
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
System.out.println("2023 Kremlin drone attack Russia accuses Ukraine of attempting to assassinate President Vladimir Putin after two drones were shot down near the Kremlin. A spokesman claimed that Putin was not inside the Kremlin at the time of the attack. A video shows at least one drone hitting the compound. Ukraine");
System.out.println(" denies any involvement in the attack. (BBC News) 2022–2023 Crimea attacks Russia's Federal Security Service says that it has arrested seven Ukrainian agents who were allegedly planning a series of high-profile sabotage and terrorist acts in Crimea, including an attack on the Head of the Republic of");
System.out.println(" Crimea Sergey Aksyonov. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Russian forces shell Kherson Oblast, killing 16 civilians and injuring 22 others. (Reuters)"); 
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin announces that, due to a lack of ammunition, his fighters will leave Bakhmut, Donetsk Oblast, on May 10 and hand over their positions to units of the Russian Defense Ministry. (CBC News) "); 
           break;
case 6:
System.out.println("2022–2023 Western Russia attacks Russian nationalist writer Zakhar Prilepin is injured and his driver is killed when their vehicle is hit by a car bomb in Nizhny Novgorod Oblast, Russia. (BBC News)"); 
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
           System.out.println("Nothing significant to report");
           break;
case 9:
System.out.println("Battle of Donbas French journalist Arman Soldin is killed by a Russian rocket strike in Chasiv Yar, Donetsk Oblast, while working for Agence France-Presse. (Le Monde)"); 
           break;
case 10:
           System.out.println("A court in Tver Oblast, Russia, sentences a poet to four years in prison for reciting poetry critical of the Russian invasion of Ukraine. (RFE/RL)");
           break;
case 11:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin confirms that Ukrainian troops have recaptured parts of Bakhmut in Donetsk Oblast from his forces. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom's Defence Ministry confirms that it has supplied Ukraine with");
System.out.println(" Storm Shadow cruise missiles. (BBC News) "); 
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches cruise missiles at the city of Ternopil in Western Ukraine, injuring two civilians. (BBC News) Two Russian Mi-8 helicopters and two fighter jets, an Su-34 and an Su-35, are reportedly shot down in Bryansk Oblast. (Reuters via");
System.out.println(" MSN)"); 
           break;
case 14:
System.out.println("Battle of Donbas The Russian Ministry of Defence announces the deaths of two of their commanders in Bakhmut and the village of Sontsivka west of Donetsk. (Novaya Gazeta Europe)"); 
           break;
case 15:
System.out.println("Ukrainian President Volodymyr Zelenskyy meets with British Prime Minister Rishi Sunak at Chequers. (BBC News) Moldova announces that it will initiate a procedure to withdraw from the CIS Interparliamentary Assembly. (Anadolu Agency)"); 
           break;
case 16:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure More than a dozen explosions are reported in Kyiv as Russia launches a missile barrage at the capital and other Ukrainian cities. Ukrainian forces say that they have shot down six Kh-47M2 Kinzhal hypersonic missiles. (Financial Times) (Reute");
System.out.println("rs) The Russian Ministry of Defense claims that it destroyed a Patriot air defense system in Kyiv. However a United States official says that the system was likely damaged but not destroyed. (CNN) "); 
           break;
case 17:
System.out.println("Southern Ukraine campaign Russian forces shell Ukrainian-held areas of Kherson Oblast, killing at least five civilians, including a child, while 17 others are reportedly injured. (BBC News)"); 
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
System.out.println("Battle of Bakhmut Wagner Group leader Yevgeny Prigozhin says that they have captured all of Bakhmut in Donetsk Oblast. The Ukrainian Defence Ministry rejects this claim, saying that its forces still control a district on the westernmost edge of the city. (CNN)"); 
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
           System.out.println("Governor of Belgorod Oblast Vyacheslav Gladkov says that Ukrainian sabotage groups have entered Grayvoronsky District. Ukrainian media reports that the cross-border excursion is being performed by the Russian rebel opposition groups, the Russian Volunteer Corps and the Freedom of Russia Legion. The ");
System.out.println("Freedom of Russia Legion reports that it has captured the Russian towns of Kozinka and Gora-Podol. A bridge crossing the Vorskla near Grayvoron is destroyed in an explosion. (The New York Times) (Ukrainska Pravda via Yahoo! News) (Meduza) (Reuters)");
           break;
case 23:
           System.out.println("Nothing significant to report");
           break;
case 24:
           System.out.println("Japan announces that it will donate 100 military vehicles to the Armed Forces of Ukraine. (ABC News)");
           break;
case 25:
           System.out.println("Wagner Group forces begin withdrawing from Bakhmut, Donetsk Oblast, transferring control over to the Russian Ground Forces. (BBC News)");
           break;
case 26:
           System.out.println("A Russian missile strike on Dnipro damages a medical facility, killing two people and injuring 23 others. (Ukrainska Pravda) (The Guardian)");
           break;
case 27:
           System.out.println("Russian authorities say that shelling has killed a person in Shebekino, Belgorod Oblast and Kursk, Kursk Oblast, respectively. Russia accuses Ukraine of the attacks, although Ukraine denies any involvement. (AFP via The Moscow Times)");
           break;
case 28:
           System.out.println("Two people are killed and three others are injured in a 'record drone attack' on Kyiv. Ukrainian authorities say they have shot down 52 of 54 drones. (Euronews)");
           break;
case 29:
System.out.println(" Russian forces strike Kyiv using Iskander ballistic and cruise missiles, with debris injuring one civilian and damaging infrastructure. Ukraine claims to have shot down all of the missiles. (AP via Los Angeles Times) \n Russian airstrikes on Toretsk, Donetsk Oblast, target a petrol station and a mu");
System.out.println("lti-storey building, killing two people and injuring eight others. (Reuters)"); 
           break;
case 30:
System.out.println("30 May 2023 Moscow drone strikes Russian authorities say they have intercepted eight drones over Moscow. (BBC News) A Russian drone attack on Kyiv results in the death of a civilian and injures several others. (The New York Times)"); 
           break;
case 31:
System.out.println("Southern Ukraine campaign Russia says that it destroyed the Ukrainian Navy warship Yuri Olefirenko at the Port of Odesa in a missile strike on May 29. (Reuters) 2022–2023 Western Russia attacks Russian authorities say that a Ukrainian drone strike has caused a fire at an oil refinery in Krasnodar Kr");
System.out.println("ai, and also caused damage in Shebekino, Belgorod Oblast. (Reuters) Battle of Donbas According to Russian authorities, five people are killed and 19 others are injured by Ukrainian shelling in Karpaty, in Russian-occupied Luhansk Oblast. (US News)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 6:
          System.out.println("1. Enter a day in June 2023:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Russia says they have prevented three attacks by the Russian Volunteer Corps in Belgorod Oblast. (The New Voice of Ukraine via Yahoo! News) (Reuters) Belgorod Governor Vyacheslav Gladkov says that Ukrainian forces have shelled Shebekino with BM-21 Grad rockets, damaging a dormitory and an administra");
System.out.println("tive building in the town. Hundreds of people are evacuated. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Russia launches cruise missiles and ballistic missiles at Kyiv, killing three civilians and injuring 12 others. (AFP via Arab News)"); 
           break;
case 2:
System.out.println("Southern Ukraine campaign Russian occupation official Vladimir Rogov says Ukrainian forces have shelled the port of Berdiansk in Zaporizhzhia Oblast, injuring nine people. (Reuters)"); 
           break;
case 3:
System.out.println("Russian forces strike a residential area in Dnipro Raion with Iskander cruise missiles, killing a two-year-old girl and injuring 22 other civilians, including five children. (Reuters) "); 
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("2023 Belgorod Oblast incursions The Russian Volunteer Corps claims to have captured the village of Novaya Tavolzhanka in the Belgorod region of Russia. The governor of Belgorod, Vyacheslav Gladkov, says that about 100 civilians are still trapped in the village and cannot be evacuated because of cont");
System.out.println("inued shelling. (Novaya Gazeta Europe) Wagner Group mercenaries publish a video of a captured Russian commander claiming that he had ordered his troops to fire on a Wagner convoy leaving Bakhmut. (The Guardian)"); 
           break;
case 6:
System.out.println("Destruction of the Kakhovka Dam The Nova Kakhovka dam in the Russian-occupied part of Ukraine's Kherson Oblast is destroyed, releasing a huge amount of water downstream on the Dnieper. The dam had held back 18 cubic kilometres of water in the Kakhovka reservoir. (Reuters) Thousands of civilians are ");
System.out.println("being evacuated from the town of Nova Kakhovka and surrounding villages as the floods spread. (BBC News)"); 
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
System.out.println("Southern Ukraine campaign Russian forces shell Kherson, injuring nine civilians near an evacuation point in a flooded part of the city following the destruction of the Kakhovka dam. (The New York Times) The Russian Defence Ministry says it has destroyed several Ukrainian army tanks in Zaporizhzhia O");
System.out.println("blast, including a Leopard 2 main battle tank, the first Western-made tank to be destroyed by Russian forces in the war. A video released by the ministry shows a column of tanks being hit in a field, with one of them confirmed to be a Leopard 2. (Business Insider)"); 
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
           System.out.println("Russian forces attack Odesa with drones and missiles, killing three civilians and injuring 27 others. (Reuters)");
           break;
case 11:
System.out.println("2023 Ukrainian counteroffensive Ukrainian forces claim to have retaken three villages south of Velyka Novosilka in the southern Donetsk region. (The Guardian)"); 
           break;
case 12:
           System.out.println("Moldova and Ukraine sign an agreement to build a bridge across their border over the Dniester river between Cosăuți, Moldova, and Yampil, Ukraine, bypassing the unrecognised state of Transnistria. (Yahoo! News)");
           break;
case 13:
           System.out.println("Russian rockets hit a residential building in the city of Kryvyi Rih, Dnipropetrovsk oblast, killing 11 people and injuring 28 others. (Al Jazeera) (AP)");
           break;
case 14:
System.out.println("At least three people are killed and 13 others are injured in a rocket attack on a residential area in Odesa, Ukraine. (Al Jazeera) Adam Delimkhanov, a Russian-Chechen member of the State Duma, is reportedly injured in Ukraine. (BBC News)"); 
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine 2022–2023 bombing of Kherson Russian forces attack Kherson, injuring 23 civilians and damaging infrastructure. (The Kyiv Independent) A peace mission visit of African officials to Ukraine is interrupted by a Russian missile attack according to ");
System.out.println("the Ukrainian Air Force, which says it has shot down six Kinzhal ballistic missiles, six Kalibr missiles, and two reconnaissance UAVs. (AFP via Yahoo! News)"); 
           break;
case 17:
           System.out.println("Nothing significant to report");
           break;
case 18:
System.out.println("\n2023 Ukrainian counteroffensive: Ukrainian forces capture the front line village of Piatykhatky in Zaporizhzhia Oblast as heavy fighting continues. (Reuters)"); 
           break;
case 19:
           System.out.println("\nNothing significant to report");
           break;
case 20:
           System.out.println("\nNothing significant to report");
           break;
case 21:
           System.out.println("\nNothing significant to report");
           break;
case 22:
System.out.println("2023 Ukrainian counteroffensive: A bridge between southern Ukraine and Russian-occupied Crimea has been damaged by a British-made Storm Shadow missile. (BBC News)"); 
           break;
case 23:
System.out.println("Wagner Group rebellion Wagner Group leader Yevgeny Prigozhin declares that he will stop the Russian military leadership and calls for a march of justice, claiming that his forces have been killed in airstrikes by Russian government forces. The defence ministry rejects the claims, stating that they a");
System.out.println("re not true and are an information provocation. (BBC News) (CBC News) (The Moscow Times) (The Guardian) The Prosecutor-General of Russia Igor Krasnov formally orders the arrest of Yevgeny Prigozhin on charges of calling for an armed rebellion, with authorities urging Wagner personnel to refuse Prigo");
System.out.println("zhin's criminal and treacherous orders and to detain him. The FSB begins a mutiny investigation into Yevgeny Prigozhin. (TASS) (TASS 2) (NPR) BBC News Russian reports that there are roadblocks on the M4 highway between Moscow and Voronezh, with the FSB and other security services being placed on hig");
System.out.println("h alert in the Moscow Oblast. (BBC News Russian)"); 
           break;
case 24:
System.out.println("Wagner Group rebellion The Wagner Group seizes and occupies the cities of Rostov-on-Don and Voronezh as clashes occur across both oblasts. Wagner Group forces capture the Southern Military District headquarters in Rostov-on-Don. Rostov Governor Vasily Golubev asks residents to remain indoors. (9News");
System.out.println(") (Ukraine Today) (CNN) Yevgeny Prigozhin warns that his troops will march on Moscow unless Russian military leadership meet with him for talks. Russian president Vladimir Putin addresses the nation, saying that a coup d'état attempt is under way. (The New York Times) (AP) An Antonov An-26 transport");
System.out.println(" plane is reportedly shot down over Voronezh Oblast, while Russian Air Force Ka-50 helicopters strike an oil refinery and depot in Voronezh, causing a large explosion and fire.(Defence Blog) (Hindustan Times) Authorities in Lipetsk Oblast tell residents to remain indoors, with the M4 highway closed ");
System.out.println("off to traffic. Wagner forces later enter Lipetsk. (Live Mint) (Al Arabiya) (DNP India) The Wagner Group withdraws after Yevgeny Prigozhin, Vladimir Putin, and President of Belarus Alexander Lukashenko negotiate a deal to end the rebellion. (AP) 2022–2023 Russian strikes against Ukrainian infrastruc");
System.out.println("ture The debris of a Russian cruise missile shot down last night damages a 25-storey building in Kyiv, Ukraine, killing three civilians and injuring eight others. The Ukrainian military says that air defences destroyed 41 out of 51 cruise missiles launched by Russia, as well as two drones. (Reuters)"); 
           break;
case 25:
           System.out.println("\nNothing significant to report");
           break;
case 26:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Australian Prime Minister Anthony Albanese announces a AU$110 million military aid package to Ukraine. (The Guardian) Ukrainian forces recapture the uninhabited village of Rivnopil in Donetsk Oblast, according to Deputy Defence Minister Hanna Ma");
System.out.println("liar, the ninth in the past month. (Reuters)"); 
           break;
case 27:
System.out.println("Kramatorsk restaurant attack A Russian missile strike on a restaurant in Kramatorsk, Donetsk Oblast, Ukraine, kills 13 civilians and injures 61 others. (The Guardian) (The Independent) Wagner Group rebellion Belarusian President Alexander Lukashenko confirms that the head of the Wagner Group, Yevgen");
System.out.println("y Prigozhin, has arrived in Belarus in accordance with the agreement reached with the Russian government. (Reuters)"); 
           break;
case 28:
           System.out.println("\nNothing significant to report");
           break;
case 29:
           System.out.println("\nNothing significant to report");
           break;
case 30:
           System.out.println("\nNothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 7:
          System.out.println("1. Enter a day in July 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("\nNothing significant to report");
           break;
case 2:
           System.out.println("\nNothing significant to report");
           break;
case 3:
           System.out.println("Russia launches drone attacks on Sumy, Ukraine, killing two people and injuring 19 others. In response to the attack, Ukrainian President Volodymyr Zelenskyy calls for a major upgrade of anti-aircraft defences. (Reuters)");
           break;
case 4:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces attack Pervomaiskyi, Kharkiv Oblast, with missiles, injuring at least 38 civilians and damaging infrastructure, according to Ukrainian officials. (Reuters) Two people are killed during Russian shelling of Kherson. Three more peop");
System.out.println("le are injured by Russian shelling in Chernihiv. (The Guardian)"); 
           break;
case 5:
System.out.println("2023 Kyiv court explosion Ihor Humenyuk, a defendant at the Shevchenkivskyi District Court in Kyiv and a former member of the Sich Battalion, dies after injuring two police officers in an apparent escape attempt. (Meduza)"); 
           break;
case 6:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches a Kalibr cruise missile attack on Lviv from the Black Sea, killing 10 civilians and injuring 48 others. Ukrainian forces say that they shot down seven of the ten missiles. (Reuters) (Lviv City Council)"); 
           break;
case 7:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War The United States announces an $800 million aid package for Ukraine that includes cluster munitions for the first time. While the weapons are outlawed by over 100 countries under the Convention on Cluster Munitions, the United States, Ukraine, a");
System.out.println("nd Russia are not signatories. (CNN) The U.S. package also includes M777 howitzers, munitions for MIM-104 Patriot and M142 HIMARS missile systems, anti-tank weapons, UAVs, and additional Bradley Fighting Vehicles and Stryker armoured personnel carriers. (Reuters)"); 
           break;
case 8:
System.out.println("Battle of Donbas Russian forces shell Lyman in Donetsk Oblast, Ukraine, killing eight people and injuring 13 others, according to governor Pavlo Kyrylenko. (BBC News)"); 
           break;
case 9:
           System.out.println("President of Poland Andrzej Duda and President of Ukraine Volodymyr Zelenskyy commemorate the victims of the 1943 massacres in Volhynia and Eastern Galicia at a ceremony held at the Saint Peter and Paul Cathedral in Lutsk, Ukraine. (DW)");
           break;
case 10:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Orikhiv, Zaporizhzhia Oblast, killing seven civilians and injuring 11 others, according to Governor Yuriy Malashko. (Reuters) Russian military commissariats attacks Stanislav Rzhitsky, deputy chief in");
System.out.println(" charge of military mobilization in the Russian city of Krasnodar and commander of the Russian Navy submarine B-265 Krasnodar, is shot dead near the city's sports complex. (The Guardian) (Reuters via The Jerusalem Post)"); 
           break;
case 11:
System.out.println("2023 Ukrainian counteroffensive Russian Lieutenant General Oleg Tsokov is reportedly killed by a missile strike near Berdiansk, Zaporizhzhia Oblast. (CNN)"); 
           break;
case 12:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Zaporizhzhia, injuring 18 civilians, including six children. (Reuters) An 81-year-old man is killed and his wife is injured due to Russian shelling in Kherson. (The Guardian)"); 
           break;
case 13:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike a residential area in Zaporizhzhia, injuring 18 civilians, including six children. (Reuters) An 81-year-old man is killed and his wife is injured due to Russian shelling in Kherson. (The Guardian)"); 
           break;
case 14:
           System.out.println("\nNothing significant to report");
           break;
case 15:
           System.out.println("\nNothing significant to report");
           break;
case 16:
           System.out.println("Russian President Vladimir Putin authorizes a temporary state takeover of French agribusiness Danone and Carlsberg-owned brewer Baltika's shares, as part of a wider response to many private companies, including these two, reducing their business operations in Russia amid the ongoing war in Ukraine. ");
System.out.println("(AFP via SCMP)");
           break;
case 17:
System.out.println("2023 Crimean Bridge explosion A couple are killed and their daughter is injured by explosions at the Crimean Bridge. (Reuters) (The Guardian) Black Sea Grain Initiative The agreement to allow safe passage of grain exports from Ukrainian ports, in effect since July 2022, expires following Russia's re");
System.out.println("fusal to renew the deal. (Reuters)"); 
           break;
case 18:
System.out.println("2022 Russian mobilization The Russian Federal Assembly amends its mobilization laws, raising the age limits for conscription to 70 years old from 65 for the highest-ranking officers of the armed forces. (Reuters)"); 
           break;
case 19:
System.out.println("Bombing of Odesa At least 12 people are injured in a night-time Russian missile attack on Odesa, Ukraine. (AP via ABC News) Crimea attacks A fire occurs at the military training grounds in Crimea, forcing the evacuation of more than 2,000 people and the closure of a nearby highway. (Reuters) List of");
System.out.println(" military aid to Ukraine during the Russo-Ukrainian War The United States announces a $1.3 billion military aid package to Ukraine. The package includes four NASAMS air defense systems, anti-tank missiles, Phoenix Ghost and Switchblade attack drones, and landmine clearing equipment, among others. (T");
System.out.println("he New York Times)"); 
           break;
case 20:
System.out.println("\nOdesa attacks: At least three people are killed and eight civilians are injured in a Russian strike on Odesa, Ukraine. (Reuters) (Reuters 2) The consulate general of China in Odesa suffers minor damage during the Russian strike. (Reuters) Mykolaiv attacks Russian forces strike Mykolaiv, Ukraine, i");
System.out.println("njuring at least 19 civilians. (Reuters) (The Kyiv Independent) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency reports that it is still awaiting access to the rooftops of Ukraine's Russian-occupied Zaporizhzhia Nuclear Power Plant in Enerhodar, despite being permitted");
System.out.println(" to view the fuel cooling pools amid allegations of the plant's usage as an atomic bargaining chip. (AFP via The Manila Times)"); 
           break;
case 21:
System.out.println("Russian strikes against Ukrainian infrastructure Bombing of Odesa The Russian Armed Forces strike grain warehouses in Odesa with Kalibr missiles, destroying 120 tons of crops and injuring two civilians, according to Governor Oleh Kiper. (CNN) Bombing of Mykolaiv The Russian Armed Forces strike a bui");
System.out.println("lding in Mykolaiv, killing two civilians. (Yeni Şafak)"); 
           break;
case 22:
System.out.println("Crimea attacks Ukraine strikes an ammunition depot in occupied Crimea, leading to the evacuation of houses within a 5-kilometre (3.1 mi) radius. (AP)"); 
           break;
case 23:
System.out.println("Bombing of Odesa A nighttime Russian missile attack on Odesa kills at least one person, injures 22 others, and severely damages the Transfiguration Cathedral. (AP) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency finds anti-personnel mines at the Russian-occupied Zapori");
System.out.println("zhzhia Nuclear Power Plant, but notes that any detonation 'should not affect the site's nuclear safety and security systems'. (AFP via Barron's) (IAEA)"); 
           break;
case 24:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine:\n A child is killed and six people are wounded in a Russian missile strike on Kostiantynivka. (The Guardian) Dylan Collins, a journalist for Agence France-Presse, is wounded in Bakhmut by a Russian drone attack. (The Guardian) Russian strikes ");
System.out.println("against Ukrainian infrastructure Russian forces attack Odesa Oblast with drones, destroying grain warehouses at the Reni Commercial Seaport and injuring seven civilians. (Reuters) 2022–2023 western Russia attacks Two drones damage buildings in Moscow, including one near the Defence Ministry headquar");
System.out.println("ters. (Reuters)"); 
           break;
case 25:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A child is killed and six people are wounded in a Russian missile strike on Kostiantynivka. (The Guardian) Dylan Collins, a journalist for Agence France-Presse, is wounded in Bakhmut by a Russian drone attack. (The Guardian) Russian strikes aga");
System.out.println("inst Ukrainian infrastructure Russian forces attack Odesa Oblast with drones, destroying grain warehouses at the Reni Commercial Seaport and injuring seven civilians. (Reuters) 2022–2023 western Russia attacks Two drones damage buildings in Moscow, including one near the Defence Ministry headquarter");
System.out.println("s. (Reuters)"); 
           break;
case 26:
System.out.println("Russia launches cruise missiles at Kyiv Oblast, Khmelnytskyi Oblast, and Kirovohrad Oblast in Ukraine. Air Force Commander Mykola Oleschuk says that 36 targets, including three Kalibr and 33 Kh-101/Kh-55 cruise missiles were shot down. (Reuters) "); 
           break;
case 27:
System.out.println("2023 Ukrainian counteroffensive Ukrainian forces reportedly retake the village of Staromaiorske, Donetsk Oblast. (CNN International)"); 
           break;
case 28:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Nine civilians are injured in a Russian missile strike on a residential complex and a nearby building of the SBU in Dnipro. (Reuters) At least four civilians are injured in a Russian shelling of a residential area in Beryslav Raion, Kherson Obl");
System.out.println("ast, according to Governor Oleksandr Prokudin. (CNN) 2022–2023 western Russia attacks Russia claim to have shot down two Ukrainian S-200 missiles, with the debris injuring at least nine civilians in Taganrog, Rostov Oblast. (The New York Times)"); 
           break;
case 29:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike Zaporizhzhia, killing two civilians and injuring another, as well as damaging infrastructure. (CNN International) Two people are killed and 20 injured in a Russian missile strike on civilian infrastructure in Sumy. (The Ky");
System.out.println("iv Independent)"); 
           break;
case 30:
System.out.println("2022–2023 western Russia attacks Russia says that it destroyed three Ukrainian drones over Moscow, which injured one person, prompting officials to close the Vnukovo International Airport to traffic. (AFP via The Guardian)"); 
           break;
case 31:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kryvyi Rih At least six civilians are killed and 75 others are injured in a Russian ballistic missile strike on an apartment complex and a university building in Kryvyi Rih, Dnipropetrovsk Oblast. (The Washington Post) Bombing of Khe");
System.out.println("rson Russian forces strike residential areas in Kherson, killing at least four civilians and injuring 17 others. (CNN International) "); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 8:
          System.out.println("1. Enter a day in August 2023:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kherson A civilian is killed and five others are injured by a Russian airstrike on a Kherson hospital. (The Kyiv Independent via Yahoo! News) 2022–2023 western Russia attacks Russia says that it destroyed three drones near Moscow. On");
System.out.println("e drone damaged the 21st floor of the IQ-quarter mixed-use complex, which hosts offices for the Ministry of Economic Development. The Vnukovo International Airport temporarily closed for the second time in two days. (The Guardian) (Meduza) Turkmenistan Airlines announces that they will temporarily s");
System.out.println("uspend flights from Ashgabat to Moscow following the drone attacks. Flights will instead travel to Kazan, located in Tatarstan. (The Moscow Times) (Turkmenportal)"); 
           break;
case 2:
           System.out.println("A Russian drone strike in Izmail, Odesa Oblast, damages administrative buildings and grain storage facilities. (Bloomberg)");
           break;
case 3:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Kherson Eight civilians are injured in Russian strikes on the St. Catherine's Cathedral in Kherson. (AP) (The Kyiv Independent via Yahoo! News) "); 
           break;
case 4:
System.out.println("2022–2023 western Russia attacks The Russian Olenegorsky Gornyak landing ship is damaged by a Ukrainian naval drone attack at the naval base at the Port of Novorossiysk, Krasnodar Krai. (BBC News)"); 
           break;
case 5:
System.out.println("Crimea attacks Ukraine says that it damaged the Russian tanker Sig in a naval drone attack in the Black Sea near the Crimean Bridge. (BBC News) (The Guardian) Peace negotiations in the Russian invasion of Ukraine Peace talks begin in Jeddah, Saudi Arabia. The talks will last for two days and are bei");
System.out.println("ng attended by officials from around 40 countries, including those from the Global South, but not Russia. (Reuters) (The New York Times) Attacks on civilians in the Russian invasion of Ukraine Russia hits a blood transfusion centre in Kupiansk, Kharkiv Oblast, killing two people and injuring four. (");
System.out.println("BBC News)"); 
           break;
case 6:
           System.out.println("An Armed Forces of Ukraine missile damages a bridge connecting the Russian-occupied Kherson Oblast and Crimea over the Chonhar Strait. (Reuters)");
           break;
case 7:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine At least seven people are killed and 88 others are injured in a Russian Iskander double tap strike on residential buildings in Pokrovsk, Donetsk Oblast. (Reuters) (The Kyiv Independent via Yahoo! News) (The Guardian) Russian forces strike priva");
System.out.println("te houses in Kruglyakivka, Kharkiv Oblast, with guided aerial bombs, killing at least two civilians and injuring at least five others. (CNN International) Assassination attempts on Volodymyr Zelenskyy The Security Service of Ukraine says that it has arrested a Ukrainian citizen for allegedly assisti");
System.out.println("ng Russian intelligence, including his suspected role in a plot to assassinate President Volodymyr Zelenskyy. (The Washington Post)"); 
           break;
case 8:
           System.out.println("\nNothing significant to report");
           break;
case 9:
System.out.println("Russian invasion of Ukraine Attacks on civilians in the Russian invasion of Ukraine Bombing of Zaporizhzhia At least two people are killed and seven others are injured in a Russian missile strike on a residential area in Zaporizhzhia. (Reuters) North Korean Supreme Leader Kim Jong-un appoints Vice M");
System.out.println("arshal Ri Yong-gil to replace General Park Su-il as the chief of the General Staff Department of the Korean People's Army, and calls for enhancing war preparations, including increased weapons production and more drills. (AFP via Arab News)"); 
           break;
case 10:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Bombing of Zaporizhzhia At least one person is killed and 14 others are injured in a Russian Iskander missile strike on a hotel in Zaporizhzhia. (Reuters) Russian forces attack Toretsk, Donetsk Oblast, with mortars and aerial bombs, injuring at");
System.out.println(" least six people. (The Kyiv Independent) The Kupiansk city military administration says it will begin evacuating civilians from the Kupiansk Raion of the Kharkiv Oblast due to intense Russian shelling. (Meduza)"); 
           break;
case 11:
System.out.println("Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy announces the dismissal of all heads of regional military recruitment centres due to corruption. (NOS) (CNN) Russia temporarily closes its airspace above Moscow due to detection of drones. A drone is later shot down. (NOS)"); 
           break;
case 12:
System.out.println("A government investigation uncovers corruption at recruitment centres in 11 regions with 112 criminal proceedings opened. Bribes averaged around US$6,000 for a medical certificate granting an exemption from military service. (Financial Times) (The Guardian) Investigative news website Dzerkalo Tyzhni");
System.out.println("a reveals documents showing the Ministry of Defence overpaid for summer camouflage kits bought as winter coats for troops. The documents are suspected to be related to a investigation launched in June by Ukraine’s security services into Former Deputy Defense Minister Vyacheslav Shapovalov. (The Guar");
System.out.println("dian) A New York Times investigation reveals that a company tied to Serhiy Pashynskyi, who was previously under investigation for corruption, has become the biggest private arms supplier to the Ministry of Defence. (Insider) Crimea attacks The Russian Ministry of Defense says that it shot down twent");
System.out.println("y Ukrainian drones over Crimea. (NOS) Head of the Republic of Crimea Sergey Aksyonov says that three Ukrainian missiles were shot down over the Kerch bridge. (CNN International) Russian Defence Minister Sergei Shoigu inspects the Northern Fleet and visits a Rosatom nuclear weapons test site in Novay");
System.out.println("a Zemlya. (Reuters) (Hindustan Times) (The Barents Observer) One person is killed and 12 others are injured in a Russian guided aerial bomb strike on Orikhiv, Zaporizhzhia Oblast. (CNN International)"); 
           break;
case 13:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces strike Kherson Oblast, killing seven people, including an infant, and injuring 20 others. (Reuters)"); 
           break;
case 14:
           System.out.println("Russian forces strike Odesa with missiles and drones, injuring three people and damaging civilian infrastructure. (CNN International)");
           break;
case 15:
System.out.println("2022–2023 Russian strikes against Ukrainian infrastructure Russia launches a large-scale airstrike on Lviv and northwestern Volyn Oblast, killing at least three civilians and injuring more than a dozen others. (Reuters) 2022–2023 western Russia attacks Bryansk Oblast Governor Alexander Bogomaz says ");
System.out.println("that Russian soldiers and security services stopped a Ukrainian sabotage group from infiltrating the border near the village of Kurkovichi. (AFP via Al Arabiya)"); 
           break;
case 16:
System.out.println("Russia's Federal Security Service says that it has stopped a Ukrainian sabotage group, consisting of four fighters, from infiltrating the border in Starodubsky District, Bryansk Oblast. (AFP via Al Arabiya) 2023 Ukrainian counteroffensive Ukraine recaptures the village of Urozhaine, Donetsk Oblast, ");
System.out.println("from Russian forces. (CNN) A Russian strike in Dnipropetrovsk Oblast kills a civilian and injures six others, and damaging agriculture and civilian infrastructure. (CNN International)"); 
           break;
case 17:
           System.out.println("The U.S. approves the transfer of F-16 Fighting Falcons to Ukraine from Denmark and the Netherlands after training for Ukrainian Air Force pilots is completed. (Reuters)");
           break;
case 18:
System.out.println("2022–2023 western Russia attacks Russia says that Ukraine launched a drone attack on Moscow, striking a building in the International Business Center. Mayor Sergey Sobyanin says that air defences shot down a drone with debris falling over the Expocentre. (BBC News)"); 
           break;
case 19:
System.out.println("Chernihiv missile strike At least seven people are killed and 129 others are injured in a Russian ballistic missile strike on a theater in Chernihiv hosting a meeting of military and engineers at an exhibition on the use of consumer drones in the conflict. (BBC News) (CNN)"); 
           break;
case 20:
           System.out.println("\nNothing significant to report");
           break;
case 21:
System.out.println("2022–2023 western Russia attacks Ukraine claims that saboteurs coordinated by military intelligence destroyed a Tupolev Tu-22M heavy bomber at the Soltsy-2 airbase in Novgorod Oblast, Russia. (AP) Two people are injured by falling debris from a Ukrainian drone strike on Moscow and flights are disrup");
System.out.println("ted at the city's airports. Russia says they shot down one drone and jammed another. (Reuters)"); 
           break;
case 22:
System.out.println("Eastern Ukraine campaign Russian forces shell Torske and Zavitne in Donetsk Oblast, Ukraine, killing three people and injuring two others. (BBC News) Military aid to Ukraine during the Russo-Ukrainian War France delivers the first shipment of its SCALP-EG air-launched cruise missiles to Ukraine. (Al");
System.out.println(" Arabiya)"); 
           break;
case 23:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine 2022–2023 western Russia attacks The governor of Belgorod Oblast, Russia, says that a Ukrainian attack killed three civilians in the region. (AFP via Al Arabiya) Four people are killed and four others are injured in a Russian drone strike on a ");
System.out.println("school in Romny, Sumy Oblast. (Reuters) Russian strikes against Ukrainian infrastructure A Russian drone strike on agricultural facilities in Izmail, Odesa Oblast, destroys 13,000 tons of grain and damages infrastructure. (CNN International)"); 
           break;
case 24:
           System.out.println("\nNothing significant to report");
           break;
case 25:
           System.out.println("Three Ukrainian Air Force pilots are killed when two L-39 trainer aircraft collide in midair in Zhytomyr, Ukraine. Andrii Pilshchykov was among the dead. (Al Jazeera) (The Guardian)");
           break;
case 26:
System.out.println("2022–2023 western Russia attacks The governor of Belgorod Oblast says that Ukrainian shelling and usage of cluster munitions injured six civilians in Urazovo. (Al Jazeera) Russian forces shell the front-line city of Kupiansk, killing two people and injuring another. (AP via MSN) Russia's Northern Fl");
System.out.println("eet conducts navy exercises in the Barents Sea aimed at preventing the passage of unauthorised and foreign ships. (Al Jazeera)"); 
           break;
case 27:
           System.out.println("Russia's Investigative Committee confirms the identities of the bodies recovered at crash site corresponds to the names on the flight list. (AFP via The Moscow Times)");
           break;
case 28:
System.out.println("2022–2023 western Russia attacks Russia says that it shot down two aerial drones over the north and west of Crimea. (Al Jazeera) 2023 Ukrainian counteroffensive Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency warns that Ukraine's offensive in Zaporizhzhia Oblast has in");
System.out.println("creased the risk of damage to the Zaporizhzhia Nuclear Power Plant. (Al Jazeera) Ukraine claims they retook the village of Robotyne, Zaporizhzhia Oblast from the Russian forces. Russia says they have repelled attacks in the area. (Reuters) Russia–United States relations Russia's Federal Security Ser");
System.out.println("vice charges Robert Shonov, a former U.S. consulate employee, with passing information on Russia's mobilization campaign to U.S. embassy staffers in Moscow. (Al Jazeera)"); 
           break;
case 29:
System.out.println("2022–2023 western Russia attacks At least four Ilyushin Il-76 military transport aircraft in Pskov are damaged in a drone attack on Pskov. Russian authorities say they have shot down eight drones over the Bryansk, Oryol, Ryazan, Kaluga and Moscow oblasts. (The Guardian)"); 
           break;
case 30:
System.out.println("Bombing of Kyiv Two people are killed and three others are injured in a Russian drone and missile strike on Kyiv. Ukraine says that it shot down several missiles and drones during the strike. (Reuters) Russia says that its aircraft destroyed four military boats carrying up to 50 members from landing");
System.out.println(" groups of the special forces of Ukraine operating in the Black Sea as well as two Ukrainian military speedboats carrying military personnel east of Snake Island. (Al Jazeera) (Reuters)"); 
           break;
case 31:
           System.out.println("\nNothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 9:
          System.out.println(" Enter a day in September 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("\nNothing significant to report");
           break;
case 2:
System.out.println("The Russian Defense Ministry says that it has destroyed 281 Ukrainian drones in the past week, including 29 over western Russia. (South China Morning Post) Crimea attacks The Russian Defense Ministry says that it has thwarted attacks on the Crimean Bridge by destroying a Ukrainian boat. (Reuters)"); 
           break;
case 3:
System.out.println("President of Ukraine Volodymyr Zelenskyy dismisses Defense Minister Oleksii Reznikov amid graft allegations within the Ministry of Defence. The head of the State Property Fund, Rustem Umerov replaces Reznikov. (Reuters) (CNN) "); 
           break;
case 4:
           System.out.println("\nNothing significant to report");
           break;
case 5:
System.out.println("2022–2023 western Russia attacks Russia's defense ministry says it has shot down three Ukrainian aerial drones over Istra, Moscow, and over the Kaluga and Tver regions near Moscow. (Al Jazeera) Governor of Bryansk Oblast Alexander Bogomaz says border guards and security services prevented an attempt");
System.out.println(" by an Ukrainian sabotage and reconnaissance group to cross into Russia. (Al Arabiya) Foreign involvement in the Russian invasion of Ukraine The Cuban foreign ministry says criminal proceedings have been initiated against a recruiting group primarily seeking to enlist Cuban citizens residing in Russ");
System.out.println("ia to fight for the country in Ukraine as mercenary activities are prohibited in Cuba, and reiterated that it was not part of the war. (The Guardian) (New York Times) Russia's defense ministry says it destroyed four Ukrainian military boats carrying troops in the Black Sea travelling in the directio");
System.out.println("n of Cape Tarkhankut on the Crimean coast. (Al Jazeera) Russia's defense ministry says it repelled a Ukrainian aerial drone attack over the Black Sea. (Al Jazeera)"); 
           break;
case 6:
System.out.println("September 2023 Kostiantynivka missile strike At least 15 people are killed and 30 others are injured in a missile strike on a marketplace in Kostiantynivka, Donetsk Oblast Kyiv blamed the attack on Russia, who denied involvement in the attack. An investigation by the New York Times found evidence wh");
System.out.println("ich suggested a Ukrainian 9M38 missile fired by a mobile Buk antiaircraft vehicle was responsible for the strike. (New York Times) Military aid to Ukraine during the Russo-Ukrainian War The United States announces a $175 million aid package for Ukraine that includes depleted uranium ammunition for t");
System.out.println("he first time, intended for use with Abrams tanks. (CBS News) British Defence Secretary Grant Shapps confirms reports by Russian officials that a Challenger 2 tank was destroyed in Ukraine, marking the first loss of the model on the battlefield. (The Kyiv Independent) Russian pilot Maxim Kuzminov, w");
System.out.println("ho defected to Ukraine with a MI-8 helicopter, receives a $500,000 reward for defecting. (Al Jazeera) The Romanian Ministry of National Defence confirms that debris from a Russian drone has been found on Romanian territory in Tulcea County. Romania denied claims that drones launched by Russia explod");
System.out.println("ed on Romanian territory. (AP)"); 
           break;
case 7:
System.out.println("Eastern Ukraine campaign Ukrainian forces enter the deserted villages of Stroivka and Topoli at the Russia–Ukraine border in Kharkiv Oblast. The villages were abandoned by Russia after the 2022 Kharkiv counteroffensive but Ukraine was previously unable to enter the villages due to the presence of mi");
System.out.println("nes in the area. (The Kyiv Independent)"); 
           break;
case 8:
System.out.println("Russia's security services detain a man for allegedly plotting to blow up a railway in Crimea and collecting information on the deployment of Russian defense ministry facilities and units. (Al Jazeera) 2023 Russian elections Russia says that its air defense systems shot down two Ukrainian drones tha");
System.out.println("t were attempting to attack a polling station in Skadovsk, Kherson Oblast, while voting was occurring. (Al Jazeera)"); 
           break;
case 9:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency warns of a nuclear threat at the Zaporizhzhia Nuclear Power Plant after explosions were heard near the plant amidst the Ukrainian counteroffensive. (PBS News)"); 
           break;
case 10:
System.out.println("Russia says its air defence shot down three Ukrainian drones over Crimea, one in the northwest and two in the west of the peninsula. (Reuters) Two foreign aid workers are killed and two others are injured by Russian shelling near Chasiv Yar, Donetsk Oblast. (AP)"); 
           break;
case 11:
           System.out.println("Ukraine says that it has recaptured from Russia four Black Sea oil platforms known as the Boyko Towers in Crimea. (Politico) (The New York Times)");
           break;
case 12:
           System.out.println("\nNothing significant to report");
           break;
case 13:
System.out.println("2023 Ukrainian counteroffensive Rosatom chief Alexei Likhachev says Ukraine launched a drone strike on Enerhodar near the Zaporizhzhia nuclear plant with all six drones being destroyed. (Reuters) Crimea attacks Russia says that at least 24 people were injured in Ukrainian missile strikes in Sevastop");
System.out.println("ol and two boats were damaged in the attack. Ukraine claims to have destroyed the Russian landing ship Minsk, submarine B-237 and a KC-701-class patrol boat of the Russian Navy's Black Sea Fleet. (AP) (Reuters) (MSN)"); 
           break;
case 14:
System.out.println("Crimea attacks Russia's defence ministry says that it destroyed a Ukrainian boat in the Black Sea. (Al Jazeera)"); 
           break;
case 15:
           System.out.println("Ukraine claims that it has recaptured the village of Andriivka, near Bakhmut, in Donetsk Oblast. Russia denied the claim and said its forces remained in control of village. (Al Jazeera)(AP)");
           break;
case 16:
           System.out.println("\nNothing significant to report");
           break;
case 17:
System.out.println("2023 Ukrainian counteroffensive Ukraine says that it has recaptured the village of Klishchiivka, near Bakhmut, in Donetsk Oblast. (Reuters)"); 
           break;
case 18:
           System.out.println("Russia announces that it will withdraw from the Barents Euro-Arctic Council, citing a lack of cooperation between the members of the council. (Bloomberg)");
           break;
case 19:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Nine people are killed in Russian attacks across Ukraine, including six civilians in Kupiansk, Kharkiv Oblast. (Reuters) "); 
           break;
case 20:
System.out.println("Polish Prime Minister Mateusz Morawiecki announces that Poland will stop supplying Ukraine with weapons, amid tensions between the two countries over the former's import ban on Ukrainian agricultural products. (CNN) Vasyl Zvarych, Ukrainian Ambassador to Poland, is summoned by the Polish Foreign Min");
System.out.println("istry to convey its strong protest over the statement of President Volodymyr Zelenskyy at the United Nations General Assembly. Zelenskyy's statement that some European countries' actions indirectly help Russia, drew condemnation from Poland. (Ukrainian News)"); 
           break;
case 21:
           System.out.println("At least two civilians are killed and 21 others are injured in Russian missile strikes across Ukraine. (AP)");
           break;
case 22:
System.out.println("Crimea attacks 2023 missile strike on the Sevastopol Naval Base The headquarters of the Black Sea Fleet in Sevastopol, Crimea, is hit in a Ukrainian missile attack, killing at least one person and causing a fire in the building. (Al Jazeera) "); 
           break;
case 23:
           System.out.println("\nNothing significant to report");
           break;
case 24:
           System.out.println("Canadian Speaker of the House Anthony Rota apologizes for inviting Yaroslav Hunka to Parliament during a visit by Ukrainian president Volodymyr Zelenskyy after it was revealed that he had fought for the Galicia Division under Nazi command. (BBC)");
           break;
case 25:
           System.out.println("Ukraine receives its first shipment of M1 Abrams tanks from the United States. (RFE/RL)");
           break;
case 26:
           System.out.println("\nNothing significant to report");
           break;
case 27:
           System.out.println("\nNothing significant to report");
           break;
case 28:
           System.out.println("\nNothing significant to report");
           break;
case 29:
           System.out.println("\nNothing significant to report");
           break;
case 30:
           System.out.println("\nNothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 10:
          System.out.println("1. Enter a day in October 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("\nNothing significant to report");
           break;
case 2:
           System.out.println("For the first time in the history of the European Union, representatives of all EU states, most of them foreign ministers, meet informally outside the EU. They meet with the Ukrainian government in Kyiv and assure it of their further support. (Euronews)");
           break;
case 3:
           System.out.println("Kharkiv Mayor Ihor Terekhov announces the construction of Ukraine's first underground school to protect students from missile strikes. (Tagesschau)");
           break;
case 4:
System.out.println("Protests against the Russian invasion of Ukraine Russian journalist Marina Ovsyannikova is sentenced to eight and a half years in prison in absentia for interrupting a news broadcast with anti-war slogans. (Reuters) Around 11 anti-war protesters involved with Code Pink are arrested outside the offic");
System.out.println("e of U.S. Senator Bernie Sanders after calling for the Biden administration to bring an end to the war. (The Hill)"); 
           break;
case 5:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Hroza missile attack Ukraine says that Russia has attacked a store and cafe in Hroza, Kharkiv Oblast, with a ballistic missile, killing at least 51 civilians. (AP) Russia says that a child has been killed and three others are injured while tryi");
System.out.println("ng to dismantle cluster munitions fired from Ukrainian forces, in the occupied city of Horlivka. (Al Jazeera) Military aid to Ukraine during the Russo-Ukrainian War The United States transfers 1.1 million rounds of Iranian ammunition to Ukraine after the U.S. Navy seized them from a shipment enroute");
System.out.println(" to Yemen in December. (BBC News) German Chancellor Olaf Scholz pledges a second Patriot air defense system to Ukraine. (Spiegel) Russia announces the successful test of the Burevestnik, a nuclear-powered and nuclear-capable cruise missile with a potential range of thousands of miles. (Reuters)"); 
           break;
case 6:
           System.out.println("\nNothing significant to report");
           break;
case 7:
           System.out.println("\nNothing significant to report");
           break;
case 8:
           System.out.println("\nNothing significant to report");
           break;
case 9:
           System.out.println("\nNothing significant to report");
           break;
case 10:
           System.out.println("\nNothing significant to report");
           break;
case 11:
           System.out.println("\nNothing significant to report");
           break;
case 12:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Three people are killed and two others are injured in Belgorod Oblast, Russia, after debris from a downed Ukrainian drone hit several houses. (Al Jazeera) Battle of Avdiivka Ukraine says that Russia has begun an assault on the city of Avdiivka");
System.out.println(", in Donetsk Oblast, supported by tanks and armored vehicles. (The New York Times)"); 
           break;
case 13:
           System.out.println("\nNothing significant to report");
           break;
case 14:
           System.out.println("\nNothing significant to report");
           break;
case 15:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian attacks across Ukraine over a 24-hour period kill at least six people, including two civilians in Kherson, which was bombarded with over 100 shells by Russian forces. In a separate incident, a 14-year-old boy is killed by a land mine in");
System.out.println(" Mykolaiv Oblast. (AP)"); 
           break;
case 16:
           System.out.println("\nNothing significant to report");
           break;
case 17:
System.out.println("2023 Ukrainian counteroffensive Ukraine launches ATACMS tactical ballistic missiles at Russian bases in Berdiansk and Luhansk, saying that they destroyed nine helicopters and a supply depot and killed several Russian military personnel. (BBC News) (AP) International relations  Hungary–Russia relatio");
System.out.println("ns Hungarian Prime Minister Viktor Orbán and Russian President Vladimir Putin hold talks at the Belt and Road Initiative forum in Beijing, China. (AP) Russia and weapons of mass destruction The State Duma votes unanimously to revoke Russia's ratification of the Comprehensive Nuclear-Test-Ban Treaty.");
System.out.println(" (AFP via The Moscow Times)"); 
           break;
case 18:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian missile strikes across Ukraine, kill at least 10 people, including five civilians in a strike on an apartment building in Zaporizhzhia, according to Ukrainian officials. (Reuters) (The New York Times) Military aid to Ukraine during the ");
System.out.println("Russo-Ukrainian War, Russia–United States relations Russia says that the U.S. decision to supply Ukraine with long-range ATACMS tactical ballistic missiles is a grave mistake which will have serious consequences. Ukrainian forces used the missiles in combat for the first time yesterday. (Reuters)"); 
           break;
case 19:
           System.out.println("\nNothing significant to report");
           break;
case 20:
System.out.println("Battle of Avdiivka Ukrainian forces repel Russian forces from Avdiivka, Donetsk Oblast, saying it has destroyed at least 175 vehicles, including 55 tanks. (Forbes)"); 
           break;
case 21:
           System.out.println("A Russian missile strike on a postal office in Kharkiv kills 6 workers and injures 16 others. (BBC)");
           break;
case 22:
           System.out.println("\nNothing significant to report");
           break;
case 23:
           System.out.println("Turkish president Recep Tayyip Erdoğan submits a bill on granting Sweden membership into NATO to the Grand National Assembly. (Al Jazeera)");
           break;
case 24:
           System.out.println("\nNothing significant to report");
           break;
case 25:
           System.out.println("The Russian Federation Council unanimously approves the State Duma's bill to revoke Russia's membership in the Comprehensive Nuclear-Test-Ban Treaty. (The Guardian)");
           break;
case 26:
System.out.println("Eastern Ukraine campaign U.S. National Security Council spokesperson John Kirby reports that the Russian Armed Forces execute insubordinate personnel during its offensive in eastern Ukraine. (AFP via Politiko)"); 
           break;
case 27:
System.out.println("Crimea attacks Pro-Russian official Oleg Tsaryov is critically injured in an assassination attempt by unknown assailants in Crimea and is reported to be in intensive care. (Reuters)"); 
           break;
case 28:
           System.out.println("\nNothing significant to report");
           break;
case 29:
System.out.println("Crimea attacks Russia says that it has shot down 36 Ukrainian drones over the Black Sea and the Crimea. (DW)"); 
           break;
case 30:
           System.out.println("\nNothing significant to report");
           break;
case 31:
           System.out.println("Ukraine launches airstrikes on Crimea, destroying a Russian S-300 missile system near Yevpatoria. (The Kyiv Post)");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 11:
          System.out.println("1. Enter a day in November 2023:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("South Korea's National Intelligence Service reports that North Korea has supplied Russia with over one million rounds of artillery shells for its ongoing invasion of Ukraine. (Al Jazeera) Russian strikes against Ukrainian infrastructure Russia strikes 118 Ukrainian towns and villages with artillery,");
System.out.println(" missiles, and drones over a 24-hour period, the most in a single day this year. More than 40 attacks are reported in Avdiivka. (BBC News)"); 
           break;
case 2:
System.out.println("Italian Prime Minister Giorgia Meloni states that European leaders are tired of the war in Ukraine and want to broker a deal with the Kremlin, saying that we need a way out during a phone call in which she thought she was talking with a senior African Union official, but was actually speaking to Rus");
System.out.println("sian comedians Vovan and Lexus. (The Telegraph) Russia and weapons of mass destruction Russian President Vladimir Putin signs a law formally withdrawing Russia's ratification of the Comprehensive Nuclear-Test-Ban Treaty. However, Russia maintains that it will not resume nuclear weapons testing unles");
System.out.println("s the United States also resumes testing. (Reuters)"); 
           break;
case 3:
System.out.println("Southern Ukraine campaign A Russian missile strike kills more than 20 Ukrainian soldiers at an awards ceremony near the front line in Zaporizhzhia Oblast. President Volodymyr Zelenskyy says the incident could have been avoided amid anger over the losses. (BBC News)"); 
           break;
case 4:
System.out.println("Crimea attacks Ukrainian forces strike Zalyv Shipbuilding yard in the Russian-occupied Kerch, Crimea, with cruise missiles, damaging the Russian corvette Askold [ru]. (Reuters)"); 
           break;
case 5:
           System.out.println("\nNothing significant to report");
           break;
case 6:
System.out.println(" Russian forces attack Odesa with drones and missiles, injuring at least eight people and damaging infrastructure, including the Odesa Fine Arts Museum. (Reuters)"); 
           break;
case 7:
           System.out.println("\nNothing significant to report");
           break;
case 8:
System.out.println("Southern Ukraine campaign A Russian missile strike on a Liberian-flagged vessel entering the Pivdennyi Port in Odesa Oblast kills one crew member and injures four others. The vessel was being used to transport iron ore to China. (Reuters)"); 
           break;
case 9:
           System.out.println("\nNothing significant to report");
           break;
case 10:
           System.out.println("\nNothing significant to report");
           break;
case 11:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches its first missile attacks against Kyiv in 52 days. Most of the ballistic missiles are intercepted by Ukrainian air defences. No casualties are reported. (Reuters) Ukraine–NATO relations Former NATO Secretary General Anders Fogh Rasmuss");
System.out.println("en puts forward a proposal for Ukraine to join the military alliance but without the territories occupied by Russia. (The Guardian)"); 
           break;
case 12:
           System.out.println("\nNothing significant to report");
           break;
case 13:
           System.out.println("\nNothing significant to report");
           break;
case 14:
           System.out.println("\nNothing significant to report");
           break;
case 15:
System.out.println("Southern Ukraine campaign A Russian missile strike kills two emergency workers and injures seven others in Zaporizhzhia Oblast, Ukraine. (Reuters)"); 
           break;
case 16:
           System.out.println("Russian activist Aleksandra Skochilenko is sentenced to seven years in prison on charges related to her protest of the Russian invasion of Ukraine. (The Guardian)");
           break;
case 17:
           System.out.println("\nNothing significant to report");
           break;
case 18:
           System.out.println("\nNothing significant to report");
           break;
case 19:
System.out.println("Eastern Ukraine campaign The Ukrainian military shells Russian-occupied Kalmiuske Raion, Donetsk Oblast, striking a dance hall in Kumachove during a performance, killing about 20 Russian troops and Russian actress Polina Menshikh. (BBC News) "); 
           break;
case 20:
           System.out.println("\nNothing significant to report");
           break;
case 21:
System.out.println("Casualties of the Russo-Ukrainian War The United Nations Human Rights Office says that more than 10,000 civilians have been killed in Ukraine since the Russian invasion in February 2022, though it expects the actual death toll to be significantly higher. (Reuters)"); 
           break;
case 22:
           System.out.println("Finnish Prime Minister Petteri Orpo announces that Finland will close all but the northernmost border crossing with Russia, amid an increase in asylum seekers entering Finland via Russia. (Reuters)");
           break;
case 23:
System.out.println("Southern Ukraine campaign A Russian cluster munition strike in Chornobaivka, Kherson, kills at least three civilians. Five people are also injured by Russian artillery shelling with more than 60 residential buildings reportedly damaged. (AP via ABC News)"); 
           break;
case 24:
           System.out.println("\nNothing significant to report");
           break;
case 25:
           System.out.println("Russia launches 75 drones against Ukraine from two directions, Primorsko-Akhtarsk and the Kursk region. In response, Ukraine launches 20 drones against Russia, including the capital, Moscow. (CNN) (Reuters) (AP)");
           break;
case 26:
           System.out.println("\nNothing significant to report");
           break;
case 27:
           System.out.println("\nNothing significant to report");
           break;
case 28:
System.out.println("Eastern Ukraine campaign Battle of Avdiivka Russian forces advance on all sides of Avdiivka in Donetsk Oblast, Ukraine as they move to encircle the city. Heavy fighting is reported for control of the Avdiivka Coke Plant. (Reuters) (The Independent)"); 
           break;
case 29:
           System.out.println("\nNothing significant to report");
           break;
case 30:
           System.out.println("Ukraine says its special forces bombed a freight train as it was passing through the Severomuysky Tunnel in Buryatia, Russia. Russia's Investigative Committee acknowledges an explosion and fire inside the tunnel, and says that a preliminary probe is underway to determine the cause. (Reuters)");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 12:
          System.out.println("1. Enter a day in December 2023:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("The International Committee of the Red Cross suspends the Belarus Red Cross after its Secretary General Dzmitry Shautsou refuses to resign following statements that the organization was involved in bringing Ukrainian children to Belarus for health improvement purposes. (AP) (Nasha Niva)");
           break;
case 2:
           System.out.println("\nNothing significant to report");
           break;
case 3:
           System.out.println("\nNothing significant to report");
           break;
case 4:
System.out.println("Eastern Ukraine campaign Battle of Marinka The British Defense Ministry reports that Russia likely controls most of Marinka in Donetsk Oblast. (Kyiv Independent via Yahoo News) Foreign involvement in the Russian invasion of Ukraine The White House says that United States Congress funds designated fo");
System.out.println("r providing aid to Ukraine would run out by the end of the year, due to opposition from members of the Republican Party, in a letter made available to the public. (Al Jazeera) The Financial Times reports that the European Union is facing difficulties in agreeing on a new aid package, due to oppositi");
System.out.println("on from Hungary. (Al Jazeera) President of Bulgaria Rumen Radev vetoes a proposed agreement to provide Ukraine with armored vehicles, returning the agreement to parliament. (Kyiv Independent) Russian generals killed during the Russian invasion of Ukraine Voronezh Oblast governor Aleksandr Gusev anno");
System.out.println("unces the death of major general Vladimir Zavadsky, deputy commander of the 14th Army Corps, at his combat post in Ukraine. (Reuters)"); 
           break;
case 5:
           System.out.println("\nNothing significant to report");
           break;
case 6:
System.out.println("Foreign involvement in the Russian invasion of Ukraine The United States Senate blocks a supplemental funding bill that included financial aid for Ukraine. (The Guardian) International sanctions during the Russian invasion of Ukraine 2022 Russian crude oil price cap sanctions Politico reports that e");
System.out.println("fforts to cap Russia's oil revenues has essentially failed, due to widespread circumvention, loopholes and the ongoing fuel business. (Politico) In October, Russia earned $11.3 billion from oil exports, exceeding the amount earned prior to the start of the war. (Bloomberg) G7 nations agree to impose");
System.out.println(" trade restrictions on non-industrial diamonds from Russia. (AFP via RFI)"); 
           break;
case 7:
           System.out.println("\nNothing significant to report");
           break;
case 8:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches 19 cruise missiles from Tu-95s at Ukrainian cities, including the capital Kyiv, killing at least one civilian in Dnipropetrovsk Oblast and injuring several others. At least 14 missiles are intercepted. (Reuters) Military aid to Ukraine");
System.out.println(" The Kiel Institute reports that pledges of aid to Ukraine have significantly decreased, reaching their lowest level since the beginning of the war. The amount of aid pledged to Ukraine has dropped by nearly 90% compared to the same period in 2022. (Al Jazeera)"); 
           break;
case 9:
           System.out.println("\nNothing significant to report");
           break;
case 10:
           System.out.println("\nNothing significant to report");
           break;
case 11:
System.out.println("Representatives of Prime Minister of Hungary Viktor Orbán meet with United States Republicans in Washington to discuss ending EU and US military support to Ukraine. (WION) The United Kingdom announces that it will donate two Royal Navy Sandown-class minehunters to Ukraine. Doubts are raised over the");
System.out.println(" logistics and timing of their arrival, with Turkey controlling access to the Black Sea through the Bosphorus. (BBC News) United States Senator JD Vance says that Ukraine should be willing to give up part of its territory to end the war. Vance and other Republicans have opposed the aid package propo");
System.out.println("sed in the United States Congress for Ukraine. (The Guardian)"); 
           break;
case 12:
           System.out.println("\nNothing significant to report");
           break;
case 13:
System.out.println("A Russian ballistic missile attack in Kyiv injures over 50 people. (The Guardian) "); 
           break;
case 14:
           System.out.println("Romania says that a Russian drone has crashed in its territory, leaving a crater in Grindu, Tulcea, near the Ukrainian border. Romanian Air Force F-16s and German Air Force Eurofighter Typhoons conducted joint patrols in response to the violation of NATO airspace. (Reuters)");
           break;
case 15:
           System.out.println("\nNothing significant to report");
           break;
case 16:
           System.out.println("Russia says that two civilians are killed and two others are injured in a Ukrainian missile strike on the Russian-occupied village of Nova Maiachka in Kherson Raion. (AFP via Al Arabiya)");
           break;
case 17:
           System.out.println("\nNothing significant to report");
           break;
case 18:
           System.out.println("\nNothing significant to report");
           break;
case 19:
           System.out.println("\nNothing significant to report");
           break;
case 20:
           System.out.println("\nNothing significant to report");
           break;
case 21:
           System.out.println("\nNothing significant to report");
           break;
case 22:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches a mass drone attack on Kyiv, Ukraine, striking multiple residential districts. A block of flats is damaged in Solomianskyi District, injuring at least two people, and heavy damage is also reported in Holosiivskyi District. (Reuters)"); 
           break;
case 23:
           System.out.println("\nNothing significant to report");
           break;
case 24:
           System.out.println("\nNothing significant to report");
           break;
case 25:
           System.out.println("\nNothing significant to report");
           break;
case 26:
System.out.println("Eastern Ukraine campaign Battle of Marinka Ukraine's commander-in-chief Valerii Zaluzhnyi confirms the loss of the city of Marinka to Russian forces. (BBC News) (The New York Times) Crimea attacks The Russian Ropucha-class landing ship Novocherkassk is destroyed by a Ukrainian airstrike in Feodosia,");
System.out.println(" Crimea, killing at least one person and injuring four others. (Al Jazeera) (AP)"); 
           break;
case 27:
System.out.println("Russian strikes against infrastructure Russian drone and artillery strikes kill at least five people and cause power outages for around 70% of households in Kherson, according to Kherson governor Oleksandr Prokudin. (AP)"); 
           break;
case 28:
System.out.println("Southern Ukraine campaign Greek-owned cargo ship Vyssos travelling to Ukraine hits a Russian naval mine in the Black Sea, injuring three crew members, Ukraine says. (BBC News) (Xinhua)"); 
           break;
case 29:
System.out.println("29 December 2023 Russian strikes on Ukraine Russia launches the largest wave of drones and missiles on Ukrainian cities since the start of the war in a widespread overnight assault across the country, killing at least 39 people and injuring at least 160 others. (AP) (Ukrainian Pravda) One of the Rus");
System.out.println("sian cruise missiles enters NATO airspace as it travels over Polish territory, prompting the Polish government to summon the Russian charge d'affaires for an explanation. (Reuters) (Bloomberg) "); 
           break;
case 30:
System.out.println("30 December 2023 Belgorod shelling Ukraine launches drone and missile strikes against the city of Belgorod, Russia, killing 25 people, and injuring 110 others, according to the Russian Defense Ministry. (AP) (BBC News) Russian invasion of Ukraine Bombing of Kharkiv Russian forces attack Kharkiv with");
System.out.println(" missiles, injuring at least 16 people, including a foreign journalist, and damaging civilian infrastructure. (The Kyiv Independent)"); 
           break;
case 31:
           System.out.println("Russian forces bombard Kharkiv. Ukrainian authorities say that 26 people were injured and many residential buildings in the city center were destroyed. The Ukrainian Air Force reports shooting down 21 of 49 attacking drones. (tagesschau.de) (tagesschau.de 2)");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;


       }
       break;
case 2024:
       //month in 2024
       
       System.out.println("1. Enter a month in 2024(1-January,2-February,....,12-December):");
       month=s.nextInt();
       switch(month){
          //day in 2024
case 1:
          System.out.println("1. Enter a day in January 2024 :");
          day=s.nextInt();
            switch(day){
case 1:
              System.out.println("Nothing significant to report ");
              break;
case 2:
System.out.println("Russian strikes against infrastructure 2 January 2024 Russian strikes on Ukraine Four civilians are killed and nearly 100 others are injured by a Russian missile attack in Kharkiv and at least 27 civilians are injured by a Russian missile attack in Kyiv. (AP)"); 
              break;
case 3:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Turkey–Ukraine relations Turkey denies access to the Black Sea for two Royal Navy minehunters saying their transit of the Bosporus and Dardanelles straits would be in violation of the Montreux Convention of 1936. (The Independent) Ukraine and R");
System.out.println("ussia complete their first prisoner exchange in nearly five months, releasing over 200 people on each side, facilitated by mediation from the United Arab Emirates. (Reuters)"); 
              break;
case 4:
              System.out.println("Russian President Vladimir Putin issues a decree granting Russian citizenship to foreigners who fight for Russia in the war against Ukraine,");
              break;
case 5:
              System.out.println("Nepal suspends the issuance of permits to its citizens to work in Russia and Ukraine after 10 Nepalis are killed while serving in the Russian Army. (Reuters)");
              break;
case 6:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian forces attack Pokrovsk Raion, Donetsk Oblast, with S-300 missiles according to local authorities, killing at least 11 people, including five children, and injuring eight others. (CNN) "); 
              break;
case 7:
              System.out.println("Nothing significant to report");
              break;
case 8:
              System.out.println("Russia launches a massive missile and drone attack across Ukraine, killing at least four people and injuring 38 others in Dnipropetrovsk, Kharkiv, Khmelnytskyi and Zaporizhzhia Oblasts. Ukraine says that it shot down all eight drones and 18 of 51 missiles. (AP) (Reuters)");
              break;
case 9:
              System.out.println("Nothing significant to report");
              break;
case 10:
              System.out.println("Nothing significant to report");
              break;
case 11:
              System.out.println("Nothing significant to report");
              break;
case 12:
System.out.println("Russian invasion of Ukraine, Ukraine–United Kingdom relations British prime minister Rishi Sunak visits Kyiv to reiterate his support for Ukraine. (The Washington Post) (GOV.UK)"); 
              break;
case 13:
              System.out.println("Nothing significant to report");
              break;
case 14:
              System.out.println("Nothing significant to report");
              break;
case 15:
System.out.println("Southern Ukraine campaign Ukraine claims it shot down a Russian Beriev A-50 airborne early warning and control aircraft and an Ilyushin Il-22 airborne control center over the Sea of Azov. (CNN)"); 
              break;
case 16:
              System.out.println("Seventeen people are injured in a Russian missile strike on a residential area in Kharkiv, Ukraine. (Reuters)");
              break;
case 17:
              System.out.println("Ukraine says that it struck an oil terminal in Saint Petersburg, Russia, with a domestic-produced long-range drone, as part of a new campaign against strategic targets inside Russian territory. However, Russia reports that the attack failed. (Reuters)");
              break;
case 18:
              System.out.println("Nothing significant to report");
              break;
case 19:
              System.out.println("Nothing significant to report");
              break;
case 20:
System.out.println("The Ust-Luga Multimodal Complex in Leningrad Oblast is hit by a drone attack, causing a large fire. Russian gas producer Novatek subsequently suspends all operations at the complex in response to the attack. Ukraine claims responsibility. (NOS) (Reuters) (Kyiv Post) Eastern Ukraine campaign\n At lea");
System.out.println("st 27 people are killed by alleged Ukrainian artillery strikes on Donetsk, according to Russian-appointed local officials. Donetsk People's Republic leader Denis Pushilin declares a day of mourning in response. Ukraine denies responsibility.(AP) (Reuters) "); 
              break;
case 21:
System.out.println("Russian invasion of Ukraine President of Ukraine Volodymyr Zelenskyy signs a decree recognizing some Russian territories, including parts of Bryansk Oblast and Krasnodar Krai, as historically inhabited by Ukrainians. (The Kyiv Independent)"); 
              break;
case 22:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Six civilians are killed and at least 77 others are injured by Russian missile strikes in Kyiv and Kharkiv. Ukraine says that it shot down 21 of 41 missiles. (AP) (BBC News) Military aid to Ukraine during the Russo-Ukrainian War Germany announc");
System.out.println("es that it will donate six SH-3 Sea King helicopters to the Ukrainian Air Force to help it patrol the Black Sea. (Reuters)"); 
              break;
case 23:
              System.out.println("Nothing significant to report");
              break;
case 24:
              System.out.println("Nothing significant to report");
              break;
case 25:
              System.out.println("Nothing significant to report");
              break;
case 26:
              System.out.println("Nothing significant to report");
              break;
case 27:
              System.out.println("Nothing significant to report");
              break;
case 28:
              System.out.println("Nothing significant to report");
              break;
case 29:
System.out.println("Russian invasion of Ukraine Russia claims control of the village of Tabaivka, but this is denied by Ukraine. (Kyiv Independent) Business and economy"); 
              break;
case 30:
System.out.println("Eastern Ukraine campaign Ukrainian forces say that they shot down a Russian Su-34 fighter jet over Luhansk Oblast. (Kyiv Post) "); 
              break;
case 31:
System.out.println("The Ukrainian Air Force launches a wave of Storm Shadow cruise missile strikes on Russian military infrastructure in Crimea, with explosions reported near Sevastopol International Airport. Russia says it shot down 20 Ukrainian missiles over the Black Sea. (The Telegraph) Russia and Ukraine conduct a");
System.out.println(" prisoner exchange on the border, with 195 soldiers being returned to Russia, and 207 military personnel and civilians being returned to Ukraine, respectively. The deal was facilitated by the United Arab Emirates. (BBC News)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
                       }
                       break;
case 2:
          System.out.println("1. Enter a day in February 2024 :");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Ukrainian unmanned surface vehicles sink the Tarantul-class missile corvette RFS Ivanovets in Donuzlav Bay. (BBC News) Southern Ukraine campaign Two French aid workers are killed in a Russian drone strike near Beryslav in Kherson Oblast, Ukraine. Four people are also injured in the strike. (BBC News");
System.out.println(") Business and economy  Humanitarian aid to Ukraine during the Russo-Ukrainian War, Ukraine–European Union relations The European Union formally approves a €50 billion financial support package for Ukraine after Hungary withdraws its veto. The package is expected to help the Ukrainian government cov");
System.out.println("er some costs of pensions and salaries over the next four years with the first funds being released in March. (BBC News) (The Economist)"); 
              break;
case 2:
              System.out.println("Nothing significant to report");
              break;
case 3:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A Lukoil oil refinery in Volgograd Oblast, Russia, is attacked by Ukrainian long-range drones, causing a large fire and disrupting operations. Volgograd governor Andrey Bocharov says that the attack was repelled by air defences. (Kyiv Post) Ea");
System.out.println("stern Ukraine campaign \nAt least 28 civilians are killed by Ukrainian shelling in Russian-occupied Lysychansk, Luhansk Oblast, according to Russian-appointed local officials. The officials added that ten others were rescued after being trapped under rubble. (AP)"); 
              break;
case 4:
              System.out.println("Nothing significant to report");
              break;
case 5:
              System.out.println("Hungary's ruling party Fidesz boycotts a National Assembly session called by opposition parties to speed up the approval of Sweden's NATO membership bid. (Politico)");
              break;
case 6:
              System.out.println("Nothing significant to report");
              break;
case 7:
              System.out.println("Russian forces launch a wave of missile and drone strikes across Ukraine, killing at least five civilians and injuring 11 others, including two in Kyiv. (BBC News)");
              break;
case 8:
System.out.println("Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy dismisses Valerii Zaluzhnyi from the post of Commander-in-Chief of the Armed Forces of Ukraine, following months of rumors about a disagreement between Zelenskyy and Zaluzhnyi. Ground Forces commander Oleksandr Syrskyi is appointed ");
System.out.println("Commander-in-Chief to replace Zaluzhnyi. (BBC News)"); 
              break;
case 9:
              System.out.println("Nothing significant to report");
              break;
case 10:
              System.out.println("Nothing significant to report");
              break;
case 11:
              System.out.println("Nothing significant to report");
              break;
case 12:
              System.out.println("Nothing significant to report");
              break;
case 13:
System.out.println("Estonia–Russia relations Estonian Prime Minister Kaja Kallas is reportedly placed on the Russian Interior Ministry's register of wanted people due to the country's removal of Soviet war memorials, making Kallas the first known government leader to be added to a wanted list by Russian authorities. (T");
System.out.println("he Guardian)"); 
              break;
case 14:
System.out.println("Crimea attacks Ukraine claims to have sunk the Russian ship Tsezar Kunikov off the coast of Katsiveli, Crimea. A video appears to show the vessel being struck with unmanned surface drones. (RFE/RL)"); 
              break;
case 15:
System.out.println("The Kremlin dismisses a warning by the United States that Russia intends to imminently place nuclear weapons in space as a 'malicious fabrication'. The claims were widely circulated yesterday by ABC News and the New York Times after U.S. House Speaker Mike Johnson warned of a 'serious national secur");
System.out.println("ity threat'. (Reuters) (Reuters 2) Reuters reports that it is highly unlikely that Russia intends to put a nuclear warhead in space. The antisatellite weapon is more likely a nuclear-powered space-based device that utilizes electronic warfare to blind, jam or fry the electronics inside targets. (Reu");
System.out.println("ters)"); 
              break;
case 16:
System.out.println("Battle of Avdiivka Ukraine announces the withdrawal of its troops from positions in the south of Avdiivka amid heavy clashes with Russian forces for control of the city. The withdrawal comes a day after Russian soldiers entered the city from multiple directions. (Kyiv Post)"); 
              break;
case 17:
System.out.println("Battle of Avdiivka Commander-in-Chief Oleksandr Syrskyi announces the full withdrawal of Ukrainian forces from Avdiivka, following months of heavy fighting and Russian attempts to capture the city. (The Kyiv Independent)"); 
              break;
case 18:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Prime Minister of Denmark Mette Frederiksen announces that the country will donate all of its artillery shells to Ukraine. (The Telegraph)"); 
              break;
case 19:
              System.out.println("Nothing significant to report");
              break;
case 20:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Sweden donates its largest military aid package to Ukraine to date with a further $680 million in aid. (Reuters)"); 
              break;
case 21:
              System.out.println("Nothing significant to report");
              
              break;
case 22:
              System.out.println("Nothing significant to report");
              break;
case 23:
System.out.println("Ukraine claims responsibility for the downing of a Russian Beriev A-50 over Krasnodar Krai, Russia, which is their second downing of an A-50 this year. (Kyiv Independent) (Business Insider) "); 
              break;
case 24:
              System.out.println("Nothing significant to report");
              break;
case 25:
              System.out.println("Nothing significant to report");

              break;
case 26:
              System.out.println("The Hungarian parliament approves Sweden's accession into NATO. (BBC News)");
              break;
case 27:
System.out.println("Eastern Ukraine campaign The Ukrainian military withdraws from the villages of Sieverne and Stepove near Avdiivka, Donetsk Oblast, following the announcement of its withdrawal from the nearby village of Lastochkyne on February 26. (Reuters)"); 
              break;
case 28:
              System.out.println("Russia announces that it will take retaliatory military-technical steps in response to Sweden joining NATO. (Al Arabiya)");
              break;
case 29:
              System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 29:");
          }
          break;
case 3:
          System.out.println("1. Enter a day in March:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
System.out.println("Russian invasion of Ukraine Bombing of Odesa Eight people, including two children, are killed and eight others are injured in a Russian drone strike on an apartment block in Odesa, Ukraine. (Ukrinform)"); 
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("Russian invasion of Ukraine The Russian Navy patrol ship Sergey Kotov is sunk in the Black Sea after being struck by Ukrainian MAGURA V5 naval drones. (The Guardian)\nThe International Criminal Court issues arrest warrants for Sergey Kobylash, the commander of the Long-Range Aviation of the Russian ");
System.out.println("Aerospace Forces, and Viktor Sokolov, the commander of the Black Sea Fleet, for their involvement in Russian strikes against Ukrainian infrastructure. (Reuters)"); 
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("Sweden–NATO relations Sweden officially joins NATO, becoming its 32nd member. (Reuters) (NATO) Lithuania–Russia relations Lithuania strips Russian ballerina Ilze Liepa of her Lithuanian citizenship after she openly shows her sympathies for President Vladimir Putin. (The Moscow Times) Ukraine–United ");
System.out.println("Kingdom relations Former Ukrainian Chief of Staff Valerii Zaluzhnyi is appointed Ukrainian ambassador to the United Kingdom by President Volodymyr Zelenskyy. (Reuters)"); 
           break;
case 8:
           System.out.println("Nothing significant to report");
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
           System.out.println("Nothing significant to report");
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
System.out.println("The Freedom of Russia Legion, the Sibir Battalion, and the Russian Volunteer Corps enter Belgorod and Kursk oblasts. Russia claims to have repelled the attacks. (The Guardian) Ukraine launches 25 drones at Russian cities, hitting a major oil refinery in Nizhny Novgorod Oblast. (The Guardian) 2024 Iv");
System.out.println("anovo Ilyushin Il-76 crash A Russian Aerospace Forces Ilyushin Il-76 military transport plane with 15 people on board crashes in Ivanovo Oblast, Russia. (The Guardian) Bombing of Kryvyi Rih Three people are killed and at least 36 others are injured in a Russian missile strike on apartment buildings ");
System.out.println("in Kryvyi Rih, Dnipropetrovsk Oblast, Ukraine. (Reuters)"); 
           break;
case 13:
System.out.println("Ukraine launches a wave of drone strikes in Russia for a second consecutive day, causing a fire at a Rosneft oil refinery in Ryazan Oblast, while a Ukrainian drone is reportedly shot down near Kirishi refinery in Leningrad Oblast. Russian President Vladimir Putin says the attacks are an attempt to d");
System.out.println("isrupt the upcoming presidential election. (Reuters) Attacks on civilians in the Russian invasion of Ukraine Two people are killed and at least eight others are injured in a Russian drone attack on an apartment building in Sumy. (The Kyiv Independent) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an War The European Union agrees to provide an additional €5 billion to their Ukrainian military aid fund. (Reuters) "); 
           break;
case 14:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A civilian is killed and three others are injured by airstrikes launched by Ukraine in Belgorod Oblast, Russia. (TASS) Zaporizhzhia Nuclear Power Plant crisis Russian-installed officials at the Zaporizhzhia Nuclear Power Plant in Enerhodar, Uk");
System.out.println("raine, say that shelling has hit critical infrastructure at the plant and that 'such attacks are unacceptable'. (Reuters)"); 
           break;
case 15:
System.out.println("Odesa strikes At least 20 people are killed and at least 73 others are injured in a Russian double tap missile strike in Odesa, Ukraine. (CNN)\n2024 Russian presidential election Voters elect the next president of Russia. Incumbent president Vladimir Putin is seeking a fifth term in office. (TASS)"); 
           break;
case 16:
System.out.println("Russian invasion of Ukraine Attacks in Russia during the Russian invasion of Ukraine Russia says that two civilians have been killed by Ukrainian shelling in the city of Belgorod. (AP)"); 
           break;
case 17:
System.out.println("Northern Ukraine skirmishes Ukraine says that three Russian sabotage groups have been intercepted in Sumy Oblast. (The Kyiv Independent)"); 
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
System.out.println("Russia claims to have captured the village of Orlivka in Donetsk Oblast, Ukraine. (Anadolu Agency) "); 
           break;
case 20:
System.out.println("Kharkiv strikes A Russian missile strike kills at least five people and injures eight others in an industrial area of Kharkiv, Ukraine. (Reuters) "); 
           break;
case 21:
System.out.println("The Russian Ministry of Defence announces that its forces have captured the Ukrainian village of Tonenke in Donetsk Oblast. (Al Arabiya) Kyiv strikes Russia launches a massive attack on Kyiv and the surrounding region with ballistic and cruise missiles, injuring at least 17 people. (CNN) Mykolaiv st");
System.out.println("rikes At least one civilian is killed and four others are injured in a Russian ballistic missile attack on Mykolaiv, Ukraine. (Reuters)"); 
           break;
case 22:
System.out.println("March 2024 Ukraine missile strikes Russia launches dozens of ballistic missiles at Ukrainian cities for a second consecutive day with reports of power outages in Kharkiv after critical infrastructure was damaged. At least eight missile strikes on Zaporizhzhia are reported, while a 'critical infrastr");
System.out.println("ucture object' is damaged in Vinnytsia. More than a million people are left without power across Ukraine due to the strikes, with five people killed and dozens more reportedly injured. (BBC News) (U.S. News & World Report) The Dnieper Hydroelectric Station in Zaporizhzhia is hit by a missile causing");
System.out.println(" extensive damage and a large fire. A trolleybus initially reported as carrying civilians was destroyed in the attack, later confirmed to have been empty apart from the driver who was killed. Shelling also damages one of the two power lines connected to the Russian-occupied Zaporizhzhia Nuclear Powe");
System.out.println("r Plant. (The Guardian) (The Kyiv Independent) The Russian government states in a press conference that the invasion of Ukraine is now a war and is no longer a 'special military operation', the official term used for the war by the Russian government. In another press conference later in the day, Kr");
System.out.println("emlin Press Secretary Dmitry Peskov tells reporters that although the invasion is a de facto war, the Russian government is not currently planning to change the invasion's de jure status as a special military operation. (NOS) (Reuters) (Meduza) Crocus City Hall attack At least 135 people, including ");
System.out.println("two attackers, are killed and more than 140 others are injured in a mass shooting at the Crocus City Hall music venue in Krasnogorsk, Moscow Oblast, Russia, with the building subsequently catching on fire following an explosion. The perpetrators remain at large after escaping in a vehicle. (Baza) (M");
System.out.println("eduza) (Baza 2) (Reuters) The Islamic State claims responsibility for the attack in a statement issued by its official Amaq News Agency. (CNN) The Freedom of Russia Legion claims that the Russian government committed the attack. (Ukrainska Pravda) The Russian government claims that the Ukrainian gov");
System.out.println("ernment committed the attack. This was denied by them, who instead claim that the attack was a false flag attack by the Russian government designed to provoke public opinion in Russia against Ukraine and allow the Russian Army to mobilize more troops in its invasion of Ukraine. (Anadolu Agency)"); 
           break;
case 23:
System.out.println("Crimea attacks The Ukrainian Air Force launches a wave of airstrikes across Crimea, with several explosions reported in Sevastopol. Russian officials say at least ten missiles have been shot down over the peninsula, and that at least two civilians have been injured. (NDTV) Eastern Ukraine campaign T");
System.out.println("he Russian military states that it has captured the town of Ivanivske in Donetsk Oblast, Ukraine. (Barron's) Crocus City Hall attack The death toll from yesterday's terrorist attack at the Crocus City Hall music venue in Krasnogorsk, Moscow Oblast, Russia, increases to at least 137 people. Russian a");
System.out.println("uthorities report that 11 suspects, including the four assailants, have been arrested. (Reuters) (The Moscow Times) Red Sea crisis A Houthi missile hits Panamanian-flagged, Chinese-owned and operated oil tanker Huang Pu. It suffers minimal damage and a fire on board is quickly extinguished. No casua");
System.out.println("lties are reported, and the vessel resumes its course. (X) (Newsweek) (Marine Log) "); 
           break;
case 24:
System.out.println("A Russian cruise missile violates NATO airspace over Poland, prompting the activation of aircraft from the Polish Air Force. (Reuters) (Sky News) Russian strikes against Ukrainian infrastructure Russia launches major airstrikes on Kyiv and Lviv in Western Ukraine using Kinzhal hypersonic missiles an");
System.out.println("d drones with strikes damaging ground level infrastructure at Ukraine's main gas storage site. (Reuters)"); 
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
System.out.println("Bombing of Kharkiv One person is killed, and sixteen others are injured, by Russian guided bomb strikes on Kharkiv, Ukraine. (Reuters)"); 
           break;
case 28:
           System.out.println("A Russian Sukhoi Su-35 crashes into the Black Sea off Sevastopol, Crimea. The pilot is reported to have safely ejected. (Reuters)");
           break;
case 29:
System.out.println("Eastern Ukraine campaign The Telegraph reports Russia has captured approximately 195 square miles (510 km2) and is taking around 1,000 casualties per day since the start of the Second Russian winter campaign in October 2023. (The Telegraph) Russia strikes several power plants in Ukraine. (The Washin");
System.out.println("gton Post)"); 
           break;
case 30:
           System.out.println("Nothing significant to report");
           break;
case 31:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 4:
          System.out.println("1. Enter a day in April 2024:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches airstrikes more than 1,000 kilometres (620 mi) inside Russia, targeting an oil refinery and the dormitory of a factory producing Iranian-designed Shahed drones in Yelabuga, Tatarstan. Several people are injured. (The Guardian)");
System.out.println(" (Al Jazeera)"); 
           break;
case 3:
           System.out.println("Ukraine lowers the age of conscription from 27 years to 25. (The Guardian) (The New York Times)");
           break;
case 4:
System.out.println("Kharkiv strikes Russia launches multiple Shahed drone strikes on Kharkiv, Ukraine, killing at least five people, including three rescue workers, and injuring five others. (Reuters) Russian appointed officials claim that Ukrainian shelling has killed two civilians and injured nine others in Donetsk. ");
System.out.println("Separately, four people are killed in drone attacks in Russian-occupied Kherson Oblast. (Reuters) U.S Secretary of State Antony Blinken says that Ukraine will eventually become a NATO member. (Reuters)"); 
           break;
case 5:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Doctors Without Borders office in Pokrovsk is completely destroyed by a Russian missile strike. Five civilians are injured in the attack. (The Guardian) Attacks in Russia during the Russian invasion of Ukraine Ukraine's SBU claims to have des");
System.out.println("troyed six Russian military aircraft and heavily damaged eight others in a drone attack on Morozovsk Air Base in Rostov Oblast. (Reuters) (NOS) Zaporizhzhia strikes At least three people are killed and at least 13 others are injured in a Russian double-tap missile strike in Zaporizhzhia. (The Kyiv I");
System.out.println("ndependent) (Reuters)"); 
           break;
case 6:
System.out.println("Kharkiv strikes A Russian drone strike on Kharkiv kills eight civilians and injures ten others. At least nine high-rise buildings and a petrol station are badly damaged. (Al Jazeera) (Reuters)"); 
           break;
case 7:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis The IAEA reports that the Zaporizhzhia Nuclear Power Plant's Unit 6 was targeted by a drone strike, although nuclear safety has not been compromised, according to the statement. (IAEA)"); 
           break;
case 8:
System.out.println("Battle of Chasiv Yar Heavy fighting between Russian and Ukrainian troops occurs around the city of Chasiv Yar, with Ukraine describing the situation as difficult and tense. (Al Jazeera) Shelling kills three civilians in Huliaipole, Zaporizhzhia Oblast. (Al Jazeera) Ukraine claims to have damaged the");
System.out.println(" Russian Navy missile ship Serpukhov in the Baltic Sea near Kaliningrad. (Kyiv Independent)"); 
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
System.out.println("Kharkiv strikes Russian airstrikes in Kharkiv Oblast kill at least three people and injure four others. (Reuters) Odesa strikes Four people are killed and seven others are injured in a Russian missile strike in Odesa. (Reuters)"); 
           break;
case 11:
System.out.println("Mykolaiv strikes At least four people are killed and five others are injured in a Russian missile strike in Mykolaiv. (Reuters) Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, damaging power facilities and causing widespread power outages fo");
System.out.println("r about 200,000 people. Ukraine says that the Trypilska thermal power plant in Kyiv Oblast was destroyed in an overnight attack. (Reuters) (Bloomberg)"); 
           break;
case 12:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches drone strikes across Ukraine. Critical infrastructure is damaged in Kherson Oblast and a fire occurs at the Dnieper Hydroelectric Station in Zaporizhzhia causing around half a tonne of oil products to leak into the Dnieper river. (Reut");
System.out.println("ers) (Ukrainska Pravda)"); 
           break;
case 13:
System.out.println("Russian invasion of Ukraine The Russian Ministry of Defense claims that the village of Pervomaiske near Donetsk has been captured by Russian troops. (Barron's)"); 
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
           System.out.println("Ukrainian President Volodymyr Zelenskyy signs a new army draft law. (Reuters)");
           break;
case 17:
           System.out.println("18 people are killed and 78 others are injured in a Russian missile strike which damaged an eight-storey building in a densely populated area of Chernihiv. (BBC News) (Reuters)");
           break;
case 18:
System.out.println("Foreign involvement in the Russian invasion of Ukraine Germany arrests two German-Russian nationals for an alleged military sabotage plot on behalf of Russia to undermine military support for Ukraine. (Reuters)"); 
           break;
case 19:
System.out.println("Russian strikes against Ukrainian infrastructure Russian missile strikes kill seven civilians in Dnipropetrovsk Oblast, including five in Synelnykove and two in Dnipro, with several others critically injured. (BBC News) A Russian Air Force Tupolev Tu-22M3 aircraft is shot down in Russian airspace ov");
System.out.println("er Stavropol Krai after launching missiles at targets in Ukraine. (BBC News)"); 
           break;
case 20:
           System.out.println("The Governor of Smolensk Oblast, Russia, says that a Ukrainian drone attack caused a fire at a fuel depot in Kardymovsky. (Reuters)\nThe U.S. House of Representatives passes a series of bills that would provide $95 billion in military aid to countries including Ukraine, Israel, and Taiwan. (ABC News");
System.out.println(")");
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
System.out.println("Eastern Ukraine campaign The Russian Ministry of Defence claims control over the village of Novomykhailivka in Donetsk Oblast. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom announces its largest ever military support package for the Ukrainian military, pledging ");
System.out.println("400 vehicles, including 162 MXT-MVs, 60 boats, 1,600 air defence missiles, 4 million rounds of firearm ammunition, and an additional £500 million in funding. (The Guardian) Russian strikes against Ukrainian infrastructure Russia strikes the Kharkiv TV Tower with a Kh-59 cruise missile, causing the u");
System.out.println("pper half of the tower to collapse and disrupting the broadcasting signal in Kharkiv, Ukraine. (Reuters)"); 
           break;
case 23:
           System.out.println("Nothing significant to report");
           break;
case 24:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War The United States announces a $61 billion aid package for Ukraine as part of a bill that was recently approved after being stalled in the US Congress for months. The package includes ammunition for artillery and air defense systems, along with a");
System.out.println("rmoured fighting vehicles. (CNN)"); 
           break;
case 25:
           System.out.println("Russian Deputy Foreign Minister Sergei Ryabkov warns that Russia will make NATO nuclear weapons in Poland one of its primary targets if they are deployed there. (The Jerusalem Post)");
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
System.out.println("Ukraine says that it attacked two oil refineries and an airfield in Krasnodar Krai, Russia, using drones. (Al Arabiya) (Reuters) Russian strikes against Ukrainian infrastructure Russian missiles strike Ukrainian power plants and natural gas storage facilities in Lviv, Ivano-Frankivsk, and Dnipropetr");
System.out.println("ovsk Oblasts. (Reuters) (Reuters)"); 
           break;
case 28:
           System.out.println("Ukraine withdraws from the villages of Berdychi, Semenivka, and Novomykhailivka in Donetsk Oblast. (Reuters)");
           break;
case 29:
System.out.println("Four people are killed and 28 others are injured in a Russian missile strike in Odesa. Ukraine says that Russia used an Iskander-M ballistic missile with a cluster warhead in the attack. (Reuters) "); 
           break;
case 30:
           System.out.println("Russian forces strike Kharkiv with guided bombs, killing at least two people and injuring six others. (Reuters)");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 5:
          System.out.println("1. Enter a day in May 2024:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Odesa strikes Two Russian ballistic missiles strike the port city of Odesa, killing three people and injuring sixteen others. (Reuters) (Reuters 2) (Kyiv Post)\n Russia displays captured NATO military vehicles and equipment at an open-air exhibition in Victory Park on Poklonnaya Hill in Moscow. Amon");
System.out.println("g the captured vehicles are a German Leopard 2 tank and an American M1 Abrams tank. (BBC News) (Fox News)"); 
           break;
case 2:
System.out.println("Russian forces take control of the village of Berdychi in Donetsk Oblast. (Al-Arabiya News)\n At least nine people, including eight children, are injured in a Russian guided airstrike in Derhachi, Kharkiv Oblast. (AFP via Barron's) (Reuters)"); 
           break;
case 3:
System.out.println("Two people are killed and two others are injured by Russian shelling in the city of Kurakhove in the Donetsk oblast. (The Moscow Times) British Foreign Secretary David Cameron promises £3 billion of annual military aid to Ukraine for as long as it takes. (Reuters)"); 
           break;
case 4:
           System.out.println("Two people are killed and six others are injured in Russian overnight drone strikes on the Kharkiv and Dnipro regions of Ukraine. (Reuters) (VOA)");
           break;
case 5:
           System.out.println("A woman is killed and 17 other people are injured in Russian attacks on Kharkiv, Ukraine. (Reuters)");
           break;
case 6:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Six people are killed and 35 others are injured in Ukrainian drone attacks in Belgorod Oblast, Russia. (The Moscow Times)"); 
           break;
case 7:
System.out.println("Assassination attempts on Volodymyr Zelenskyy The Security Service of Ukraine says that it detained two Ukrainian government protection unit colonels recruited by Russia's Federal Security Service who were planning an assassination of President Volodymyr Zelenskyy and other top Ukrainian officials. ");
System.out.println("(Reuters) Ukrainian forces launch a missile strike on an oil terminal in Luhansk, causing a large fire and injuring at least five workers. (Reuters)"); 
           break;
case 8:
System.out.println("Russia launches missile and drone strikes across Ukraine, injuring three people and damaging critical infrastructure. Ukraine says that it shot down 39 of 55 missiles and 20 of 21 drones. (AP) (Bloomberg News) Kharkiv strikes At least seven people, including four children, are injured in a Russian a");
System.out.println("irstrike on Kharkiv. (Reuters) Russia occupies the villages of Novokalynove in Donetsk Oblast and Kyslivka in Kharkiv Oblast. (Anadolu Agency)"); 
           break;
case 9:
System.out.println("Assassination attempts on Volodymyr Zelenskyy Ukrainian President Volodymyr Zelenskyy fires the head of the state guards Serhiy Rud after allegations that two members of the guards were involved in an assassination plot against Zelenskyy. (Al Jazeera) (Reuters)"); 
           break;
case 10:
System.out.println("2024 Kharkiv offensive Russian forces launch an attack on Ukraine's Kharkiv Oblast, near the town of Vovchansk, opening up a new front. (Reuters) A Ukrainian strike against oil infrastructure kills three in Luhansk. (Reuters)"); 
           break;
case 11:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Three people are killed in a Ukrainian strike in Donetsk. Separately, two people are killed in Ukrainian strikes in Belgorod and Kursk. (Reuters)"); 
           break;
case 12:
System.out.println("2024 Kharkiv offensive The Russian Defence Ministry states that its forces have captured several villages in Kharkiv Oblast. (CNN) May 2024 Belgorod missile strike At least 17 civilians are killed and 30 others are injured when a missile hit an apartment block in Belgorod, Russia. (AP) (Reuters) Pre");
System.out.println("sident of Russia Vladimir Putin reassigns Defence Minister Sergei Shoigu to the National Security Council and replaces him with Deputy Prime Minister Andrey Belousov. (The Washington Post)"); 
           break;
case 13:
           System.out.println("Russia claims that its troops have entered the town of Vovchansk, 74 kilometres (46 mi) from Kharkiv. (BBC News)");
           break;
case 14:
System.out.println("2024 Kharkiv offensive, Kharkiv strikes At least 20 people are injured when Russian airstrikes hit a residential building in Kharkiv, Ukraine. (Reuters) Ukraine pulls back from positions near Lukyantsi and Vovchansk in Kharkiv Oblast. (Reuters) "); 
           break;
case 15:
System.out.println("Southern Ukraine campaign, 2024 Kharkiv offensive Russia says its forces have captured the village of Robotyne in Zaporizhzhia Oblast, and several more villages in Kharkiv Oblast. Ukraine confirms it has pulled back its troops from Vovchansk to preserve the lives of our servicemen and avoid losses. ");
System.out.println("(BBC News)"); 
           break;
case 16:
           System.out.println("United States Secretary of State Antony Blinken announces a $2 billion military aid package for Ukraine, aimed at investing in Ukraine's industrial base. (Al Jazeera)");
           break;
case 17:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches a massive drone attack across southwestern Russia, causing fires at several oil refineries, including at the port of Novorossiysk. (The New York Times) Kharkiv strikes At least three civilians are killed and 28 others are inju");
System.out.println("red by Russian guided bombs in Kharkiv. (Reuters)"); 
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
           System.out.println("At least six people are killed and 27 others are injured in a Russian double tap missile strike on a recreation area near Kharkiv. Separately, five people are killed and nine others are injured in a Russian strike using a multiple launch rocket system on two villages in Kupiansk Raion, Kharkiv Oblas");
System.out.println("t. (Reuters)");
           break;
case 20:
           System.out.println("A court in Novosibirsk, Russia, sentences a 24-year-old man to 25 years in prison for allegedly plotting an arson attack on a military recruitment office with alleged directions from Ukraine. (Al Jazeera)");
           break;
case 21:
           System.out.println("A court in Saint Petersburg, Russia, sentences Anatoly Maslov, a 77-year-old hypersonic missiles expert, to 14 years in prison for state treason. (Reuters)");
           break;
case 22:
System.out.println("Eastern Ukraine campaign Russia captures the village of Klishchiivka in Donetsk Oblast, Ukraine. (Al Jazeera) At least two people are killed and four are injured by Ukrainian shelling in Lysychansk, Luhansk Oblast, Ukraine. (Al Jazeera) Military aid to Ukraine during the Russo-Ukrainian War Sweden a");
System.out.println("nnounces US$7 billion in military aid to Ukraine from 2024 to 2026. (Bloomberg) Russia returns six Ukrainian children displaced by the war back to Ukraine, in a deal brokered by Qatar. (Al Jazeera)"); 
           break;
case 23:
System.out.println("2024 Kharkiv offensive Seven people are killed and at least 28 others are injured in Russian missile strikes in Liubotyn and Kharkiv, Ukraine. (Reuters) Crimea attacks At least two people are killed in a Ukrainian missile strike on Alushta, Crimea. Explosions are reported across the peninsula and Uk");
System.out.println("rainian media reports that multiple targets were hit. (Reuters) Eastern Ukraine campaign Russian forces captures the village of Andriivka in Donetsk Oblast. (The Daily Telegraph)"); 
           break;
case 24:
System.out.println("Sources claim that Russian President Vladimir Putin is interested in negotiating a ceasefire, which would freeze the conflict at the current frontlines. (Reuters) The European Union makes a decision allowing Ukraine to use interest funds from frozen Russian bank accounts, totaling €2.5 billion ($2.7");
System.out.println(" billion) per year. (Al Jazeera)"); 
           break;
case 25:
System.out.println("Eastern Ukraine campaign Russia captures the village of Arkhanhelske in Donetsk Oblast. (The Moscow Times) Kharkiv strikes At least fourteen people are killed and 58 others are injured in Russian strikes on a hardware store and residential area in Kharkiv, Ukraine. (The Kyiv Independent) (Reuters)"); 
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Prime Minister of Spain Pedro Sánchez signs a bilateral security pact with Ukrainian President Volodymyr Zelenskyy and pledges €1 billion (US$1.1 billion) of military aid to Ukraine. (Al Jazeera) Russia captures the villages of Netailove in Done");
System.out.println("tsk Oblast and Ivanivka in Kharkiv Oblast. (Arab News)"); 
           break;
case 28:
System.out.println("Eastern Ukraine campaign Russian guided bombs hit a block of apartments in Toretsk, Donetsk Oblast, killing at least two civilians and injuring six others. (Reuters)"); 
           break;
case 29:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations, Ukraine–NATO relations Sweden announces a package of $1.23 billion in military aid to Ukraine, the largest given by Sweden so far. (AP) France and Germany announce that French and German weapons sent to Ukraine, including");
System.out.println(" long-range missiles, are permitted to target bases inside Russia. (CNN) The Polish Defence Ministry says it has given Ukraine permission to use Polish-supplied weapons to strike targets inside Russian territory. (Babel)"); 
           break;
case 30:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations 2024 Kharkiv offensive The United States gives Ukraine permission to strike Russian territory near Kharkiv Oblast with U.S.-supplied weapons, but not with long-range missiles. (Politico) (CNN) Danish Foreign Minister Lars ");
System.out.println("Løkke Rasmussen says Denmark has approved Ukrainian airstrikes on Russian territory using Danish-supplied F-16 jets. (The Moscow Times) "); 
           break;
case 31:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches missile and drone strikes across Krasnodar Krai, Russia, injuring two people and damaging several oil refineries. (Reuters) Kharkiv strikes At least three people are killed and 16 others are injured when Russian missiles hit c");
System.out.println("ivilian infrastructure in Kharkiv. (Reuters) Treatment of prisoners of war in the Russian invasion of Ukraine Ukraine and Russia announce their first exchange of prisoners of war in nearly four months, with 150 people freed following negotiations mediated by the United Arab Emirates. (Reuters)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 6:
          System.out.println("1. Enter a day in June 2024:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, injuring at least four people and damaging critical infrastructure, including energy facilities. Ukraine says that it shot down 35 of 53 missiles and 46 of 47 drones. (Reuters)"); 
           break;
case 2:
System.out.println("Russia–NATO relations, Russia–United States relations Russia accuses NATO and the United States of 'provoking a new level of tension' after some allies agreed to let Ukraine's military use Western-supplied weapons to strike targets inside Russia. (BBC News) "); 
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Russian Foreign Minister Sergey Lavrov warns that French military instructors will be legitimate targets if they are deployed to Ukraine. (France 24)");
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
           System.out.println("President of France Emmanuel Macron announces that the country will send Dassault Mirage 2000-5 fighter aircraft to Ukraine and train its pilots by the end of 2024. (The Telegraph)");
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
           System.out.println("Nothing significant to report");
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
System.out.println("Crimea attacks Ukraine's military says that its missile strikes near Yevpatoriya and Chornomorske in Russian-occupied Crimea damaged three Russian air defense systems. (Reuters) Eastern Ukraine campaign The Russian Defence Ministry says that its forces have recaptured the village of Staromaiorske in");
System.out.println(" Donetsk Oblast. (Fakti) (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The United States lifts a ban on sending U.S. weaponry to Ukraine's Azov Brigade. (The Washington Post)"); 
           break;
case 11:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War, Ukraine–European Union relations, Ukraine–United States relations European Commission President Ursula von der Leyen announces that the European Union will give Ukraine €3.4 billion (USD$3.6 billion) throughout the summer from Russian frozen as");
System.out.println("sets revenue. (The Kyiv Independent) The United States approves a move to send a second Patriot missile system to Ukraine. (AP) Belarus–Russia relations Russia and Belarus begin the second stage of their tactical nuclear weapons drills. (The Independent) Russia says that it has captured the villages");
System.out.println(" of Tymkivka in Kharkiv Oblast and Miasozharivka in Luhansk Oblast. (Barron's via AFP) "); 
           break;
case 12:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, India–Russia relations Two Indians recruited by the Russian army are killed in Ukraine with the Indian foreign ministry urging Moscow to quickly return all Indian nationals who are serving in the Russian army. (BBC News) Kryvyi Rih strikes Nine");
System.out.println(" people are killed and 26 others are injured in a Russian airstrike on Kryvyi Rih. (Reuters) (NDTV) Kyiv strikes Russia launches a wave of cruise missiles and drone attacks at Kyiv. Ukraine claims to have intercepted all missiles and drones, although debris did cause some damage to infrastructure. (");
System.out.println("Reuters)"); 
           break;
case 13:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War Leaders at the G7 summit agree to loan Ukraine US$50 billion and use interest from Russia's frozen central bank assets as collateral for the loan. (AP) United States and the Russian invasion of Ukraine U.S. President Joe Biden and Ukrainian Pres");
System.out.println("ident Volodymyr Zelenskyy sign a ten-year security agreement to strengthen Ukraine's defensive capabilities. (AP)"); 
           break;
case 14:
System.out.println("International sanctions during the Russian invasion of Ukraine Germany vetoes a European Union sanction package that would prevent EU members from re-exporting Russian liquefied natural gas from EU ports and prevent EU companies from selling sanctioned products to Russia. (The Kyiv Independent) Peac");
System.out.println("e negotiations in the Russian invasion of Ukraine Russian President Vladimir Putin announces that he is ready for a ceasefire if Ukraine withdraws from Russian-claimed territories, including liberated areas, and stops its accession to NATO. However, Ukraine rejects the offer. (AP) "); 
           break;
case 15:
System.out.println("Eastern Ukraine campaign Three people are killed and five others are injured in a Russian cluster munition strike on the village of Ulakly in Donetsk Oblast. (The Kyiv Independent) Humanitarian aid to Ukraine during the Russo-Ukrainian War The United States announces a $1.5 billion aid package to Uk");
System.out.println("raine, focused primarily on the country's energy industry and humanitarian assistance. (Politico) June 2024 Ukraine peace summit World leaders meet at the Bürgenstock Resort in Switzerland to advance the Ukrainian peace process. (The Guardian)"); 
           break;
case 16:
System.out.println("Norway announces that it will give Ukraine 1.1 billion kroner (US$103 million) to help repair its energy infrastructure and secure the country's electricity supply before the winter. (Le Monde) Peace negotiations in the Russian invasion of Ukraine The two-day Global Peace Summit, dedicated to the di");
System.out.println("scussion of 'Ukraine's Peace Formula', ends at the Bürgenstock Resort in Switzerland. (CNN) Russia claims that it captured the village of Zahirne in Zaporizhzhia Oblast, Ukraine. (Barron's)"); 
           break;
case 17:
           System.out.println("Russian President Vladimir Putin announces that he will visit North Korea this week, the first state visit by a Russian President in 24 years. (Al Jazeera)");
           break;
case 18:
           System.out.println("Ukraine experiences rolling blackouts due to Russian attacks on power plants across the country. (Al Jazeera)");
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
System.out.println("United States and the Russian invasion of Ukraine Ukraine is prioritized first among the countries to receive ordered deliveries of MIM-104 Patriot missile systems from the United States. (CNN) United States officials announce that they will allow Ukraine to use US weapons to strike Russian forces w");
System.out.println("ithin Russia, provided they are located right across the border with Ukraine, removing the prior limit of only allowing strikes across the Kharkiv front. (Politico) Eastern Ukraine campaign Three people are killed and four others are injured in Russian cluster munitions strikes on the village of Roz");
System.out.println("kishne, Donetsk Oblast, Ukraine. (Al Jazeera)"); 
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
System.out.println("Kharkiv strikes At least three people are killed and 38 others are injured when Russian guided bombs hit civilian infrastructure in Kharkiv, Ukraine. (The Washington Post) Russian strikes against Ukrainian infrastructure Russia launches missile and drone strikes across Ukraine, injuring two people a");
System.out.println("nd damaging energy infrastructure. Ukraine says that it shot down 12 of 16 missiles and all 13 drones. (Reuters)"); 
           break;
case 23:
System.out.println("Crimea attacks June 2024 Sevastopol missile attack Ukrainian forces launch an ATACMS missile bombardment on Sevastopol, Crimea, with missile fragments hitting a beach, killing five people and injuring at least 153 others of which 27 were children. Russia's ministry of defense says that it holds the ");
System.out.println("United States responsible for the attack and vows that there will be a response. (Reuters) Kharkiv strikes One person is killed and ten others are injured in Russian strikes on civilian infrastructure in Kharkiv, Ukraine. (Reuters)"); 
           break;
case 24:
System.out.println("Eastern Ukraine campaign At least four people are killed and 40 others are injured when Russian Iskander-M ballistic missiles hit Pokrovsk in Donetsk Oblast, Ukraine. (The Kyiv Independent) (Reuters)"); 
           break;
case 25:
System.out.println("The European Court of Human Rights unanimously finds Russia guilty of systematic violations of human rights in the Crimean peninsula. (Al Jazeera) Russia and Ukraine each return 90 prisoners of war in a prisoner exchange mediated by the United Arab Emirates. (Reuters)"); 
           break;
case 26:
System.out.println("The leaders of Poland, Lithuania, Latvia, and Estonia call on the European Union to construct a €2.5 billion (US$2.67 billion) defence line between them and Russia and Belarus to secure the EU from military, economic, and migrant-related threats. (Reuters) Dutch Prime Minister Mark Rutte is formally");
System.out.println(" selected as the next NATO Secretary-General. (CNN)"); 
           break;
case 27:
System.out.println("Foreign involvement in the Russian invasion of Ukraine According to an anonymous South Korean government official, North Korea is preparing to send engineering forces to the Russian-occupied Donetsk region of Ukraine in July. (NK News)"); 
           break;
case 28:
System.out.println("Dnipro strikes At least one person is killed and 12 others are injured when a Russian missile hits a nine-storey residential building in Dnipro, Ukraine. (Reuters) Eastern Ukraine campaign The Russian Ministry of Defence claims that its forces have taken control of the village of Rozdolivka in Donet");
System.out.println("sk Oblast, Ukraine. (Anadolu Agency)"); 
           break;
case 29:
           System.out.println("At least twelve people, including four children, are killed by Russian attacks in Ukraine. (Al Jazeera)");
           break;
case 30:
System.out.println("Kharkiv strikes At least one person is killed and ten others are injured when a Russian guided bomb hits a postal sorting hub in Kharkiv, Ukraine. (Bloomberg) Eastern Ukraine campaign The Russian Defence Ministry says that its forces have taken the villages of Spirne and Novooleksandrivka in Ukraine");
System.out.println("'s eastern Donetsk Oblast. (Reuters) "); 
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 7:
          System.out.println("1. Enter a day in July 2024:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Eastern Ukraine campaign Russia says that it has captured the villages of Novopokrovske in Donetsk Oblast and Stepova Novoselivka in Kharkiv Oblast. (Al Arabiya)"); 
           break;
case 2:
System.out.println("Two people are killed and nine others are injured when Russian artillery and drones hit Nikopol in Dnipropetrovsk Oblast, Ukraine. (Reuters) (Ukrinform) Kazakh dissident Aydos Sadykov has died two weeks after being shot outside his home in Kyiv, Ukraine. (Al Jazeera)"); 
           break;
case 3:
System.out.println("Battle of Chasiv Yar Russian forces take control of the Novy district of Chasiv Yar, Donetsk Oblast, Ukraine. (CBS News) One person is killed and at least 14 others are injured in Russian guided bomb and missile attacks across Kharkiv Oblast, Ukraine. (Reuters) Russian strikes against infrastructure");
System.out.println(" Dnipro strikes At least five people are killed and 53 others are injured when Russian drones and missiles hits civilian infrastructure in Dnipro, Ukraine. (BBC News) Military aid to Ukraine during the Russo-Ukrainian War NATO nations agree to grant Ukraine €40 billion (US$43 billion) in military ai");
System.out.println("d in 2025. (Reuters) Zaporizhzhia Nuclear Power Plant crisis Three kamikaze drones attack an electrical substation for the Russian-held Zaporizhzhia Nuclear Power Plant, injuring eight workers, causing forest fires near the plant's switchyard, and leaving Enerhodar without power or water. (Reuters) ");
System.out.println("(RFE/RL)"); 
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
System.out.println("Russia–Hungary relations, 2024 peace missions by Viktor Orbán Hungarian Prime Minister Viktor Orbán meets with Russian President Vladimir Putin in Moscow, Russia, after meeting with Ukrainian President Volodymyr Zelenskyy on Tuesday, prompting condemnation among European Union member states. (Politi");
System.out.println("co)"); 
           break;
case 6:
           System.out.println("Hungary suddenly cancels a meeting between Foreign Minister Péter Szijjártó and German Foreign Minister Annalena Baerbock on 8 July in Budapest, after she planned to discuss Hungarian PM Viktor Orbán's uncoordinated meeting with Russian President Vladimir Putin in Moscow. (Politico)");
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
System.out.println("Russian strikes against infrastructure 8 July 2024 Ukraine missile strikes Russia launches a massive missile attack striking residential buildings and civilian infrastructure in cities across Ukraine, including the Okhmatdyt children's hospital in Kyiv. At least 47 people are killed and 189 others a");
System.out.println("re injured as a result of the strikes. (BBC News) Poland–Ukraine relations Ukrainian President Volodymyr Zelenskyy and Polish Prime Minister Donald Tusk sign a security agreement in Warsaw, Poland, allowing Poland to shoot down Russian missiles inside Ukrainian airspace. (Ukrinform)"); 
           break;
case 9:
System.out.println("Eastern Ukraine campaign Russian forces reportedly capture the village of Yasnobrodivka in Donetsk Oblast, Ukraine. (Barron's)"); 
           break;
case 10:
System.out.println("Russian invasion of Ukraine Two Ukrainians are killed by Russian drone and missile attacks on a port in southern Odesa Oblast, Ukraine, which damaged port infrastructure, an energy facility, and a civilian ship. (Reuters)"); 
           break;
case 11:
           System.out.println("Nothing significant to report");
           break;
case 12:
           System.out.println("Six people are killed and at least 19 others are injured in Russian attacks across Donetsk Oblast, Ukraine. (The Kyiv Independent)");
           break;
case 13:
System.out.println("Kharkiv strikes Two people are killed and twenty-five people, including two children, are injured in a Russian double tap strike on the village of Budy, Kharkiv Oblast, Ukraine. (Reuters)"); 
           break;
case 14:
System.out.println("Eastern Ukraine campaign Russia takes control of Urozhaine in Donetsk Oblast, which Ukraine had previously recaptured in July 2023. (Reuters)"); 
           break;
case 15:
System.out.println("Ukraine–NATO relations NATO establishes a new command centre in Wiesbaden, Germany, to plan and coordinate support for the Ukrainian military as part of the NATO Security Assistance and Training for Ukraine. (Euronews)"); 
           break;
case 16:
System.out.println("2024 European heatwaves Ukrainian state electrical grid operator Ukrenergo begins emergency power shutdowns in seven eastern and central oblasts amid a record heat wave and equipment failures worsened by ongoing Russian attacks. (Reuters)\nCzech Republic–Ukraine relations The Czech Republic announce");
System.out.println("s plans to facilitate Colt CZ Group assault rifle production and the construction of an ammunition factory in Ukraine. (RFE/RL)\n Estonia–Russia relations, Latvia–Russia relations, Lithuania–Russia relations The Baltic states announce their exit from Russia's and Belarus's electricity grid along wit");
System.out.println("h plans to synchronize their grid with the continental Europe grid on February 9, 2025. (AP)"); 
           break;
case 17:
           System.out.println("Germany issues plans to halve its military aid to Ukraine in 2025. (Reuters)");
           break;
case 18:
System.out.println("Southern Ukraine campaign- Dnieper campaign: Ukrainian forces withdraw from the village of Krynky in Kherson Oblast. (Bloomberg) Eastern Ukraine campaign Five people are killed and three others are injured in Russian attacks on villages in the Donetsk region, Ukraine. (Reuters)"); 
           break;
case 19:
System.out.println("Eastern Ukraine campaign Ukrainian forces retreat from Urozhaine in Donetsk Oblast. (The Independent) The Russian Ministry of Defence announces that its troops captured the village of Yuryivka in Donetsk Oblast. (Al Arabiya)"); 
           break;
case 20:
System.out.println("Southern Ukraine campaign Five people, including a child, are killed in Russian missile strikes on Mykolaiv and Kherson, Ukraine. (Euronews) (The Moscow Times) "); 
           break;
case 21:
System.out.println("Eastern Ukraine campaign Russian forces capture the villages of Andriivka in Luhansk Oblast and Pishchane in Kharkiv Oblast. (Anadolu Agency) (RTL)"); 
           break;
case 22:
System.out.println("The U.S. Air Force delivers the first of 14 F-16 Fighting Falcons to the Slovak Air Force as part of a $1.6 billion deal signed in 2018. (Reuters) Belarusian foreign minister Maxim Ryzhenkov is invited to make Belarus's first foreign ministry visit to North Korea regarding cooperation with Russia in");
System.out.println(" conflicts with the Western world. (AP)"); 
           break;
case 23:
           System.out.println("The European Union deprives Hungary of its ability to host the next set of foreign and defense ministry meetings as a symbolic signal against Viktor Orbán's uncoordinated meetings in Russia and China, moving the ministry meetings from Budapest, Hungary, to Brussels, Belgium. (BBC News) (The Independ");
System.out.println("ent)");
           break;
case 24:
           System.out.println("Polish Defense Minister Władysław Kosiniak-Kamysz states that Poland will block Ukraine's bid to join the European Union if it doesn't resolve issues regarding Ukrainian nationalists' massacre of Poles during WWII, including finding and burying all victims killed on current Ukrainian territory. (The");
System.out.println(" Kyiv Independent)");
           break;
case 25:
System.out.println("Economic impact of the Russian invasion of Ukraine Fitch Ratings downgrades Ukraine's credit rating from 'CC' to 'C' due to the country's need to restructure US$20 billion in international bonds to foreign investors, increasing the country's risk of default. (Al Jazeera)"); 
           break;
case 26:
System.out.println("The European Union sends its first transfer of €1.5 billion (US$1.63 billion) in proceeds from frozen Russian assets to Ukraine for military and infrastructure support. The Kremlin denounces the transfer as illegal under international law and pledges legal retaliation. (AP) (Reuters) Finland–Russia ");
System.out.println("relations Finland reports that a Russian Navy Baltic Sea fleet vessel trespassed on Finnish territorial waters in the eastern Gulf of Finland. (Reuters)"); 
           break;
case 27:
System.out.println("2024 Ukrainian cyberattacks against Russia Hackers from the Ministry of Defense of Ukraine escalate massive cyberattacks on Russia's largest banks, prohibiting any cash or credit transactions. Cyberattacks also target Russian public transport systems, internet and mobile providers, and social networ");
System.out.println("ks. (Kyiv Post) Russian forces capture the village of Lozovatske in Donetsk Oblast. (Anadolu Agency)"); 
           break;
case 28:
           System.out.println("Russian President Vladimir Putin threatens to position long-range missiles that could strike throughout Europe following the United States's announcement of plans to set up long-range missiles in Germany beginning in 2026. (Reuters)");
           break;
case 29:
System.out.println("Eastern Ukraine campaign Ukrainian army sergeant Oleh Chaus reports that the Russian army captured the eastern Donetsk villages of Prohres and Vovche, citing insufficient weapon supplies, deficient training, and decreased motivation as causes of the setback. (AP)"); 
           break;
case 30:
           System.out.println("The Russian defense ministry says that its forces have taken control of the settlement of Pivdenne in Donetsk region, Ukraine. (Reuters)");
           break;
case 31:
           System.out.println("Ukraine demands that Russia explain the death of Ukrainian POW Oleksandr Ishchenko in Russian captivity, who was being tried with 21 other captured Ukrainian troops for being part of the Azov Brigade that Russian prosecutors allege is far-right affiliated. (Reuters)");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 8:
          System.out.println("1. Enter a day in August 2024:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
           System.out.println("S&P Global downgrades Ukraine's credit rating to 'SD' for 'selective' default after Ukraine was unable to pay a US$34 million international bond payment, and also stating that Ukraine's credit rating could fall to 'D', which would represent a complete default following restructuring of Ukraine's deb");
System.out.println("t. (Reuters)");
           break;
case 4:
System.out.println("Eastern Ukraine campaign Russia said its armed forces captured the village of Novoselivka Persha in Donetsk Oblast, Ukraine. (Times of India) Military aid to Ukraine during the Russo-Ukrainian War President of Ukraine Volodymyr Zelenskyy announces that the country has received its first F-16 fighter");
System.out.println(" aircraft from NATO allies. (The New York Times)\nMali cuts all diplomatic relations with Ukraine for providing intelligence to Tuareg rebels that enabled them to ambush and kill large numbers of Wagner Group mercenaries and Malian troops. (CNN)"); 
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
System.out.println("2024 Kursk offensive Ukraine launches an incursion into Kursk Oblast, Russia. (Reuters) Eastern Ukraine campaign Russia claims that it captured the village of Tymofiivka in Donetsk Oblast. (AA)\nNiger suspends diplomatic relations with Ukraine over Ukraine's alleged support for rebels who ambushed a");
System.out.println("nd killed dozens of Malian soldiers and Russian mercenaries during the Battle of Tinzaouaten in July. (Reuters)"); 
           break;
case 7:
System.out.println("Russian Chief of General Staff Valery Gerasimov says that the Ukrainian advance into Kursk Oblast has been stopped as reports emerge of continued heavy fighting in the vicinity of Sudzha. (BBC News) Acting Governor of Kursk Oblast Alexei Smirnov declares a state of emergency in the region. (DW)"); 
           break;
case 8:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Ukrainian President Volodymyr Zelenskyy appears to confirm ordering a major cross-border operation inside Russia, saying that 'Russia brought war to our land, and it should feel what it has done'. (BBC News) Large explosio");
System.out.println("ns are reported near the town of Rylsk in Kursk Oblast, Russia, with videos on social media appearing to show a destroyed column of military vehicles. (The Kyiv Independent) Ukraine launches twelve rockets and 14 drones into Russia, according to both acting Governor of Kursk Oblast Alexei Smirnov an");
System.out.println("d the Russian Ministry of Defence. (DW Russian) Ukrainian forces capture dozens of Russian soldiers in their offensive in Kursk Oblast. Russian authorities say that fighting is still ongoing for control of several settlements near the border. (Al Jazeera) Ukrainian troops and tanks enter the town of");
System.out.println(" Sudzha, forcing the local residents to flee. (Sky News) (BBC Russian Service)"); 
           break;
case 9:
System.out.println("2024 Kursk offensive Russia declares a federal-level emergency in Kursk Oblast as Ukrainian forces continue to advance. (AP via ABC News) Akhmat special forces commander Apti Alaudinov says that Ukrainian troops simply passed-by their positions without engaging them, with Akhmat troops choosing to r");
System.out.println("etreat until more Russian reinforcements could arrive. Other reports indicate that Akhmat troops fled from Ukrainian forces. (The New Voice of Ukraine via MSN) A Russian military convoy is destroyed on the E38 highway in Oktyabrsky District. (The Guardian) Ukrainian troops capture the Gazprom gas fa");
System.out.println("cility in Sudzha. A video shows Ukrainian soldiers inside the natural gas facility, with much of the town reportedly under Ukrainian control. (Reuters via Al Arabiya) Ukraine launches a massive drone attack on Lipetsk Oblast, Russia, with Lipetsk air base reportedly on fire. Several villages are eva");
System.out.println("cuated, with six people reportedly injured. (Reuters) Eastern Ukraine campaign 2024 Kostiantynivka supermarket missile attack A Russian missile attack on a supermarket in Kostiantynivka, Donetsk Oblast, kills 14 people and injures 43 others. (Reuters) Military aid to Ukraine during the Russo-Ukraini");
System.out.println("an war The United States announces it will send Ukraine a $125 million military aid package, including FIM-92 Stinger missiles, artillery ammunition, and anti-armor systems. (Reuters)"); 
           break;
case 10:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Russia introduces a counter-terrorist regime in Belgorod, Bryansk, and Kursk Oblasts in response to the ongoing incursion, resulting in travel restrictions and an increased security presence. (Novinite) (Ukrainska Pravda) ");
System.out.println("The state-run Russian news agency TASS reports that over 76,000 residents have evacuated from Kursk Oblast this week. (DW) Ukrainian forces enter Belgorod Oblast for the first time during the ongoing incursion, reportedly capturing the village of Poroz. (Kyiv Independent) The Ukrainian Navy strikes ");
System.out.println("and heavily damages a Russian offshore natural gas platform in the Black Sea being used by the Russian Armed Forces. (Reuters) Belarusian involvement in the Russian invasion of Ukraine President of Belarus Alexander Lukashenko increases Belarus's defensive presence on the Belarus–Ukraine border afte");
System.out.println("r accusing Ukraine of illegally sending about a dozen intercepted drones across the border into Belarusian airspace. (RFE/RL) Russian strikes against Ukrainian infrastructure One worker is killed and several others are injured in a Russian missile strike on a critical infrastructure facility in Kram");
System.out.println("atorsk. (Ukrainska Pravda)"); 
           break;
case 11:
System.out.println("Kyiv strikes Two people, including a 4-year-old child, are killed and three others are injured in a Russian KN-23 ballistic missile attack in Kyiv, Ukraine. (Reuters)"); 
           break;
case 12:
System.out.println("2024 Kursk offensive Acting Governor of Kursk Oblast Alexei Smirnov accuses the Ukrainian military of using chemical weapons that poisoned Russian civilians. Ukraine's State Security Service denies these claims and accuses Russia of falsifying war crimes. (Newsweek) (Reuters) Ukrainian colonel gener");
System.out.println("al Oleksandr Syrskyi announces that Ukrainian forces now control over 1,000 km2 (386 sq mi) of Russia's Kursk region. (AP) Eastern Ukraine campaign Russian forces take the settlement of Lysychne in Donetsk Oblast. (Reuters)"); 
           break;
case 13:
System.out.println("2024 Kursk offensive Ukraine says that its troops are still advancing in Kursk Oblast and now control 74 settlements inside Russia. The Russian Defence Ministry says that its forces are fighting the Ukrainians about 28 km (17 mi) from the border. (Reuters) Akhmat special forces commander Apti Alaudi");
System.out.println("nov says that the Ukrainian advance into Kursk Oblast is currently stopped due to Russian counter-attacks. (Reuters)"); 
           break;
case 14:
System.out.println("2024 Kursk offensive Ukrainian President Volodymyr Zelenskyy says that Ukrainian forces have captured more than 100 Russian soldiers in the last 24 hours during their offensive in Kursk Oblast. Zelenskyy also says that he is open to exchanging the prisoners for Ukrainian prisoners of war. (BBC News)");
System.out.println(" Ukraine announces that it will create a strategic buffer zone on the Russia–Ukraine border that is designed to protect our border communities from daily enemy attacks. (Reuters) Russia evacuates thousands more civilians from borderlands in the Kursk Oblast amid deeper progression of the Armed Force");
System.out.println("s of Ukraine into the region. (Reuters) Ukrainian drones strike the Borisoglebsk air base in Voronezh Oblast, Russia, destroying several hangars. (Pravda) (The Washington Post)"); 
           break;
case 15:
System.out.println("2024 Kursk offensive Ukrainian occupation of Kursk Oblast Ukraine establishes a military administration in Sudzha with major general Eduard Moskalyov appointed as its senior commander. General Oleksandr Syrskyi says that the administration will maintain law and order in the region. (BBC News) Russia");
System.out.println(" announces the mandatory evacuation of all civilians from Glushkovsky District in Kursk Oblast. (Reuters) The Russian Defence Ministry claims that Russian forces have retaken the settlement of Krupets. (Anadolu Agency) The Security Service of Ukraine captures 102 Russian servicemen as prisoners of w");
System.out.println("ar, marking the largest single group of Russian soldiers to surrender during the conflict. (Bloomberg) Ukrainian troops and military vehicles enter Russia's Belgorod Oblast with the region declaring a state of emergency. Heavy fighting is reportedly underway. (The Washington Post) Eastern Ukraine ca");
System.out.println("mpaign Pokrovsk offensive Pokrovsk's military administration issues immediate evacuation orders for its citizens due to shelling from Russian troops about 10 km away from the city in Donetsk Oblast, Ukraine. (UNN) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom says that Uk");
System.out.println("raine can use British weaponry, including Challenger 2 tanks, for its military operations inside Russia. (Sky News)"); 
           break;
case 16:
System.out.println("2024 Kursk offensive Ukraine reports capturing 82 Russian settlements within an area of 1,150 square kilometres (440 sq mi) since the start of the Kursk incursion on August 6. (Reuters) Over 120,000 Russian citizens have been evacuated according to Russia, and at least 100 Russian soldiers are captu");
System.out.println("red according to Ukraine. (AP) Russia accuses the United States and European nations of directly helping Ukraine in its incursion on Kursk Oblast by planning operations and providing military support, and states that their involvement created all the prerequisites for Ukraine to lose its sovereignty");
System.out.println(" and lose part of its territories. (Reuters) A Russian Iskander-M ballistic missile strike on an airbase in Dnipropetrovsk Oblast, Ukraine, destroys a MiG-29 jet that was equipped with Storm Shadow missiles. Ukraine's air force spokesperson Yurii Ihnat later confirms the loss of the aircraft on Augu");
System.out.println("st 20. There are no casualties reported. (The Kyiv Independent)"); 
           break;
case 17:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Rockets launched by the Armed Forces of Ukraine destroy a Russian bridge over the Seym river in Glushkovo, Kursk Oblast. Russia's foreign ministry claims that the missiles were launched using Western-made rocket launchers ");
System.out.println("and that the missiles killed volunteers who were evacuating Russian civilians. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War, Budget of Germany, Germany–Ukraine relations Germany issues an indefinite ban on requesting or providing new military aid to Ukraine that has not already b");
System.out.println("een approved in order to reduce federal budget spending. The moratorium results in a tangible dispute within the Scholz coalition government. (Politico) (The Kyiv Independent) Zaporizhzhia Nuclear Power Plant crisis The International Atomic Energy Agency declares that the safety of the Zaporizhzhia ");
System.out.println("Nuclear Power Plant is deteriorating, following an investigation into an explosive drone strike that targeted a perimeter access road at the power plant. (Reuters)"); 
           break;
case 18:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive The Armed Forces of Ukraine destroy a second bridge over the Seym river in Zvannoye. (BBC News) Belarusian involvement in the Russian invasion of Ukraine Belarusian President Alexander Lukashenko reports that nearly one th");
System.out.println("ird of the Belarusian Army has been deployed along the Belarus–Ukraine border, in response to Ukraine stationing more than 120,000 troops at the border. However, Ukraine claims no movement of Belarusian troops has been observed. (Reuters) Eastern Ukraine campaign The Russian Ministry of Defence clai");
System.out.println("ms that Russian forces have captured the village of Svyrydonivka in Donetsk Oblast, Ukraine. (Anadolu Agency)"); 
           break;
case 19:
System.out.println("Eastern Ukraine campaign Pokrovsk offensive Ukrainian officials order the immediate evacuation of the remaining 53,000 citizens in Pokrovsk due to the advancement of the Russian Armed Forces. (Al Jazeera) Russia captures the city of Zalizne and the Vyimka railway station in Donetsk Oblast. (Reuters)");
System.out.println(" Belarusian involvement in the Russian invasion of Ukraine Belarus announces that it has further increased its Belarus–Ukraine border presence against Ukraine significantly, adding aircraft and air defense forces following its accusations of Ukraine's military sending 120,000 troops to its border an");
System.out.println("d conducting aggressive policies. Ukraine denies Lukashenko's claims, stating its forces have not observed unusual movements of Belarusian troops on the border. (Reuters)"); 
           break;
case 20:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine 2024 Kursk offensive Russian military sources claim that Ukrainian forces have destroyed or damaged all three bridges over the Seym river in western Russia, potentially trapping Russian forces between the river, the Ukrainian border, and advan");
System.out.println("cing Ukrainian forces. (AP) Eastern Ukraine campaign Pokrovsk offensive, Battle of Toretsk Russia claims that its forces have taken control of the settlement of New York in Donetsk Oblast, Ukraine. (Reuters) Ukraine says that Russian forces are launching heavy attacks on the Toretsk and Pokrovsk fro");
System.out.println("nts. (Reuters) Russian strikes against Ukrainian infrastructure Ternopil residents are urged to remain indoors after Russian drone strikes an industrial facility, causing a large fire and an increased concentration of chlorine in the air. (Reuters) (The Kyiv Indepenent)"); 
           break;
case 21:
System.out.println("2024 Kursk offensive The Ukrainian military reports that it used United States-made weapons to destroy several pontoon bridges constructed by Russia following its destruction of at least three bridges over the Seym river in Kursk Oblast. (Reuters) Mayor of Moscow Sergey Sobyanin states that Ukraine ");
System.out.println("launched one of its largest drone attacks on the Russian capital, and claims that all drones were taken down without casualties or damage based on preliminary information. (Reuters) Eastern Ukraine campaign Pokrovsk offensive The Russian Ministry of Defense states it has fully captured the village o");
System.out.println("f Zhelanne in Donetsk Oblast, Ukraine. (Anadolu Agency) Ukrainian President Volodymyr Zelenskyy acknowledges advancements made by Russian Armed Forces on the Pokrovsk front, and announces the strengthening of regional Ukrainian positions in order to resist further advancements. (Reuters)"); 
           break;
case 22:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A ferry carrying 30 fuel tanks sinks in the port of Kavkaz, in Krasnodar Krai, Russia, following a Ukrainian attack. (Reuters) The International Atomic Energy Agency announces an investigation of the Kursk Nuclear Power Plant following accusat");
System.out.println("ions from Russia that a Ukrainian drone targeted the power plant. (Reuters)"); 
           break;
case 23:
System.out.println("Military aid to Ukraine during the Russo-Ukraine War The United States announces a new military aid package to Ukraine, including air defense missiles, munitions for High Mobility Artillery Rocket Systems (HIMARS), an array of anti-armor missiles, vehicles, and other equipment. (AP)"); 
           break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Governor of Belgorod Oblast Vyacheslav Gladkov says that five civilians have been killed by Ukrainian shelling in Rakitnoye, Russia. (Reuters)"); 
           break;
case 25:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine At least five people, including three children, are killed and 13 others are injured in an overnight Ukrainian strike on Rakitnoye, Belgorod Oblast, Russia, according to Russian officials. (Al Jazeera) Belarusian involvement in the Russian inv");
System.out.println("asion of Ukraine Ukraine accuses Belarus of building up a significant level of troops and weaponry, including artillery, multiple-launch rocket systems and air defense systems along the border under the guise of military exercises, and demands their immediate withdrawal. (The Kyiv Independent) (Reut");
System.out.println("ers) Eastern Ukraine campaign A British safety adviser working for Reuters is killed and two other journalists are injured in a Russian ballistic missile strike on their hotel in Kramatorsk, Donetsk Oblast, Ukraine. (Reuters) Northern Ukraine skirmishes, Chernihiv strikes At least four people are ki");
System.out.println("lled and 37 others are injured in overnight Russian attacks in Chernihiv, Sumy, Kharkiv, and Donetsk Oblasts, Ukraine. (Reuters) President of Ukraine Volodymyr Zelenskyy publicly presents the Ukrainian-produced Palianytsia rocket drone and loitering munition, intended to serve as the Ukrainian count");
System.out.println("erpart to the Russian ZALA Kub-BLA. (Ukrainska Pravda)"); 
           break;
case 26:
System.out.println("Russian strikes against Ukrainian infrastructure 26 August 2024 Russian strikes on Ukraine Massive Russian attacks are launched on cities across Ukraine, killing at least seven people. Ukrainian officials call it the largest Russian attack on Ukraine since the beginning of the Russian invasion of Uk");
System.out.println("raine. (Kyiv Independent) (Kyiv Independent 2) (Reuters) Poland says that a Russian Shahed drone had likely entered its airspace during the attacks on Ukraine and that searches are underway for the object as it may have landed in Polish territory around 30 kilometers (18 miles) from the Poland–Ukrai");
System.out.println("ne border. (The Defense Post) (Radio Free Europe/Radio Liberty) (Reuters) A Ukrainian F-16 fighter jet crashes after shooting down several missiles fired from Russia, killing the pilot. (CNN) Military aid to Ukraine during the Russo-Ukrainian War, Corruption in Ukraine Audits conducted by the Ukrain");
System.out.println("ian Ministry of Defense determine that between March and July, multiple Armed Forces of Ukraine units never received nearly US$4.2 million in military aid labeled as humanitarian aid to bypass customs fees, prompting embezzlement and illicit enrichment investigations. (Kyiv Independent)"); 
           break;
case 27:
System.out.println("26 August 2024 Russian strikes on Ukraine Russian missile and drone attacks resume across Ukraine, killing at least six people and injuring five others in Kryvyi Rih and Zaporizhzhia. (The Independent) (Kyiv Independent) 2024 Kursk offensive The Ukrainian military says it has captured 594 Russian tr");
System.out.println("oops and 100 settlements in Kursk Oblast since the start of the incursion. (DW) Ukrainian conscription crisis, Poland–Ukraine relations President of Ukraine Volodymyr Zelenskyy announces that Poland will cooperate with Ukraine to return Ukrainians who violated the law, traitors, and collaborators wh");
System.out.println("o illegally crossed the Poland–Ukraine border in order to evade conscription in the Russo-Ukrainian War. (UNN) United States and the Russian invasion of Ukraine, Russia–NATO relations Russian Foreign Minister Sergey Lavrov warns the United States and other NATO members against giving Ukraine approva");
System.out.println("l to use long-range missiles to target Russia. (Reuters) Ukrainian President Volodymyr Zelenskyy announces that Ukraine has successfully tested a domestically-produced ballistic missile for the first time. (Ukrainska Pravda)"); 
           break;
case 28:
           System.out.println("Ukrainian drones strike an oil terminal in Kamensky District, Rostov Oblast, Russia, causing a large fire. Ukraine also launches drone attacks on Kirov Oblast for the first time, striking an oil depot in Kotelnich. The Russian Defence Ministry says that air defences have shot down eight drones over ");
System.out.println("Voronezh Oblast. (Reuters)");
           break;
case 29:
System.out.println("The Russian defence ministry claims that its forces have captured the settlements of Mykolaivka in Donetsk Oblast and Stelmakhivka in Luhansk Oblast, Ukraine. (Al Arabiya) "); 
           break;
case 30:
System.out.println("Kharkiv strikes Seven people are killed when a Russian guided bomb strikes a residential building and playground in Kharkiv, Ukraine. (Reuters) Ukrainian President Volodymyr Zelenskyy dismisses the commander of the Ukrainian Air Force Mykola Oleshchuk following the crash of an F-16 fighter jet and t");
System.out.println("he death of its pilot while defending against Russian strikes. (Reuters) "); 
           break;
case 31:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Five civilians are killed in Ukrainian missile strikes on Belgorod, Russia. (Reuters)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 9:
          System.out.println("1. Enter a day in September 2024:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine launches more than a hundred drones against targets in Russia, including the Konakovo Power Station in Konakovo, Tver Oblast, and the Moscow Refinery in Moscow. (Reuters) Eastern Ukraine campaign Russia reports that its forces have tak");
System.out.println("en control of the settlements of Ptyche and Vyimka in Donetsk Oblast, Ukraine. (Reuters) Kharkiv strikes At least 47 people are injured when Russian missiles hit a shopping mall and events complex in Kharkiv, Ukraine. (Reuters)"); 
           break;
case 2:
System.out.println("President of Russia Vladimir Putin arrives in Mongolia to discuss a China–Russia gas pipeline meant to recoup Russian losses from Western sanctions, despite Ukraine and the European Union urging Mongolia to arrest Putin under his International Criminal Court warrant. (Reuters) (Euronews) Ukraine's F");
System.out.println("oreign Ministry states that Mongolia's refusal to arrest Vladimir Putin while on a state visit means that it shares responsibility for the war crimes committed by Russia, and vows to work with allies to enforce punitive measures on Mongolia. (Reuters)"); 
           break;
case 3:
System.out.println("Russian strikes against Ukrainian infrastructure September 2024 Poltava strike Russian missile strikes on Poltava, Ukraine, kill at least 55 people and injure more than 328 others. (Reuters) (AP) "); 
           break;
case 4:
System.out.println("Lviv strikes At least seven people are killed and 53 others are injured when Russian drones and missiles hit buildings in Lviv, Ukraine. (Reuters)"); 
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
           System.out.println("Russian artillery targets the city of Kostiantynivka in Donetsk Oblast, Ukraine, killing three civilians and injuring three others. (Reuters)");
           break;
case 8:
System.out.println("Russia formally claims control of Novohrodivka, Donetsk Oblast, twelve kilometers (seven miles) from the strategically important Ukrainian logistical hub city Pokrovsk. (Reuters) "); 
           break;
case 9:
System.out.println("Russian troops capture the village of Memryk in Donetsk Oblast, Ukraine. (Al Jazeera) Russia–NATO relations The Latvian Defence Ministry confirms that a Russian military Shahed drone that crashed near the village of Gaigalava, Latvia, last week was carrying explosives and was likely intended to stri");
System.out.println("ke Ukraine. (Reuters) Use of incendiary weapons in the Russo-Ukrainian War Ukraine begins the implementation of dragon drones that spray molten thermite on forest cover to reveal and help destroy Russian units and military equipment. (Al Jazeera)"); 
           break;
case 10:
System.out.println("Ukraine launches drone attacks on multiple Oblasts of Russia, including Moscow, prompting all flights to be suspended at Vnukovo International Airport and Moscow Domodedovo Airport. Bryansk Governor Alexander Bogomaz says that at least 59 Ukrainian drones have been shot down over the region. Russia ");
System.out.println("also reports that two people were killed in the Ukrainian drone attack on Moscow. (Reuters) (Times of Israel) Iran and the Russian invasion of Ukraine, International sanctions against Iran U.S. Secretary of State Antony Blinken says that Russia has received a shipment of Fath 360 tactical ballistic ");
System.out.println("missiles from Iran, and expects their deployment within weeks. Iran denies the claim, calling it psychological warfare. In response, the United Kingdom, France, and Germany announce new sanctions on Iran for supplying Russia with ballistic missiles. (BBC News) (The Telegraph) Military aid to Ukraine");
System.out.println(" during the Russo-Ukrainian War The Netherlands lifts all of its weapons restrictions on military equipment that it provided to Ukraine, allowing the Ukrainian military to target Russia with long-range weapons, while also urging NATO allies to lift their own weapons restrictions. (Kyiv Post)"); 
           break;
case 11:
System.out.println("Russian forces reportedly recapture 10 settlements in Kursk Oblast. (Anadolu Agency) Military aid to Ukraine during the Russo-Ukrainian War The United Kingdom reportedly approves the use of Storm Shadow cruise missiles to strike targets inside Russian territory. (The Kyiv Independent)"); 
           break;
case 12:
System.out.println("Eastern Ukraine campaign Russian artillery shelling kills three Red Cross workers and injures two others in Donetsk Oblast, Ukraine. (Reuters) Foreign involvement in the Russian invasion of Ukraine A spokesperson for the Indian Foreign Ministry say that about 45 Indian nationals have been discharged");
System.out.println(" from the Russian military, with efforts currently underway to get a further 50 Indians released. (Reuters) Kharkiv strikes Russian shelling of the settlement of Borova in Kharkiv Oblast, Ukraine, kills three civilians and injures nine others, including several emergency service personnel. (Reuters)");
System.out.println(" Military aid to Ukraine during the Russo-Ukrainian War, Russia–NATO relations Russian president Vladimir Putin warns that Ukrainian use of NATO weapons to strike deep into Russian territory indicates NATO's formal entry into war against Russia, due to the programming of these weapons by NATO person");
System.out.println("nel representing a direct confrontation. (The Independent) Southern Ukraine campaign Ukraine accuses Russia of conducting missile strikes on a Saint Kitts and Nevis-flagged bulk carrier carrying grain to Egypt in the exclusive economic zone of Romania in the Black Sea. No casualties are reported. (R");
System.out.println("euters)"); 
           break;
case 13:
System.out.println("Russian artillery targets 15 areas in Sumy Oblast, Ukraine, killing two civilians near the village of Yampil and injuring nine others. (Reuters) China and the Russian invasion of Ukraine Reuters reports that Russia has begun production of thousands of Garpiya-A1 long-range combat drones used against");
System.out.println(" Ukrainian civilian and military targets, that incorporate engines, parts, and technology from China. (Reuters) Humanitarian impacts of the Russian invasion of Ukraine The U.S. Central Intelligence Agency reports that due to the ongoing war, Ukraine's death rate is now the highest in the world at 18");
System.out.println(".6 per thousand people, while its birth rate is the lowest at six children born per thousand people. (Kyiv Post)"); 
           break;
case 14:
System.out.println("Russia–NATO relations Russian officials say that the approval of Ukrainian use of long-range weapons to strike inside Russia will result in an uncontrolled escalation with the West and the destruction of Kyiv. (Reuters) NATO Chair Rob Bauer backs the use of long-range weapons by Ukrainian forces to ");
System.out.println("strike targets inside Russia. (ABC News) Ukrainian conscription crisis Following a meeting in Kyiv, Ukraine, the foreign ministers of Poland and Ukraine call for ending social benefits for Ukrainian men in Poland, and for programs in the European Union to return them to Ukraine in order to stop draf");
System.out.println("t evasion. (Reuters)"); 
           break;
case 15:
           System.out.println("At least 41 people are injured when a Russian guided bomb hits an apartment building in Kharkiv, Ukraine. (CNN)");
           break;
case 16:
System.out.println("2024 Kursk offensive The Ukrainian ministry of foreign affairs invites the United Nations and the Red Cross to join humanitarian efforts in Kursk Oblast, Russia. (Reuters) Ukraine–United States relations, United States and the Russian invasion of Ukraine Ukrainian officials publicly distance themsel");
System.out.println("ves from the Donald Trump-involved shooting suspect and warn that Russia will use the situation for anti-Ukraine propaganda, following reports of the suspect protesting for the Azov Brigade and regularly calling for international support and troops for Ukraine. (Reuters) (Reuters 2)"); 
           break;
case 17:
System.out.println("Russian artillery targets the town of Komyshuvakha in Zaporizhzhia Oblast, Ukraine, killing two people and injuring five others. (Reuters) Doctors Without Borders halts its operations in Russia after its government removed the organization from its roster of approved foreign charities. (Al Jazeera)"); 
           break;
case 18:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Toropets depot explosions A Ukrainian drone attack on a Russian weapons depot in Toropets, Tver Oblast, causes an explosion large enough to be detected as an earthquake by monitoring stations. Local residents are told to evacuate and schools i");
System.out.println("n the region are closed. (The Guardian) "); 
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
System.out.println("Zaporizhzhia Nuclear Power Plant crisis Russian management at the Zaporizhzhia Nuclear Power Plant accuses the Armed Forces of Ukraine of creating threats to the plant's safety by launching a drone to attack a nearby electrical substation. (Reuters)"); 
           break;
case 21:
System.out.println("Kharkiv strikes Twenty-one people are injured when a Russian guided bomb hits an apartment building in Kharkiv, Ukraine. (Reuters)"); 
           break;
case 22:
           System.out.println("At least 16 people are injured in Russian airstrikes in Zaporizhzhia, Ukraine. (Reuters)");
           break;
case 23:
System.out.println("2024 Kursk offensive The Russian Foreign Ministry reports that at least 56 Russian civilians were killed and 266 others were injured by the Armed Forces of Ukraine in Kursk Oblast, Russia, which the Ukrainian Foreign Ministry denies as Russian propaganda. (Reuters)"); 
           break;
case 24:
           System.out.println("At least three people are killed and 22 others are injured in a Russian guided bomb attack on an apartment building in Kharkiv, Ukraine. (Reuters)");
           break;
case 25:
           System.out.println("Ukrainian President Volodymyr Zelenskyy accuses Brazil and China of using their proposed peace plan for ending the Russo-Ukrainian War to increase their geopolitical power 'at Ukraine's expense' by urging developing nations to agree to the peace plan. (Reuters)\nRepublican Speaker of the House Mike ");
System.out.println("Johnson demands that Ukrainian President Volodymyr Zelenskyy dismiss Ukrainian ambassador to the United States Oksana Markarova after Zelenskyy visited an ammunition factory in Pennsylvania with several Democratic politicians, which Johnson claims represented foreign electoral intervention. (Reuters");
System.out.println(")");
           break;
case 26:
System.out.println("The Russian Defense Ministry claims that Russian forces have taken the city of Ukrainsk in Donetsk Oblast, Ukraine. (The Moscow Times) United States and the Russian invasion of Ukraine Prior to a meeting with Ukrainian President Volodymyr Zelenskyy, U.S. President Joe Biden announces a military aid ");
System.out.println("package of more than $8 billion for Ukraine and directs The Pentagon to allocate all remaining security funds to Ukraine by the end of his presidential term in January 2025. (Reuters) "); 
           break;
case 27:
System.out.println("Eastern Ukraine campaign The Russian Ministry of Defense claims soldiers captured the village of Marynivka in Donetsk Oblast, Ukraine. (Al Arabiya) Kryvyi Rih strikes At least one person is killed and five others are injured in a Russian missile strike on a police department in Kryvyi Rih, Dnipropet");
System.out.println("rovsk Oblast, Ukraine. (Reuters) Nuclear risk during the Russian invasion of Ukraine, Belarusian involvement in the Russian invasion of Ukraine Belarusian President Alexander Lukashenko warns that Belarus will use Russian nuclear weapons if the country is attacked by NATO. (Anadolu Agency) Southern ");
System.out.println("Ukraine campaign Russian loitering munitions hit the city of Izmail in Odesa Oblast, Ukraine, killing three people and wounding fourteen. (Reuters) "); 
           break;
case 28:
           System.out.println("Ten people are killed and 22 others are injured in a Russian double tap strike on a medical facility in Sumy, Ukraine. (Reuters)");
           break;
case 29:
           System.out.println("Nothing significant to report");
           break;
case 30:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 10:
          System.out.println("1. Enter a day in October 2024:");
          day=s.nextInt();
          switch(day){
case 1:
System.out.println("Battle of Vuhledar Russian forces capture the town of Vuhledar in Donetsk Oblast, Ukraine, after Ukrainian forces retreat from the town. (The Daily Telegraph) Southern Ukraine campaign Seven people are killed and 12 others are injured in Russian strikes in Kherson and Zaporizhzhia, Ukraine. (Reuters");
System.out.println(")"); 
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
System.out.println("Pokrovsk offensive The head of military administration of Pokrovsk, Donetsk Oblast, Ukraine, Serhiy Dobriak reports that Russian forces are now about 7 kilometres (4.3 mi) from the city, and have destroyed or damaged 80% of the city's critical infrastructure. (Reuters)"); 
           break;
case 5:
System.out.println("Russian forces claim that they captured the village of Bazhane Druhe in Donetsk Oblast, Ukraine. (The Economic Times) Ukrainian forces say that they have shot down a Russian aircraft near Kostiantynivka. The aircraft crashed into a house, causing it to catch fire. No casualties are reported. The air");
System.out.println("craft is later reported to be a S-70 Okhotnik-B and was reportedly shot down by a Russian Su-57 jet to prevent its capture by Ukraine. (Defence Blog) (Forbes) (AP) "); 
           break;
case 6:
           System.out.println("Nothing significant to report");
           break;
case 7:
System.out.println("Crimea attacks An oil terminal in Feodosia, the largest oil facility in Russian-occupied Crimea, catches fire following an overnight drone attack by Ukrainian forces. Russian state media reports that a state of emergency has been declared in Feodosia due to a human-made disaster. (Ukrainska Pravda) ");
System.out.println("Eastern Ukraine campaign One person is killed and six others, including two children, are injured in Russian shelling that hit several apartment buildings in Sloviansk, Donetsk Oblast, Ukraine. (Reuters) Southern Ukraine campaign Russian missiles strike two cargo ships in the Port of Odesa, includin");
System.out.println("g a Palau-flagged ship carrying grain, killing a port worker and injuring five crew members. (Reuters)"); 
           break;
case 8:
           System.out.println("Nothing significant to report");
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
System.out.println("The World Bank approves a new financial intermediary fund consisting of grants from the United States, Japan, Canada, and other countries coupled with interest from frozen Russian assets to give to Ukraine as part of a $50 billion loan. (Reuters) Ukraine's Coordination Headquarters for the Treatment");
System.out.println(" of Prisoners of War confirms the death of journalist Victoria Roshchyna, who had been held prisoner by Russia since August 2023. (The Kyiv Independent)"); 
           break;
case 11:
System.out.println("Battle of Toretsk The military administrator of the city of Toretsk in Donetsk Oblast, Ukraine, reports that more than half of the city has been taken by Russian Armed Forces, with the Armed Forces of Ukraine fighting back at eight different locations. (Reuters) "); 
           break;
case 12:
System.out.println("Local media outlets report that Ukrainian military recruitment officers raided shopping centers, bars, restaurants, and a large concert venue across several Ukrainian cities including Kyiv, Dnipro, and Kharkiv to detain men not in compliance with conscription orders. (AP) "); 
           break;
case 13:
System.out.println("Foreign involvement in the Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy states that North Korean troops have been deployed to Ukraine to fight alongside the Russian military. (Reuters)"); 
           break;
case 14:
System.out.println("Southern Ukraine campaign Russian forces claim that they took the village of Levadne in Zaporizhzhia Oblast, Ukraine. (Voice of America)"); 
           break;
case 15:
System.out.println("Eastern Ukraine campaign Governor of Kharkiv Oblast Oleh Syniehubov orders the mandatory evacuation of all civilians from Kupiansk and Borova in Kharkiv Oblast, Ukraine. (Reuters)"); 
           break;
case 16:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, North Korea–Ukraine relations Ukrainian President Volodymyr Zelenskyy says that North Korea has now become directly involved in the war in Ukraine, with a senior Ukrainian intelligence official saying that around 3,000 North Korean troops are c");
System.out.println("urrently in Russia and are training for deployment to Russian-occupied territories. (Politico) United States and the Russian invasion of Ukraine U.S. President Joe Biden announces a new $425 million military aid package for Ukraine, containing long-range weaponry. (The Kyiv Independent)"); 
           break;
case 17:
           System.out.println("Nothing significant to report");
           break;
case 18:
System.out.println("Foreign involvement in the Russian invasion of Ukraine, North Korea–Ukraine relations The South Korean National Intelligence Service says that North Korea has started sending troops to fight with Russia in Ukraine. South Korean President Yoon Suk Yeol calls for a security meeting and says the intern");
System.out.println("ational community must respond with all available means. (BBC)"); 
           break;
case 19:
           System.out.println("Nothing significant to report");
           break;
case 20:
           System.out.println("Nothing significant to report");
           break;
case 21:
           System.out.println("Nothing significant to report");
           break;
case 22:
           System.out.println("Nothing significant to report");
           break;
case 23:
System.out.println("Eastern Ukraine campaign The Russian Defense Ministry claims that Russian forces have captured the villages of Mykolaivka and Serebrianka in Donetsk Oblast, while Ukrainian military newspage DeepState reports heavy conflict surrounding Selydove. (Reuters) Foreign involvement in the Russian invasion ");
System.out.println("of Ukraine The U.S. State Department reports that it has confirmed evidence that North Korean troops are now present in Russia and are preparing to travel to the battlefield in Ukraine. South Korea says that Pyongyang has promised to send up to 10,000 troops to support the war effort. (The Guardian)");
System.out.println(" United States and the Russian invasion of Ukraine The U.S. Defense Department finalizes a US$20 billion loan to Ukraine for military and economic support as part of a collective US$50 billion loan between G7 members. (Reuters) "); 
           break;
case 24:
System.out.println("Eastern Ukraine campaign The Armed Forces of Ukraine reports that Russian Armed Forces have made significant advances in the strategic city of Selydove, predicting that it could be captured in a few days. (Euronews)"); 
           break;
case 25:
System.out.println("2024 Kursk offensive, Foreign involvement in the Russian invasion of Ukraine Ukraine reports that the first North Korean units have entered the active warzones in Russia's Kursk Oblast. The North Korean soldiers are reportedly under the command of Deputy Defence Minister Yunus-bek Yevkurov. (Yonhap ");
System.out.println("News Agency) Dnipro strikes A Russian missile attack on a residential area in Dnipro, central Ukraine, kills five people and injures 21 others. (AP) Kyiv strikes, Attacks on civilians in the Russian invasion of Ukraine One person is killed and five others are injured when a Russian drone strikes a r");
System.out.println("esidential building in Solomianskyi District, Kyiv, Ukraine. (Reuters)"); 
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
           System.out.println("Nothing significant to report");
           break;
case 28:
System.out.println("Kharkiv strikes At least 21 people are injured when Russian guided bombs and rocket artillery hit Kharkiv Oblast, Ukraine. (Reuters) "); 
           break;
case 29:
System.out.println("Eastern Ukraine campaign Russia claims that it has taken the cities of Selydove and Hirnyk in Donetsk Oblast, Ukraine, with open-source data indicating that Russian forces are advancing at their fastest pace in at least one year amid signs of North Korean involvement in the war. (Reuters) Kyiv strik");
System.out.println("es, Attacks on civilians in the Russian invasion of Ukraine At least six people are killed and 13 others are injured in overnight Russian attacks in Kharkiv, Kherson, and Kyiv, Ukraine. (Reuters) Head of the Chechen Republic Ramzan Kadyrov vows to retaliate harshly against Ukraine after a drone stri");
System.out.println("ke targeted a Special Forces University in Gudermes, Chechnya, Russia, representing the first known drone attack in Chechnya by the Armed Forces of Ukraine. (Reuters), (The Kyiv Independent)"); 
           break;
case 30:
           System.out.println("Nothing significant to report");
           break;
case 31:
System.out.println("Ukrainian President Volodymyr Zelenskyy strongly condemns the United States and European nations for making zero response to the Russian deployment of North Korean soldiers against Ukraine. (Reuters) Kharkiv strikes A Russian glide bomb strikes a residential building in Kharkiv, killing three people");
System.out.println(" and injuring 35 others, according to Ukrainian Interior Minister Ihor Klymenko. (AP)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;
case 11:
          System.out.println("Enter a day in November 2024:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("Nothing significant to report");
           break;
case 2:
           System.out.println("Nothing significant to report");
           break;
case 3:
System.out.println("Eastern Ukraine campaign Pokrovsk offensive The Russian Ministry of Defense and Ukrainian military news site DeepStateUA report that Russia has captured the settlement of Vyshneve in Donetsk Oblast, Ukraine, with Russian troops advancing towards Hryhorivka to the west. (Reuters)"); 
           break;
case 4:
System.out.println("2024 Kursk offensive Ukraine says that its forces have engaged North Korean troops for the first time in Kursk Oblast, Russia. (The Independent)"); 
           break;
case 5:
System.out.println("Zaporizhzhian strikes Six people are killed and at least 20 others are injured in a Russian missile strike on Zaporizhzhia, Ukraine. (Reuters)"); 
           break;
case 6:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War U.S. President Joe Biden announces the expedited granting of more than US$6 billion in military aid to Ukraine prior to president-elect Donald Trump's inauguration in January. (Reuters)"); 
           break;
case 7:
System.out.println("Zaporizhzhia strikes Four people are killed and 33 others are injured when Russian guided bombs hit residences, an apartment building, and a medical center in Zaporizhzhia, Ukraine. (Reuters)"); 
           break;
case 8:
System.out.println("Kharkiv strikes, Kyiv strikes, Odesa strikes One person is killed and at least 38 others are injured in Russian airstrikes in Kharkiv, Kyiv, and Odesa, Ukraine. (AP)"); 
           break;
case 9:
           System.out.println("Russian President Vladimir Putin signs into law the North Korean–Russian Treaty on Comprehensive Strategic Partnership, a mutual defense pact with North Korea. (Reuters)");
           break;
case 10:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine November 2024 Moscow drone attack One person is injured and at least 36 flights are diverted when 34 Ukrainian drones strike Moscow, Russia. (CBC News) "); 
           break;
case 11:
System.out.println("Mykolaiv strikes, Zaporizhzhia strikes Five people are killed and 18 others, including five children, are injured in Russian air strikes on Mykolaiv and Zaporizhzhia, Ukraine. (DW) (Arab News)"); 
           break;
case 12:
           System.out.println("Nothing significant to report");
           break;
case 13:
System.out.println("Nothing significant to report" ); break; case 14: System.out.println("Eastern Ukraine campaign The Russian Defence Ministry claims that Russian forces have captured the village of Voznesenka in Donetsk Oblast, Ukraine. (Anadolu Agency) Odesa strikes, Russian strikes against Ukrainian infrastructure ");
System.out.println("One person is killed and ten others are injured in Russian airstrikes on an apartment building and energy facilities in Odesa, Ukraine. (Reuters)"); 
           break;
case 15:
System.out.println("Austrian energy company OMV announces, that Russian state-owned energy company Gazprom will stop supplying natural gas to Austria, who receives their natural gas primarily from Russia, starting this weekend. (DW) Russian invasion of Ukraine, Germany–Russia relations German Chancellor Olaf Scholz hol");
System.out.println("ds a telephone call with Russian President Vladimir Putin about the war in Ukraine, their first contact since 2022. Putin tells Scholz that any negotiated settlement to end the war must recognize the territories that Russia has occupied as part of Russia and that Ukraine must abandon its aspiration ");
System.out.println("to join NATO. (AP) (The New York Times)"); 
           break;
case 16:
           System.out.println("Nothing significant to report");
           break;
case 17:
System.out.println("17 November 2024 Russian strikes on Ukraine Russia launches its largest aerial attack on Ukraine in months. According to President of Ukraine Volodymyr Zelenskyy, around 120 missiles and 90 drones were launched, damaging energy infrastructure across the country, killing at least seven people, and ca");
System.out.println("using widespread damage. (CNN) (BBC News) Ten people are killed and 52 others are injured in a Russian missile strike on an apartment building in Sumy, Ukraine. (Reuters) United States President Joe Biden lifts restrictions on the Ukrainian use of U.S. weapons for deep attacks inside Russia, with Uk");
System.out.println("rainian forces planning to use the weapons in long-distance attacks in the coming days. (Reuters)"); 
           break;
case 18:
System.out.println("Odesa strikes Russian forces launch a missile attack on the city of Odesa, Ukraine, for the second consecutive day, killing at least ten civilians, injuring dozens of others and damaging civilian infrastructure, including residential buildings. (Ukrainska Pravda) Ukrainian energy crisis, 17 November");
System.out.println(" 2024 Russian strikes on Ukraine Ukraine re-implements nationwide rolling blackouts primarily due to yesterday's destruction of energy infrastructure by Russian airstrikes. (Reuters)"); 
           break;
case 19:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War United States and the Russian invasion of Ukraine U.S. President Joe Biden approves of sending non-persistent anti-personnel mines to Ukraine, with Ukraine committing to not use them in areas with civilians. (Al Jazeera) The United Kingdom and F");
System.out.println("rance both prepare new military packages containing long-range missiles to send to Ukraine following President Biden's decision to allow deep strikes into Russian territory using American weapons. (Newsweek) Attacks in Russia during the Russian invasion of Ukraine Ukraine launches ATACMS ballistic m");
System.out.println("issiles at targets in Bryansk Oblast, Russia, according to the Russian Defence Ministry. It is the first time that Ukraine has used the American-supplied missiles to strike targets inside Russia. (BBC News) Nuclear risk during the Russian invasion of Ukraine, Russia and weapons of mass destruction R");
System.out.println("ussian President Vladimir Putin signs a decree that allows Russia to use nuclear weapons in response to conventional attacks by a non-nuclear state supported by a nuclear power. (Reuters)"); 
           break;
case 20:
System.out.println("United Kingdom and the Russian invasion of Ukraine British-produced Storm Shadow cruise missiles are launched into Russian territory by Ukraine for the first time, following approval by the Starmer cabinet. (The Guardian) The U.S., Italian, Greek, and Spanish governments temporarily close their emba");
System.out.println("ssies in Kyiv, Ukraine, following threats of a significant air attack from Russia. (The Washington Times) The embassies of Kazakhstan and Kyrgyzstan urge their citizens to leave areas near Ukrainian combat zones or to leave Ukraine altogether amid an escalating risk of Russian retaliatory attacks. (");
System.out.println("The Times of Central Asia) "); 
           break;
case 21:
System.out.println("Dnipro strikes, Russian strikes against Ukrainian infrastructure Russia strikes Dnipro, Ukraine, with a projectile stated by Russian President Vladimir Putin to be a new Oreshnik intermediate-range ballistic missile (IRBM) model. This confirms earlier reports from the United States and other western");
System.out.println(" officials, who said that Russia had used an IRBM after initial reports misidentified the missile as a RS-26 Rubezh intercontinental ballistic missile. (Reuters) (CBS News) (BBC News) Hungary and the Russian invasion of Ukraine Hungary announces the deployment of a missile defense system on its bord");
System.out.println("er with Ukraine, saying that the threat of escalation with Russia is now greater than ever. (Reuters) United Kingdom and the Russian invasion of Ukraine Russian ambassador to the United Kingdom Andrey Kelin says that the UK is now directly involved in the war in Ukraine following yesterday's use of ");
System.out.println("British Storm Shadow cruise missiles by Ukraine to strike targets inside Russia. (Sky News)"); 
           break;
case 22:
System.out.println("2024 Kursk offensive Russian human rights commissioner Tatyana Moskalkova states that 46 of one thousand Russian civilians who claimed to have been forcibly relocated by Ukraine into its territory have been returned, following extensive negotiations involving the Red Cross. (Reuters) Two people are ");
System.out.println("killed and 12 others are injured in a Russian drone attack on civilian infrastructure in Sumy, Ukraine. (Reuter"); 
           break;
case 23:
           System.out.println("The United States Intelligence Community declassifies a document which accuses Russia of assassinating political opponents to President Vladimir Putin abroad. (Kyiv Independent) (Bloomberg)");
           break;
case 24:
           System.out.println("Nothing significant to report");
           break;
case 25:
           System.out.println("Nothing significant to report");
           break;
case 26:
System.out.println("Battle of Kurakhove Russian forces enter the city of Kurakhove in Donetsk Oblast, Ukraine, with heavy fighting reportedly underway. (Al Arabiya)"); 
           break;
case 27:
           System.out.println("Nothing significant to report");
           break;
case 28:
System.out.println("Eastern front of the Russian invasion of Ukraine The Russian Defence Ministry claims that Russian forces have taken the village of Nova Illinka in Donetsk Oblast, Ukraine. (Reuters) Russian strikes against Ukrainian infrastructure, Ukrainian energy crisis Russia launches a massive missile and drone ");
System.out.println("attack on civilian and critical infrastructure in Ukraine, injuring at least five people and causing blackouts for more than a million households. (CNN)"); 
           break;
case 29:
System.out.println("Russian invasion of Ukraine, Ukraine–NATO relations Peace negotiations in the Russian invasion of Ukraine Ukrainian president Volodymyr Zelenskyy says that his country is ready to agree to a ceasefire if NATO protects parts of Ukraine. (Kyiv Post)"); 
           break;
case 30:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 30:");
          }
          break;
case 12:
          System.out.println("1. Enter a day in December 2024:");
          day=s.nextInt();
          switch(day){
case 1:
           System.out.println("U.S. National Security Advisor Jake Sullivan says that the United States will not return the nuclear weapons that they dismantled to Ukraine. (Reuters)");
           break;
case 2:
           System.out.println("U.S. Secretary of State Antony Blinken announces that the United States will provide Ukraine with a $725 million weapons package. (Reuters)");
           break;
case 3:
           System.out.println("Nothing significant to report");
           break;
case 4:
           System.out.println("Nothing significant to report");
           break;
case 5:
           System.out.println("Nothing significant to report");
           break;
case 6:
System.out.println("Southern front of the Russian invasion of Ukraine, Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike kills ten civilians in Zaporizhzhia, Ukraine, and injures four others, including two children. Separately, a missile attack on an administrative building in Kryvyi Rih,");
System.out.println(" Ukraine, kills two people and injures 16 others. (Reuters)"); 
           break;
case 7:
           System.out.println("Nothing significant to report");
           break;
case 8:
           System.out.println("Ukrainian President Volodymyr Zelenskyy says that 43,000 Ukrainian soldiers have been killed in action since Russia invaded Ukraine in 2022 and that 370,000 soldiers have been injured, while estimating the number of Russian casualties at 198,000 soldiers killed and more than 550,000 soldiers injured");
System.out.println(". (Politico)");
           break;
case 9:
           System.out.println("Nothing significant to report");
           break;
case 10:
System.out.println("Southern front of the Russian invasion of Ukraine A Russian missile strike on a private clinic in Zaporizhzhia, Ukraine, kills four civilians and injures 20 others. (Interfax Ukraine) (Al Arabiya)"); 
           break;
case 11:
System.out.println("Military aid to Ukraine during the Russo-Ukrainian War United States and the Russian invasion of Ukraine The United States Department of State approves a $266.4 million sale of F-16 maintenance equipment to Ukraine. (Ukrainska Pravda) (DSCA) (Newsweek) The Parliament of Canada approves the allocatio");
System.out.println("n of CA$764 million (US$587 million) in military aid to Ukraine. (Ukrainska Pravda)"); 
           break;
case 12:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Four police officers are injured in a drone attack on the barracks of a police regiment building in Grozny, Chechnya, Russia. (Kyiv Independent)"); 
           break;
case 13:
System.out.println("Moldova and the Russo-Ukrainian War The Parliament of Moldova votes in favor of declaring a 60-day national state of emergency beginning on December 16 due to Ukraine not renewing its transit contract with Gazprom to deliver Russian gas to Moldova. (Reuters) Russian strikes against Ukrainian infrast");
System.out.println("ructure Russia launches one of its largest attacks on the Ukrainian energy infrastructure since the conflict began, with about 290 missiles fired and drones striking multiple regions. The Russian Defense Ministry claims that the attack was in response to a recent Ukrainian ATACMS attack on Taganrog-");
System.out.println("Central air base in Rostov Oblast, Russia. (The Kyiv Independent) (UNN)"); 
           break;
case 14:
           System.out.println("Nothing significant to report");
           break;
case 15:
           System.out.println("Nothing significant to report");
           break;
case 16:
           System.out.println("Nothing significant to report");
           break;
case 17:
System.out.println("Russian Lieutenant General Igor Kirillov, head of the NBC Protection Troops, and his assistant are assassinated by an IED hidden inside of an e-scooter in Moscow, Russia. A Ukrainian source claims that the Security Service of Ukraine is responsible for the killings, after Kirillov was charged in abs");
System.out.println("entia yesterday for the use of chemical weapons, which made him a legitimate target. Dmitry Medvedev, deputy chairman of the Security Council of Russia, says that the Ukrainian leadership would face an imminent revenge for the killings. (BBC News) (Deccan Herald) Military aid to Ukraine during the R");
System.out.println("usso-Ukrainian War, Russia–NATO relations NATO's Security Assistance and Training for Ukraine command center in Wiesbaden, Germany, takes over coordination of Western military support to Ukraine from the United States. (Reuters)"); 
           break;
case 18:
           System.out.println("Nothing significant to report");
           break;
case 19:
           System.out.println("British defence secretary John Healey announces a proposal to send military advisors to train Ukrainian forces. (BBC News)");
           break;
case 20:
System.out.println("A Ukrainian missile strike kills six people and injures 10 others in Rylsk, Kursk Oblast, Russia, according to acting Kursk Oblast governor Alexander Khinshtein. Russia says that it will raise the issue of the missile strike at the United Nations Security Council. (Reuters) Kryvyi Rih strikes, Kyiv ");
System.out.println("strikes At least one person is killed and eight others are injured in Russian missile strikes on civilian infrastructure in Kryvyi Rih and Kyiv, Ukraine. (The Kyiv Independent) (Reuters)"); 
           break;
case 21:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine At least seven Ukrainian drones strike Kazan, Russia, six of which reportedly hit residential areas, including a 32-story apartment building. (Ukrainska Pravda) (Reuters)"); 
           break;
case 22:
System.out.println("Slovak Prime Minister Robert Fico holds a previously unannounced meeting with Russian President Vladimir Putin at the Kremlin in Moscow, Russia. (The Moscow Times) "); 
           break;
case 23:
           System.out.println("Nothing significant to report");
           break;
case 24:
           System.out.println("Nothing significant to report");
           break;
case 25:
           System.out.println("A series of Russian ballistic missile and drone strikes target critical energy infrastructure in cities across in Ukraine, killing at least two people, injuring 20 others, and causing widespread emergency blackouts. Ukrainian President Volodymyr Zelenskyy condemns Russian President Vladimir Putin fo");
System.out.println("r the inhumane attacks on Ukrainian infrastructure. (The Kyiv Independent) (The Guardian) (RTÉ)");
           break;
case 26:
           System.out.println("Nothing significant to report");
           break;
case 27:
System.out.println("South Korea confirms the first capture of a North Korean soldier fighting against Ukrainian forces in Kursk Oblast, Russia, with the soldier later dying from his injuries. (BBC News) (Reuters) "); 
           break;
case 28:
           System.out.println("Russian company Gazprom announces the supply of gas to Moldova will cease on January 1, 2025, alleging fails to fulfill its payment obligations. The Moldovan Prime Minister, Dorin Recean, accuses the Russian Government of deliberately weaponising energy flows to destabilise the country. (Euronews).");
           break;
case 29:
           System.out.println("Nothing significant to report");
           break;
case 30:
System.out.println("Prisoners of war in the Russian invasion of Ukraine Russia and Ukraine exchange hundreds of prisoners of war in a deal brokered by the United Arab Emirates. Ukraine says that many of those released by Russia are soldiers captured during the Siege of Mariupol in 2022. (BBC News)"); 
           break;
case 31:
           System.out.println("Nothing significant to report");
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
          }
          break;


       }
       break;
case 2025:
      //month in 2025
       
      System.out.println("1. Enter a month in 2025(1-January,2-February,....,12-December):");
      month=s.nextInt();
      switch(month){
         //day in 2025
case 1:
         System.out.println("1. Enter a day in January 2025(1-31):");
         day=s.nextInt();
           switch(day){
case 1:
              System.out.println("Russia's gas firm Gazprom suspends exports of Russian natural gas through Ukrainian pipelines after Ukraine refused to renew the transit agreement between its operator Naftogaz and Gazprom. However, Hungary will continue receiving Russian natural gas via the TurkStream pipeline. (Reuters)");
              break;
case 2:
              System.out.println("Ukrainian president Volodymyr Zelenskyy says that Ukraine will pledge support to the Syrian transitional government. (The Press Democrat)");
              break;
case 3:
              System.out.println("Ukrainian President Volodymyr Zelenskyy says that the country will not hold presidential elections as long as the country is under martial law, even if Russia puts it as a pre-condition for negotiations. (Kyiv Independent)");
              break;
case 4:
System.out.println("Eastern Ukraine campaign, Journalists killed during the Russo-Ukrainian War A war correspondent for the Russian newspaper Izvestia is killed in a Ukrainian drone strike in Donetsk Oblast, Ukraine. (Reuters) The Russian Armed Forces claims to have shot down eight American ATACMS missiles fired by Ukr");
System.out.println("aine and vows retaliation. (CNN)"); 
              break;
case 5:
System.out.println("Kursk offensive The Ukrainian Army launches a new offensive in Kursk Oblast, Russia. (BBC News)"); 
              break;
case 6:
System.out.println("Kherson strikes, Attacks on civilians in the Russian invasion of Ukraine A Russian drone attacks a civilian passenger bus in Kherson, Ukraine, reportedly killing at least one person and injuring at least nine others. (Reuters)"); 
              break;
case 7:
              System.out.println("Nothing significant to report");
              break;
case 8:
System.out.println("Zaporizhzhia strikes, Attacks on civilians in the Russian invasion of Ukraine Russian forces attack an industrial facility in Zaporizhzhia, Ukraine, killing 13 people and injuring 18 others. Further strikes on Zaporizhzhia with guided aerial bombs kill 13 more people and injure 32 others. (Ukrainska");
System.out.println(" Pravda) (Ukrainska Pravda 2)"); 
              break;
case 9:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine Russian artillery strikes kill two people in Siversk, Donetsk Oblast, Ukraine, according to the region's governor. In the Russian-controlled area of Kamianka-Dniprovska, Zaporizhzhia Oblast, Ukraine, the region's Russia-appointed governor says ");
System.out.println("that two people were killed by Ukrainian artillery strikes. (Reuters)"); 
              break;
case 10:
              System.out.println("The United States government imposes a new series of sanctions targeting Russia's energy sector, including the Gazprom Neft and Surgutneftegas oil companies. (CNN)");
              break;
case 11:
System.out.println("Eastern Ukraine campaign The Russian Army says that it has gained control of the settlement of Shevchenko in Donetsk Oblast, Ukraine. (Anadolu Agency) Kursk offensive, North Korean involvement in the Russian invasion of Ukraine Ukrainian President Volodymyr Zelenskyy announces that Ukraine has captu");
System.out.println("red two North Korean soldiers in healthy condition in Kursk Oblast, Russia, for the first time since North Korea entered the war, as the two previous North Korean prisoners of war died of their injuries shortly following their capture. (Reuters)"); 
              break;
case 12:
              System.out.println("Nothing significant to report");
              break;
case 13:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Russia accuses Ukraine of targeting the Russkaya compressor station in the Krasnodar Krai, which feeds gas for the TurkStream pipeline, in a failed drone attack two days ago. (S&P Global)"); 
              break;
case 14:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukraine strikes targets in the Republic of Tatarstan and Bryansk, Saratov, and Tula oblasts, Russia, with more than 200 drones and five ATACMS ballistic missiles, hitting ammunition depots, industrial plants and a refinery, in what Ukraine say");
System.out.println("s is its most massive and deepest attack inside Russia so far. (CNN) (BBC News) "); 
              break;
case 15:
              System.out.println("Russia launches a major ballistic and cruise missile attack on regions across Ukraine, targeting energy production and compelling authorities to shut down the power grid. (AP)");
              break;
case 16:
              System.out.println("British Prime Minister Keir Starmer visits Kyiv, Ukraine, to sign a 100-year agreement with Ukraine that will formalize British economic and military support for Ukraine. (Sky News) (BBC News)");
              break;
case 17:
              System.out.println("Iranian president Masoud Pezeshkian and Russian president Vladimir Putin sign the Iranian–Russian Treaty on Comprehensive Strategic Partnership. The 20-year deal will see cooperation between the two countries in multiple areas, including nuclear energy, counterterrorism, and environmental issues. (M");
System.out.println("iddle East Eye)");
              break;
case 18:
System.out.println("Four people are killed and 14 others are injured in a Russian ballistic missile strike on Kryvyi Rih, Ukraine, according to the Governor of Dnipropetrovsk Oblast Serhiy Lysak. (Euronews) Russian strikes against Ukrainian infrastructure At least four people are killed in Russian missile and drone att");
System.out.println("acks on Kyiv, Ukraine. (Al Jazeera) "); 
              break;
case 19:
              System.out.println("Nothing significant to report");
              break;
case 20:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine Ukrainian drones attack industrial facilities in Tatarstan, Russia, prompting the Russian Federal Air Transport Agency to temporarily suspend flights at Kazan International Airport in Kazan and Begishevo Airport in Nizhnekamsk. (ABC News) "); 
              break;
case 21:
              System.out.println("Nothing significant to report");
              break;
case 22:
              System.out.println("Nothing significant to report");
              break;
case 23:
              System.out.println("Nothing significant to report");
              break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A Ukrainian drone strike targets an oil refinery in Ryazan Oblast, Russia, in one of the largest Ukrainian drone attacks inside Russia of the conflict to date. The Russian military says it shot down at least 121 drones over 13 regions overnigh");
System.out.println("t. (BBC News) Kyiv strikes A Russian drone strikes a ten-storey apartment building in Fastiv, Kyiv Oblast, Ukraine, killing at least three people. (Euronews) Mobilization in Ukraine Ukraine finalizes military reforms aimed at recruiting 18- to 25-year-olds to the armed forces, penalizing draft dodge");
System.out.println("rs, and lowering the minimum compulsory military service age to 25 from 27. (The Kyiv Independent) The Ukrainian Coordination Headquarters for the Treatment of Prisoners of War announces that, with assistance from the International Committee of the Red Cross, the bodies of 757 Ukrainian soldiers hav");
System.out.println("e been returned to Ukraine. (The Kyiv Independent)"); 
              break;
case 25:
              System.out.println("Nothing significant to report");
              break;
case 26:
System.out.println("Velyka Novosilka offensive The Russian Ministry of Defence claims that Russian forces have captured the village of Velyka Novosilka, Donetsk Oblast. (Mathrubhumi)"); 
              break;
case 27:
              System.out.println("Nothing significant to report");
              break;
case 28:
              System.out.println("Nothing significant to report");
              
              break;
case 29:
System.out.println("Battle of Chasiv Yar Russian forces capture the city of Chasiv Yar in Donetsk Oblast, Ukraine, after a year of intense fighting for control of the front line city. (The Moscow Times)"); 
              break;
case 30:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian drone strikes a multi-storey apartment building in Sumy, Ukraine, killing nine people and injuring 13 others. (Reuters)"); 
              break;
case 31:
System.out.println("Odesa strikes Russian forces launch ballistic missiles at the centre of Odesa and its port, severely damaging numerous civilian buildings, including the historic Bristol Hotel. At least two people are reportedly injured. (Reuters)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 31:");
                      }
                      break;
case 2:
         System.out.println("1. Enter a day in February 2025(1-24) :");
         day=s.nextInt();
         switch(day){
case 1:
System.out.println("Attacks on civilians in the Russian invasion of Ukraine A Russian missile strike on a residential building in Poltava, Ukraine, reportedly kills at least fourteen people and injures at least 17 others. A separate strike kills three police officers in Sumy Oblast. (Reuters)"); 
              break;
case 2:
              System.out.println("Nothing significant to report");
              break;
case 3:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine A bomb explodes inside a building in Moscow, Russia, killing two people and wounding three. The presumed main target, Armen Sarkisyan, a pro-Russia leader in the Donbas, is among the dead. (Reuters)"); 
              break;
case 4:
System.out.println("Russian invasion of Ukraine Russian attacks on civilians in the Russo-Ukrainian War A Russian missile strikes a residential building in Izium, Kharkiv Oblast, Ukraine, killing four people and injuring twenty others. (Ukrainska Pravda) Peace negotiations in the Russian invasion of Ukraine Ukraine Pre");
System.out.println("sident Volodymyr Zelenskyy says in a interview with British journalist Piers Morgan that he is ready for direct talks with Russian President Vladimir Putin if it is a setup to end the war. (Kyiv Independent)"); 
              break;
case 5:
              System.out.println("Nothing significant to report");
              break;
case 6:
System.out.println("Attacks on civilians during the Russian invasion of Ukraine Three people are killed in a Russian guided bomb attack that destroyed a residential building in Myropillia, Sumy Oblast, Ukraine, according to Ukrainian officials. (Reuters) Military aid to Ukraine during the Russo-Ukrainian War The Ukrain");
System.out.println("ian Air Force receives the first shipment of Mirage 2000 fighter jets from France and more F-16 Fighting Falcons from the Netherlands. (DW)"); 
              break;
case 7:
System.out.println("Battle of Toretsk Russia says its forces have taken full control of Toretsk, Donetsk Oblast, after months of urban warfare. (Reuters)"); 
              break;
case 8:
              System.out.println("Nothing significant to report");
              break;
case 9:
              System.out.println("Nothing significant to report");
              break;
case 10:
              System.out.println("Nothing significant to report");
              break;
case 11:
              System.out.println("Nothing significant to report");
              break;
case 12:
System.out.println("Kyiv strikes Russian forces launch an overnight ballistic missile attack on Kyiv, Ukraine, killing one person and injuring four others. (Reuters) United States and the Russian invasion of Ukraine, Peace negotiations in the Russian invasion of Ukraine After holding a telephone call with Russian presi");
System.out.println("dent Vladimir Putin, U.S. president Donald Trump says negotiations to end the war will start immediately. (CNN) (Euronews)"); 
              break;
case 13:
System.out.println("Chernobyl Nuclear Power Plant drone strike A drone strikes the New Safe Confinement structure housing the site of the Chernobyl disaster. Ukrainian President Volodymyr Zelenskyy states that a Russian combat drone caused significant damage to the structure, but did not produce an increase in external");
System.out.println(" radiation levels. (CNN)"); 
              break;
case 14:
              System.out.println("Nothing significant to report");
              break;
case 15:
System.out.println("Russia–United States relations Russian Foreign Minister Sergey Lavrov and U.S. Secretary of State Marco Rubio speak by telephone about the Russo-Ukrainian War, the Gaza war, the sanctions against Russia, and removing restrictions on each country's diplomatic missions. They also discuss preparations ");
System.out.println("for a high-level summit in Saudi Arabia. This is the first time the U.S. and Russia had contact at the foreign minister level in almost two years. (Financial Times)"); 
              break;
case 16:
System.out.println("Mykolaiv strikes, Russian strikes against Ukrainian infrastructure Russia launches drone strikes across Ukraine, injuring at least one person and damaging a thermal power station in Mykolaiv, leaving 46,000 people without heat. Ukraine says that it shot down 95 of 143 drones while disrupting 46 othe");
System.out.println("rs by electronic countermeasures. (Reuters)"); 
              break;
case 17:
System.out.println("2024 Kharkiv offensive Russia says its forces have captured the village of Fyholivka in Kharkiv Oblast, Ukraine. (Reuters)"); 
              break;
case 18:
              System.out.println("Nothing significant to report");
              break;
case 19:
System.out.println("Russian strikes against Ukrainian infrastructure At least one person is killed and 14 others are injured in Russian missile and drone strikes across Ukraine, including a large drone attack on energy infrastructure in Odesa that leaves 160,000 residents without heating and electricity. (The Kyiv Inde");
System.out.println("pendent)"); 
              break;
case 20:
              System.out.println("Nothing significant to report");
              break;
case 21:
              System.out.println("Nothing significant to report");
              break;
case 22:
              System.out.println("Nothing significant to report");
              break;
case 23:
              System.out.println("Protests are held across Europe and Canada to mark the 3rd year anniversary of the Russian invasion of Ukraine. (Kyiv Independent)");
              break;
case 24:
System.out.println("Attacks in Russia during the Russian invasion of Ukraine The Ryazan Refinery in Ryazan, Russia, suspends operations after an overnight drone attack by Ukraine destroys the main crude distillation unit at the facility. Locals report hearing at least five explosions during the attack. (Reuters)"); 
  break;
  default:
            System.out.println("Select a day from 1 to 24:");
         }
         break;
         


      }
}
break;






         }



        }
}


}

