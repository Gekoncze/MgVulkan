package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBindImageMemorySwapchainInfoKHR extends VulkanObject {
    public VulkanBindImageMemorySwapchainInfoKHR(){
        super(new VkBindImageMemorySwapchainInfoKHR());
    }

    public VulkanBindImageMemorySwapchainInfoKHR(VkBindImageMemorySwapchainInfoKHR vk){
        super(vk);
    }

    @Override
    public VkBindImageMemorySwapchainInfoKHR getVk(){
        return (VkBindImageMemorySwapchainInfoKHR) super.getVk();
    }
    public VulkanBindImageMemorySwapchainInfoKHR(VulkanObject pNext, VulkanSwapchainKHR swapchain, VulkanUInt32 imageIndex) {
        super(new VkBindImageMemorySwapchainInfoKHR(pNext.getVk(), swapchain.getVk(), imageIndex.getVk()));
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

    public VulkanSwapchainKHR getSwapchain() {
        return new VulkanSwapchainKHR(getVk().getSwapchain());
    }

    public void setSwapchain(VulkanSwapchainKHR swapchain) {
        getVk().setSwapchain(swapchain.getVk());
    }

    public VulkanUInt32 getImageIndex() {
        return new VulkanUInt32(getVk().getImageIndex());
    }

    public void setImageIndex(VulkanUInt32 imageIndex) {
        getVk().setImageIndex(imageIndex.getVk());
    }


    public static class Array extends VulkanBindImageMemorySwapchainInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemorySwapchainInfoKHR> {
        public Array(VkBindImageMemorySwapchainInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindImageMemorySwapchainInfoKHR.Array(count));
        }

        public Array(int count, VulkanBindImageMemorySwapchainInfoKHR o){
            this(new VkBindImageMemorySwapchainInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkBindImageMemorySwapchainInfoKHR.Array getVk(){
            return (VkBindImageMemorySwapchainInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindImageMemorySwapchainInfoKHR get(int i){
            return new VulkanBindImageMemorySwapchainInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindImageMemorySwapchainInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindImageMemorySwapchainInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindImageMemorySwapchainInfoKHR.Pointer(value));
        }

        @Override
        public VkBindImageMemorySwapchainInfoKHR.Pointer getVk(){
            return (VkBindImageMemorySwapchainInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindImageMemorySwapchainInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemorySwapchainInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkBindImageMemorySwapchainInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanBindImageMemorySwapchainInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindImageMemorySwapchainInfoKHR.Pointer.Array getVk(){
                return (VkBindImageMemorySwapchainInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindImageMemorySwapchainInfoKHR.Pointer get(int i){
                return new VulkanBindImageMemorySwapchainInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
