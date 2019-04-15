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
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDescriptorSet getSrcSet() {
        return new VkDescriptorSet(getVkMemory(), getSrcSet(getVkAddress()));
    }

    
    public void setSrcSet(VkDescriptorSet srcSet) {
        setSrcSet(getVkAddress(), srcSet != null ? srcSet.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getSrcSet(long address);
    private static native void setSrcSet(long address, long srcSet);

    public VkUInt32 getSrcBinding() {
        return new VkUInt32(getVkMemory(), getSrcBinding(getVkAddress()));
    }

    
    public void setSrcBinding(VkUInt32 srcBinding) {
        setSrcBinding(getVkAddress(), srcBinding != null ? srcBinding.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSrcBindingQ() {
        return getSrcBinding().getValue();
    }

    public void setSrcBinding(int srcBinding) {
        getSrcBinding().setValue(srcBinding);
    }

    private static native long getSrcBinding(long address);
    private static native void setSrcBinding(long address, long srcBinding);

    public VkUInt32 getSrcArrayElement() {
        return new VkUInt32(getVkMemory(), getSrcArrayElement(getVkAddress()));
    }

    
    public void setSrcArrayElement(VkUInt32 srcArrayElement) {
        setSrcArrayElement(getVkAddress(), srcArrayElement != null ? srcArrayElement.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSrcArrayElementQ() {
        return getSrcArrayElement().getValue();
    }

    public void setSrcArrayElement(int srcArrayElement) {
        getSrcArrayElement().setValue(srcArrayElement);
    }

    private static native long getSrcArrayElement(long address);
    private static native void setSrcArrayElement(long address, long srcArrayElement);

    public VkDescriptorSet getDstSet() {
        return new VkDescriptorSet(getVkMemory(), getDstSet(getVkAddress()));
    }

    
    public void setDstSet(VkDescriptorSet dstSet) {
        setDstSet(getVkAddress(), dstSet != null ? dstSet.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDstSet(long address);
    private static native void setDstSet(long address, long dstSet);

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

    private static native long getDstBinding(long address);
    private static native void setDstBinding(long address, long dstBinding);

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

    private static native long getDstArrayElement(long address);
    private static native void setDstArrayElement(long address, long dstArrayElement);

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

    private static native long getDescriptorCount(long address);
    private static native void setDescriptorCount(long address, long descriptorCount);


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
            return new VkCopyDescriptorSet(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCopyDescriptorSet.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCopyDescriptorSet.Pointer> {
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

            public Array(VkCopyDescriptorSet[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCopyDescriptorSet.Pointer get(int i){
                return new VkCopyDescriptorSet.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
