package cz.mg.vulkan;

public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends VkObject {
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkMemory vkmemory, long vkaddress) {
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

    public VkFloat getPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getPrimitiveOverestimationSize(getVkAddress()));
    }

    
    public void setPrimitiveOverestimationSize(VkFloat primitiveOverestimationSize) {
        setPrimitiveOverestimationSize(getVkAddress(), primitiveOverestimationSize != null ? primitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getPrimitiveOverestimationSizeQ() {
        return getPrimitiveOverestimationSize().getValue();
    }

    public void setPrimitiveOverestimationSize(float primitiveOverestimationSize) {
        getPrimitiveOverestimationSize().setValue(primitiveOverestimationSize);
    }

    protected static native long getPrimitiveOverestimationSize(long address);
    protected static native void setPrimitiveOverestimationSize(long address, long primitiveOverestimationSize);

    public VkFloat getMaxExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getMaxExtraPrimitiveOverestimationSize(getVkAddress()));
    }

    
    public void setMaxExtraPrimitiveOverestimationSize(VkFloat maxExtraPrimitiveOverestimationSize) {
        setMaxExtraPrimitiveOverestimationSize(getVkAddress(), maxExtraPrimitiveOverestimationSize != null ? maxExtraPrimitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxExtraPrimitiveOverestimationSizeQ() {
        return getMaxExtraPrimitiveOverestimationSize().getValue();
    }

    public void setMaxExtraPrimitiveOverestimationSize(float maxExtraPrimitiveOverestimationSize) {
        getMaxExtraPrimitiveOverestimationSize().setValue(maxExtraPrimitiveOverestimationSize);
    }

    protected static native long getMaxExtraPrimitiveOverestimationSize(long address);
    protected static native void setMaxExtraPrimitiveOverestimationSize(long address, long maxExtraPrimitiveOverestimationSize);

    public VkFloat getExtraPrimitiveOverestimationSizeGranularity() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSizeGranularity(getVkAddress()));
    }

    
    public void setExtraPrimitiveOverestimationSizeGranularity(VkFloat extraPrimitiveOverestimationSizeGranularity) {
        setExtraPrimitiveOverestimationSizeGranularity(getVkAddress(), extraPrimitiveOverestimationSizeGranularity != null ? extraPrimitiveOverestimationSizeGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getExtraPrimitiveOverestimationSizeGranularityQ() {
        return getExtraPrimitiveOverestimationSizeGranularity().getValue();
    }

    public void setExtraPrimitiveOverestimationSizeGranularity(float extraPrimitiveOverestimationSizeGranularity) {
        getExtraPrimitiveOverestimationSizeGranularity().setValue(extraPrimitiveOverestimationSizeGranularity);
    }

    protected static native long getExtraPrimitiveOverestimationSizeGranularity(long address);
    protected static native void setExtraPrimitiveOverestimationSizeGranularity(long address, long extraPrimitiveOverestimationSizeGranularity);

    public VkBool32 getPrimitiveUnderestimation() {
        return new VkBool32(getVkMemory(), getPrimitiveUnderestimation(getVkAddress()));
    }

    
    public void setPrimitiveUnderestimation(VkBool32 primitiveUnderestimation) {
        setPrimitiveUnderestimation(getVkAddress(), primitiveUnderestimation != null ? primitiveUnderestimation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPrimitiveUnderestimationQ() {
        return getPrimitiveUnderestimation().getValue();
    }

    public void setPrimitiveUnderestimation(int primitiveUnderestimation) {
        getPrimitiveUnderestimation().setValue(primitiveUnderestimation);
    }

    protected static native long getPrimitiveUnderestimation(long address);
    protected static native void setPrimitiveUnderestimation(long address, long primitiveUnderestimation);

    public VkBool32 getConservativePointAndLineRasterization() {
        return new VkBool32(getVkMemory(), getConservativePointAndLineRasterization(getVkAddress()));
    }

    
    public void setConservativePointAndLineRasterization(VkBool32 conservativePointAndLineRasterization) {
        setConservativePointAndLineRasterization(getVkAddress(), conservativePointAndLineRasterization != null ? conservativePointAndLineRasterization.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativePointAndLineRasterizationQ() {
        return getConservativePointAndLineRasterization().getValue();
    }

    public void setConservativePointAndLineRasterization(int conservativePointAndLineRasterization) {
        getConservativePointAndLineRasterization().setValue(conservativePointAndLineRasterization);
    }

    protected static native long getConservativePointAndLineRasterization(long address);
    protected static native void setConservativePointAndLineRasterization(long address, long conservativePointAndLineRasterization);

    public VkBool32 getDegenerateTrianglesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateTrianglesRasterized(getVkAddress()));
    }

    
    public void setDegenerateTrianglesRasterized(VkBool32 degenerateTrianglesRasterized) {
        setDegenerateTrianglesRasterized(getVkAddress(), degenerateTrianglesRasterized != null ? degenerateTrianglesRasterized.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDegenerateTrianglesRasterizedQ() {
        return getDegenerateTrianglesRasterized().getValue();
    }

    public void setDegenerateTrianglesRasterized(int degenerateTrianglesRasterized) {
        getDegenerateTrianglesRasterized().setValue(degenerateTrianglesRasterized);
    }

    protected static native long getDegenerateTrianglesRasterized(long address);
    protected static native void setDegenerateTrianglesRasterized(long address, long degenerateTrianglesRasterized);

    public VkBool32 getDegenerateLinesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateLinesRasterized(getVkAddress()));
    }

    
    public void setDegenerateLinesRasterized(VkBool32 degenerateLinesRasterized) {
        setDegenerateLinesRasterized(getVkAddress(), degenerateLinesRasterized != null ? degenerateLinesRasterized.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDegenerateLinesRasterizedQ() {
        return getDegenerateLinesRasterized().getValue();
    }

    public void setDegenerateLinesRasterized(int degenerateLinesRasterized) {
        getDegenerateLinesRasterized().setValue(degenerateLinesRasterized);
    }

    protected static native long getDegenerateLinesRasterized(long address);
    protected static native void setDegenerateLinesRasterized(long address, long degenerateLinesRasterized);

    public VkBool32 getFullyCoveredFragmentShaderInputVariable() {
        return new VkBool32(getVkMemory(), getFullyCoveredFragmentShaderInputVariable(getVkAddress()));
    }

    
    public void setFullyCoveredFragmentShaderInputVariable(VkBool32 fullyCoveredFragmentShaderInputVariable) {
        setFullyCoveredFragmentShaderInputVariable(getVkAddress(), fullyCoveredFragmentShaderInputVariable != null ? fullyCoveredFragmentShaderInputVariable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFullyCoveredFragmentShaderInputVariableQ() {
        return getFullyCoveredFragmentShaderInputVariable().getValue();
    }

    public void setFullyCoveredFragmentShaderInputVariable(int fullyCoveredFragmentShaderInputVariable) {
        getFullyCoveredFragmentShaderInputVariable().setValue(fullyCoveredFragmentShaderInputVariable);
    }

    protected static native long getFullyCoveredFragmentShaderInputVariable(long address);
    protected static native void setFullyCoveredFragmentShaderInputVariable(long address, long fullyCoveredFragmentShaderInputVariable);

    public VkBool32 getConservativeRasterizationPostDepthCoverage() {
        return new VkBool32(getVkMemory(), getConservativeRasterizationPostDepthCoverage(getVkAddress()));
    }

    
    public void setConservativeRasterizationPostDepthCoverage(VkBool32 conservativeRasterizationPostDepthCoverage) {
        setConservativeRasterizationPostDepthCoverage(getVkAddress(), conservativeRasterizationPostDepthCoverage != null ? conservativeRasterizationPostDepthCoverage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativeRasterizationPostDepthCoverageQ() {
        return getConservativeRasterizationPostDepthCoverage().getValue();
    }

    public void setConservativeRasterizationPostDepthCoverage(int conservativeRasterizationPostDepthCoverage) {
        getConservativeRasterizationPostDepthCoverage().setValue(conservativeRasterizationPostDepthCoverage);
    }

    protected static native long getConservativeRasterizationPostDepthCoverage(long address);
    protected static native void setConservativeRasterizationPostDepthCoverage(long address, long conservativeRasterizationPostDepthCoverage);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceConservativeRasterizationPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceConservativeRasterizationPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceConservativeRasterizationPropertiesEXT o){
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
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT get(int i){
            return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceConservativeRasterizationPropertiesEXT[] a) {
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
            public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
