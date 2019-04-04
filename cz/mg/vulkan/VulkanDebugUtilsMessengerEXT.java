package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsMessengerEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsMessengerEXT extends VulkanHandle {
    public VulkanDebugUtilsMessengerEXT(){
        super(new VkDebugUtilsMessengerEXT());
    }

    public VulkanDebugUtilsMessengerEXT(VkDebugUtilsMessengerEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsMessengerEXT getVk(){
        return (VkDebugUtilsMessengerEXT) super.getVk();
    }

    public VulkanDebugUtilsMessengerEXT(int value){
        super(new VkDebugUtilsMessengerEXT(value));
    }

    public static class Array extends VulkanDebugUtilsMessengerEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerEXT> {
        public Array(VkDebugUtilsMessengerEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsMessengerEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsMessengerEXT o){
            this(new VkDebugUtilsMessengerEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsMessengerEXT.Array getVk(){
            return (VkDebugUtilsMessengerEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsMessengerEXT get(int i){
            return new VulkanDebugUtilsMessengerEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsMessengerEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsMessengerEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsMessengerEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsMessengerEXT.Pointer getVk(){
            return (VkDebugUtilsMessengerEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsMessengerEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsMessengerEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsMessengerEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsMessengerEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsMessengerEXT.Pointer.Array getVk(){
                return (VkDebugUtilsMessengerEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsMessengerEXT.Pointer get(int i){
                return new VulkanDebugUtilsMessengerEXT.Pointer(getVk().get(i));
            }
        }
    }
}
