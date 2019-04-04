package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolResetFlagBits.html">khronos documentation</a>
 **/
public class VulkanCommandPoolResetFlagBits extends VulkanFlagBits {
    public static final int RELEASE_RESOURCES = VkCommandPoolResetFlagBits.VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT;

    public VulkanCommandPoolResetFlagBits(){
        super(new VkCommandPoolResetFlagBits());
    }

    public VulkanCommandPoolResetFlagBits(VkCommandPoolResetFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandPoolResetFlagBits getVk(){
        return (VkCommandPoolResetFlagBits) super.getVk();
    }

    public VulkanCommandPoolResetFlagBits(int value){
        super(new VkCommandPoolResetFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == RELEASE_RESOURCES) s += "RELEASE_RESOURCES";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCommandPoolResetFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolResetFlagBits> {
        public Array(VkCommandPoolResetFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolResetFlagBits.Array(count));
        }

        public Array(int count, VulkanCommandPoolResetFlagBits o){
            this(new VkCommandPoolResetFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolResetFlagBits.Array getVk(){
            return (VkCommandPoolResetFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolResetFlagBits get(int i){
            return new VulkanCommandPoolResetFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolResetFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolResetFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolResetFlagBits.Pointer(value));
        }

        @Override
        public VkCommandPoolResetFlagBits.Pointer getVk(){
            return (VkCommandPoolResetFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolResetFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolResetFlagBits.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolResetFlagBits.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolResetFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolResetFlagBits.Pointer.Array getVk(){
                return (VkCommandPoolResetFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolResetFlagBits.Pointer get(int i){
                return new VulkanCommandPoolResetFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
