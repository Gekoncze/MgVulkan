package cz.mg.vulkan;

public class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends VkObject {
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkPointer pointer) {
        super(pointer);
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

    public VkUInt32 getMaxVertexAttribDivisor() {
        return new VkUInt32(getVkMemory(), getMaxVertexAttribDivisor(getVkAddress()));
    }

    
    public void setMaxVertexAttribDivisor(VkUInt32 maxVertexAttribDivisor) {
        setMaxVertexAttribDivisor(getVkAddress(), maxVertexAttribDivisor != null ? maxVertexAttribDivisor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVertexAttribDivisorQ() {
        return getMaxVertexAttribDivisor().getValue();
    }

    public void setMaxVertexAttribDivisor(int maxVertexAttribDivisor) {
        getMaxVertexAttribDivisor().setValue(maxVertexAttribDivisor);
    }

    protected static native long getMaxVertexAttribDivisor(long address);
    protected static native void setMaxVertexAttribDivisor(long address, long maxVertexAttribDivisor);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT o, int count){
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
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT get(int i){
            return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
