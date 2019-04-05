package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorPool extends VulkanHandle {
    VulkanDescriptorPool(){
        super(new VkDescriptorPool());
    }

    VulkanDescriptorPool(VkDescriptorPool vk){
        super(vk);
    }

    @Override
    public VkDescriptorPool getVk(){
        return (VkDescriptorPool) super.getVk();
    }




    public static class Array extends VulkanDescriptorPool implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPool> {
        Array(VkDescriptorPool.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDescriptorPool.Array(count));
        }

        Array(int count, VulkanDescriptorPool o){
            this(new VkDescriptorPool.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPool.Array getVk(){
            return (VkDescriptorPool.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPool get(int i){
            return new VulkanDescriptorPool(getVk().get(i));
        }
    }

}
