package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDevice extends VulkanHandle {
    VulkanPhysicalDevice(){
        super(new VkPhysicalDevice());
    }

    VulkanPhysicalDevice(VkPhysicalDevice vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevice getVk(){
        return (VkPhysicalDevice) super.getVk();
    }




    public static class Array extends VulkanPhysicalDevice implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevice> {
        Array(VkPhysicalDevice.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkPhysicalDevice.Array(count));
        }

        Array(int count, VulkanPhysicalDevice o){
            this(new VkPhysicalDevice.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDevice.Array getVk(){
            return (VkPhysicalDevice.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDevice get(int i){
            return new VulkanPhysicalDevice(getVk().get(i));
        }
    }

}
