package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateEntryKHR extends VkObject {
    public VkDescriptorUpdateTemplateEntryKHR() {
        super(sizeof());
    }

    protected VkDescriptorUpdateTemplateEntryKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorUpdateTemplateEntryKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateEntryKHR(VkPointer pointer) {
        super(pointer);
    }



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

    public VkSize getOffset() {
        return new VkSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkSize getStride() {
        return new VkSize(getVkMemory(), getStride(getVkAddress()));
    }

    
    public void setStride(VkSize stride) {
        setStride(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getStrideQ() {
        return getStride().getValue();
    }

    public void setStride(long stride) {
        getStride().setValue(stride);
    }

    protected static native long getStride(long address);
    protected static native void setStride(long address, long stride);


    public static native long sizeof();

    public static class Array extends VkDescriptorUpdateTemplateEntryKHR implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateEntryKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateEntryKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorUpdateTemplateEntryKHR o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDescriptorUpdateTemplateEntryKHR get(int i){
            return new VkDescriptorUpdateTemplateEntryKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
