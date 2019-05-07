package cz.mg.vulkan;

public class VkWriteDescriptorSet extends VkObject {
    public VkWriteDescriptorSet() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET));
    }

    public VkWriteDescriptorSet(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkWriteDescriptorSet(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkWriteDescriptorSet(VkPointer pointer) {
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

    public VkDescriptorSet getDstSet() {
        return new VkDescriptorSet(getVkMemory(), getDstSetNative(getVkAddress()));
    }

    
    public void setDstSet(VkDescriptorSet dstSet) {
        setDstSetNative(getVkAddress(), dstSet != null ? dstSet.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSetNative(long address);
    protected static native void setDstSetNative(long address, long dstSet);

    public VkUInt32 getDstBinding() {
        return new VkUInt32(getVkMemory(), getDstBindingNative(getVkAddress()));
    }

    
    public void setDstBinding(VkUInt32 dstBinding) {
        setDstBindingNative(getVkAddress(), dstBinding != null ? dstBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstBindingQ() {
        return getDstBinding().getValue();
    }

    public void setDstBinding(int dstBinding) {
        getDstBinding().setValue(dstBinding);
    }

    protected static native long getDstBindingNative(long address);
    protected static native void setDstBindingNative(long address, long dstBinding);

    public VkUInt32 getDstArrayElement() {
        return new VkUInt32(getVkMemory(), getDstArrayElementNative(getVkAddress()));
    }

    
    public void setDstArrayElement(VkUInt32 dstArrayElement) {
        setDstArrayElementNative(getVkAddress(), dstArrayElement != null ? dstArrayElement.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstArrayElementQ() {
        return getDstArrayElement().getValue();
    }

    public void setDstArrayElement(int dstArrayElement) {
        getDstArrayElement().setValue(dstArrayElement);
    }

    protected static native long getDstArrayElementNative(long address);
    protected static native void setDstArrayElementNative(long address, long dstArrayElement);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCountNative(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCountNative(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorCountQ() {
        return getDescriptorCount().getValue();
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    protected static native long getDescriptorCountNative(long address);
    protected static native void setDescriptorCountNative(long address, long descriptorCount);

    public VkDescriptorType getDescriptorType() {
        return new VkDescriptorType(getVkMemory(), getDescriptorTypeNative(getVkAddress()));
    }

    
    public void setDescriptorType(VkDescriptorType descriptorType) {
        setDescriptorTypeNative(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorTypeQ() {
        return getDescriptorType().getValue();
    }

    public void setDescriptorType(int descriptorType) {
        getDescriptorType().setValue(descriptorType);
    }

    protected static native long getDescriptorTypeNative(long address);
    protected static native void setDescriptorTypeNative(long address, long descriptorType);

    public VkDescriptorImageInfo getPImageInfo() {
        return new VkDescriptorImageInfo(getVkMemory(), getPImageInfoNative(getVkAddress()));
    }

    private VkObject pImageInfo = null;
    public void setPImageInfo(VkDescriptorImageInfo pImageInfo) {
        setPImageInfoNative(getVkAddress(), pImageInfo != null ? pImageInfo.getVkAddress() : VkPointer.NULL);
        this.pImageInfo = pImageInfo;
    }

    protected static native long getPImageInfoNative(long address);
    protected static native void setPImageInfoNative(long address, long pImageInfo);

    public VkDescriptorBufferInfo getPBufferInfo() {
        return new VkDescriptorBufferInfo(getVkMemory(), getPBufferInfoNative(getVkAddress()));
    }

    private VkObject pBufferInfo = null;
    public void setPBufferInfo(VkDescriptorBufferInfo pBufferInfo) {
        setPBufferInfoNative(getVkAddress(), pBufferInfo != null ? pBufferInfo.getVkAddress() : VkPointer.NULL);
        this.pBufferInfo = pBufferInfo;
    }

    protected static native long getPBufferInfoNative(long address);
    protected static native void setPBufferInfoNative(long address, long pBufferInfo);

    public VkBufferView getPTexelBufferView() {
        return new VkBufferView(getVkMemory(), getPTexelBufferViewNative(getVkAddress()));
    }

    private VkObject pTexelBufferView = null;
    public void setPTexelBufferView(VkBufferView pTexelBufferView) {
        setPTexelBufferViewNative(getVkAddress(), pTexelBufferView != null ? pTexelBufferView.getVkAddress() : VkPointer.NULL);
        this.pTexelBufferView = pTexelBufferView;
    }

    protected static native long getPTexelBufferViewNative(long address);
    protected static native void setPTexelBufferViewNative(long address, long pTexelBufferView);


    public void set(VkWriteDescriptorSet o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkWriteDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkWriteDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkWriteDescriptorSet.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET));;
        }

        public Array(VkWriteDescriptorSet o, int count){
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
        public VkWriteDescriptorSet get(int i){
            return new VkWriteDescriptorSet(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
