package cz.mg.vulkan;

public class VkViewportWScalingNV extends VkObject {
    public VkViewportWScalingNV() {
        super(sizeof());
    }

    protected VkViewportWScalingNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkViewportWScalingNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkViewportWScalingNV(VkPointer pointer) {
        super(pointer);
    }



    public VkFloat getXcoeff() {
        return new VkFloat(getVkMemory(), getXcoeffNative(getVkAddress()));
    }

    
    public void setXcoeff(VkFloat xcoeff) {
        setXcoeffNative(getVkAddress(), xcoeff != null ? xcoeff.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getXcoeffQ() {
        return getXcoeff().getValue();
    }

    public void setXcoeff(float xcoeff) {
        getXcoeff().setValue(xcoeff);
    }

    protected static native long getXcoeffNative(long address);
    protected static native void setXcoeffNative(long address, long xcoeff);

    public VkFloat getYcoeff() {
        return new VkFloat(getVkMemory(), getYcoeffNative(getVkAddress()));
    }

    
    public void setYcoeff(VkFloat ycoeff) {
        setYcoeffNative(getVkAddress(), ycoeff != null ? ycoeff.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getYcoeffQ() {
        return getYcoeff().getValue();
    }

    public void setYcoeff(float ycoeff) {
        getYcoeff().setValue(ycoeff);
    }

    protected static native long getYcoeffNative(long address);
    protected static native void setYcoeffNative(long address, long ycoeff);


    public static native long sizeof();

    public static class Array extends VkViewportWScalingNV implements cz.mg.collections.array.ReadonlyArray<VkViewportWScalingNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkViewportWScalingNV.sizeof()));
            this.count = count;
        }

        public Array(VkViewportWScalingNV o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkViewportWScalingNV get(int i){
            return new VkViewportWScalingNV(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
