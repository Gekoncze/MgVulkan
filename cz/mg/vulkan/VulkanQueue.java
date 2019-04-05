package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueue extends VulkanHandle {
    VulkanQueue(){
        super(new VkQueue());
    }

    VulkanQueue(VkQueue vk){
        super(vk);
    }

    @Override
    public VkQueue getVk(){
        return (VkQueue) super.getVk();
    }




    public static class Array extends VulkanQueue implements cz.mg.collections.array.ReadonlyArray<VulkanQueue> {
        Array(VkQueue.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkQueue.Array(count));
        }

        Array(int count, VulkanQueue o){
            this(new VkQueue.Array(count, o.getVk()));
        }

        @Override
        public VkQueue.Array getVk(){
            return (VkQueue.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueue get(int i){
            return new VulkanQueue(getVk().get(i));
        }
    }

}
