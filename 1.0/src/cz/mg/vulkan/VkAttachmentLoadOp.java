package cz.mg.vulkan;

public class VkAttachmentLoadOp extends VkEnum {
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;

    public VkAttachmentLoadOp() {
    }

    protected VkAttachmentLoadOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAttachmentLoadOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAttachmentLoadOp(int value) {
        setValue(value);
    }

    public VkAttachmentLoadOp(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_ATTACHMENT_LOAD_OP_LOAD) return "VK_ATTACHMENT_LOAD_OP_LOAD";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_CLEAR) return "VK_ATTACHMENT_LOAD_OP_CLEAR";
        if(getValue() == VK_ATTACHMENT_LOAD_OP_DONT_CARE) return "VK_ATTACHMENT_LOAD_OP_DONT_CARE";
        return "UNKNOWN";
    }

    public static class Array extends VkAttachmentLoadOp implements cz.mg.collections.array.ReadonlyArray<VkAttachmentLoadOp> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentLoadOp.sizeof()));
            this.count = count;
        }

        public Array(VkAttachmentLoadOp o, int count){
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
        public VkAttachmentLoadOp get(int i){
            return new VkAttachmentLoadOp(getVkMemory(), address(i));
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
