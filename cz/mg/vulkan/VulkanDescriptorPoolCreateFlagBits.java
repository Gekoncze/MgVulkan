package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolCreateFlagBits extends VulkanFlagBits {
    public static final int FREE_DESCRIPTOR_SET = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT;
    public static final int UPDATE_AFTER_BIND_EXT = VkDescriptorPoolCreateFlagBits.VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT;

    public VulkanDescriptorPoolCreateFlagBits(){
        super(new VkDescriptorPoolCreateFlagBits());
    }

    public VulkanDescriptorPoolCreateFlagBits(VkDescriptorPoolCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolCreateFlagBits getVk(){
        return (VkDescriptorPoolCreateFlagBits) super.getVk();
    }

    public VulkanDescriptorPoolCreateFlagBits(int value){
        super(new VkDescriptorPoolCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == FREE_DESCRIPTOR_SET) s += "FREE_DESCRIPTOR_SET";
        if(getValue() == UPDATE_AFTER_BIND_EXT) s += "UPDATE_AFTER_BIND_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDescriptorPoolCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateFlagBits> {
        public Array(VkDescriptorPoolCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPoolCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanDescriptorPoolCreateFlagBits o){
            this(new VkDescriptorPoolCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPoolCreateFlagBits.Array getVk(){
            return (VkDescriptorPoolCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPoolCreateFlagBits get(int i){
            return new VulkanDescriptorPoolCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPoolCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPoolCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPoolCreateFlagBits.Pointer(value));
        }

        @Override
        public VkDescriptorPoolCreateFlagBits.Pointer getVk(){
            return (VkDescriptorPoolCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPoolCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPoolCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPoolCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPoolCreateFlagBits.Pointer.Array getVk(){
                return (VkDescriptorPoolCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPoolCreateFlagBits.Pointer get(int i){
                return new VulkanDescriptorPoolCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
