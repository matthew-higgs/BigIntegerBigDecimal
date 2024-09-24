import java.math.BigDecimal;
import java.math.BigInteger;

public class App {

    public static void main(String[] args) {

        BigInteger number1 = new BigInteger("1209384712039847102398457123098471230984710239847");
        BigInteger number2 = new BigInteger("30192837409128374012938740129384710239847102398471203984712039847102398471023984710234");

        BigInteger gcd = number1.gcd(number2);
        System.out.println(gcd);

        BigDecimal decimal1 = new BigDecimal("45645621389791631589564813472537692367945187924197238923696932");
        BigDecimal decimal2 = new BigDecimal("666666666666666666666666666666666666666666666666666666666666666666666666");

        BigDecimal decimal3 = decimal1.pow(2);
        BigDecimal decimal4 = decimal2.pow(2);

        System.out.println(decimal3);
        System.out.println(decimal4);

    }

}
