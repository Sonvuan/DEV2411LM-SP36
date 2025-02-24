package Lab05.BaiThucHanh1;

import java.util.Scanner;

public class ConvertTemperature {
    private float temperNum;
    private char ch;
    private  float convertC2F(){
        return (float) (temperNum*1.8+32);
    }
    private  float convertF2C(){
        return (float) ((temperNum -32) /1.8);
    }

    /**
     *
     * @param nhietDo chi so nhiet do muon chuyen doi
     * @param isToC True neu muon chuyen doi tu f sang c. false neu muon tu c sang f
     * @return void
     * @See lenh in ra man hinh chuyen doi
     */
    public void convert(float nhietDo, boolean isToC){
        temperNum = nhietDo;
        if(isToC){
            System.out.println("Nhiet do "+ nhietDo + " C = " +convertC2F() + " F ");
        }else {
            System.out.println("Nhiet do "+ nhietDo + " F = " +convertF2C() + " C ");
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nhiet do can chuyen doi: ");
        float nhietDo = sc.nextFloat();
        System.out.println("Nhiet do ban vua nhap la: (bam C hoặc F) ");
        char ch = sc.next().charAt(0);
        ConvertTemperature ct = new ConvertTemperature();
        switch(ch){
            case 'c':
                ct.convert(nhietDo,true);
                break;
            case 'f':
                ct.convert(nhietDo, false);
                break;
        }
    }
    public static void main(String[] args) {
        ConvertTemperature ct = new ConvertTemperature();
        ct.input();

    }
}
