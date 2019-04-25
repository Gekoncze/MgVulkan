package cz.mg.vulkan;

public class VkPhysicalDeviceShaderCorePropertiesAMD extends VkObject {
    public VkPhysicalDeviceShaderCorePropertiesAMD() {
        super(sizeof());
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getShaderEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderEngineCount(getVkAddress()));
    }

    
    public void setShaderEngineCount(VkUInt32 shaderEngineCount) {
        setShaderEngineCount(getVkAddress(), shaderEngineCount != null ? shaderEngineCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderEngineCountQ() {
        return getShaderEngineCount().getValue();
    }

    public void setShaderEngineCount(int shaderEngineCount) {
        getShaderEngineCount().setValue(shaderEngineCount);
    }

    protected static native long getShaderEngineCount(long address);
    protected static native void setShaderEngineCount(long address, long shaderEngineCount);

    public VkUInt32 getShaderArraysPerEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderArraysPerEngineCount(getVkAddress()));
    }

    
    public void setShaderArraysPerEngineCount(VkUInt32 shaderArraysPerEngineCount) {
        setShaderArraysPerEngineCount(getVkAddress(), shaderArraysPerEngineCount != null ? shaderArraysPerEngineCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getShaderArraysPerEngineCountQ() {
        return getShaderArraysPerEngineCount().getValue();
    }

    public void setShaderArraysPerEngineCount(int shaderArraysPerEngineCount) {
        getShaderArraysPerEngineCount().setValue(shaderArraysPerEngineCount);
    }

    protected static native long getShaderArraysPerEngineCount(long address);
    protected static native void setShaderArraysPerEngineCount(long address, long shaderArraysPerEngineCount);

    public VkUInt32 getComputeUnitsPerShaderArray() {
        return new VkUInt32(getVkMemory(), getComputeUnitsPerShaderArray(getVkAddress()));
    }

    
    public void setComputeUnitsPerShaderArray(VkUInt32 computeUnitsPerShaderArray) {
        setComputeUnitsPerShaderArray(getVkAddress(), computeUnitsPerShaderArray != null ? computeUnitsPerShaderArray.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getComputeUnitsPerShaderArrayQ() {
        return getComputeUnitsPerShaderArray().getValue();
    }

    public void setComputeUnitsPerShaderArray(int computeUnitsPerShaderArray) {
        getComputeUnitsPerShaderArray().setValue(computeUnitsPerShaderArray);
    }

    protected static native long getComputeUnitsPerShaderArray(long address);
    protected static native void setComputeUnitsPerShaderArray(long address, long computeUnitsPerShaderArray);

    public VkUInt32 getSimdPerComputeUnit() {
        return new VkUInt32(getVkMemory(), getSimdPerComputeUnit(getVkAddress()));
    }

    
    public void setSimdPerComputeUnit(VkUInt32 simdPerComputeUnit) {
        setSimdPerComputeUnit(getVkAddress(), simdPerComputeUnit != null ? simdPerComputeUnit.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSimdPerComputeUnitQ() {
        return getSimdPerComputeUnit().getValue();
    }

    public void setSimdPerComputeUnit(int simdPerComputeUnit) {
        getSimdPerComputeUnit().setValue(simdPerComputeUnit);
    }

    protected static native long getSimdPerComputeUnit(long address);
    protected static native void setSimdPerComputeUnit(long address, long simdPerComputeUnit);

    public VkUInt32 getWavefrontsPerSimd() {
        return new VkUInt32(getVkMemory(), getWavefrontsPerSimd(getVkAddress()));
    }

    
    public void setWavefrontsPerSimd(VkUInt32 wavefrontsPerSimd) {
        setWavefrontsPerSimd(getVkAddress(), wavefrontsPerSimd != null ? wavefrontsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWavefrontsPerSimdQ() {
        return getWavefrontsPerSimd().getValue();
    }

    public void setWavefrontsPerSimd(int wavefrontsPerSimd) {
        getWavefrontsPerSimd().setValue(wavefrontsPerSimd);
    }

    protected static native long getWavefrontsPerSimd(long address);
    protected static native void setWavefrontsPerSimd(long address, long wavefrontsPerSimd);

    public VkUInt32 getWavefrontSize() {
        return new VkUInt32(getVkMemory(), getWavefrontSize(getVkAddress()));
    }

    
    public void setWavefrontSize(VkUInt32 wavefrontSize) {
        setWavefrontSize(getVkAddress(), wavefrontSize != null ? wavefrontSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWavefrontSizeQ() {
        return getWavefrontSize().getValue();
    }

    public void setWavefrontSize(int wavefrontSize) {
        getWavefrontSize().setValue(wavefrontSize);
    }

    protected static native long getWavefrontSize(long address);
    protected static native void setWavefrontSize(long address, long wavefrontSize);

    public VkUInt32 getSgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getSgprsPerSimd(getVkAddress()));
    }

    
    public void setSgprsPerSimd(VkUInt32 sgprsPerSimd) {
        setSgprsPerSimd(getVkAddress(), sgprsPerSimd != null ? sgprsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSgprsPerSimdQ() {
        return getSgprsPerSimd().getValue();
    }

    public void setSgprsPerSimd(int sgprsPerSimd) {
        getSgprsPerSimd().setValue(sgprsPerSimd);
    }

    protected static native long getSgprsPerSimd(long address);
    protected static native void setSgprsPerSimd(long address, long sgprsPerSimd);

    public VkUInt32 getMinSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinSgprAllocation(getVkAddress()));
    }

    
    public void setMinSgprAllocation(VkUInt32 minSgprAllocation) {
        setMinSgprAllocation(getVkAddress(), minSgprAllocation != null ? minSgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinSgprAllocationQ() {
        return getMinSgprAllocation().getValue();
    }

    public void setMinSgprAllocation(int minSgprAllocation) {
        getMinSgprAllocation().setValue(minSgprAllocation);
    }

    protected static native long getMinSgprAllocation(long address);
    protected static native void setMinSgprAllocation(long address, long minSgprAllocation);

    public VkUInt32 getMaxSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxSgprAllocation(getVkAddress()));
    }

    
    public void setMaxSgprAllocation(VkUInt32 maxSgprAllocation) {
        setMaxSgprAllocation(getVkAddress(), maxSgprAllocation != null ? maxSgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSgprAllocationQ() {
        return getMaxSgprAllocation().getValue();
    }

    public void setMaxSgprAllocation(int maxSgprAllocation) {
        getMaxSgprAllocation().setValue(maxSgprAllocation);
    }

    protected static native long getMaxSgprAllocation(long address);
    protected static native void setMaxSgprAllocation(long address, long maxSgprAllocation);

    public VkUInt32 getSgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getSgprAllocationGranularity(getVkAddress()));
    }

    
    public void setSgprAllocationGranularity(VkUInt32 sgprAllocationGranularity) {
        setSgprAllocationGranularity(getVkAddress(), sgprAllocationGranularity != null ? sgprAllocationGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSgprAllocationGranularityQ() {
        return getSgprAllocationGranularity().getValue();
    }

    public void setSgprAllocationGranularity(int sgprAllocationGranularity) {
        getSgprAllocationGranularity().setValue(sgprAllocationGranularity);
    }

    protected static native long getSgprAllocationGranularity(long address);
    protected static native void setSgprAllocationGranularity(long address, long sgprAllocationGranularity);

    public VkUInt32 getVgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getVgprsPerSimd(getVkAddress()));
    }

    
    public void setVgprsPerSimd(VkUInt32 vgprsPerSimd) {
        setVgprsPerSimd(getVkAddress(), vgprsPerSimd != null ? vgprsPerSimd.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVgprsPerSimdQ() {
        return getVgprsPerSimd().getValue();
    }

    public void setVgprsPerSimd(int vgprsPerSimd) {
        getVgprsPerSimd().setValue(vgprsPerSimd);
    }

    protected static native long getVgprsPerSimd(long address);
    protected static native void setVgprsPerSimd(long address, long vgprsPerSimd);

    public VkUInt32 getMinVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinVgprAllocation(getVkAddress()));
    }

    
    public void setMinVgprAllocation(VkUInt32 minVgprAllocation) {
        setMinVgprAllocation(getVkAddress(), minVgprAllocation != null ? minVgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMinVgprAllocationQ() {
        return getMinVgprAllocation().getValue();
    }

    public void setMinVgprAllocation(int minVgprAllocation) {
        getMinVgprAllocation().setValue(minVgprAllocation);
    }

    protected static native long getMinVgprAllocation(long address);
    protected static native void setMinVgprAllocation(long address, long minVgprAllocation);

    public VkUInt32 getMaxVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxVgprAllocation(getVkAddress()));
    }

    
    public void setMaxVgprAllocation(VkUInt32 maxVgprAllocation) {
        setMaxVgprAllocation(getVkAddress(), maxVgprAllocation != null ? maxVgprAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxVgprAllocationQ() {
        return getMaxVgprAllocation().getValue();
    }

    public void setMaxVgprAllocation(int maxVgprAllocation) {
        getMaxVgprAllocation().setValue(maxVgprAllocation);
    }

    protected static native long getMaxVgprAllocation(long address);
    protected static native void setMaxVgprAllocation(long address, long maxVgprAllocation);

    public VkUInt32 getVgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getVgprAllocationGranularity(getVkAddress()));
    }

    
    public void setVgprAllocationGranularity(VkUInt32 vgprAllocationGranularity) {
        setVgprAllocationGranularity(getVkAddress(), vgprAllocationGranularity != null ? vgprAllocationGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVgprAllocationGranularityQ() {
        return getVgprAllocationGranularity().getValue();
    }

    public void setVgprAllocationGranularity(int vgprAllocationGranularity) {
        getVgprAllocationGranularity().setValue(vgprAllocationGranularity);
    }

    protected static native long getVgprAllocationGranularity(long address);
    protected static native void setVgprAllocationGranularity(long address, long vgprAllocationGranularity);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceShaderCorePropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderCorePropertiesAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceShaderCorePropertiesAMD.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceShaderCorePropertiesAMD o){
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
        public VkPhysicalDeviceShaderCorePropertiesAMD get(int i){
            return new VkPhysicalDeviceShaderCorePropertiesAMD(getVkMemory(), addressAt(i));
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

        public static class Array extends VkPhysicalDeviceShaderCorePropertiesAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceShaderCorePropertiesAMD.Pointer> {
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

            public Array(VkPhysicalDeviceShaderCorePropertiesAMD[] a) {
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
            public VkPhysicalDeviceShaderCorePropertiesAMD.Pointer get(int i){
                return new VkPhysicalDeviceShaderCorePropertiesAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
