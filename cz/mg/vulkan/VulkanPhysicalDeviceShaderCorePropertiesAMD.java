package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceShaderCorePropertiesAMD extends VulkanObject {
    public VulkanPhysicalDeviceShaderCorePropertiesAMD(){
        super(new VkPhysicalDeviceShaderCorePropertiesAMD());
    }

    public VulkanPhysicalDeviceShaderCorePropertiesAMD(VkPhysicalDeviceShaderCorePropertiesAMD vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceShaderCorePropertiesAMD getVk(){
        return (VkPhysicalDeviceShaderCorePropertiesAMD) super.getVk();
    }

    public VulkanPhysicalDeviceShaderCorePropertiesAMD(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 shaderEngineCount, VulkanUInt32 shaderArraysPerEngineCount, VulkanUInt32 computeUnitsPerShaderArray, VulkanUInt32 simdPerComputeUnit, VulkanUInt32 wavefrontsPerSimd, VulkanUInt32 wavefrontSize, VulkanUInt32 sgprsPerSimd, VulkanUInt32 minSgprAllocation, VulkanUInt32 maxSgprAllocation, VulkanUInt32 sgprAllocationGranularity, VulkanUInt32 vgprsPerSimd, VulkanUInt32 minVgprAllocation, VulkanUInt32 maxVgprAllocation, VulkanUInt32 vgprAllocationGranularity) {
        super(new VkPhysicalDeviceShaderCorePropertiesAMD(sType.getVk(), pNext.getVk(), shaderEngineCount.getVk(), shaderArraysPerEngineCount.getVk(), computeUnitsPerShaderArray.getVk(), simdPerComputeUnit.getVk(), wavefrontsPerSimd.getVk(), wavefrontSize.getVk(), sgprsPerSimd.getVk(), minSgprAllocation.getVk(), maxSgprAllocation.getVk(), sgprAllocationGranularity.getVk(), vgprsPerSimd.getVk(), minVgprAllocation.getVk(), maxVgprAllocation.getVk(), vgprAllocationGranularity.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanUInt32 getShaderEngineCount() {
        return new VulkanUInt32(getVk().getShaderEngineCount());
    }

    public void setShaderEngineCount(VulkanUInt32 shaderEngineCount) {
        getVk().setShaderEngineCount(shaderEngineCount.getVk());
    }

    public VulkanUInt32 getShaderArraysPerEngineCount() {
        return new VulkanUInt32(getVk().getShaderArraysPerEngineCount());
    }

    public void setShaderArraysPerEngineCount(VulkanUInt32 shaderArraysPerEngineCount) {
        getVk().setShaderArraysPerEngineCount(shaderArraysPerEngineCount.getVk());
    }

    public VulkanUInt32 getComputeUnitsPerShaderArray() {
        return new VulkanUInt32(getVk().getComputeUnitsPerShaderArray());
    }

    public void setComputeUnitsPerShaderArray(VulkanUInt32 computeUnitsPerShaderArray) {
        getVk().setComputeUnitsPerShaderArray(computeUnitsPerShaderArray.getVk());
    }

    public VulkanUInt32 getSimdPerComputeUnit() {
        return new VulkanUInt32(getVk().getSimdPerComputeUnit());
    }

    public void setSimdPerComputeUnit(VulkanUInt32 simdPerComputeUnit) {
        getVk().setSimdPerComputeUnit(simdPerComputeUnit.getVk());
    }

    public VulkanUInt32 getWavefrontsPerSimd() {
        return new VulkanUInt32(getVk().getWavefrontsPerSimd());
    }

    public void setWavefrontsPerSimd(VulkanUInt32 wavefrontsPerSimd) {
        getVk().setWavefrontsPerSimd(wavefrontsPerSimd.getVk());
    }

    public VulkanUInt32 getWavefrontSize() {
        return new VulkanUInt32(getVk().getWavefrontSize());
    }

    public void setWavefrontSize(VulkanUInt32 wavefrontSize) {
        getVk().setWavefrontSize(wavefrontSize.getVk());
    }

    public VulkanUInt32 getSgprsPerSimd() {
        return new VulkanUInt32(getVk().getSgprsPerSimd());
    }

    public void setSgprsPerSimd(VulkanUInt32 sgprsPerSimd) {
        getVk().setSgprsPerSimd(sgprsPerSimd.getVk());
    }

    public VulkanUInt32 getMinSgprAllocation() {
        return new VulkanUInt32(getVk().getMinSgprAllocation());
    }

    public void setMinSgprAllocation(VulkanUInt32 minSgprAllocation) {
        getVk().setMinSgprAllocation(minSgprAllocation.getVk());
    }

    public VulkanUInt32 getMaxSgprAllocation() {
        return new VulkanUInt32(getVk().getMaxSgprAllocation());
    }

    public void setMaxSgprAllocation(VulkanUInt32 maxSgprAllocation) {
        getVk().setMaxSgprAllocation(maxSgprAllocation.getVk());
    }

    public VulkanUInt32 getSgprAllocationGranularity() {
        return new VulkanUInt32(getVk().getSgprAllocationGranularity());
    }

    public void setSgprAllocationGranularity(VulkanUInt32 sgprAllocationGranularity) {
        getVk().setSgprAllocationGranularity(sgprAllocationGranularity.getVk());
    }

    public VulkanUInt32 getVgprsPerSimd() {
        return new VulkanUInt32(getVk().getVgprsPerSimd());
    }

    public void setVgprsPerSimd(VulkanUInt32 vgprsPerSimd) {
        getVk().setVgprsPerSimd(vgprsPerSimd.getVk());
    }

    public VulkanUInt32 getMinVgprAllocation() {
        return new VulkanUInt32(getVk().getMinVgprAllocation());
    }

    public void setMinVgprAllocation(VulkanUInt32 minVgprAllocation) {
        getVk().setMinVgprAllocation(minVgprAllocation.getVk());
    }

    public VulkanUInt32 getMaxVgprAllocation() {
        return new VulkanUInt32(getVk().getMaxVgprAllocation());
    }

    public void setMaxVgprAllocation(VulkanUInt32 maxVgprAllocation) {
        getVk().setMaxVgprAllocation(maxVgprAllocation.getVk());
    }

    public VulkanUInt32 getVgprAllocationGranularity() {
        return new VulkanUInt32(getVk().getVgprAllocationGranularity());
    }

    public void setVgprAllocationGranularity(VulkanUInt32 vgprAllocationGranularity) {
        getVk().setVgprAllocationGranularity(vgprAllocationGranularity.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceShaderCorePropertiesAMD implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceShaderCorePropertiesAMD> {
        public Array(VkPhysicalDeviceShaderCorePropertiesAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceShaderCorePropertiesAMD.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceShaderCorePropertiesAMD o){
            this(new VkPhysicalDeviceShaderCorePropertiesAMD.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceShaderCorePropertiesAMD.Array getVk(){
            return (VkPhysicalDeviceShaderCorePropertiesAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceShaderCorePropertiesAMD get(int i){
            return new VulkanPhysicalDeviceShaderCorePropertiesAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceShaderCorePropertiesAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceShaderCorePropertiesAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceShaderCorePropertiesAMD.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceShaderCorePropertiesAMD.Pointer getVk(){
            return (VkPhysicalDeviceShaderCorePropertiesAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceShaderCorePropertiesAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceShaderCorePropertiesAMD.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceShaderCorePropertiesAMD.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceShaderCorePropertiesAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceShaderCorePropertiesAMD.Pointer.Array getVk(){
                return (VkPhysicalDeviceShaderCorePropertiesAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceShaderCorePropertiesAMD.Pointer get(int i){
                return new VulkanPhysicalDeviceShaderCorePropertiesAMD.Pointer(getVk().get(i));
            }
        }
    }
}
