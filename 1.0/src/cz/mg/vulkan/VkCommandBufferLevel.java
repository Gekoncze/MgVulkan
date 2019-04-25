package cz.mg.vulkan;

public class VkCommandBufferLevel extends VkEnum {
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

    public VkCommandBufferLevel() {
    }

    protected VkCommandBufferLevel(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCommandBufferLevel(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferLevel(int value) {
        setValue(value);
    }

    public VkCommandBufferLevel(VkPointer pointer) {
        super(pointer);
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

        public Array(VkCommandBufferLevel o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValue(i, values[i]);
        }

        public int getValue(int i){
            return getValueNative(address(i));
        }

        public void setValue(int i, int value){
            setValueNative(address(i), value);
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkCommandBufferLevel get(int i){
            return new VkCommandBufferLevel(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
