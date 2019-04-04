package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSwapchainCreateInfoKHR.html">khronos documentation</a>
 **/
public class VulkanImageSwapchainCreateInfoKHR extends VulkanObject {
    public VulkanImageSwapchainCreateInfoKHR(){
        super(new VkImageSwapchainCreateInfoKHR());
    }

    public VulkanImageSwapchainCreateInfoKHR(VkImageSwapchainCreateInfoKHR vk){
        super(vk);
    }

    @Override
    public VkImageSwapchainCreateInfoKHR getVk(){
        return (VkImageSwapchainCreateInfoKHR) super.getVk();
    }
    public VulkanImageSwapchainCreateInfoKHR(VulkanObject pNext, VulkanSwapchainKHR swapchain) {
        super(new VkImageSwapchainCreateInfoKHR(pNext.getVk(), swapchain.getVk()));
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


    public static class Array extends VulkanImageSwapchainCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VulkanImageSwapchainCreateInfoKHR> {
        public Array(VkImageSwapchainCreateInfoKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageSwapchainCreateInfoKHR.Array(count));
        }

        public Array(int count, VulkanImageSwapchainCreateInfoKHR o){
            this(new VkImageSwapchainCreateInfoKHR.Array(count, o.getVk()));
        }

        @Override
        public VkImageSwapchainCreateInfoKHR.Array getVk(){
            return (VkImageSwapchainCreateInfoKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageSwapchainCreateInfoKHR get(int i){
            return new VulkanImageSwapchainCreateInfoKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageSwapchainCreateInfoKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageSwapchainCreateInfoKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageSwapchainCreateInfoKHR.Pointer(value));
        }

        @Override
        public VkImageSwapchainCreateInfoKHR.Pointer getVk(){
            return (VkImageSwapchainCreateInfoKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageSwapchainCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageSwapchainCreateInfoKHR.Pointer> {
            public Array(int count) {
                super(new VkImageSwapchainCreateInfoKHR.Pointer.Array(count));
            }

            public Array(VulkanImageSwapchainCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageSwapchainCreateInfoKHR.Pointer.Array getVk(){
                return (VkImageSwapchainCreateInfoKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageSwapchainCreateInfoKHR.Pointer get(int i){
                return new VulkanImageSwapchainCreateInfoKHR.Pointer(getVk().get(i));
            }
        }
    }
}
