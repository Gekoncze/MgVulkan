package cz.mg.vulkan;

public class VkBindImageMemoryInfo extends VkObject {
    public VkBindImageMemoryInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO));
    }

    public VkBindImageMemoryInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindImageMemoryInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImage(long address);
    protected static native void setImage(long address, long image);

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemory(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemory(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMemory(long address);
    protected static native void setMemory(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffset(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffset(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMemoryOffsetQ() {
        return getMemoryOffset().getValue();
    }

    public void setMemoryOffset(long memoryOffset) {
        getMemoryOffset().setValue(memoryOffset);
    }

    protected static native long getMemoryOffset(long address);
    protected static native void setMemoryOffset(long address, long memoryOffset);


    public static native long sizeof();

    public static class Array extends VkBindImageMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindImageMemoryInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO));;
        }

        public Array(int count, VkBindImageMemoryInfo o){
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
        public VkBindImageMemoryInfo get(int i){
            return new VkBindImageMemoryInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkBindImageMemoryInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkBindImageMemoryInfo.Pointer> {
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

            public Array(VkBindImageMemoryInfo[] a) {
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
            public VkBindImageMemoryInfo.Pointer get(int i){
                return new VkBindImageMemoryInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
