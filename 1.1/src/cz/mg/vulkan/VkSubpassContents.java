package cz.mg.vulkan;

public class VkSubpassContents extends VkEnum {
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;

    public VkSubpassContents() {
    }

    protected VkSubpassContents(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubpassContents(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassContents(int value) {
        setValue(value);
    }

    public VkSubpassContents(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_SUBPASS_CONTENTS_INLINE) return "VK_SUBPASS_CONTENTS_INLINE";
        if(getValue() == VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS) return "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS";
        return "UNKNOWN";
    }

    public static class Array extends VkSubpassContents implements cz.mg.collections.array.ReadonlyArray<VkSubpassContents> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassContents.sizeof()));
            this.count = count;
        }

        public Array(VkSubpassContents o, int count){
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
        public VkSubpassContents get(int i){
            return new VkSubpassContents(getVkMemory(), address(i));
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
