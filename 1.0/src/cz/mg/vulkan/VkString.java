package cz.mg.vulkan;

public class VkString extends VkChar.Array {
    public VkString(String string) {
        super(string.length() + 1);
        for(int i = 0; i < string.length(); i++) setValue(i, (byte) string.charAt(i));
        setValue(string.length(), (byte) 0);
    }

    protected VkString(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress, countNative(vkaddress));
    }

    public VkString(VkChar ch){
        this(ch.getVkMemory(), ch.getVkAddress());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count(); i++) sb.append((char)getValue(i));
        return sb.toString();
    }

    protected static native int countNative(long vkaddress);

    public static class Array extends VkChar.Array.Array2 {
        private final VkString[] array;

        public Array(String... strings) {
            super(strings.length);
            this.array = new VkString[strings.length];
            for(int i = 0; i < strings.length; i++){
                this.array[i] = new VkString(strings[i]);
                setValue(i, this.array[i].getVkAddress());
            }
        }
    }
}
