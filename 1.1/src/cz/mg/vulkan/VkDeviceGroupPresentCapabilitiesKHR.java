package cz.mg.vulkan;

public class VkDeviceGroupPresentCapabilitiesKHR extends VkObject {
    public VkDeviceGroupPresentCapabilitiesKHR() {
        super(sizeof());
    }

    protected VkDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupPresentCapabilitiesKHR(VkPointer pointer) {
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

    public VkUInt32 getPresentMask() {
        return new VkUInt32(getVkMemory(), getPresentMask(getVkAddress()));
    }

    
    public void setPresentMask(VkUInt32 presentMask) {
        setPresentMask(getVkAddress(), presentMask != null ? presentMask.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getPresentMask(long address);
    protected static native void setPresentMask(long address, long presentMask);

    public VkDeviceGroupPresentModeFlagsKHR getModes() {
        return new VkDeviceGroupPresentModeFlagsKHR(getVkMemory(), getModes(getVkAddress()));
    }

    
    public void setModes(VkDeviceGroupPresentModeFlagsKHR modes) {
        setModes(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getModesQ() {
        return getModes().getValue();
    }

    public void setModes(int modes) {
        getModes().setValue(modes);
    }

    protected static native long getModes(long address);
    protected static native void setModes(long address, long modes);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupPresentCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupPresentCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDeviceGroupPresentCapabilitiesKHR o, int count){
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
        public VkDeviceGroupPresentCapabilitiesKHR get(int i){
            return new VkDeviceGroupPresentCapabilitiesKHR(getVkMemory(), addressAt(i));
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
