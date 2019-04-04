package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugReportFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugReportFlagsEXT extends VulkanFlags {
    public VulkanDebugReportFlagsEXT(){
        super(new VkDebugReportFlagsEXT());
    }

    public VulkanDebugReportFlagsEXT(VkDebugReportFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugReportFlagsEXT getVk(){
        return (VkDebugReportFlagsEXT) super.getVk();
    }

    public VulkanDebugReportFlagsEXT(int value){
        super(new VkDebugReportFlagsEXT(value));
    }

    public static class Array extends VulkanDebugReportFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportFlagsEXT> {
        public Array(VkDebugReportFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugReportFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDebugReportFlagsEXT o){
            this(new VkDebugReportFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugReportFlagsEXT.Array getVk(){
            return (VkDebugReportFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugReportFlagsEXT get(int i){
            return new VulkanDebugReportFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugReportFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugReportFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugReportFlagsEXT.Pointer(value));
        }

        @Override
        public VkDebugReportFlagsEXT.Pointer getVk(){
            return (VkDebugReportFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugReportFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugReportFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugReportFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugReportFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugReportFlagsEXT.Pointer.Array getVk(){
                return (VkDebugReportFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugReportFlagsEXT.Pointer get(int i){
                return new VulkanDebugReportFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
