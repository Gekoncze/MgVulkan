package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDisplayKHR extends VulkanHandle {
    VulkanDisplayKHR(){
        super(new VkDisplayKHR());
    }

    VulkanDisplayKHR(VkDisplayKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayKHR getVk(){
        return (VkDisplayKHR) super.getVk();
    }




    public static class Array extends VulkanDisplayKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayKHR> {
        Array(VkDisplayKHR.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDisplayKHR.Array(count));
        }

        Array(int count, VulkanDisplayKHR o){
            this(new VkDisplayKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayKHR.Array getVk(){
            return (VkDisplayKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayKHR get(int i){
            return new VulkanDisplayKHR(getVk().get(i));
        }
    }

}
