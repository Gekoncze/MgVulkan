package cz.mg.vulkan;

public class VkPhysicalDeviceMultiviewFeaturesKHX extends VkObject {
    public VkPhysicalDeviceMultiviewFeaturesKHX() {
        super(sizeof());
    }

    public VkPhysicalDeviceMultiviewFeaturesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMultiviewFeaturesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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
        setMultiview(getVkAddress(), multiview != null ? multiview.getVkAddress() : VkPointer.getNullAddress());
        
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
        setMultiviewGeometryShader(getVkAddress(), multiviewGeometryShader != null ? multiviewGeometryShader.getVkAddress() : VkPointer.getNullAddress());
        
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
        setMultiviewTessellationShader(getVkAddress(), multiviewTessellationShader != null ? multiviewTessellationShader.getVkAddress() : VkPointer.getNullAddress());
        
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

        public Array(int count, VkPhysicalDeviceMultiviewFeaturesKHX o){
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
        public VkPhysicalDeviceMultiviewFeaturesKHX get(int i){
            return new VkPhysicalDeviceMultiviewFeaturesKHX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceMultiviewFeaturesKHX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMultiviewFeaturesKHX.Pointer> {
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

            public Array(VkPhysicalDeviceMultiviewFeaturesKHX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceMultiviewFeaturesKHX.Pointer get(int i){
                return new VkPhysicalDeviceMultiviewFeaturesKHX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
