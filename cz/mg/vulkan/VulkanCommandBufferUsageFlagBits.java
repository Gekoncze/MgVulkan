package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferUsageFlagBits.html">khronos documentation</a>
 **/
public class VulkanCommandBufferUsageFlagBits extends VulkanFlagBits {
    public static final int ONE_TIME_SUBMIT = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT;
    public static final int RENDER_PASS_CONTINUE = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT;
    public static final int SIMULTANEOUS_USE = VkCommandBufferUsageFlagBits.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT;

    public VulkanCommandBufferUsageFlagBits(){
        super(new VkCommandBufferUsageFlagBits());
    }

    public VulkanCommandBufferUsageFlagBits(VkCommandBufferUsageFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandBufferUsageFlagBits getVk(){
        return (VkCommandBufferUsageFlagBits) super.getVk();
    }

    public VulkanCommandBufferUsageFlagBits(int value){
        super(new VkCommandBufferUsageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == ONE_TIME_SUBMIT) s += "ONE_TIME_SUBMIT";
        if(getValue() == RENDER_PASS_CONTINUE) s += "RENDER_PASS_CONTINUE";
        if(getValue() == SIMULTANEOUS_USE) s += "SIMULTANEOUS_USE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCommandBufferUsageFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferUsageFlagBits> {
        public Array(VkCommandBufferUsageFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferUsageFlagBits.Array(count));
        }

        public Array(int count, VulkanCommandBufferUsageFlagBits o){
            this(new VkCommandBufferUsageFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferUsageFlagBits.Array getVk(){
            return (VkCommandBufferUsageFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferUsageFlagBits get(int i){
            return new VulkanCommandBufferUsageFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferUsageFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferUsageFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferUsageFlagBits.Pointer(value));
        }

        @Override
        public VkCommandBufferUsageFlagBits.Pointer getVk(){
            return (VkCommandBufferUsageFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferUsageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferUsageFlagBits.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferUsageFlagBits.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferUsageFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferUsageFlagBits.Pointer.Array getVk(){
                return (VkCommandBufferUsageFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferUsageFlagBits.Pointer get(int i){
                return new VulkanCommandBufferUsageFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
