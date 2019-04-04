package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueCreateFlags extends VulkanFlags {
    public VulkanDeviceQueueCreateFlags(){
        super(new VkDeviceQueueCreateFlags());
    }

    public VulkanDeviceQueueCreateFlags(VkDeviceQueueCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueCreateFlags getVk(){
        return (VkDeviceQueueCreateFlags) super.getVk();
    }

    public VulkanDeviceQueueCreateFlags(int value){
        super(new VkDeviceQueueCreateFlags(value));
    }

    public static class Array extends VulkanDeviceQueueCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateFlags> {
        public Array(VkDeviceQueueCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceQueueCreateFlags.Array(count));
        }

        public Array(int count, VulkanDeviceQueueCreateFlags o){
            this(new VkDeviceQueueCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceQueueCreateFlags.Array getVk(){
            return (VkDeviceQueueCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceQueueCreateFlags get(int i){
            return new VulkanDeviceQueueCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceQueueCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceQueueCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceQueueCreateFlags.Pointer(value));
        }

        @Override
        public VkDeviceQueueCreateFlags.Pointer getVk(){
            return (VkDeviceQueueCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceQueueCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkDeviceQueueCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanDeviceQueueCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceQueueCreateFlags.Pointer.Array getVk(){
                return (VkDeviceQueueCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceQueueCreateFlags.Pointer get(int i){
                return new VulkanDeviceQueueCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
