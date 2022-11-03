package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String convertDateParDataEHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatador.format(data);

    }
    public static String convertDateParData(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(data);

    }
    public static  String convertDateParHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);

    }
}
