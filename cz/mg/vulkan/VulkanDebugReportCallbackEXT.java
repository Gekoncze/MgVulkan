package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportCallbackEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportCallbackEXT extends VulkanHandle {
    public VulkanDebugReportCallbackEXT(){
        super(new VkDebugReportCallbackEXT());
    }

    public VulkanDebugReportCallbackEXT(VkDebugReportCallbackEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportCallbackEXT getVk(){
        return (VkDebugReportCallbackEXT) super.getVk();
    }

    public VulkanDebugReportCallbackEXT(int value){
        super(new VkDebugReportCallbackEXT(value));
    }

    public static class Array extends VulkanDebugReportCallbackEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportCallbackEXT> {
        public Array(VkDebugReportCallbackEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugReportCallbackEXT.Array(count));
        }

        public Array(int count, VulkanDebugReportCallbackEXT o){
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

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugReportCallbackEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugReportCallbackEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugReportCallbackEXT.Pointer(value));
        }

        @Override
        public VkDebugReportCallbackEXT.Pointer getVk(){
            return (VkDebugReportCallbackEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugReportCallbackEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportCallbackEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugReportCallbackEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugReportCallbackEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugReportCallbackEXT.Pointer.Array getVk(){
                return (VkDebugReportCallbackEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugReportCallbackEXT.Pointer get(int i){
                return new VulkanDebugReportCallbackEXT.Pointer(getVk().get(i));
            }
        }
    }
}
