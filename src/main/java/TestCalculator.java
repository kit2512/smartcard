import com.licel.jcardsim.base.Simulator;
import javacard.framework.AID;

public class TestCalculator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        AID appletAID = AIDUtil.create("F000000001");
        simulator.installApplet(appletAID, Calculator.class);
        simulator.selectApplet(appletAID);
        byte[] response = simulator.transmitCommand(new byte[]{(byte) 0xA0, 0x02, 0x02, 0x03});
        System.out.println(new String(response));
    }
}
