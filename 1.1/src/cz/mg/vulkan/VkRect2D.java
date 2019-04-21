package cz.mg.vulkan;

public class VkRect2D extends VkObject {
    public VkRect2D() {
        super(sizeof());
    }

    public VkRect2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRect2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkRect2D(int x, int y, int width, int height) {
        super(sizeof());
        getOffset().getX().setValue(x);
        getOffset().getY().setValue(y);
        getExtent().getWidth().setValue(width);
        getExtent().getHeight().setValue(height);
    }

    public VkOffset2D getOffset() {
        return new VkOffset2D(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkOffset2D offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkExtent2D getExtent() {
        return new VkExtent2D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent2D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getExtent(long address);
    private static native void setExtent(long address, long extent);


    public static native long sizeof();

    public static class Array extends VkRect2D implements cz.mg.collections.array.ReadonlyArray<VkRect2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRect2D.sizeof()));
            this.count = count;
        }

        public Array(int count, VkRect2D o){
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
        public VkRect2D get(int i){
            return new VkRect2D(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRect2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRect2D.Pointer> {
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

            public Array(VkRect2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRect2D.Pointer get(int i){
                return new VkRect2D.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
