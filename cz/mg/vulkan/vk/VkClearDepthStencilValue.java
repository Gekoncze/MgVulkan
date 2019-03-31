package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkClearDepthStencilValue.html">khronos documentation</a>
 **/
public class VkClearDepthStencilValue extends VkObject {
    public VkClearDepthStencilValue() {
        super(sizeof());
    }

    public VkClearDepthStencilValue(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkClearDepthStencilValue(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkClearDepthStencilValue(VkFloat depth, VkUInt32 stencil) {
        super(sizeof());
        setDepth(depth);
        setStencil(stencil);
    }

    public VkFloat getDepth() {
        return new VkFloat(getVkMemory(), getDepth(getVkAddress()));
    }

    public void setDepth(VkFloat depth) {
        setDepth(getVkAddress(), depth.getVkAddress());
    }

    private static native long getDepth(long address);
    private static native void setDepth(long address, long depth);

    public VkUInt32 getStencil() {
        return new VkUInt32(getVkMemory(), getStencil(getVkAddress()));
    }

    public void setStencil(VkUInt32 stencil) {
        setStencil(getVkAddress(), stencil.getVkAddress());
    }

    private static native long getStencil(long address);
    private static native void setStencil(long address, long stencil);


    public static native long sizeof();

    public static class Array extends VkClearDepthStencilValue implements cz.mg.collections.array.ReadonlyArray<VkClearDepthStencilValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkClearDepthStencilValue get(int i){
            return new VkClearDepthStencilValue(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkClearDepthStencilValue[] a) {
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
