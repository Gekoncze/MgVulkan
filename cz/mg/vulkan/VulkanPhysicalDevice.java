package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDevice.html">khronos documentation</a>
 **/
public class VulkanPhysicalDevice extends VulkanHandle {
    public VulkanPhysicalDevice(){
        super(new VkPhysicalDevice());
    }

    public VulkanPhysicalDevice(VkPhysicalDevice vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevice getVk(){
        return (VkPhysicalDevice) super.getVk();
    }

    public VulkanPhysicalDevice(int value){
        super(new VkPhysicalDevice(value));
    }

    public static class Array extends VulkanPhysicalDevice implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevice> {
        public Array(VkPhysicalDevice.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDevice.Array(count));
        }

        public Array(int count, VulkanPhysicalDevice o){
            this(new VkPhysicalDevice.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDevice.Array getVk(){
            return (VkPhysicalDevice.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDevice get(int i){
            return new VulkanPhysicalDevice(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDevice.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDevice.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDevice.Pointer(value));
        }

        @Override
        public VkPhysicalDevice.Pointer getVk(){
            return (VkPhysicalDevice.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDevice.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevice.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDevice.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDevice[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDevice.Pointer.Array getVk(){
                return (VkPhysicalDevice.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDevice.Pointer get(int i){
                return new VulkanPhysicalDevice.Pointer(getVk().get(i));
            }
        }
    }
}
