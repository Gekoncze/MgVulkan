package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageCreateInfo extends VulkanObject {
    public VulkanImageCreateInfo(){
        super(new VkImageCreateInfo());
    }

    public VulkanImageCreateInfo(VkImageCreateInfo vk){
        super(vk);
    }

    @Override
    public VkImageCreateInfo getVk(){
        return (VkImageCreateInfo) super.getVk();
    }
    public VulkanImageCreateInfo(VulkanObject pNext, VulkanImageCreateFlags flags, VulkanImageType imageType, VulkanFormat format, VulkanExtent3D extent, VulkanUInt32 mipLevels, VulkanUInt32 arrayLayers, VulkanSampleCountFlagBits samples, VulkanImageTiling tiling, VulkanImageUsageFlags usage, VulkanSharingMode sharingMode, VulkanUInt32 queueFamilyIndexCount, VulkanUInt32 pQueueFamilyIndices, VulkanImageLayout initialLayout) {
        super(new VkImageCreateInfo(pNext.getVk(), flags.getVk(), imageType.getVk(), format.getVk(), extent.getVk(), mipLevels.getVk(), arrayLayers.getVk(), samples.getVk(), tiling.getVk(), usage.getVk(), sharingMode.getVk(), queueFamilyIndexCount.getVk(), pQueueFamilyIndices.getVk(), initialLayout.getVk()));
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

    public VulkanImageCreateFlags getFlags() {
        return new VulkanImageCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanImageCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanImageType getImageType() {
        return new VulkanImageType(getVk().getImageType());
    }

    public void setImageType(VulkanImageType imageType) {
        getVk().setImageType(imageType.getVk());
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanExtent3D getExtent() {
        return new VulkanExtent3D(getVk().getExtent());
    }

    public void setExtent(VulkanExtent3D extent) {
        getVk().setExtent(extent.getVk());
    }

    public VulkanUInt32 getMipLevels() {
        return new VulkanUInt32(getVk().getMipLevels());
    }

    public void setMipLevels(VulkanUInt32 mipLevels) {
        getVk().setMipLevels(mipLevels.getVk());
    }

    public VulkanUInt32 getArrayLayers() {
        return new VulkanUInt32(getVk().getArrayLayers());
    }

    public void setArrayLayers(VulkanUInt32 arrayLayers) {
        getVk().setArrayLayers(arrayLayers.getVk());
    }

    public VulkanSampleCountFlagBits getSamples() {
        return new VulkanSampleCountFlagBits(getVk().getSamples());
    }

    public void setSamples(VulkanSampleCountFlagBits samples) {
        getVk().setSamples(samples.getVk());
    }

    public VulkanImageTiling getTiling() {
        return new VulkanImageTiling(getVk().getTiling());
    }

    public void setTiling(VulkanImageTiling tiling) {
        getVk().setTiling(tiling.getVk());
    }

    public VulkanImageUsageFlags getUsage() {
        return new VulkanImageUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanImageUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }

    public VulkanSharingMode getSharingMode() {
        return new VulkanSharingMode(getVk().getSharingMode());
    }

    public void setSharingMode(VulkanSharingMode sharingMode) {
        getVk().setSharingMode(sharingMode.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndexCount() {
        return new VulkanUInt32(getVk().getQueueFamilyIndexCount());
    }

    public void setQueueFamilyIndexCount(VulkanUInt32 queueFamilyIndexCount) {
        getVk().setQueueFamilyIndexCount(queueFamilyIndexCount.getVk());
    }

    public VulkanUInt32 getPQueueFamilyIndices() {
        return new VulkanUInt32(getVk().getPQueueFamilyIndices());
    }

    public void setPQueueFamilyIndices(VulkanUInt32 pQueueFamilyIndices) {
        getVk().setPQueueFamilyIndices(pQueueFamilyIndices.getVk());
    }

    public VulkanImageLayout getInitialLayout() {
        return new VulkanImageLayout(getVk().getInitialLayout());
    }

    public void setInitialLayout(VulkanImageLayout initialLayout) {
        getVk().setInitialLayout(initialLayout.getVk());
    }


    public static class Array extends VulkanImageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateInfo> {
        public Array(VkImageCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageCreateInfo.Array(count));
        }

        public Array(int count, VulkanImageCreateInfo o){
            this(new VkImageCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkImageCreateInfo.Array getVk(){
            return (VkImageCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageCreateInfo get(int i){
            return new VulkanImageCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageCreateInfo.Pointer(value));
        }

        @Override
        public VkImageCreateInfo.Pointer getVk(){
            return (VkImageCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkImageCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanImageCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageCreateInfo.Pointer.Array getVk(){
                return (VkImageCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageCreateInfo.Pointer get(int i){
                return new VulkanImageCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
