package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateEntry.html">khronos documentation</a>
 **/
public class VkDescriptorUpdateTemplateEntry extends VkObject {
    public VkDescriptorUpdateTemplateEntry() {
        super(sizeof());
    }

    public VkDescriptorUpdateTemplateEntry(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateEntry(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDescriptorUpdateTemplateEntry(VkUInt32 dstBinding, VkUInt32 dstArrayElement, VkUInt32 descriptorCount, VkDescriptorType descriptorType, VkSize offset, VkSize stride) {
        super(sizeof());
        setDstBinding(dstBinding);
        setDstArrayElement(dstArrayElement);
        setDescriptorCount(descriptorCount);
        setDescriptorType(descriptorType);
        setOffset(offset);
        setStride(stride);
    }

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

    public VkSize getOffset() {
        return new VkSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkSize getStride() {
        return new VkSize(getVkMemory(), getStride(getVkAddress()));
    }

    
    public void setStride(VkSize stride) {
        setStride(getVkAddress(), stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStride(long address);
    private static native void setStride(long address, long stride);


    public static native long sizeof();

    public static class Array extends VkDescriptorUpdateTemplateEntry implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateEntry> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateEntry.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorUpdateTemplateEntry o){
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
        public VkDescriptorUpdateTemplateEntry get(int i){
            return new VkDescriptorUpdateTemplateEntry(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorUpdateTemplateEntry.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateEntry.Pointer> {
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

            public Array(VkDescriptorUpdateTemplateEntry[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorUpdateTemplateEntry.Pointer get(int i){
                return new VkDescriptorUpdateTemplateEntry.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
