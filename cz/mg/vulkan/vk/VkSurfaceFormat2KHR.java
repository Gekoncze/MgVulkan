package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceFormat2KHR.html">khronos documentation</a>
 **/
public class VkSurfaceFormat2KHR extends VkObject {
    public VkSurfaceFormat2KHR() {
        super(sizeof());
    }

    public VkSurfaceFormat2KHR(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSurfaceFormat2KHR(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSurfaceFormat2KHR(VkStructureType sType, VkObject pNext, VkSurfaceFormatKHR surfaceFormat) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSurfaceFormat(surfaceFormat);
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

    public VkSurfaceFormatKHR getSurfaceFormat() {
        return new VkSurfaceFormatKHR(getVkMemory(), getSurfaceFormat(getVkAddress()));
    }

    public void setSurfaceFormat(VkSurfaceFormatKHR surfaceFormat) {
        setSurfaceFormat(getVkAddress(), surfaceFormat.getVkAddress());
    }

    private static native long getSurfaceFormat(long address);
    private static native void setSurfaceFormat(long address, long surfaceFormat);


    public static native long sizeof();

    public static class Array extends VkSurfaceFormat2KHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceFormat2KHR> {
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
        public VkSurfaceFormat2KHR get(int i){
            return new VkSurfaceFormat2KHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSurfaceFormat2KHR[] a) {
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
