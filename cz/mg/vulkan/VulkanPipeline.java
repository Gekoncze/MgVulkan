package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipeline extends VulkanHandle {
    VulkanPipeline(){
        super(new VkPipeline());
    }

    VulkanPipeline(VkPipeline vk){
        super(vk);
    }

    @Override
    public VkPipeline getVk(){
        return (VkPipeline) super.getVk();
    }




    public static class Array extends VulkanPipeline implements cz.mg.collections.array.ReadonlyArray<VulkanPipeline> {
        Array(VkPipeline.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkPipeline.Array(count));
        }

        Array(int count, VulkanPipeline o){
            this(new VkPipeline.Array(count, o.getVk()));
        }

        @Override
        public VkPipeline.Array getVk(){
            return (VkPipeline.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipeline get(int i){
            return new VulkanPipeline(getVk().get(i));
        }
    }

}
