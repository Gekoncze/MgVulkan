package cz.mg.vulkan;

public class VkDrawIndirectCommand extends VkObject {
    public VkDrawIndirectCommand() {
        super(sizeof());
    }

    public VkDrawIndirectCommand(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDrawIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getVertexCount() {
        return new VkUInt32(getVkMemory(), getVertexCount(getVkAddress()));
    }

    
    public void setVertexCount(VkUInt32 vertexCount) {
        setVertexCount(getVkAddress(), vertexCount != null ? vertexCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexCountQ() {
        return getVertexCount().getValue();
    }

    public void setVertexCount(int vertexCount) {
        getVertexCount().setValue(vertexCount);
    }

    protected static native long getVertexCount(long address);
    protected static native void setVertexCount(long address, long vertexCount);

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

    public VkUInt32 getFirstVertex() {
        return new VkUInt32(getVkMemory(), getFirstVertex(getVkAddress()));
    }

    
    public void setFirstVertex(VkUInt32 firstVertex) {
        setFirstVertex(getVkAddress(), firstVertex != null ? firstVertex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFirstVertexQ() {
        return getFirstVertex().getValue();
    }

    public void setFirstVertex(int firstVertex) {
        getFirstVertex().setValue(firstVertex);
    }

    protected static native long getFirstVertex(long address);
    protected static native void setFirstVertex(long address, long firstVertex);

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

    public static class Array extends VkDrawIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDrawIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDrawIndirectCommand.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDrawIndirectCommand o){
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
        public VkDrawIndirectCommand get(int i){
            return new VkDrawIndirectCommand(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkDrawIndirectCommand.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDrawIndirectCommand.Pointer> {
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

            public Array(VkDrawIndirectCommand[] a) {
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
            public VkDrawIndirectCommand.Pointer get(int i){
                return new VkDrawIndirectCommand.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
