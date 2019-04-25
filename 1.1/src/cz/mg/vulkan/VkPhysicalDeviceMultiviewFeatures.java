package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewFeatures extends VkObject {
    public VkPhysicalDeviceMultiviewFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDeviceMultiviewFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceMultiviewFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceMultiviewFeatures(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkBool32 getMultiview() {
        return new VkBool32(getVkMemory(), getMultiviewNative(getVkAddress()));
    }

    
    public void setMultiview(VkBool32 multiview) {
        setMultiviewNative(getVkAddress(), multiview != null ? multiview.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewQ() {
        return getMultiview().getValue();
    }

    public void setMultiview(int multiview) {
        getMultiview().setValue(multiview);
    }

    protected static native long getMultiviewNative(long address);
    protected static native void setMultiviewNative(long address, long multiview);

    public VkBool32 getMultiviewGeometryShader() {
        return new VkBool32(getVkMemory(), getMultiviewGeometryShaderNative(getVkAddress()));
    }

    
    public void setMultiviewGeometryShader(VkBool32 multiviewGeometryShader) {
        setMultiviewGeometryShaderNative(getVkAddress(), multiviewGeometryShader != null ? multiviewGeometryShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewGeometryShaderQ() {
        return getMultiviewGeometryShader().getValue();
    }

    public void setMultiviewGeometryShader(int multiviewGeometryShader) {
        getMultiviewGeometryShader().setValue(multiviewGeometryShader);
    }

    protected static native long getMultiviewGeometryShaderNative(long address);
    protected static native void setMultiviewGeometryShaderNative(long address, long multiviewGeometryShader);

    public VkBool32 getMultiviewTessellationShader() {
        return new VkBool32(getVkMemory(), getMultiviewTessellationShaderNative(getVkAddress()));
    }

    
    public void setMultiviewTessellationShader(VkBool32 multiviewTessellationShader) {
        setMultiviewTessellationShaderNative(getVkAddress(), multiviewTessellationShader != null ? multiviewTessellationShader.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMultiviewTessellationShaderQ() {
        return getMultiviewTessellationShader().getValue();
    }

    public void setMultiviewTessellationShader(int multiviewTessellationShader) {
        getMultiviewTessellationShader().setValue(multiviewTessellationShader);
    }

    protected static native long getMultiviewTessellationShaderNative(long address);
    protected static native void setMultiviewTessellationShaderNative(long address, long multiviewTessellationShader);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMultiviewFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMultiviewFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceMultiviewFeatures o, int count){
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
        public VkPhysicalDeviceMultiviewFeatures get(int i){
            return new VkPhysicalDeviceMultiviewFeatures(getVkMemory(), address(i));
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
