package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportFlagBitsEXT extends VulkanFlagBits {
    public static final int DEBUG_REPORT_INFORMATION_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT;
    public static final int DEBUG_REPORT_WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT;
    public static final int DEBUG_REPORT_PERFORMANCE_WARNING_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT;
    public static final int DEBUG_REPORT_ERROR_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT;
    public static final int DEBUG_REPORT_DEBUG_EXT = VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT;

    public VulkanDebugReportFlagBitsEXT(){
        super(new VkDebugReportFlagBitsEXT());
    }

    public VulkanDebugReportFlagBitsEXT(VkDebugReportFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportFlagBitsEXT getVk(){
        return (VkDebugReportFlagBitsEXT) super.getVk();
    }

    public VulkanDebugReportFlagBitsEXT(int value){
        super(new VkDebugReportFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEBUG_REPORT_INFORMATION_EXT) s += "DEBUG_REPORT_INFORMATION_EXT";
        if(getValue() == DEBUG_REPORT_WARNING_EXT) s += "DEBUG_REPORT_WARNING_EXT";
        if(getValue() == DEBUG_REPORT_PERFORMANCE_WARNING_EXT) s += "DEBUG_REPORT_PERFORMANCE_WARNING_EXT";
        if(getValue() == DEBUG_REPORT_ERROR_EXT) s += "DEBUG_REPORT_ERROR_EXT";
        if(getValue() == DEBUG_REPORT_DEBUG_EXT) s += "DEBUG_REPORT_DEBUG_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDebugReportFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportFlagBitsEXT> {
        public Array(VkDebugReportFlagBitsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugReportFlagBitsEXT.Array(count));
        }

        public Array(int count, VulkanDebugReportFlagBitsEXT o){
            this(new VkDebugReportFlagBitsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugReportFlagBitsEXT.Array getVk(){
            return (VkDebugReportFlagBitsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugReportFlagBitsEXT get(int i){
            return new VulkanDebugReportFlagBitsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugReportFlagBitsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugReportFlagBitsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugReportFlagBitsEXT.Pointer(value));
        }

        @Override
        public VkDebugReportFlagBitsEXT.Pointer getVk(){
            return (VkDebugReportFlagBitsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugReportFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportFlagBitsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugReportFlagBitsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugReportFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugReportFlagBitsEXT.Pointer.Array getVk(){
                return (VkDebugReportFlagBitsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugReportFlagBitsEXT.Pointer get(int i){
                return new VulkanDebugReportFlagBitsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
