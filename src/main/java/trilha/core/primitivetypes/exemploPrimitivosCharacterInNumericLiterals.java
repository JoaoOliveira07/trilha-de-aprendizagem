package trilha.core.primitivetypes;

public class exemploPrimitivosCharacterInNumericLiterals {
    public static void main(String[] args) {
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexLong = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        int x1 = 5_2;
        int x3 = 5_____2;
        int x5 = 0x5_2;

        //Formas invalidas

        /*float pi1 = 3_.1415F; //Antes ou depois do ponto pode ter o _
        float pi2 = 3._1415F;
        long socialSecutiryNumber1 = 999_99_9999_L; // _ não pode vir antes do L, F , D
        int x2 = 52_; //_ não pode vir por ultimo
        int x4 = 0x_52; // _ não pode vir apos o x, somente apos algum outro numero
        int x6 = 0_x52; // _ não pode vir antes do x também
        int x7 = 0x52_;*/
    }
}
