package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBuffer extends VulkanHandle {
    VulkanBuffer(){
        super(new VkBuffer());
    }

    VulkanBuffer(VkBuffer vk){
        super(vk);
    }

    @Override
    public VkBuffer getVk(){
        return (VkBuffer) super.getVk();
    }




    public static class Array extends VulkanBuffer implements cz.mg.collections.array.ReadonlyArray<VulkanBuffer> {
        Array(VkBuffer.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkBuffer.Array(count));
        }

        Array(int count, VulkanBuffer o){
            this(new VkBuffer.Array(count, o.getVk()));
        }

        @Override
        public VkBuffer.Array getVk(){
            return (VkBuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBuffer get(int i){
            return new VulkanBuffer(getVk().get(i));
        }
    }

}
