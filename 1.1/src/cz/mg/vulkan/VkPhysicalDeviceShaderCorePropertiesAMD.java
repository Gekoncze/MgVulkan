package cz.mg.vulkan;

public class VkPhysicalDeviceShaderCorePropertiesAMD extends VkObject {
    public VkPhysicalDeviceShaderCorePropertiesAMD() {
        super(sizeof());
    }

    protected VkPhysicalDeviceShaderCorePropertiesAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceShaderCorePropertiesAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD(VkPointer pointer) {
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

    public VkUInt32 getShaderEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderEngineCountNative(getVkAddress()));
    }

    
    public void setShaderEngineCount(VkUInt32 shaderEngineCount) {
        setShaderEngineCountNative(getVkAddress(), shaderEngineCount != null ? shaderEngineCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderEngineCountQ() {
        return getShaderEngineCount().getValue();
    }

    public void setShaderEngineCount(int shaderEngineCount) {
        getShaderEngineCount().setValue(shaderEngineCount);
    }

    protected static native long getShaderEngineCountNative(long address);
    protected static native void setShaderEngineCountNative(long address, long shaderEngineCount);

    public VkUInt32 getShaderArraysPerEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderArraysPerEngineCountNative(getVkAddress()));
    }

    
    public void setShaderArraysPerEngineCount(VkUInt32 shaderArraysPerEngineCount) {
        setShaderArraysPerEngineCountNative(getVkAddress(), shaderArraysPerEngineCount != null ? shaderArraysPerEngineCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderArraysPerEngineCountQ() {
        return getShaderArraysPerEngineCount().getValue();
    }

    public void setShaderArraysPerEngineCount(int shaderArraysPerEngineCount) {
        getShaderArraysPerEngineCount().setValue(shaderArraysPerEngineCount);
    }

    protected static native long getShaderArraysPerEngineCountNative(long address);
    protected static native void setShaderArraysPerEngineCountNative(long address, long shaderArraysPerEngineCount);

    public VkUInt32 getComputeUnitsPerShaderArray() {
        return new VkUInt32(getVkMemory(), getComputeUnitsPerShaderArrayNative(getVkAddress()));
    }

    
    public void setComputeUnitsPerShaderArray(VkUInt32 computeUnitsPerShaderArray) {
        setComputeUnitsPerShaderArrayNative(getVkAddress(), computeUnitsPerShaderArray != null ? computeUnitsPerShaderArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getComputeUnitsPerShaderArrayQ() {
        return getComputeUnitsPerShaderArray().getValue();
    }

    public void setComputeUnitsPerShaderArray(int computeUnitsPerShaderArray) {
        getComputeUnitsPerShaderArray().setValue(computeUnitsPerShaderArray);
    }

    protected static native long getComputeUnitsPerShaderArrayNative(long address);
    protected static native void setComputeUnitsPerShaderArrayNative(long address, long computeUnitsPerShaderArray);

    public VkUInt32 getSimdPerComputeUnit() {
        return new VkUInt32(getVkMemory(), getSimdPerComputeUnitNative(getVkAddress()));
    }

    
    public void setSimdPerComputeUnit(VkUInt32 simdPerComputeUnit) {
        setSimdPerComputeUnitNative(getVkAddress(), simdPerComputeUnit != null ? simdPerComputeUnit.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSimdPerComputeUnitQ() {
        return getSimdPerComputeUnit().getValue();
    }

    public void setSimdPerComputeUnit(int simdPerComputeUnit) {
        getSimdPerComputeUnit().setValue(simdPerComputeUnit);
    }

    protected static native long getSimdPerComputeUnitNative(long address);
    protected static native void setSimdPerComputeUnitNative(long address, long simdPerComputeUnit);

    public VkUInt32 getWavefrontsPerSimd() {
        return new VkUInt32(getVkMemory(), getWavefrontsPerSimdNative(getVkAddress()));
    }

    
    public void setWavefrontsPerSimd(VkUInt32 wavefrontsPerSimd) {
        setWavefrontsPerSimdNative(getVkAddress(), wavefrontsPerSimd != null ? wavefrontsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWavefrontsPerSimdQ() {
        return getWavefrontsPerSimd().getValue();
    }

    public void setWavefrontsPerSimd(int wavefrontsPerSimd) {
        getWavefrontsPerSimd().setValue(wavefrontsPerSimd);
    }

    protected static native long getWavefrontsPerSimdNative(long address);
    protected static native void setWavefrontsPerSimdNative(long address, long wavefrontsPerSimd);

    public VkUInt32 getWavefrontSize() {
        return new VkUInt32(getVkMemory(), getWavefrontSizeNative(getVkAddress()));
    }

    
    public void setWavefrontSize(VkUInt32 wavefrontSize) {
        setWavefrontSizeNative(getVkAddress(), wavefrontSize != null ? wavefrontSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWavefrontSizeQ() {
        return getWavefrontSize().getValue();
    }

    public void setWavefrontSize(int wavefrontSize) {
        getWavefrontSize().setValue(wavefrontSize);
    }

    protected static native long getWavefrontSizeNative(long address);
    protected static native void setWavefrontSizeNative(long address, long wavefrontSize);

    public VkUInt32 getSgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getSgprsPerSimdNative(getVkAddress()));
    }

    
    public void setSgprsPerSimd(VkUInt32 sgprsPerSimd) {
        setSgprsPerSimdNative(getVkAddress(), sgprsPerSimd != null ? sgprsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSgprsPerSimdQ() {
        return getSgprsPerSimd().getValue();
    }

    public void setSgprsPerSimd(int sgprsPerSimd) {
        getSgprsPerSimd().setValue(sgprsPerSimd);
    }

    protected static native long getSgprsPerSimdNative(long address);
    protected static native void setSgprsPerSimdNative(long address, long sgprsPerSimd);

    public VkUInt32 getMinSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinSgprAllocationNative(getVkAddress()));
    }

    
    public void setMinSgprAllocation(VkUInt32 minSgprAllocation) {
        setMinSgprAllocationNative(getVkAddress(), minSgprAllocation != null ? minSgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinSgprAllocationQ() {
        return getMinSgprAllocation().getValue();
    }

    public void setMinSgprAllocation(int minSgprAllocation) {
        getMinSgprAllocation().setValue(minSgprAllocation);
    }

    protected static native long getMinSgprAllocationNative(long address);
    protected static native void setMinSgprAllocationNative(long address, long minSgprAllocation);

    public VkUInt32 getMaxSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxSgprAllocationNative(getVkAddress()));
    }

    
    public void setMaxSgprAllocation(VkUInt32 maxSgprAllocation) {
        setMaxSgprAllocationNative(getVkAddress(), maxSgprAllocation != null ? maxSgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSgprAllocationQ() {
        return getMaxSgprAllocation().getValue();
    }

    public void setMaxSgprAllocation(int maxSgprAllocation) {
        getMaxSgprAllocation().setValue(maxSgprAllocation);
    }

    protected static native long getMaxSgprAllocationNative(long address);
    protected static native void setMaxSgprAllocationNative(long address, long maxSgprAllocation);

    public VkUInt32 getSgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getSgprAllocationGranularityNative(getVkAddress()));
    }

    
    public void setSgprAllocationGranularity(VkUInt32 sgprAllocationGranularity) {
        setSgprAllocationGranularityNative(getVkAddress(), sgprAllocationGranularity != null ? sgprAllocationGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSgprAllocationGranularityQ() {
        return getSgprAllocationGranularity().getValue();
    }

    public void setSgprAllocationGranularity(int sgprAllocationGranularity) {
        getSgprAllocationGranularity().setValue(sgprAllocationGranularity);
    }

    protected static native long getSgprAllocationGranularityNative(long address);
    protected static native void setSgprAllocationGranularityNative(long address, long sgprAllocationGranularity);

    public VkUInt32 getVgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getVgprsPerSimdNative(getVkAddress()));
    }

    
    public void setVgprsPerSimd(VkUInt32 vgprsPerSimd) {
        setVgprsPerSimdNative(getVkAddress(), vgprsPerSimd != null ? vgprsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVgprsPerSimdQ() {
        return getVgprsPerSimd().getValue();
    }

    public void setVgprsPerSimd(int vgprsPerSimd) {
        getVgprsPerSimd().setValue(vgprsPerSimd);
    }

    protected static native long getVgprsPerSimdNative(long address);
    protected static native void setVgprsPerSimdNative(long address, long vgprsPerSimd);

    public VkUInt32 getMinVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinVgprAllocationNative(getVkAddress()));
    }

    
    public void setMinVgprAllocation(VkUInt32 minVgprAllocation) {
        setMinVgprAllocationNative(getVkAddress(), minVgprAllocation != null ? minVgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinVgprAllocationQ() {
        return getMinVgprAllocation().getValue();
    }

    public void setMinVgprAllocation(int minVgprAllocation) {
        getMinVgprAllocation().setValue(minVgprAllocation);
    }

    protected static native long getMinVgprAllocationNative(long address);
    protected static native void setMinVgprAllocationNative(long address, long minVgprAllocation);

    public VkUInt32 getMaxVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxVgprAllocationNative(getVkAddress()));
    }

    
    public void setMaxVgprAllocation(VkUInt32 maxVgprAllocation) {
        setMaxVgprAllocationNative(getVkAddress(), maxVgprAllocation != null ? maxVgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVgprAllocationQ() {
        return getMaxVgprAllocation().getValue();
    }

    public void setMaxVgprAllocation(int maxVgprAllocation) {
        getMaxVgprAllocation().setValue(maxVgprAllocation);
    }

    protected static native long getMaxVgprAllocationNative(long address);
    protected static native void setMaxVgprAllocationNative(long address, long maxVgprAllocation);

    public VkUInt32 getVgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getVgprAllocationGranularityNative(getVkAddress()));
    }

    
    public void setVgprAllocationGranularity(VkUInt32 vgprAllocationGranularity) {
        setVgprAllocationGranularityNative(getVkAddress(), vgprAllocationGranularity != null ? vgprAllocationGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVgprAllocationGranularityQ() {
        return getVgprAllocationGranularity().getValue();
    }

    public void setVgprAllocationGranularity(int vgprAllocationGranularity) {
        getVgprAllocationGranularity().setValue(vgprAllocationGranularity);
    }

    protected static native long getVgprAllocationGranularityNative(long address);
    protected static native void setVgprAllocationGranularityNative(long address, long vgprAllocationGranularity);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceShaderCorePropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderCorePropertiesAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceShaderCorePropertiesAMD.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceShaderCorePropertiesAMD o, int count){
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
        public VkPhysicalDeviceShaderCorePropertiesAMD get(int i){
            return new VkPhysicalDeviceShaderCorePropertiesAMD(getVkMemory(), address(i));
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
