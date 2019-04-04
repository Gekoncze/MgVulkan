package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerCallbackDataFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessengerCallbackDataFlagsEXT extends VulkanFlags {
    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(){
        super(new VkDebugUtilsMessengerCallbackDataFlagsEXT());
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(VkDebugUtilsMessengerCallbackDataFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerCallbackDataFlagsEXT getVk(){
        return (VkDebugUtilsMessengerCallbackDataFlagsEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(int value){
        super(new VkDebugUtilsMessengerCallbackDataFlagsEXT(value));
    }

    public static class Array extends VulkanDebugUtilsMessengerCallbackDataFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCallbackDataFlagsEXT> {
        public Array(VkDebugUtilsMessengerCallbackDataFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessengerCallbackDataFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessengerCallbackDataFlagsEXT o){
            this(new VkDebugUtilsMessengerCallbackDataFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataFlagsEXT.Array getVk(){
            return (VkDebugUtilsMessengerCallbackDataFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerCallbackDataFlagsEXT get(int i){
            return new VulkanDebugUtilsMessengerCallbackDataFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer getVk(){
            return (VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessengerCallbackDataFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerCallbackDataFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessengerCallbackDataFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessengerCallbackDataFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessengerCallbackDataFlagsEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessengerCallbackDataFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
