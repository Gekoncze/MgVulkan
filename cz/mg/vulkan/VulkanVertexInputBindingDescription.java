package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanVertexInputBindingDescription extends VulkanObject {
    public VulkanVertexInputBindingDescription(){
        super(new VkVertexInputBindingDescription());
    }

    public VulkanVertexInputBindingDescription(VkVertexInputBindingDescription vk){
        super(vk);
    }

    @Override
    public VkVertexInputBindingDescription getVk(){
        return (VkVertexInputBindingDescription) super.getVk();
    }

    public VulkanVertexInputBindingDescription(VulkanUInt32 binding, VulkanUInt32 stride, VulkanVertexInputRate inputRate) {
        super(new VkVertexInputBindingDescription(binding.getVk(), stride.getVk(), inputRate.getVk()));
    }

    public VulkanUInt32 getBinding() {
        return new VulkanUInt32(getVk().getBinding());
    }

    public void setBinding(VulkanUInt32 binding) {
        getVk().setBinding(binding.getVk());
    }

    public VulkanUInt32 getStride() {
        return new VulkanUInt32(getVk().getStride());
    }

    public void setStride(VulkanUInt32 stride) {
        getVk().setStride(stride.getVk());
    }

    public VulkanVertexInputRate getInputRate() {
        return new VulkanVertexInputRate(getVk().getInputRate());
    }

    public void setInputRate(VulkanVertexInputRate inputRate) {
        getVk().setInputRate(inputRate.getVk());
    }


    public static class Array extends VulkanVertexInputBindingDescription implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputBindingDescription> {
        public Array(VkVertexInputBindingDescription.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkVertexInputBindingDescription.Array(count));
        }

        public Array(int count, VulkanVertexInputBindingDescription o){
            this(new VkVertexInputBindingDescription.Array(count, o.getVk()));
        }

        @Override
        public VkVertexInputBindingDescription.Array getVk(){
            return (VkVertexInputBindingDescription.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanVertexInputBindingDescription get(int i){
            return new VulkanVertexInputBindingDescription(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkVertexInputBindingDescription.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkVertexInputBindingDescription.Pointer());
        }

        public Pointer(long value) {
            this(new VkVertexInputBindingDescription.Pointer(value));
        }

        @Override
        public VkVertexInputBindingDescription.Pointer getVk(){
            return (VkVertexInputBindingDescription.Pointer) super.getVk();
        }

        public static class Array extends VulkanVertexInputBindingDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanVertexInputBindingDescription.Pointer> {
            public Array(int count) {
                super(new VkVertexInputBindingDescription.Pointer.Array(count));
            }

            public Array(VulkanVertexInputBindingDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkVertexInputBindingDescription.Pointer.Array getVk(){
                return (VkVertexInputBindingDescription.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanVertexInputBindingDescription.Pointer get(int i){
                return new VulkanVertexInputBindingDescription.Pointer(getVk().get(i));
            }
        }
    }
}
