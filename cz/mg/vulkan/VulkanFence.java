package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFence extends VulkanHandle {
    VulkanFence(){
        super(new VkFence());
    }

    VulkanFence(VkFence vk){
        super(vk);
    }

    @Override
    public VkFence getVk(){
        return (VkFence) super.getVk();
    }




    public static class Array extends VulkanFence implements cz.mg.collections.array.ReadonlyArray<VulkanFence> {
        Array(VkFence.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkFence.Array(count));
        }

        Array(int count, VulkanFence o){
            this(new VkFence.Array(count, o.getVk()));
        }

        @Override
        public VkFence.Array getVk(){
            return (VkFence.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFence get(int i){
            return new VulkanFence(getVk().get(i));
        }
    }

}
