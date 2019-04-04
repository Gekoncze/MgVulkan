package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT extends VulkanObject {
    public VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT(){
        super(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT());
    }

    public VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT(VkPhysicalDeviceDescriptorIndexingFeaturesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT getVk(){
        return (VkPhysicalDeviceDescriptorIndexingFeaturesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 shaderInputAttachmentArrayDynamicIndexing, VulkanBool32 shaderUniformTexelBufferArrayDynamicIndexing, VulkanBool32 shaderStorageTexelBufferArrayDynamicIndexing, VulkanBool32 shaderUniformBufferArrayNonUniformIndexing, VulkanBool32 shaderSampledImageArrayNonUniformIndexing, VulkanBool32 shaderStorageBufferArrayNonUniformIndexing, VulkanBool32 shaderStorageImageArrayNonUniformIndexing, VulkanBool32 shaderInputAttachmentArrayNonUniformIndexing, VulkanBool32 shaderUniformTexelBufferArrayNonUniformIndexing, VulkanBool32 shaderStorageTexelBufferArrayNonUniformIndexing, VulkanBool32 descriptorBindingUniformBufferUpdateAfterBind, VulkanBool32 descriptorBindingSampledImageUpdateAfterBind, VulkanBool32 descriptorBindingStorageImageUpdateAfterBind, VulkanBool32 descriptorBindingStorageBufferUpdateAfterBind, VulkanBool32 descriptorBindingUniformTexelBufferUpdateAfterBind, VulkanBool32 descriptorBindingStorageTexelBufferUpdateAfterBind, VulkanBool32 descriptorBindingUpdateUnusedWhilePending, VulkanBool32 descriptorBindingPartiallyBound, VulkanBool32 descriptorBindingVariableDescriptorCount, VulkanBool32 runtimeDescriptorArray) {
        super(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(sType.getVk(), pNext.getVk(), shaderInputAttachmentArrayDynamicIndexing.getVk(), shaderUniformTexelBufferArrayDynamicIndexing.getVk(), shaderStorageTexelBufferArrayDynamicIndexing.getVk(), shaderUniformBufferArrayNonUniformIndexing.getVk(), shaderSampledImageArrayNonUniformIndexing.getVk(), shaderStorageBufferArrayNonUniformIndexing.getVk(), shaderStorageImageArrayNonUniformIndexing.getVk(), shaderInputAttachmentArrayNonUniformIndexing.getVk(), shaderUniformTexelBufferArrayNonUniformIndexing.getVk(), shaderStorageTexelBufferArrayNonUniformIndexing.getVk(), descriptorBindingUniformBufferUpdateAfterBind.getVk(), descriptorBindingSampledImageUpdateAfterBind.getVk(), descriptorBindingStorageImageUpdateAfterBind.getVk(), descriptorBindingStorageBufferUpdateAfterBind.getVk(), descriptorBindingUniformTexelBufferUpdateAfterBind.getVk(), descriptorBindingStorageTexelBufferUpdateAfterBind.getVk(), descriptorBindingUpdateUnusedWhilePending.getVk(), descriptorBindingPartiallyBound.getVk(), descriptorBindingVariableDescriptorCount.getVk(), runtimeDescriptorArray.getVk()));
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

    public VulkanBool32 getShaderInputAttachmentArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderInputAttachmentArrayDynamicIndexing());
    }

    public void setShaderInputAttachmentArrayDynamicIndexing(VulkanBool32 shaderInputAttachmentArrayDynamicIndexing) {
        getVk().setShaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderUniformTexelBufferArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderUniformTexelBufferArrayDynamicIndexing());
    }

    public void setShaderUniformTexelBufferArrayDynamicIndexing(VulkanBool32 shaderUniformTexelBufferArrayDynamicIndexing) {
        getVk().setShaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageTexelBufferArrayDynamicIndexing() {
        return new VulkanBool32(getVk().getShaderStorageTexelBufferArrayDynamicIndexing());
    }

    public void setShaderStorageTexelBufferArrayDynamicIndexing(VulkanBool32 shaderStorageTexelBufferArrayDynamicIndexing) {
        getVk().setShaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing.getVk());
    }

    public VulkanBool32 getShaderUniformBufferArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderUniformBufferArrayNonUniformIndexing());
    }

    public void setShaderUniformBufferArrayNonUniformIndexing(VulkanBool32 shaderUniformBufferArrayNonUniformIndexing) {
        getVk().setShaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderSampledImageArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderSampledImageArrayNonUniformIndexing());
    }

    public void setShaderSampledImageArrayNonUniformIndexing(VulkanBool32 shaderSampledImageArrayNonUniformIndexing) {
        getVk().setShaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageBufferArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderStorageBufferArrayNonUniformIndexing());
    }

    public void setShaderStorageBufferArrayNonUniformIndexing(VulkanBool32 shaderStorageBufferArrayNonUniformIndexing) {
        getVk().setShaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageImageArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderStorageImageArrayNonUniformIndexing());
    }

    public void setShaderStorageImageArrayNonUniformIndexing(VulkanBool32 shaderStorageImageArrayNonUniformIndexing) {
        getVk().setShaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderInputAttachmentArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderInputAttachmentArrayNonUniformIndexing());
    }

    public void setShaderInputAttachmentArrayNonUniformIndexing(VulkanBool32 shaderInputAttachmentArrayNonUniformIndexing) {
        getVk().setShaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderUniformTexelBufferArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderUniformTexelBufferArrayNonUniformIndexing());
    }

    public void setShaderUniformTexelBufferArrayNonUniformIndexing(VulkanBool32 shaderUniformTexelBufferArrayNonUniformIndexing) {
        getVk().setShaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getShaderStorageTexelBufferArrayNonUniformIndexing() {
        return new VulkanBool32(getVk().getShaderStorageTexelBufferArrayNonUniformIndexing());
    }

    public void setShaderStorageTexelBufferArrayNonUniformIndexing(VulkanBool32 shaderStorageTexelBufferArrayNonUniformIndexing) {
        getVk().setShaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing.getVk());
    }

    public VulkanBool32 getDescriptorBindingUniformBufferUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingUniformBufferUpdateAfterBind());
    }

    public void setDescriptorBindingUniformBufferUpdateAfterBind(VulkanBool32 descriptorBindingUniformBufferUpdateAfterBind) {
        getVk().setDescriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingSampledImageUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingSampledImageUpdateAfterBind());
    }

    public void setDescriptorBindingSampledImageUpdateAfterBind(VulkanBool32 descriptorBindingSampledImageUpdateAfterBind) {
        getVk().setDescriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingStorageImageUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingStorageImageUpdateAfterBind());
    }

    public void setDescriptorBindingStorageImageUpdateAfterBind(VulkanBool32 descriptorBindingStorageImageUpdateAfterBind) {
        getVk().setDescriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingStorageBufferUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingStorageBufferUpdateAfterBind());
    }

    public void setDescriptorBindingStorageBufferUpdateAfterBind(VulkanBool32 descriptorBindingStorageBufferUpdateAfterBind) {
        getVk().setDescriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingUniformTexelBufferUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingUniformTexelBufferUpdateAfterBind());
    }

    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(VulkanBool32 descriptorBindingUniformTexelBufferUpdateAfterBind) {
        getVk().setDescriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingStorageTexelBufferUpdateAfterBind() {
        return new VulkanBool32(getVk().getDescriptorBindingStorageTexelBufferUpdateAfterBind());
    }

    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(VulkanBool32 descriptorBindingStorageTexelBufferUpdateAfterBind) {
        getVk().setDescriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind.getVk());
    }

    public VulkanBool32 getDescriptorBindingUpdateUnusedWhilePending() {
        return new VulkanBool32(getVk().getDescriptorBindingUpdateUnusedWhilePending());
    }

    public void setDescriptorBindingUpdateUnusedWhilePending(VulkanBool32 descriptorBindingUpdateUnusedWhilePending) {
        getVk().setDescriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending.getVk());
    }

    public VulkanBool32 getDescriptorBindingPartiallyBound() {
        return new VulkanBool32(getVk().getDescriptorBindingPartiallyBound());
    }

    public void setDescriptorBindingPartiallyBound(VulkanBool32 descriptorBindingPartiallyBound) {
        getVk().setDescriptorBindingPartiallyBound(descriptorBindingPartiallyBound.getVk());
    }

    public VulkanBool32 getDescriptorBindingVariableDescriptorCount() {
        return new VulkanBool32(getVk().getDescriptorBindingVariableDescriptorCount());
    }

    public void setDescriptorBindingVariableDescriptorCount(VulkanBool32 descriptorBindingVariableDescriptorCount) {
        getVk().setDescriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount.getVk());
    }

    public VulkanBool32 getRuntimeDescriptorArray() {
        return new VulkanBool32(getVk().getRuntimeDescriptorArray());
    }

    public void setRuntimeDescriptorArray(VulkanBool32 runtimeDescriptorArray) {
        getVk().setRuntimeDescriptorArray(runtimeDescriptorArray.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT> {
        public Array(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT o){
            this(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Array getVk(){
            return (VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT get(int i){
            return new VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer getVk(){
            return (VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
