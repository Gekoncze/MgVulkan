package cz.mg.vulkan.vk;

public class VkSpecializationMapEntry extends VkObject {
    public VkSpecializationMapEntry() {
        super(sizeof());
    }

    public VkSpecializationMapEntry(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSpecializationMapEntry(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSpecializationMapEntry(VkUInt32 constantID, VkUInt32 offset, VkSize size) {
        super(sizeof());
        setConstantID(constantID);
        setOffset(offset);
        setSize(size);
    }

    public VkUInt32 getConstantID() {
        return new VkUInt32(getVkMemory(), getConstantID(getVkAddress()));
    }

    
    public void setConstantID(VkUInt32 constantID) {
        setConstantID(getVkAddress(), constantID != null ? constantID.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getConstantID(long address);
    private static native void setConstantID(long address, long constantID);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkSize getSize() {
        return new VkSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkSpecializationMapEntry implements cz.mg.collections.array.ReadonlyArray<VkSpecializationMapEntry> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSpecializationMapEntry.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSpecializationMapEntry o){
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
        public VkSpecializationMapEntry get(int i){
            return new VkSpecializationMapEntry(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSpecializationMapEntry.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSpecializationMapEntry.Pointer> {
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

            public Array(VkSpecializationMapEntry[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSpecializationMapEntry.Pointer get(int i){
                return new VkSpecializationMapEntry.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
