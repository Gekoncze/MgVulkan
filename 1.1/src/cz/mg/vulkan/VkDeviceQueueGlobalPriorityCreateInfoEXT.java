package cz.mg.vulkan;

public class VkDeviceQueueGlobalPriorityCreateInfoEXT extends VkObject {
    public VkDeviceQueueGlobalPriorityCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT));
    }

    public VkDeviceQueueGlobalPriorityCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueGlobalPriorityCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceQueueGlobalPriorityCreateInfoEXT(VkPointer pointer) {
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

    public VkQueueGlobalPriorityEXT getGlobalPriority() {
        return new VkQueueGlobalPriorityEXT(getVkMemory(), getGlobalPriority(getVkAddress()));
    }

    
    public void setGlobalPriority(VkQueueGlobalPriorityEXT globalPriority) {
        setGlobalPriority(getVkAddress(), globalPriority != null ? globalPriority.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getGlobalPriorityQ() {
        return getGlobalPriority().getValue();
    }

    public void setGlobalPriority(int globalPriority) {
        getGlobalPriority().setValue(globalPriority);
    }

    protected static native long getGlobalPriority(long address);
    protected static native void setGlobalPriority(long address, long globalPriority);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueGlobalPriorityCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueGlobalPriorityCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueGlobalPriorityCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT));;
        }

        public Array(int count, VkDeviceQueueGlobalPriorityCreateInfoEXT o){
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
        public VkDeviceQueueGlobalPriorityCreateInfoEXT get(int i){
            return new VkDeviceQueueGlobalPriorityCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
