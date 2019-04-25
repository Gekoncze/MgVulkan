package cz.mg.vulkan;

public class VkTextureLODGatherFormatPropertiesAMD extends VkObject {
    public VkTextureLODGatherFormatPropertiesAMD() {
        super(sizeof());
    }

    protected VkTextureLODGatherFormatPropertiesAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkTextureLODGatherFormatPropertiesAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkTextureLODGatherFormatPropertiesAMD(VkPointer pointer) {
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

    public VkBool32 getSupportsTextureGatherLODBiasAMD() {
        return new VkBool32(getVkMemory(), getSupportsTextureGatherLODBiasAMDNative(getVkAddress()));
    }

    
    public void setSupportsTextureGatherLODBiasAMD(VkBool32 supportsTextureGatherLODBiasAMD) {
        setSupportsTextureGatherLODBiasAMDNative(getVkAddress(), supportsTextureGatherLODBiasAMD != null ? supportsTextureGatherLODBiasAMD.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportsTextureGatherLODBiasAMDQ() {
        return getSupportsTextureGatherLODBiasAMD().getValue();
    }

    public void setSupportsTextureGatherLODBiasAMD(int supportsTextureGatherLODBiasAMD) {
        getSupportsTextureGatherLODBiasAMD().setValue(supportsTextureGatherLODBiasAMD);
    }

    protected static native long getSupportsTextureGatherLODBiasAMDNative(long address);
    protected static native void setSupportsTextureGatherLODBiasAMDNative(long address, long supportsTextureGatherLODBiasAMD);


    public static native long sizeof();

    public static class Array extends VkTextureLODGatherFormatPropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VkTextureLODGatherFormatPropertiesAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkTextureLODGatherFormatPropertiesAMD.sizeof()));
            this.count = count;
        }

        public Array(VkTextureLODGatherFormatPropertiesAMD o, int count){
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
        public VkTextureLODGatherFormatPropertiesAMD get(int i){
            return new VkTextureLODGatherFormatPropertiesAMD(getVkMemory(), address(i));
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
