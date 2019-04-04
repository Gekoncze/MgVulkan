package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorBindingFlagBitsEXT.html">khronos documentation</a>
 **/
public class VulkanDescriptorBindingFlagBitsEXT extends VulkanFlagBits {
    public static final int DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT;
    public static final int DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT = VkDescriptorBindingFlagBitsEXT.VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT;

    public VulkanDescriptorBindingFlagBitsEXT(){
        super(new VkDescriptorBindingFlagBitsEXT());
    }

    public VulkanDescriptorBindingFlagBitsEXT(VkDescriptorBindingFlagBitsEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorBindingFlagBitsEXT getVk(){
        return (VkDescriptorBindingFlagBitsEXT) super.getVk();
    }

    public VulkanDescriptorBindingFlagBitsEXT(int value){
        super(new VkDescriptorBindingFlagBitsEXT(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT) s += "DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_EXT";
        if(getValue() == DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT) s += "DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_EXT";
        if(getValue() == DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT) s += "DESCRIPTOR_BINDING_PARTIALLY_BOUND_EXT";
        if(getValue() == DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT) s += "DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_EXT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDescriptorBindingFlagBitsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBindingFlagBitsEXT> {
        public Array(VkDescriptorBindingFlagBitsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorBindingFlagBitsEXT.Array(count));
        }

        public Array(int count, VulkanDescriptorBindingFlagBitsEXT o){
            this(new VkDescriptorBindingFlagBitsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorBindingFlagBitsEXT.Array getVk(){
            return (VkDescriptorBindingFlagBitsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorBindingFlagBitsEXT get(int i){
            return new VulkanDescriptorBindingFlagBitsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorBindingFlagBitsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorBindingFlagBitsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorBindingFlagBitsEXT.Pointer(value));
        }

        @Override
        public VkDescriptorBindingFlagBitsEXT.Pointer getVk(){
            return (VkDescriptorBindingFlagBitsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorBindingFlagBitsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBindingFlagBitsEXT.Pointer> {
            public Array(int count) {
                super(new VkDescriptorBindingFlagBitsEXT.Pointer.Array(count));
            }

            public Array(VulkanDescriptorBindingFlagBitsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorBindingFlagBitsEXT.Pointer.Array getVk(){
                return (VkDescriptorBindingFlagBitsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorBindingFlagBitsEXT.Pointer get(int i){
                return new VulkanDescriptorBindingFlagBitsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
