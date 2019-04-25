package cz.mg.vulkan;

public class VkCommandBufferLevel extends VkEnum {
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

    public VkCommandBufferLevel() {
    }

    public VkCommandBufferLevel(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferLevel(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkCommandBufferLevel(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_COMMAND_BUFFER_LEVEL_PRIMARY) return "VK_COMMAND_BUFFER_LEVEL_PRIMARY";
        if(getValue() == VK_COMMAND_BUFFER_LEVEL_SECONDARY) return "VK_COMMAND_BUFFER_LEVEL_SECONDARY";
        return "UNKNOWN";
    }

    public static class Array extends VkCommandBufferLevel implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferLevel> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferLevel.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandBufferLevel o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkCommandBufferLevel get(int i){
            return new VkCommandBufferLevel(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
