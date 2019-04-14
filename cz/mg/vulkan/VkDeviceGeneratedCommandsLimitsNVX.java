package cz.mg.vulkan;

public class VkDeviceGeneratedCommandsLimitsNVX extends VkObject {
    public VkDeviceGeneratedCommandsLimitsNVX() {
        super(sizeof());
    }

    public VkDeviceGeneratedCommandsLimitsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGeneratedCommandsLimitsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkUInt32 getMaxIndirectCommandsLayoutTokenCount() {
        return new VkUInt32(getVkMemory(), getMaxIndirectCommandsLayoutTokenCount(getVkAddress()));
    }

    
    public void setMaxIndirectCommandsLayoutTokenCount(VkUInt32 maxIndirectCommandsLayoutTokenCount) {
        setMaxIndirectCommandsLayoutTokenCount(getVkAddress(), maxIndirectCommandsLayoutTokenCount != null ? maxIndirectCommandsLayoutTokenCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxIndirectCommandsLayoutTokenCount(long address);
    private static native void setMaxIndirectCommandsLayoutTokenCount(long address, long maxIndirectCommandsLayoutTokenCount);

    public VkUInt32 getMaxObjectEntryCounts() {
        return new VkUInt32(getVkMemory(), getMaxObjectEntryCounts(getVkAddress()));
    }

    
    public void setMaxObjectEntryCounts(VkUInt32 maxObjectEntryCounts) {
        setMaxObjectEntryCounts(getVkAddress(), maxObjectEntryCounts != null ? maxObjectEntryCounts.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxObjectEntryCounts(long address);
    private static native void setMaxObjectEntryCounts(long address, long maxObjectEntryCounts);

    public VkUInt32 getMinSequenceCountBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinSequenceCountBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinSequenceCountBufferOffsetAlignment(VkUInt32 minSequenceCountBufferOffsetAlignment) {
        setMinSequenceCountBufferOffsetAlignment(getVkAddress(), minSequenceCountBufferOffsetAlignment != null ? minSequenceCountBufferOffsetAlignment.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinSequenceCountBufferOffsetAlignment(long address);
    private static native void setMinSequenceCountBufferOffsetAlignment(long address, long minSequenceCountBufferOffsetAlignment);

    public VkUInt32 getMinSequenceIndexBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinSequenceIndexBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinSequenceIndexBufferOffsetAlignment(VkUInt32 minSequenceIndexBufferOffsetAlignment) {
        setMinSequenceIndexBufferOffsetAlignment(getVkAddress(), minSequenceIndexBufferOffsetAlignment != null ? minSequenceIndexBufferOffsetAlignment.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinSequenceIndexBufferOffsetAlignment(long address);
    private static native void setMinSequenceIndexBufferOffsetAlignment(long address, long minSequenceIndexBufferOffsetAlignment);

    public VkUInt32 getMinCommandsTokenBufferOffsetAlignment() {
        return new VkUInt32(getVkMemory(), getMinCommandsTokenBufferOffsetAlignment(getVkAddress()));
    }

    
    public void setMinCommandsTokenBufferOffsetAlignment(VkUInt32 minCommandsTokenBufferOffsetAlignment) {
        setMinCommandsTokenBufferOffsetAlignment(getVkAddress(), minCommandsTokenBufferOffsetAlignment != null ? minCommandsTokenBufferOffsetAlignment.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinCommandsTokenBufferOffsetAlignment(long address);
    private static native void setMinCommandsTokenBufferOffsetAlignment(long address, long minCommandsTokenBufferOffsetAlignment);


    public static native long sizeof();

    public static class Array extends VkDeviceGeneratedCommandsLimitsNVX implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsLimitsNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGeneratedCommandsLimitsNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGeneratedCommandsLimitsNVX o){
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
        public VkDeviceGeneratedCommandsLimitsNVX get(int i){
            return new VkDeviceGeneratedCommandsLimitsNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGeneratedCommandsLimitsNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGeneratedCommandsLimitsNVX.Pointer> {
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

            public Array(VkDeviceGeneratedCommandsLimitsNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGeneratedCommandsLimitsNVX.Pointer get(int i){
                return new VkDeviceGeneratedCommandsLimitsNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
