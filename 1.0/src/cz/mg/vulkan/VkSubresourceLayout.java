package cz.mg.vulkan;

public class VkSubresourceLayout extends VkObject {
    public VkSubresourceLayout() {
        super(sizeof());
    }

    protected VkSubresourceLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubresourceLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubresourceLayout(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSizeNative(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSizeNative(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSizeNative(long address);
    protected static native void setSizeNative(long address, long size);

    public VkDeviceSize getRowPitch() {
        return new VkDeviceSize(getVkMemory(), getRowPitchNative(getVkAddress()));
    }

    
    public void setRowPitch(VkDeviceSize rowPitch) {
        setRowPitchNative(getVkAddress(), rowPitch != null ? rowPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getRowPitchQ() {
        return getRowPitch().getValue();
    }

    public void setRowPitch(long rowPitch) {
        getRowPitch().setValue(rowPitch);
    }

    protected static native long getRowPitchNative(long address);
    protected static native void setRowPitchNative(long address, long rowPitch);

    public VkDeviceSize getArrayPitch() {
        return new VkDeviceSize(getVkMemory(), getArrayPitchNative(getVkAddress()));
    }

    
    public void setArrayPitch(VkDeviceSize arrayPitch) {
        setArrayPitchNative(getVkAddress(), arrayPitch != null ? arrayPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getArrayPitchQ() {
        return getArrayPitch().getValue();
    }

    public void setArrayPitch(long arrayPitch) {
        getArrayPitch().setValue(arrayPitch);
    }

    protected static native long getArrayPitchNative(long address);
    protected static native void setArrayPitchNative(long address, long arrayPitch);

    public VkDeviceSize getDepthPitch() {
        return new VkDeviceSize(getVkMemory(), getDepthPitchNative(getVkAddress()));
    }

    
    public void setDepthPitch(VkDeviceSize depthPitch) {
        setDepthPitchNative(getVkAddress(), depthPitch != null ? depthPitch.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getDepthPitchQ() {
        return getDepthPitch().getValue();
    }

    public void setDepthPitch(long depthPitch) {
        getDepthPitch().setValue(depthPitch);
    }

    protected static native long getDepthPitchNative(long address);
    protected static native void setDepthPitchNative(long address, long depthPitch);


    public void set(VkSubresourceLayout o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSubresourceLayout implements cz.mg.collections.array.ReadonlyArray<VkSubresourceLayout> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubresourceLayout.sizeof()));
            this.count = count;
        }

        public Array(VkSubresourceLayout o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSubresourceLayout get(int i){
            return new VkSubresourceLayout(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
