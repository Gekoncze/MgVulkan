package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFlags.html">khronos documentation</a>
 **/
public class VulkanQueueFlags extends VulkanFlags {
    public VulkanQueueFlags(){
        super(new VkQueueFlags());
    }

    public VulkanQueueFlags(VkQueueFlags vk){
        super(vk);
    }

    @Override
    public VkQueueFlags getVk(){
        return (VkQueueFlags) super.getVk();
    }

    public VulkanQueueFlags(int value){
        super(new VkQueueFlags(value));
    }

    public static class Array extends VulkanQueueFlags implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFlags> {
        public Array(VkQueueFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueueFlags.Array(count));
        }

        public Array(int count, VulkanQueueFlags o){
            this(new VkQueueFlags.Array(count, o.getVk()));
        }

        @Override
        public VkQueueFlags.Array getVk(){
            return (VkQueueFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueueFlags get(int i){
            return new VulkanQueueFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueueFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueueFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueueFlags.Pointer(value));
        }

        @Override
        public VkQueueFlags.Pointer getVk(){
            return (VkQueueFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueueFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFlags.Pointer> {
            public Array(int count) {
                super(new VkQueueFlags.Pointer.Array(count));
            }

            public Array(VulkanQueueFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueueFlags.Pointer.Array getVk(){
                return (VkQueueFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueueFlags.Pointer get(int i){
                return new VulkanQueueFlags.Pointer(getVk().get(i));
            }
        }
    }
}
