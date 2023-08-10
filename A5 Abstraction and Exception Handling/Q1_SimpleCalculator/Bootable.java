package Question3.Q1_SimpleCalculator;

public interface Bootable {
    public abstract void boot();
    default void shutdown() {
        System.out.println("---Shutdown---");
    }
}
