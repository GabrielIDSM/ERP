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
    
    public static boolean dataJaPassou_EstamosNaData(String[] data){
        Calendar dataHoje = Calendar.getInstance();
        //Cria um array int com a data de hoje
        int[] dataHojeArr = new int[3];
        dataHojeArr[0] = dataHoje.get(Calendar.DAY_OF_MONTH);
        dataHojeArr[1] = dataHoje.get(Calendar.MONTH);
        dataHojeArr[2] = dataHoje.get(Calendar.YEAR);
        //Cria um array int com a data
        int[] dataPedido = new int[3];
        dataPedido[0] = Integer.parseInt(data[0]);
        dataPedido[1] = Integer.parseInt(data[1]);
        dataPedido[2] = Integer.parseInt(data[2]);
        //Efetua comparações
        if(dataHojeArr[2] > dataPedido[2]){
            return true;
        }else if(dataHojeArr[2] == dataPedido[2]){
            if (dataHojeArr[1] > dataPedido[1]) {
                return true;
            } else if (dataHojeArr[1] == dataPedido[1]) {
                if (dataHojeArr[0] >= dataPedido[0]) {
                    return true;
                }else{
                    return false;
                }
            } else {
                return false;
            }
        }else{
            return false;
        }      
    }
}
