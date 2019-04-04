package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferUsageFlags.html">khronos documentation</a>
 **/
public class VulkanCommandBufferUsageFlags extends VulkanFlags {
    public VulkanCommandBufferUsageFlags(){
        super(new VkCommandBufferUsageFlags());
    }

    public VulkanCommandBufferUsageFlags(VkCommandBufferUsageFlags vk){
        super(vk);
    }

    @Override
    public VkCommandBufferUsageFlags getVk(){
        return (VkCommandBufferUsageFlags) super.getVk();
    }

    public VulkanCommandBufferUsageFlags(int value){
        super(new VkCommandBufferUsageFlags(value));
    }

    public static class Array extends VulkanCommandBufferUsageFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferUsageFlags> {
        public Array(VkCommandBufferUsageFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferUsageFlags.Array(count));
        }

        public Array(int count, VulkanCommandBufferUsageFlags o){
            this(new VkCommandBufferUsageFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferUsageFlags.Array getVk(){
            return (VkCommandBufferUsageFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferUsageFlags get(int i){
            return new VulkanCommandBufferUsageFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferUsageFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferUsageFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferUsageFlags.Pointer(value));
        }

        @Override
        public VkCommandBufferUsageFlags.Pointer getVk(){
            return (VkCommandBufferUsageFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferUsageFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferUsageFlags.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferUsageFlags.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferUsageFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferUsageFlags.Pointer.Array getVk(){
                return (VkCommandBufferUsageFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferUsageFlags.Pointer get(int i){
                return new VulkanCommandBufferUsageFlags.Pointer(getVk().get(i));
            }
        }
    }
}
