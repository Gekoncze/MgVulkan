package cz.mg.vulkan;

public class VkTextureLODGatherFormatPropertiesAMD extends VkObject {
    public VkTextureLODGatherFormatPropertiesAMD() {
        super(sizeof());
    }

    public VkTextureLODGatherFormatPropertiesAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkTextureLODGatherFormatPropertiesAMD(VkMemory vkmemory, long vkaddress) {
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

    public VkBool32 getSupportsTextureGatherLODBiasAMD() {
        return new VkBool32(getVkMemory(), getSupportsTextureGatherLODBiasAMD(getVkAddress()));
    }

    
    public void setSupportsTextureGatherLODBiasAMD(VkBool32 supportsTextureGatherLODBiasAMD) {
        setSupportsTextureGatherLODBiasAMD(getVkAddress(), supportsTextureGatherLODBiasAMD != null ? supportsTextureGatherLODBiasAMD.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSupportsTextureGatherLODBiasAMDQ() {
        return getSupportsTextureGatherLODBiasAMD().getValue();
    }

    public void setSupportsTextureGatherLODBiasAMD(int supportsTextureGatherLODBiasAMD) {
        getSupportsTextureGatherLODBiasAMD().setValue(supportsTextureGatherLODBiasAMD);
    }

    private static native long getSupportsTextureGatherLODBiasAMD(long address);
    private static native void setSupportsTextureGatherLODBiasAMD(long address, long supportsTextureGatherLODBiasAMD);


    public static native long sizeof();

    public static class Array extends VkTextureLODGatherFormatPropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VkTextureLODGatherFormatPropertiesAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkTextureLODGatherFormatPropertiesAMD.sizeof()));
            this.count = count;
        }

        public Array(int count, VkTextureLODGatherFormatPropertiesAMD o){
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
        public VkTextureLODGatherFormatPropertiesAMD get(int i){
            return new VkTextureLODGatherFormatPropertiesAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkTextureLODGatherFormatPropertiesAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VkTextureLODGatherFormatPropertiesAMD.Pointer> {
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

            public Array(VkTextureLODGatherFormatPropertiesAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkTextureLODGatherFormatPropertiesAMD.Pointer get(int i){
                return new VkTextureLODGatherFormatPropertiesAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
