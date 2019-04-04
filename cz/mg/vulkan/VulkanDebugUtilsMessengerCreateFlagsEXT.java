package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessengerCreateFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessengerCreateFlagsEXT(){
        super(new VkDebugUtilsMessengerCreateFlagsEXT());
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(VkDebugUtilsMessengerCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCreateFlagsEXT getVk(){
        return (VkDebugUtilsMessengerCreateFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(int value){
        super(new VkDebugUtilsMessengerCreateFlagsEXT(value));
    }

    public static class Array extends VulkanDebugUtilsMessengerCreateFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCreateFlagsEXT> {
        public Array(VkDebugUtilsMessengerCreateFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessengerCreateFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessengerCreateFlagsEXT o){
            this(new VkDebugUtilsMessengerCreateFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerCreateFlagsEXT.Array getVk(){
            return (VkDebugUtilsMessengerCreateFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerCreateFlagsEXT get(int i){
            return new VulkanDebugUtilsMessengerCreateFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessengerCreateFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessengerCreateFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessengerCreateFlagsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessengerCreateFlagsEXT.Pointer getVk(){
            return (VkDebugUtilsMessengerCreateFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessengerCreateFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCreateFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessengerCreateFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessengerCreateFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessengerCreateFlagsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessengerCreateFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessengerCreateFlagsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessengerCreateFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
