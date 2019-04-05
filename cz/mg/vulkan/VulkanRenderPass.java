package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRenderPass extends VulkanHandle {
    VulkanRenderPass(){
        super(new VkRenderPass());
    }

    VulkanRenderPass(VkRenderPass vk){
        super(vk);
    }

    @Override
    public VkRenderPass getVk(){
        return (VkRenderPass) super.getVk();
    }




    public static class Array extends VulkanRenderPass implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPass> {
        Array(VkRenderPass.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkRenderPass.Array(count));
        }

        Array(int count, VulkanRenderPass o){
            this(new VkRenderPass.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPass.Array getVk(){
            return (VkRenderPass.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPass get(int i){
            return new VulkanRenderPass(getVk().get(i));
        }
    }

}
