package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSwapchainCreateFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanSwapchainCreateFlagBitsKHR extends VulkanFlagBits {
    public static final int SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR;
    public static final int SWAPCHAIN_CREATE_PROTECTED_KHR = VkSwapchainCreateFlagBitsKHR.VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR;

    public VulkanSwapchainCreateFlagBitsKHR(){
        super(new VkSwapchainCreateFlagBitsKHR());
    }

    public VulkanSwapchainCreateFlagBitsKHR(VkSwapchainCreateFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainCreateFlagBitsKHR getVk(){
        return (VkSwapchainCreateFlagBitsKHR) super.getVk();
    }

    public VulkanSwapchainCreateFlagBitsKHR(int value){
        super(new VkSwapchainCreateFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_KHR) s += "SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_KHR";
        if(getValue() == SWAPCHAIN_CREATE_PROTECTED_KHR) s += "SWAPCHAIN_CREATE_PROTECTED_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSwapchainCreateFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateFlagBitsKHR> {
        public Array(VkSwapchainCreateFlagBitsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSwapchainCreateFlagBitsKHR.Array(count));
        }

        public Array(int count, VulkanSwapchainCreateFlagBitsKHR o){
            this(new VkSwapchainCreateFlagBitsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainCreateFlagBitsKHR.Array getVk(){
            return (VkSwapchainCreateFlagBitsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainCreateFlagBitsKHR get(int i){
            return new VulkanSwapchainCreateFlagBitsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSwapchainCreateFlagBitsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSwapchainCreateFlagBitsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSwapchainCreateFlagBitsKHR.Pointer(value));
        }

        @Override
        public VkSwapchainCreateFlagBitsKHR.Pointer getVk(){
            return (VkSwapchainCreateFlagBitsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSwapchainCreateFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainCreateFlagBitsKHR.Pointer> {
            public Array(int count) {
                super(new VkSwapchainCreateFlagBitsKHR.Pointer.Array(count));
            }

            public Array(VulkanSwapchainCreateFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSwapchainCreateFlagBitsKHR.Pointer.Array getVk(){
                return (VkSwapchainCreateFlagBitsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSwapchainCreateFlagBitsKHR.Pointer get(int i){
                return new VulkanSwapchainCreateFlagBitsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
