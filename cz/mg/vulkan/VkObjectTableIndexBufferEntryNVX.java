package cz.mg.vulkan;

public class VkObjectTableIndexBufferEntryNVX extends VkObject {
    public VkObjectTableIndexBufferEntryNVX() {
        super(sizeof());
    }

    public VkObjectTableIndexBufferEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTableIndexBufferEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTableIndexBufferEntryNVX(VkObjectEntryTypeNVX type, VkObjectEntryUsageFlagsNVX flags, VkBuffer buffer, VkIndexType indexType) {
        super(sizeof());
        setType(type);
        setFlags(flags);
        setBuffer(buffer);
        setIndexType(indexType);
    }

    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);

    public VkIndexType getIndexType() {
        return new VkIndexType(getVkMemory(), getIndexType(getVkAddress()));
    }

    
    public void setIndexType(VkIndexType indexType) {
        setIndexType(getVkAddress(), indexType != null ? indexType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getIndexType(long address);
    private static native void setIndexType(long address, long indexType);


    public static native long sizeof();

    public static class Array extends VkObjectTableIndexBufferEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableIndexBufferEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableIndexBufferEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTableIndexBufferEntryNVX o){
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
        public VkObjectTableIndexBufferEntryNVX get(int i){
            return new VkObjectTableIndexBufferEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkObjectTableIndexBufferEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkObjectTableIndexBufferEntryNVX.Pointer> {
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

            public Array(VkObjectTableIndexBufferEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkObjectTableIndexBufferEntryNVX.Pointer get(int i){
                return new VkObjectTableIndexBufferEntryNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
