package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkViewport.html">khronos documentation</a>
 **/
public class VkViewport extends VkObject {
    public VkViewport() {
        super(sizeof());
    }

    public VkViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkViewport(VkFloat x, VkFloat y, VkFloat width, VkFloat height, VkFloat minDepth, VkFloat maxDepth) {
        super(sizeof());
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setMinDepth(minDepth);
        setMaxDepth(maxDepth);
    }

    public VkFloat getX() {
        return new VkFloat(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkFloat x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getX(long address);
    private static native void setX(long address, long x);

    public VkFloat getY() {
        return new VkFloat(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkFloat y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getY(long address);
    private static native void setY(long address, long y);

    public VkFloat getWidth() {
        return new VkFloat(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkFloat width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getWidth(long address);
    private static native void setWidth(long address, long width);

    public VkFloat getHeight() {
        return new VkFloat(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkFloat height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getHeight(long address);
    private static native void setHeight(long address, long height);

    public VkFloat getMinDepth() {
        return new VkFloat(getVkMemory(), getMinDepth(getVkAddress()));
    }

    
    public void setMinDepth(VkFloat minDepth) {
        setMinDepth(getVkAddress(), minDepth != null ? minDepth.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMinDepth(long address);
    private static native void setMinDepth(long address, long minDepth);

    public VkFloat getMaxDepth() {
        return new VkFloat(getVkMemory(), getMaxDepth(getVkAddress()));
    }

    
    public void setMaxDepth(VkFloat maxDepth) {
        setMaxDepth(getVkAddress(), maxDepth != null ? maxDepth.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxDepth(long address);
    private static native void setMaxDepth(long address, long maxDepth);


    public static native long sizeof();

    public static class Array extends VkViewport implements cz.mg.collections.array.ReadonlyArray<VkViewport> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewport.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewport o){
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
        public VkViewport get(int i){
            return new VkViewport(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkViewport.Pointer implements cz.mg.collections.array.ReadonlyArray<VkViewport.Pointer> {
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

            public Array(VkViewport[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkViewport.Pointer get(int i){
                return new VkViewport.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
