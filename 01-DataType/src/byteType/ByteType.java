package byteType;

/**
 * about byte
 *
 * @Author ChenMingYang
 * @Date 2021-05-22 20:40
 */

public class ByteType {


    private static void commoninfo_Byte() {
        System.out.println("byte 的位数=" + Byte.SIZE);
        System.out.println("byte 的字节数=" + Byte.BYTES);
        byte Max_Byte = Byte.MAX_VALUE;
        byte Min_Byte = Byte.MIN_VALUE;
        System.out.println("数据范围 = [" + Min_Byte + "," + Max_Byte + "]");
    }
}
