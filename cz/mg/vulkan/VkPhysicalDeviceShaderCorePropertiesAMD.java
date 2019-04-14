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
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkUInt32 getShaderEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderEngineCount(getVkAddress()));
    }

    
    public void setShaderEngineCount(VkUInt32 shaderEngineCount) {
        setShaderEngineCount(getVkAddress(), shaderEngineCount != null ? shaderEngineCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getShaderEngineCount(long address);
    private static native void setShaderEngineCount(long address, long shaderEngineCount);

    public VkUInt32 getShaderArraysPerEngineCount() {
        return new VkUInt32(getVkMemory(), getShaderArraysPerEngineCount(getVkAddress()));
    }

    
    public void setShaderArraysPerEngineCount(VkUInt32 shaderArraysPerEngineCount) {
        setShaderArraysPerEngineCount(getVkAddress(), shaderArraysPerEngineCount != null ? shaderArraysPerEngineCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getShaderArraysPerEngineCount(long address);
    private static native void setShaderArraysPerEngineCount(long address, long shaderArraysPerEngineCount);

    public VkUInt32 getComputeUnitsPerShaderArray() {
        return new VkUInt32(getVkMemory(), getComputeUnitsPerShaderArray(getVkAddress()));
    }

    
    public void setComputeUnitsPerShaderArray(VkUInt32 computeUnitsPerShaderArray) {
        setComputeUnitsPerShaderArray(getVkAddress(), computeUnitsPerShaderArray != null ? computeUnitsPerShaderArray.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getComputeUnitsPerShaderArray(long address);
    private static native void setComputeUnitsPerShaderArray(long address, long computeUnitsPerShaderArray);

    public VkUInt32 getSimdPerComputeUnit() {
        return new VkUInt32(getVkMemory(), getSimdPerComputeUnit(getVkAddress()));
    }

    
    public void setSimdPerComputeUnit(VkUInt32 simdPerComputeUnit) {
        setSimdPerComputeUnit(getVkAddress(), simdPerComputeUnit != null ? simdPerComputeUnit.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSimdPerComputeUnit(long address);
    private static native void setSimdPerComputeUnit(long address, long simdPerComputeUnit);

    public VkUInt32 getWavefrontsPerSimd() {
        return new VkUInt32(getVkMemory(), getWavefrontsPerSimd(getVkAddress()));
    }

    
    public void setWavefrontsPerSimd(VkUInt32 wavefrontsPerSimd) {
        setWavefrontsPerSimd(getVkAddress(), wavefrontsPerSimd != null ? wavefrontsPerSimd.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getWavefrontsPerSimd(long address);
    private static native void setWavefrontsPerSimd(long address, long wavefrontsPerSimd);

    public VkUInt32 getWavefrontSize() {
        return new VkUInt32(getVkMemory(), getWavefrontSize(getVkAddress()));
    }

    
    public void setWavefrontSize(VkUInt32 wavefrontSize) {
        setWavefrontSize(getVkAddress(), wavefrontSize != null ? wavefrontSize.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getWavefrontSize(long address);
    private static native void setWavefrontSize(long address, long wavefrontSize);

    public VkUInt32 getSgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getSgprsPerSimd(getVkAddress()));
    }

    
    public void setSgprsPerSimd(VkUInt32 sgprsPerSimd) {
        setSgprsPerSimd(getVkAddress(), sgprsPerSimd != null ? sgprsPerSimd.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSgprsPerSimd(long address);
    private static native void setSgprsPerSimd(long address, long sgprsPerSimd);

    public VkUInt32 getMinSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinSgprAllocation(getVkAddress()));
    }

    
    public void setMinSgprAllocation(VkUInt32 minSgprAllocation) {
        setMinSgprAllocation(getVkAddress(), minSgprAllocation != null ? minSgprAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinSgprAllocation(long address);
    private static native void setMinSgprAllocation(long address, long minSgprAllocation);

    public VkUInt32 getMaxSgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxSgprAllocation(getVkAddress()));
    }

    
    public void setMaxSgprAllocation(VkUInt32 maxSgprAllocation) {
        setMaxSgprAllocation(getVkAddress(), maxSgprAllocation != null ? maxSgprAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxSgprAllocation(long address);
    private static native void setMaxSgprAllocation(long address, long maxSgprAllocation);

    public VkUInt32 getSgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getSgprAllocationGranularity(getVkAddress()));
    }

    
    public void setSgprAllocationGranularity(VkUInt32 sgprAllocationGranularity) {
        setSgprAllocationGranularity(getVkAddress(), sgprAllocationGranularity != null ? sgprAllocationGranularity.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSgprAllocationGranularity(long address);
    private static native void setSgprAllocationGranularity(long address, long sgprAllocationGranularity);

    public VkUInt32 getVgprsPerSimd() {
        return new VkUInt32(getVkMemory(), getVgprsPerSimd(getVkAddress()));
    }

    
    public void setVgprsPerSimd(VkUInt32 vgprsPerSimd) {
        setVgprsPerSimd(getVkAddress(), vgprsPerSimd != null ? vgprsPerSimd.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getVgprsPerSimd(long address);
    private static native void setVgprsPerSimd(long address, long vgprsPerSimd);

    public VkUInt32 getMinVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMinVgprAllocation(getVkAddress()));
    }

    
    public void setMinVgprAllocation(VkUInt32 minVgprAllocation) {
        setMinVgprAllocation(getVkAddress(), minVgprAllocation != null ? minVgprAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinVgprAllocation(long address);
    private static native void setMinVgprAllocation(long address, long minVgprAllocation);

    public VkUInt32 getMaxVgprAllocation() {
        return new VkUInt32(getVkMemory(), getMaxVgprAllocation(getVkAddress()));
    }

    
    public void setMaxVgprAllocation(VkUInt32 maxVgprAllocation) {
        setMaxVgprAllocation(getVkAddress(), maxVgprAllocation != null ? maxVgprAllocation.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxVgprAllocation(long address);
    private static native void setMaxVgprAllocation(long address, long maxVgprAllocation);

    public VkUInt32 getVgprAllocationGranularity() {
        return new VkUInt32(getVkMemory(), getVgprAllocationGranularity(getVkAddress()));
    }

    
    public void setVgprAllocationGranularity(VkUInt32 vgprAllocationGranularity) {
        setVgprAllocationGranularity(getVkAddress(), vgprAllocationGranularity != null ? vgprAllocationGranularity.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getVgprAllocationGranularity(long address);
    private static native void setVgprAllocationGranularity(long address, long vgprAllocationGranularity);


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
            return new VkPhysicalDeviceShaderCorePropertiesAMD(getVkMemory(), getVkAddress() + sizeof()*i);
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceShaderCorePropertiesAMD.Pointer get(int i){
                return new VkPhysicalDeviceShaderCorePropertiesAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
