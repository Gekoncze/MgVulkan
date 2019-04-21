package cz.mg.vulkan;

public class VkViewportSwizzleNV extends VkObject {
    public VkViewportSwizzleNV() {
        super(sizeof());
    }

    public VkViewportSwizzleNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewportSwizzleNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkViewportCoordinateSwizzleNV getX() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkViewportCoordinateSwizzleNV x) {
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

    public VkViewportCoordinateSwizzleNV getY() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkViewportCoordinateSwizzleNV y) {
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

    public VkViewportCoordinateSwizzleNV getZ() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getZ(getVkAddress()));
    }

    
    public void setZ(VkViewportCoordinateSwizzleNV z) {
        setZ(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getZQ() {
        return getZ().getValue();
    }

    public void setZ(int z) {
        getZ().setValue(z);
    }

    private static native long getZ(long address);
    private static native void setZ(long address, long z);

    public VkViewportCoordinateSwizzleNV getW() {
        return new VkViewportCoordinateSwizzleNV(getVkMemory(), getW(getVkAddress()));
    }

    
    public void setW(VkViewportCoordinateSwizzleNV w) {
        setW(getVkAddress(), w != null ? w.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getWQ() {
        return getW().getValue();
    }

    public void setW(int w) {
        getW().setValue(w);
    }

    private static native long getW(long address);
    private static native void setW(long address, long w);


    public static native long sizeof();

    public static class Array extends VkViewportSwizzleNV implements cz.mg.collections.array.ReadonlyArray<VkViewportSwizzleNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportSwizzleNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewportSwizzleNV o){
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
        public VkViewportSwizzleNV get(int i){
            return new VkViewportSwizzleNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkViewportSwizzleNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkViewportSwizzleNV.Pointer> {
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

            public Array(VkViewportSwizzleNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkViewportSwizzleNV.Pointer get(int i){
                return new VkViewportSwizzleNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
