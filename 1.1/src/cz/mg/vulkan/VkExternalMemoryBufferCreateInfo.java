package cz.mg.vulkan;

public class VkExternalMemoryBufferCreateInfo extends VkObject {
    public VkExternalMemoryBufferCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO));
    }

    public VkExternalMemoryBufferCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryBufferCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryBufferCreateInfo(VkPointer pointer) {
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

    public VkExternalMemoryHandleTypeFlags getHandleTypes() {
        return new VkExternalMemoryHandleTypeFlags(getVkMemory(), getHandleTypesNative(getVkAddress()));
    }

    
    public void setHandleTypes(VkExternalMemoryHandleTypeFlags handleTypes) {
        setHandleTypesNative(getVkAddress(), handleTypes != null ? handleTypes.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHandleTypesQ() {
        return getHandleTypes().getValue();
    }

    public void setHandleTypes(int handleTypes) {
        getHandleTypes().setValue(handleTypes);
    }

    protected static native long getHandleTypesNative(long address);
    protected static native void setHandleTypesNative(long address, long handleTypes);


    public void set(VkExternalMemoryBufferCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkExternalMemoryBufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkExternalMemoryBufferCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExternalMemoryBufferCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO));;
        }

        public Array(int count, VkExternalMemoryBufferCreateInfo o){
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
        public VkExternalMemoryBufferCreateInfo get(int i){
            return new VkExternalMemoryBufferCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
