package cz.mg.vulkan;

public class VkDeviceQueueInfo2 extends VkObject {
    public VkDeviceQueueInfo2() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2));
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceQueueInfo2(VkPointer pointer) {
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexNative(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndexNative(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexQ() {
        return getQueueFamilyIndex().getValue();
    }

    public void setQueueFamilyIndex(int queueFamilyIndex) {
        getQueueFamilyIndex().setValue(queueFamilyIndex);
    }

    protected static native long getQueueFamilyIndexNative(long address);
    protected static native void setQueueFamilyIndexNative(long address, long queueFamilyIndex);

    public VkUInt32 getQueueIndex() {
        return new VkUInt32(getVkMemory(), getQueueIndexNative(getVkAddress()));
    }

    
    public void setQueueIndex(VkUInt32 queueIndex) {
        setQueueIndexNative(getVkAddress(), queueIndex != null ? queueIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueIndexQ() {
        return getQueueIndex().getValue();
    }

    public void setQueueIndex(int queueIndex) {
        getQueueIndex().setValue(queueIndex);
    }

    protected static native long getQueueIndexNative(long address);
    protected static native void setQueueIndexNative(long address, long queueIndex);


    public void set(VkDeviceQueueInfo2 o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDeviceQueueInfo2 implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueInfo2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueInfo2.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2));;
        }

        public Array(VkDeviceQueueInfo2 o, int count){
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
        public VkDeviceQueueInfo2 get(int i){
            return new VkDeviceQueueInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
