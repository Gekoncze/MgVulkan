package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSparseMemoryRequirementsInfo2.html">khronos documentation</a>
 **/
public class VkImageSparseMemoryRequirementsInfo2 extends VkObject {
    public VkImageSparseMemoryRequirementsInfo2() {
        super(sizeof());
    }

    public VkImageSparseMemoryRequirementsInfo2(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkImageSparseMemoryRequirementsInfo2(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkImageSparseMemoryRequirementsInfo2(VkObject pNext, VkImage image) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2));
        setPNext(pNext);
        setImage(image);
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

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    public void setImage(VkImage image) {
        setImage(getVkAddress(), image.getVkAddress());
    }

    private static native long getImage(long address);
    private static native void setImage(long address, long image);


    public static native long sizeof();

    public static class Array extends VkImageSparseMemoryRequirementsInfo2 implements cz.mg.collections.array.ReadonlyArray<VkImageSparseMemoryRequirementsInfo2> {
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
        public VkImageSparseMemoryRequirementsInfo2 get(int i){
            return new VkImageSparseMemoryRequirementsInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageSparseMemoryRequirementsInfo2[] a) {
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
