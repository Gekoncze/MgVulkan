package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDevice extends VulkanHandle {
    VulkanDevice(){
        super(new VkDevice());
    }

    VulkanDevice(VkDevice vk){
        super(vk);
    }

    @Override
    public VkDevice getVk(){
        return (VkDevice) super.getVk();
    }




    public static class Array extends VulkanDevice implements cz.mg.collections.array.ReadonlyArray<VulkanDevice> {
        Array(VkDevice.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDevice.Array(count));
        }

        Array(int count, VulkanDevice o){
            this(new VkDevice.Array(count, o.getVk()));
        }

        @Override
        public VkDevice.Array getVk(){
            return (VkDevice.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDevice get(int i){
            return new VulkanDevice(getVk().get(i));
        }
    }

}
