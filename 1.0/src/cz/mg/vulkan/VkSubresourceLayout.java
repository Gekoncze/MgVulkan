package cz.mg.vulkan;

public class VkSubresourceLayout extends VkObject {
    public VkSubresourceLayout() {
        super(sizeof());
    }

    public VkSubresourceLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubresourceLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSize(long address);
    protected static native void setSize(long address, long size);

    public VkDeviceSize getRowPitch() {
        return new VkDeviceSize(getVkMemory(), getRowPitch(getVkAddress()));
    }

    
    public void setRowPitch(VkDeviceSize rowPitch) {
        setRowPitch(getVkAddress(), rowPitch != null ? rowPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getRowPitchQ() {
        return getRowPitch().getValue();
    }

    public void setRowPitch(long rowPitch) {
        getRowPitch().setValue(rowPitch);
    }

    protected static native long getRowPitch(long address);
    protected static native void setRowPitch(long address, long rowPitch);

    public VkDeviceSize getArrayPitch() {
        return new VkDeviceSize(getVkMemory(), getArrayPitch(getVkAddress()));
    }

    
    public void setArrayPitch(VkDeviceSize arrayPitch) {
        setArrayPitch(getVkAddress(), arrayPitch != null ? arrayPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getArrayPitchQ() {
        return getArrayPitch().getValue();
    }

    public void setArrayPitch(long arrayPitch) {
        getArrayPitch().setValue(arrayPitch);
    }

    protected static native long getArrayPitch(long address);
    protected static native void setArrayPitch(long address, long arrayPitch);

    public VkDeviceSize getDepthPitch() {
        return new VkDeviceSize(getVkMemory(), getDepthPitch(getVkAddress()));
    }

    
    public void setDepthPitch(VkDeviceSize depthPitch) {
        setDepthPitch(getVkAddress(), depthPitch != null ? depthPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDepthPitchQ() {
        return getDepthPitch().getValue();
    }

    public void setDepthPitch(long depthPitch) {
        getDepthPitch().setValue(depthPitch);
    }

    protected static native long getDepthPitch(long address);
    protected static native void setDepthPitch(long address, long depthPitch);


    public static native long sizeof();

    public static class Array extends VkSubresourceLayout implements cz.mg.collections.array.ReadonlyArray<VkSubresourceLayout> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubresourceLayout.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubresourceLayout o){
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
        public VkSubresourceLayout get(int i){
            return new VkSubresourceLayout(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
