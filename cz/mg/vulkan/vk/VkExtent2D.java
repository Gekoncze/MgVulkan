package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtent2D.html">khronos documentation</a>
 **/
public class VkExtent2D extends VkObject {
    public VkExtent2D() {
        super(sizeof());
    }

    public VkExtent2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExtent2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkExtent2D(VkUInt32 width, VkUInt32 height) {
        super(sizeof());
        setWidth(width);
        setHeight(height);
    }

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkUInt32 width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getWidth(long address);
    private static native void setWidth(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkUInt32 height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getHeight(long address);
    private static native void setHeight(long address, long height);


    public static native long sizeof();

    public static class Array extends VkExtent2D implements cz.mg.collections.array.ReadonlyArray<VkExtent2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExtent2D.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExtent2D o){
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
        public VkExtent2D get(int i){
            return new VkExtent2D(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExtent2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExtent2D.Pointer> {
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

            public Array(VkExtent2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExtent2D.Pointer get(int i){
                return new VkExtent2D.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
