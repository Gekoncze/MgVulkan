package cz.mg.vulkan;

public class VkString extends VkChar {
    public VkString(String string) {
        super(new VkMemory(string.length() * VkChar.sizeof() + 1));
        for(int i = 0; i < string.length(); i++) VkChar.setValue(getVkAddress()+i*VkChar.sizeof(), (byte) string.charAt(i));
        VkChar.setValue(getVkAddress()+(string.length())*VkChar.sizeof(), (byte) 0);
    }

    public VkString(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkString(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkString(VkChar ch){
        this(ch.getVkMemory(), ch.getVkAddress());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = count(getVkAddress());
        for(int i = 0; i < c; i++) sb.append((char)VkChar.getValue(getVkAddress()+i*VkChar.sizeof()));
        return sb.toString();
    }

    private static native int count(long vkaddress);

    public static class Array extends VkChar.Pointer.Array {
        private final VkString[] array;

        public Array(String[] strings) {
            super(strings.length);
            this.array = new VkString[strings.length];
            for(int i = 0; i < strings.length; i++){
                this.array[i] = new VkString(strings[i]);
                get(i).setValue(this.array[i].getVkAddress());
            }
        }
    }
}
