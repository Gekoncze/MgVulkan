package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageTypeFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT;
    public static final int DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT = VkDebugUtilsMessageTypeFlagBitsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT;

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(){
        super(new VkDebugUtilsMessageTypeFlagBitsEXT());
    }

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(VkDebugUtilsMessageTypeFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageTypeFlagBitsEXT getVk(){
        return (VkDebugUtilsMessageTypeFlagBitsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageTypeFlagBitsEXT(int value){
        super(new VkDebugUtilsMessageTypeFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_GENERAL_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_EXT";
        if(getValue() == DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT) s += "DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDebugUtilsMessageTypeFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageTypeFlagBitsEXT> {
        public Array(VkDebugUtilsMessageTypeFlagBitsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessageTypeFlagBitsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessageTypeFlagBitsEXT o){
            this(new VkDebugUtilsMessageTypeFlagBitsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessageTypeFlagBitsEXT.Array getVk(){
            return (VkDebugUtilsMessageTypeFlagBitsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessageTypeFlagBitsEXT get(int i){
            return new VulkanDebugUtilsMessageTypeFlagBitsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessageTypeFlagBitsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessageTypeFlagBitsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessageTypeFlagBitsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessageTypeFlagBitsEXT.Pointer getVk(){
            return (VkDebugUtilsMessageTypeFlagBitsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessageTypeFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageTypeFlagBitsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessageTypeFlagBitsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessageTypeFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessageTypeFlagBitsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessageTypeFlagBitsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessageTypeFlagBitsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessageTypeFlagBitsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
