package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderModule extends VulkanHandle {
    VulkanShaderModule(){
        super(new VkShaderModule());
    }

    VulkanShaderModule(VkShaderModule vk){
        super(vk);
    }

    @Override
    public VkShaderModule getVk(){
        return (VkShaderModule) super.getVk();
    }




    public static class Array extends VulkanShaderModule implements cz.mg.collections.array.ReadonlyArray<VulkanShaderModule> {
        Array(VkShaderModule.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkShaderModule.Array(count));
        }

        Array(int count, VulkanShaderModule o){
            this(new VkShaderModule.Array(count, o.getVk()));
        }

        @Override
        public VkShaderModule.Array getVk(){
            return (VkShaderModule.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderModule get(int i){
            return new VulkanShaderModule(getVk().get(i));
        }
    }

}
