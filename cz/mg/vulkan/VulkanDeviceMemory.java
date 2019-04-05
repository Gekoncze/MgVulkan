package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceMemory extends VulkanHandle {
    VulkanDeviceMemory(){
        super(new VkDeviceMemory());
    }

    VulkanDeviceMemory(VkDeviceMemory vk){
        super(vk);
    }

    @Override
    public VkDeviceMemory getVk(){
        return (VkDeviceMemory) super.getVk();
    }




    public static class Array extends VulkanDeviceMemory implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceMemory> {
        Array(VkDeviceMemory.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDeviceMemory.Array(count));
        }

        Array(int count, VulkanDeviceMemory o){
            this(new VkDeviceMemory.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceMemory.Array getVk(){
            return (VkDeviceMemory.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceMemory get(int i){
            return new VulkanDeviceMemory(getVk().get(i));
        }
    }

}
