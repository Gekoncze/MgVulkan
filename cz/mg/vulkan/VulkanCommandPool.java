package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandPool extends VulkanHandle {
    VulkanCommandPool(){
        super(new VkCommandPool());
    }

    VulkanCommandPool(VkCommandPool vk){
        super(vk);
    }

    @Override
    public VkCommandPool getVk(){
        return (VkCommandPool) super.getVk();
    }




    public static class Array extends VulkanCommandPool implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPool> {
        Array(VkCommandPool.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkCommandPool.Array(count));
        }

        Array(int count, VulkanCommandPool o){
            this(new VkCommandPool.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPool.Array getVk(){
            return (VkCommandPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPool get(int i){
            return new VulkanCommandPool(getVk().get(i));
        }
    }

}
