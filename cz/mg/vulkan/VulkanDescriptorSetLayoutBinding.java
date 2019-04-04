package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayoutBinding.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayoutBinding extends VulkanObject {
    public VulkanDescriptorSetLayoutBinding(){
        super(new VkDescriptorSetLayoutBinding());
    }

    public VulkanDescriptorSetLayoutBinding(VkDescriptorSetLayoutBinding vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutBinding getVk(){
        return (VkDescriptorSetLayoutBinding) super.getVk();
    }

    public VulkanDescriptorSetLayoutBinding(VulkanUInt32 binding, VulkanDescriptorType descriptorType, VulkanUInt32 descriptorCount, VulkanShaderStageFlags stageFlags, VulkanSampler pImmutableSamplers) {
        super(new VkDescriptorSetLayoutBinding(binding.getVk(), descriptorType.getVk(), descriptorCount.getVk(), stageFlags.getVk(), pImmutableSamplers.getVk()));
    }

    public VulkanUInt32 getBinding() {
        return new VulkanUInt32(getVk().getBinding());
    }

    public void setBinding(VulkanUInt32 binding) {
        getVk().setBinding(binding.getVk());
    }

    public VulkanDescriptorType getDescriptorType() {
        return new VulkanDescriptorType(getVk().getDescriptorType());
    }

    public void setDescriptorType(VulkanDescriptorType descriptorType) {
        getVk().setDescriptorType(descriptorType.getVk());
    }

    public VulkanUInt32 getDescriptorCount() {
        return new VulkanUInt32(getVk().getDescriptorCount());
    }

    public void setDescriptorCount(VulkanUInt32 descriptorCount) {
        getVk().setDescriptorCount(descriptorCount.getVk());
    }

    public VulkanShaderStageFlags getStageFlags() {
        return new VulkanShaderStageFlags(getVk().getStageFlags());
    }

    public void setStageFlags(VulkanShaderStageFlags stageFlags) {
        getVk().setStageFlags(stageFlags.getVk());
    }

    public VulkanSampler getPImmutableSamplers() {
        return new VulkanSampler(getVk().getPImmutableSamplers());
    }

    public void setPImmutableSamplers(VulkanSampler pImmutableSamplers) {
        getVk().setPImmutableSamplers(pImmutableSamplers.getVk());
    }


    public static class Array extends VulkanDescriptorSetLayoutBinding implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutBinding> {
        public Array(VkDescriptorSetLayoutBinding.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutBinding.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutBinding o){
            this(new VkDescriptorSetLayoutBinding.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutBinding.Array getVk(){
            return (VkDescriptorSetLayoutBinding.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutBinding get(int i){
            return new VulkanDescriptorSetLayoutBinding(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutBinding.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutBinding.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutBinding.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutBinding.Pointer getVk(){
            return (VkDescriptorSetLayoutBinding.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutBinding.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutBinding.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutBinding.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutBinding[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutBinding.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutBinding.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutBinding.Pointer get(int i){
                return new VulkanDescriptorSetLayoutBinding.Pointer(getVk().get(i));
            }
        }
    }
}
