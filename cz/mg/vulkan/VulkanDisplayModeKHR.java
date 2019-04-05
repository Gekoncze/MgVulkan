package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayModeKHR extends VulkanHandle {
    VulkanDisplayModeKHR(){
        super(new VkDisplayModeKHR());
    }

    VulkanDisplayModeKHR(VkDisplayModeKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayModeKHR getVk(){
        return (VkDisplayModeKHR) super.getVk();
    }




    public static class Array extends VulkanDisplayModeKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayModeKHR> {
        Array(VkDisplayModeKHR.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDisplayModeKHR.Array(count));
        }

        Array(int count, VulkanDisplayModeKHR o){
            this(new VkDisplayModeKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayModeKHR.Array getVk(){
            return (VkDisplayModeKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayModeKHR get(int i){
            return new VulkanDisplayModeKHR(getVk().get(i));
        }
    }

}
