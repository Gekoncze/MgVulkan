package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSemaphore extends VulkanHandle {
    VulkanSemaphore(){
        super(new VkSemaphore());
    }

    VulkanSemaphore(VkSemaphore vk){
        super(vk);
    }

    @Override
    public VkSemaphore getVk(){
        return (VkSemaphore) super.getVk();
    }




    public static class Array extends VulkanSemaphore implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphore> {
        Array(VkSemaphore.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkSemaphore.Array(count));
        }

        Array(int count, VulkanSemaphore o){
            this(new VkSemaphore.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphore.Array getVk(){
            return (VkSemaphore.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphore get(int i){
            return new VulkanSemaphore(getVk().get(i));
        }
    }

}
