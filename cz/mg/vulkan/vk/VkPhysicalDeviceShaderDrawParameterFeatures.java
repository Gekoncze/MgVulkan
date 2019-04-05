package cz.mg.vulkan.vk;

public class VkPhysicalDeviceShaderDrawParameterFeatures extends VkObject {
    public VkPhysicalDeviceShaderDrawParameterFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceShaderDrawParameterFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceShaderDrawParameterFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceShaderDrawParameterFeatures(VkStructureType sType, VkObject pNext, VkBool32 shaderDrawParameters) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setShaderDrawParameters(shaderDrawParameters);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkBool32 getShaderDrawParameters() {
        return new VkBool32(getVkMemory(), getShaderDrawParameters(getVkAddress()));
    }

    
    public void setShaderDrawParameters(VkBool32 shaderDrawParameters) {
        setShaderDrawParameters(getVkAddress(), shaderDrawParameters != null ? shaderDrawParameters.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderDrawParameters(long address);
    private static native void setShaderDrawParameters(long address, long shaderDrawParameters);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceShaderDrawParameterFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderDrawParameterFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceShaderDrawParameterFeatures.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceShaderDrawParameterFeatures o){
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
        public VkPhysicalDeviceShaderDrawParameterFeatures get(int i){
            return new VkPhysicalDeviceShaderDrawParameterFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceShaderDrawParameterFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderDrawParameterFeatures.Pointer> {
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

            public Array(VkPhysicalDeviceShaderDrawParameterFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceShaderDrawParameterFeatures.Pointer get(int i){
                return new VkPhysicalDeviceShaderDrawParameterFeatures.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
