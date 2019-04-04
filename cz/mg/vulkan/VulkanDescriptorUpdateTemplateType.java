package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateType.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateType extends VulkanEnum {
    public static final int DESCRIPTOR_SET = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET;
    public static final int PUSH_DESCRIPTORS_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR;
    public static final int DESCRIPTOR_SET_KHR = VkDescriptorUpdateTemplateType.VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR;

    public VulkanDescriptorUpdateTemplateType(){
        super(new VkDescriptorUpdateTemplateType());
    }

    public VulkanDescriptorUpdateTemplateType(VkDescriptorUpdateTemplateType vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateType getVk(){
        return (VkDescriptorUpdateTemplateType) super.getVk();
    }

    public VulkanDescriptorUpdateTemplateType(int value){
        super(new VkDescriptorUpdateTemplateType(value));
    }

    @Override
    public String toString() {
        if(getValue() == DESCRIPTOR_SET) return "DESCRIPTOR_SET";
        if(getValue() == PUSH_DESCRIPTORS_KHR) return "PUSH_DESCRIPTORS_KHR";
        if(getValue() == DESCRIPTOR_SET_KHR) return "DESCRIPTOR_SET_KHR";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDescriptorUpdateTemplateType implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateType> {
        public Array(VkDescriptorUpdateTemplateType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorUpdateTemplateType.Array(count));
        }

        public Array(int count, VulkanDescriptorUpdateTemplateType o){
            this(new VkDescriptorUpdateTemplateType.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplateType.Array getVk(){
            return (VkDescriptorUpdateTemplateType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplateType get(int i){
            return new VulkanDescriptorUpdateTemplateType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorUpdateTemplateType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorUpdateTemplateType.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorUpdateTemplateType.Pointer(value));
        }

        @Override
        public VkDescriptorUpdateTemplateType.Pointer getVk(){
            return (VkDescriptorUpdateTemplateType.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorUpdateTemplateType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateType.Pointer> {
            public Array(int count) {
                super(new VkDescriptorUpdateTemplateType.Pointer.Array(count));
            }

            public Array(VulkanDescriptorUpdateTemplateType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorUpdateTemplateType.Pointer.Array getVk(){
                return (VkDescriptorUpdateTemplateType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorUpdateTemplateType.Pointer get(int i){
                return new VulkanDescriptorUpdateTemplateType.Pointer(getVk().get(i));
            }
        }
    }
}
