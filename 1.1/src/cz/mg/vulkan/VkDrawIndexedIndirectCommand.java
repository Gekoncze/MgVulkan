package cz.mg.vulkan;

public class VkDrawIndexedIndirectCommand extends VkObject {
    public VkDrawIndexedIndirectCommand() {
        super(sizeof());
    }

    protected VkDrawIndexedIndirectCommand(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDrawIndexedIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDrawIndexedIndirectCommand(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getIndexCount() {
        return new VkUInt32(getVkMemory(), getIndexCountNative(getVkAddress()));
    }

    
    public void setIndexCount(VkUInt32 indexCount) {
        setIndexCountNative(getVkAddress(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndexCountQ() {
        return getIndexCount().getValue();
    }

    public void setIndexCount(int indexCount) {
        getIndexCount().setValue(indexCount);
    }

    protected static native long getIndexCountNative(long address);
    protected static native void setIndexCountNative(long address, long indexCount);

    public VkUInt32 getInstanceCount() {
        return new VkUInt32(getVkMemory(), getInstanceCountNative(getVkAddress()));
    }

    
    public void setInstanceCount(VkUInt32 instanceCount) {
        setInstanceCountNative(getVkAddress(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInstanceCountQ() {
        return getInstanceCount().getValue();
    }

    public void setInstanceCount(int instanceCount) {
        getInstanceCount().setValue(instanceCount);
    }

    protected static native long getInstanceCountNative(long address);
    protected static native void setInstanceCountNative(long address, long instanceCount);

    public VkUInt32 getFirstIndex() {
        return new VkUInt32(getVkMemory(), getFirstIndexNative(getVkAddress()));
    }

    
    public void setFirstIndex(VkUInt32 firstIndex) {
        setFirstIndexNative(getVkAddress(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFirstIndexQ() {
        return getFirstIndex().getValue();
    }

    public void setFirstIndex(int firstIndex) {
        getFirstIndex().setValue(firstIndex);
    }

    protected static native long getFirstIndexNative(long address);
    protected static native void setFirstIndexNative(long address, long firstIndex);

    public VkInt32 getVertexOffset() {
        return new VkInt32(getVkMemory(), getVertexOffsetNative(getVkAddress()));
    }

    
    public void setVertexOffset(VkInt32 vertexOffset) {
        setVertexOffsetNative(getVkAddress(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexOffsetQ() {
        return getVertexOffset().getValue();
    }

    public void setVertexOffset(int vertexOffset) {
        getVertexOffset().setValue(vertexOffset);
    }

    protected static native long getVertexOffsetNative(long address);
    protected static native void setVertexOffsetNative(long address, long vertexOffset);

    public VkUInt32 getFirstInstance() {
        return new VkUInt32(getVkMemory(), getFirstInstanceNative(getVkAddress()));
    }

    
    public void setFirstInstance(VkUInt32 firstInstance) {
        setFirstInstanceNative(getVkAddress(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFirstInstanceQ() {
        return getFirstInstance().getValue();
    }

    public void setFirstInstance(int firstInstance) {
        getFirstInstance().setValue(firstInstance);
    }

    protected static native long getFirstInstanceNative(long address);
    protected static native void setFirstInstanceNative(long address, long firstInstance);


    public void set(VkDrawIndexedIndirectCommand o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDrawIndexedIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDrawIndexedIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDrawIndexedIndirectCommand.sizeof()));
            this.count = count;
        }

        public Array(VkDrawIndexedIndirectCommand o, int count){
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
        public VkDrawIndexedIndirectCommand get(int i){
            return new VkDrawIndexedIndirectCommand(getVkMemory(), address(i));
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
