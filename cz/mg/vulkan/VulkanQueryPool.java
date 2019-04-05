package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueryPool extends VulkanHandle {
    VulkanQueryPool(){
        super(new VkQueryPool());
    }

    VulkanQueryPool(VkQueryPool vk){
        super(vk);
    }

    @Override
    public VkQueryPool getVk(){
        return (VkQueryPool) super.getVk();
    }




    public static class Array extends VulkanQueryPool implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPool> {
        Array(VkQueryPool.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkQueryPool.Array(count));
        }

        Array(int count, VulkanQueryPool o){
            this(new VkQueryPool.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPool.Array getVk(){
            return (VkQueryPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPool get(int i){
            return new VulkanQueryPool(getVk().get(i));
        }
    }

}
