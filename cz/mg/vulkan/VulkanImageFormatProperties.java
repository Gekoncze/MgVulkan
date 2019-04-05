package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageFormatProperties extends VulkanObject {
    public VulkanImageFormatProperties(){
        super(new VkImageFormatProperties());
    }

    public VulkanImageFormatProperties(VkImageFormatProperties vk){
        super(vk);
    }

    @Override
    public VkImageFormatProperties getVk(){
        return (VkImageFormatProperties) super.getVk();
    }

    public VulkanImageFormatProperties(VulkanExtent3D maxExtent, VulkanUInt32 maxMipLevels, VulkanUInt32 maxArrayLayers, VulkanSampleCountFlags sampleCounts, VulkanDeviceSize maxResourceSize) {
        super(new VkImageFormatProperties(maxExtent.getVk(), maxMipLevels.getVk(), maxArrayLayers.getVk(), sampleCounts.getVk(), maxResourceSize.getVk()));
    }

    public VulkanExtent3D getMaxExtent() {
        return new VulkanExtent3D(getVk().getMaxExtent());
    }

    public void setMaxExtent(VulkanExtent3D maxExtent) {
        getVk().setMaxExtent(maxExtent.getVk());
    }

    public VulkanUInt32 getMaxMipLevels() {
        return new VulkanUInt32(getVk().getMaxMipLevels());
    }

    public void setMaxMipLevels(VulkanUInt32 maxMipLevels) {
        getVk().setMaxMipLevels(maxMipLevels.getVk());
    }

    public VulkanUInt32 getMaxArrayLayers() {
        return new VulkanUInt32(getVk().getMaxArrayLayers());
    }

    public void setMaxArrayLayers(VulkanUInt32 maxArrayLayers) {
        getVk().setMaxArrayLayers(maxArrayLayers.getVk());
    }

    public VulkanSampleCountFlags getSampleCounts() {
        return new VulkanSampleCountFlags(getVk().getSampleCounts());
    }

    public void setSampleCounts(VulkanSampleCountFlags sampleCounts) {
        getVk().setSampleCounts(sampleCounts.getVk());
    }

    public VulkanDeviceSize getMaxResourceSize() {
        return new VulkanDeviceSize(getVk().getMaxResourceSize());
    }

    public void setMaxResourceSize(VulkanDeviceSize maxResourceSize) {
        getVk().setMaxResourceSize(maxResourceSize.getVk());
    }


    public static class Array extends VulkanImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatProperties> {
        public Array(VkImageFormatProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageFormatProperties.Array(count));
        }

        public Array(int count, VulkanImageFormatProperties o){
            this(new VkImageFormatProperties.Array(count, o.getVk()));
        }

        @Override
        public VkImageFormatProperties.Array getVk(){
            return (VkImageFormatProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageFormatProperties get(int i){
            return new VulkanImageFormatProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageFormatProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageFormatProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageFormatProperties.Pointer(value));
        }

        @Override
        public VkImageFormatProperties.Pointer getVk(){
            return (VkImageFormatProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatProperties.Pointer> {
            public Array(int count) {
                super(new VkImageFormatProperties.Pointer.Array(count));
            }

            public Array(VulkanImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageFormatProperties.Pointer.Array getVk(){
                return (VkImageFormatProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageFormatProperties.Pointer get(int i){
                return new VulkanImageFormatProperties.Pointer(getVk().get(i));
            }
        }
    }
}
