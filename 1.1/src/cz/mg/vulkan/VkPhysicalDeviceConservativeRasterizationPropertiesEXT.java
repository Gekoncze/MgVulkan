package cz.mg.vulkan;

public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends VkObject {
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkPointer pointer) {
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

    public VkFloat getPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getPrimitiveOverestimationSizeNative(getVkAddress()));
    }

    
    public void setPrimitiveOverestimationSize(VkFloat primitiveOverestimationSize) {
        setPrimitiveOverestimationSizeNative(getVkAddress(), primitiveOverestimationSize != null ? primitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getPrimitiveOverestimationSizeQ() {
        return getPrimitiveOverestimationSize().getValue();
    }

    public void setPrimitiveOverestimationSize(float primitiveOverestimationSize) {
        getPrimitiveOverestimationSize().setValue(primitiveOverestimationSize);
    }

    protected static native long getPrimitiveOverestimationSizeNative(long address);
    protected static native void setPrimitiveOverestimationSizeNative(long address, long primitiveOverestimationSize);

    public VkFloat getMaxExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getMaxExtraPrimitiveOverestimationSizeNative(getVkAddress()));
    }

    
    public void setMaxExtraPrimitiveOverestimationSize(VkFloat maxExtraPrimitiveOverestimationSize) {
        setMaxExtraPrimitiveOverestimationSizeNative(getVkAddress(), maxExtraPrimitiveOverestimationSize != null ? maxExtraPrimitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxExtraPrimitiveOverestimationSizeQ() {
        return getMaxExtraPrimitiveOverestimationSize().getValue();
    }

    public void setMaxExtraPrimitiveOverestimationSize(float maxExtraPrimitiveOverestimationSize) {
        getMaxExtraPrimitiveOverestimationSize().setValue(maxExtraPrimitiveOverestimationSize);
    }

    protected static native long getMaxExtraPrimitiveOverestimationSizeNative(long address);
    protected static native void setMaxExtraPrimitiveOverestimationSizeNative(long address, long maxExtraPrimitiveOverestimationSize);

    public VkFloat getExtraPrimitiveOverestimationSizeGranularity() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSizeGranularityNative(getVkAddress()));
    }

    
    public void setExtraPrimitiveOverestimationSizeGranularity(VkFloat extraPrimitiveOverestimationSizeGranularity) {
        setExtraPrimitiveOverestimationSizeGranularityNative(getVkAddress(), extraPrimitiveOverestimationSizeGranularity != null ? extraPrimitiveOverestimationSizeGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getExtraPrimitiveOverestimationSizeGranularityQ() {
        return getExtraPrimitiveOverestimationSizeGranularity().getValue();
    }

    public void setExtraPrimitiveOverestimationSizeGranularity(float extraPrimitiveOverestimationSizeGranularity) {
        getExtraPrimitiveOverestimationSizeGranularity().setValue(extraPrimitiveOverestimationSizeGranularity);
    }

    protected static native long getExtraPrimitiveOverestimationSizeGranularityNative(long address);
    protected static native void setExtraPrimitiveOverestimationSizeGranularityNative(long address, long extraPrimitiveOverestimationSizeGranularity);

    public VkBool32 getPrimitiveUnderestimation() {
        return new VkBool32(getVkMemory(), getPrimitiveUnderestimationNative(getVkAddress()));
    }

    
    public void setPrimitiveUnderestimation(VkBool32 primitiveUnderestimation) {
        setPrimitiveUnderestimationNative(getVkAddress(), primitiveUnderestimation != null ? primitiveUnderestimation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPrimitiveUnderestimationQ() {
        return getPrimitiveUnderestimation().getValue();
    }

    public void setPrimitiveUnderestimation(int primitiveUnderestimation) {
        getPrimitiveUnderestimation().setValue(primitiveUnderestimation);
    }

    protected static native long getPrimitiveUnderestimationNative(long address);
    protected static native void setPrimitiveUnderestimationNative(long address, long primitiveUnderestimation);

    public VkBool32 getConservativePointAndLineRasterization() {
        return new VkBool32(getVkMemory(), getConservativePointAndLineRasterizationNative(getVkAddress()));
    }

    
    public void setConservativePointAndLineRasterization(VkBool32 conservativePointAndLineRasterization) {
        setConservativePointAndLineRasterizationNative(getVkAddress(), conservativePointAndLineRasterization != null ? conservativePointAndLineRasterization.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativePointAndLineRasterizationQ() {
        return getConservativePointAndLineRasterization().getValue();
    }

    public void setConservativePointAndLineRasterization(int conservativePointAndLineRasterization) {
        getConservativePointAndLineRasterization().setValue(conservativePointAndLineRasterization);
    }

    protected static native long getConservativePointAndLineRasterizationNative(long address);
    protected static native void setConservativePointAndLineRasterizationNative(long address, long conservativePointAndLineRasterization);

    public VkBool32 getDegenerateTrianglesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateTrianglesRasterizedNative(getVkAddress()));
    }

    
    public void setDegenerateTrianglesRasterized(VkBool32 degenerateTrianglesRasterized) {
        setDegenerateTrianglesRasterizedNative(getVkAddress(), degenerateTrianglesRasterized != null ? degenerateTrianglesRasterized.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDegenerateTrianglesRasterizedQ() {
        return getDegenerateTrianglesRasterized().getValue();
    }

    public void setDegenerateTrianglesRasterized(int degenerateTrianglesRasterized) {
        getDegenerateTrianglesRasterized().setValue(degenerateTrianglesRasterized);
    }

    protected static native long getDegenerateTrianglesRasterizedNative(long address);
    protected static native void setDegenerateTrianglesRasterizedNative(long address, long degenerateTrianglesRasterized);

    public VkBool32 getDegenerateLinesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateLinesRasterizedNative(getVkAddress()));
    }

    
    public void setDegenerateLinesRasterized(VkBool32 degenerateLinesRasterized) {
        setDegenerateLinesRasterizedNative(getVkAddress(), degenerateLinesRasterized != null ? degenerateLinesRasterized.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDegenerateLinesRasterizedQ() {
        return getDegenerateLinesRasterized().getValue();
    }

    public void setDegenerateLinesRasterized(int degenerateLinesRasterized) {
        getDegenerateLinesRasterized().setValue(degenerateLinesRasterized);
    }

    protected static native long getDegenerateLinesRasterizedNative(long address);
    protected static native void setDegenerateLinesRasterizedNative(long address, long degenerateLinesRasterized);

    public VkBool32 getFullyCoveredFragmentShaderInputVariable() {
        return new VkBool32(getVkMemory(), getFullyCoveredFragmentShaderInputVariableNative(getVkAddress()));
    }

    
    public void setFullyCoveredFragmentShaderInputVariable(VkBool32 fullyCoveredFragmentShaderInputVariable) {
        setFullyCoveredFragmentShaderInputVariableNative(getVkAddress(), fullyCoveredFragmentShaderInputVariable != null ? fullyCoveredFragmentShaderInputVariable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFullyCoveredFragmentShaderInputVariableQ() {
        return getFullyCoveredFragmentShaderInputVariable().getValue();
    }

    public void setFullyCoveredFragmentShaderInputVariable(int fullyCoveredFragmentShaderInputVariable) {
        getFullyCoveredFragmentShaderInputVariable().setValue(fullyCoveredFragmentShaderInputVariable);
    }

    protected static native long getFullyCoveredFragmentShaderInputVariableNative(long address);
    protected static native void setFullyCoveredFragmentShaderInputVariableNative(long address, long fullyCoveredFragmentShaderInputVariable);

    public VkBool32 getConservativeRasterizationPostDepthCoverage() {
        return new VkBool32(getVkMemory(), getConservativeRasterizationPostDepthCoverageNative(getVkAddress()));
    }

    
    public void setConservativeRasterizationPostDepthCoverage(VkBool32 conservativeRasterizationPostDepthCoverage) {
        setConservativeRasterizationPostDepthCoverageNative(getVkAddress(), conservativeRasterizationPostDepthCoverage != null ? conservativeRasterizationPostDepthCoverage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativeRasterizationPostDepthCoverageQ() {
        return getConservativeRasterizationPostDepthCoverage().getValue();
    }

    public void setConservativeRasterizationPostDepthCoverage(int conservativeRasterizationPostDepthCoverage) {
        getConservativeRasterizationPostDepthCoverage().setValue(conservativeRasterizationPostDepthCoverage);
    }

    protected static native long getConservativeRasterizationPostDepthCoverageNative(long address);
    protected static native void setConservativeRasterizationPostDepthCoverageNative(long address, long conservativeRasterizationPostDepthCoverage);


    public void set(VkPhysicalDeviceConservativeRasterizationPropertiesEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceConservativeRasterizationPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceConservativeRasterizationPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceConservativeRasterizationPropertiesEXT o, int count){
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
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT get(int i){
            return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(getVkMemory(), address(i));
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
