package classesUtilit;

import java.util.Calendar;

public abstract class Datas {
    public static String retornaStringDataAtual(){
        int[] data = new int[3];
        String resultado = "";
        Calendar auxCalendar = Calendar.getInstance();
        data[0] = auxCalendar.get(Calendar.DAY_OF_MONTH);
        data[1] = auxCalendar.get(Calendar.MONTH);
        data[2] = auxCalendar.get(Calendar.YEAR);
        if(data[0] < 10){
            resultado += "0" + data[0] + "/";
        }else{
            resultado += data[0] + "/";
        }
        if(data[1] < 9){
            resultado += "0" + (data[1]+1) + "/";
        }else{
            resultado += (data[1]+1) + "/";
        }
        resultado += data[2];
        return resultado;
    }
}
