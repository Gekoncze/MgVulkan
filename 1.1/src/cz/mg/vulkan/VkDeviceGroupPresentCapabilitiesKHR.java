package cz.mg.vulkan;

public class VkDeviceGroupPresentCapabilitiesKHR extends VkObject {
    public VkDeviceGroupPresentCapabilitiesKHR() {
        super(sizeof());
    }

    public VkDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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
        setModes(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.getNullAddress());
        
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

        public Array(int count, VkDeviceGroupPresentCapabilitiesKHR o){
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
        public VkDeviceGroupPresentCapabilitiesKHR get(int i){
            return new VkDeviceGroupPresentCapabilitiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupPresentCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupPresentCapabilitiesKHR.Pointer> {
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

            public Array(VkDeviceGroupPresentCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupPresentCapabilitiesKHR.Pointer get(int i){
                return new VkDeviceGroupPresentCapabilitiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
