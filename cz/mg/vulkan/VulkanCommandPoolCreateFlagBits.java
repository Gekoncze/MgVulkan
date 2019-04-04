package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanCommandPoolCreateFlagBits extends VulkanFlagBits {
    public static final int TRANSIENT = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_TRANSIENT_BIT;
    public static final int RESET_COMMAND_BUFFER = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT;
    public static final int PROTECTED = VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_PROTECTED_BIT;

    public VulkanCommandPoolCreateFlagBits(){
        super(new VkCommandPoolCreateFlagBits());
    }

    public VulkanCommandPoolCreateFlagBits(VkCommandPoolCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateFlagBits getVk(){
        return (VkCommandPoolCreateFlagBits) super.getVk();
    }

    public VulkanCommandPoolCreateFlagBits(int value){
        super(new VkCommandPoolCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TRANSIENT) s += "TRANSIENT";
        if(getValue() == RESET_COMMAND_BUFFER) s += "RESET_COMMAND_BUFFER";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCommandPoolCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateFlagBits> {
        public Array(VkCommandPoolCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCommandPoolCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanCommandPoolCreateFlagBits o){
            this(new VkCommandPoolCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkCommandPoolCreateFlagBits.Array getVk(){
            return (VkCommandPoolCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCommandPoolCreateFlagBits get(int i){
            return new VulkanCommandPoolCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCommandPoolCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCommandPoolCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkCommandPoolCreateFlagBits.Pointer(value));
        }

        @Override
        public VkCommandPoolCreateFlagBits.Pointer getVk(){
            return (VkCommandPoolCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanCommandPoolCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCommandPoolCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkCommandPoolCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanCommandPoolCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCommandPoolCreateFlagBits.Pointer.Array getVk(){
                return (VkCommandPoolCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCommandPoolCreateFlagBits.Pointer get(int i){
                return new VulkanCommandPoolCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
