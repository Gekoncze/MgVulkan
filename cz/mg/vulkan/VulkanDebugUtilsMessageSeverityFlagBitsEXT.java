package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageSeverityFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageSeverityFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT = VkDebugUtilsMessageSeverityFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT;

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(){
        super(new VkDebugUtilsMessageSeverityFlagBitsEXT());
    }

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(VkDebugUtilsMessageSeverityFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageSeverityFlagBitsEXT getVk(){
        return (VkDebugUtilsMessageSeverityFlagBitsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageSeverityFlagBitsEXT(int value){
        super(new VkDebugUtilsMessageSeverityFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_INFO_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT) s += "DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDebugUtilsMessageSeverityFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageSeverityFlagBitsEXT> {
        public Array(VkDebugUtilsMessageSeverityFlagBitsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessageSeverityFlagBitsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessageSeverityFlagBitsEXT o){
            this(new VkDebugUtilsMessageSeverityFlagBitsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessageSeverityFlagBitsEXT.Array getVk(){
            return (VkDebugUtilsMessageSeverityFlagBitsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessageSeverityFlagBitsEXT get(int i){
            return new VulkanDebugUtilsMessageSeverityFlagBitsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer getVk(){
            return (VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessageSeverityFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageSeverityFlagBitsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessageSeverityFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessageSeverityFlagBitsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessageSeverityFlagBitsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessageSeverityFlagBitsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
