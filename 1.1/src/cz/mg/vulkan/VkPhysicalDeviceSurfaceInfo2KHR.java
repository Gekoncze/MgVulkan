package cz.mg.vulkan;

public class VkPhysicalDeviceSurfaceInfo2KHR extends VkObject {
    public VkPhysicalDeviceSurfaceInfo2KHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR));
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSurfaceInfo2KHR(VkPointer pointer) {
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

    public VkSurfaceKHR getSurface() {
        return new VkSurfaceKHR(getVkMemory(), getSurfaceNative(getVkAddress()));
    }

    
    public void setSurface(VkSurfaceKHR surface) {
        setSurfaceNative(getVkAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSurfaceNative(long address);
    protected static native void setSurfaceNative(long address, long surface);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSurfaceInfo2KHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSurfaceInfo2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSurfaceInfo2KHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR));;
        }

        public Array(int count, VkPhysicalDeviceSurfaceInfo2KHR o){
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
        public VkPhysicalDeviceSurfaceInfo2KHR get(int i){
            return new VkPhysicalDeviceSurfaceInfo2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
