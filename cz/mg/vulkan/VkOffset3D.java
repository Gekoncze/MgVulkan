package cz.mg.vulkan;

public class VkOffset3D extends VkObject {
    public VkOffset3D() {
        super(sizeof());
    }

    public VkOffset3D(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkOffset3D(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkOffset3D(VkInt32 x, VkInt32 y, VkInt32 z) {
        super(sizeof());
        setX(x);
        setY(y);
        setZ(z);
    }

    public VkInt32 getX() {
        return new VkInt32(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkInt32 x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getX(long address);
    private static native void setX(long address, long x);

    public VkInt32 getY() {
        return new VkInt32(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkInt32 y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getY(long address);
    private static native void setY(long address, long y);

    public VkInt32 getZ() {
        return new VkInt32(getVkMemory(), getZ(getVkAddress()));
    }

    
    public void setZ(VkInt32 z) {
        setZ(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getZ(long address);
    private static native void setZ(long address, long z);


    public static native long sizeof();

    public static class Array extends VkOffset3D implements cz.mg.collections.array.ReadonlyArray<VkOffset3D> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkOffset3D.sizeof()));
            this.count = count;
        }

        public Array(int count, VkOffset3D o){
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
        public VkOffset3D get(int i){
            return new VkOffset3D(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkOffset3D.Pointer implements cz.mg.collections.array.ReadonlyArray<VkOffset3D.Pointer> {
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

            public Array(VkOffset3D[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkOffset3D.Pointer get(int i){
                return new VkOffset3D.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
