package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExtent3D.html">khronos documentation</a>
 **/
public class VkExtent3D extends VkObject {
    public VkExtent3D() {
        super(sizeof());
    }

    public VkExtent3D(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkExtent3D(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkExtent3D(VkUInt32 width, VkUInt32 height, VkUInt32 depth) {
        super(sizeof());
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidth(getVkAddress()));
    }

    public void setWidth(VkUInt32 width) {
        setWidth(getVkAddress(), width.getVkAddress());
    }

    private static native long getWidth(long address);
    private static native void setWidth(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeight(getVkAddress()));
    }

    public void setHeight(VkUInt32 height) {
        setHeight(getVkAddress(), height.getVkAddress());
    }

    private static native long getHeight(long address);
    private static native void setHeight(long address, long height);

    public VkUInt32 getDepth() {
        return new VkUInt32(getVkMemory(), getDepth(getVkAddress()));
    }

    public void setDepth(VkUInt32 depth) {
        setDepth(getVkAddress(), depth.getVkAddress());
    }

    private static native long getDepth(long address);
    private static native void setDepth(long address, long depth);


    public static native long sizeof();

    public static class Array extends VkExtent3D implements cz.mg.collections.array.ReadonlyArray<VkExtent3D> {
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
        public VkExtent3D get(int i){
            return new VkExtent3D(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkExtent3D[] a) {
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
