package cz.mg.vulkan;

public class VkDeviceGeneratedCommandsFeaturesNVX extends VkObject {
    public VkDeviceGeneratedCommandsFeaturesNVX() {
        super(sizeof());
    }

    protected VkDeviceGeneratedCommandsFeaturesNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceGeneratedCommandsFeaturesNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGeneratedCommandsFeaturesNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getComputeBindingPointSupport() {
        return new VkBool32(getVkMemory(), getComputeBindingPointSupport(getVkAddress()));
    }

    
    public void setComputeBindingPointSupport(VkBool32 computeBindingPointSupport) {
        setComputeBindingPointSupport(getVkAddress(), computeBindingPointSupport != null ? computeBindingPointSupport.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getComputeBindingPointSupportQ() {
        return getComputeBindingPointSupport().getValue();
    }

    public void setComputeBindingPointSupport(int computeBindingPointSupport) {
        getComputeBindingPointSupport().setValue(computeBindingPointSupport);
    }

    protected static native long getComputeBindingPointSupport(long address);
    protected static native void setComputeBindingPointSupport(long address, long computeBindingPointSupport);


    public static native long sizeof();

    public static class Array extends VkDeviceGeneratedCommandsFeaturesNVX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsFeaturesNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGeneratedCommandsFeaturesNVX.sizeof()));
            this.count = count;
        }

        public Array(VkDeviceGeneratedCommandsFeaturesNVX o, int count){
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
        public VkDeviceGeneratedCommandsFeaturesNVX get(int i){
            return new VkDeviceGeneratedCommandsFeaturesNVX(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
