package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorImageInfo extends VulkanObject {
    public VulkanDescriptorImageInfo(){
        super(new VkDescriptorImageInfo());
    }

    public VulkanDescriptorImageInfo(VkDescriptorImageInfo vk){
        super(vk);
    }

    @Override
    public VkDescriptorImageInfo getVk(){
        return (VkDescriptorImageInfo) super.getVk();
    }

    public VulkanDescriptorImageInfo(VulkanSampler sampler, VulkanImageView imageView, VulkanImageLayout imageLayout) {
        super(new VkDescriptorImageInfo(sampler.getVk(), imageView.getVk(), imageLayout.getVk()));
    }

    public VulkanSampler getSampler() {
        return new VulkanSampler(getVk().getSampler());
    }

    public void setSampler(VulkanSampler sampler) {
        getVk().setSampler(sampler.getVk());
    }

    public VulkanImageView getImageView() {
        return new VulkanImageView(getVk().getImageView());
    }

    public void setImageView(VulkanImageView imageView) {
        getVk().setImageView(imageView.getVk());
    }

    public VulkanImageLayout getImageLayout() {
        return new VulkanImageLayout(getVk().getImageLayout());
    }

    public void setImageLayout(VulkanImageLayout imageLayout) {
        getVk().setImageLayout(imageLayout.getVk());
    }


    public static class Array extends VulkanDescriptorImageInfo implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorImageInfo> {
        public Array(VkDescriptorImageInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorImageInfo.Array(count));
        }

        public Array(int count, VulkanDescriptorImageInfo o){
            this(new VkDescriptorImageInfo.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorImageInfo.Array getVk(){
            return (VkDescriptorImageInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorImageInfo get(int i){
            return new VulkanDescriptorImageInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorImageInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorImageInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorImageInfo.Pointer(value));
        }

        @Override
        public VkDescriptorImageInfo.Pointer getVk(){
            return (VkDescriptorImageInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorImageInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorImageInfo.Pointer> {
            public Array(int count) {
                super(new VkDescriptorImageInfo.Pointer.Array(count));
            }

            public Array(VulkanDescriptorImageInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorImageInfo.Pointer.Array getVk(){
                return (VkDescriptorImageInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorImageInfo.Pointer get(int i){
                return new VulkanDescriptorImageInfo.Pointer(getVk().get(i));
            }
        }
    }
}
