package cz.mg.vulkan;

public class VkDrawIndexedIndirectCommand extends VkObject {
    public VkDrawIndexedIndirectCommand() {
        super(sizeof());
    }

    public VkDrawIndexedIndirectCommand(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDrawIndexedIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getIndexCount() {
        return new VkUInt32(getVkMemory(), getIndexCount(getVkAddress()));
    }

    
    public void setIndexCount(VkUInt32 indexCount) {
        setIndexCount(getVkAddress(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getIndexCount(long address);
    private static native void setIndexCount(long address, long indexCount);

    public VkUInt32 getInstanceCount() {
        return new VkUInt32(getVkMemory(), getInstanceCount(getVkAddress()));
    }

    
    public void setInstanceCount(VkUInt32 instanceCount) {
        setInstanceCount(getVkAddress(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getInstanceCount(long address);
    private static native void setInstanceCount(long address, long instanceCount);

    public VkUInt32 getFirstIndex() {
        return new VkUInt32(getVkMemory(), getFirstIndex(getVkAddress()));
    }

    
    public void setFirstIndex(VkUInt32 firstIndex) {
        setFirstIndex(getVkAddress(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFirstIndex(long address);
    private static native void setFirstIndex(long address, long firstIndex);

    public VkInt32 getVertexOffset() {
        return new VkInt32(getVkMemory(), getVertexOffset(getVkAddress()));
    }

    
    public void setVertexOffset(VkInt32 vertexOffset) {
        setVertexOffset(getVkAddress(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getVertexOffset(long address);
    private static native void setVertexOffset(long address, long vertexOffset);

    public VkUInt32 getFirstInstance() {
        return new VkUInt32(getVkMemory(), getFirstInstance(getVkAddress()));
    }

    
    public void setFirstInstance(VkUInt32 firstInstance) {
        setFirstInstance(getVkAddress(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFirstInstance(long address);
    private static native void setFirstInstance(long address, long firstInstance);


    public static native long sizeof();

    public static class Array extends VkDrawIndexedIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDrawIndexedIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDrawIndexedIndirectCommand.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDrawIndexedIndirectCommand o){
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
        public VkDrawIndexedIndirectCommand get(int i){
            return new VkDrawIndexedIndirectCommand(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDrawIndexedIndirectCommand.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDrawIndexedIndirectCommand.Pointer> {
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

            public Array(VkDrawIndexedIndirectCommand[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDrawIndexedIndirectCommand.Pointer get(int i){
                return new VkDrawIndexedIndirectCommand.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
