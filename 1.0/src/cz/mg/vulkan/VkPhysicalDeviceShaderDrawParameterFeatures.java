package cz.mg.vulkan;

public class VkPhysicalDeviceShaderDrawParameterFeatures extends VkObject {
    public VkPhysicalDeviceShaderDrawParameterFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDeviceShaderDrawParameterFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceShaderDrawParameterFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceShaderDrawParameterFeatures(VkPointer pointer) {
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

    public VkBool32 getShaderDrawParameters() {
        return new VkBool32(getVkMemory(), getShaderDrawParametersNative(getVkAddress()));
    }

    
    public void setShaderDrawParameters(VkBool32 shaderDrawParameters) {
        setShaderDrawParametersNative(getVkAddress(), shaderDrawParameters != null ? shaderDrawParameters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderDrawParametersQ() {
        return getShaderDrawParameters().getValue();
    }

    public void setShaderDrawParameters(int shaderDrawParameters) {
        getShaderDrawParameters().setValue(shaderDrawParameters);
    }

    protected static native long getShaderDrawParametersNative(long address);
    protected static native void setShaderDrawParametersNative(long address, long shaderDrawParameters);


    public void set(VkPhysicalDeviceShaderDrawParameterFeatures o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceShaderDrawParameterFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderDrawParameterFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceShaderDrawParameterFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceShaderDrawParameterFeatures o, int count){
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
        public VkPhysicalDeviceShaderDrawParameterFeatures get(int i){
            return new VkPhysicalDeviceShaderDrawParameterFeatures(getVkMemory(), address(i));
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
