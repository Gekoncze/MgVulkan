package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageSeverityFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessageSeverityFlagsEXT(){
        super(new VkDebugUtilsMessageSeverityFlagsEXT());
    }

    public VulkanDebugUtilsMessageSeverityFlagsEXT(VkDebugUtilsMessageSeverityFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageSeverityFlagsEXT getVk(){
        return (VkDebugUtilsMessageSeverityFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageSeverityFlagsEXT(int value){
        super(new VkDebugUtilsMessageSeverityFlagsEXT(value));
    }

    public static class Array extends VulkanDebugUtilsMessageSeverityFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageSeverityFlagsEXT> {
        public Array(VkDebugUtilsMessageSeverityFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessageSeverityFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessageSeverityFlagsEXT o){
            this(new VkDebugUtilsMessageSeverityFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessageSeverityFlagsEXT.Array getVk(){
            return (VkDebugUtilsMessageSeverityFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessageSeverityFlagsEXT get(int i){
            return new VulkanDebugUtilsMessageSeverityFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessageSeverityFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessageSeverityFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessageSeverityFlagsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessageSeverityFlagsEXT.Pointer getVk(){
            return (VkDebugUtilsMessageSeverityFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessageSeverityFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageSeverityFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessageSeverityFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessageSeverityFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessageSeverityFlagsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessageSeverityFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessageSeverityFlagsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessageSeverityFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
