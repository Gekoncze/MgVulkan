package cz.mg.vulkan;

public class VkViewportWScalingNV extends VkObject {
    public VkViewportWScalingNV() {
        super(sizeof());
    }

    public VkViewportWScalingNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkViewportWScalingNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkViewportWScalingNV(VkFloat xcoeff, VkFloat ycoeff) {
        super(sizeof());
        setXcoeff(xcoeff);
        setYcoeff(ycoeff);
    }

    public VkFloat getXcoeff() {
        return new VkFloat(getVkMemory(), getXcoeff(getVkAddress()));
    }

    
    public void setXcoeff(VkFloat xcoeff) {
        setXcoeff(getVkAddress(), xcoeff != null ? xcoeff.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getXcoeff(long address);
    private static native void setXcoeff(long address, long xcoeff);

    public VkFloat getYcoeff() {
        return new VkFloat(getVkMemory(), getYcoeff(getVkAddress()));
    }

    
    public void setYcoeff(VkFloat ycoeff) {
        setYcoeff(getVkAddress(), ycoeff != null ? ycoeff.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getYcoeff(long address);
    private static native void setYcoeff(long address, long ycoeff);


    public static native long sizeof();

    public static class Array extends VkViewportWScalingNV implements cz.mg.collections.array.ReadonlyArray<VkViewportWScalingNV> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportWScalingNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkViewportWScalingNV o){
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
        public VkViewportWScalingNV get(int i){
            return new VkViewportWScalingNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkViewportWScalingNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkViewportWScalingNV.Pointer> {
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

            public Array(VkViewportWScalingNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkViewportWScalingNV.Pointer get(int i){
                return new VkViewportWScalingNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
