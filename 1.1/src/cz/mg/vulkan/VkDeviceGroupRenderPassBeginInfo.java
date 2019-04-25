package cz.mg.vulkan;

public class VkDeviceGroupRenderPassBeginInfo extends VkObject {
    public VkDeviceGroupRenderPassBeginInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO));
    }

    public VkDeviceGroupRenderPassBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupRenderPassBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceGroupRenderPassBeginInfo(VkPointer pointer) {
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

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMaskNative(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMaskNative(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceMaskQ() {
        return getDeviceMask().getValue();
    }

    public void setDeviceMask(int deviceMask) {
        getDeviceMask().setValue(deviceMask);
    }

    protected static native long getDeviceMaskNative(long address);
    protected static native void setDeviceMaskNative(long address, long deviceMask);

    public VkUInt32 getDeviceRenderAreaCount() {
        return new VkUInt32(getVkMemory(), getDeviceRenderAreaCountNative(getVkAddress()));
    }

    
    public void setDeviceRenderAreaCount(VkUInt32 deviceRenderAreaCount) {
        setDeviceRenderAreaCountNative(getVkAddress(), deviceRenderAreaCount != null ? deviceRenderAreaCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceRenderAreaCountQ() {
        return getDeviceRenderAreaCount().getValue();
    }

    public void setDeviceRenderAreaCount(int deviceRenderAreaCount) {
        getDeviceRenderAreaCount().setValue(deviceRenderAreaCount);
    }

    protected static native long getDeviceRenderAreaCountNative(long address);
    protected static native void setDeviceRenderAreaCountNative(long address, long deviceRenderAreaCount);

    public VkRect2D getPDeviceRenderAreas() {
        return new VkRect2D(getVkMemory(), getPDeviceRenderAreasNative(getVkAddress()));
    }

    private VkObject pDeviceRenderAreas = null;
    public void setPDeviceRenderAreas(VkRect2D pDeviceRenderAreas) {
        setPDeviceRenderAreasNative(getVkAddress(), pDeviceRenderAreas != null ? pDeviceRenderAreas.getVkAddress() : VkPointer.NULL);
        this.pDeviceRenderAreas = pDeviceRenderAreas;
    }

    protected static native long getPDeviceRenderAreasNative(long address);
    protected static native void setPDeviceRenderAreasNative(long address, long pDeviceRenderAreas);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupRenderPassBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupRenderPassBeginInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO));;
        }

        public Array(int count, VkDeviceGroupRenderPassBeginInfo o){
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
        public VkDeviceGroupRenderPassBeginInfo get(int i){
            return new VkDeviceGroupRenderPassBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
