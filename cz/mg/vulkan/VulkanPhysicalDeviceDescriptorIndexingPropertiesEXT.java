package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT(){
        super(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT());
    }

    public VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT(VkPhysicalDeviceDescriptorIndexingPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceDescriptorIndexingPropertiesEXT getVk(){
        return (VkPhysicalDeviceDescriptorIndexingPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxUpdateAfterBindDescriptorsInAllPools, VulkanBool32 shaderUniformBufferArrayNonUniformIndexingNative, VulkanBool32 shaderSampledImageArrayNonUniformIndexingNative, VulkanBool32 shaderStorageBufferArrayNonUniformIndexingNative, VulkanBool32 shaderStorageImageArrayNonUniformIndexingNative, VulkanBool32 shaderInputAttachmentArrayNonUniformIndexingNative, VulkanBool32 robustBufferAccessUpdateAfterBind, VulkanBool32 quadDivergentImplicitLod, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindSamplers, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages, VulkanUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments, VulkanUInt32 maxPerStageUpdateAfterBindResources, VulkanUInt32 maxDescriptorSetUpdateAfterBindSamplers, VulkanUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers, VulkanUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers, VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, VulkanUInt32 maxDescriptorSetUpdateAfterBindSampledImages, VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageImages, VulkanUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        super(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT(sType.getVk(), pNext.getVk(), maxUpdateAfterBindDescriptorsInAllPools.getVk(), shaderUniformBufferArrayNonUniformIndexingNative.getVk(), shaderSampledImageArrayNonUniformIndexingNative.getVk(), shaderStorageBufferArrayNonUniformIndexingNative.getVk(), shaderStorageImageArrayNonUniformIndexingNative.getVk(), shaderInputAttachmentArrayNonUniformIndexingNative.getVk(), robustBufferAccessUpdateAfterBind.getVk(), quadDivergentImplicitLod.getVk(), maxPerStageDescriptorUpdateAfterBindSamplers.getVk(), maxPerStageDescriptorUpdateAfterBindUniformBuffers.getVk(), maxPerStageDescriptorUpdateAfterBindStorageBuffers.getVk(), maxPerStageDescriptorUpdateAfterBindSampledImages.getVk(), maxPerStageDescriptorUpdateAfterBindStorageImages.getVk(), maxPerStageDescriptorUpdateAfterBindInputAttachments.getVk(), maxPerStageUpdateAfterBindResources.getVk(), maxDescriptorSetUpdateAfterBindSamplers.getVk(), maxDescriptorSetUpdateAfterBindUniformBuffers.getVk(), maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.getVk(), maxDescriptorSetUpdateAfterBindStorageBuffers.getVk(), maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.getVk(), maxDescriptorSetUpdateAfterBindSampledImages.getVk(), maxDescriptorSetUpdateAfterBindStorageImages.getVk(), maxDescriptorSetUpdateAfterBindInputAttachments.getVk()));
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

    public VulkanUInt32 getMaxUpdateAfterBindDescriptorsInAllPools() {
        return new VulkanUInt32(getVk().getMaxUpdateAfterBindDescriptorsInAllPools());
    }

    public void setMaxUpdateAfterBindDescriptorsInAllPools(VulkanUInt32 maxUpdateAfterBindDescriptorsInAllPools) {
        getVk().setMaxUpdateAfterBindDescriptorsInAllPools(maxUpdateAfterBindDescriptorsInAllPools.getVk());
    }

    public VulkanBool32 getShaderUniformBufferArrayNonUniformIndexingNative() {
        return new VulkanBool32(getVk().getShaderUniformBufferArrayNonUniformIndexingNative());
    }

    public void setShaderUniformBufferArrayNonUniformIndexingNative(VulkanBool32 shaderUniformBufferArrayNonUniformIndexingNative) {
        getVk().setShaderUniformBufferArrayNonUniformIndexingNative(shaderUniformBufferArrayNonUniformIndexingNative.getVk());
    }

    public VulkanBool32 getShaderSampledImageArrayNonUniformIndexingNative() {
        return new VulkanBool32(getVk().getShaderSampledImageArrayNonUniformIndexingNative());
    }

    public void setShaderSampledImageArrayNonUniformIndexingNative(VulkanBool32 shaderSampledImageArrayNonUniformIndexingNative) {
        getVk().setShaderSampledImageArrayNonUniformIndexingNative(shaderSampledImageArrayNonUniformIndexingNative.getVk());
    }

    public VulkanBool32 getShaderStorageBufferArrayNonUniformIndexingNative() {
        return new VulkanBool32(getVk().getShaderStorageBufferArrayNonUniformIndexingNative());
    }

    public void setShaderStorageBufferArrayNonUniformIndexingNative(VulkanBool32 shaderStorageBufferArrayNonUniformIndexingNative) {
        getVk().setShaderStorageBufferArrayNonUniformIndexingNative(shaderStorageBufferArrayNonUniformIndexingNative.getVk());
    }

    public VulkanBool32 getShaderStorageImageArrayNonUniformIndexingNative() {
        return new VulkanBool32(getVk().getShaderStorageImageArrayNonUniformIndexingNative());
    }

    public void setShaderStorageImageArrayNonUniformIndexingNative(VulkanBool32 shaderStorageImageArrayNonUniformIndexingNative) {
        getVk().setShaderStorageImageArrayNonUniformIndexingNative(shaderStorageImageArrayNonUniformIndexingNative.getVk());
    }

    public VulkanBool32 getShaderInputAttachmentArrayNonUniformIndexingNative() {
        return new VulkanBool32(getVk().getShaderInputAttachmentArrayNonUniformIndexingNative());
    }

    public void setShaderInputAttachmentArrayNonUniformIndexingNative(VulkanBool32 shaderInputAttachmentArrayNonUniformIndexingNative) {
        getVk().setShaderInputAttachmentArrayNonUniformIndexingNative(shaderInputAttachmentArrayNonUniformIndexingNative.getVk());
    }

    public VulkanBool32 getRobustBufferAccessUpdateAfterBind() {
        return new VulkanBool32(getVk().getRobustBufferAccessUpdateAfterBind());
    }

    public void setRobustBufferAccessUpdateAfterBind(VulkanBool32 robustBufferAccessUpdateAfterBind) {
        getVk().setRobustBufferAccessUpdateAfterBind(robustBufferAccessUpdateAfterBind.getVk());
    }

    public VulkanBool32 getQuadDivergentImplicitLod() {
        return new VulkanBool32(getVk().getQuadDivergentImplicitLod());
    }

    public void setQuadDivergentImplicitLod(VulkanBool32 quadDivergentImplicitLod) {
        getVk().setQuadDivergentImplicitLod(quadDivergentImplicitLod.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindSamplers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindSamplers());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSamplers(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindSamplers) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindSamplers(maxPerStageDescriptorUpdateAfterBindSamplers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindUniformBuffers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindUniformBuffers());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindUniformBuffers(maxPerStageDescriptorUpdateAfterBindUniformBuffers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageBuffers() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindStorageBuffers());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindStorageBuffers(maxPerStageDescriptorUpdateAfterBindStorageBuffers.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindSampledImages() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindSampledImages());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindSampledImages(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindSampledImages) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindSampledImages(maxPerStageDescriptorUpdateAfterBindSampledImages.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindStorageImages() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindStorageImages());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindStorageImages(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindStorageImages) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindStorageImages(maxPerStageDescriptorUpdateAfterBindStorageImages.getVk());
    }

    public VulkanUInt32 getMaxPerStageDescriptorUpdateAfterBindInputAttachments() {
        return new VulkanUInt32(getVk().getMaxPerStageDescriptorUpdateAfterBindInputAttachments());
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInputAttachments(VulkanUInt32 maxPerStageDescriptorUpdateAfterBindInputAttachments) {
        getVk().setMaxPerStageDescriptorUpdateAfterBindInputAttachments(maxPerStageDescriptorUpdateAfterBindInputAttachments.getVk());
    }

    public VulkanUInt32 getMaxPerStageUpdateAfterBindResources() {
        return new VulkanUInt32(getVk().getMaxPerStageUpdateAfterBindResources());
    }

    public void setMaxPerStageUpdateAfterBindResources(VulkanUInt32 maxPerStageUpdateAfterBindResources) {
        getVk().setMaxPerStageUpdateAfterBindResources(maxPerStageUpdateAfterBindResources.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindSamplers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindSamplers());
    }

    public void setMaxDescriptorSetUpdateAfterBindSamplers(VulkanUInt32 maxDescriptorSetUpdateAfterBindSamplers) {
        getVk().setMaxDescriptorSetUpdateAfterBindSamplers(maxDescriptorSetUpdateAfterBindSamplers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindUniformBuffers());
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffers(VulkanUInt32 maxDescriptorSetUpdateAfterBindUniformBuffers) {
        getVk().setMaxDescriptorSetUpdateAfterBindUniformBuffers(maxDescriptorSetUpdateAfterBindUniformBuffers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic());
    }

    public void setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(VulkanUInt32 maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
        getVk().setMaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(maxDescriptorSetUpdateAfterBindUniformBuffersDynamic.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffers() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindStorageBuffers());
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffers(VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageBuffers) {
        getVk().setMaxDescriptorSetUpdateAfterBindStorageBuffers(maxDescriptorSetUpdateAfterBindStorageBuffers.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic());
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
        getVk().setMaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(maxDescriptorSetUpdateAfterBindStorageBuffersDynamic.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindSampledImages() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindSampledImages());
    }

    public void setMaxDescriptorSetUpdateAfterBindSampledImages(VulkanUInt32 maxDescriptorSetUpdateAfterBindSampledImages) {
        getVk().setMaxDescriptorSetUpdateAfterBindSampledImages(maxDescriptorSetUpdateAfterBindSampledImages.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindStorageImages() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindStorageImages());
    }

    public void setMaxDescriptorSetUpdateAfterBindStorageImages(VulkanUInt32 maxDescriptorSetUpdateAfterBindStorageImages) {
        getVk().setMaxDescriptorSetUpdateAfterBindStorageImages(maxDescriptorSetUpdateAfterBindStorageImages.getVk());
    }

    public VulkanUInt32 getMaxDescriptorSetUpdateAfterBindInputAttachments() {
        return new VulkanUInt32(getVk().getMaxDescriptorSetUpdateAfterBindInputAttachments());
    }

    public void setMaxDescriptorSetUpdateAfterBindInputAttachments(VulkanUInt32 maxDescriptorSetUpdateAfterBindInputAttachments) {
        getVk().setMaxDescriptorSetUpdateAfterBindInputAttachments(maxDescriptorSetUpdateAfterBindInputAttachments.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT> {
        public Array(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT o){
            this(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceDescriptorIndexingPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
