package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceConservativeRasterizationPropertiesEXT.html">khronos documentation</a>
 **/
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


    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(VkStructureType sType, VkObject pNext, VkFloat primitiveOverestimationSize, VkFloat maxExtraPrimitiveOverestimationSize, VkFloat extraPrimitiveOverestimationSizeGranularity, VkBool32 primitiveUnderestimation, VkBool32 conservativePointAndLineRasterization, VkBool32 degenerateTrianglesRasterized, VkBool32 degenerateLinesRasterized, VkBool32 fullyCoveredFragmentShaderInputVariable, VkBool32 conservativeRasterizationPostDepthCoverage) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setPrimitiveOverestimationSize(primitiveOverestimationSize);
        setMaxExtraPrimitiveOverestimationSize(maxExtraPrimitiveOverestimationSize);
        setExtraPrimitiveOverestimationSizeGranularity(extraPrimitiveOverestimationSizeGranularity);
        setPrimitiveUnderestimation(primitiveUnderestimation);
        setConservativePointAndLineRasterization(conservativePointAndLineRasterization);
        setDegenerateTrianglesRasterized(degenerateTrianglesRasterized);
        setDegenerateLinesRasterized(degenerateLinesRasterized);
        setFullyCoveredFragmentShaderInputVariable(fullyCoveredFragmentShaderInputVariable);
        setConservativeRasterizationPostDepthCoverage(conservativeRasterizationPostDepthCoverage);
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

    public VkFloat getPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getPrimitiveOverestimationSize(getVkAddress()));
    }

    
    public void setPrimitiveOverestimationSize(VkFloat primitiveOverestimationSize) {
        setPrimitiveOverestimationSize(getVkAddress(), primitiveOverestimationSize != null ? primitiveOverestimationSize.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPrimitiveOverestimationSize(long address);
    private static native void setPrimitiveOverestimationSize(long address, long primitiveOverestimationSize);

    public VkFloat getMaxExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getMaxExtraPrimitiveOverestimationSize(getVkAddress()));
    }

    
    public void setMaxExtraPrimitiveOverestimationSize(VkFloat maxExtraPrimitiveOverestimationSize) {
        setMaxExtraPrimitiveOverestimationSize(getVkAddress(), maxExtraPrimitiveOverestimationSize != null ? maxExtraPrimitiveOverestimationSize.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxExtraPrimitiveOverestimationSize(long address);
    private static native void setMaxExtraPrimitiveOverestimationSize(long address, long maxExtraPrimitiveOverestimationSize);

    public VkFloat getExtraPrimitiveOverestimationSizeGranularity() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSizeGranularity(getVkAddress()));
    }

    
    public void setExtraPrimitiveOverestimationSizeGranularity(VkFloat extraPrimitiveOverestimationSizeGranularity) {
        setExtraPrimitiveOverestimationSizeGranularity(getVkAddress(), extraPrimitiveOverestimationSizeGranularity != null ? extraPrimitiveOverestimationSizeGranularity.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExtraPrimitiveOverestimationSizeGranularity(long address);
    private static native void setExtraPrimitiveOverestimationSizeGranularity(long address, long extraPrimitiveOverestimationSizeGranularity);

    public VkBool32 getPrimitiveUnderestimation() {
        return new VkBool32(getVkMemory(), getPrimitiveUnderestimation(getVkAddress()));
    }

    
    public void setPrimitiveUnderestimation(VkBool32 primitiveUnderestimation) {
        setPrimitiveUnderestimation(getVkAddress(), primitiveUnderestimation != null ? primitiveUnderestimation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getPrimitiveUnderestimation(long address);
    private static native void setPrimitiveUnderestimation(long address, long primitiveUnderestimation);

    public VkBool32 getConservativePointAndLineRasterization() {
        return new VkBool32(getVkMemory(), getConservativePointAndLineRasterization(getVkAddress()));
    }

    
    public void setConservativePointAndLineRasterization(VkBool32 conservativePointAndLineRasterization) {
        setConservativePointAndLineRasterization(getVkAddress(), conservativePointAndLineRasterization != null ? conservativePointAndLineRasterization.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getConservativePointAndLineRasterization(long address);
    private static native void setConservativePointAndLineRasterization(long address, long conservativePointAndLineRasterization);

    public VkBool32 getDegenerateTrianglesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateTrianglesRasterized(getVkAddress()));
    }

    
    public void setDegenerateTrianglesRasterized(VkBool32 degenerateTrianglesRasterized) {
        setDegenerateTrianglesRasterized(getVkAddress(), degenerateTrianglesRasterized != null ? degenerateTrianglesRasterized.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDegenerateTrianglesRasterized(long address);
    private static native void setDegenerateTrianglesRasterized(long address, long degenerateTrianglesRasterized);

    public VkBool32 getDegenerateLinesRasterized() {
        return new VkBool32(getVkMemory(), getDegenerateLinesRasterized(getVkAddress()));
    }

    
    public void setDegenerateLinesRasterized(VkBool32 degenerateLinesRasterized) {
        setDegenerateLinesRasterized(getVkAddress(), degenerateLinesRasterized != null ? degenerateLinesRasterized.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDegenerateLinesRasterized(long address);
    private static native void setDegenerateLinesRasterized(long address, long degenerateLinesRasterized);

    public VkBool32 getFullyCoveredFragmentShaderInputVariable() {
        return new VkBool32(getVkMemory(), getFullyCoveredFragmentShaderInputVariable(getVkAddress()));
    }

    
    public void setFullyCoveredFragmentShaderInputVariable(VkBool32 fullyCoveredFragmentShaderInputVariable) {
        setFullyCoveredFragmentShaderInputVariable(getVkAddress(), fullyCoveredFragmentShaderInputVariable != null ? fullyCoveredFragmentShaderInputVariable.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFullyCoveredFragmentShaderInputVariable(long address);
    private static native void setFullyCoveredFragmentShaderInputVariable(long address, long fullyCoveredFragmentShaderInputVariable);

    public VkBool32 getConservativeRasterizationPostDepthCoverage() {
        return new VkBool32(getVkMemory(), getConservativeRasterizationPostDepthCoverage(getVkAddress()));
    }

    
    public void setConservativeRasterizationPostDepthCoverage(VkBool32 conservativeRasterizationPostDepthCoverage) {
        setConservativeRasterizationPostDepthCoverage(getVkAddress(), conservativeRasterizationPostDepthCoverage != null ? conservativeRasterizationPostDepthCoverage.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getConservativeRasterizationPostDepthCoverage(long address);
    private static native void setConservativeRasterizationPostDepthCoverage(long address, long conservativeRasterizationPostDepthCoverage);


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
            return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
