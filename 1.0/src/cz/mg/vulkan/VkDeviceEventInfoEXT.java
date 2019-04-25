package cz.mg.vulkan;

public class VkDeviceEventInfoEXT extends VkObject {
    public VkDeviceEventInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT));
    }

    public VkDeviceEventInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceEventInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceEventInfoEXT(VkPointer pointer) {
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

    public VkDeviceEventTypeEXT getDeviceEvent() {
        return new VkDeviceEventTypeEXT(getVkMemory(), getDeviceEventNative(getVkAddress()));
    }

    
    public void setDeviceEvent(VkDeviceEventTypeEXT deviceEvent) {
        setDeviceEventNative(getVkAddress(), deviceEvent != null ? deviceEvent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDeviceEventQ() {
        return getDeviceEvent().getValue();
    }

    public void setDeviceEvent(int deviceEvent) {
        getDeviceEvent().setValue(deviceEvent);
    }

    protected static native long getDeviceEventNative(long address);
    protected static native void setDeviceEventNative(long address, long deviceEvent);


    public static native long sizeof();

    public static class Array extends VkDeviceEventInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDeviceEventInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceEventInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT));;
        }

        public Array(int count, VkDeviceEventInfoEXT o){
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
        public VkDeviceEventInfoEXT get(int i){
            return new VkDeviceEventInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
