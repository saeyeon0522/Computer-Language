package Question1;

public interface Bootable {
    public abstract void boot();
    default void shutdown() {
        System.out.println("---Shutdown---");
    }
}
