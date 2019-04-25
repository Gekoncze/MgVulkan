package cz.mg.vulkan;

public class VkPipelineRasterizationConservativeStateCreateInfoEXT extends VkObject {
    public VkPipelineRasterizationConservativeStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkPipelineRasterizationConservativeStateCreateFlagsEXT getFlags() {
        return new VkPipelineRasterizationConservativeStateCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineRasterizationConservativeStateCreateFlagsEXT flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkConservativeRasterizationModeEXT getConservativeRasterizationMode() {
        return new VkConservativeRasterizationModeEXT(getVkMemory(), getConservativeRasterizationMode(getVkAddress()));
    }

    
    public void setConservativeRasterizationMode(VkConservativeRasterizationModeEXT conservativeRasterizationMode) {
        setConservativeRasterizationMode(getVkAddress(), conservativeRasterizationMode != null ? conservativeRasterizationMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativeRasterizationModeQ() {
        return getConservativeRasterizationMode().getValue();
    }

    public void setConservativeRasterizationMode(int conservativeRasterizationMode) {
        getConservativeRasterizationMode().setValue(conservativeRasterizationMode);
    }

    protected static native long getConservativeRasterizationMode(long address);
    protected static native void setConservativeRasterizationMode(long address, long conservativeRasterizationMode);

    public VkFloat getExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSize(getVkAddress()));
    }

    
    public void setExtraPrimitiveOverestimationSize(VkFloat extraPrimitiveOverestimationSize) {
        setExtraPrimitiveOverestimationSize(getVkAddress(), extraPrimitiveOverestimationSize != null ? extraPrimitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getExtraPrimitiveOverestimationSizeQ() {
        return getExtraPrimitiveOverestimationSize().getValue();
    }

    public void setExtraPrimitiveOverestimationSize(float extraPrimitiveOverestimationSize) {
        getExtraPrimitiveOverestimationSize().setValue(extraPrimitiveOverestimationSize);
    }

    protected static native long getExtraPrimitiveOverestimationSize(long address);
    protected static native void setExtraPrimitiveOverestimationSize(long address, long extraPrimitiveOverestimationSize);


    public static native long sizeof();

    public static class Array extends VkPipelineRasterizationConservativeStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineRasterizationConservativeStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkPipelineRasterizationConservativeStateCreateInfoEXT o){
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
        public VkPipelineRasterizationConservativeStateCreateInfoEXT get(int i){
            return new VkPipelineRasterizationConservativeStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer> {
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

            public Array(VkPipelineRasterizationConservativeStateCreateInfoEXT[] a) {
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
            public VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer get(int i){
                return new VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
