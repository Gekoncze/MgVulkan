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
        setIndexCount(getVkAddress(), indexCount != null ? indexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndexCountQ() {
        return getIndexCount().getValue();
    }

    public void setIndexCount(int indexCount) {
        getIndexCount().setValue(indexCount);
    }

    protected static native long getIndexCount(long address);
    protected static native void setIndexCount(long address, long indexCount);

    public VkUInt32 getInstanceCount() {
        return new VkUInt32(getVkMemory(), getInstanceCount(getVkAddress()));
    }

    
    public void setInstanceCount(VkUInt32 instanceCount) {
        setInstanceCount(getVkAddress(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInstanceCountQ() {
        return getInstanceCount().getValue();
    }

    public void setInstanceCount(int instanceCount) {
        getInstanceCount().setValue(instanceCount);
    }

    protected static native long getInstanceCount(long address);
    protected static native void setInstanceCount(long address, long instanceCount);

    public VkUInt32 getFirstIndex() {
        return new VkUInt32(getVkMemory(), getFirstIndex(getVkAddress()));
    }

    
    public void setFirstIndex(VkUInt32 firstIndex) {
        setFirstIndex(getVkAddress(), firstIndex != null ? firstIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFirstIndexQ() {
        return getFirstIndex().getValue();
    }

    public void setFirstIndex(int firstIndex) {
        getFirstIndex().setValue(firstIndex);
    }

    protected static native long getFirstIndex(long address);
    protected static native void setFirstIndex(long address, long firstIndex);

    public VkInt32 getVertexOffset() {
        return new VkInt32(getVkMemory(), getVertexOffset(getVkAddress()));
    }

    
    public void setVertexOffset(VkInt32 vertexOffset) {
        setVertexOffset(getVkAddress(), vertexOffset != null ? vertexOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexOffsetQ() {
        return getVertexOffset().getValue();
    }

    public void setVertexOffset(int vertexOffset) {
        getVertexOffset().setValue(vertexOffset);
    }

    protected static native long getVertexOffset(long address);
    protected static native void setVertexOffset(long address, long vertexOffset);

    public VkUInt32 getFirstInstance() {
        return new VkUInt32(getVkMemory(), getFirstInstance(getVkAddress()));
    }

    
    public void setFirstInstance(VkUInt32 firstInstance) {
        setFirstInstance(getVkAddress(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFirstInstanceQ() {
        return getFirstInstance().getValue();
    }

    public void setFirstInstance(int firstInstance) {
        getFirstInstance().setValue(firstInstance);
    }

    protected static native long getFirstInstance(long address);
    protected static native void setFirstInstance(long address, long firstInstance);


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
            return new VkDrawIndexedIndirectCommand(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
