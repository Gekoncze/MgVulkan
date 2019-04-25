package cz.mg.vulkan;

public class VkBufferMemoryRequirementsInfo2KHR extends VkObject {
    public VkBufferMemoryRequirementsInfo2KHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR));
    }

    public VkBufferMemoryRequirementsInfo2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferMemoryRequirementsInfo2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferMemoryRequirementsInfo2KHR(VkPointer pointer) {
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

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBuffer(long address);
    protected static native void setBuffer(long address, long buffer);


    public static native long sizeof();

    public static class Array extends VkBufferMemoryRequirementsInfo2KHR implements cz.mg.collections.array.ReadonlyArray<VkBufferMemoryRequirementsInfo2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferMemoryRequirementsInfo2KHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR));;
        }

        public Array(int count, VkBufferMemoryRequirementsInfo2KHR o){
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
        public VkBufferMemoryRequirementsInfo2KHR get(int i){
            return new VkBufferMemoryRequirementsInfo2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
