package cz.mg.vulkan;

public class VkBindImageMemoryDeviceGroupInfoKHX extends VkObject {
    public VkBindImageMemoryDeviceGroupInfoKHX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX));
    }

    public VkBindImageMemoryDeviceGroupInfoKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImageMemoryDeviceGroupInfoKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBindImageMemoryDeviceGroupInfoKHX(VkPointer pointer) {
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

    public VkUInt32 getDeviceIndexCount() {
        return new VkUInt32(getVkMemory(), getDeviceIndexCount(getVkAddress()));
    }

    
    public void setDeviceIndexCount(VkUInt32 deviceIndexCount) {
        setDeviceIndexCount(getVkAddress(), deviceIndexCount != null ? deviceIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceIndexCountQ() {
        return getDeviceIndexCount().getValue();
    }

    public void setDeviceIndexCount(int deviceIndexCount) {
        getDeviceIndexCount().setValue(deviceIndexCount);
    }

    protected static native long getDeviceIndexCount(long address);
    protected static native void setDeviceIndexCount(long address, long deviceIndexCount);

    public VkUInt32 getPDeviceIndices() {
        return new VkUInt32(getVkMemory(), getPDeviceIndices(getVkAddress()));
    }

    private VkObject pDeviceIndices = null;
    public void setPDeviceIndices(VkUInt32 pDeviceIndices) {
        setPDeviceIndices(getVkAddress(), pDeviceIndices != null ? pDeviceIndices.getVkAddress() : VkPointer.NULL);
        this.pDeviceIndices = pDeviceIndices;
    }

    protected static native long getPDeviceIndices(long address);
    protected static native void setPDeviceIndices(long address, long pDeviceIndices);

    public VkUInt32 getSFRRectCount() {
        return new VkUInt32(getVkMemory(), getSFRRectCount(getVkAddress()));
    }

    
    public void setSFRRectCount(VkUInt32 SFRRectCount) {
        setSFRRectCount(getVkAddress(), SFRRectCount != null ? SFRRectCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSFRRectCountQ() {
        return getSFRRectCount().getValue();
    }

    public void setSFRRectCount(int SFRRectCount) {
        getSFRRectCount().setValue(SFRRectCount);
    }

    protected static native long getSFRRectCount(long address);
    protected static native void setSFRRectCount(long address, long SFRRectCount);

    public VkRect2D getPSFRRects() {
        return new VkRect2D(getVkMemory(), getPSFRRects(getVkAddress()));
    }

    private VkObject pSFRRects = null;
    public void setPSFRRects(VkRect2D pSFRRects) {
        setPSFRRects(getVkAddress(), pSFRRects != null ? pSFRRects.getVkAddress() : VkPointer.NULL);
        this.pSFRRects = pSFRRects;
    }

    protected static native long getPSFRRects(long address);
    protected static native void setPSFRRects(long address, long pSFRRects);


    public static native long sizeof();

    public static class Array extends VkBindImageMemoryDeviceGroupInfoKHX implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryDeviceGroupInfoKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemoryDeviceGroupInfoKHX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHX));;
        }

        public Array(int count, VkBindImageMemoryDeviceGroupInfoKHX o){
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
        public VkBindImageMemoryDeviceGroupInfoKHX get(int i){
            return new VkBindImageMemoryDeviceGroupInfoKHX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
