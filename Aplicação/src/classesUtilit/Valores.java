package classesUtilit;

public class Valores {
    public static String retornaStringSaldo(String saldoInicial){
        //Verifica se há notação cientifica
        boolean NC = false;
        char[] auxNC = saldoInicial.toCharArray();
        for (int i = 0; i < auxNC.length; i++) {
            if (auxNC[i] == 'E') {
                NC = true;
                break;
            }
        }
        String saldoFinal = "";
        String[] auxSaldoPartes = new String[2];
        if (!NC) {
            saldoInicial = saldoInicial.replace('.',',');
            auxSaldoPartes = saldoInicial.split(",");
            String auxSaldop1 = auxSaldoPartes[0];
            String auxSaldop2 = auxSaldoPartes[1];         
            //Configurando a primeira parte da String
            String auxSaldop1Final = "";
            char[] auxSaldop1Char = auxSaldop1.toCharArray();
            int limite = 0;
            if(auxSaldop1Char[0] == '-'){
                limite = 1;
            }
            int i = auxSaldop1.length()-1, j = 0;
            while (i >= limite) {
                if (j % 3 == 0 && i != auxSaldop1.length()-1) {
                    auxSaldop1Final += " ";
                    auxSaldop1Final += auxSaldop1Char[i];
                } else {
                    auxSaldop1Final += auxSaldop1Char[i];
                }
                i--;
                j++;
            }
            if(auxSaldop1Char[0] == '-') auxSaldop1Final += '-';
            StringBuffer sb = new StringBuffer(auxSaldop1Final);
            sb.reverse();
            auxSaldop1Final = sb.toString();
            //Configurando a segunda parte da String
            char[] auxSaldop2Char = auxSaldop2.toCharArray();
            String auxSaldop2Final = "";
            if(auxSaldop2Char.length != 2){
                if(auxSaldop2Char.length == 1){
                    auxSaldop2Final += auxSaldop2;
                    auxSaldop2Final += "0";
                }
                else{
                    auxSaldop2Final += auxSaldop2.substring(0, 2);
                }
            }else{
                auxSaldop2Final = auxSaldop2;
            }
            //Montando a String final
            saldoFinal += "R$" + auxSaldop1Final + "," + auxSaldop2Final;
        }
        return saldoFinal;
    }
}
