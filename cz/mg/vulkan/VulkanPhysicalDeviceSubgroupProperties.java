package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceSubgroupProperties extends VulkanObject {
    public VulkanPhysicalDeviceSubgroupProperties(){
        super(new VkPhysicalDeviceSubgroupProperties());
    }

    public VulkanPhysicalDeviceSubgroupProperties(VkPhysicalDeviceSubgroupProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSubgroupProperties getVk(){
        return (VkPhysicalDeviceSubgroupProperties) super.getVk();
    }

    public VulkanPhysicalDeviceSubgroupProperties(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 subgroupSize, VulkanShaderStageFlags supportedStages, VulkanSubgroupFeatureFlags supportedOperations, VulkanBool32 quadOperationsInAllStages) {
        super(new VkPhysicalDeviceSubgroupProperties(sType.getVk(), pNext.getVk(), subgroupSize.getVk(), supportedStages.getVk(), supportedOperations.getVk(), quadOperationsInAllStages.getVk()));
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

    public VulkanUInt32 getSubgroupSize() {
        return new VulkanUInt32(getVk().getSubgroupSize());
    }

    public void setSubgroupSize(VulkanUInt32 subgroupSize) {
        getVk().setSubgroupSize(subgroupSize.getVk());
    }

    public VulkanShaderStageFlags getSupportedStages() {
        return new VulkanShaderStageFlags(getVk().getSupportedStages());
    }

    public void setSupportedStages(VulkanShaderStageFlags supportedStages) {
        getVk().setSupportedStages(supportedStages.getVk());
    }

    public VulkanSubgroupFeatureFlags getSupportedOperations() {
        return new VulkanSubgroupFeatureFlags(getVk().getSupportedOperations());
    }

    public void setSupportedOperations(VulkanSubgroupFeatureFlags supportedOperations) {
        getVk().setSupportedOperations(supportedOperations.getVk());
    }

    public VulkanBool32 getQuadOperationsInAllStages() {
        return new VulkanBool32(getVk().getQuadOperationsInAllStages());
    }

    public void setQuadOperationsInAllStages(VulkanBool32 quadOperationsInAllStages) {
        getVk().setQuadOperationsInAllStages(quadOperationsInAllStages.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSubgroupProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSubgroupProperties> {
        public Array(VkPhysicalDeviceSubgroupProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSubgroupProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSubgroupProperties o){
            this(new VkPhysicalDeviceSubgroupProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSubgroupProperties.Array getVk(){
            return (VkPhysicalDeviceSubgroupProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSubgroupProperties get(int i){
            return new VulkanPhysicalDeviceSubgroupProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSubgroupProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSubgroupProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSubgroupProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSubgroupProperties.Pointer getVk(){
            return (VkPhysicalDeviceSubgroupProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSubgroupProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSubgroupProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSubgroupProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSubgroupProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSubgroupProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceSubgroupProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSubgroupProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceSubgroupProperties.Pointer(getVk().get(i));
            }
        }
    }
}
