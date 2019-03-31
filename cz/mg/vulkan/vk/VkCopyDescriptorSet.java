package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCopyDescriptorSet.html">khronos documentation</a>
 **/
public class VkCopyDescriptorSet extends VkObject {
    public VkCopyDescriptorSet() {
        super(sizeof());
    }

    public VkCopyDescriptorSet(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkCopyDescriptorSet(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkCopyDescriptorSet(VkStructureType sType, VkObject pNext, VkDescriptorSet srcSet, VkUInt32 srcBinding, VkUInt32 srcArrayElement, VkDescriptorSet dstSet, VkUInt32 dstBinding, VkUInt32 dstArrayElement, VkUInt32 descriptorCount) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSrcSet(srcSet);
        setSrcBinding(srcBinding);
        setSrcArrayElement(srcArrayElement);
        setDstSet(dstSet);
        setDstBinding(dstBinding);
        setDstArrayElement(dstArrayElement);
        setDescriptorCount(descriptorCount);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDescriptorSet getSrcSet() {
        return new VkDescriptorSet(getVkMemory(), getSrcSet(getVkAddress()));
    }

    public void setSrcSet(VkDescriptorSet srcSet) {
        setSrcSet(getVkAddress(), srcSet.getVkAddress());
    }

    private static native long getSrcSet(long address);
    private static native void setSrcSet(long address, long srcSet);

    public VkUInt32 getSrcBinding() {
        return new VkUInt32(getVkMemory(), getSrcBinding(getVkAddress()));
    }

    public void setSrcBinding(VkUInt32 srcBinding) {
        setSrcBinding(getVkAddress(), srcBinding.getVkAddress());
    }

    private static native long getSrcBinding(long address);
    private static native void setSrcBinding(long address, long srcBinding);

    public VkUInt32 getSrcArrayElement() {
        return new VkUInt32(getVkMemory(), getSrcArrayElement(getVkAddress()));
    }

    public void setSrcArrayElement(VkUInt32 srcArrayElement) {
        setSrcArrayElement(getVkAddress(), srcArrayElement.getVkAddress());
    }

    private static native long getSrcArrayElement(long address);
    private static native void setSrcArrayElement(long address, long srcArrayElement);

    public VkDescriptorSet getDstSet() {
        return new VkDescriptorSet(getVkMemory(), getDstSet(getVkAddress()));
    }

    public void setDstSet(VkDescriptorSet dstSet) {
        setDstSet(getVkAddress(), dstSet.getVkAddress());
    }

    private static native long getDstSet(long address);
    private static native void setDstSet(long address, long dstSet);

    public VkUInt32 getDstBinding() {
        return new VkUInt32(getVkMemory(), getDstBinding(getVkAddress()));
    }

    public void setDstBinding(VkUInt32 dstBinding) {
        setDstBinding(getVkAddress(), dstBinding.getVkAddress());
    }

    private static native long getDstBinding(long address);
    private static native void setDstBinding(long address, long dstBinding);

    public VkUInt32 getDstArrayElement() {
        return new VkUInt32(getVkMemory(), getDstArrayElement(getVkAddress()));
    }

    public void setDstArrayElement(VkUInt32 dstArrayElement) {
        setDstArrayElement(getVkAddress(), dstArrayElement.getVkAddress());
    }

    private static native long getDstArrayElement(long address);
    private static native void setDstArrayElement(long address, long dstArrayElement);

    public VkUInt32 getDescriptorCount() {
        return new VkUInt32(getVkMemory(), getDescriptorCount(getVkAddress()));
    }

    public void setDescriptorCount(VkUInt32 descriptorCount) {
        setDescriptorCount(getVkAddress(), descriptorCount.getVkAddress());
    }

    private static native long getDescriptorCount(long address);
    private static native void setDescriptorCount(long address, long descriptorCount);


    public static native long sizeof();

    public static class Array extends VkCopyDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VkCopyDescriptorSet> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
