package cz.mg.vulkan;

public class VkCopyDescriptorSet extends VkObject {
    public VkCopyDescriptorSet() {
        super(sizeof());
    }

    public VkCopyDescriptorSet(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCopyDescriptorSet(VkMemory vkmemory, long vkaddress) {
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

    public VkDescriptorSet getSrcSet() {
        return new VkDescriptorSet(getVkMemory(), getSrcSet(getVkAddress()));
    }

    
    public void setSrcSet(VkDescriptorSet srcSet) {
        setSrcSet(getVkAddress(), srcSet != null ? srcSet.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcSet(long address);
    protected static native void setSrcSet(long address, long srcSet);

    public VkUInt32 getSrcBinding() {
        return new VkUInt32(getVkMemory(), getSrcBinding(getVkAddress()));
    }

    
    public void setSrcBinding(VkUInt32 srcBinding) {
        setSrcBinding(getVkAddress(), srcBinding != null ? srcBinding.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcBindingQ() {
        return getSrcBinding().getValue();
    }

    public void setSrcBinding(int srcBinding) {
        getSrcBinding().setValue(srcBinding);
    }

    protected static native long getSrcBinding(long address);
    protected static native void setSrcBinding(long address, long srcBinding);

    public VkUInt32 getSrcArrayElement() {
        return new VkUInt32(getVkMemory(), getSrcArrayElement(getVkAddress()));
    }

    
    public void setSrcArrayElement(VkUInt32 srcArrayElement) {
        setSrcArrayElement(getVkAddress(), srcArrayElement != null ? srcArrayElement.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcArrayElementQ() {
        return getSrcArrayElement().getValue();
    }

    public void setSrcArrayElement(int srcArrayElement) {
        getSrcArrayElement().setValue(srcArrayElement);
    }

    protected static native long getSrcArrayElement(long address);
    protected static native void setSrcArrayElement(long address, long srcArrayElement);

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


    public static native long sizeof();

    public static class Array extends VkCopyDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkCopyDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCopyDescriptorSet.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCopyDescriptorSet o){
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
        public VkCopyDescriptorSet get(int i){
            return new VkCopyDescriptorSet(getVkMemory(), addressAt(i));
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
