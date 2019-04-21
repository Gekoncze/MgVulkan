package cz.mg.vulkan;

public class VkOffset2D extends VkObject {
    public VkOffset2D() {
        super(sizeof());
    }

    public VkOffset2D(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkOffset2D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkOffset2D(int x, int y){
        super(sizeof());
        getX().setValue(x);
        getY().setValue(y);
    }

    public VkInt32 getX() {
        return new VkInt32(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkInt32 x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getXQ() {
        return getX().getValue();
    }

    public void setX(int x) {
        getX().setValue(x);
    }

    private static native long getX(long address);
    private static native void setX(long address, long x);

    public VkInt32 getY() {
        return new VkInt32(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkInt32 y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getYQ() {
        return getY().getValue();
    }

    public void setY(int y) {
        getY().setValue(y);
    }

    private static native long getY(long address);
    private static native void setY(long address, long y);


    public static native long sizeof();

    public static class Array extends VkOffset2D implements cz.mg.collections.array.ReadonlyArray<VkOffset2D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkOffset2D.sizeof()));
            this.count = count;
        }

        public Array(int count, VkOffset2D o){
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
        public VkOffset2D get(int i){
            return new VkOffset2D(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkOffset2D.Pointer implements cz.mg.collections.array.ReadonlyArray<VkOffset2D.Pointer> {
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

            public Array(VkOffset2D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkOffset2D.Pointer get(int i){
                return new VkOffset2D.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
