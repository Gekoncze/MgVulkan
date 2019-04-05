package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFramebuffer extends VulkanHandle {
    VulkanFramebuffer(){
        super(new VkFramebuffer());
    }

    VulkanFramebuffer(VkFramebuffer vk){
        super(vk);
    }

    @Override
    public VkFramebuffer getVk(){
        return (VkFramebuffer) super.getVk();
    }




    public static class Array extends VulkanFramebuffer implements cz.mg.collections.array.ReadonlyArray<VulkanFramebuffer> {
        Array(VkFramebuffer.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkFramebuffer.Array(count));
        }

        Array(int count, VulkanFramebuffer o){
            this(new VkFramebuffer.Array(count, o.getVk()));
        }

        @Override
        public VkFramebuffer.Array getVk(){
            return (VkFramebuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFramebuffer get(int i){
            return new VulkanFramebuffer(getVk().get(i));
        }
    }

}
