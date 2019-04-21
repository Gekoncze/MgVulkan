package cz.mg.vulkan;

public class VkImageFormatListCreateInfoKHR extends VkObject {
    public VkImageFormatListCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR));
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageFormatListCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getViewFormatCount() {
        return new VkUInt32(getVkMemory(), getViewFormatCount(getVkAddress()));
    }

    
    public void setViewFormatCount(VkUInt32 viewFormatCount) {
        setViewFormatCount(getVkAddress(), viewFormatCount != null ? viewFormatCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getViewFormatCountQ() {
        return getViewFormatCount().getValue();
    }

    public void setViewFormatCount(int viewFormatCount) {
        getViewFormatCount().setValue(viewFormatCount);
    }

    private static native long getViewFormatCount(long address);
    private static native void setViewFormatCount(long address, long viewFormatCount);

    public VkFormat getPViewFormats() {
        return new VkFormat(getVkMemory(), getPViewFormats(getVkAddress()));
    }

    private VkObject pViewFormats = null;
    public void setPViewFormats(VkFormat pViewFormats) {
        setPViewFormats(getVkAddress(), pViewFormats != null ? pViewFormats.getVkAddress() : VkPointer.NULL);
        this.pViewFormats = pViewFormats;
    }

    private static native long getPViewFormats(long address);
    private static native void setPViewFormats(long address, long pViewFormats);


    public static native long sizeof();

    public static class Array extends VkImageFormatListCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkImageFormatListCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageFormatListCreateInfoKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageFormatListCreateInfoKHR o){
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

        public static class Array extends VkImageFormatListCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageFormatListCreateInfoKHR.Pointer> {
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

            public Array(VkImageFormatListCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageFormatListCreateInfoKHR.Pointer get(int i){
                return new VkImageFormatListCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
