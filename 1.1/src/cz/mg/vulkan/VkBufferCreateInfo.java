package cz.mg.vulkan;

public class VkBufferCreateInfo extends VkObject {
    public VkBufferCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO));
    }

    public VkBufferCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferCreateInfo(VkPointer pointer) {
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

    public VkBufferCreateFlags getFlags() {
        return new VkBufferCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkBufferCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSize(long address);
    protected static native void setSize(long address, long size);

    public VkBufferUsageFlags getUsage() {
        return new VkBufferUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkBufferUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getUsageQ() {
        return getUsage().getValue();
    }

    public void setUsage(int usage) {
        getUsage().setValue(usage);
    }

    protected static native long getUsage(long address);
    protected static native void setUsage(long address, long usage);

    public VkSharingMode getSharingMode() {
        return new VkSharingMode(getVkMemory(), getSharingMode(getVkAddress()));
    }

    
    public void setSharingMode(VkSharingMode sharingMode) {
        setSharingMode(getVkAddress(), sharingMode != null ? sharingMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSharingModeQ() {
        return getSharingMode().getValue();
    }

    public void setSharingMode(int sharingMode) {
        getSharingMode().setValue(sharingMode);
    }

    protected static native long getSharingMode(long address);
    protected static native void setSharingMode(long address, long sharingMode);

    public VkUInt32 getQueueFamilyIndexCount() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexCount(getVkAddress()));
    }

    
    public void setQueueFamilyIndexCount(VkUInt32 queueFamilyIndexCount) {
        setQueueFamilyIndexCount(getVkAddress(), queueFamilyIndexCount != null ? queueFamilyIndexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexCountQ() {
        return getQueueFamilyIndexCount().getValue();
    }

    public void setQueueFamilyIndexCount(int queueFamilyIndexCount) {
        getQueueFamilyIndexCount().setValue(queueFamilyIndexCount);
    }

    protected static native long getQueueFamilyIndexCount(long address);
    protected static native void setQueueFamilyIndexCount(long address, long queueFamilyIndexCount);

    public VkUInt32 getPQueueFamilyIndices() {
        return new VkUInt32(getVkMemory(), getPQueueFamilyIndices(getVkAddress()));
    }

    private VkObject pQueueFamilyIndices = null;
    public void setPQueueFamilyIndices(VkUInt32 pQueueFamilyIndices) {
        setPQueueFamilyIndices(getVkAddress(), pQueueFamilyIndices != null ? pQueueFamilyIndices.getVkAddress() : VkPointer.NULL);
        this.pQueueFamilyIndices = pQueueFamilyIndices;
    }

    protected static native long getPQueueFamilyIndices(long address);
    protected static native void setPQueueFamilyIndices(long address, long pQueueFamilyIndices);


    public static native long sizeof();

    public static class Array extends VkBufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkBufferCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO));;
        }

        public Array(int count, VkBufferCreateInfo o){
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
        public VkBufferCreateInfo get(int i){
            return new VkBufferCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
