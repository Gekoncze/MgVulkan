package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayoutCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayoutCreateFlagBits extends VulkanFlagBits {
    public static final int PUSH_DESCRIPTOR_KHR = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR;
    public static final int UPDATE_AFTER_BIND_POOL_EXT = VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT;

    public VulkanDescriptorSetLayoutCreateFlagBits(){
        super(new VkDescriptorSetLayoutCreateFlagBits());
    }

    public VulkanDescriptorSetLayoutCreateFlagBits(VkDescriptorSetLayoutCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutCreateFlagBits getVk(){
        return (VkDescriptorSetLayoutCreateFlagBits) super.getVk();
    }

    public VulkanDescriptorSetLayoutCreateFlagBits(int value){
        super(new VkDescriptorSetLayoutCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PUSH_DESCRIPTOR_KHR) s += "PUSH_DESCRIPTOR_KHR";
        if(getValue() == UPDATE_AFTER_BIND_POOL_EXT) s += "UPDATE_AFTER_BIND_POOL_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDescriptorSetLayoutCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateFlagBits> {
        public Array(VkDescriptorSetLayoutCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutCreateFlagBits o){
            this(new VkDescriptorSetLayoutCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutCreateFlagBits.Array getVk(){
            return (VkDescriptorSetLayoutCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutCreateFlagBits get(int i){
            return new VulkanDescriptorSetLayoutCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutCreateFlagBits.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutCreateFlagBits.Pointer getVk(){
            return (VkDescriptorSetLayoutCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutCreateFlagBits.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutCreateFlagBits.Pointer get(int i){
                return new VulkanDescriptorSetLayoutCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
