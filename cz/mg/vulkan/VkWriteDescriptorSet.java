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


    public VkWriteDescriptorSet(VkStructureType sType, VkObject pNext, VkDescriptorSet dstSet, VkUInt32 dstBinding, VkUInt32 dstArrayElement, VkUInt32 descriptorCount, VkDescriptorType descriptorType, VkDescriptorImageInfo pImageInfo, VkDescriptorBufferInfo pBufferInfo, VkBufferView pTexelBufferView) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setDstSet(dstSet);
        setDstBinding(dstBinding);
        setDstArrayElement(dstArrayElement);
        setDescriptorCount(descriptorCount);
        setDescriptorType(descriptorType);
        setPImageInfo(pImageInfo);
        setPBufferInfo(pBufferInfo);
        setPTexelBufferView(pTexelBufferView);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkDescriptorSet getDstSet() {
        return new VkDescriptorSet(getVkMemory(), getDstSet(getVkAddress()));
    }

    
    public void setDstSet(VkDescriptorSet dstSet) {
        setDstSet(getVkAddress(), dstSet != null ? dstSet.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstSet(long address);
    private static native void setDstSet(long address, long dstSet);

    public VkUInt32 getDstBinding() {
        return new VkUInt32(getVkMemory(), getDstBinding(getVkAddress()));
    }

    
    public void setDstBinding(VkUInt32 dstBinding) {
        setDstBinding(getVkAddress(), dstBinding != null ? dstBinding.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstBinding(long address);
    private static native void setDstBinding(long address, long dstBinding);

    public VkUInt32 getDstArrayElement() {
        return new VkUInt32(getVkMemory(), getDstArrayElement(getVkAddress()));
    }

    
    public void setDstArrayElement(VkUInt32 dstArrayElement) {
        setDstArrayElement(getVkAddress(), dstArrayElement != null ? dstArrayElement.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstArrayElement(long address);
    private static native void setDstArrayElement(long address, long dstArrayElement);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount != null ? descriptorCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorCount(long address);
    private static native void setDescriptorCount(long address, long descriptorCount);

    public VkDescriptorType getDescriptorType() {
        return new VkDescriptorType(getVkMemory(), getDescriptorType(getVkAddress()));
    }

    
    public void setDescriptorType(VkDescriptorType descriptorType) {
        setDescriptorType(getVkAddress(), descriptorType != null ? descriptorType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorType(long address);
    private static native void setDescriptorType(long address, long descriptorType);

    public VkDescriptorImageInfo getPImageInfo() {
        return new VkDescriptorImageInfo(getVkMemory(), getPImageInfo(getVkAddress()));
    }

    private VkObject pImageInfo = null;
    public void setPImageInfo(VkDescriptorImageInfo pImageInfo) {
        setPImageInfo(getVkAddress(), pImageInfo != null ? pImageInfo.getVkAddress() : VkPointer.NULL);
        this.pImageInfo = pImageInfo;
    }

    private static native long getPImageInfo(long address);
    private static native void setPImageInfo(long address, long pImageInfo);

    public VkDescriptorBufferInfo getPBufferInfo() {
        return new VkDescriptorBufferInfo(getVkMemory(), getPBufferInfo(getVkAddress()));
    }

    private VkObject pBufferInfo = null;
    public void setPBufferInfo(VkDescriptorBufferInfo pBufferInfo) {
        setPBufferInfo(getVkAddress(), pBufferInfo != null ? pBufferInfo.getVkAddress() : VkPointer.NULL);
        this.pBufferInfo = pBufferInfo;
    }

    private static native long getPBufferInfo(long address);
    private static native void setPBufferInfo(long address, long pBufferInfo);

    public VkBufferView getPTexelBufferView() {
        return new VkBufferView(getVkMemory(), getPTexelBufferView(getVkAddress()));
    }

    private VkObject pTexelBufferView = null;
    public void setPTexelBufferView(VkBufferView pTexelBufferView) {
        setPTexelBufferView(getVkAddress(), pTexelBufferView != null ? pTexelBufferView.getVkAddress() : VkPointer.NULL);
        this.pTexelBufferView = pTexelBufferView;
    }

    private static native long getPTexelBufferView(long address);
    private static native void setPTexelBufferView(long address, long pTexelBufferView);


    public static native long sizeof();

    public static class Array extends VkWriteDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkWriteDescriptorSet> {        private final int count;

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
            return new VkWriteDescriptorSet(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkWriteDescriptorSet.Pointer implements cz.mg.collections.array.ReadonlyArray<VkWriteDescriptorSet.Pointer> {
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

            public Array(VkWriteDescriptorSet[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkWriteDescriptorSet.Pointer get(int i){
                return new VkWriteDescriptorSet.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
