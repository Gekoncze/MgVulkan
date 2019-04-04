package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessageTypeFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessageTypeFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessageTypeFlagsEXT(){
        super(new VkDebugUtilsMessageTypeFlagsEXT());
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(VkDebugUtilsMessageTypeFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessageTypeFlagsEXT getVk(){
        return (VkDebugUtilsMessageTypeFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessageTypeFlagsEXT(int value){
        super(new VkDebugUtilsMessageTypeFlagsEXT(value));
    }

    public static class Array extends VulkanDebugUtilsMessageTypeFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageTypeFlagsEXT> {
        public Array(VkDebugUtilsMessageTypeFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessageTypeFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessageTypeFlagsEXT o){
            this(new VkDebugUtilsMessageTypeFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessageTypeFlagsEXT.Array getVk(){
            return (VkDebugUtilsMessageTypeFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessageTypeFlagsEXT get(int i){
            return new VulkanDebugUtilsMessageTypeFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessageTypeFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessageTypeFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessageTypeFlagsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessageTypeFlagsEXT.Pointer getVk(){
            return (VkDebugUtilsMessageTypeFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessageTypeFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessageTypeFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessageTypeFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessageTypeFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessageTypeFlagsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessageTypeFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessageTypeFlagsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessageTypeFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
