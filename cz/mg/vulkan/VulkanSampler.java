package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSampler extends VulkanHandle {
    VulkanSampler(){
        super(new VkSampler());
    }

    VulkanSampler(VkSampler vk){
        super(vk);
    }

    @Override
    public VkSampler getVk(){
        return (VkSampler) super.getVk();
    }




    public static class Array extends VulkanSampler implements cz.mg.collections.array.ReadonlyArray<VulkanSampler> {
        Array(VkSampler.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkSampler.Array(count));
        }

        Array(int count, VulkanSampler o){
            this(new VkSampler.Array(count, o.getVk()));
        }

        @Override
        public VkSampler.Array getVk(){
            return (VkSampler.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampler get(int i){
            return new VulkanSampler(getVk().get(i));
        }
    }

}
