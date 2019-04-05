package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDebugReportCallbackEXT extends VulkanHandle {
    VulkanDebugReportCallbackEXT(){
        super(new VkDebugReportCallbackEXT());
    }

    VulkanDebugReportCallbackEXT(VkDebugReportCallbackEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportCallbackEXT getVk(){
        return (VkDebugReportCallbackEXT) super.getVk();
    }




    public static class Array extends VulkanDebugReportCallbackEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportCallbackEXT> {
        Array(VkDebugReportCallbackEXT.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkDebugReportCallbackEXT.Array(count));
        }

        Array(int count, VulkanDebugReportCallbackEXT o){
            this(new VkDebugReportCallbackEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugReportCallbackEXT.Array getVk(){
            return (VkDebugReportCallbackEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugReportCallbackEXT get(int i){
            return new VulkanDebugReportCallbackEXT(getVk().get(i));
        }
    }

}
