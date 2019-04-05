package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineCache extends VulkanHandle {
    VulkanPipelineCache(){
        super(new VkPipelineCache());
    }

    VulkanPipelineCache(VkPipelineCache vk){
        super(vk);
    }

    @Override
    public VkPipelineCache getVk(){
        return (VkPipelineCache) super.getVk();
    }




    public static class Array extends VulkanPipelineCache implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineCache> {
        Array(VkPipelineCache.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkPipelineCache.Array(count));
        }

        Array(int count, VulkanPipelineCache o){
            this(new VkPipelineCache.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineCache.Array getVk(){
            return (VkPipelineCache.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineCache get(int i){
            return new VulkanPipelineCache(getVk().get(i));
        }
    }

}
