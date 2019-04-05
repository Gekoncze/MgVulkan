package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageViewCreateInfo extends VulkanObject {
    public VulkanImageViewCreateInfo(){
        super(new VkImageViewCreateInfo());
    }

    public VulkanImageViewCreateInfo(VkImageViewCreateInfo vk){
        super(vk);
    }

    @Override
    public VkImageViewCreateInfo getVk(){
        return (VkImageViewCreateInfo) super.getVk();
    }
    public VulkanImageViewCreateInfo(VulkanObject pNext, VulkanImageViewCreateFlags flags, VulkanImage image, VulkanImageViewType viewType, VulkanFormat format, VulkanComponentMapping components, VulkanImageSubresourceRange subresourceRange) {
        super(new VkImageViewCreateInfo(pNext.getVk(), flags.getVk(), image.getVk(), viewType.getVk(), format.getVk(), components.getVk(), subresourceRange.getVk()));
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

    public VulkanImageViewCreateFlags getFlags() {
        return new VulkanImageViewCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanImageViewCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
    }

    public VulkanImageViewType getViewType() {
        return new VulkanImageViewType(getVk().getViewType());
    }

    public void setViewType(VulkanImageViewType viewType) {
        getVk().setViewType(viewType.getVk());
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanComponentMapping getComponents() {
        return new VulkanComponentMapping(getVk().getComponents());
    }

    public void setComponents(VulkanComponentMapping components) {
        getVk().setComponents(components.getVk());
    }

    public VulkanImageSubresourceRange getSubresourceRange() {
        return new VulkanImageSubresourceRange(getVk().getSubresourceRange());
    }

    public void setSubresourceRange(VulkanImageSubresourceRange subresourceRange) {
        getVk().setSubresourceRange(subresourceRange.getVk());
    }


    public static class Array extends VulkanImageViewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewCreateInfo> {
        public Array(VkImageViewCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageViewCreateInfo.Array(count));
        }

        public Array(int count, VulkanImageViewCreateInfo o){
            this(new VkImageViewCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkImageViewCreateInfo.Array getVk(){
            return (VkImageViewCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageViewCreateInfo get(int i){
            return new VulkanImageViewCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageViewCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageViewCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageViewCreateInfo.Pointer(value));
        }

        @Override
        public VkImageViewCreateInfo.Pointer getVk(){
            return (VkImageViewCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageViewCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkImageViewCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanImageViewCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageViewCreateInfo.Pointer.Array getVk(){
                return (VkImageViewCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageViewCreateInfo.Pointer get(int i){
                return new VulkanImageViewCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
