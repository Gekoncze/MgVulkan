package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSwapchainKHR extends VulkanHandle {
    VulkanSwapchainKHR(){
        super(new VkSwapchainKHR());
    }

    VulkanSwapchainKHR(VkSwapchainKHR vk){
        super(vk);
    }

    @Override
    public VkSwapchainKHR getVk(){
        return (VkSwapchainKHR) super.getVk();
    }




    public static class Array extends VulkanSwapchainKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSwapchainKHR> {
        Array(VkSwapchainKHR.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkSwapchainKHR.Array(count));
        }

        Array(int count, VulkanSwapchainKHR o){
            this(new VkSwapchainKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSwapchainKHR.Array getVk(){
            return (VkSwapchainKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSwapchainKHR get(int i){
            return new VulkanSwapchainKHR(getVk().get(i));
        }
    }

}
