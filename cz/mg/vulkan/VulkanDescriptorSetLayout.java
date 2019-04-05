package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSetLayout extends VulkanHandle {
    VulkanDescriptorSetLayout(){
        super(new VkDescriptorSetLayout());
    }

    VulkanDescriptorSetLayout(VkDescriptorSetLayout vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayout getVk(){
        return (VkDescriptorSetLayout) super.getVk();
    }




    public static class Array extends VulkanDescriptorSetLayout implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayout> {
        Array(VkDescriptorSetLayout.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDescriptorSetLayout.Array(count));
        }

        Array(int count, VulkanDescriptorSetLayout o){
            this(new VkDescriptorSetLayout.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayout.Array getVk(){
            return (VkDescriptorSetLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayout get(int i){
            return new VulkanDescriptorSetLayout(getVk().get(i));
        }
    }

}
