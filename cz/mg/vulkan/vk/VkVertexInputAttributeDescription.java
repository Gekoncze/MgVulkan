package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkVertexInputAttributeDescription.html">khronos documentation</a>
 **/
public class VkVertexInputAttributeDescription extends VkObject {
    public VkVertexInputAttributeDescription() {
        super(sizeof());
    }

    public VkVertexInputAttributeDescription(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkVertexInputAttributeDescription(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkVertexInputAttributeDescription(VkUInt32 location, VkUInt32 binding, VkFormat format, VkUInt32 offset) {
        super(sizeof());
        setLocation(location);
        setBinding(binding);
        setFormat(format);
        setOffset(offset);
    }

    public VkUInt32 getLocation() {
        return new VkUInt32(getVkMemory(), getLocation(getVkAddress()));
    }

    public void setLocation(VkUInt32 location) {
        setLocation(getVkAddress(), location.getVkAddress());
    }

    private static native long getLocation(long address);
    private static native void setLocation(long address, long location);

    public VkUInt32 getBinding() {
        return new VkUInt32(getVkMemory(), getBinding(getVkAddress()));
    }

    public void setBinding(VkUInt32 binding) {
        setBinding(getVkAddress(), binding.getVkAddress());
    }

    private static native long getBinding(long address);
    private static native void setBinding(long address, long binding);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format.getVkAddress());
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset.getVkAddress());
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);


    public static native long sizeof();

    public static class Array extends VkVertexInputAttributeDescription implements cz.mg.collections.array.ReadonlyArray<VkVertexInputAttributeDescription> {
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
        public VkVertexInputAttributeDescription get(int i){
            return new VkVertexInputAttributeDescription(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkVertexInputAttributeDescription[] a) {
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
