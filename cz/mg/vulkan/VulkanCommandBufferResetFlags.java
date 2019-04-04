package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferResetFlags.html">khronos documentation</a>
 **/
public class VulkanCommandBufferResetFlags extends VulkanFlags {
    public VulkanCommandBufferResetFlags(){
        super(new VkCommandBufferResetFlags());
    }

    public VulkanCommandBufferResetFlags(VkCommandBufferResetFlags vk){
        super(vk);
    }

    @Override
    public VkCommandBufferResetFlags getVk(){
        return (VkCommandBufferResetFlags) super.getVk();
    }

    public VulkanCommandBufferResetFlags(int value){
        super(new VkCommandBufferResetFlags(value));
    }

    public static class Array extends VulkanCommandBufferResetFlags implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferResetFlags> {
        public Array(VkCommandBufferResetFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferResetFlags.Array(count));
        }

        public Array(int count, VulkanCommandBufferResetFlags o){
            this(new VkCommandBufferResetFlags.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferResetFlags.Array getVk(){
            return (VkCommandBufferResetFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferResetFlags get(int i){
            return new VulkanCommandBufferResetFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferResetFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferResetFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferResetFlags.Pointer(value));
        }

        @Override
        public VkCommandBufferResetFlags.Pointer getVk(){
            return (VkCommandBufferResetFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferResetFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferResetFlags.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferResetFlags.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferResetFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferResetFlags.Pointer.Array getVk(){
                return (VkCommandBufferResetFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferResetFlags.Pointer get(int i){
                return new VulkanCommandBufferResetFlags.Pointer(getVk().get(i));
            }
        }
    }
}
