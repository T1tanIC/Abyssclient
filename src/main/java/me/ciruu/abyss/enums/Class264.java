package me.ciruu.abyss.enums;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Class264 {
    public static final Class264 RGBA;
    public static final Class264 HEX;
    public static final Class264 HSL;
    private static final Class264[] Field3248;

    static {
        Class264[] class264Array = new Class264[3];
        Class264[] class264Array2 = class264Array;
        class264Array[0] = RGBA = new Class264("RGBA", 0);
        class264Array[1] = HEX = new Class264("HEX", 1);
        class264Array[2] = HSL = new Class264("HSL", 2);
        Field3248 = class264Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */

    protected Class264(String name, int ordinal) {
        super();
    }

    public static Class264[] values() {
        return (Class264[])Field3248.clone();
    }

    public static Class264 valueOf(String string) {
        return null;
    }
}
