package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugUtilsMessengerEXT extends VulkanHandle {
    VulkanDebugUtilsMessengerEXT(){
        super(new VkDebugUtilsMessengerEXT());
    }

    VulkanDebugUtilsMessengerEXT(VkDebugUtilsMessengerEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerEXT getVk(){
        return (VkDebugUtilsMessengerEXT) super.getVk();
    }




    public static class Array extends VulkanDebugUtilsMessengerEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerEXT> {
        Array(VkDebugUtilsMessengerEXT.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDebugUtilsMessengerEXT.Array(count));
        }

        Array(int count, VulkanDebugUtilsMessengerEXT o){
            this(new VkDebugUtilsMessengerEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerEXT.Array getVk(){
            return (VkDebugUtilsMessengerEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerEXT get(int i){
            return new VulkanDebugUtilsMessengerEXT(getVk().get(i));
        }
    }

}
