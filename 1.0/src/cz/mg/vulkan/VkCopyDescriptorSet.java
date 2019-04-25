package cz.mg.vulkan;

public class VkCopyDescriptorSet extends VkObject {
    public VkCopyDescriptorSet() {
        super(sizeof());
    }

    protected VkCopyDescriptorSet(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkCopyDescriptorSet(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCopyDescriptorSet(VkPointer pointer) {
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

    public VkDescriptorSet getSrcSet() {
        return new VkDescriptorSet(getVkMemory(), getSrcSetNative(getVkAddress()));
    }

    
    public void setSrcSet(VkDescriptorSet srcSet) {
        setSrcSetNative(getVkAddress(), srcSet != null ? srcSet.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcSetNative(long address);
    protected static native void setSrcSetNative(long address, long srcSet);

    public VkUInt32 getSrcBinding() {
        return new VkUInt32(getVkMemory(), getSrcBindingNative(getVkAddress()));
    }

    
    public void setSrcBinding(VkUInt32 srcBinding) {
        setSrcBindingNative(getVkAddress(), srcBinding != null ? srcBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcBindingQ() {
        return getSrcBinding().getValue();
    }

    public void setSrcBinding(int srcBinding) {
        getSrcBinding().setValue(srcBinding);
    }

    protected static native long getSrcBindingNative(long address);
    protected static native void setSrcBindingNative(long address, long srcBinding);

    public VkUInt32 getSrcArrayElement() {
        return new VkUInt32(getVkMemory(), getSrcArrayElementNative(getVkAddress()));
    }

    
    public void setSrcArrayElement(VkUInt32 srcArrayElement) {
        setSrcArrayElementNative(getVkAddress(), srcArrayElement != null ? srcArrayElement.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcArrayElementQ() {
        return getSrcArrayElement().getValue();
    }

    public void setSrcArrayElement(int srcArrayElement) {
        getSrcArrayElement().setValue(srcArrayElement);
    }

    protected static native long getSrcArrayElementNative(long address);
    protected static native void setSrcArrayElementNative(long address, long srcArrayElement);

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


    public static native long sizeof();

    public static class Array extends VkCopyDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkCopyDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCopyDescriptorSet.sizeof()));
            this.count = count;
        }

        public Array(VkCopyDescriptorSet o, int count){
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
        public VkCopyDescriptorSet get(int i){
            return new VkCopyDescriptorSet(getVkMemory(), address(i));
        }

        protected long address(int i){
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
