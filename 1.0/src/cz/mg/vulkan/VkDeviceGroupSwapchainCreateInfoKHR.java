package cz.mg.vulkan;

public class VkDeviceGroupSwapchainCreateInfoKHR extends VkObject {
    public VkDeviceGroupSwapchainCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR));
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupSwapchainCreateInfoKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkDeviceGroupPresentModeFlagsKHR getModes() {
        return new VkDeviceGroupPresentModeFlagsKHR(getVkMemory(), getModesNative(getVkAddress()));
    }

    
    public void setModes(VkDeviceGroupPresentModeFlagsKHR modes) {
        setModesNative(getVkAddress(), modes != null ? modes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getModesQ() {
        return getModes().getValue();
    }

    public void setModes(int modes) {
        getModes().setValue(modes);
    }

    protected static native long getModesNative(long address);
    protected static native void setModesNative(long address, long modes);


    public void set(VkDeviceGroupSwapchainCreateInfoKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDeviceGroupSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupSwapchainCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupSwapchainCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR));;
        }

        public Array(int count, VkDeviceGroupSwapchainCreateInfoKHR o){
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
        public VkDeviceGroupSwapchainCreateInfoKHR get(int i){
            return new VkDeviceGroupSwapchainCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
