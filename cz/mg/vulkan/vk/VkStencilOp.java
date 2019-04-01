package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilOp.html">khronos documentation</a>
 **/
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

    public VkStencilOp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkStencilOp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkStencilOp(int value) {
        setValue(value);
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

        public Array(int count, VkStencilOp o){
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkStencilOp get(int i){
            return new VkStencilOp(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkStencilOp.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkStencilOp[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
