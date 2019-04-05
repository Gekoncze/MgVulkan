package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageFormatListCreateInfoKHR extends VulkanObject {
    public VulkanImageFormatListCreateInfoKHR(){
        super(new VkImageFormatListCreateInfoKHR());
    }

    public VulkanImageFormatListCreateInfoKHR(VkImageFormatListCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkImageFormatListCreateInfoKHR getVk(){
        return (VkImageFormatListCreateInfoKHR) super.getVk();
    }
    public VulkanImageFormatListCreateInfoKHR(VulkanObject pNext, VulkanUInt32 viewFormatCount, VulkanFormat pViewFormats) {
        super(new VkImageFormatListCreateInfoKHR(pNext.getVk(), viewFormatCount.getVk(), pViewFormats.getVk()));
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

    public VulkanUInt32 getViewFormatCount() {
        return new VulkanUInt32(getVk().getViewFormatCount());
    }

    public void setViewFormatCount(VulkanUInt32 viewFormatCount) {
        getVk().setViewFormatCount(viewFormatCount.getVk());
    }

    public VulkanFormat getPViewFormats() {
        return new VulkanFormat(getVk().getPViewFormats());
    }

    public void setPViewFormats(VulkanFormat pViewFormats) {
        getVk().setPViewFormats(pViewFormats.getVk());
    }


    public static class Array extends VulkanImageFormatListCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatListCreateInfoKHR> {
        public Array(VkImageFormatListCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageFormatListCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanImageFormatListCreateInfoKHR o){
            this(new VkImageFormatListCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkImageFormatListCreateInfoKHR.Array getVk(){
            return (VkImageFormatListCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageFormatListCreateInfoKHR get(int i){
            return new VulkanImageFormatListCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageFormatListCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageFormatListCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageFormatListCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkImageFormatListCreateInfoKHR.Pointer getVk(){
            return (VkImageFormatListCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageFormatListCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatListCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkImageFormatListCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanImageFormatListCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageFormatListCreateInfoKHR.Pointer.Array getVk(){
                return (VkImageFormatListCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageFormatListCreateInfoKHR.Pointer get(int i){
                return new VulkanImageFormatListCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
