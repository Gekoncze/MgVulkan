package cz.mg.vulkan;

public class VkCommandBufferBeginInfo extends VkObject {
    public VkCommandBufferBeginInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO));
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkCommandBufferUsageFlags getFlags() {
        return new VkCommandBufferUsageFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkCommandBufferUsageFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkCommandBufferInheritanceInfo getPInheritanceInfo() {
        return new VkCommandBufferInheritanceInfo(getVkMemory(), getPInheritanceInfo(getVkAddress()));
    }

    private VkObject pInheritanceInfo = null;
    public void setPInheritanceInfo(VkCommandBufferInheritanceInfo pInheritanceInfo) {
        setPInheritanceInfo(getVkAddress(), pInheritanceInfo != null ? pInheritanceInfo.getVkAddress() : VkPointer.NULL);
        this.pInheritanceInfo = pInheritanceInfo;
    }

    protected static native long getPInheritanceInfo(long address);
    protected static native void setPInheritanceInfo(long address, long pInheritanceInfo);


    public static native long sizeof();

    public static class Array extends VkCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferBeginInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO));;
        }

        public Array(int count, VkCommandBufferBeginInfo o){
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
        public VkCommandBufferBeginInfo get(int i){
            return new VkCommandBufferBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandBufferBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferBeginInfo.Pointer> {
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

            public Array(VkCommandBufferBeginInfo[] a) {
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
            public VkCommandBufferBeginInfo.Pointer get(int i){
                return new VkCommandBufferBeginInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
