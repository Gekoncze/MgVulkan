package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewUsageCreateInfo.html">khronos documentation</a>
 **/
public class VulkanImageViewUsageCreateInfo extends VulkanObject {
    public VulkanImageViewUsageCreateInfo(){
        super(new VkImageViewUsageCreateInfo());
    }

    public VulkanImageViewUsageCreateInfo(VkImageViewUsageCreateInfo vk){
        super(vk);
    }

    @Override
    public VkImageViewUsageCreateInfo getVk(){
        return (VkImageViewUsageCreateInfo) super.getVk();
    }
    public VulkanImageViewUsageCreateInfo(VulkanObject pNext, VulkanImageUsageFlags usage) {
        super(new VkImageViewUsageCreateInfo(pNext.getVk(), usage.getVk()));
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

    public VulkanImageUsageFlags getUsage() {
        return new VulkanImageUsageFlags(getVk().getUsage());
    }

    public void setUsage(VulkanImageUsageFlags usage) {
        getVk().setUsage(usage.getVk());
    }


    public static class Array extends VulkanImageViewUsageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewUsageCreateInfo> {
        public Array(VkImageViewUsageCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageViewUsageCreateInfo.Array(count));
        }

        public Array(int count, VulkanImageViewUsageCreateInfo o){
            this(new VkImageViewUsageCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkImageViewUsageCreateInfo.Array getVk(){
            return (VkImageViewUsageCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageViewUsageCreateInfo get(int i){
            return new VulkanImageViewUsageCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageViewUsageCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageViewUsageCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageViewUsageCreateInfo.Pointer(value));
        }

        @Override
        public VkImageViewUsageCreateInfo.Pointer getVk(){
            return (VkImageViewUsageCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageViewUsageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageViewUsageCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkImageViewUsageCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanImageViewUsageCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageViewUsageCreateInfo.Pointer.Array getVk(){
                return (VkImageViewUsageCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageViewUsageCreateInfo.Pointer get(int i){
                return new VulkanImageViewUsageCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
