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

    public VkBool32 getShaderDrawParameters() {
        return new VkBool32(getVkMemory(), getShaderDrawParameters(getVkAddress()));
    }

    
    public void setShaderDrawParameters(VkBool32 shaderDrawParameters) {
        setShaderDrawParameters(getVkAddress(), shaderDrawParameters != null ? shaderDrawParameters.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderDrawParametersQ() {
        return getShaderDrawParameters().getValue();
    }

    public void setShaderDrawParameters(int shaderDrawParameters) {
        getShaderDrawParameters().setValue(shaderDrawParameters);
    }

    protected static native long getShaderDrawParameters(long address);
    protected static native void setShaderDrawParameters(long address, long shaderDrawParameters);


    public static native long sizeof();

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
            return new VkPhysicalDeviceShaderDrawParameterFeatures(getVkMemory(), addressAt(i));
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
