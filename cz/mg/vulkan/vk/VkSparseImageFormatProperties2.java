package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatProperties2.html">khronos documentation</a>
 **/
public class VkSparseImageFormatProperties2 extends VkObject {
    public VkSparseImageFormatProperties2() {
        super(sizeof());
    }

    public VkSparseImageFormatProperties2(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSparseImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSparseImageFormatProperties2(VkStructureType sType, VkObject pNext, VkSparseImageFormatProperties properties) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setProperties(properties);
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

    public VkSparseImageFormatProperties getProperties() {
        return new VkSparseImageFormatProperties(getVkMemory(), getProperties(getVkAddress()));
    }

    public void setProperties(VkSparseImageFormatProperties properties) {
        setProperties(getVkAddress(), properties.getVkAddress());
    }

    private static native long getProperties(long address);
    private static native void setProperties(long address, long properties);


    public static native long sizeof();

    public static class Array extends VkSparseImageFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties2> {
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
        public VkSparseImageFormatProperties2 get(int i){
            return new VkSparseImageFormatProperties2(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSparseImageFormatProperties2[] a) {
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
