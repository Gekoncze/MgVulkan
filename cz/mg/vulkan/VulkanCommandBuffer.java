package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandBuffer extends VulkanHandle {
    VulkanCommandBuffer(){
        super(new VkCommandBuffer());
    }

    VulkanCommandBuffer(VkCommandBuffer vk){
        super(vk);
    }

    @Override
    public VkCommandBuffer getVk(){
        return (VkCommandBuffer) super.getVk();
    }




    public static class Array extends VulkanCommandBuffer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBuffer> {
        Array(VkCommandBuffer.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkCommandBuffer.Array(count));
        }

        Array(int count, VulkanCommandBuffer o){
            this(new VkCommandBuffer.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBuffer.Array getVk(){
            return (VkCommandBuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBuffer get(int i){
            return new VulkanCommandBuffer(getVk().get(i));
        }
    }

}
