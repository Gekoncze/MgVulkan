package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateEntryKHR extends VkObject {
    public VkDescriptorUpdateTemplateEntryKHR() {
        super(sizeof());
    }

    public VkDescriptorUpdateTemplateEntryKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateEntryKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getDstBinding() {
        return new VkUInt32(getVkMemory(), getDstBinding(getVkAddress()));
    }

    
    public void setDstBinding(VkUInt32 dstBinding) {
        setDstBinding(getVkAddress(), dstBinding != null ? dstBinding.getVkAddress() : VkPointer.getNullAddress());
        
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
        setDstArrayElement(getVkAddress(), dstArrayElement != null ? dstArrayElement.getVkAddress() : VkPointer.getNullAddress());
        
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
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.getNullAddress());
        
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
        setDescriptorType(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.getNullAddress());
        
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
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddress());
        
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
        setStride(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddress());
        
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

        public Array(int count, VkDescriptorUpdateTemplateEntryKHR o){
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
        public VkDescriptorUpdateTemplateEntryKHR get(int i){
            return new VkDescriptorUpdateTemplateEntryKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkDescriptorUpdateTemplateEntryKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateEntryKHR.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkDescriptorUpdateTemplateEntryKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorUpdateTemplateEntryKHR.Pointer get(int i){
                return new VkDescriptorUpdateTemplateEntryKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
