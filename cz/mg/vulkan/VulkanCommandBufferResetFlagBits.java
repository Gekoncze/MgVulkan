package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferResetFlagBits.html">khronos documentation</a>
 **/
public class VulkanCommandBufferResetFlagBits extends VulkanFlagBits {
    public static final int RELEASE_RESOURCES = VkCommandBufferResetFlagBits.VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT;

    public VulkanCommandBufferResetFlagBits(){
        super(new VkCommandBufferResetFlagBits());
    }

    public VulkanCommandBufferResetFlagBits(VkCommandBufferResetFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandBufferResetFlagBits getVk(){
        return (VkCommandBufferResetFlagBits) super.getVk();
    }

    public VulkanCommandBufferResetFlagBits(int value){
        super(new VkCommandBufferResetFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == RELEASE_RESOURCES) s += "RELEASE_RESOURCES";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCommandBufferResetFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferResetFlagBits> {
        public Array(VkCommandBufferResetFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferResetFlagBits.Array(count));
        }

        public Array(int count, VulkanCommandBufferResetFlagBits o){
            this(new VkCommandBufferResetFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferResetFlagBits.Array getVk(){
            return (VkCommandBufferResetFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferResetFlagBits get(int i){
            return new VulkanCommandBufferResetFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferResetFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferResetFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferResetFlagBits.Pointer(value));
        }

        @Override
        public VkCommandBufferResetFlagBits.Pointer getVk(){
            return (VkCommandBufferResetFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferResetFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferResetFlagBits.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferResetFlagBits.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferResetFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferResetFlagBits.Pointer.Array getVk(){
                return (VkCommandBufferResetFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferResetFlagBits.Pointer get(int i){
                return new VulkanCommandBufferResetFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
