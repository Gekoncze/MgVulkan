package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceMemory.html">khronos documentation</a>
 **/
public class VulkanDeviceMemory extends VulkanHandle {
    public VulkanDeviceMemory(){
        super(new VkDeviceMemory());
    }

    public VulkanDeviceMemory(VkDeviceMemory vk){
        super(vk);
    }

    @Override
    public VkDeviceMemory getVk(){
        return (VkDeviceMemory) super.getVk();
    }

    public VulkanDeviceMemory(int value){
        super(new VkDeviceMemory(value));
    }

    public static class Array extends VulkanDeviceMemory implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceMemory> {
        public Array(VkDeviceMemory.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceMemory.Array(count));
        }

        public Array(int count, VulkanDeviceMemory o){
            this(new VkDeviceMemory.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceMemory.Array getVk(){
            return (VkDeviceMemory.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceMemory get(int i){
            return new VulkanDeviceMemory(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceMemory.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceMemory.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceMemory.Pointer(value));
        }

        @Override
        public VkDeviceMemory.Pointer getVk(){
            return (VkDeviceMemory.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceMemory.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceMemory.Pointer> {
            public Array(int count) {
                super(new VkDeviceMemory.Pointer.Array(count));
            }

            public Array(VulkanDeviceMemory[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceMemory.Pointer.Array getVk(){
                return (VkDeviceMemory.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceMemory.Pointer get(int i){
                return new VulkanDeviceMemory.Pointer(getVk().get(i));
            }
        }
    }
}
