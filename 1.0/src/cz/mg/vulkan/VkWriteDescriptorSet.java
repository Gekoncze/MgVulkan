package cz.mg.vulkan;

public class VkWriteDescriptorSet extends VkObject {
    public VkWriteDescriptorSet() {
        super(sizeof());
    }

    public VkWriteDescriptorSet(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkWriteDescriptorSet(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkDescriptorSet getDstSet() {
        return new VkDescriptorSet(getVkMemory(), getDstSet(getVkAddress()));
    }

    
    public void setDstSet(VkDescriptorSet dstSet) {
        setDstSet(getVkAddress(), dstSet != null ? dstSet.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSet(long address);
    protected static native void setDstSet(long address, long dstSet);

    public VkUInt32 getDstBinding() {
        return new VkUInt32(getVkMemory(), getDstBinding(getVkAddress()));
    }

    
    public void setDstBinding(VkUInt32 dstBinding) {
        setDstBinding(getVkAddress(), dstBinding != null ? dstBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstBindingQ() {
        return getDstBinding().getValue();
    }

    public void setDstBinding(int dstBinding) {
        getDstBinding().setValue(dstBinding);
    }

    protected static native long getDstBinding(long address);
    protected static native void setDstBinding(long address, long dstBinding);

    public VkUInt32 getDstArrayElement() {
        return new VkUInt32(getVkMemory(), getDstArrayElement(getVkAddress()));
    }

    
    public void setDstArrayElement(VkUInt32 dstArrayElement) {
        setDstArrayElement(getVkAddress(), dstArrayElement != null ? dstArrayElement.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstArrayElementQ() {
        return getDstArrayElement().getValue();
    }

    public void setDstArrayElement(int dstArrayElement) {
        getDstArrayElement().setValue(dstArrayElement);
    }

    protected static native long getDstArrayElement(long address);
    protected static native void setDstArrayElement(long address, long dstArrayElement);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorCountQ() {
        return getDescriptorCount().getValue();
    }

    public void setDescriptorCount(int descriptorCount) {
        getDescriptorCount().setValue(descriptorCount);
    }

    protected static native long getDescriptorCount(long address);
    protected static native void setDescriptorCount(long address, long descriptorCount);

    public VkDescriptorType getDescriptorType() {
        return new VkDescriptorType(getVkMemory(), getDescriptorType(getVkAddress()));
    }

    
    public void setDescriptorType(VkDescriptorType descriptorType) {
        setDescriptorType(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorTypeQ() {
        return getDescriptorType().getValue();
    }

    public void setDescriptorType(int descriptorType) {
        getDescriptorType().setValue(descriptorType);
    }

    protected static native long getDescriptorType(long address);
    protected static native void setDescriptorType(long address, long descriptorType);

    public VkDescriptorImageInfo getPImageInfo() {
        return new VkDescriptorImageInfo(getVkMemory(), getPImageInfo(getVkAddress()));
    }

    private VkObject pImageInfo = null;
    public void setPImageInfo(VkDescriptorImageInfo pImageInfo) {
        setPImageInfo(getVkAddress(), pImageInfo != null ? pImageInfo.getVkAddress() : VkPointer.NULL);
        this.pImageInfo = pImageInfo;
    }

    protected static native long getPImageInfo(long address);
    protected static native void setPImageInfo(long address, long pImageInfo);

    public VkDescriptorBufferInfo getPBufferInfo() {
        return new VkDescriptorBufferInfo(getVkMemory(), getPBufferInfo(getVkAddress()));
    }

    private VkObject pBufferInfo = null;
    public void setPBufferInfo(VkDescriptorBufferInfo pBufferInfo) {
        setPBufferInfo(getVkAddress(), pBufferInfo != null ? pBufferInfo.getVkAddress() : VkPointer.NULL);
        this.pBufferInfo = pBufferInfo;
    }

    protected static native long getPBufferInfo(long address);
    protected static native void setPBufferInfo(long address, long pBufferInfo);

    public VkBufferView getPTexelBufferView() {
        return new VkBufferView(getVkMemory(), getPTexelBufferView(getVkAddress()));
    }

    private VkObject pTexelBufferView = null;
    public void setPTexelBufferView(VkBufferView pTexelBufferView) {
        setPTexelBufferView(getVkAddress(), pTexelBufferView != null ? pTexelBufferView.getVkAddress() : VkPointer.NULL);
        this.pTexelBufferView = pTexelBufferView;
    }

    protected static native long getPTexelBufferView(long address);
    protected static native void setPTexelBufferView(long address, long pTexelBufferView);


    public static native long sizeof();

    public static class Array extends VkWriteDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkWriteDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkWriteDescriptorSet.sizeof()));
            this.count = count;
        }

        public Array(int count, VkWriteDescriptorSet o){
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
            return new VkWriteDescriptorSet(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
