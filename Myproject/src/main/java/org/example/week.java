package org.example;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class week {
public String returnDays(){
    LocalDate today = LocalDate.now();
    DayOfWeek day = today.getDayOfWeek();

   String dayNom = day.getDisplayName(TextStyle.FULL,new Locale("pt","BR"));
    return "Dia da semana: "+dayNom;
}
}
