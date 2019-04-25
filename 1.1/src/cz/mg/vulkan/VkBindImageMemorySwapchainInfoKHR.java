package cz.mg.vulkan;

public class VkBindImageMemorySwapchainInfoKHR extends VkObject {
    public VkBindImageMemorySwapchainInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR));
    }

    public VkBindImageMemorySwapchainInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImageMemorySwapchainInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkSwapchainKHR getSwapchain() {
        return new VkSwapchainKHR(getVkMemory(), getSwapchain(getVkAddress()));
    }

    
    public void setSwapchain(VkSwapchainKHR swapchain) {
        setSwapchain(getVkAddress(), swapchain != null ? swapchain.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSwapchain(long address);
    protected static native void setSwapchain(long address, long swapchain);

    public VkUInt32 getImageIndex() {
        return new VkUInt32(getVkMemory(), getImageIndex(getVkAddress()));
    }

    
    public void setImageIndex(VkUInt32 imageIndex) {
        setImageIndex(getVkAddress(), imageIndex != null ? imageIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageIndexQ() {
        return getImageIndex().getValue();
    }

    public void setImageIndex(int imageIndex) {
        getImageIndex().setValue(imageIndex);
    }

    protected static native long getImageIndex(long address);
    protected static native void setImageIndex(long address, long imageIndex);


    public static native long sizeof();

    public static class Array extends VkBindImageMemorySwapchainInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemorySwapchainInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemorySwapchainInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR));;
        }

        public Array(int count, VkBindImageMemorySwapchainInfoKHR o){
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
        public VkBindImageMemorySwapchainInfoKHR get(int i){
            return new VkBindImageMemorySwapchainInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBindImageMemorySwapchainInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemorySwapchainInfoKHR.Pointer> {
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

            public Array(VkBindImageMemorySwapchainInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkBindImageMemorySwapchainInfoKHR.Pointer get(int i){
                return new VkBindImageMemorySwapchainInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
