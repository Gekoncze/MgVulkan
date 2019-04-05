package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSurfaceKHR extends VulkanHandle {
    VulkanSurfaceKHR(){
        super(new VkSurfaceKHR());
    }

    VulkanSurfaceKHR(VkSurfaceKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceKHR getVk(){
        return (VkSurfaceKHR) super.getVk();
    }




    public static class Array extends VulkanSurfaceKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceKHR> {
        Array(VkSurfaceKHR.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkSurfaceKHR.Array(count));
        }

        Array(int count, VulkanSurfaceKHR o){
            this(new VkSurfaceKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceKHR.Array getVk(){
            return (VkSurfaceKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceKHR get(int i){
            return new VulkanSurfaceKHR(getVk().get(i));
        }
    }

}
