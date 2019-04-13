package cz.mg.vulkan;

public class VkDescriptorBufferInfo extends VkObject {
    public VkDescriptorBufferInfo() {
        super(sizeof());
    }

    public VkDescriptorBufferInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorBufferInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorBufferInfo(VkBuffer buffer, VkDeviceSize offset, VkDeviceSize range) {
        super(sizeof());
        setBuffer(buffer);
        setOffset(offset);
        setRange(range);
    }

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkDeviceSize getRange() {
        return new VkDeviceSize(getVkMemory(), getRange(getVkAddress()));
    }

    
    public void setRange(VkDeviceSize range) {
        setRange(getVkAddress(), range != null ? range.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRange(long address);
    private static native void setRange(long address, long range);


    public static native long sizeof();

    public static class Array extends VkDescriptorBufferInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorBufferInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorBufferInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorBufferInfo o){
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
        public VkDescriptorBufferInfo get(int i){
            return new VkDescriptorBufferInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDescriptorBufferInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorBufferInfo.Pointer> {
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

            public Array(VkDescriptorBufferInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorBufferInfo.Pointer get(int i){
                return new VkDescriptorBufferInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
