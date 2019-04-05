package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSamplerYcbcrConversion extends VulkanHandle {
    VulkanSamplerYcbcrConversion(){
        super(new VkSamplerYcbcrConversion());
    }

    VulkanSamplerYcbcrConversion(VkSamplerYcbcrConversion vk){
        super(vk);
    }

    @Override
    public VkSamplerYcbcrConversion getVk(){
        return (VkSamplerYcbcrConversion) super.getVk();
    }




    public static class Array extends VulkanSamplerYcbcrConversion implements cz.mg.collections.array.ReadonlyArray<VulkanSamplerYcbcrConversion> {
        Array(VkSamplerYcbcrConversion.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkSamplerYcbcrConversion.Array(count));
        }

        Array(int count, VulkanSamplerYcbcrConversion o){
            this(new VkSamplerYcbcrConversion.Array(count, o.getVk()));
        }

        @Override
        public VkSamplerYcbcrConversion.Array getVk(){
            return (VkSamplerYcbcrConversion.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSamplerYcbcrConversion get(int i){
            return new VulkanSamplerYcbcrConversion(getVk().get(i));
        }
    }

}
