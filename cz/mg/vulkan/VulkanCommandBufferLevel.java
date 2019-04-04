package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandBufferLevel.html">khronos documentation</a>
 **/
public class VulkanCommandBufferLevel extends VulkanEnum {
    public static final int PRIMARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY;
    public static final int SECONDARY = VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY;

    public VulkanCommandBufferLevel(){
        super(new VkCommandBufferLevel());
    }

    public VulkanCommandBufferLevel(VkCommandBufferLevel vk){
        super(vk);
    }

    @Override
    public VkCommandBufferLevel getVk(){
        return (VkCommandBufferLevel) super.getVk();
    }

    public VulkanCommandBufferLevel(int value){
        super(new VkCommandBufferLevel(value));
    }

    @Override
    public String toString() {
        if(getValue() == PRIMARY) return "PRIMARY";
        if(getValue() == SECONDARY) return "SECONDARY";
        return "UNKNOWN";
    }

    public static class Array extends VulkanCommandBufferLevel implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferLevel> {
        public Array(VkCommandBufferLevel.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandBufferLevel.Array(count));
        }

        public Array(int count, VulkanCommandBufferLevel o){
            this(new VkCommandBufferLevel.Array(count, o.getVk()));
        }

        @Override
        public VkCommandBufferLevel.Array getVk(){
            return (VkCommandBufferLevel.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandBufferLevel get(int i){
            return new VulkanCommandBufferLevel(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandBufferLevel.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandBufferLevel.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandBufferLevel.Pointer(value));
        }

        @Override
        public VkCommandBufferLevel.Pointer getVk(){
            return (VkCommandBufferLevel.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandBufferLevel.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandBufferLevel.Pointer> {
            public Array(int count) {
                super(new VkCommandBufferLevel.Pointer.Array(count));
            }

            public Array(VulkanCommandBufferLevel[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandBufferLevel.Pointer.Array getVk(){
                return (VkCommandBufferLevel.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandBufferLevel.Pointer get(int i){
                return new VulkanCommandBufferLevel.Pointer(getVk().get(i));
            }
        }
    }
}
