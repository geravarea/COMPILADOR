/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2475;

/**
 *
 * @author Gerardo Vargas
 */
 public class Diccionario
 {
    private final String simbolo [][]= new String [100][3];
    public Diccionario()
    {
        simbolo [0][0]="entero";    simbolo[0][1]="11";     simbolo[0][2]="@11";
        simbolo [1][0]="char";      simbolo[1][1]="12";     simbolo[1][2]="@12";
        simbolo [2][0]="decimal";   simbolo[2][1]="13";     simbolo[2][2]="@13";
        simbolo [3][0]="if";        simbolo[3][1]="14";     simbolo[3][2]="#14";
        simbolo [4][0]="else";      simbolo[4][1]="15";     simbolo[4][2]="#15";
        simbolo [5][0]="main";      simbolo[5][1]="16";     simbolo[5][2]="#@@16";
        simbolo [6][0]="clase";     simbolo[6][1]="17";     simbolo[6][2]="#@17";
        simbolo [7][0]="imprimir";  simbolo[7][1]="18";     simbolo[7][2]="@#@18";
        simbolo [8][0]="=";         simbolo[8][1]="19";     simbolo[8][2]="@@19";
        simbolo [9][0]="+";         simbolo[9][1]="20";     simbolo[9][2]="@@20";
        simbolo [10][0]="-";        simbolo[10][1]="21";    simbolo[10][2]="@@21";
        simbolo [11][0]="*";        simbolo[11][1]="22";    simbolo[11][2]="@@22";
        simbolo [12][0]="/";        simbolo[12][1]="23";    simbolo[12][2]="@@23";
        simbolo [13][0]=".";        simbolo[13][1]="24";    simbolo[13][2]="##24";
        simbolo [14][0]=",";        simbolo[14][1]="25";    simbolo[14][2]="##25";
        simbolo [15][0]="{";        simbolo[15][1]="26";    simbolo[15][2]="-@26";
        simbolo [16][0]="}";        simbolo[16][1]="27";    simbolo[16][2]="-@27";
        simbolo [17][0]="[";        simbolo[17][1]="28";    simbolo[17][2]="-#28";
        simbolo [18][0]="]";        simbolo[18][1]="29";    simbolo[18][2]="-#29";
        simbolo [19][0]="(";        simbolo[19][1]="30";    simbolo[19][2]="*#30";
        simbolo [20][0]=")";        simbolo[20][1]="31";    simbolo[20][2]="*#31";
        simbolo [21][0]="'";        simbolo[21][1]="32";    simbolo[21][2]="#-@32";
        simbolo [22][0]="&";        simbolo[22][1]="33";    simbolo[22][2]="#-@-33";
        simbolo [23][0]=";";        simbolo[23][1]="34";    simbolo[23][2]="#-@-34";
        simbolo [24][0]="<";        simbolo[24][1]="35";    simbolo[24][2]="#-@-35";
        simbolo [25][0]=">";        simbolo[25][1]="36";    simbolo[25][2]="#-@-36";
        }
    
    public String getValor(int id){
        return simbolo [id][0];
    }
      public String getValor2(int id){
        return simbolo [id][2];
    }
    
    public void setValor(int id, String valor){
        simbolo[id][3]=valor;
    }
 }
  
