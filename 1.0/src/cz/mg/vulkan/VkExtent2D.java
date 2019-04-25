package cz.mg.vulkan;

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

    public VkExtent2D(int width, int height) {
        super(sizeof());
        getWidth().setValue(width);
        getHeight().setValue(height);
    }

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkUInt32 width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getWidthQ() {
        return getWidth().getValue();
    }

    public void setWidth(int width) {
        getWidth().setValue(width);
    }

    protected static native long getWidth(long address);
    protected static native void setWidth(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkUInt32 height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getHeightQ() {
        return getHeight().getValue();
    }

    public void setHeight(int height) {
        getHeight().setValue(height);
    }

    protected static native long getHeight(long address);
    protected static native void setHeight(long address, long height);


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
