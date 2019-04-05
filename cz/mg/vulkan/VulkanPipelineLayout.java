package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineLayout extends VulkanHandle {
    VulkanPipelineLayout(){
        super(new VkPipelineLayout());
    }

    VulkanPipelineLayout(VkPipelineLayout vk){
        super(vk);
    }

    @Override
    public VkPipelineLayout getVk(){
        return (VkPipelineLayout) super.getVk();
    }




    public static class Array extends VulkanPipelineLayout implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineLayout> {
        Array(VkPipelineLayout.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkPipelineLayout.Array(count));
        }

        Array(int count, VulkanPipelineLayout o){
            this(new VkPipelineLayout.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineLayout.Array getVk(){
            return (VkPipelineLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineLayout get(int i){
            return new VulkanPipelineLayout(getVk().get(i));
        }
    }

}
