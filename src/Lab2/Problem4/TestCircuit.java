package Problem4;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent Resistance: " + R + " Ohm");

        circuit.applyPotentialDiff(24.0);
        System.out.println("Applied Voltage: 24.0 V");
        System.out.println("Total Current: " + circuit.getCurrent() + " A");
        System.out.println("Total Power: " + circuit.getPower() + " W");

        System.out.println("\nResistor a: V = " + a.getPotentialDiff() + " V, I = " + a.getCurrent() + " A");
        System.out.println("Resistor b: V = " + b.getPotentialDiff() + " V, I = " + b.getCurrent() + " A");
        System.out.println("Resistor c: V = " + c.getPotentialDiff() + " V, I = " + c.getCurrent() + " A");
        System.out.println("Resistor d: V = " + d.getPotentialDiff() + " V, I = " + d.getCurrent() + " A");
        System.out.println("Resistor e: V = " + e.getPotentialDiff() + " V, I = " + e.getCurrent() + " A");

        System.out.println("\nSeries f (a+b): R = " + f.getResistance() + " Ohm");
        System.out.println("Parallel g (c||d): R = " + g.getResistance() + " Ohm");
        System.out.println("Series h (g+e): R = " + h.getResistance() + " Ohm");
    }
}
