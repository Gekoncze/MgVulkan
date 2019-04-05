package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorSet extends VulkanHandle {
    VulkanDescriptorSet(){
        super(new VkDescriptorSet());
    }

    VulkanDescriptorSet(VkDescriptorSet vk){
        super(vk);
    }

    @Override
    public VkDescriptorSet getVk(){
        return (VkDescriptorSet) super.getVk();
    }




    public static class Array extends VulkanDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSet> {
        Array(VkDescriptorSet.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDescriptorSet.Array(count));
        }

        Array(int count, VulkanDescriptorSet o){
            this(new VkDescriptorSet.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSet.Array getVk(){
            return (VkDescriptorSet.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSet get(int i){
            return new VulkanDescriptorSet(getVk().get(i));
        }
    }

}
