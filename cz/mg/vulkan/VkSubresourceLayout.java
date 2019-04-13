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

    public VkSubresourceLayout(VkDeviceSize offset, VkDeviceSize size, VkDeviceSize rowPitch, VkDeviceSize arrayPitch, VkDeviceSize depthPitch) {
        super(sizeof());
        setOffset(offset);
        setSize(size);
        setRowPitch(rowPitch);
        setArrayPitch(arrayPitch);
        setDepthPitch(depthPitch);
    }

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);

    public VkDeviceSize getRowPitch() {
        return new VkDeviceSize(getVkMemory(), getRowPitch(getVkAddress()));
    }

    
    public void setRowPitch(VkDeviceSize rowPitch) {
        setRowPitch(getVkAddress(), rowPitch != null ? rowPitch.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRowPitch(long address);
    private static native void setRowPitch(long address, long rowPitch);

    public VkDeviceSize getArrayPitch() {
        return new VkDeviceSize(getVkMemory(), getArrayPitch(getVkAddress()));
    }

    
    public void setArrayPitch(VkDeviceSize arrayPitch) {
        setArrayPitch(getVkAddress(), arrayPitch != null ? arrayPitch.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getArrayPitch(long address);
    private static native void setArrayPitch(long address, long arrayPitch);

    public VkDeviceSize getDepthPitch() {
        return new VkDeviceSize(getVkMemory(), getDepthPitch(getVkAddress()));
    }

    
    public void setDepthPitch(VkDeviceSize depthPitch) {
        setDepthPitch(getVkAddress(), depthPitch != null ? depthPitch.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDepthPitch(long address);
    private static native void setDepthPitch(long address, long depthPitch);


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
            return new VkSubresourceLayout(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSubresourceLayout.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSubresourceLayout.Pointer> {
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

            public Array(VkSubresourceLayout[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSubresourceLayout.Pointer get(int i){
                return new VkSubresourceLayout.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
