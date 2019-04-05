package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderStatisticsInfoAMD extends VulkanObject {
    public VulkanShaderStatisticsInfoAMD(){
        super(new VkShaderStatisticsInfoAMD());
    }

    public VulkanShaderStatisticsInfoAMD(VkShaderStatisticsInfoAMD vk){
        super(vk);
    }

    @Override
    public VkShaderStatisticsInfoAMD getVk(){
        return (VkShaderStatisticsInfoAMD) super.getVk();
    }

    public VulkanShaderStatisticsInfoAMD(VulkanShaderStageFlags shaderStageMask, VulkanShaderResourceUsageAMD resourceUsage, VulkanUInt32 numPhysicalVgprs, VulkanUInt32 numPhysicalSgprs, VulkanUInt32 numAvailableVgprs, VulkanUInt32 numAvailableSgprs, VulkanUInt32 computeWorkGroupSize) {
        super(new VkShaderStatisticsInfoAMD(shaderStageMask.getVk(), resourceUsage.getVk(), numPhysicalVgprs.getVk(), numPhysicalSgprs.getVk(), numAvailableVgprs.getVk(), numAvailableSgprs.getVk(), computeWorkGroupSize.getVk()));
    }

    public VulkanShaderStageFlags getShaderStageMask() {
        return new VulkanShaderStageFlags(getVk().getShaderStageMask());
    }

    public void setShaderStageMask(VulkanShaderStageFlags shaderStageMask) {
        getVk().setShaderStageMask(shaderStageMask.getVk());
    }

    public VulkanShaderResourceUsageAMD getResourceUsage() {
        return new VulkanShaderResourceUsageAMD(getVk().getResourceUsage());
    }

    public void setResourceUsage(VulkanShaderResourceUsageAMD resourceUsage) {
        getVk().setResourceUsage(resourceUsage.getVk());
    }

    public VulkanUInt32 getNumPhysicalVgprs() {
        return new VulkanUInt32(getVk().getNumPhysicalVgprs());
    }

    public void setNumPhysicalVgprs(VulkanUInt32 numPhysicalVgprs) {
        getVk().setNumPhysicalVgprs(numPhysicalVgprs.getVk());
    }

    public VulkanUInt32 getNumPhysicalSgprs() {
        return new VulkanUInt32(getVk().getNumPhysicalSgprs());
    }

    public void setNumPhysicalSgprs(VulkanUInt32 numPhysicalSgprs) {
        getVk().setNumPhysicalSgprs(numPhysicalSgprs.getVk());
    }

    public VulkanUInt32 getNumAvailableVgprs() {
        return new VulkanUInt32(getVk().getNumAvailableVgprs());
    }

    public void setNumAvailableVgprs(VulkanUInt32 numAvailableVgprs) {
        getVk().setNumAvailableVgprs(numAvailableVgprs.getVk());
    }

    public VulkanUInt32 getNumAvailableSgprs() {
        return new VulkanUInt32(getVk().getNumAvailableSgprs());
    }

    public void setNumAvailableSgprs(VulkanUInt32 numAvailableSgprs) {
        getVk().setNumAvailableSgprs(numAvailableSgprs.getVk());
    }

    public VulkanUInt32 getComputeWorkGroupSize() {
        return new VulkanUInt32(getVk().getComputeWorkGroupSize());
    }

    public void setComputeWorkGroupSize(VulkanUInt32 computeWorkGroupSize) {
        getVk().setComputeWorkGroupSize(computeWorkGroupSize.getVk());
    }


    public static class Array extends VulkanShaderStatisticsInfoAMD implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStatisticsInfoAMD> {
        public Array(VkShaderStatisticsInfoAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderStatisticsInfoAMD.Array(count));
        }

        public Array(int count, VulkanShaderStatisticsInfoAMD o){
            this(new VkShaderStatisticsInfoAMD.Array(count, o.getVk()));
        }

        @Override
        public VkShaderStatisticsInfoAMD.Array getVk(){
            return (VkShaderStatisticsInfoAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderStatisticsInfoAMD get(int i){
            return new VulkanShaderStatisticsInfoAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderStatisticsInfoAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderStatisticsInfoAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderStatisticsInfoAMD.Pointer(value));
        }

        @Override
        public VkShaderStatisticsInfoAMD.Pointer getVk(){
            return (VkShaderStatisticsInfoAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderStatisticsInfoAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStatisticsInfoAMD.Pointer> {
            public Array(int count) {
                super(new VkShaderStatisticsInfoAMD.Pointer.Array(count));
            }

            public Array(VulkanShaderStatisticsInfoAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderStatisticsInfoAMD.Pointer.Array getVk(){
                return (VkShaderStatisticsInfoAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderStatisticsInfoAMD.Pointer get(int i){
                return new VulkanShaderStatisticsInfoAMD.Pointer(getVk().get(i));
            }
        }
    }
}
