package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDescriptorUpdateTemplate extends VulkanHandle {
    VulkanDescriptorUpdateTemplate(){
        super(new VkDescriptorUpdateTemplate());
    }

    VulkanDescriptorUpdateTemplate(VkDescriptorUpdateTemplate vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplate getVk(){
        return (VkDescriptorUpdateTemplate) super.getVk();
    }




    public static class Array extends VulkanDescriptorUpdateTemplate implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplate> {
        Array(VkDescriptorUpdateTemplate.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDescriptorUpdateTemplate.Array(count));
        }

        Array(int count, VulkanDescriptorUpdateTemplate o){
            this(new VkDescriptorUpdateTemplate.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplate.Array getVk(){
            return (VkDescriptorUpdateTemplate.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplate get(int i){
            return new VulkanDescriptorUpdateTemplate(getVk().get(i));
        }
    }

}
