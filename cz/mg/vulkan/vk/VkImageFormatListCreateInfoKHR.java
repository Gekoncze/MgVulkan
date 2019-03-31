package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageFormatListCreateInfoKHR.html">khronos documentation</a>
 **/
public class VkImageFormatListCreateInfoKHR extends VkObject {
    public VkImageFormatListCreateInfoKHR() {
        super(sizeof());
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkImageFormatListCreateInfoKHR(VkObject pNext, VkUInt32 viewFormatCount, VkFormat pViewFormats) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR));
        setPNext(pNext);
        setViewFormatCount(viewFormatCount);
        setPViewFormats(pViewFormats);
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

    public VkUInt32 getViewFormatCount() {
        return new VkUInt32(getVkMemory(), getViewFormatCount(getVkAddress()));
    }

    public void setViewFormatCount(VkUInt32 viewFormatCount) {
        setViewFormatCount(getVkAddress(), viewFormatCount.getVkAddress());
    }

    private static native long getViewFormatCount(long address);
    private static native void setViewFormatCount(long address, long viewFormatCount);

    public VkFormat.Array getPViewFormats() {
        return new VkFormat.Array(getVkMemory(), getPViewFormats(getVkAddress()), getViewFormatCount().getValue());
    }

    public void setPViewFormats(VkFormat pViewFormats) {
        setPViewFormats(getVkAddress(), pViewFormats.getVkAddress());
    }

    private static native long getPViewFormats(long address);
    private static native void setPViewFormats(long address, long pViewFormats);


    public static native long sizeof();

    public static class Array extends VkImageFormatListCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImageFormatListCreateInfoKHR> {
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
        public VkImageFormatListCreateInfoKHR get(int i){
            return new VkImageFormatListCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageFormatListCreateInfoKHR[] a) {
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
