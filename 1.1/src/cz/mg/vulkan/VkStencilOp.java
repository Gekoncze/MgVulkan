package cz.mg.vulkan;

public class VkStencilOp extends VkEnum {
    public static final int VK_STENCIL_OP_KEEP = 0;
    public static final int VK_STENCIL_OP_ZERO = 1;
    public static final int VK_STENCIL_OP_REPLACE = 2;
    public static final int VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3;
    public static final int VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4;
    public static final int VK_STENCIL_OP_INVERT = 5;
    public static final int VK_STENCIL_OP_INCREMENT_AND_WRAP = 6;
    public static final int VK_STENCIL_OP_DECREMENT_AND_WRAP = 7;

    public VkStencilOp() {
    }

    protected VkStencilOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkStencilOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkStencilOp(int value) {
        setValue(value);
    }

    public VkStencilOp(VkPointer pointer) {
        super(pointer);
    }

    @Override
    public String toString() {
        if(getValue() == VK_STENCIL_OP_KEEP) return "VK_STENCIL_OP_KEEP";
        if(getValue() == VK_STENCIL_OP_ZERO) return "VK_STENCIL_OP_ZERO";
        if(getValue() == VK_STENCIL_OP_REPLACE) return "VK_STENCIL_OP_REPLACE";
        if(getValue() == VK_STENCIL_OP_INCREMENT_AND_CLAMP) return "VK_STENCIL_OP_INCREMENT_AND_CLAMP";
        if(getValue() == VK_STENCIL_OP_DECREMENT_AND_CLAMP) return "VK_STENCIL_OP_DECREMENT_AND_CLAMP";
        if(getValue() == VK_STENCIL_OP_INVERT) return "VK_STENCIL_OP_INVERT";
        if(getValue() == VK_STENCIL_OP_INCREMENT_AND_WRAP) return "VK_STENCIL_OP_INCREMENT_AND_WRAP";
        if(getValue() == VK_STENCIL_OP_DECREMENT_AND_WRAP) return "VK_STENCIL_OP_DECREMENT_AND_WRAP";
        return "UNKNOWN";
    }

    public static class Array extends VkStencilOp implements cz.mg.collections.array.ReadonlyArray<VkStencilOp> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkStencilOp.sizeof()));
            this.count = count;
        }

        public Array(VkStencilOp o, int count){
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
        public VkStencilOp get(int i){
            return new VkStencilOp(getVkMemory(), address(i));
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
