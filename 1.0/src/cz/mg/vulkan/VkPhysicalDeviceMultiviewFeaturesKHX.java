package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewFeaturesKHX extends VkObject {
    public VkPhysicalDeviceMultiviewFeaturesKHX() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMultiviewFeaturesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMultiviewFeaturesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewFeaturesKHX(VkPointer pointer) {
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

    public VkBool32 getMultiview() {
        return new VkBool32(getVkMemory(), getMultiview(getVkAddress()));
    }

    
    public void setMultiview(VkBool32 multiview) {
        setMultiview(getVkAddress(), multiview != null ? multiview.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewQ() {
        return getMultiview().getValue();
    }

    public void setMultiview(int multiview) {
        getMultiview().setValue(multiview);
    }

    protected static native long getMultiview(long address);
    protected static native void setMultiview(long address, long multiview);

    public VkBool32 getMultiviewGeometryShader() {
        return new VkBool32(getVkMemory(), getMultiviewGeometryShader(getVkAddress()));
    }

    
    public void setMultiviewGeometryShader(VkBool32 multiviewGeometryShader) {
        setMultiviewGeometryShader(getVkAddress(), multiviewGeometryShader != null ? multiviewGeometryShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewGeometryShaderQ() {
        return getMultiviewGeometryShader().getValue();
    }

    public void setMultiviewGeometryShader(int multiviewGeometryShader) {
        getMultiviewGeometryShader().setValue(multiviewGeometryShader);
    }

    protected static native long getMultiviewGeometryShader(long address);
    protected static native void setMultiviewGeometryShader(long address, long multiviewGeometryShader);

    public VkBool32 getMultiviewTessellationShader() {
        return new VkBool32(getVkMemory(), getMultiviewTessellationShader(getVkAddress()));
    }

    
    public void setMultiviewTessellationShader(VkBool32 multiviewTessellationShader) {
        setMultiviewTessellationShader(getVkAddress(), multiviewTessellationShader != null ? multiviewTessellationShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewTessellationShaderQ() {
        return getMultiviewTessellationShader().getValue();
    }

    public void setMultiviewTessellationShader(int multiviewTessellationShader) {
        getMultiviewTessellationShader().setValue(multiviewTessellationShader);
    }

    protected static native long getMultiviewTessellationShader(long address);
    protected static native void setMultiviewTessellationShader(long address, long multiviewTessellationShader);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewFeaturesKHX implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewFeaturesKHX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewFeaturesKHX.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMultiviewFeaturesKHX o, int count){
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
        public VkPhysicalDeviceMultiviewFeaturesKHX get(int i){
            return new VkPhysicalDeviceMultiviewFeaturesKHX(getVkMemory(), addressAt(i));
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
